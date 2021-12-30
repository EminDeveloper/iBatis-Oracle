package com.example.ibatisoracle.mapper;

import com.example.ibatisoracle.entity.Order;
import com.example.ibatisoracle.entity.UserSession;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface BatisMapper {

    /*  Save User Session  */
    @Insert("INSERT INTO TXPG_USER_SES \n " +
            "(BROWSERLANGUAGE, BROWSERUSERAGENT, SESSIONID, STARTTIME, STATUS) \n " +
            " VALUES(#{browserLanguage, mode=IN, jdbcType=VARCHAR}, " +
            "#{browserUserAgent, mode=IN, jdbcType=VARCHAR}, " +
            "#{sessionId, mode=IN, jdbcType=VARCHAR}, " +
            "#{startTime, mode=IN, jdbcType=VARCHAR}, " +
            "#{status, mode=IN, jdbcType=VARCHAR}) \n")
    @Options(useGeneratedKeys = true, flushCache= Options.FlushCachePolicy.TRUE)
    void saveUserSession(UserSession session);

    /*  Save Order  */
    @Insert("INSERT INTO TXPG_ORDER \n " +
            "(USER_SESSION_ID, HPP_URL, ORDER_ID, STATUS, PASSWORD, AMOUNT, CURRENCY) \n " +
            " VALUES(#{userSessionId, mode=IN, jdbcType=VARCHAR}, " +
            "#{hppUrl, mode=IN, jdbcType=VARCHAR}, " +
            "#{orderId, mode=IN, jdbcType=VARCHAR}, " +
            "#{status, mode=IN, jdbcType=VARCHAR}, " +
            "#{password, mode=IN, jdbcType=VARCHAR}, " +
            "#{amount, mode=IN, jdbcType=VARCHAR}, " +
            "#{currency, mode=IN, jdbcType=VARCHAR}) \n")
    @Options(useGeneratedKeys = true, flushCache= Options.FlushCachePolicy.TRUE)
    void saveOrder(Order order);

    /*  Select Order by User Session Id */
    @Select("SELECT * \n" +
            "FROM TXPG_ORDER \n" +
            "WHERE USER_SESSION_ID = #{session}")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    Order findOrderByUserSession(@Param("session") String session);

}
