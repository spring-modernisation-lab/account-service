package com.example.account;

import com.example.platform.security.SecurityHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts")
    public String getAccounts() {
        return "Accounts - security "
            + SecurityHelper.getSecurityVersion();
    }
}
