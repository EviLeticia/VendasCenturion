/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgc_dao;

import elgc_bean.ElgcGruposalgado;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09894615139
 */
public class Elgc_Gruposalgado_DAO extends DAO_Abstract{

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
         session.clear();
      session.update(object);
      session.delete(object);
      session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcGruposalgado.class);
        criteria.add(Restrictions.eq("idelgcGruposalgado", id));//metódo estático por nâo ter associado a classe //o id é parametro
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
      session.beginTransaction();
        Criteria criteria = session.createCriteria(ElgcGruposalgado.class);
        List lista = criteria.list(); //Pega todos os REGISTROS da tabela
        session.getTransaction().commit();
        return lista;
    }
    
    public List listTiposalgado(String tiposalgado){
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcGruposalgado.class);// Criando um objeto Criteria para a classe ElgcCliente usando a sessão fornecida
        crit.add(Restrictions.ilike("elgcTiposalgado", tiposalgado, MatchMode.ANYWHERE));// adicionando uma condição de pesquisa
        List results = crit.list();//obtendo lista de resultados
        session.beginTransaction().commit();//commit da transição
        return results;//retorna os resultados
    }
    
   public List listTiporecheio(int recheio){//ainda não foi mudado no Banco de Dados da escola, somente em casa
        session.beginTransaction();
        Criteria crit = session.createCriteria(ElgcGruposalgado.class);// Criando um objeto Criteria para a classe ElgcCliente usando a sessão fornecida
        crit.add(Restrictions.ilike("elgcRecheio", recheio));//add condição de pesquisa
        List results = crit.list();//obtendo lista de results
        session.beginTransaction().commit();
        return results;//lista de results
    }
   
    public List listSalgadoRecheio(String tiposalgado,int recheio){
    session.beginTransaction();
    Criteria crit = session.createCriteria(ElgcGruposalgado.class);// Criando um objeto Criteria para a classe ElgcCliente usando a sessão fornecida
    crit.add(Restrictions.ilike("elgcTiposalgado", tiposalgado, MatchMode.ANYWHERE));//add condição de pesquisa
    crit.add(Restrictions.ge("elgcRecheio", recheio));//add condição de pesquisa
    List results = crit.list();
    session.getTransaction().commit();
    return results;
    }
    
}
