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

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.data.Panda

class MainViewModel : ViewModel() {
    val pandas by mutableStateOf(
        listOf(
            Panda(
                "贝贝(Beibei)", "四川(Sichuang)",
                "2岁(2 years old)", "男孩(Boy)", "一只阳光可爱的小熊猫，会自己找吃的，会自己上厕所，并且会爬树，爬的老高了，就是经常掉下来摔屁股",
                R.drawable.panda_beibei
            ),
            Panda(
                "晶晶(Jingjing)",
                "四川(Sichuang)",
                "2岁半(2.5 years old)",
                "女孩(Girl)",
                "胖嘟嘟的小脸儿，还有两个小酒窝呢，笑起来迷死个人，最喜欢吐舌头洗脸，可爱美了。但，这其实是个女汉子，静若处子动若脱兔。",
                R.drawable.panda_jingjing
            ),
            Panda(
                "欢欢(Huanhuan)",
                "四川(Sichuang)",
                "2岁(2 years old)",
                "男孩(Boy)",
                "胖嘟嘟的小脸儿，还有两个小酒窝呢，笑起来迷死个人，最喜欢吐舌头洗脸，可爱美了。但，这其实是个女汉子，静若处子动若脱兔。",
                R.drawable.panda_huanhuan
            ),
            Panda(
                "迎迎(Yingying)",
                "四川(Sichuang)",
                "2岁半(2.5 years old)",
                "男孩(Boy)",
                "一只阳光可爱的小熊猫，会自己找吃的，会自己上厕所，并且会爬树，爬的老高了，就是经常掉下来摔屁股",
                R.drawable.panda_yingying
            ),
            Panda(
                "妮妮(Nini)",
                "四川(Sichuang)",
                "2岁(2 years old)",
                "女孩(Girl)",
                "胖嘟嘟的小脸儿，还有两个小酒窝呢，笑起来迷死个人，最喜欢吐舌头洗脸，可爱美了。但，这其实是个女汉子，静若处子动若脱兔。",
                R.drawable.panda_nini
            ),
            Panda(
                "圆圆(Yuanyuan)",
                "四川(Sichuang)",
                "三岁",
                "男孩(Boy)",
                "一只阳光可爱的小熊猫，会自己找吃的，会自己上厕所，并且会爬树，爬的老高了，就是经常掉下来摔屁股",
                R.drawable.panda_yuanyuan
            ),
            Panda(
                "达达(Dada)",
                "四川(Sichuang)",
                "半岁",
                "男孩(Boy)",
                "一只阳光可爱的小熊猫，会自己找吃的，会自己上厕所，并且会爬树，爬的老高了，就是经常掉下来摔屁股",
                R.drawable.panda_dada
            ),
            Panda(
                "美美(Meimei)",
                "四川(Sichuang)",
                "6个月",
                "女孩(Girl)",
                "胖嘟嘟的小脸儿，还有两个小酒窝呢，笑起来迷死个人，最喜欢吐舌头洗脸，可爱美了。但，这其实是个女汉子，静若处子动若脱兔。",
                R.drawable.panda_meimei
            ),
        )
    )

    var currentPanda: Panda? by mutableStateOf(null)

    fun showPanda(panda: Panda) {
        currentPanda = panda
    }

    fun closePanda() {
        currentPanda = null
    }
}
