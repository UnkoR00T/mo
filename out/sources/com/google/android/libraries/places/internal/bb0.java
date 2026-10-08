package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bb0 extends yb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ km0 f31776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ eb0 f31777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb0(eb0 eb0Var, er0 er0Var, km0 km0Var) {
        super(eb0Var.f32188c.l());
        this.f31776b = km0Var;
        Objects.requireNonNull(eb0Var);
        this.f31777c = eb0Var;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0027 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return;
     */
    @Override // com.google.android.libraries.places.internal.yb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            int r0 = com.google.android.libraries.places.internal.fr0.f32341a
            com.google.android.libraries.places.internal.eb0 r0 = r5.f31777c
            com.google.android.libraries.places.internal.fb0 r1 = r0.f32188c
            com.google.android.libraries.places.internal.l90 r2 = r0.g()
            if (r2 != 0) goto L45
        Lc:
            com.google.android.libraries.places.internal.km0 r2 = r5.f31776b     // Catch: java.lang.Throwable -> L27
            java.io.InputStream r2 = r2.zza()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L44
            com.google.android.libraries.places.internal.j40 r3 = r0.f()     // Catch: java.lang.Throwable -> L29
            com.google.android.libraries.places.internal.f80 r4 = r1.i()     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.d(r2)     // Catch: java.lang.Throwable -> L29
            r3.b(r4)     // Catch: java.lang.Throwable -> L29
            r2.close()     // Catch: java.lang.Throwable -> L27
            goto Lc
        L27:
            r0 = move-exception
            goto L2e
        L29:
            r0 = move-exception
            com.google.android.libraries.places.internal.ze0.h(r2)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L2e:
            com.google.android.libraries.places.internal.km0 r1 = r5.f31776b
            com.google.android.libraries.places.internal.ze0.g(r1)
            com.google.android.libraries.places.internal.eb0 r1 = r5.f31777c
            com.google.android.libraries.places.internal.l90 r2 = com.google.android.libraries.places.internal.l90.f32808f
            com.google.android.libraries.places.internal.l90 r0 = r2.d(r0)
            java.lang.String r2 = "Failed to read message."
            com.google.android.libraries.places.internal.l90 r0 = r0.e(r2)
            r1.e(r0)
        L44:
            return
        L45:
            com.google.android.libraries.places.internal.km0 r0 = r5.f31776b
            com.google.android.libraries.places.internal.ze0.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.bb0.a():void");
    }
}
