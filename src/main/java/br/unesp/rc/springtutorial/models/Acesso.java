package br.unesp.rc.springtutorial.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Acesso implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "acesso_usuario", unique = true)
    private String usuario;

    @Column(name = "acesso_senha")
    private String senha;

    public Acesso() {
    }
}
