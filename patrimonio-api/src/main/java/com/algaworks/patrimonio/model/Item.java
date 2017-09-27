package com.algaworks.patrimonio.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String etiqueta;

	@NotEmpty
	private String descricao;

	@Column(name = "data_aquisicao")
	private LocalDate dataAquisicao;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.id == null ? 0 : this.id.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Item other = (Item) obj;
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getEtiqueta() {
		return this.etiqueta;
	}

	public void setEtiqueta(final String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataAquisicao() {
		return this.dataAquisicao;
	}

	public void setDataAquisicao(final LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

}
