package com.example.demoSQL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.PropositionServiceDo;

@Service
public class ContractService {
	@Autowired
	private PropositionServiceDao psDao;
	public void stockPsDo(PropositionServiceDo ps) {
		psDao.save(ps);
	}

}