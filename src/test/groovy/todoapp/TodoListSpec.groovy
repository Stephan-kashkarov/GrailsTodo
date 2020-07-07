package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TodoListSpec extends Specification implements DomainUnitTest<TodoList> {

    def setup() {
        mockDomain TodoList
    }

    def cleanup() {
    }

    void "initalisation"() {
        expect:"Creating List object"
        def list = new TodoList(name: "Items")
        list.name == "Items"
    }
}
