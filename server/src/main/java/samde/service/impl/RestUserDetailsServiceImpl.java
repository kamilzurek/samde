package samde.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import samde.model.User;
import samde.repository.UserRepository;

@Service("restUserDetailsService")
@Transactional
public class RestUserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public RestUserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =
                userRepository.findByUsername(username).orElseThrow(() -> new IllegalStateException("no username " + username));
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(), user.getPassword(), AuthorityUtils.NO_AUTHORITIES);
    }

}
