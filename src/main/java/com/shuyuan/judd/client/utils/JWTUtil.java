package com.shuyuan.judd.client.utils;

import com.shuyuan.judd.client.model.merchant.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;

public class JWTUtil {
    public static final String SUBJECT = "judd";
    public static final long EXPIRE = 1000 * 60 * 60 * 24 * 7;  //过期时间，毫秒，一周
    public static final String ID = "id";
    public static final String USER_NAME = "username";
    public static final String MERCHANT_NO = "merchantno";
    public static final String ROLES = "roles";
    public static final String NAME = "name";
    private static final Logger logger = LoggerFactory.getLogger(JWTUtil.class);

    /**
     * 生成jwt
     *
     * @param user
     * @return
     */
    public static String createToken(User user, PrivateKey privateKey) {

        if (user == null || user.getId() == null || user.getUserName() == null
                || user.getMerchantNo() == null || user.getRoles() == null) {
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT)
                .claim(ID, user.getId())
                .claim(USER_NAME, user.getUserName())
                .claim(MERCHANT_NO, user.getMerchantNo())
                .claim(ROLES, user.getRoles())
                .claim(NAME, user.getName())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.RS256, privateKey).compact();

        return token;
    }


    /**
     * 校验token
     *
     * @param token
     * @return
     */
    public static Claims checkJWT(String token, PublicKey publicKey) {

        try {
            final Claims claims = Jwts.parser().setSigningKey(publicKey).
                    parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception e) {
        }
        return null;

    }

    /**
     * 校验token，并从token中获取基本user信息包含id，username，merchantno和roles
     */
    public static User getUserFromJWT(String token, PublicKey publicKey) {
        Claims claims = checkJWT(token, publicKey);
        User user = null;
        if (claims != null) {
            user = new User();
            user.setId(Long.parseLong(claims.get(JWTUtil.ID).toString()));
            user.setUserName(claims.get(JWTUtil.USER_NAME).toString());
            user.setMerchantNo(claims.get(JWTUtil.MERCHANT_NO).toString());
            user.setRoles(claims.get(JWTUtil.ROLES).toString());
            logger.debug("the token's user is {}", user);
        }
        return user;
    }
}
