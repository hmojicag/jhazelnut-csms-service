package csms.controllers;

import csms.beans.JhCSMSResponseBean;
import csms.services.AutoSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController("autoSyncController")
public class AutoSyncController {

    @Autowired
    AutoSyncService autoSyncService;

    @RequestMapping(value = "/autosync/{userid}/{driveId1}/{driveId2}",
            method = RequestMethod.POST)
    public JhCSMSResponseBean autoSync(
            @PathVariable int userid,
            @PathVariable String driveId1,
            @PathVariable String driveId2
    ) {
        JhCSMSResponseBean bean = new JhCSMSResponseBean("lol");
        autoSyncService.autoSync(userid, driveId1, driveId2);
        return bean;
    }


}