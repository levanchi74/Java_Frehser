myApp.factory("GreetingFactory", function () {
    return new function() {
        this.name = "My Name";
        this.greetingMessage = "Hello";
    };
});
// Factory la phan rut gon cua Provider