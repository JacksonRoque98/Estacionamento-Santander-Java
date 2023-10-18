package projetoestacionamento.Java.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String cpf;
    @OneToOne(cascade = CascadeType.ALL)
    private Car car;
    @OneToOne(cascade = CascadeType.ALL)
    private NumberAccess numberAccess;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public NumberAccess getNumberAccess() {
        return numberAccess;
    }
    public void setNumberAccess(NumberAccess numberAccess) {
        this.numberAccess = numberAccess;
    }
}
