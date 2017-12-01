package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController("/cred")
public class PrincipalController {
//    private final PrincipalRepository principalRepository;
//
//    @Autowired
//    public PrincipalController(PrincipalRepository principalRepository) {
//        this.principalRepository = principalRepository;
//    }
//
//    @PostMapping
//    public Principal principal() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth != null) {
//            Assert.isTrue(!(auth instanceof AnonymousAuthenticationToken), "Anonymous access is not allowed");
//            return principalRepository.findById((String) auth.getPrincipal());
//        }
//        return null;
//    }
}
