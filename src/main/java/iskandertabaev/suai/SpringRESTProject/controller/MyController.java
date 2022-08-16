package iskandertabaev.suai.SpringRESTProject.controller;

import iskandertabaev.suai.SpringRESTProject.Entity.*;
import iskandertabaev.suai.SpringRESTProject.exception_handing.NoSychException;
import iskandertabaev.suai.SpringRESTProject.service.Service;
import iskandertabaev.suai.SpringRESTProject.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/mcga")
public class MyController {

    @Autowired
    private Service service;

    @GetMapping("api/frame/{id}")
    public frame getFrame(@PathVariable int id)
    {
        frame frame =service.getFrame(id);
        if (frame==null)
        {
            throw new NoSychException("Frame with id = "+id+" not found in Database");
        }
        return frame;
    }

    @GetMapping("api/graphicsCard/{id}")
    public graphicsCard getGraphicsCard(@PathVariable int id)
    {
        graphicsCard graphicsCard =service.getGraphicsCard(id);
        if (graphicsCard==null)
        {
            throw new NoSychException("Graphics Card with id = "+id+" not found in Database");
        }
        return graphicsCard;
    }

    @GetMapping("api/motherBoard/{id}")
    public motherBoard getMotherBoard(@PathVariable int id)
    {
        motherBoard motherBoard =service.getMotherBoard(id);
        if (motherBoard==null)
        {
            throw new NoSychException("Mother Board with id = "+id+" not found in Database");
        }
        return motherBoard;
    }

    @GetMapping("api/powerUnit/{id}")
    public powerUnit getPowerUnit(@PathVariable int id)
    {
        powerUnit powerUnit =service.getPowerUnit(id);
        if (powerUnit==null)
        {
            throw new NoSychException("Power Unit with id = "+id+" not found in Database");
        }
        return powerUnit;
    }

    @GetMapping("api/ram/{id}")
    public ram getRam(@PathVariable int id)
    {
        ram ram =service.getRam(id);
        if (ram==null)
        {
            throw new NoSychException("Ram with id = "+id+" not found in Database");
        }
        return ram;
    }

    @GetMapping("/api/frames")
    public List<frame> showAllFrames() {
        List<frame> frameList = service.getAllFrames();
        return frameList;

    }

    @GetMapping("/api/rams")
    public List<ram> showAllRams() {
        List<ram> ramList = service.getAllRams();
        return ramList;

    }

    @GetMapping("/api/graphicsCards")
    public List<graphicsCard> showAllGraphicsCards() {
        List<graphicsCard> graphicsCardList = service.getAllGraphicsCards();
        return graphicsCardList;

    }

    @GetMapping("/api/motherBoards")
    public List<motherBoard> showAllMotherBoards() {
        List<motherBoard> motherBoardList = service.getAllMotherBoards();
        return motherBoardList;

    }

    @GetMapping("/api/powerUnits")
    public List<powerUnit> showAllPowerUnit() {
        List<powerUnit> powerUnitList = service.getAllPowerUnits();
        return powerUnitList;

    }

    @DeleteMapping("/api/deleteFrame/{id}")
    public void deleteFrame(@PathVariable int id) {
        service.deleteFrame(id);
    }

    @DeleteMapping("/api/deleteRam/{id}")
    public void deleteRam(@PathVariable int id) {
        service.deleteRam(id);
    }

    @DeleteMapping("/api/deletePowerUnit/{id}")
    public void deletePowerUnit(@PathVariable int id) {
        service.deletePowerUnit(id);
    }

    @DeleteMapping("/api/deleteGraphicsCard/{id}")
    public void deleteGraphicsCard(@PathVariable int id) {
        service.deleteGraphicsCard(id);
    }

    @DeleteMapping("/api/deleteMotherBoard/{id}")
    public void deleteMotherBoard(@PathVariable int id) {
        service.deleteMotherBoard(id);
    }

    @PostMapping("/api/frames")
    public frame addNewFrame(@RequestBody frame frame) {
        service.saveFrame(frame);
        return frame;
    }

    @PostMapping("/api/rams")
    public ram addNewRam(@RequestBody ram ram) {
        service.saveRam(ram);
        return ram;
    }

    @PostMapping("/api/powerUnit")
    public powerUnit addNewPowerUnit(@RequestBody powerUnit powerUnit) {
        service.savePowerUnit(powerUnit);
        return powerUnit;
    }

    @PostMapping("/api/motherBoard")
    public motherBoard addNewMotherBoard(@RequestBody motherBoard motherBoard) {
        service.saveMotherBoard(motherBoard);
        return motherBoard;
    }

    @PostMapping("/api/graphicsCard")
    public graphicsCard addNewGraphicsCard(@RequestBody graphicsCard graphicsCard) {
        service.saveGraphicsCard(graphicsCard);
        return graphicsCard;
    }


}
