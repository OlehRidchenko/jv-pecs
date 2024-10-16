package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> finalList = new ArrayList<>();
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            finalList.addAll(bulldozer.get());
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavator = new ExcavatorProducer();
            finalList.addAll(excavator.get());
        }
        if (type == Truck.class) {
            TruckProducer truck = new TruckProducer();
            finalList.addAll(truck.get());
        }

        return finalList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
