fun main() {
    sorting(4 ,9 ,7 ,5 ,8 ,9 ,3)
}
fun sorting(vararg values:Int){
    val arr = mutableListOf<Int>()
    for (value  in values){
        arr.add(value)
    }
    println(arr)

    val arr1 = mutableListOf<Int>(arr[2],arr[5])
    val arr2 = mutableListOf<Int>(arr[3],arr[1])
    val arr3 = mutableListOf<Int>(arr[3],arr[2])
    val arr4 = mutableListOf<Int>(arr[4],arr[5])
    val arr5 = mutableListOf<Int>(arr[6],arr[5])
    val arr6 = mutableListOf<Int>(arr[6],arr[5])
    val arr7 = mutableListOf<Int>(arr[6],arr[4])
    val arr8 = mutableListOf<Int>(arr[6],arr[2])
    val arr9 = mutableListOf<Int>(arr[6],arr[3])
    val arr10 = mutableListOf<Int>(arr[6],arr[0])

    val swap = mutableListOf<Int>()
    for (i in 1..10){
        when{
//            4 ,9 ,7 ,5 ,8 ,9 ,3
            i == 1 -> println("$i. $arr1 -> ${arr[0]} ${arr[2]} ${arr[1]} ${arr[3]} ${arr[4]} ${arr[5]} ${arr[6]}")
            i == 2 -> println("$i. $arr2 -> ${arr[0]} ${arr[2]} ${arr[3]} ${arr[1]} ${arr[4]} ${arr[5]} ${arr[6]}")
            i == 3 -> println("$i. $arr3 -> ${arr[0]} ${arr[3]} ${arr[2]} ${arr[1]} ${arr[4]} ${arr[5]} ${arr[6]}")
            i == 4 -> println("$i. $arr4 -> ${arr[0]} ${arr[3]} ${arr[2]} ${arr[4]} ${arr[1]} ${arr[5]} ${arr[6]}")
            i == 5 -> println("$i. $arr5 -> ${arr[0]} ${arr[3]} ${arr[2]} ${arr[4]} ${arr[1]} ${arr[6]} ${arr[5]}")
            i == 6 -> println("$i. $arr6 -> ${arr[0]} ${arr[3]} ${arr[2]} ${arr[4]} ${arr[6]} ${arr[1]} ${arr[5]}")
            i == 7 -> println("$i. $arr7 -> ${arr[0]} ${arr[3]} ${arr[2]} ${arr[6]} ${arr[4]} ${arr[1]} ${arr[5]}")
            i == 8 -> println("$i. $arr8 -> ${arr[0]} ${arr[3]} ${arr[6]} ${arr[2]} ${arr[4]} ${arr[1]} ${arr[5]}")
            i == 9 -> println("$i. $arr9 -> ${arr[0]} ${arr[6]} ${arr[3]} ${arr[2]} ${arr[4]} ${arr[1]} ${arr[5]}")
            i == 10 -> println("$i. $arr10 -> ${arr[6]} ${arr[0]} ${arr[3]} ${arr[2]} ${arr[4]} ${arr[1]} ${arr[5]}")
        }
        swap.add(i)
    }
    print("jumlah swap : ${swap.size}")




}

