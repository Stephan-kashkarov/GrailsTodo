package todoapp

class Item {
    String title
    String description
    Boolean completed

    static constraints = {
        title blank: false, nullable: false
    }

    static belongsTo = List
}
