package org.stack.projetodeteste


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.stack.projetodeteste.collections.PhotoList
import org.stack.projetodeteste.model.Photo

@Composable
@Preview
fun App() {

    var photoList by remember { mutableStateOf(mutableListOf<Photo>()) }
    var photo = PhotoList()

    LaunchedEffect(Unit){
        photo.getPhotos { list ->
            photoList = list
        }
    }


    Column(
        modifier = Modifier.fillMaxSize().background(Color.LightGray)
    ) {
        Text(
            text = "Galeria de Fotos",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp).align(Alignment.CenterHorizontally)

        )

        LazyVerticalGrid(
            columns = GridCells.Adaptive(120.dp),
            contentPadding = PaddingValues(10.dp)
        ){
            itemsIndexed(photoList){ position, photo ->

            }
        }
    }
}