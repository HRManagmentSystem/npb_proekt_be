package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.NewsInCompany;
import mk.ukim.finki.npb_proekt_be.service.NewsInCompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/newsInCompany")
public class NewsInCompanyController {

    private final NewsInCompanyService newsInCompanyService;

    public List<NewsInCompany> findAllByNewsIdAndPublisherId(){
        return this.newsInCompanyService.findAllByNewsIdAndPublisherId(1, 1);
    }
}
