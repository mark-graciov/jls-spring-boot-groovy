package md.arobs.repo

import md.arobs.model.User
import org.springframework.data.repository.CrudRepository

/**
 * User model Spring Data CRUD Repo
 * Created by MG
 */
interface UserRepo extends CrudRepository<User, Long> {
}
