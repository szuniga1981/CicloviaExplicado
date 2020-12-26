package cl.sebastian.cicloviaexplicado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
Recursos
[x] configurar ViewBinding en gradle
[x} Se crea activity_main con los botones solicitados y el recyclerView
[x] Se crea item_list_bike con constraint, cardview, tv_comuna y tv_ciclovia
[x] se crea la clase CicloviaAdapter, se crean los metodos y se debe crear la clase VH(viewholder)
// se crea el primer commit

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}