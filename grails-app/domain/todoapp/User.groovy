package todoapp

class User {
    
    String username
    String passwordHash
    String email

    static constraints = {
        username size: 5..15, blank: false, unique: true, nullable: false
        passwordHash blank: false, nullable: false
        email email: true, blank: true, nullable: true
    }

    static hasOne = [listUser: ListUser]
}
