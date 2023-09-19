package com.myapp.creativityspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.creativityspace.ui.theme.CreativitySpaceTheme
import androidx.compose.runtime.remember as remember

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreativitySpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CreativityWork()
                }
            }
        }
    }
}

@Composable
fun CreativityWork(modifier: Modifier = Modifier) {
    var currentWork by remember { mutableStateOf(1) }
    when (currentWork) {
        1 -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .background(Color.White)
                    .shadow(10.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.team_work),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = stringResource(R.string.team_work),
                    fontSize = 30.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Text(
                    text = stringResource(R.string.team_work_author),
                    fontSize = 30.sp,
                    modifier = Modifier.padding(start = 15.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = { currentWork = 2 }) {
                    Text(text = "Next")

                }

            }
        }

        2 -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .background(Color.White)
                    .shadow(10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.work_png_pic),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(40.dp))

                Text(
                    text = stringResource(R.string.work),
                    fontSize = 30.sp,
                    modifier = Modifier.padding(start=20.dp)
                )
                Text(
                    text = stringResource(R.string.work_author),
                    fontSize = 30.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.height(40.dp))
                Row {
                    Button(onClick = { currentWork = 1 }) {
                        Text(text = "Previous")
                    }
                    Spacer(modifier = Modifier.width(25.dp))
                    Button(onClick = { currentWork = 3 }) {
                        Text(text = "Next")

                    }
                }

            }

        }

        3 -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .background(Color.White)
                    .shadow(10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.work_together),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = stringResource(R.string.work_together),
                    fontSize = 30.sp,
                    modifier = Modifier.padding(start=60.dp)
                )
                Text(
                    text = stringResource(R.string.work_together_author),
                    fontSize = 30.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))

                    Button(onClick = { currentWork = 2 }) {
                        Text(text = "Previous")
                    }
                    

            }

        }
    }

}


@Preview(showBackground = true)
@Composable
fun CreativeArtPreview() {
    CreativitySpaceTheme {
        CreativityWork()
    }
}