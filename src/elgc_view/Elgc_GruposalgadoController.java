/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_view;

import elgc_bean.ElgcGruposalgado;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09894615139
 */
public class Elgc_GruposalgadoController extends AbstractTableModel{
    
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public ElgcGruposalgado getBean(int row){
         return (ElgcGruposalgado) lista.get(row);
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
        ElgcGruposalgado elgcGruposalgado = (ElgcGruposalgado) lista.get(row);
        
        if (column == 0) {
           return elgcGruposalgado.getIdelgcGruposalgado();
        } 
        if (column == 1) {
           return elgcGruposalgado.getElgcTiposalgado();
        } 
        if (column == 2) {
           return elgcGruposalgado.getElgcRecheio();
        } 
        if (column == 3) {
           return elgcGruposalgado.getElgcTipocozimento();
        } 
        return null;
    }
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Tipo de Salgado";
        }
        if (column == 2) {
            return "Recheio";
        }
        if (column == 3) {
            return "Tipo de Cozimento";
        }
        return "";
    }
}

