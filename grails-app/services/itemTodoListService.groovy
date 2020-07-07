package todoapp

import grails.gorm.services.Service

@Service(ItemTodoList)
interface ItemTodoListService {
    ItemTodoList save(Item item, TodoList list)
}