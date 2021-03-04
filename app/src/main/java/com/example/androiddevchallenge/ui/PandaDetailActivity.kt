/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.data.Panda
import com.example.androiddevchallenge.ui.ui.PandaDetails
import com.example.androiddevchallenge.ui.ui.theme.purple500

/**
 * @classDescription:  描述：详情页
 * @author:  LiuChaoya
 * @createTime:  2021/3/4 10:06.
 * @email:  1090969255@qq.com
 */
class PandaDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val panda = intent.getParcelableExtra<Panda>(PANDA)
        if (panda == null) {
            Toast.makeText(this, "对不起,数据获取失败啦(Sorry,data obtain fail)", Toast.LENGTH_SHORT).show()
            finish()
            return
        }
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text(
                                text = panda.name,
                                color = Color.White
                            )
                        },
                        backgroundColor = purple500, elevation = 0.dp,
                        navigationIcon = {
                            IconButton(onClick = { finish() }) {
                                Image(
                                    painterResource(R.drawable.ic_back),
                                    "ic_back"
                                )
                            }
                        }
                    )
                }
            ) {
                PandaDetails(panda) {
                    Toast.makeText(
                        this,
                        "谢谢您，您已成功领养${panda.name}(Thanks.You have adopted ${panda.name})",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}