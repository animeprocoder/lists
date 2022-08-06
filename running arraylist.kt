fun main(){
    var colors = arrayListOf("blue", "red")
    var nocOlors = arrayListOf<String>()
    colors.add("yellow")
    var morecolors = arrayListOf("pink", "tea")
    colors.addAll(morecolors)
    colors.remove("red")
    colors.removeAll(morecolors)
    colors.removeAt(3)
    var colorss = arrayListOf("blue", "red", "yellow", "greenk")
    colors.remove("blue")
}