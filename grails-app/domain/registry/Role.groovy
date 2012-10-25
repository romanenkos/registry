package registry

class Role {

	String authority

	static mapping = {
        table 'authrole'
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}
}
