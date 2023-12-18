/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class Elgc_UsuariosControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
        
    }
    
    public ElgcUsuarios getBean(int row) {
        return (ElgcUsuarios) lista.get(row);
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
        ElgcUsuarios elgcUsuarios = (ElgcUsuarios) lista.get(rowIndex);
        if (columnIndex == 0) {
            return elgcUsuarios.getIdelgcUsuarios();
        }
        if (columnIndex == 1) {
            return elgcUsuarios.getElgcNome();
        }
        if (columnIndex == 2) {
            return elgcUsuarios.getElgcSenha();
        }
        if (columnIndex == 3) {
            return elgcUsuarios.getElgcNivel();
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
            return "Senha";
        }
        if (columnIndex == 3) {
            return "Nível";
        }
        return "";
    }
}
