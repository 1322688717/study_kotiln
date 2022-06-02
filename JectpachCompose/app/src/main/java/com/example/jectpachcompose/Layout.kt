package com.example.jectpachcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jectpachcompose.ui.theme.JectpachComposeTheme

class Layout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("android","jectpach"))
        }
    }

    data class  Message(val author : String,val  body:String)

    @Composable
    fun MessageCard(msg: Message){

        //row  水平布局
        Row (modifier = Modifier.padding(all = 8.dp)){
            Image(
                painter = painterResource(id = R.drawable.head_img),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))

            //Column竖直向下
            Column() {
                Text(text = msg.author)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = msg.body)
            }
        }

    }

    @Preview
    @Composable
    fun PreviewMessageCard(){
        MessageCard(
            msg = Message("Colleague","hey,take a look at jetpach compose,it's great!")
        )
    }
}