fun information(name: String, number: String){
    println("$name")
    println("$number")

}
fun information(name: String, number: String, bizName: String){
    println("$name")
    println("$number")
    println("$bizName")
}

fun main(){
    var userAns = 0
    var isexit = true

    do{
        println("1. Residential")
        println("2. Business")

        print("Enter the number of the type of customer you are: ")
        userAns = readLine()!!.toInt()
        when(userAns){
            1 -> {
                println("What is your name?")
                var name = readLine()!!.toString()
                println("What is your phone number?")
                var number = readLine()!!.toString()
                information(name, number)
            isexit = false
            }
            2 -> {
                println("What is your name?")
                var name = readLine()!!.toString()
                println("What is your phone number?")
                var number = readLine()!!.toString()
                println("What is your business name?")
                var bizName = readLine()!!.toString()
                information(name, number, bizName)
            isexit = false
            }
            !in 1..2 -> println("Invalid Option, Please Try Again")
        }
    }while (isexit)
}