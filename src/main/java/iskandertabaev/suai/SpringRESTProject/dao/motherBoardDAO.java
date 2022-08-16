package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.motherBoard;

import java.util.List;

public interface motherBoardDAO {
    public List<motherBoard> getAllMotherBoards();
    public void saveMotherBoard(motherBoard motherBoard);
    public void deleteMotherBoard(int id);
    public motherBoard getMotherBoard(int id);
}