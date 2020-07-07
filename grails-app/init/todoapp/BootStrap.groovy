package todoapp

class BootStrap {

    def init = { servletContext ->
        User.withTransaction{}
        Role role = new Role(authority: "ROLE_USER").save(failOnError:true)
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
