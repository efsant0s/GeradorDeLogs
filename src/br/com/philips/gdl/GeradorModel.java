/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.philips.gdl;

import java.util.LinkedHashMap;

/**
 *
 * @author Eduardo
 */
public class GeradorModel {

    private String ds_objeto_nome_objeto;
    private String ds_objeto_script_original;
    private String ds_objeto_script_saida;
    private String ds_objeto_nome_tabela_log;
    private String ds_objeto_script_tabela_log;
    private LinkedHashMap<String, String> lt_objeto_lista_variaveis;
    private String ds_objeto_mascara_data;
    private String ds_objeto_if_variavel;
    private String ds_objeto_then_variavel;
    private boolean ie_objeto_quebra_linha;
    private boolean ie_objeto_commit_insert;
    private boolean ie_objeto_stacktrace;
    private boolean ie_objeto_ds_comando;
    private String ds_objeto_deletar_script;

    private String ds_tabela_nome_tabela;
    private String ds_tabela_nm_trigger_gerada;
    private String ds_tabela_script_trigger;
    private String ds_tabela_nm_chave_primaria;
    private String ds_tabela_mascara_data;
    private LinkedHashMap<String, String> lt_tabela_lista_variaveis;
    private String ds_tabela_if_chave_primaria;
    private String ds_tabela_if_variavel;
    private String ds_tabela_then_variavel;
    private String ds_tabela_nome_tabela_log;
    private String ds_tabela_script_tabela_log;
    private String ds_tabela_deletar_script;

    public String getDs_objeto_nome_objeto() {
        return ds_objeto_nome_objeto;
    }

    public void setDs_objeto_nome_objeto(String ds_objeto_nome_objeto) {
        this.ds_objeto_nome_objeto = ds_objeto_nome_objeto;
    }

    public String getDs_objeto_script_original() {
        return ds_objeto_script_original;
    }

    public void setDs_objeto_script_original(String ds_objeto_script_original) {
        this.ds_objeto_script_original = ds_objeto_script_original;
    }

    public String getDs_objeto_script_saida() {
        return ds_objeto_script_saida;
    }

    public void setDs_objeto_script_saida(String ds_objeto_script_saida) {
        this.ds_objeto_script_saida = ds_objeto_script_saida;
    }

    public String getDs_objeto_nome_tabela_log() {
        return ds_objeto_nome_tabela_log;
    }

    public void setDs_objeto_nome_tabela_log(String ds_objeto_nome_tabela_log) {
        this.ds_objeto_nome_tabela_log = ds_objeto_nome_tabela_log;
    }

    public String getDs_objeto_script_tabela_log() {
        return ds_objeto_script_tabela_log;
    }

    public void setDs_objeto_script_tabela_log(String ds_objeto_script_tabela_log) {
        this.ds_objeto_script_tabela_log = ds_objeto_script_tabela_log;
    }

    public LinkedHashMap<String, String> getLt_objeto_lista_variaveis() {
        return lt_objeto_lista_variaveis;
    }

    public void setLt_objeto_lista_variaveis(LinkedHashMap<String, String> lt_objeto_lista_variaveis) {
        this.lt_objeto_lista_variaveis = lt_objeto_lista_variaveis;
    }

    public String getDs_objeto_mascara_data() {
        return ds_objeto_mascara_data;
    }

    public void setDs_objeto_mascara_data(String ds_objeto_mascara_data) {
        this.ds_objeto_mascara_data = ds_objeto_mascara_data;
    }

    public String getDs_objeto_if_variavel() {
        return ds_objeto_if_variavel;
    }

    public void setDs_objeto_if_variavel(String ds_objeto_if_variavel) {
        this.ds_objeto_if_variavel = ds_objeto_if_variavel;
    }

    public String getDs_objeto_then_variavel() {
        return ds_objeto_then_variavel;
    }

    public void setDs_objeto_then_variavel(String ds_objeto_then_variavel) {
        this.ds_objeto_then_variavel = ds_objeto_then_variavel;
    }

    public boolean isIe_objeto_quebra_linha() {
        return ie_objeto_quebra_linha;
    }

    public void setIe_objeto_quebra_linha(boolean ie_objeto_quebra_linha) {
        this.ie_objeto_quebra_linha = ie_objeto_quebra_linha;
    }

    public boolean isIe_objeto_commit_insert() {
        return ie_objeto_commit_insert;
    }

