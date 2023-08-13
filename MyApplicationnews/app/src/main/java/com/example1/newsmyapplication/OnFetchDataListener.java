package com.example1.newsmyapplication;

import com.example1.newsmyapplication.Models.Newsheadline;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<Newsheadline> list, String message);
    void onError(String message);

}
