package com.dianti.convertsuhu;

// koneksi ke database

public class AppVar {
    //URL to our login.php file, url bisa diganti sesuai dengan alamat server kita
    public static final String LOGIN_URL = "http://192.168.43.84/diantidb/login.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //This would be used to store the email of current logged in user
    public static final String EMAIL_SHARED_PREF = "email";


    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "home";


}
