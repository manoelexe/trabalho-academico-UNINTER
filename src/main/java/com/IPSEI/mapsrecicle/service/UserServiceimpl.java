package com.IPSEI.mapsrecicle.service;
import com.IPSEI.mapsrecicle.model.User;
import com.IPSEI.mapsrecicle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class UserServiceimpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
    @Override
    public User update(User user) {
        return userRepository.save(user);
    }
    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }  
}
