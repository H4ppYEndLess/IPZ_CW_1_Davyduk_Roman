package ua.edu.lntu.cw_1_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.cw_1_2.ui.theme.IPZ_CW_1_2_Davyduk_RomanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_1_2_Davyduk_RomanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    var email by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Sing In",
                        fontSize = 24.sp
                    )
                })
        }
    ){
        paddingValues ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            TextField(
                value = email,
                onValueChange = {text = it},
                label = {Text("Введіть email")}
            )
            TextField(
                value = text1,
                onValueChange = {password = it},
                label = {Text("Введіть email")}
            )
            Button(onClick = { /*TODO*/ }) {
                Text("Sing In")
                
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CW_1_2_Davyduk_RomanTheme {
        Greeting()
    }
}
