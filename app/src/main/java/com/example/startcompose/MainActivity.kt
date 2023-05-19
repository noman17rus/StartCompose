package com.example.startcompose

import android.graphics.fonts.FontFamily
import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calc()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Calc() {
    Column() {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "test",
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(80.dp),
                fontSize = 60.sp,
                textAlign = TextAlign.End,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(1f)
        ) {
            Column(modifier = Modifier.fillMaxHeight(1f)) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AddButton(i = "C")
                    AddButton(i = "del")
                    AddButton(i = "%")
                    AddButton(i = "/")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceAround
                )
                {
                    AddButton(i = "7")
                    AddButton(i = "8")
                    AddButton(i = "9")
                    AddButton(i = "*")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize(1f),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    AddButton(i = "4")
                    AddButton(i = "5")
                    AddButton(i = "6")
                    AddButton(i = "-")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    AddButton(i = "1")
                    AddButton(i = "2")
                    AddButton(i = "3")
                    AddButton(i = "+")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    AddButton(i = "+/-")
                    AddButton(i = "0")
                    AddButton(i = ".")
                    AddButton(i = "=")
                }

            }
        }
    }

}

@Composable
fun AddButton(i: String) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(4.dp)
            .fillMaxHeight(1f),
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(
            text = i,
            fontSize = 30.sp,
            modifier = Modifier.width(42.dp),
            textAlign = TextAlign.Center
        )
    }
}

//@Composable
//fun TimesTable() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize(1f)
//    ) {
//        for (i in 1 until 10) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth(1f)
//                    .weight(1f)
//            ) {
//                for (j in 1 until 10) {
//                    val color = if ((j + i) % 2 == 0) {
//                        Color.Yellow
//                    } else {
//                        Color.White
//                    }
//                    Box(
//                        modifier = Modifier
//                            .fillMaxHeight(1f)
//                            .weight(1f)
//                            .border(width = 1.dp, color = Color.DarkGray)
//                            .background(color = color),
//                        contentAlignment = Alignment.Center
//                    )
//                    {
//                        Text(text = "${i * j}")
//                    }
//                }
//            }
//        }
//    }
//}
//
