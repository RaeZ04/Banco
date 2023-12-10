package com.raez;

class cuenta {

    private int id;
    private String propietario;
    private int saldo;

        public cuenta(int id, String propietario, int saldo) {
        this.id = id;
        this.propietario = propietario;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }



}
