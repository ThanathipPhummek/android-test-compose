package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify3Screen() {
    val scrollState = rememberScrollState()
    Column {
        Box(
            modifier = Modifier
                .padding(0.dp)
                .width(411.dp)
                .height(64.dp)
                .background(color = Color(0xFFEADDFF))
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .padding(vertical = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_qualify_3_back),
                    contentDescription = "",
                    tint = Color(0xFF21005D),
                )
                Text(
                    text = "John Doe",
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 28.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF21005D),
                        letterSpacing = 0.5.sp,
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 4.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.ic_qualify_3_copy),
                    contentDescription = "",
                    tint = Color(0xFF21005D),
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_qualify_3_calendar),
                    contentDescription = "",
                    tint = Color(0xFF21005D),
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_qualify_3_menu),
                    contentDescription = "",
                    tint = Color(0xFF21005D),

                    )
            }
        }
        Row(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .horizontalScroll(scrollState)
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_qualify_1_profile),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFF6750A4),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .clip(RoundedCornerShape(16.dp))
                    .width(160.dp)
                    .height(320.dp),
            )
            Image(
                painter = painterResource(id = R.drawable.img_qualify_3_photo_2),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFFEADDFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .clip(RoundedCornerShape(16.dp))
                    .width(160.dp)
                    .height(320.dp),
            )
            Image(
                painter = painterResource(id = R.drawable.img_qualify_3_photo_3),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFFEADDFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .clip(RoundedCornerShape(16.dp))
                    .width(160.dp)
                    .height(320.dp),
            )
        }
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFF6750A4),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .width(68.dp)
                    .height(32.dp)
            ) {
                Text(
                    text = "Tag 1",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF6750A4),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.1.sp,
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFF79747E),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .width(68.dp)
                    .height(32.dp)
            ) {
                Text(
                    text = "Tag 2",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF79747E),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.1.sp,
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFF79747E),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .width(68.dp)
                    .height(32.dp)
            ) {
                Text(
                    text = "Tag 3",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF79747E),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.1.sp,
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFF79747E),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .width(68.dp)
                    .height(32.dp)
            ) {
                Text(
                    text = "Tag 4",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF79747E),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.1.sp,
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(top = 16.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE7E0EC),
                    shape = RoundedCornerShape(size = 16.dp)
                )
                .width(379.dp)
                .height(96.dp)
                .background(color = Color(0xFFFEF7FF), shape = RoundedCornerShape(size = 16.dp))
        ) {
            Row(modifier = Modifier.padding(top = 16.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_3_sender),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .width(48.dp)
                        .height(48.dp)
                        .clip(RoundedCornerShape(100.dp))
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .padding(end = 16.dp)
                ) {
                    Text(
                        text = "Lorem Ipsum",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF1D1B20),
                        ),
                    )
                    Text(
                        text = "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo consectetur. Sed congue blandit nibh.",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF49454F),
                            letterSpacing = 0.3.sp,
                        ),
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(top = 16.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE7E0EC),
                    shape = RoundedCornerShape(size = 16.dp)
                )
                .width(379.dp)
                .height(96.dp)
                .background(color = Color(0xFFFEF7FF), shape = RoundedCornerShape(size = 16.dp))
        ) {
            Row(modifier = Modifier.padding(top = 16.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_3_sender),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .width(48.dp)
                        .height(48.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .padding(end = 16.dp)
                ) {
                    Text(
                        text = "Lorem Ipsum",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF1D1B20),
                        ),
                    )
                    Text(
                        text = "Morbi sed sagittis justo, at pulvinar ipsum. Praesent massa metus, interdum at suscipit a, interdum vel orci. Pellentesque in sapien. Integer faucibus mauris ac luctus aliquam accumsan.",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF49454F),
                            letterSpacing = 0.3.sp,
                        ),
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(top = 16.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE7E0EC),
                    shape = RoundedCornerShape(size = 16.dp)
                )
                .width(379.dp)
                .height(96.dp)
                .background(color = Color(0xFFFEF7FF), shape = RoundedCornerShape(size = 16.dp))
        ) {
            Row(modifier = Modifier.padding(top = 16.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_3_sender),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .width(48.dp)
                        .height(48.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .padding(end = 16.dp)
                ) {
                    Text(
                        text = "Lorem Ipsum",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF1D1B20),
                        ),
                    )
                    Text(
                        text = "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo.",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF49454F),
                            letterSpacing = 0.3.sp,
                        ),
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(vertical = 16.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE7E0EC),
                    shape = RoundedCornerShape(size = 16.dp)
                )
                .width(379.dp)
                .height(96.dp)
                .background(color = Color(0xFFFEF7FF), shape = RoundedCornerShape(size = 16.dp))
        ) {
            Row(modifier = Modifier.padding(top = 16.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_3_sender),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .width(48.dp)
                        .height(48.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .padding(end = 16.dp)
                ) {
                    Text(
                        text = "Lorem Ipsum",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF1D1B20),
                        ),
                    )
                    Text(
                        text = "Ut hendrerit neque nec accumsan hendrerit. Fusce lobortis rhoncus erat, a blandit nibh molestie vel. Cras commodo ligula ex, vitae venenatis lacus facilisis eget.",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF49454F),
                            letterSpacing = 0.3.sp,
                        ),
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify3ScreenPreview() = AppTheme {
    Qualify3Screen()
}
// endregion