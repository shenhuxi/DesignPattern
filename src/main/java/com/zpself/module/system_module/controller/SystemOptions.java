package com.zpself.module.system_module.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sys")
public class SystemOptions {
    private final SessionRegistry sessionRegistry;

    @Autowired
    public SystemOptions(SessionRegistry sessionRegistry) {
        this.sessionRegistry = sessionRegistry;
    }

    @GetMapping("/kick")
    @ResponseBody
    public String removeUserSessionByUsername(@RequestParam String username) {
        int count = 0;

        // 获取session中所有的用户信息
        List<Object> users = sessionRegistry.getAllPrincipals();
        for (Object principal : users) {
            if (principal instanceof User) {
                String principalName = ((User)principal).getUsername();
                if (principalName.equals(username)) {
                    // 参数二：是否包含过期的Session
                    List<SessionInformation> sessionsInfo = sessionRegistry.getAllSessions(principal, false);
                    if (null != sessionsInfo && sessionsInfo.size() > 0) {
                        for (SessionInformation sessionInformation : sessionsInfo) {
                            sessionInformation.expireNow();
                            count++;
                        }
                    }
                }
            }
        }
        return "操作成功，清理session共" + count + "个";
    }
}
