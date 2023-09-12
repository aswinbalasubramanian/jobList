package com.aswin.joblisting.repository;

import com.aswin.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
