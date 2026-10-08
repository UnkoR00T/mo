package com.google.android.libraries.places.internal;

import android.content.Context;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
final class uz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r70 f33999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f34000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g20 f34001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ScheduledExecutorService f34002d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f34003e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Long f34004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    f10 f34005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f34006h;

    uz0(Context context, r70 r70Var) {
        this.f34000b = context;
        this.f33999a = r70Var;
        this.f34001c = h20.c(r70Var);
    }

    public final com.google.common.util.concurrent.q a() {
        f10 f10Var = this.f34005g;
        if (f10Var == null || f10Var.I() < Instant.now().getEpochSecond()) {
            return com.google.common.util.concurrent.k.d(b(), new zj.g() { // from class: com.google.android.libraries.places.internal.tz0
                @Override // zj.g
                public final /* synthetic */ Object apply(Object obj) {
                    String str = this.f33826a.f34006h;
                    if (str != null) {
                        return str;
                    }
                    throw new IllegalStateException("Signature not generated.");
                }
            }, com.google.common.util.concurrent.u.a());
        }
        String str = this.f34006h;
        if (str != null) {
            return com.google.common.util.concurrent.k.c(str);
        }
        throw new IllegalStateException("Signature not generated.");
    }

    public final com.google.common.util.concurrent.q b() {
        this.f34003e++;
        Context context = this.f34000b;
        j20 j20VarI = k20.I();
        j20VarI.A(context.getPackageName());
        k20 k20Var = (k20) j20VarI.H0();
        g20 g20Var = this.f34001c;
        com.google.common.util.concurrent.q qVarA = oq0.a(g20Var.b().b(h20.a(), g20Var.c()), k20Var);
        com.google.common.util.concurrent.k.a(qVarA, new rz0(this), com.google.common.util.concurrent.u.a());
        return qVarA;
    }

    final String c(long j15) {
        String packageName = this.f34000b.getPackageName();
        int length = packageName.length() + 1;
        long[] jArr = new long[length];
        jArr[0] = j15;
        int i15 = 0;
        while (i15 < packageName.length()) {
            int i16 = i15 + 1;
            jArr[i16] = ((long) packageName.codePointAt(i15)) & BodyPartID.bodyIdMax;
            i15 = i16;
        }
        long j16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            j16 = ((j16 * 1729) + jArr[i17]) % 131071;
        }
        String strValueOf = String.valueOf(j16);
        this.f34006h = strValueOf;
        return strValueOf;
    }
}
