package com.example.tpkotlin.nbvaleur

//Moyenne des notes nb valeur
fun main() {
    println("Entrez le nombre de valeurs")
    val nbValeurs = readln();
    val nbValeursInt = nbValeurs.toIntOrNull();
    if(nbValeursInt == null){
        println("La valeur rentrée n'est pas un entier.")
        main()
        return
    }
    val alNotes = arrayListOf<Float>()
    for (note in 0..nbValeursInt){
        println("Valeur :")
        val valeurNote = readln().toFloatOrNull()
        if(valeurNote == null){
            println("La valeur rentrée n'est pas une note .")
            nbValeursInt+1
            continue
        }
        alNotes.add(valeurNote)
    }
    println("La moyenne est de ${alNotes.average()}")
}