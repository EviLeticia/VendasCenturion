/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_dao;

import elgc_bean.ElgcProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09894615139
 */
public class Elgc_Produto_DAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(ElgcProduto.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
        criteria.add(Restrictions.eq("idelgcProduto", id));//metódo estático por nâo ter associado a classe //o id é parametro
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
       return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcProduto.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista;

    }

    public List listProduto(String nomeprod) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcProduto.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
        crit.add(Restrictions.ilike("elgcNomeproduto", nomeprod, MatchMode.ANYWHERE));
        List results = crit.list();
        session.beginTransaction().commit();
        return results;
    }

    public List listValorUni(Double valoruni) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcProduto.class);
        crit.add(Restrictions.gt("elgcValoruni", new Double(valoruni)));
        List results = crit.list();
        session.beginTransaction().commit();
        return results;
    }

    public List listProdutoValor(String nomeprod, double valoruni) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcProduto.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
        crit.add(Restrictions.ilike("elgcNomeproduto", nomeprod, MatchMode.ANYWHERE));
        crit.add(Restrictions.gt("elgcValoruni", valoruni));
        List results = crit.list();
        session.getTransaction().commit();
        return results;
    }
}
