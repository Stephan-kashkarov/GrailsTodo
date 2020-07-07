package todoapp
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class ItemTodoList implements Serializable {
    Item item
    TodoList list

    static hasOne = [item: Item, list: TodoList]

}
