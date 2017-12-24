package io.github.android.shoppingapp.repositories

import io.github.android.shoppingapp.models.User
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource  interface UserRepository : CrudRepository<User, Int>