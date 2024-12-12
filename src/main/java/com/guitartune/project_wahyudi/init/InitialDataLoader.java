package com.guitartune.project_wahyudi.init;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.guitartune.project_wahyudi.constant.RoleConstant;
import com.guitartune.project_wahyudi.models.Category;
import com.guitartune.project_wahyudi.models.Role;
import com.guitartune.project_wahyudi.models.User;
import com.guitartune.project_wahyudi.repositorys.CategoryRepository;
import com.guitartune.project_wahyudi.repositorys.RoleRepository;
import com.guitartune.project_wahyudi.repositorys.UserRepository;

@Component
public class InitialDataLoader implements ApplicationRunner{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (roleRepository.findAll().isEmpty()) {
            Role admin = new Role(null, "ADMIN");
            Role user = new Role(null, "USER");
            roleRepository.saveAll(List.of(admin,user));
        }

        if (userRepository.findAll().isEmpty()) {
            User admin = new User();
            admin.setUsername("Wahyudi");
            admin.setEmail("wahyudi123@gmail.com");
            admin.setPhoneNumber("081234567890");
            admin.setPassword(passwordEncoder.encode("12345"));
            admin.setSaldo(0L);
            admin.setRole(roleRepository.findRoleByRoleName(RoleConstant.ROLE_ADMIN));
            userRepository.save(admin);
        }

        if (categoryRepository.findAll().isEmpty()) {
            Category acoustic = new Category(null, "Acoustic");
            Category electric = new Category(null, "Electric");
            Category bass = new Category(null, "Bass");
            categoryRepository.saveAll(List.of(acoustic, electric, bass)); 
        }
    }
    
}
