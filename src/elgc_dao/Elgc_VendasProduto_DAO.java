/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_dao;

import elgc_bean.ElgcVendasProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import elgc_bean.ElgcVendas;

/**
 *
 * @author u09894615139
 */
public class Elgc_VendasProduto_DAO extends DAO_Abstract {

    public Object listProdutos(ElgcVendas elgcVendas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcVendasProduto.class);
        criteria.add(Restrictions.eq("elgcVendas", elgcVendas));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public void insert(Object object) {
        session.beginTransaction(); //sessão é conexão com o banco de dados. Onde todos as operações do BD é necessitado é transação.
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction(); //sessão é conexão com o banco de dados. Onde todos as operações do BD é necessitado é transação.
        session.update(object);
        session.flush();
        session.clear();
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction(); //sessão é conexão com o banco de dados. Onde todos as operações do BD é necessitado é transação.
        session.flush();
        session.clear();
        session.update(object);
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcVendasProduto.class);
        criteria.add(Restrictions.eq("idelgccliente", id));//metódo estático por nâo ter associado a classe //o id é parametro
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcVendasProduto.class);
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista;

    }

}
