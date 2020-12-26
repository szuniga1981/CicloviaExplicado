package cl.sebastian.cicloviaexplicado

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CicloviaAdapter : RecyclerView.Adapter<CicloviaAdapter.VH>() { // se extiende de la clase : RecyclerView.Adapter<CicloviaAdapter.VH>()
    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) { //se crea la clase VH y extiende de la clase RecyclerView.ViewHolder (se crea a mano)

    }
    // se crea el primer commit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}