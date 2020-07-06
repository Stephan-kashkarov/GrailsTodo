package todoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ItemListSpec extends Specification implements DomainUnitTest<ItemList> {

    
    def setup() {
        mockDomain Item
        mockDomain List
        mockDomain ItemList
    }

    def cleanup() {
    }

    void initalisation() {
        given: "A list and a user"
        def item = new Item(title: "Item")
        def list = new List(name: "Items")

        expect:"Creating ItemList object"
        def linker = new ItemList(item: item, list:list)
        linker.list.name == "Items"
    }
}
