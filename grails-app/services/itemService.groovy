package todoapp

import grails.gorm.services.Service

@Service(Item)
interface ItemService {
    Item save(String title, String description, Boolean completed)
}