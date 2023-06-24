package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.NewsInCompany;
import mk.ukim.finki.npb_proekt_be.service.NewsInCompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/newsInCompany")
public class NewsInCompanyController {

    private final NewsInCompanyService newsInCompanyService;

    @GetMapping("/first")
    public List<NewsInCompany> findFirstNewsInCompany(Integer n) {
        return this.newsInCompanyService.findFirstNewsInCompany(n);
    }

    @GetMapping("")
    public List<NewsInCompany> findAllByNewsIdAndPublisherId(@RequestParam Integer nId,@RequestParam Integer pId){
        return this.newsInCompanyService.findAllByNewsIdAndPublisherId(nId, pId);
    }
}