    public void setIe_objeto_commit_insert(boolean ie_objeto_commit_insert) {
        this.ie_objeto_commit_insert = ie_objeto_commit_insert;
    }

    public boolean isIe_objeto_stacktrace() {
        return ie_objeto_stacktrace;
    }

    public void setIe_objeto_stacktrace(boolean ie_objeto_stacktrace) {
        this.ie_objeto_stacktrace = ie_objeto_stacktrace;
    }

    public boolean isIe_objeto_ds_comando() {
        return ie_objeto_ds_comando;
    }

    public void setIe_objeto_ds_comando(boolean ie_objeto_ds_comando) {
        this.ie_objeto_ds_comando = ie_objeto_ds_comando;
    }

    public String getDs_objeto_deletar_script() {
        return ds_objeto_deletar_script;
    }

    public void setDs_objeto_deletar_script(String ds_objeto_deletar_script) {
        this.ds_objeto_deletar_script = ds_objeto_deletar_script;
    }

    public String getDs_tabela_nome_tabela() {
        return ds_tabela_nome_tabela;
    }

    public void setDs_tabela_nome_tabela(String ds_tabela_nome_tabela) {
        this.ds_tabela_nome_tabela = ds_tabela_nome_tabela;
    }

    public String getDs_tabela_nm_trigger_gerada() {
        return ds_tabela_nm_trigger_gerada;
    }

    public void setDs_tabela_nm_trigger_gerada(String ds_tabela_nm_trigger_gerada) {
        this.ds_tabela_nm_trigger_gerada = ds_tabela_nm_trigger_gerada;
    }

    public String getDs_tabela_script_trigger() {
        return ds_tabela_script_trigger;
    }

    public void setDs_tabela_script_trigger(String ds_tabela_script_trigger) {
        this.ds_tabela_script_trigger = ds_tabela_script_trigger;
    }

    public String getDs_tabela_nm_chave_primaria() {
        return ds_tabela_nm_chave_primaria;
    }

    public void setDs_tabela_nm_chave_primaria(String ds_tabela_nm_chave_primaria) {
        this.ds_tabela_nm_chave_primaria = ds_tabela_nm_chave_primaria;
    }

    public String getDs_tabela_mascara_data() {
        return ds_tabela_mascara_data;
    }

    public void setDs_tabela_mascara_data(String ds_tabela_mascara_data) {
        this.ds_tabela_mascara_data = ds_tabela_mascara_data;
    }

    public LinkedHashMap<String, String> getLt_tabela_lista_variaveis() {
        return lt_tabela_lista_variaveis;
    }

    public void setLt_tabela_lista_variaveis(LinkedHashMap<String, String> lt_tabela_lista_variaveis) {
        this.lt_tabela_lista_variaveis = lt_tabela_lista_variaveis;
    }

    public String getDs_tabela_if_chave_primaria() {
        return ds_tabela_if_chave_primaria;
    }

    public void setDs_tabela_if_chave_primaria(String ds_tabela_if_chave_primaria) {
        this.ds_tabela_if_chave_primaria = ds_tabela_if_chave_primaria;
    }

    public String getDs_tabela_if_variavel() {
        return ds_tabela_if_variavel;
    }

    public void setDs_tabela_if_variavel(String ds_tabela_if_variavel) {
        this.ds_tabela_if_variavel = ds_tabela_if_variavel;
    }

    public String getDs_tabela_then_variavel() {
        return ds_tabela_then_variavel;
    }

    public void setDs_tabela_then_variavel(String ds_tabela_then_variavel) {
        this.ds_tabela_then_variavel = ds_tabela_then_variavel;
    }

    public String getDs_tabela_nome_tabela_log() {
        return ds_tabela_nome_tabela_log;
    }

    public void setDs_tabela_nome_tabela_log(String ds_tabela_nome_tabela_log) {
        this.ds_tabela_nome_tabela_log = ds_tabela_nome_tabela_log;
    }

    public String getDs_tabela_script_tabela_log() {
        return ds_tabela_script_tabela_log;
    }

    public void setDs_tabela_script_tabela_log(String ds_tabela_script_tabela_log) {
        this.ds_tabela_script_tabela_log = ds_tabela_script_tabela_log;
    }

    public String getDs_tabela_deletar_script() {
        return ds_tabela_deletar_script;
    }

    public void setDs_tabela_deletar_script(String ds_tabela_deletar_script) {
        this.ds_tabela_deletar_script = ds_tabela_deletar_script;
    }
    
    
}
