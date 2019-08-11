app
    .constant("categoryActiveClass","btn-primary")
    .controller('bookCtrl', function($scope, $filter, categoryActiveClass, cart){
        cateSelected = null;
        $scope.selectCategory = function(category){
            cateSelected = category;
        }
        $scope.filterByCategory = function(book) {
            return cateSelected == null || book.category == cateSelected;
        }
        $scope.getCategoryClass = function(category){
            return cateSelected == category ? categoryActiveClass : "";
        }

        $scope.addBookToCart = function(book){
            cart.addBook(book.id,book.name,book.price);
        }
    });