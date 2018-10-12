package io.pivotal.pal.tracker;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

public class TimeEntryInfoContributor implements InfoContributor {
    public TimeEntryInfoContributor() {
        super();
    }

    @Override
    public void contribute(Info.Builder builder) {

    }
}
