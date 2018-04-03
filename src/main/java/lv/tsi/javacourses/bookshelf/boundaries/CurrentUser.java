package lv.tsi.javacourses.bookshelf.boundaries;

import lv.tsi.javacourses.bookshelf.entities.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

@SessionScoped
@Named
public class CurrentUser implements Serializable {


    @PersistenceContext
    private EntityManager em;
    private Long userId;
    private User signedInUser;
    private String email;
    private String password;



    @Transactional
    public void signIn() {
        userId = -1L;
        signedInUser = em.find(User.class, userId);

    }
    public boolean isSignedIn() {
        return userId != null;
    }
    public void signOut() {
        userId = null;
        signedInUser = null;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User getSignedInUser() {
        return signedInUser;
    }
}
