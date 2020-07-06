package todoapp

class ItemList {
    static belongsTo = [item: Item, list: List]

    static constraints = {
        item blank: false, validator: {item -> item.id == Item.get(item.id).id}
        list blank: false, validator: {list -> list.id == List.get(list.id).id}
    }
}
