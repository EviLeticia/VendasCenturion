/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class Elgc_ClienteControle extends AbstractTableModel{
    
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public ElgcCliente getBean(int row) {
        return (ElgcCliente) lista.get(row);
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
        ElgcCliente elgcCliente = (ElgcCliente) lista.get(rowIndex);
        if (columnIndex == 0) {
            return elgcCliente.getIdelgcCliente();
        }
        if (columnIndex == 1) {
            return elgcCliente.getElgcNome();
        }
        if (columnIndex == 2) {
            return elgcCliente.getElgcApelido();
        }
        if (columnIndex == 3) {
            return elgcCliente.getElgcDatanascimento();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Apelido";
        }
        if (columnIndex == 3) {
            return "Data de Nascimento";
        }
        return "";
    }
}
