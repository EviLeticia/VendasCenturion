/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcVendasProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lenovo
 */
public class Elgc_VendasProdutoControle extends AbstractTableModel{
    
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public ElgcVendasProduto getBean(int index){
    return (ElgcVendasProduto) lista.get(index);
    }
    
    public void addBean (ElgcVendasProduto vendasproduto){
    lista.add(vendasproduto);
    this.fireTableDataChanged();
    }
    
    public void removeBean (int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }

    public  void  updateBean (int index, ElgcVendasProduto elgcvendasproduto){
    lista.set(index, elgcvendasproduto);
    this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ElgcVendasProduto elgcvendasProduto = (ElgcVendasProduto) lista.get(rowIndex);
        
    if (columnIndex == 0){
    return elgcvendasProduto.getIdelgcVendasProduto();
    }
        if (columnIndex == 1){
    return elgcvendasProduto.getElgcValoruni();
    }
        if (columnIndex == 2){
    return elgcvendasProduto.getElgcProduto();
    }
        return "";
    
    
    }
    @Override
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "VALOR UNITÁRIO";
    }
    if (column == 2){
    return "PRODUTO";
    }
    return "";
    
    } 
}
