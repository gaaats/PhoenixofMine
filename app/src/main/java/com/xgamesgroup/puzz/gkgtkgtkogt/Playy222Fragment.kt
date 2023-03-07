package com.xgamesgroup.puzz.gkgtkgtkogt

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.xgamesgroup.puzz.R
import com.xgamesgroup.puzz.databinding.FragmentPlayy222Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Playy222Fragment : Fragment() {
    private var playy222Binding: FragmentPlayy222Binding? = null
    private val binding
        get() = playy222Binding ?: throw RuntimeException("FragmentPlayy222Binding = null")

    private fun makeError() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    val nhjhjjj by lazy {
        listOf(
            ContextCompat.getDrawable(requireActivity(), R.drawable.dog),
            ContextCompat.getDrawable(requireActivity(), R.drawable.dag),
        )
    }

    val frgtgthyhy = listOf(0, 2, 3)
    val hy5uju59ujuj95uj = listOf(2, 3, 5)
    val frgtgtgtgt = listOf(1, 4, 5)
    val hy5ju59uj9595uj = listOf(0, 4, 5)
    val variant5gtgt = listOf(0, 3, 5)

    val gtgtgt = listOf(
        frgtgthyhy,
        hy5uju59ujuj95uj,
        frgtgtgtgt,
        hy5ju59uj9595uj,
        variant5gtgt,
    ).shuffled()

    var hyhyhy = true
    var yhyhy = true

    val bgbggb by lazy {
        listOf(
            binding.imgElem1Back,
            binding.imgElem2Back,
            binding.imgElem3Back,
            binding.imgElem4Back,
            binding.imgElem5Back,
            binding.imgElem6Back
        )
    }

    val enaaaa by lazy {
        listOf(
            binding.imgElem1,
            binding.imgElem2,
            binding.imgElem3,
            binding.imgElem4,
            binding.imgElem5,
            binding.imgElem6,
        )
    }

    fun notvork() {
        enaaaa.forEach {
            it.isEnabled = false
        }
    }

    fun dooooo() {
        enaaaa.forEach {
            it.isEnabled = true
        }
    }


    private fun gtojgtjogtogjihy(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.front_animator
        ) as AnimatorSet
    }

    private fun hykohykohykohyko(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.back_animator
        ) as AnimatorSet
    }

    private val hyhkhkohy by lazy {
        gtojgtjogtogjihy()
    }
    private val ggtt by lazy {
        gtojgtjogtogjihy()
    }
    private val nhnhnnhnh by lazy {
        gtojgtjogtogjihy()
    }
    private val hhhhhhhhhhh by lazy {
        gtojgtjogtogjihy()
    }
    private val jjjjjuku by lazy {
        gtojgtjogtogjihy()
    }
    private val kkkkikii by lazy {
        gtojgtjogtogjihy()
    }


    private val nnnnnhjuujuu by lazy {
        hykohykohykohyko()
    }

    private val njmmkkk by lazy {
        hykohykohykohyko()
    }

    private val jujuujujuj by lazy {
        hykohykohykohyko()
    }
    private val nhjujjuujuj by lazy {
        hykohykohykohyko()
    }
    private val mnjmjhjkkkk by lazy {
        hykohykohykohyko()
    }
    private val vfgjjukilko by lazy {
        hykohykohykohyko()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            binding.root.background.alpha = 195
            val bgbbgbg = gtgtgt.random()
            Log.d("lolo", "currentVariant ${bgbbgbg} ")

            for (element in 0..5) {
                if (bgbbgbg.contains(element)) {
                    Log.d("lolo", "currentVariant.contains OK ")
                    bgbggb[element].contentDescription = "ok"
                    val imaaaage = ContextCompat.getDrawable(requireActivity(), R.drawable.dog1)
                    bgbggb[element].setImageDrawable(imaaaage)
                } else {
                    Log.d("lolo", "currentVariant.contains FALSE")
                    bgbggb[element].contentDescription = "false"
                    bgbggb[element].setImageDrawable(nhjhjjj.random())
                }
            }


            if (yhyhy) {
                lifecycleScope.launch {
                    thhthtthtf()
                    bgbgbgffff()
                    vffffggg()
                    sdefdfvfvf()
                    hyujkooppp()
                    vbgmjkloo()

                    delay(2000)

                    bgbgbgnhh()
                    njukukkjjj()
                    xsdvghgh()
                    vfrrthy()
                    bghjj()
                    gtgtjijgtohyjjihy()
                }


            }


            val bbgbgbgbg = requireContext().applicationContext.resources.displayMetrics.density
            binding.imgElem1.cameraDistance = 8000 * bbgbgbgbg
            binding.imgElem1Back.cameraDistance = 8000 * bbgbgbgbg


            binding.btnImgExitInfo.setOnClickListener {
                findNavController().navigate(R.id.action_playy222Fragment_to_playy111Fragment)
            }

            binding.imgElem1.setOnClickListener {
                notvork()
                thhthtthtf()
                lifecycleScope.launch {
                    if (binding.imgElem1Back.contentDescription == "ok") {
                        binding.imgElem1.isEnabled = false
                        delay(900)
                        binding.imgElem1.visibility = View.INVISIBLE
                        bgbgbgnhh()
                        binding.imgElem1Back.contentDescription = "done"
                        dooooo()
                        if (bgbhhhh()) tgtgtgtgt()
                    } else {
                        delay(2000)
                        bgbgbgnhh()
                        dooooo()
                    }
                }
            }
            binding.imgElem2.setOnClickListener {
                notvork()
                bgbgbgffff()
                lifecycleScope.launch {
                    if (binding.imgElem2Back.contentDescription == "ok") {
                        binding.imgElem2.isEnabled = false
                        delay(900)
                        binding.imgElem2.visibility = View.INVISIBLE
                        njukukkjjj()
                        binding.imgElem2Back.contentDescription = "done"
                        dooooo()
                        if (bgbhhhh()) tgtgtgtgt()

                    } else {
                        delay(2000)
                        njukukkjjj()
                        dooooo()
                    }
                }

            }

            gtjjgtjgtigtjgtjgtji()

            binding.imgElem4.setOnClickListener {
                notvork()
                sdefdfvfvf()
                lifecycleScope.launch {
                    if (binding.imgElem4Back.contentDescription == "ok") {
                        binding.imgElem4.isEnabled = false
                        delay(900)
                        binding.imgElem4.visibility = View.INVISIBLE
                        vfrrthy()
                        binding.imgElem4Back.contentDescription = "done"

                        dooooo()

                        if (bgbhhhh()) tgtgtgtgt()
                    } else {
                        delay(2000)

                        vfrrthy()

                        dooooo()
                    }
                }

            }

            gjgtgtigthhgthugthgt()

            gjgtgthgihgthugthuhgt()


        } catch (e: Exception) {
            makeError()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gjgtgthgihgthugthuhgt() {
        binding.imgElem6.setOnClickListener {
            notvork()
            vbgmjkloo()
            lifecycleScope.launch {
                if (binding.imgElem6Back.contentDescription == "ok") {
                    binding.imgElem6.isEnabled = false
                    delay(900)
                    binding.imgElem6.visibility = View.INVISIBLE
                    gtgtjijgtohyjjihy()
                    binding.imgElem6Back.contentDescription = "done"

                    dooooo()
                    if (bgbhhhh()) tgtgtgtgt()
                } else {
                    delay(2000)
                    gtgtjijgtohyjjihy()
                    dooooo()
                }
            }
        }
    }

    private fun gjgtgtigthhgthugthgt() {
        binding.imgElem5.setOnClickListener {

            notvork()
            hyujkooppp()
            lifecycleScope.launch {
                if (binding.imgElem5Back.contentDescription == "ok") {
                    binding.imgElem5.isEnabled = false
                    delay(900)
                    binding.imgElem5.visibility = View.INVISIBLE
                    bghjj()
                    binding.imgElem5Back.contentDescription = "done"
                    dooooo()
                    if (bgbhhhh()) tgtgtgtgt()
                } else {
                    delay(2000)

                    bghjj()
                    dooooo()
                }
            }

        }
    }

    private fun gtjjgtjgtigtjgtjgtji() {
        binding.imgElem3.setOnClickListener {
            notvork()
            vffffggg()
            lifecycleScope.launch {
                if (binding.imgElem3Back.contentDescription == "ok") {
                    binding.imgElem3.isEnabled = false
                    delay(900)
                    binding.imgElem3.visibility = View.INVISIBLE
                    xsdvghgh()
                    binding.imgElem3Back.contentDescription = "done"

                    dooooo()

                    if (bgbhhhh()) tgtgtgtgt()
                } else {
                    delay(2000)

                    xsdvghgh()

                    dooooo()
                }
            }

        }
    }

    private fun iniOnClickListener(view: View, funIsFront: Unit, funForBack: Unit) {
        val byhhgfdcvv = view as ImageView
        funIsFront
        lifecycleScope.launch {
            if (byhhgfdcvv.contentDescription == "ok") {
                view.isEnabled = false
                delay(1000)
                view.visibility = View.INVISIBLE
                funForBack
            } else {
                funForBack
            }
        }
        if (bgbhhhh()) {
            tgtgtgtgt()

        }
    }

    private fun tgtgtgtgt() {
        findNavController().navigate(R.id.action_playy222Fragment_to_playy111Fragment)
    }

    private fun gythhyhy(elemFront: ImageView) = elemFront.visibility == View.INVISIBLE

    private fun bgbhhhh(): Boolean {
        var counttteeer = 0
        for (i in bgbggb) {
            if (i.contentDescription == "done") {
                counttteeer++
            }
        }
        return counttteeer == 3

    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun bgbgbgnhh() {
        rfrfrr56(
            hyhkhkohy,
            nnnnnhjuujuu,
            binding.imgElem1,
            binding.imgElem1Back
        )
    }

    private fun njukukkjjj() {
        rfrfrr56(
            ggtt,
            njmmkkk,
            binding.imgElem2,
            binding.imgElem2Back
        )
    }

    private fun vfrrthy() {
        rfrfrr56(
            hhhhhhhhhhh,
            nhjujjuujuj,
            binding.imgElem4,
            binding.imgElem4Back
        )
    }

    private fun bghjj() {
        rfrfrr56(
            jjjjjuku,
            mnjmjhjkkkk,
            binding.imgElem5,
            binding.imgElem5Back
        )
    }

    private fun xsdvghgh() {
        rfrfrr56(
            nhnhnnhnh,
            jujuujujuj,
            binding.imgElem3,
            binding.imgElem3Back
        )
    }


    private fun gtgtjijgtohyjjihy() {
        rfrfrr56(
            kkkkikii,
            vfgjjukilko,
            binding.imgElem6,
            binding.imgElem6Back
        )
    }


    private fun thhthtthtf() {
        bvbvbbvvbvbvb(
            hyhkhkohy, nnnnnhjuujuu, binding.imgElem1, binding.imgElem1Back
        )
    }

    private fun bgbgbgffff() {
        bvbvbbvvbvbvb(
            ggtt, njmmkkk, binding.imgElem2, binding.imgElem2Back
        )
    }

    private fun vffffggg() {
        bvbvbbvvbvbvb(
            nhnhnnhnh, jujuujujuj, binding.imgElem3, binding.imgElem3Back
        )
    }

    private fun sdefdfvfvf() {
        bvbvbbvvbvbvb(
            hhhhhhhhhhh, nhjujjuujuj, binding.imgElem4, binding.imgElem4Back
        )
    }

    private fun hyujkooppp() {
        bvbvbbvvbvbvb(
            jjjjjuku, mnjmjhjkkkk, binding.imgElem5, binding.imgElem5Back
        )
    }

    private fun vbgmjkloo() {
        bvbvbbvvbvbvb(
            kkkkikii, vfgjjukilko, binding.imgElem6, binding.imgElem6Back
        )
    }

    private fun rfrfrr56(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemBack)
        backAnim.setTarget(elemFront)
        frontAnim.start()
        backAnim.start()
    }


    private fun bvbvbbvvbvbvb(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemFront)
        backAnim.setTarget(elemBack)
        frontAnim.start()
        backAnim.start()
    }


    override fun onDestroy() {
        playy222Binding = null
        super.onDestroy()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        playy222Binding = FragmentPlayy222Binding.inflate(inflater, container, false)
        return binding.root
    }
}