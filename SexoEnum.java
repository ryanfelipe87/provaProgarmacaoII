package enums;

public enum SexoEnum {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTROS("Outros");
	
	private String descricao;

	SexoEnum(String descricao) {
		this.descricao = descricao;
		}

	public String getDescricao() {
		return descricao;
		}

	@Override
	public String toString() {
		return this.getDescricao();
		}

	public static SexoEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (SexoEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
		}

	
}
