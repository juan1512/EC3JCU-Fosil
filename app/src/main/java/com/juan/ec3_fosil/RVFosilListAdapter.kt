package com.juan.ec3_fosil

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.juan.ec3_fosil.databinding.ItemFosilesBinding
import com.juan.ec3_fosil.model.Fosil

class RVFosilListAdapter (var fosiles: List<Fosil>): RecyclerView.Adapter<FosilVH>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FosilVH {
        val binding = ItemFosilesBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return FosilVH(binding)
    }

    override fun getItemCount(): Int = fosiles.size


    override fun onBindViewHolder(holder: FosilVH, position: Int) {
        holder.bind(fosiles[position])
    }

}

class  FosilVH(private var binding: ItemFosilesBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(fosil: Fosil) {
        binding.imageUri.setImageResource(R.drawable.aa)
        binding.txtName.text = fosil.name
        binding.txtFileName.text = fosil.filename
        binding.txtMuseumPharase.text = fosil.museumopharase
        binding.txtPrice.text = fosil.price
    }


}