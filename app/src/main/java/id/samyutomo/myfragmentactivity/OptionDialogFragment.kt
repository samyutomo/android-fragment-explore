package id.samyutomo.myfragmentactivity

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment


class OptionDialogFragment : DialogFragment() {

    private lateinit var btnChoose:Button
    private lateinit var btnClose:Button
    private lateinit var rgOptions:RadioGroup
    private lateinit var rbSaf:RadioButton
    private lateinit var rbMou:RadioButton
    private lateinit var rbLvg:RadioButton
    private lateinit var rbMoy:RadioButton
    private var optionDialogListener: OnOptionDialogListener? = null

    interface OnOptionDialogListener {
        fun onOptionChosen(coach: String?)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_option_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnChoose = view.findViewById(R.id.btn_choose)
        btnClose = view.findViewById(R.id.btn_close)
        rgOptions = view.findViewById(R.id.rg_option)
        rbSaf = view.findViewById(R.id.rb_saf)
        rbMou = view.findViewById(R.id.rb_mou)
        rbLvg = view.findViewById(R.id.rb_lvg)
        rbMoy = view.findViewById(R.id.rb_moy)

        btnChoose.setOnClickListener {
            val checkRadioButtonId = rgOptions.checkedRadioButtonId
            if (checkRadioButtonId!=-1){
                val coach:String? = when(checkRadioButtonId){
                    R.id.rb_saf -> rbSaf.text.toString().trim()
                    R.id.rb_mou -> rbMou.text.toString().trim()
                    R.id.rb_lvg -> rbLvg.text.toString().trim()
                    R.id.rb_moy -> rbMoy.text.toString().trim()
                    else -> null
                }
                optionDialogListener?.onOptionChosen(coach)
                dialog?.dismiss()
            }
        }

        btnClose.setOnClickListener {
            dialog?.cancel()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        val fragment = parentFragment

        if (fragment is DetailCategoryFragment){
            this.optionDialogListener = fragment.optionDialogListener
        }
    }

    override fun onDetach() {
        super.onDetach()
        this.optionDialogListener = null
    }
}