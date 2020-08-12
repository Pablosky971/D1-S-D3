package acme.features.authenticated.overture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.notice.Notice;
import acme.entities.overture.Overture;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedOvertureShowService implements AbstractShowService<Authenticated, Overture> {


	@Autowired
	private AuthenticatedOvertureRepository repository;



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

		request.unbind(entity, model, "title", "creation", "deadline", "description", "minMoney", "maxMoney","email");
	}

	@Override
	public Overture findOne(final Request<Overture> request) {
		assert request != null;

		Overture overture;
		int id;

		id = request.getModel().getInteger("id");
		overture = this.repository.findOneById(id);

		return overture;
	}

}