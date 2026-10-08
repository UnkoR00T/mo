package com.google.android.libraries.places.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r51 extends androidx.p016lifecycle.t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f51 f33488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v51 f33489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a71 f33490d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f33492f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f33491e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.p016lifecycle.b0 f33493g = new androidx.p016lifecycle.b0();

    /* synthetic */ r51(f51 f51Var, v51 v51Var, a71 a71Var, byte[] bArr) {
        this.f33488b = f51Var;
        this.f33489c = v51Var;
        this.f33490d = a71Var;
    }

    private final void o9(a51 a51Var) {
        androidx.p016lifecycle.b0 b0Var = this.f33493g;
        if (a51Var.equals(b0Var.f())) {
            return;
        }
        b0Var.o(a51Var);
    }

    private static Status p9(Exception exc) {
        return exc instanceof hg.b ? ((hg.b) exc).a() : new Status(13, exc.getMessage());
    }

    private static boolean q9(Status status) {
        return status.y() || status.p() == 9012 || status.p() == 9011;
    }

    @Override // androidx.p016lifecycle.t0
    protected final void Y8() {
        try {
            this.f33488b.a();
            this.f33491e.removeCallbacks(this.f33492f);
            v51 v51Var = this.f33489c;
            v51Var.F();
            this.f33490d.a(v51Var);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    public final androidx.p016lifecycle.y Z8() {
        return this.f33493g;
    }

    public final void a9(Bundle bundle) {
        if (bundle == null) {
            this.f33493g.o(a51.h());
        }
    }

    public final void b9(final String str, final int i15) {
        this.f33489c.c(str);
        Runnable runnable = this.f33492f;
        if (runnable != null) {
            this.f33491e.removeCallbacks(runnable);
        }
        if (str.isEmpty()) {
            this.f33488b.a();
            o9(a51.i());
        } else {
            Runnable runnable2 = new Runnable() { // from class: com.google.android.libraries.places.internal.p51
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f33271a.l9(str, i15);
                }
            };
            this.f33492f = runnable2;
            this.f33491e.postDelayed(runnable2, 100L);
            o9(a51.j());
        }
    }

    public final void c9(final ii.h hVar, int i15) {
        v51 v51Var = this.f33489c;
        v51Var.D(i15);
        f51 f51Var = this.f33488b;
        if (f51Var.f() == k41.PLACES_UI_KIT) {
            ii.l0.b bVarA = ii.l0.a();
            bVarA.F(hVar.c());
            ii.l0 l0VarA = bVarA.a();
            v51Var.a();
            o9(a51.o(l0VarA));
            return;
        }
        if (f51Var.f() == k41.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) {
            v51Var.a();
            o9(a51.p(hVar, v51Var.p()));
        } else {
            vh.l lVarE = f51Var.e(hVar);
            if (!lVarE.p()) {
                o9(a51.j());
            }
            lVarE.c(new vh.f() { // from class: com.google.android.libraries.places.internal.n51
                @Override // vh.f
                public final /* synthetic */ void a(vh.l lVar) {
                    this.f33039a.n9(hVar, lVar);
                }
            });
        }
    }

    public final void d9() {
        this.f33489c.e();
    }

    public final void e9() {
        this.f33489c.d();
        b9("", 0);
    }

    public final void f9(String str, int i15) {
        this.f33488b.a();
        b9(str, i15);
        o9(a51.k());
    }

    public final void g9() {
        this.f33489c.f();
    }

    public final void h9() {
        this.f33489c.g();
    }

    public final void i9() {
        this.f33489c.E();
        o9(a51.r());
    }

    public final void j9() {
        this.f33488b.c();
    }

    public final void k9() {
        this.f33488b.d();
    }

    final /* synthetic */ void l9(final String str, int i15) {
        this.f33488b.b(str, i15).c(new vh.f() { // from class: com.google.android.libraries.places.internal.m51
            @Override // vh.f
            public final /* synthetic */ void a(vh.l lVar) {
                this.f32921a.m9(str, lVar);
            }
        });
    }

    final /* synthetic */ void m9(String str, vh.l lVar) {
        if (lVar.o()) {
            return;
        }
        Exception excL = lVar.l();
        if (excL == null) {
            this.f33489c.G();
            List<ii.h> listA = ((ji.h) lVar.m()).a();
            if (listA.isEmpty()) {
                o9(a51.m(str));
                return;
            } else {
                o9(a51.l(listA));
                return;
            }
        }
        String message = excL.getMessage();
        if (message != null && message.contains("Too many concurrent requests")) {
            this.f33489c.I();
            return;
        }
        this.f33489c.H();
        Status statusP9 = p9(excL);
        if (q9(statusP9)) {
            o9(a51.s(statusP9));
        } else {
            o9(a51.n(str, statusP9));
        }
    }

    final /* synthetic */ void n9(ii.h hVar, vh.l lVar) {
        if (lVar.o()) {
            return;
        }
        Exception excL = lVar.l();
        if (excL == null) {
            this.f33489c.a();
            o9(a51.o(((ji.d) lVar.m()).a()));
            return;
        }
        this.f33489c.b();
        Status statusP9 = p9(excL);
        if (q9(statusP9)) {
            o9(a51.s(statusP9));
        } else {
            o9(a51.q(hVar, statusP9));
        }
    }
}
