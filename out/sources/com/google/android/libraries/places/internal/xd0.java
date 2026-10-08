package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class xd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p80 f34265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae0 f34266b;

    xd0(ae0 ae0Var, p80 p80Var) {
        Objects.requireNonNull(ae0Var);
        this.f34266b = ae0Var;
        this.f34265a = (p80) zj.p.r(p80Var, "savedListener");
    }

    final /* synthetic */ void a(IOException iOException) {
        String strH = this.f34266b.h();
        q80 q80VarA = r80.a();
        q80VarA.a(n90.b(l90.f32815m.e("Unable to resolve host ".concat(String.valueOf(strH))).d(iOException)));
        this.f34265a.a(q80VarA.c());
    }

    final /* synthetic */ void b(r80 r80Var) {
        this.f34265a.a(r80Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger = ae0.f31590s;
        Level level = Level.FINER;
        if (logger.isLoggable(level)) {
            ae0.f31590s.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(this.f34266b.h())));
        }
        final r80 r80VarE = null;
        boolean z15 = true;
        try {
            try {
                ae0 ae0Var = this.f34266b;
                p50 p50VarF = ae0Var.f();
                if (p50VarF != null) {
                    if (ae0.f31590s.isLoggable(level)) {
                        Logger logger2 = ae0.f31590s;
                        String string = p50VarF.toString();
                        StringBuilder sb5 = new StringBuilder(string.length() + 20);
                        sb5.append("Using proxy address ");
                        sb5.append(string);
                        logger2.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", sb5.toString());
                    }
                    q80 q80VarA = r80.a();
                    q80VarA.a(n90.a(Collections.singletonList(p50VarF)));
                    r80VarE = q80VarA.c();
                } else {
                    r80VarE = ae0Var.e();
                }
                u90 u90VarJ = ae0Var.j();
                u90VarJ.c(new Runnable() { // from class: com.google.android.libraries.places.internal.vd0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f34061a.b(r80VarE);
                    }
                });
                u90VarJ.a();
                if (!r80VarE.b().c()) {
                    z15 = false;
                }
            } catch (IOException e15) {
                u90 u90VarJ2 = this.f34266b.j();
                u90VarJ2.c(new Runnable() { // from class: com.google.android.libraries.places.internal.wd0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f34150a.a(e15);
                    }
                });
                u90VarJ2.a();
                if (r80VarE == null || !r80VarE.b().c()) {
                }
            }
            ae0 ae0Var2 = this.f34266b;
            ud0 ud0Var = new ud0(this, z15);
            u90 u90VarJ3 = ae0Var2.j();
            u90VarJ3.c(ud0Var);
            u90VarJ3.a();
        } catch (Throwable th4) {
            z15 = r80VarE != null && r80VarE.b().c();
            ae0 ae0Var3 = this.f34266b;
            ud0 ud0Var2 = new ud0(this, z15);
            u90 u90VarJ4 = ae0Var3.j();
            u90VarJ4.c(ud0Var2);
            u90VarJ4.a();
            throw th4;
        }
    }
}
