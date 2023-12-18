/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_dao;

import elgc_bean.ElgcUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09894615139
 */
public class Elgc_Usuarios_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(ElgcUsuarios.class);
        criteria.add(Restrictions.eq("idelgcUsuarios", id));//metódo estático por nâo ter associado a classe //o id é parametro
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista.get(0);
    }
    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcUsuarios.class);
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista;
    }
    
    public List listNome(String nome){
    session.beginTransaction();
    Criteria crit = session.createCriteria(ElgcUsuarios.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
    crit.add(Restrictions.ilike("elgcNome", nome, MatchMode.ANYWHERE));
    List results = crit.list();
    session.beginTransaction().commit();
    return results;
    }
    
     public List listNivel(int nivel){
    session.beginTransaction();
    Criteria crit = session.createCriteria(ElgcUsuarios.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
    crit.add(Restrictions.ge("elgcNivel", nivel));
    List results = crit.list();
    session.beginTransaction().commit();
    return results;
    }
     
    public List listNomeNivel(String nome,int nivel){
    session.beginTransaction();
    Criteria crit = session.createCriteria(ElgcUsuarios.class);// Criando um objeto Criteria para a classe usando a sessão fornecida
    crit.add(Restrictions.ilike("elgcNome", nome, MatchMode.ANYWHERE));
    crit.add(Restrictions.ge("elgcNivel", nivel));
    List results = crit.list();
    session.beginTransaction().commit();
    return results;
    }
    
    public ElgcUsuarios login(String usuarios, String senha){
    session.beginTransaction();
    Criteria criteria = session.createCriteria(ElgcUsuarios.class);
    criteria.add(Restrictions.eq("elgcNome", usuarios));
    criteria.add(Restrictions.eq("elgcSenha", senha));
    ElgcUsuarios usuarioPermitido = (ElgcUsuarios) criteria.uniqueResult();
    session.getTransaction().commit();
        return usuarioPermitido;
    }
}
