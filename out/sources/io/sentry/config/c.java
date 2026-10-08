package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f94815a;

    public c(List<f> list) {
        this.f94815a = list;
    }

    @Override // io.sentry.config.f
    public Map<String, String> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<f> it = this.f94815a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().a(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        Iterator<f> it = this.f94815a.iterator();
        while (it.hasNext()) {
            String property = it.next().getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
