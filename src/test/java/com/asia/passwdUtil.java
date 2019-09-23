package com.asia;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * @author WangBaoQiang
 * @ClassName: passwdUtil
 * @description: TODO
 * @date 2019/9/1820:29
 * @Version 1.0
 */
public class passwdUtil {public static void main(String[] args) throws Exception {
    //密码明文
    String password = "b7y#PkZ!iJUX";

    System.out.println("密码[ "+password+" ]的加密信息如下：\n");

    String [] keyPair = ConfigTools.genKeyPair(512);
    //私钥
    String privateKey = keyPair[0];
    //公钥
    String publicKey = keyPair[1];
    //用私钥加密后的密文
    password = ConfigTools.encrypt(privateKey, password);

    System.out.println("privateKey:"+privateKey);
    System.out.println("publicKey:"+publicKey);
    System.out.println("password:"+password);
    String decryptPassword=ConfigTools.decrypt(publicKey, password);
    System.out.println("decryptPassword："+decryptPassword);

}
}
