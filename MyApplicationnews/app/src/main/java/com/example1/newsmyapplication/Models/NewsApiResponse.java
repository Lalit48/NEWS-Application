package com.example1.newsmyapplication.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    String status;
    int totalResults;
    List<Newsheadline> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<Newsheadline> getArticles() {
        return articles;
    }

    public void setArticles(List<Newsheadline> articles) {
        this.articles = articles;
    }
}
