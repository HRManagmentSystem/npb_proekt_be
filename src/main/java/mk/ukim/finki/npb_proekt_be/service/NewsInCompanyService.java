package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.NewsInCompany;
import mk.ukim.finki.npb_proekt_be.repository.NewsInCompanyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsInCompanyService {

    private final NewsInCompanyRepo newsInCompanyRepo;

    public List<NewsInCompany> findFirstNewsInCompany(Integer n) {
        return this.newsInCompanyRepo.findFirstNewsInCompany(n);
    }

    public List<NewsInCompany> filterNews(Integer id, Integer gId){
        if(id != null && gId != null) {
            return this.newsInCompanyRepo.filterNews(id,gId);
        }
        else if(id!= null) {
            return this.newsInCompanyRepo.filterNewsById(id);
        }
        else{
            return this.newsInCompanyRepo.filterNewsBygId(gId);
        }
    }
}
