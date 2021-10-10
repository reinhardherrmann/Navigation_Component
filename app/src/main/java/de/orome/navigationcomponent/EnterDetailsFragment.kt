package de.orome.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class EnterDetailsFragment : Fragment() {

    private lateinit var rootView: View
    private lateinit var btnVerifyDetails: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         rootView= inflater.inflate(R.layout.fragment_enter_details, container, false)

        btnVerifyDetails = rootView.findViewById(R.id.btn_verify_details)
        btnVerifyDetails.setOnClickListener {
            findNavController().navigate(R.id.action_enterDetailsFragment_to_verifyDetailsFragment)
        }


        return rootView
    }

}