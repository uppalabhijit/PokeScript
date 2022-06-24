package com.mohammad.pokescript

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.DialogFragment

class FilterDialog(var filterListener: FilterListener) : DialogFragment {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRetainInstance(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentContainer = container

        val rootview = layoutInflater.inflate(R.layout.dialog_filter, fragmentContainer, false)
        val fireImage = rootview.findViewById<ImageView>(R.id.fire)
        val bugImage = rootview.findViewById<ImageView>(R.id.bug)
        val darkImage = rootview.findViewById<ImageView>(R.id.dark)
        val dragonImage = rootview.findViewById<ImageView>(R.id.dragon)
        val electricImage = rootview.findViewById<ImageView>(R.id.electric)
        val fairyImage = rootview.findViewById<ImageView>(R.id.fairy)
        val fightingImage = rootview.findViewById<ImageView>(R.id.fighting)
        val flyingImage = rootview.findViewById<ImageView>(R.id.flying)
        val ghostImage = rootview.findViewById<ImageView>(R.id.ghost)
        val grassImage = rootview.findViewById<ImageView>(R.id.grass)
        val groundImage = rootview.findViewById<ImageView>(R.id.ground)
        val iceImage = rootview.findViewById<ImageView>(R.id.ice)
        val normalImage = rootview.findViewById<ImageView>(R.id.normal)
        val poisonImage = rootview.findViewById<ImageView>(R.id.poison)
        val psychicImage = rootview.findViewById<ImageView>(R.id.psychic)
        val rockImage = rootview.findViewById<ImageView>(R.id.rock)
        val steelImage = rootview.findViewById<ImageView>(R.id.steel)
        val waterImage = rootview.findViewById<ImageView>(R.id.water)
        val cancelBtn = rootview.findViewById<Button>(R.id.DialogCancel)

        // Type click listeners


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}