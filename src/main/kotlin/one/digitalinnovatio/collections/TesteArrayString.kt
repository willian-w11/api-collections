package one.digitalinnovatio.collections

 fun main (){
     val nomes = Array(3) {""}
     nomes[0] = "maria"
     nomes[1] = "joaquina"
     nomes[2] = "Helena"

     for (nomes in nomes) {
         println(nomes)
     }
println("------------------")
     nomes.sort()
     nomes.forEach { println(it) }

println("____________________")
val nomes2 = arrayOf("vivi", "Lais", "Thais")
     nomes2.sort()
     nomes2.forEach { println(it) }

 }

