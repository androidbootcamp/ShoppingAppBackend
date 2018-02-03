package io.github.android.shoppingapp.controllers

import io.github.android.shoppingapp.models.Product
import io.github.android.shoppingapp.repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.webmvc.RepositoryRestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@RepositoryRestController
@RequestMapping("/products")
class ProductController @Autowired constructor(private val productRepository: ProductRepository) {

    @RequestMapping(method = arrayOf(RequestMethod.GET), produces = arrayOf("application/json; charset=UTF-8"))
    @ResponseBody fun products(): Iterable<Product>? {
        return productRepository.findAll()
    }

}