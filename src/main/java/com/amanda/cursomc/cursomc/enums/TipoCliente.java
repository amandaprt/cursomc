package com.amanda.cursomc.cursomc.enums;

public enum TipoCliente {
    
    PESSOAFISICA(1, "Pessoa física"),
    PESSOAJURIDICA(2, "Pessoa jurídica");

    private int codigo;
    private String descricao;

    TipoCliente(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer codigo) throws IllegalAccessException {
        if(codigo == null){
            return null;
        }

        for(TipoCliente cod : TipoCliente.values()){
            if(cod.equals(codigo)){
                return cod;
            }
        }

        throw new IllegalArgumentException("Código não encontrado: ");
    }

}
