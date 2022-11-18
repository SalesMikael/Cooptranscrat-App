package Main;

import org.eclipse.swt.widgets.List;

public interface Database {
	List addTopic(Topic t);

	List addUser(User u);

	List addViagem(Viagem v);

	List addMotorista(Motorista m);

}
