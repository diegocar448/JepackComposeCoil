package org.stack.projetodeteste


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.ImageLoader
import coil3.compose.AsyncImage
import coil3.compose.setSingletonImageLoaderFactory
import coil3.request.crossfade
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

    //manter as imagens carregadas em cache
    setSingletonImageLoaderFactory { context ->
        ImageLoader.Builder(context).crossfade(true).build()
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
                AsyncImage(
                    model = photo.url,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth().padding(5.dp).clip(
                        RoundedCornerShape(15.dp)
                    ).aspectRatio(2 / 3f).clickable {

                    }
                )
            }
        }
    }
}