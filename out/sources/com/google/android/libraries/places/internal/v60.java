package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class v60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f34048b;

    private v60(String str, Object obj) {
        this.f34047a = str;
        this.f34048b = obj;
    }

    public static v60 a(String str) {
        zj.p.r("internal:health-check-consumer-listener", "debugString");
        return new v60("internal:health-check-consumer-listener", null);
    }

    public static v60 b(String str, Object obj) {
        zj.p.r("internal:disable-subchannel-reconnect", "debugString");
        return new v60("internal:disable-subchannel-reconnect", obj);
    }

    final /* synthetic */ Object c() {
        return this.f34048b;
    }

    public final String toString() {
        return this.f34047a;
    }
}
