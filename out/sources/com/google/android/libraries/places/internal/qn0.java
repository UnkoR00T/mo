package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class qn0 extends cf0 implements lo0 {
    private final nr0 A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private final gn0 G;
    private final po0 H;
    private final ao0 I;
    private boolean J;
    private final gr0 K;
    private mo0 L;
    private int M;
    final /* synthetic */ rn0 N;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f33426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Object f33427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f33428z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(rn0 rn0Var, int i15, im0 im0Var, Object obj, gn0 gn0Var, po0 po0Var, ao0 ao0Var, int i16, String str, f40 f40Var) {
        super(i15, im0Var, rn0Var.w(), f40Var);
        Objects.requireNonNull(rn0Var);
        this.N = rn0Var;
        this.A = new nr0();
        this.B = false;
        this.C = false;
        this.D = false;
        this.J = true;
        this.M = -1;
        this.f33427y = zj.p.r(obj, "lock");
        this.G = gn0Var;
        this.H = po0Var;
        this.I = ao0Var;
        this.E = i16;
        this.F = i16;
        this.f33426x = i16;
        this.K = fr0.a(str);
    }

    private final void V(l90 l90Var, boolean z15, a80 a80Var) throws EOFException {
        if (this.D) {
            return;
        }
        this.D = true;
        if (!this.J) {
            this.I.X(this.M, l90Var, hb0.PROCESSED, z15, ip0.CANCEL, a80Var);
            return;
        }
        this.I.T(this.N);
        this.f33428z = null;
        nr0 nr0Var = this.A;
        nr0Var.e1(nr0Var.K());
        this.J = false;
        if (a80Var == null) {
            a80Var = new a80();
        }
        z(l90Var, hb0.PROCESSED, true, a80Var);
    }

    @Override // com.google.android.libraries.places.internal.cf0
    protected final void K(l90 l90Var, boolean z15, a80 a80Var) throws EOFException {
        V(l90Var, false, a80Var);
    }

    public final void L(int i15) {
        zj.p.z(this.M == -1, "the stream has been started with id %s", i15);
        this.M = i15;
        po0 po0Var = this.H;
        this.L = po0Var.e(this, i15);
        rn0 rn0Var = this.N;
        qn0 qn0VarH = rn0Var.H();
        super.o();
        qn0VarH.q().a();
        if (this.J) {
            this.G.l1(false, false, this.M, 0, this.f33428z);
            rn0Var.F().b();
            this.f33428z = null;
            nr0 nr0Var = this.A;
            if (nr0Var.K() > 0) {
                po0Var.c(this.B, this.L, nr0Var, this.C);
            }
            this.J = false;
        }
    }

    public final void M(List list, boolean z15) {
        if (z15) {
            G(qo0.b(list));
        } else {
            E(qo0.a(list));
        }
    }

    public final void N(nr0 nr0Var, boolean z15, int i15) {
        int iK = this.E - (((int) nr0Var.K()) + i15);
        this.E = iK;
        this.F -= i15;
        if (iK >= 0) {
            super.F(new ho0(nr0Var), z15);
        } else {
            this.G.S(this.M, ip0.FLOW_CONTROL_ERROR);
            this.I.X(this.M, l90.f32814l.e("Received data size exceeded our receiving window size"), hb0.PROCESSED, false, null, null);
        }
    }

    final gr0 O() {
        return this.K;
    }

    final int P() {
        return this.M;
    }

    final mo0 Q() {
        mo0 mo0Var;
        synchronized (this.f33427y) {
            mo0Var = this.L;
        }
        return mo0Var;
    }

    final /* synthetic */ void R(l90 l90Var, boolean z15, a80 a80Var) throws EOFException {
        V(l90Var, true, null);
    }

    final /* synthetic */ void S(nr0 nr0Var, boolean z15, boolean z16) {
        if (this.D) {
            return;
        }
        if (!this.J) {
            zj.p.x(this.M != -1, "streamId should be set");
            this.H.c(z15, this.L, nr0Var, z16);
        } else {
            this.A.q1(nr0Var, (int) nr0Var.K());
            this.B |= z15;
            this.C |= z16;
        }
    }

    final /* synthetic */ void T(a80 a80Var, String str) {
        ao0 ao0Var = this.I;
        boolean zR = ao0Var.R();
        mp0 mp0Var = in0.f32577a;
        zj.p.r(a80Var, "headers");
        zj.p.r(str, "defaultPath");
        rn0 rn0Var = this.N;
        String strG = rn0Var.G();
        zj.p.r(strG, "authority");
        a80Var.d(ze0.f34501i);
        a80Var.d(ze0.f34502j);
        w70 w70Var = ze0.f34503k;
        a80Var.d(w70Var);
        ArrayList arrayList = new ArrayList(p60.d(a80Var) + 7);
        if (zR) {
            arrayList.add(in0.f32578b);
        } else {
            arrayList.add(in0.f32577a);
        }
        arrayList.add(in0.f32579c);
        String strE = rn0Var.E();
        rr0 rr0Var = mp0.f32982h;
        rr0 rr0Var2 = rr0.f33593d;
        arrayList.add(new mp0(rr0Var, qr0.a(strG)));
        arrayList.add(new mp0(mp0.f32980f, qr0.a(str)));
        arrayList.add(new mp0(w70Var.d(), strE));
        arrayList.add(in0.f32581e);
        arrayList.add(in0.f32582f);
        byte[][] bArrA = om0.a(a80Var);
        for (int i15 = 0; i15 < bArrA.length; i15 += 2) {
            rr0 rr0VarB = qr0.b(bArrA[i15]);
            if (rr0VarB.b().length != 0 && rr0VarB.b()[0] != 58) {
                arrayList.add(new mp0(rr0VarB, qr0.b(bArrA[i15 + 1])));
            }
        }
        this.f33428z = arrayList;
        ao0Var.S(rn0Var, rn0Var.G());
    }

    final /* synthetic */ Object U() {
        return this.f33427y;
    }

    @Override // com.google.android.libraries.places.internal.ii0
    public final void a(int i15) {
        int i16 = this.F - i15;
        this.F = i16;
        int i17 = this.f33426x;
        if (i16 <= i17 * 0.5f) {
            int i18 = i17 - i16;
            this.E += i18;
            this.F = i16 + i18;
            this.G.G2(this.M, i18);
        }
    }

    @Override // com.google.android.libraries.places.internal.da0, com.google.android.libraries.places.internal.ii0
    public final void c(boolean z15) {
        if (v()) {
            this.I.X(this.M, null, hb0.PROCESSED, false, null, null);
        } else {
            this.I.X(this.M, null, hb0.PROCESSED, false, ip0.CANCEL, null);
        }
        super.c(z15);
    }

    @Override // com.google.android.libraries.places.internal.ka0
    public final void d(Runnable runnable) {
        synchronized (this.f33427y) {
            runnable.run();
        }
    }

    @Override // com.google.android.libraries.places.internal.ii0
    public final void f(Throwable th4) throws EOFException {
        V(l90.b(th4), true, new a80());
    }
}
