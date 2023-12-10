import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.sampahmasgabungan.R

class Popup(private val context: Context) {

    private var dialog: Dialog? = null
    private lateinit var selectedText:String


    fun showPopup() {
        // Inflate the popup layout
        val inflater = LayoutInflater.from(context)
        val popupView = inflater.inflate(R.layout.activity_popup, null)

        // Create the custom dialog
        dialog = Dialog(context)
        dialog?.setContentView(popupView)
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        // Show the dialog
        val layoutParams = dialog?.window?.attributes
        layoutParams?.gravity = Gravity.BOTTOM
        layoutParams?.width = WindowManager.LayoutParams.MATCH_PARENT
        dialog?.window?.attributes = layoutParams

        dialog?.show()
        val overlayView = (context as Activity).findViewById<View>(R.id.overlayView)
        overlayView.visibility = View.VISIBLE

        val bSavePayment = popupView.findViewById<Button>(R.id.bSavePayment)
        val radioGroup = popupView.findViewById<RadioGroup>(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = popupView.findViewById<RadioButton>(checkedId)

            selectedText = radioButton.text.toString()
        }
        bSavePayment.setOnClickListener {
            hidePopup()
        }
    }

    fun hidePopup() {
        // Dismiss the dialog
        dialog?.dismiss()
        dialog = null
        val overlayView = (context as Activity).findViewById<View>(R.id.overlayView)
        overlayView.visibility = View.GONE
    }
    fun getSelectedItem(): String {
        return selectedText
    }
}
