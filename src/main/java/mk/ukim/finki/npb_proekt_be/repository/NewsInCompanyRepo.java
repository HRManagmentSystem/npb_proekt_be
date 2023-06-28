package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.NewsInCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsInCompanyRepo extends JpaRepository<NewsInCompany, Integer> {

    @Query(value = "select * from news_in_company limit :n",nativeQuery = true)
    List<NewsInCompany> findFirstNewsInCompany(Integer n);

    @Query(value = "select * from news_in_company where employee_publish_id = :id and employee_group_id = :gId limit 50",nativeQuery = true)
    List<NewsInCompany> filterNews(Integer id, Integer gId);
    @Query(value = "select * from news_in_company where employee_publish_id = :id limit 50",nativeQuery = true)
    List<NewsInCompany> filterNewsById(Integer id);
    @Query(value = "select * from news_in_company where and employee_group_id = :gId limit 50",nativeQuery = true)
    List<NewsInCompany> filterNewsBygId(Integer gId);

}
