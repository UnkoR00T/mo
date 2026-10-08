package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class fm0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final fm0 f32314c = new fm0(new bm0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f32315a = new IdentityHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f32316b;

    fm0(bm0 bm0Var) {
    }

    public static Object a(em0 em0Var) {
        return f32314c.c(em0Var);
    }

    public static Object b(em0 em0Var, Object obj) {
        f32314c.d(em0Var, obj);
        return null;
    }

    final synchronized Object c(em0 em0Var) {
        dm0 dm0Var;
        try {
            IdentityHashMap identityHashMap = this.f32315a;
            dm0Var = (dm0) identityHashMap.get(em0Var);
            if (dm0Var == null) {
                dm0Var = new dm0(em0Var.zzb());
                identityHashMap.put(em0Var, dm0Var);
            }
            ScheduledFuture scheduledFuture = dm0Var.f32062c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                dm0Var.f32062c = null;
            }
            dm0Var.f32061b++;
        } catch (Throwable th4) {
            throw th4;
        }
        return dm0Var.f32060a;
    }

    final synchronized Object d(em0 em0Var, Object obj) {
        try {
            dm0 dm0Var = (dm0) this.f32315a.get(em0Var);
            if (dm0Var == null) {
                throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(em0Var)));
            }
            zj.p.e(obj == dm0Var.f32060a, "Releasing the wrong instance");
            zj.p.x(dm0Var.f32061b > 0, "Refcount has already reached zero");
            int i15 = dm0Var.f32061b - 1;
            dm0Var.f32061b = i15;
            if (i15 == 0) {
                zj.p.x(dm0Var.f32062c == null, "Destroy task already scheduled");
                if (this.f32316b == null) {
                    this.f32316b = Executors.newSingleThreadScheduledExecutor(ze0.d("grpc-shared-destroyer-%d", true));
                }
                dm0Var.f32062c = this.f32316b.schedule(new hg0(new cm0(this, dm0Var, em0Var, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return null;
    }

    final /* synthetic */ IdentityHashMap e() {
        return this.f32315a;
    }

    final /* synthetic */ ScheduledExecutorService f() {
        return this.f32316b;
    }

    final /* synthetic */ void g(ScheduledExecutorService scheduledExecutorService) {
        this.f32316b = null;
    }
}
