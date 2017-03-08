package beans;

import entities.User;
import facade.UserFacade;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergy on 08-Mar-17.
 */

@Model
@Getter
@Setter
public class UserBean {

    @Inject
    private UserFacade facade;

    private List<User> userList = new ArrayList<>();

    @PostConstruct
    public void init() {
        userList = facade.findAllUsers();
    }




}
