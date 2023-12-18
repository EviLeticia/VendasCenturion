/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09894615139
 */
public class Elgc_ProdutoController extends AbstractTableModel{
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public ElgcProduto getBean(int row) {
        return (ElgcProduto) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
       ElgcProduto elgcProduto = (ElgcProduto) lista.get(row);
        if (column == 0) {
           return elgcProduto.getIdelgcProduto();
        } 
        if (column == 1) {
           return elgcProduto.getElgcNomeproduto();
        } 
        if (column == 2) {
           return elgcProduto.getElgcValoruni();
        } 
        if (column == 3) {
           return elgcProduto.getElgcAcompanhamento();
        } 
        return null;    
}
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome do Produto";
        }
        if (column == 2) {
            return "Valor Unitário";
        }
        if (column == 3) {
            return "Acompanhamento";
        }
        return "";
    }
}

