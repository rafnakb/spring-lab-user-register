package br.unesp.rc.springtutorial.dto.assembler;

import br.unesp.rc.springtutorial.dto.EnderecoDTO;
import br.unesp.rc.springtutorial.dto.FisicaDTO;
import br.unesp.rc.springtutorial.models.Acesso;
import br.unesp.rc.springtutorial.models.Contato;
import br.unesp.rc.springtutorial.models.Endereco;
import br.unesp.rc.springtutorial.models.Fisica;

public class FisicaAssember {
    public FisicaAssember() {
    }

    public static Fisica dtoToEntityModel(FisicaDTO dto) {
        Fisica fisica = new Fisica();

        fisica.setCpf(dto.getCpf());
        fisica.setDataNascimento(dto.getDataNascimento());
        fisica.setNome(dto.getNome());

        Acesso a = new Acesso();
        a.setUsuario(dto.getUsuario());
        a.setSenha(dto.getSenha());
        fisica.setAcesso(a);

        Contato c = new Contato();
        c.setTelefoneResidencial(dto.getTelefoneResidencial());
        c.setTelefoneComercial(dto.getTelefoneComercial());
        c.setCelular(dto.getCelular());
        c.setEmail(dto.getEmail());
        fisica.setContato(c);

        for (EnderecoDTO edto : dto.getEndereco()) {
            Endereco e = new Endereco();
            e.setRua(edto.getRua());
            e.setNumero(edto.getNumero());
            e.setBairro(edto.getBairro());
            e.setCep(edto.getCep());
            e.setCidade(edto.getCidade());
            e.setEstado(edto.getEstado());
            fisica.setEndereco(e);
        }

        return fisica;
    }
}
