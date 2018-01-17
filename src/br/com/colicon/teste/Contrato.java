package br.com.colicon.teste;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;

	public Integer contratoId;
	private Integer numero;
	private Integer ano;
	private String ata;
	private String pasta;
	private String modalidade;
	private String processo;
	private String protocolo;
	private String tipoobjeto;
	private String objeto;
	private String contratada;
	private String terceirizados;
	private String requisitante;
	private String quantidade;
	private BigDecimal vmensal;
	private BigDecimal vtotal;
	private String fixo_estimado;
	private Calendar iniciovigencia = Calendar.getInstance();	
	private Calendar fimvigencia = Calendar.getInstance();
	private String continuado;
	private String prorrogavel;
	private String garantia;
	private String portariafiscal;
	private String fiscaltitular;
	private String fiscalsubstituto;
	private String observacoes;
	private String situacao;
	private String empenho;
	private String termoaditivo;
	private String motivo;
	private String aumentomensal;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getAta() {
		return ata;
	}
	public void setAta(String ata) {
		this.ata = ata;
	}
	public String getPasta() {
		return pasta;
	}
	public void setPasta(String pasta) {
		this.pasta = pasta;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public String getProcesso() {
		return processo;
	}
	public void setProcesso(String processo) {
		this.processo = processo;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public String getTipoobjeto() {
		return tipoobjeto;
	}
	public void setTipoobjeto(String tipoobjeto) {
		this.tipoobjeto = tipoobjeto;
	}
	public String getObjeto() {
		return objeto;
	}
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}
	public String getContratada() {
		return contratada;
	}
	public void setContratada(String contratada) {
		this.contratada = contratada;
	}
	public String getRequisitante() {
		return requisitante;
	}
	public void setRequisitante(String requisitante) {
		this.requisitante = requisitante;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getVmensal() {
		return vmensal;
	}
	public void setVmensal(BigDecimal vmensal) {
		this.vmensal = vmensal;
	}
	public BigDecimal getVtotal() {
		return vtotal;
	}
	public void setVtotal(BigDecimal vtotal) {
		this.vtotal = vtotal;
	}
	public String getFixo_estimado() {
		return fixo_estimado;
	}
	public void setFixo_estimado(String fixo_estimado) {
		this.fixo_estimado = fixo_estimado;
	}
	public String getContinuado() {
		return continuado;
	}
	public void setContinuado(String continuado) {
		this.continuado = continuado;
	}
	public String getProrrogavel() {
		return prorrogavel;
	}
	public void setProrrogavel(String prorrogavel) {
		this.prorrogavel = prorrogavel;
	}
	public String getGarantia() {
		return garantia;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	public String getPortariafiscal() {
		return portariafiscal;
	}
	public void setPortariafiscal(String portariafiscal) {
		this.portariafiscal = portariafiscal;
	}
	public String getFiscaltitular() {
		return fiscaltitular;
	}
	public void setFiscaltitular(String fiscaltitular) {
		this.fiscaltitular = fiscaltitular;
	}
	public String getFiscalsubstituto() {
		return fiscalsubstituto;
	}
	public void setFiscalsubstituto(String fiscalsubustituto) {
		this.fiscalsubstituto = fiscalsubustituto;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getEmpenho() {
		return empenho;
	}
	public void setEmpenho(String empenho) {
		this.empenho = empenho;
	}
	public String getTermoaditivo() {
		return termoaditivo;
	}
	public void setTermoaditivo(String termoaditivo) {
		this.termoaditivo = termoaditivo;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getAumentomensal() {
		return aumentomensal;
	}
	public void setAumentomensal(String aumentomensal) {
		this.aumentomensal = aumentomensal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getContratoId() == null) ? 0 : getContratoId().hashCode());
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
		Contrato other = (Contrato) obj;
		if (getContratoId() == null) {
			if (other.getContratoId() != null)
				return false;
		} else if (!getContratoId().equals(other.getContratoId()))
			return false;
		return true;
	}
	public String getTerceirizados() {
		return terceirizados;
	}
	public void setTerceirizados(String terceirizados) {
		this.terceirizados = terceirizados;
	}
	public Integer getContratoId() {
		return contratoId;
	}
	public void setContratoId(Integer contratoId) {
		this.contratoId = contratoId;
	}

	@Override
	public String toString() {
		return "Contrato [contratoId=" + contratoId + ", numero=" + numero + ", ano=" + ano + ", ata=" + ata
				+ ", pasta=" + pasta + ", modalidade=" + modalidade + ", processo=" + processo + ", protocolo="
				+ protocolo + ", tipoobjeto=" + tipoobjeto + ", objeto=" + objeto + ", contratada=" + contratada
				+ ", terceirizados=" + terceirizados + ", requisitante=" + requisitante + ", quantidade=" + quantidade
				+ ", vmensal=" + vmensal + ", vtotal=" + vtotal + ", fixo_estimado=" + fixo_estimado
				+ ", iniciovigencia=" + getIniciovigencia() + ", fimvigencia=" + getFimvigencia() + ", continuado=" + continuado
				+ ", prorrogavel=" + prorrogavel + ", garantia=" + garantia + ", portariafiscal=" + portariafiscal
				+ ", fiscaltitular=" + fiscaltitular + ", fiscalsubstituto=" + fiscalsubstituto + ", observacoes="
				+ observacoes + ", situacao=" + situacao + ", empenho=" + empenho + ", termoaditivo=" + termoaditivo
				+ ", motivo=" + motivo + ", aumentomensal=" + aumentomensal + "]";
	}
	public Calendar getIniciovigencia() {
		return iniciovigencia;
	}
	public void setIniciovigencia(Calendar iniciovigencia) {
		this.iniciovigencia = iniciovigencia;
	}
	public Calendar getFimvigencia() {
		return fimvigencia;
	}
	public void setFimvigencia(Calendar fimvigencia) {
		this.fimvigencia = fimvigencia;
	}

	

}