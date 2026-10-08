package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum f5 {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
