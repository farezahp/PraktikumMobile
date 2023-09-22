// Codelab 1: "Program pertama Anda di Kotlin" 

fun main() { // kode program dijalankan setelah fun main
    println("I'm")  // perintah println digunakan untuk membuat baris baru dan nilai baru
    println("Fareza")
    println("Student UTDI!")
}

***


//Codelab 2 : Membuat dan menggunakan variabel di Kotlin

fun main() {  // kode program dijalankan setelah fun main
    val cartTotal = 0 //Gunakan jika Anda tidak ingin nilai variabel dapat berubah
    cartTotal = 20 // gunakan untuk mengubah nilai dari cartTotal
    println("Total: $cartTotal")  //Gunakan untuk memanggil
}


***


//Codelab 3 : Membuat dan menggunakan fungsi di Kotlin

fun main() {
    callAnimal() // berfungsi untuk memanggil fungsi callAnimal()
    genap(4) // berfungsi untuk memanggil fungsi tambah()
}

// gunakan fungsi callAnimal() sebagai fungsi tanpa parameter
fun callAnimal() {
    println("Sini Gisko")
}

// gunakan fungsi genap() adalah contoh fungsi dengan parameter
fun genap(angka: Int) {
    if(angka % 2 === 0) { // menggunakan perintah ini untuk mengecek apakah angkanya genap
       println("ya, angka genap") 
    }else {  // menggunakan perintah ini untuk mengecek apakah angkanya ganjil
        println("tidak, angka ganjil")
    }
    
}


***


//Codelab 4 : Soal Latihan:Dasar-Dasar Kotlin

fun main() {
    printFilmInfo("Inception", "Christopher Nolan", 2010, 8.8) // gunakan perintah printFilmInfo untuk memanggil fungsi yang telah dibuat
    printFilmInfo("The Shawshank Redemption", "Frank Darabont", 1994, 9.3)
    printFilmInfo("Pulp Fiction", "Quentin Tarantino", 1994, 8.9)
    printFilmInfo("The Godfather", "Francis Ford Coppola", 1972, 9.2)
}

// gunakan fungsi ini untuk mencetak informasi film dari parameter
fun printFilmInfo(title: String, director: String, releaseYear: Int, rating: Double) {
    println("Title: $title")
    println("Director: $director")
    println("Release Year: $releaseYear")
    println("Rating: $rating")
    println()
}