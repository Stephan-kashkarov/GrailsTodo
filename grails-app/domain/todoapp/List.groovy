package todoapp

class List {
    String Name

    static hasOne = [listUser: ListUser]
    static hasMany = [item: Item]
}
