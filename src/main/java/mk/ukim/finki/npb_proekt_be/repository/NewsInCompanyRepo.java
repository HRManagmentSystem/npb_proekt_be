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

}
