package com.codeup.springblog;

import org.springframework.data.jpa.repository.JpaRepository;

                    // Entity name / Long <- id type (typical)
public interface AdRepository extends JpaRepository<Ad, Long> {
    Ad findByTitle(String title);
}
