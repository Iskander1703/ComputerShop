package iskandertabaev.suai.SpringRESTProject.service;



import iskandertabaev.suai.SpringRESTProject.Entity.*;

import java.awt.*;
import java.util.List;

public interface Service {
    public List<frame> getAllFrames();
    public void saveFrame(frame frame);
    public void deleteFrame(int id);
    public frame getFrame(int id);

    public List<graphicsCard> getAllGraphicsCards();
    public void saveGraphicsCard(graphicsCard graphicsCard);
    public void deleteGraphicsCard(int id);
    public graphicsCard getGraphicsCard(int id);

    public List<ram> getAllRams();
    public void saveRam(ram ram);
    public void deleteRam(int id);
    public ram getRam(int id);

    public List<powerUnit> getAllPowerUnits();
    public void savePowerUnit(powerUnit powerUnit);
    public void deletePowerUnit(int id);
    public powerUnit getPowerUnit(int id);

    public List<motherBoard> getAllMotherBoards();
    public void saveMotherBoard(motherBoard motherBoard);
    public void deleteMotherBoard(int id);
    public motherBoard getMotherBoard(int id);




}
