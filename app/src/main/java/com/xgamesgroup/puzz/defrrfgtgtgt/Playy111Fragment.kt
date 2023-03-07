package com.xgamesgroup.puzz.defrrfgtgtgt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.xgamesgroup.puzz.R
import com.xgamesgroup.puzz.databinding.FragmentPlayy111Binding


class Playy111Fragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentPlayy111Binding = FragmentPlayy111Binding.inflate(inflater, container, false)
        return gtgyhujuju.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            tgjgtjgjigtjigtjihyjihyjihyjihyjihy()

        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gthyhuyjuju() {
        Snackbar.make(
            gtgyhujuju.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentPlayy111Binding: FragmentPlayy111Binding? = null
    private val gtgyhujuju get() = fragmentPlayy111Binding ?: throw RuntimeException("FragmentPlayy111Binding = null")

    private fun tgjgtjgjigtjigtjihyjihyjihyjihyjihy() {
        gtgyhujuju.btnPlayGame.setOnClickListener {
            kgtkhyjhjyihyjihyji()
        }
    }

    private fun kgtkhyjhjyihyjihyji() {
        gigtiuhgtihgtihuigt()
    }

    private fun gigtiuhgtihgtihuigt() {
        findNavController().navigate(R.id.action_playy111Fragment_to_playy222Fragment)
    }

    override fun onDestroy() {
        fragmentPlayy111Binding = null
        super.onDestroy()
    }
}