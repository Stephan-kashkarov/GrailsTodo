package todoapp

class BootStrap {

    def init = { servletContext ->
        UserService userService
        ItemService itemService
        ListService listService
        ListUserService listUserService
        ItemListService itemListService
    }
    def destroy = {
    }
}
