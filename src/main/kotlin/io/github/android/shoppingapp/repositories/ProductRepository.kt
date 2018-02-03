package io.github.android.shoppingapp.repositories

import io.github.android.shoppingapp.models.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


interface ProductRepository : CrudRepository<Product, Int>