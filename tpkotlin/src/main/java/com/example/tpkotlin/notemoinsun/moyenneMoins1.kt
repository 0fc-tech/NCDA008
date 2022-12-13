package com.example.tpkotlin.notemoinsun

fun main() {
    val alNotes = arrayListOf<Float>()

    //println("Note (-1 pour terminer)")
    var note:Float?= 0.0F;
    do {
        println("Note (-1 pour terminer)")
        note = readln().toFloatOrNull()
        if(note == null){
            println("La note n'est pas valide")
        }else{
            if(note != -1f)
                alNotes.add(note)
        }
    }
    while (note != -1f)
    println("La moyenne est de ${alNotes.average()}")
}