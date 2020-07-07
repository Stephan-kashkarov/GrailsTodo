package todoapp
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Item implements Serializable {
    String title
    String description
    Boolean completed

    static hasMany = ItemTodoList

    static constraints = {
        title blank: false, nullable: false
    }
}
