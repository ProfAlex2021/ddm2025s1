package com.example.helloandroid // Substitua pelo seu nome de pacote

fun main() {
    // Demonstração da criação de String
    val nome: String = "João" // Variável imutável (val) do tipo String
    var sobrenome: String = "Silva" // Variável mutável (var) do tipo String
    println("Nome completo: $nome $sobrenome")

    sobrenome = "Oliveira" // É possível reatribuir valor a uma variável var
    println("Sobrenome alterado: $sobrenome")

    val saudacao = "Olá, mundo!" // Inferência de tipo: o compilador sabe que é uma String
    println(saudacao)

    // Demonstração de criação de tipo numérico
    val idade: Int = 30 // Inteiro
    val altura: Double = 1.75 // Double (ponto flutuante de dupla precisão)
    val peso: Float = 70.5f // Float (ponto flutuante de precisão simples, precisa do 'f' no final)
    val populacao: Long = 210000000L // Long (inteiro longo, precisa do 'L' no final)
    val ativo: Boolean = true // Booleano (verdadeiro ou falso)

    println("Idade: $idade, Altura: $altura, Peso: $peso, População: $populacao, Ativo: $ativo")

    // Demonstração da criação de um Array
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Primeiro número do array: ${numeros[0]}")
    numeros[2] = 10 // É possível modificar elementos de um Array mutável
    println("Array modificado: ${numeros.contentToString()}") // contentToString() para imprimir o conteúdo do array

    val nomesArray = arrayOf("Ana", "Pedro", "Carla") // Array de Strings
    println("Tamanho do array de nomes: ${nomesArray.size}")

    // Demonstração da criação de um List (mutável)
    val frutas: MutableList<String> = mutableListOf("Maçã", "Banana", "Laranja")
    println("Lista de frutas inicial: $frutas")

    frutas.add("Morango") // Adiciona um elemento ao final da lista
    println("Lista após adição: $frutas")

    frutas.remove("Banana") // Remove um elemento específico da lista
    println("Lista após remoção: $frutas")

    frutas[0] = "Abacaxi" // Modifica um elemento pelo índice
    println("Lista após modificação: $frutas")

    // Demonstração da criação de um Pair
    val pessoa: Pair<String, Int> = Pair("Maria", 25)
    println("Nome: ${pessoa.first}, Idade: ${pessoa.second}")

    val coordenadas = "Latitude" to 40.7128 to "Longitude" to -74.0060 // Criação encadeada de Pairs (na verdade, um Pair aninhado)
    println(coordenadas) // ((Latitude, 40.7128), (Longitude, -74.0060)) - Importante notar a estrutura aninhada

    val ponto = "x" to 10
    val pontoY = ponto.first to 20 // 'first' ainda é "x"
    println(pontoY) // (x, 20) - Aqui vemos que 'first' do Pair original é mantido

    val cidadeEstado = "Sorocaba" to "São Paulo"
    println("Cidade: ${cidadeEstado.first}, Estado: ${cidadeEstado.second}")
}