package todoapp
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class TodoListUser implements Serializable {
    User user
    TodoList list
    
    static hasOne = [user: User, list: TodoList]
}
