package kz.example.dialogfragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kz.example.dialogfragmentexample.databinding.DialogFragmentBinding

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 6/12/21
 */

class MyDialogFragment: DialogFragment() {

    private var _binding: DialogFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DialogFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvTitle.text = "Fasf"
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}