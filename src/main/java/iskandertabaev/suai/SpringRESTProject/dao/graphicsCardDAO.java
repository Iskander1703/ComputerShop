package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.frame;
import iskandertabaev.suai.SpringRESTProject.Entity.graphicsCard;

import java.util.List;

public interface graphicsCardDAO {
    public List<graphicsCard> getAllGraphicsCard();
    public void saveGraphicsCard(graphicsCard graphicsCard);
    public void deleteGraphicsCard(int id);
    public graphicsCard getGraphicsCard(int id);
}