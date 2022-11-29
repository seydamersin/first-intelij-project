package com.muates.example4;

import com.muates.example4.service.IKlavyeServis;
import com.muates.example4.service.IMonitorServis;
import com.muates.example4.service.IMouseServis;

public class Bilgisayar {

    private final IKlavyeServis klavyeServis;
    private final IMouseServis mouseServis;
    private final IMonitorServis monitorServis;

    public Bilgisayar(IKlavyeServis klavyeServis, IMouseServis mouseServis, IMonitorServis monitorServis) {
        this.klavyeServis = klavyeServis;
        this.mouseServis = mouseServis;
        this.monitorServis = monitorServis;
    }

    public void ozellikleriGetir() {
        klavyeServis.klavyeGetir();
        mouseServis.mouseGetir();
        monitorServis.monitorGetir();
    }
}
