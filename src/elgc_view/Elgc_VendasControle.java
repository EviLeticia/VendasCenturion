/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lenovo
 */
public class Elgc_VendasControle extends AbstractTableModel{
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public ElgcVendas getBean(int row){
        return (ElgcVendas) lista.get(row);
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        ElgcVendas elgcVendas = (ElgcVendas) lista.get(rowIndex);
      if (columnIndex == 0){
    return elgcVendas.getIdelgcVendas();
    }
        if (columnIndex == 1){
    return elgcVendas.getElgcCliente();
    }
        if (columnIndex == 2){
    return elgcVendas.getElgcDataVenda();
    }
         if (columnIndex == 3){
    return elgcVendas.getElgcValortotalVenda();
    }
        return "";
     }
    
    @Override
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Cliente";
    }
    if (column == 2){
    return "Data Venda";
    }
    if (column == 3){
    return "Valor Venda";
    }
    return "";
    
    } 
    
}
