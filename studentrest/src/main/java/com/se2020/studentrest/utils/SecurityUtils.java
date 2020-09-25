package com.se2020.studentrest.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class SecurityUtils {
    public static String hashPassword(String password) {
        String ret = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digested = md.digest();
            ret = DatatypeConverter.printHexBinary(digested).toUpperCase();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return ret;
    }
}
