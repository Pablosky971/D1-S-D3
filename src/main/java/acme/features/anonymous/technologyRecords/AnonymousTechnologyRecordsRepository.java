/*
 * AnonymousUserAccountRepository.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes.  The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.anonymous.technologyRecords;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.technologyRecords.TechnologyRecords;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousTechnologyRecordsRepository extends AbstractRepository {

	@Query("select trc from TechnologyRecords trc")
	Collection<TechnologyRecords> findMany();
	
	@Query("select trc from TechnologyRecords trc where trc.id = ?1")
	TechnologyRecords findOne(Integer id);


}
