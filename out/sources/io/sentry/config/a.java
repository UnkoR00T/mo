package io.sentry.config;

import io.sentry.util.d0;
import io.sentry.util.v;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Properties f94811b;

    protected a(String str, Properties properties) {
        this.f94810a = (String) v.c(str, "prefix is required");
        this.f94811b = (Properties) v.c(properties, "properties are required");
    }

    @Override // io.sentry.config.f
    public Map<String, String> a(String str) {
        String str2 = this.f94810a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f94811b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), d0.i((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        return d0.i(this.f94811b.getProperty(this.f94810a + str), "\"");
    }

    protected a(Properties properties) {
        this("", properties);
    }
}
