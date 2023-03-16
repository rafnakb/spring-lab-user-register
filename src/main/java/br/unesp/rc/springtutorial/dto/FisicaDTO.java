package br.unesp.rc.springtutorial.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FisicaDTO {
    private String usuario;
    private String senha;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;
    private String nome;
    private String cpf;
    @JsonFormat(pattern = "yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date dataNascimento;
    private List<EnderecoDTO> endereco;

    public FisicaDTO() {
        this.endereco = new ArrayList<>();
    }

    public FisicaDTO(String usuario, String senha, String telefoneResidencial, String telefoneComercial,
                     String celular, String email, String nome, String cpf, Date dataNascimento,
                     List<EnderecoDTO> endereco) {
        this.usuario = usuario;
        this.senha = senha;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;
        this.celular = celular;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
