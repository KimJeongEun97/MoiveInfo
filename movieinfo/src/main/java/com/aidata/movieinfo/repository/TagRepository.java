package com.aidata.movieinfo.repository;

import com.aidata.movieinfo.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TagRepository
        extends JpaRepository<Tag, Long> {
    @Query("select t.tword from Tag t where t.tmcode = :tmc")
    List<String> findByTmcode(@Param("tmc") Long mcode);
}
