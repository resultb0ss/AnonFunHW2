fun main() {
    var array = arrayOf(1,2,3,4,5,6,7,8,9)
    var isEven = fun (a: Int) = a % 2 == 0



    fun checkArrayElement (array: Array<Int>, isEven: (Int) -> Boolean): ArrayList<Boolean> {
        var result: ArrayList<Boolean> = arrayListOf()
        for (i in array){
            result.add(isEven(i))
        }
        return result
    }

    println(checkArrayElement(array, isEven))
}