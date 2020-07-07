package todoapp
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class TodoList implements Serializable {
    String name
    String description
    static hasMany = [ItemTodoList, TodoListUser]
}
