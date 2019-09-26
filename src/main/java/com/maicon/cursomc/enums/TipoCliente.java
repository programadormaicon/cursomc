package com.maicon.cursomc.enums;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Fisíca"),
	PESSOAJURIDICA(2, "Pessoa Fisíca");
	
	private Integer cod;
	private String descricao;
	
	private TipoCliente(Integer cod , String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
//		criar foerach de TipoCliente
		for(TipoCliente x: TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id: "+cod+" invalido");
	}
	
	
	
}
