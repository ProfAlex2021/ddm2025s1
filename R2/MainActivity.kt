package com.example.roteiro2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var novoNomeEditText: EditText
    private lateinit var adicionarNomeBotao: Button
    private lateinit var removerNomeBotao: Button
    private lateinit var nomesListView: ListView
    private lateinit var nomesAdapter: ArrayAdapter<String>
    private val listaNomes = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        novoNomeEditText = findViewById(R.id.novoNomeEditText)
        adicionarNomeBotao = findViewById(R.id.adicionarNomeButton)
        removerNomeBotao = findViewById(R.id.removerNomeButton)
        nomesListView = findViewById(R.id.nomesListView)

        // Inicializar o ArrayAdapter para vincular a lista ao ListView
        nomesAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNomes)
        nomesListView.adapter = nomesAdapter

        // Adicionar um nome à lista ao clicar no botão "Adicionar"
        adicionarNomeBotao.setOnClickListener {
            val novoNome = novoNomeEditText.text.toString().trim()
            if (novoNome.isNotEmpty()) {
                listaNomes.add(novoNome)
                nomesAdapter.notifyDataSetChanged() // Notifica o adapter que os dados mudaram
                novoNomeEditText.text.clear() // Limpa o campo de texto
            } else {
                Toast.makeText(this, "Digite um nome para adicionar.", Toast.LENGTH_SHORT).show()
            }
        }

        // Remover o último nome da lista ao clicar no botão "Remover Último"
        removerNomeBotao.setOnClickListener {
            if (listaNomes.isNotEmpty()) {
                listaNomes.removeAt(listaNomes.size - 1) // Remove o elemento no último índice
                nomesAdapter.notifyDataSetChanged() // Notifica o adapter que os dados mudaram
            } else {
                Toast.makeText(this, "A lista está vazia. Não há nada para remover.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}