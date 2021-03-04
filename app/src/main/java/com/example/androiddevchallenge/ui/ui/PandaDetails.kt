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
package com.example.androiddevchallenge.ui.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.data.Panda
import com.example.androiddevchallenge.ui.ui.theme.buttonBg

@Composable
fun PandaDetails(panda: Panda, onAdopt: (Panda) -> Unit = {}) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
            .verticalScroll(rememberScrollState())
    ) {
        Box {
            Image(
                painterResource(panda.picture),
                "Panda picture: ${panda.name}",
                Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Button(
                { onAdopt(panda) },
                Modifier
                    .align(Alignment.BottomEnd)
                    .padding(10.dp)
                    .background(buttonBg)
                    .requiredSize(80.dp)
                    .clip(shape = CircleShape)
            ) {
                Text(text = "Adopt")
            }
        }
        Column(Modifier.padding(16.dp, 8.dp)) {
            Text("姓名: ${panda.name}", style = MaterialTheme.typography.h3)
            ProvideTextStyle(MaterialTheme.typography.h6) {
                Text("住址: ${panda.location}", Modifier.padding(top = 5.dp))
                Text("年龄: ${panda.age}", Modifier.padding(top = 5.dp))
                Text("性别: ${panda.gender}", Modifier.padding(top = 5.dp))
                Text("简介: ${panda.introduction}", Modifier.padding(top = 5.dp))
            }
        }
    }
}

@Preview
@Composable
fun PandaDetailsPreview() {
    PandaDetails(
        Panda(
            "贝贝(Beibei)",
            "四川(Sichuang)",
            "2岁(2 years old)",
            "男孩(Boy)",
            "一只阳光可爱的小熊猫，会自己找吃的，会自己上厕所，并且会爬树，爬的老高了，就是经常掉下来摔屁股",
            R.drawable.panda_beibei
        )
    )
}
