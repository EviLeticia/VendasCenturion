/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_dao;

import elgc_bean.ElgcCliente;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09894615139
 */
public class Elgc_Cliente_DAO extends DAO_Abstract {

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
        session.flush();//limpar cash do hibernate para nâo enviar cositas equivocadas
        session.clear();
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction(); //sessão é conexão com o banco de dados. Onde todos as operações do BD é necessitado é transação.
        session.flush();//limpar cash do hibernate para nâo enviar cositas equivocadas
        session.clear();
        session.update(object);
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcCliente.class);
        criteria.add(Restrictions.eq("idelgcCliente", id));//metódo estático por nâo ter associado a classe //o id é parametro
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        // Criando um objeto Criteria para a classe ElgcCliente usando a sessão fornecida
        Criteria criteria = session.createCriteria(ElgcCliente.class);
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista;
    }

    // Método para obter uma lista de clientes com base no nome
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcCliente.class);// Criando um objeto Criteria associado à classe ElgcCliente
        crit.add(Restrictions.ilike("elgcNome", nome, MatchMode.ANYWHERE));// Adicionando uma restrição para encontrar resultados que contenham o nome fornecido em qualquer lugar
        List results = crit.list();// Obtendo a lista de resultados
        session.getTransaction().commit();// Commit da transação
        return results;// Retornando a lista de resultados
    }

// Método para obter uma lista de clientes com base na data de nascimento
    public List listData(Date datanasc) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcCliente.class);
        crit.add(Restrictions.eq("elgcDatanascimento", datanasc));
        List results = crit.list();// Obtendo a lista de resultados
        session.getTransaction().commit();
        return results;
    }

// Método para obter uma lista de clientes com base no nome e na data de nascimento
    public List listNomeData(String nome, Date datanasc) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcCliente.class);
        crit.add(Restrictions.ilike("elgcNome", nome, MatchMode.ANYWHERE));
        crit.add(Restrictions.eq("elgcDatanascimento", datanasc));
        List results = crit.list();
        session.getTransaction().commit();
        return results;
    }

}
