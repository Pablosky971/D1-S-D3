/*
 * AnonymousUserAccountController.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.administrator.technologyRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.technologyRecords.TechnologyRecords;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/technology-records/")
public class AdministratorTechnologyRecordsController extends AbstractController<Administrator, TechnologyRecords> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AdministratorTechnologyRecordsListService listService;
	
	@Autowired
	private AdministratorTechnologyRecordsShowService showService;
	
	@Autowired
	private AdministratorTechnologyRecordsCreateService createService;
	
	@Autowired
	private AdministratorTechnologyRecordsUpdateService updateService;
	
	@Autowired
	private AdministratorTechnologyRecordsDeleteService deleteService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
	}

}
