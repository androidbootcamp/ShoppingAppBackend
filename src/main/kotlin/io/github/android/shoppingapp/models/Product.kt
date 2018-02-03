package io.github.android.shoppingapp.models

import javax.persistence.*

@Entity
@Table(name = "products")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0
    var name: String? = null
    var description: String? = null
    @Column(name = "image_url")
    private var imageUrl: String? = null
    @Column(name = "image_thumbnail_url")
    private var imageThumbnailUrl: String? = null

}