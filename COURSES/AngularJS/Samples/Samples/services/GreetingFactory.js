myApp.factory("GreetingFactory", function () {
    return new function() {
        this.name = "My Name";
        this.greetingMessage = "Hello";
    };
});
