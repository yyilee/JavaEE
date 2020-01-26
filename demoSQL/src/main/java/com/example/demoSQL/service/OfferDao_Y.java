package com.example.demoSQL.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demoSQL.domain.OfferDo_Y;
import com.example.demoSQL.domain.UserDo;

@Repository
public interface OfferDao_Y extends JpaRepository<OfferDo_Y, String> {

}