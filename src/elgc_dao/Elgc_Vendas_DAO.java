/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_dao;

import elgc_bean.ElgcVendas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09894615139
 */
public class Elgc_Vendas_DAO extends DAO_Abstract {

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
        session.flush();//serve pra não atualiza antes da operação em si Clear limpa a memória do hibernate
        session.clear();// Flush obriga o hibernate a escrever os dados no disco ou no Banco de dados.
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction(); //sessão é conexão com o banco de dados. Onde todos as operações do BD é necessitado é transação.
        session.flush();//serve pra não atualiza antes da operação em si Clear limpa a memória do hibernate
        session.clear();// Flush obriga o hibernate a escrever os dados no disco ou no Banco de dados.
        session.update(object);
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcVendas.class);
        criteria.add(Restrictions.eq("idelgcVendas", id));//metódo estático por nâo ter associado a classe //o id é parametro
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcVendas.class);
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return (ArrayList) lista;
    }

    public List listDataVenda(Date data) {

        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcVendas.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
        crit.add(Restrictions.eq("elgcDataVenda", data));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listValorVenda(double valor) {

        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcVendas.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
        crit.add(Restrictions.gt("elgcValortotalVenda", new Double(valor)));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listDataValorVenda(Date data, double valor) {

        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcVendas.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
        crit.add(Restrictions.eq("elgcDataVenda", data));
        crit.add(Restrictions.gt("elgcValortotalVenda", new Double(valor)));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;

    }

}
