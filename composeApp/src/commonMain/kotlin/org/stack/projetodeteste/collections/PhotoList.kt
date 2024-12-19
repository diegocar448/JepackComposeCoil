package org.stack.projetodeteste.collections

import org.stack.projetodeteste.model.Photo

class PhotoList {

    fun getPhotos(
        response: (MutableList<Photo>) -> Unit
    ){
        val photoList: MutableList<Photo> = mutableListOf(
            Photo(
                url = "https://img.freepik.com/fotos-premium/jaguar-perseguindo-na-grama-close-de-um-jaguar_372999-9989.jpg?w360"
            ),
            Photo(
                url = "https://avesornamentaisjej.cdn.magazord.com.br/img/2024/03/produto/488/84-tucano-toco-3.png?ims=600x600"
            ),
            Photo(
                url = "https://designi.com.br/images/preview/11452593.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-premium/pinguinos-nadando-mar_960396-583952.jpg"
            ),
            Photo(
                url = "https://almadeviajante.com/wp-content/uploads/veneza-grand-canal-1024x682.jpg"
            ),
            Photo(
                url = "https://www.machupicchupacotes.com/wp-content/uploads/2023/08/machu-picchu-peru.webp"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-premium/as-piramides-de-gize-no-deserto-do-egito_400112-811.jpg"
            ),
            Photo(
                url = "https://www.papeldeparede.etc.br/fotos/wp-content/uploads/1440_white-winter-wallpaper.jpeg"
            ),
            Photo(
                url = "https://certifiedhumanebrasil.org/wp-content/uploads/2018/10/Galinhas-Poedeiras.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-gratis/vista-de-um-luxuoso-navio-de-cruzeiro_23-2150785234.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-gratis/estadio-de-futebol-cheio-de-gente_23-2151548530.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-gratis/vista-de-gatos-e-caes-mostrando-amizade_23-2151806280.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-premium/jaguar-perseguindo-na-grama-close-de-um-jaguar_372999-9989.jpg?w360"
            ),
            Photo(
                url = "https://avesornamentaisjej.cdn.magazord.com.br/img/2024/03/produto/488/84-tucano-toco-3.png?ims=600x600"
            ),
            Photo(
                url = "https://designi.com.br/images/preview/11452593.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-premium/pinguinos-nadando-mar_960396-583952.jpg"
            ),
            Photo(
                url = "https://almadeviajante.com/wp-content/uploads/veneza-grand-canal-1024x682.jpg"
            ),
            Photo(
                url = "https://www.machupicchupacotes.com/wp-content/uploads/2023/08/machu-picchu-peru.webp"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-premium/as-piramides-de-gize-no-deserto-do-egito_400112-811.jpg"
            ),
            Photo(
                url = "https://www.papeldeparede.etc.br/fotos/wp-content/uploads/1440_white-winter-wallpaper.jpeg"
            ),
            Photo(
                url = "https://certifiedhumanebrasil.org/wp-content/uploads/2018/10/Galinhas-Poedeiras.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-gratis/vista-de-um-luxuoso-navio-de-cruzeiro_23-2150785234.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-gratis/estadio-de-futebol-cheio-de-gente_23-2151548530.jpg"
            ),
            Photo(
                url = "https://img.freepik.com/fotos-gratis/vista-de-gatos-e-caes-mostrando-amizade_23-2151806280.jpg"
            )
        )
        response(photoList)
    }
}