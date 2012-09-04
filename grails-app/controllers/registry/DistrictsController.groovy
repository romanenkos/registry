package registry

class DistrictsController {

    def index() {
        [districts: District.findAll()]
    }


}
