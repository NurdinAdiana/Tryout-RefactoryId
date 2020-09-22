fun main() {
//    menampilkan ke layar
    print(multiplicationTable(3))
}
fun multiplicationTable(n: Int): List<List<Int>>{
//    buat variable list yang dapat di ubah yg pertama
    val first = mutableListOf<Int>()
//    perulangan awal untuk mengisi variable first
    for (i in 1..n){
        first.add(i-1,i)
    }
//    print(first)

//    buat variable ke dua untuk menyimpan data ke 2
    val second = mutableListOf<Int>()
//    looping untuk mengisi variable second dengan mengalikan data ke 1(first)
    for (j in 1..n){
        second.add(j-1,first[1]*j)
    }
//    print(second)

//    buat variable ke tiga untuk menyimpan data ke 3
    val third = mutableListOf<Int>()
//    looping untuk mengisi data ke 3 dengan mengalikan dengan data ke 1(first)
    for (k in 1..n){
        third.add(k-1,first[2]*k)
    }
//    print(third)

//    mengembalikan data ke 1,ke 2 dan ke 3 berbentuk list di dalam list.
    return listOf(first,second,third)

}



