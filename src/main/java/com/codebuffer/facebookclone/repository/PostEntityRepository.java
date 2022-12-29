package com.codebuffer.facebookclone.repository;

import com.codebuffer.facebookclone.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   PostEntityRepository extends JpaRepository<PostEntity,String> {
}
