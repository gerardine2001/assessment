fun main() {

introduction("Gerardine",20)
    nameArrays("Gerardine","Promise","Chantal","Belyse")
    multilpy(34,5)
    divide(22,7)
    modulus(33,5)
    var human=Human("Gerardine",20,50.1)
    human.speech("eeeeee")
    human.eat(20)

}
fun introduction(name:String,age:Int):String{
   println("My name is $name and I am $age years old")
}
fun nameArrays(name:String,name1:String,name2:String,name3:String):String{
    var names= arrayOf(name,name1,name2,name3)
    if (name in names){
        if (name.length>4)
    }
    return name
}
fun multilpy(num:Int,num1:Int):Int{
    return num*num1
}
fun divide(a:Int,b:Int):Int{
    return a/b
}
fun  modulus(q:Int,w:Int):Int{
    return q%w
}
class Human(var name: String,var age: Int, var weight:Double){
    fun eat(foodWeight:Int){
        println("I am eating ${foodWeight} kgs of food")
    }

    fun speech(speech:String){

    }
    fun birthday(){

    }

}
fun comparion(num1: Int):Int{
    if (2<3){
        println(true)
    }




}

