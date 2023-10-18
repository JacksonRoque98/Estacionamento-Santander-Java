package projetoestacionamento.Java.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoestacionamento.Java.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
