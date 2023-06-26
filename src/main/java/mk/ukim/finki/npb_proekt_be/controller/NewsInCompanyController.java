package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.NewsInCompany;
import mk.ukim.finki.npb_proekt_be.service.NewsInCompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/newsInCompany")
@CrossOrigin("http://localhost:3000")
public class NewsInCompanyController {

    private final NewsInCompanyService newsInCompanyService;

    @GetMapping("/first")
    public List<NewsInCompany> findFirstNewsInCompany(Integer n) {
        return this.newsInCompanyService.findFirstNewsInCompany(n);
    }
}
