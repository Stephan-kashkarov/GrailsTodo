package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ItemTodoListSpec extends Specification implements DomainUnitTest<ItemTodoList> {

    
    def setup() {
        mockDomain Item
        mockDomain TodoList
        mockDomain ItemTodoList
    }

    def cleanup() {
    }

    void "initalisation"() {
        given: "A TodoList and a user"
        def item = new Item(title: "Item")
        def list = new TodoList(name: "Items")

        expect:"Creating ItemTodoList object"
        def linker = new ItemTodoList(item: item, list:list)
        linker.list.name == "Items"
    }
}
