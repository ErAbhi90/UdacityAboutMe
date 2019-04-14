package abhi.mobiledev.`in`.udacityaboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_done.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view: View) {

        nickname_text.text = nickname_edit.text
        nickname_edit.visibility = View.GONE
        view.visibility = View.GONE

        nickname_text.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
