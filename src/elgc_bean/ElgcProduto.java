package elgc_bean;
// Generated 15/12/2023 13:47:49 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ElgcProduto generated by hbm2java
 */
@Entity
@Table(name="elgc_produto"
    ,catalog="db_evelin_centurion"
)
public class ElgcProduto  implements java.io.Serializable {


     private int idelgcProduto;
     private String elgcNomeproduto;
     private double elgcValoruni;
     private String elgcEntrega;
     private String elgcRetiradalocal;
     private String elgcAcompanhamento;

    public ElgcProduto() {
    }

	
    public ElgcProduto(int idelgcProduto, String elgcNomeproduto, double elgcValoruni, String elgcEntrega, String elgcRetiradalocal, String elgcAcompanhamento) {
       this.idelgcProduto = idelgcProduto;
       this.elgcNomeproduto = elgcNomeproduto;
       this.elgcValoruni = elgcValoruni;
       this.elgcEntrega = elgcEntrega;
       this.elgcRetiradalocal = elgcRetiradalocal;
       this.elgcAcompanhamento = elgcAcompanhamento;
       
    }
   
     @Id 

    
    @Column(name="idelgc_produto", unique=true, nullable=false)
    public int getIdelgcProduto() {
        return this.idelgcProduto;
    }
    
    public void setIdelgcProduto(int idelgcProduto) {
        this.idelgcProduto = idelgcProduto;
    }

    
    @Column(name="elgc_nomeproduto", nullable=false, length=45)
    public String getElgcNomeproduto() {
        return this.elgcNomeproduto;
    }
    
    public void setElgcNomeproduto(String elgcNomeproduto) {
        this.elgcNomeproduto = elgcNomeproduto;
    }

    
    @Column(name="elgc_valoruni", nullable=false, precision=22, scale=0)
    public double getElgcValoruni() {
        return this.elgcValoruni;
    }
    
    public void setElgcValoruni(double elgcValoruni) {
        this.elgcValoruni = elgcValoruni;
    }

    
    @Column(name="elgc_entrega", length=2)
    public String getElgcEntrega() {
        return this.elgcEntrega;
    }
    
    public void setElgcEntrega(String elgcEntrega) {
        this.elgcEntrega = elgcEntrega;
    }

    
    @Column(name="elgc_retiradalocal", length=2)
    public String getElgcRetiradalocal() {
        return this.elgcRetiradalocal;
    }
    
    public void setElgcRetiradalocal(String elgcRetiradalocal) {
        this.elgcRetiradalocal = elgcRetiradalocal;
    }

    
    @Column(name="elgc_acompanhamento", length=45)
    public String getElgcAcompanhamento() {
        return this.elgcAcompanhamento;
    }
    
    public void setElgcAcompanhamento(String elgcAcompanhamento) {
        this.elgcAcompanhamento = elgcAcompanhamento;
    }

@Override
    public boolean equals(Object object) {// Sobrescreve o método equals para comparar a igualdade entre objetos ElgcProduto

        if (object instanceof ElgcProduto) {// Verifica se o objeto passado é uma instância de ElgcProduto

            ElgcProduto produto = (ElgcProduto) object;// Converte o objeto para a classe ElgcProduto

            if (this.getIdelgcProduto() == produto.getIdelgcProduto()) {// Compara os IDs para verificar a igualdade

                return true;// Retorna true se os IDs forem iguais
            }
        }
        return false; // Retorna false se o objeto não for uma instância de ElgcProduto ou se os IDs não forem iguais
    }




}


