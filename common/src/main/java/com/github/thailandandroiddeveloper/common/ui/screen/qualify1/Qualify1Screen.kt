package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify1Screen() {
    Box {
        Column {
            Box(
                modifier = Modifier
                    .padding(0.dp)
                    .width(411.dp)
                    .height(64.dp)
                    .background(color = Color(0xFFEADDFF))
                    .padding(start = 4.dp, top = 8.dp, end = 4.dp, bottom = 8.dp)
            ) {
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_qualify_1_menu),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_qualify_1_profile),
                        contentDescription = "",
                        modifier = Modifier.padding(end = 0.8.dp)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp)
                    .padding(bottom = 72.dp)
                    .clip(RoundedCornerShape(16.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_1_profile),
                    contentDescription = "",
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                )
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .alpha(0.75f)
                        .width(379.dp)
                        .height(192.dp)
                        .background(
                            color = Color(0xFF6750A4),
                            shape = RoundedCornerShape(size = 0.dp)
                        )

                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .padding(start = 20.dp)
                    ) {
                        Text(
                            text = "John Doe",
                            style = TextStyle(
                                fontSize = 28.sp,
                                lineHeight = 36.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 0.02.em,
                            ),
                        )
                        Row(modifier = Modifier.padding(top = 8.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_qualify_1_gender_male),
                                contentDescription = "",
                                tint = Color.White,
                            )
                            Text(
                                text = "Male",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    lineHeight = 20.sp,
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFFFFFFFF),
                                    letterSpacing = 0.25.sp,
                                ),
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                        Text(
                            text = "Lorem ipsum dolor sit amet, cd nulla lacinia, quis fringilla lorem imperdiet. Proin in quam vel odio iaculis fringilla.",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 0.5.sp,
                            ),
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }
            }
        }
        Row(modifier = Modifier.align(Alignment.BottomStart)) {
            Box(
                modifier = Modifier
                    .padding(bottom = 48.dp)
                    .padding(start = 64.dp)
                    .width(120.dp)
                    .height(48.dp)
                    .background(
                        color = Color(0xFFF9DEDC),
                        shape = RoundedCornerShape(size = 100.dp)
                    )

            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_qualify_1_thumb_down),
                    contentDescription = "",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Box(
                modifier = Modifier
                    .padding(bottom = 48.dp)
                    .padding(start = 43.dp)
                    .width(120.dp)
                    .height(48.dp)
                    .background(
                        color = Color(0xFFEADDFF),
                        shape = RoundedCornerShape(size = 100.dp)
                    )

            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_qualify_1_thumb_up),
                    contentDescription = "",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(start = 0.5.dp)
                )
            }
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify1ScreenPreview() = AppTheme {
    Qualify1Screen()
}
// endregion