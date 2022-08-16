package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.ram;

import java.util.List;

public interface ramDAO {
    public List<ram> getAllRams();
    public void saveRam(ram ram);
    public void deleteRam(int id);
    public ram getRam(int id);
}
