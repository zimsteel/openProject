package com.orders.tableorder.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JasyptConfigDESTest {

        public static void main(String[] args) {
            StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
            pbeEnc.setAlgorithm("PBEWithMD5AndDES");
            pbeEnc.setPassword("password");
            String enc = pbeEnc.encrypt("");
              System.out.println("enc = " + enc);
            String des = pbeEnc.decrypt(enc);
              System.out.println("des = " + des);
        }
}
