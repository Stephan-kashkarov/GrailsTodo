package todoapp

class ListUser {
    static belongsTo = [user: User, list: List]

    static constraints = {
        user blank: false, validator: {user -> user.id == User.get(user.id).id}
        list blank: false, validator: {user -> user.id == User.get(user.id).id}
    }
}
