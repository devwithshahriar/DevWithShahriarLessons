package com.shahriar.devwithshahriarlessons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shahriar.devwithshahriarlessons.jetpackcompose.OutlinedTextFieldExample
import com.shahriar.devwithshahriarlessons.ui.theme.DevWithShahriarLessonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevWithShahriarLessonsTheme {

                OutlinedTextFieldExample()

            }
        }
    }
}
