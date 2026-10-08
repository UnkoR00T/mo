package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class rx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final rx f30612c = new rx();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30613d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f30615b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vx f30614a = new ax();

    private rx() {
    }

    public static rx a() {
        return f30612c;
    }

    public final ux b(Class cls) {
        kw.c(cls, "messageType");
        ux uxVar = (ux) this.f30615b.get(cls);
        if (uxVar != null) {
            return uxVar;
        }
        ux uxVarA = this.f30614a.a(cls);
        kw.c(cls, "messageType");
        ux uxVar2 = (ux) this.f30615b.putIfAbsent(cls, uxVarA);
        return uxVar2 == null ? uxVarA : uxVar2;
    }
}
