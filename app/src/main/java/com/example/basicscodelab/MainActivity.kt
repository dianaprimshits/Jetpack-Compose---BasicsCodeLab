package com.example.basicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                Main(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun Main(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("World", "Compose")
) {
    Column(modifier = modifier.padding(vertical = 5.dp)) {
        names.forEach {
            Greeting(it)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp)
    ) {
        Row(modifier = Modifier.padding(25.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello,")
                Text(text = name)
            }

            ElevatedButton(
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Show more")
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        Main()
    }
}