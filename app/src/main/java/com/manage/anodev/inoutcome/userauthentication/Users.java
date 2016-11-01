package com.manage.anodev.inoutcome.userauthentication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by GEEKS 1 on 10/28/2016.
 */

public class Users {
    @SerializedName("users")
    public List<UserItem> users;
    public List<UserItem> getUsers() { return users; }
    public void setUsers(List<UserItem> users) { this.users = users; }
    public Users(List<UserItem> users) { this.users = users; }

    @SerializedName("user")
    private String email;
    private String password;


    public class UserItem {

        private int id;

        private String email;

        private String password;



        public int getId() {

            return id;

        }

        public void setId(int id) {

            this.id = id;

        }

        public String getEmail() {

            return email;

        }

        public void setEmail(String email) {

            this.email = email;

        }

        public String getPassword() {

            return password;

        }

        public void setPassword(String password) {

            this.password = password;

        }

    }



    public Users() {
    }

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
