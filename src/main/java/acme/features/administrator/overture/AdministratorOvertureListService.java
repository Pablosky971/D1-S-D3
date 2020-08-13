
package acme.features.administrator.overture;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Collectors;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.notice.Notice;
import acme.entities.overture.Overture;
import acme.entities.shout.Shout;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.entities.Anonymous;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AdministratorOvertureListService implements AbstractListService<Administrator, Overture> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AdministratorOvertureRepository repository;


	// AbstractListService<Administrator, UserAccount> interface --------------

	@Override
	public boolean authorise(final Request<Overture> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Overture> request, final Overture entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		

		request.unbind(entity, model, "title", "deadline", "minMoney","maxMoney");

	}
	

	@Override
	public Collection<Overture> findMany(final Request<Overture> request) {
		assert request != null;

		Collection<Overture> result;

		result = this.repository.findMany();
		
		return result;
	}

}
