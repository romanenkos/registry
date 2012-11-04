modules = {
    application {
        resource url: 'js/application.js'
    }

    angularTestCoffee {
        resource url: 'cs/angularTestController.coffee'
        dependsOn 'angular'
    }
}