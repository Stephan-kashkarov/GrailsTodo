package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TodoListUserSpec extends Specification implements DomainUnitTest<TodoListUser> {

    def setup() {
        mockDomain User
        mockDomain TodoList
        mockDomain TodoListUser
    }

    def cleanup() {
    }

    void "initalisation"() {
        given: "A TodoList and a user"
        def user = new User(name: "12345ab", passwordHash: "asd", email:"")
        def list = new TodoList(name: "Items")

        expect:"Creating TodoListUser object"
        def linker = new TodoListUser(user: user, list:list)
        linker.list.name == "Items"
    }
}
