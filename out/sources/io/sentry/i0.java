package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i0 f95023b = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f95024a = new CopyOnWriteArrayList();

    public interface a {
    }

    private i0() {
    }

    public static i0 a() {
        return f95023b;
    }

    public void b(a aVar) {
        this.f95024a.add(aVar);
    }
}
