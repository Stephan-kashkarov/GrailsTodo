package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ListUserSpec extends Specification implements DomainUnitTest<ListUser> {

    def setup() {
        mockDomain User
        mockDomain List
        mockDomain ListUser
    }

    def cleanup() {
    }

    void initalisation() {
        given: "A list and a user"
        def user = new User(name: "12345ab", passwordHash: "asd", email:"")
        def list = new List(name: "Items")

        expect:"Creating ListUser object"
        def linker = new ListUser(user: user, list:list)
        linker.list.name == "Items"
    }
}
