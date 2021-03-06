package br.com.reservas

class Reserva {
	
	Date dataSolicitacao
	Date dataEvento
	Boolean aprovada
	Boolean cancelada
	Date dataAprovacao
	Date dataCancelamento
	String comentario
	BigDecimal valor
	
	static hasMany = [convidados:Convidado]
	
	static belongsTo = [usuario:Usuario, apartamento:Apartamento, recurso:Recurso]

    static constraints = {
		dataSolicitacao nullable:false 
		dataEvento nullable:false 
		aprovada nullable:false 
		cancelada nullable:false
		valor scale: 2
    }
	
	static mapping = {
		aprovada defaultValue: false
		cancelada defaultValue: false
	}
}
