package todoapp

import grails.gorm.services.Service

@Service(TodoListUser)
interface TodoListUserService {
    TodoListUser save(User user, TodoList list)
}