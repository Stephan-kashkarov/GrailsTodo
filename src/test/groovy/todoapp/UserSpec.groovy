package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class UserSpec extends Specification implements DomainUnitTest<User> {

    def setup() {
        mockDomain User
    }

    def cleanup() {
    }

    void initalisation() {
        expect: "Creating User object"
        def user = new User(username: "12345ab", passwordHash: "asd", email:"")
        user.username == "12345ab"
    }

}
