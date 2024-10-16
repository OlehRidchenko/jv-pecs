package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    // можна підставити Machine і все буде працювати
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());

    }
}
