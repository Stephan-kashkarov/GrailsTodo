package todoapp

class BootStrap {

    def init = { servletContext ->
        UserService userService
        ItemService itemService
        TodoListService todoListService
        TodoListUserService todoListUserService
        ItemTodoListService itemTodoListService
        FollowerService followerService
    }
    def destroy = {
    }
}
