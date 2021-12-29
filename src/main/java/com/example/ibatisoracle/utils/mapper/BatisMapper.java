package com.example.ibatisoracle.utils.mapper;

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
            "(BROWSERLANGUAGE, BROWSERUSERAGENT, SESSIONID, STARTTIME, ENDTIME, STATUS)\n" +
            " values(#{browserLanguage}, #{browserUserAgent}, #{sessionId}, #{status}) \n")
    @Options(useGeneratedKeys = false, flushCache= Options.FlushCachePolicy.TRUE)
    int saveUserSession(UserSession session);


    void updateUserSession(UserSession session);


}
