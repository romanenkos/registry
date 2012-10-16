package registry

import grails.converters.JSON
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_ADMIN'])
class RestoreController {
    static allowedMethods = [restore: "POST"]
    def index() {
    }

    def restore(){
        def f = request.getFile('myFile')
        if (f.empty) {
            flash.message = 'file cannot be empty'
            render(view: 'uploadForm')
            return
        }

        def jsonData = JSON.parse(f.getInputStream(), 'UTF-8')
        render(jsonData.toString())
    }
}
