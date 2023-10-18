package projetoestacionamento.Java.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_numberAccess")
public class NumberAccess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberAccess;
    public Long getNumberAccess() {
        return numberAccess;
    }
    public void setNumberAccess(Long numberAccess) {
        this.numberAccess = numberAccess;
    }
}
