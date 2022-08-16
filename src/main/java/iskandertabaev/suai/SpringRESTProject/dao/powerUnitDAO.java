package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.powerUnit;

import java.util.List;

public interface powerUnitDAO {
    public List<powerUnit> getAllPowerUnits();
    public void savePowerUnit(powerUnit powerUnit);
    public void deletePowerUnit(int id);
    public powerUnit getPowerUnit(int id);
}
