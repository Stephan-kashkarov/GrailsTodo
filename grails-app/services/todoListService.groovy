package todoapp

import grails.gorm.services.Service

@Service(TodoList)
interface TodoListService {
    TodoList save(String name, String description)
}