package com.example.sampahmasgabungan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class profil_edits : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference

    private lateinit var editTextName: TextInputEditText
    private lateinit var editTextEmail: TextInputEditText
    private lateinit var editTextPhone: TextInputEditText
    private lateinit var editTextAlamat: TextInputEditText
    // ...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_edits)
        auth = FirebaseAuth.getInstance()
        val user = auth.currentUser
        val uid = user?.uid
        database = FirebaseDatabase.getInstance().reference
        val backButton: ImageButton = findViewById(R.id.iBack)
        backButton.setOnClickListener {
            onBackPressed()
        }

        editTextName = findViewById(R.id.editUsername)
        editTextEmail = findViewById(R.id.editEmail)
        editTextPhone = findViewById(R.id.editPhoneNumber)
        editTextAlamat = findViewById(R.id.editAlamat)

        database.child("users").child(uid!!).addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    val name = dataSnapshot.child("name").getValue(String::class.java) ?: ""
                    val email = dataSnapshot.child("email").getValue(String::class.java) ?: ""
                    var phone = dataSnapshot.child("phone").getValue(String::class.java) ?: ""

                    val alamat = dataSnapshot.child("alamat").getValue(String::class.java) ?: ""
                    val kota = dataSnapshot.child("kota").getValue(String::class.java) ?: ""
                    val province = dataSnapshot.child("province").getValue(String::class.java) ?: ""

                    // Menambahkan teks "+62" ke nomor telepon jika nomor tidak kosong

                    // Mengisi data ke EditText
                    editTextName.setText(name)
                    editTextEmail.setText(email)
                    editTextPhone.setText(phone)
                    editTextAlamat.setText(alamat + " , " + kota + " , " + province)
                }

            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Handle error jika terjadi pembatalan
            }
        })
        val saveChangesButton = findViewById<Button>(R.id.btSaveChanges)
        saveChangesButton.setOnClickListener {
            val intent = Intent(this, profil_edits::class.java)
            startActivity(intent)
            val newName = editTextName.text.toString().trim()
            val newEmail = editTextEmail.text.toString().trim()
            val newPhone = editTextPhone.text.toString().trim()

            val addressParts = editTextAlamat.text.toString().split(",")
            if (addressParts.size == 3) {
                val newAlamat = addressParts[0].trim()
                val newKota = addressParts[1].trim()
                val newProvince = addressParts[2].trim()

                // Update data pada Firebase Realtime Database

                val userData = HashMap<String, Any>()
                userData["alamat"] = newAlamat
                userData["kota"] = newKota
                userData["province"] = newProvince
                userData["name"] = newName
                userData["email"] = newEmail
                userData["phone"] = newPhone

                database.child("users").child(uid!!).updateChildren(userData)
                    .addOnSuccessListener {

                        // Jika update berhasil
                        Toast.makeText(this, "Changes saved successfully", Toast.LENGTH_SHORT).show()
                        // Tambahkan kode lain yang ingin Anda lakukan setelah update berhasil
                    }
                    .addOnFailureListener {
                        // Jika update gagal
                        Toast.makeText(this, "Failed to save changes", Toast.LENGTH_SHORT).show()
                    }

                // Update the database here
            } else {
                Toast.makeText(this, "Please enter a valid address with three parts separated by commas", Toast.LENGTH_LONG).show()
            }

        }
        // ...
    }

// ...

}