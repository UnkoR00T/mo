package com.google.android.libraries.places.internal;

import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
final class rz0 implements com.google.common.util.concurrent.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uz0 f33638a;

    rz0(uz0 uz0Var) {
        Objects.requireNonNull(uz0Var);
        this.f33638a = uz0Var;
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        m20 m20Var = (m20) obj;
        long jI = ((long) m20Var.I()) & BodyPartID.bodyIdMax;
        final uz0 uz0Var = this.f33638a;
        uz0Var.f34004f = Long.valueOf(jI);
        uz0Var.f34005g = m20Var.J();
        Long l15 = uz0Var.f34004f;
        if (l15 != null) {
            uz0Var.f34006h = uz0Var.c(l15.longValue());
        }
        f10 f10Var = uz0Var.f34005g;
        if (f10Var != null) {
            long jI2 = (f10Var.I() - 3600) - Instant.now().getEpochSecond();
            if (jI2 <= 0) {
                return;
            }
            uz0Var.f34002d.schedule(new Callable() { // from class: com.google.android.libraries.places.internal.sz0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return uz0Var.b();
                }
            }, jI2, TimeUnit.SECONDS);
        }
    }

    @Override // com.google.common.util.concurrent.j
    public final void b(Throwable th4) {
        uz0 uz0Var = this.f33638a;
        uz0Var.f34004f = null;
        uz0Var.f34005g = null;
        uz0Var.f34006h = null;
    }
}
