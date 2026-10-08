package com.google.android.libraries.places.internal;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class fw0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f32345d = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kh.c f32346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m31 f32347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f32348c;

    fw0(Context context, kh.c cVar, m31 m31Var) {
        this.f32348c = context;
        this.f32346a = cVar;
        this.f32347b = m31Var;
    }

    public final vh.l a(vh.a aVar) {
        kh.a.C2669a c2669a = new kh.a.C2669a();
        long j15 = f32345d;
        kh.a.C2669a c2669aB = c2669a.b(j15);
        if (u5.a.a(this.f32348c, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            c2669aB.c(100);
        } else {
            c2669aB.c(102);
        }
        return this.f32347b.a(this.f32346a.a(c2669aB.a(), aVar), aVar, j15, "Location timeout.").k(new ew0(this));
    }
}
