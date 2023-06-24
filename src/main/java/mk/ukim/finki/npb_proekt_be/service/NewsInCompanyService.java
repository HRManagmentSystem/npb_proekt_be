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

    public List<NewsInCompany> findAllByNewsIdAndPublisherId(Integer nId, Integer pId){
        return this.newsInCompanyRepo.findAllByNewsIdAndPublisherId(nId, pId);
    }

}