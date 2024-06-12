package dio.santander_dev_week_2024.service;

import dio.santander_dev_week_2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
