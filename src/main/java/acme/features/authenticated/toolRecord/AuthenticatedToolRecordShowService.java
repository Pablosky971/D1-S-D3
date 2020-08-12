package acme.features.authenticated.toolRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.notice.Notice;
import acme.entities.overture.Overture;
import acme.entities.toolRecord.ToolRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedToolRecordShowService implements AbstractShowService<Authenticated, ToolRecord> {


	@Autowired
	private AuthenticatedToolRecordRepository repository;



	@Override
	public boolean authorise(final Request<ToolRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<ToolRecord> request, final ToolRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "sector", "inventor", "description", "website", "email","tipo","stars");
	}

	@Override
	public ToolRecord findOne(final Request<ToolRecord> request) {
		assert request != null;

		ToolRecord toolrecord;
		int id;

		id = request.getModel().getInteger("id");
		toolrecord = this.repository.findOneById(id);

		return toolrecord;
	}

}