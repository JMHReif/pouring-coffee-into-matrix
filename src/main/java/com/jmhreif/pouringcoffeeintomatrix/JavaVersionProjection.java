package com.jmhreif.pouringcoffeeintomatrix;

import java.util.List;

public interface JavaVersionProjection {
    String getJavaVersion();
    List<FeatureProjection> getFeatures();

    interface FeatureProjection {
        String getTitle();
    }
}
