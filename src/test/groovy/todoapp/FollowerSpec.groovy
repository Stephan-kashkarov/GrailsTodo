package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class FollowerSpec extends Specification implements DomainUnitTest<Follower> {

    def setup() {
        mockDomain User
    }

    def cleanup() {
    }

    void "initalisation"() {
        given: "Two Users"
        def u1 = new User(
            username: "user1",
            password: "password",
            email: "abc@def.com"
        )
        def u2 = new User(
            username: "user2",
            password: "password",
            email: "abc@def.com"
        )

        expect:"Creating ItemTodoList object"
        def linker = new Follower(follower: u1, following:u2)
        linker.follower.username == "user1"
    }
}
