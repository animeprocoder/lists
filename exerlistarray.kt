fun main(){
    //Items on the desk
    var Items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    //Removed Items for increase of productivity
    val removedItems = arrayListOf("pen", "paper", "mug", "phone")
    Items.removeAll(removedItems.toSet())
    println(Items)
}