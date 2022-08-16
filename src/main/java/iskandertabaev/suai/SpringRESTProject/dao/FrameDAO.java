package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.frame;

import java.util.List;

public interface FrameDAO {
    public List<frame> getAllFrames();
    public void saveFrame(frame frame);
    public void deleteFrame(int id);
    public frame getFrame(int id);
}
