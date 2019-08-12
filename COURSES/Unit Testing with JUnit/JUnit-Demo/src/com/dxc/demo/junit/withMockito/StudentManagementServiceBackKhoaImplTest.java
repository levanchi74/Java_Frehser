package com.dxc.demo.junit.withMockito;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class StudentManagementServiceBackKhoaImplTest {
	
	StudentManagementServiceBackKhoaImpl sut;
	IStudentRepositoryService repoService;
	INotificationService notiService;
	IStudentCachingService cachingService;
	
	@Before
	public void init() {
		repoService = mock(IStudentRepositoryService.class);
		notiService = mock(INotificationService.class);
		cachingService = mock(IStudentCachingService.class);
		sut = new StudentManagementServiceBackKhoaImpl(repoService, notiService, cachingService);
	}
	
	
	@Test
	public void testFindStudentByStudentID_NullStudentID_returnFoundStudent() {
		// Given / Setup
		String studentID = "50303416";
		List<Student> resultList = new ArrayList<>();
		Student dummy = new Student();
		dummy.setFirstName("Nguyen");
		dummy.setLastName("Van");
		dummy.setStudentID(studentID);
		resultList.add(dummy);
		
		when(repoService.searchStudent(any(Student.class))).thenReturn(resultList);
				
		// When / Execute
		Student foundStudent = sut.findStudentByStudentID(studentID);
		
		// Then / Verify
		assertEquals("Nguyen", foundStudent.getFirstName());
		assertEquals("Van", foundStudent.getLastName());
		
		verify(cachingService).putToCache(studentID, foundStudent);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFindStudentByStudentID_Null() {
		// Given / Setup
		String studentID = null;
		
		// When / Execute
		Student foundStudent = sut.findStudentByStudentID(studentID);
		
		// // Then / Verify
		fail();
	}
	
	@Ignore
	@Test(expected = IllegalArgumentException.class)
	public void testFindStudentByStudentID_IsEmpty() {
		// Given / Setup
		String studentID = "";
		
		// When / Execute
		Student foundStudent = sut.findStudentByStudentID(studentID);
		
		// // Then / Verify
		fail();
	}

	@Test
	public void testFindStudentByStudentID_returnListStudentsNull() {
		// Given / Setup
		String studentID = "50303416";
				
		// When / Execute
		Student foundStudent = sut.findStudentByStudentID(studentID);
		
		// Then / Verify
		assertEquals(null, foundStudent);
	
	}
	
	
	@Test(expected = RuntimeException.class)
	public void testFindStudentByStudentID_ReturnDoubleStudentInList() {
		// Given / Setup
		String studentID = "50303416";
		List<Student> resultList = new ArrayList<>();
		Student dummy = new Student();
		dummy.setFirstName("Nguyen");
		dummy.setLastName("Van");
		dummy.setStudentID(studentID);
		resultList.add(dummy);
		
		String studentID1 = "50303416";
		Student dummy1 = new Student();
		dummy1.setFirstName("Le");
		dummy1.setLastName("Chi");
		dummy1.setStudentID(studentID1);
		resultList.add(dummy1);
		
		when(repoService.searchStudent(any(Student.class))).thenReturn(resultList);
				
		// When / Execute
		Student foundStudent = sut.findStudentByStudentID(studentID);
		
		// Then / Verify
		assertEquals(1, resultList.size());
	}
	
}
