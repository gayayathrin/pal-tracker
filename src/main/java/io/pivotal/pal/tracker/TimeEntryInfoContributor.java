package io.pivotal.pal.tracker;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class TimeEntryInfoContributor implements InfoContributor {
    public TimeEntryInfoContributor() {
        super();
    }

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("example",
                Collections.singletonMap("author", "gayasavi"));

    }
}
