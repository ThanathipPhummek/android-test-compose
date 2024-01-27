package com.github.thailandandroiddeveloper.common.ui.screen.qualify2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify2Screen() {
    Column {
        Row {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Skip",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF6750A4),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.1.sp,
                ),
                modifier = Modifier
                    .padding(top = 18.dp)
                    .padding(bottom = 10.dp)
                    .padding(horizontal = 24.dp)
            )
        }
        Text(
            text = "Lorem ipsum dolor sit amet",
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF1D1B20),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            ),
            modifier = Modifier
                .padding(top = 16.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec egestas dictum lacinia. Integer arcu neque, porttitor ac metus quis, iaculis molestie magna. Vivamus molestie justo sed nulla lacinia, quis fringilla lorem imperdiet. Proin in quam vel odio iaculis fringilla",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF1D1B20),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            ),
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 32.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.img_qualify_2_onboard),
            contentDescription = "",
            modifier = Modifier
                .padding(horizontal = 32.dp)
                .padding(top = 35.2.dp)
        )
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 36.dp)
                .padding(bottom = 48.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
                    .background(color = Color(0xFFEADDFF), shape = CircleShape)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Box(
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
                    .background(color = Color(0xFFEADDFF), shape = CircleShape)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Box(
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
                    .background(color = Color(0xFFEADDFF), shape = CircleShape)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Box(
                modifier = Modifier
                    .width(32.dp)
                    .height(16.dp)
                    .background(color = Color(0xFF6750A4), shape = CircleShape)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Box(
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
                    .background(color = Color(0xFFEADDFF), shape = CircleShape)
            )
        }
        Box(
            modifier = Modifier
                .width(411.dp)
                .height(102.dp)
                .background(color = Color(0xFFEADDFF))
        ) {
            Box(
                modifier = Modifier
                    .width(253.dp)
                    .height(40.dp)
                    .background(color = Color(0xFF6750A4), shape = CircleShape)
                    .align(Alignment.Center)
            ) {
                Text(
                    text = "Next",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.1.sp,
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify2ScreenPreview() = AppTheme {
    Qualify2Screen()
}
// endregion