myApp.provider("GreetingProvider", function () {
    var nameInProvider = "";
    var greetingMessageInProvider = "";
    this.setupGreetingProvider = function (nameString, greetingMessageString) {
        nameInProvider = nameString;
        greetingMessageInProvider = greetingMessageString;
    };
    
    this.$get = function() {
        return new function() {
            this.name = nameInProvider;
            this.greetingMessage = greetingMessageInProvider;
        };
    };
});
