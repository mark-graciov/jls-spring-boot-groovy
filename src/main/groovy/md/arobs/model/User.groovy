package md.arobs.model

import groovy.transform.CompileStatic

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * User model example
 * Created by MG
 */
@Entity
class User {

    @Id
    @GeneratedValue
    Long id
    String name
    String password
    String email
}
