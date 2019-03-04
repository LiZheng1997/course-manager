package uk.ac.sheffield.coursemgr.common;

import uk.ac.sheffield.coursemgr.domain.pojo.User;

/**
 *
 */
public class UserThreadLocal {

    private static ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

    public static void setCurrentUser(User user) {
        userThreadLocal.set(user);
    }

    public static User getCurrentUser() {
        return userThreadLocal.get();
    }

    public static void removeCurrentUser() {
        userThreadLocal.remove();
    }

}
