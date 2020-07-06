package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ItemSpec extends Specification implements DomainUnitTest<Item> {

    def setup() {
        mockDomain Item
    }

    def cleanup() {
    }

    void initalisation() {
        expect:"Creating Item object"
        def item = new Item(title: "Item")
        item.title == "Item"
    }
}
