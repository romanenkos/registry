package registry

class SearchDoctorController {

    def search(String address) {
        if (address) {
            def a = Address.findByAddress(address)
            if (a) {
                //TODO prepare links for doc's schedule.
                [address: a, district: a.district]
            }
        }

    }
}
