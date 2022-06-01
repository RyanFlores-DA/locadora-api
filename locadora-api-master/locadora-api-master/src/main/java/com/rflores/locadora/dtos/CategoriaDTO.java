
package com.rflores.locadora.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.rflores.locadora.domain.Categoria;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotNull(message = "Campo Obrigatório")
	@Size(min = 4, max = 40, message = "Tamanho minímo é 4 caracteres e máximo 40 caracteres")
	private String name;
        private String descricao;

    
        
	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getNome();
                this.descricao = obj.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}
        
        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaDTO other = (CategoriaDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
