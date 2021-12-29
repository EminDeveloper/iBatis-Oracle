package com.example.ibatisoracle.mapper;

import com.example.ibatisoracle.entity.UserSession;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BatisMapper {

    @Select("select * \n" +
            "from TXPG_USER_SESSION \n" +
            "where SESSIONID = #{session}")
    UserSession findUserSession(@Param("session") String session);



    @Insert("INSERT INTO TXPG_USER_SESSION\n" +
            "(BROWSERLANGUAGE, BROWSERUSERAGENT, SESSIONID, STATUS)\n" +
            " VALUES(#{browserLanguage, mode=IN, jdbcType=VARCHAR}, " +
            "#{browserUserAgent, mode=IN, jdbcType=VARCHAR}, " +
            "#{sessionId, mode=IN, jdbcType=VARCHAR}, " +
            "#{status, mode=IN, jdbcType=VARCHAR}) \n")
    @Options(useGeneratedKeys = true, flushCache= Options.FlushCachePolicy.TRUE)
    public Integer saveUserSession(UserSession session);


    void updateUserSession(UserSession session);


}
