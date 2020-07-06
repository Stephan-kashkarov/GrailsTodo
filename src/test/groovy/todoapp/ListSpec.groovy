package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ListSpec extends Specification implements DomainUnitTest<List> {

    def setup() {
        mockDomain List
    }

    def cleanup() {
    }

    void initalisation() {
        expect:"Creating List object"
        def list = new List(name: "Items")
        list.name == "Items"
    }
}
