package com.example.myapplication.pages

import android.app.DatePickerDialog
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.Pages
import org.json.JSONArray
import org.json.JSONObject

@Composable
fun DiverModification(diver: JSONArray) {
    val diverData = diver.getJSONObject(0)
    val name = remember{ mutableStateOf(diverData.getString("nom")) }
    val firstname = remember{ mutableStateOf(diverData.getString("prenom")) }
    val date = remember{ mutableStateOf(diverData.getString("date_certificat_medical")) }
    val email = remember{ mutableStateOf(diverData.getString("email")) }
    val level = remember{ mutableStateOf(diverData.getString("niveau")) }
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Modification du Plongueur",
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 31.dp, end = 8.dp),
            horizontalAlignment = Alignment.End,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Nom : ")
                TextField(
                    value = name.value,
                    onValueChange = {
                        name.value = it
                    }
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Prénom : ")
                TextField(
                    value = firstname.value,
                    onValueChange = {
                        firstname.value = it
                    }
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Mail : ")
                TextField(
                    value = email.value,
                    onValueChange = {
                        email.value = it
                    }
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Certificat : ")
                TextField(
                    value = date.value,
                    onValueChange = {
                        date.value = it
                    }
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Niveau : ")
                TextField(
                    value = level.value,
                    onValueChange = {
                        level.value = it
                    }
                )
            }
        }
        Button(onClick = {
            /* call a method passed in argument to update diver */

        }) {
            Text(
                text = "Enregister"
            )
        }
    }
}