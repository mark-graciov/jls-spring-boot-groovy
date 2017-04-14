package md.arobs.rest

import md.arobs.model.User
import md.arobs.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

/**
 * User Main Controller example
 * Created by MG
 */
@RestController
class UserController {

    UserRepo userRepo

    /**
     * Inject dependencies here
     * @param userRepo This is our connection to the database
     */
    @Autowired
    UserController(UserRepo userRepo) {
        this.userRepo = userRepo

        createMockUser()
    }

    /**
     * Create a mock user to have a meaningful response
     * @return
     */
    def createMockUser() {
        def user = new User(name: "Markusha", password: "karkusha", email: "markusha.karkusha@mail.com")
        userRepo.save(user)
    }

    /**
     * @return All Users in our db
     */
    @GetMapping('/users')
    @Transactional(readOnly = true)
    def users() {
        return userRepo.findAll()
    }

    /**
     *  Saves a user in db
     * @param user YOu should give it the user to save, don't you think?
     */
    @PutMapping('/add-uer')
    @Transactional
    def addUser(User user) {
        if (user.id != null) user.id = null
        userRepo.save(user)
    }

}
