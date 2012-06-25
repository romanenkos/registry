package registry

class SearchDoctorController {

    def search(String address) {
        if (address) {
            def a = Address.findByAddress(address)
            if (a) {
                [address: a, district: a.district]
            }
        }

    }
}
