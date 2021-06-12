package kz.example.dialogfragmentexample

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kz.example.dialogfragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDialog.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setView(R.layout.dialog)
                .create()

            alertDialog.show()
        }

        binding.btnDialogFragment.setOnClickListener {
            val dialogFragment = MyDialogFragment()
            dialogFragment.show(supportFragmentManager, null)
        }

        binding.btnModalBS.setOnClickListener {
            val dialog = MyModalBSFragment()
            dialog.show(supportFragmentManager, null)
        }

        binding.btnPersistentBS.setOnClickListener {

        }
    }


}