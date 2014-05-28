package com.gttn.mapmodule;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gttn.mapmodule.domain.Mapmodule;

@RooWebJson(jsonObject = Mapmodule.class)
@Controller
@RequestMapping("/mapmodules")
@RooWebScaffold(path = "mapmodules", formBackingObject = Mapmodule.class)
public class MapmoduleController {
    @RequestMapping(value = "/map", produces = "text/html")
    public String map( Model uiModel) {
        //uiModel.addAttribute("mapmodule", mapmoduleRepository.findOne(id));
        //uiModel.addAttribute("itemId", id);
        return "mapmodules/map";
    }
}
