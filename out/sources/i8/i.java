package i8;

import a8.a3;
import a8.y1;
import ak.n0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h8.c0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import l9.k;
import l9.l;
import l9.m;
import l9.p;
import l9.q;
import t7.w;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends a8.b implements Handler.Callback {
    private int A;
    private l B;
    private p C;
    private q D;
    private q E;
    private int F;
    private final Handler G;
    private final h H;
    private final y1 I;
    private boolean K;
    private boolean L;
    private t7.p O;
    private long P;
    private long R;
    private boolean T;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l9.b f89924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z7.f f89925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a f89926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g f89927y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f89928z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f89922a);
    }

    private void A0(m mVar) {
        t.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.O, mVar);
        w0();
        K0();
    }

    private static boolean B0(k kVar, long j15) {
        return kVar != null && kVar.j() > 0 && kVar.g(kVar.j() - 1) > j15;
    }

    private void C0() {
        this.f89928z = true;
        l lVarB = this.f89927y.b((t7.p) zj.p.q(this.O));
        this.B = lVarB;
        lVarB.f(a0());
    }

    private void D0(v7.c cVar) {
        this.H.p(cVar.f204208a);
        this.H.l(cVar);
    }

    private static boolean E0(t7.p pVar) {
        return Objects.equals(pVar.f188381p, "application/x-media3-cues");
    }

    private boolean F0(long j15) {
        if (this.K || s0(this.I, this.f89925w, 0) != -4) {
            return false;
        }
        if (this.f89925w.p()) {
            this.K = true;
            return false;
        }
        this.f89925w.y();
        ByteBuffer byteBuffer = (ByteBuffer) zj.p.q(this.f89925w.f233228d);
        l9.e eVarA = this.f89924v.a(this.f89925w.f233230f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f89925w.l();
        return this.f89926x.c(eVarA, j15);
    }

    private void G0() {
        this.C = null;
        this.F = -1;
        q qVar = this.D;
        if (qVar != null) {
            qVar.w();
            this.D = null;
        }
        q qVar2 = this.E;
        if (qVar2 != null) {
            qVar2.w();
            this.E = null;
        }
    }

    private void H0() {
        G0();
        ((l) zj.p.q(this.B)).b();
        this.B = null;
        this.A = 0;
    }

    private void I0(long j15) {
        boolean zF0 = F0(j15);
        long jD = this.f89926x.d(this.P);
        if (jD == Long.MIN_VALUE && this.K && !zF0) {
            this.L = true;
        }
        if (jD != Long.MIN_VALUE && jD <= j15) {
            zF0 = true;
        }
        if (zF0) {
            n0<v7.a> n0VarA = this.f89926x.a(j15);
            long jB = this.f89926x.b(j15);
            M0(new v7.c(n0VarA, z0(jB)));
            this.f89926x.e(jB);
        }
        this.P = j15;
    }

    private void J0(long j15) {
        boolean z15;
        this.P = j15;
        if (this.E == null) {
            ((l) zj.p.q(this.B)).c(j15);
            try {
                this.E = ((l) zj.p.q(this.B)).a();
            } catch (m e15) {
                A0(e15);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.D != null) {
            long jY0 = y0();
            z15 = false;
            while (jY0 <= j15) {
                this.F++;
                jY0 = y0();
                z15 = true;
            }
        } else {
            z15 = false;
        }
        q qVar = this.E;
        if (qVar != null) {
            if (qVar.p()) {
                if (!z15 && y0() == Long.MAX_VALUE) {
                    if (this.A == 2) {
                        K0();
                    } else {
                        G0();
                        this.L = true;
                    }
                }
            } else if (qVar.f233236b <= j15) {
                q qVar2 = this.D;
                if (qVar2 != null) {
                    qVar2.w();
                }
                this.F = qVar.b(j15);
                this.D = qVar;
                this.E = null;
                z15 = true;
            }
        }
        if (z15) {
            zj.p.q(this.D);
            M0(new v7.c(this.D.e(j15), z0(x0(j15))));
        }
        if (this.A == 2) {
            return;
        }
        while (!this.K) {
            try {
                p pVarG = this.C;
                if (pVarG == null) {
                    pVarG = ((l) zj.p.q(this.B)).g();
                    if (pVarG == null) {
                        return;
                    } else {
                        this.C = pVarG;
                    }
                }
                if (this.A == 1) {
                    pVarG.v(4);
                    ((l) zj.p.q(this.B)).e(pVarG);
                    this.C = null;
                    this.A = 2;
                    return;
                }
                int iS0 = s0(this.I, pVarG, 0);
                if (iS0 == -4) {
                    if (pVarG.p()) {
                        this.K = true;
                        this.f89928z = false;
                    } else {
                        t7.p pVar = this.I.f4794b;
                        if (pVar == null) {
                            return;
                        }
                        pVarG.f117241k = pVar.f188386u;
                        pVarG.y();
                        this.f89928z &= !pVarG.r();
                    }
                    if (!this.f89928z) {
                        ((l) zj.p.q(this.B)).e(pVarG);
                        this.C = null;
                    }
                } else if (iS0 == -3) {
                    return;
                }
            } catch (m e16) {
                A0(e16);
                return;
            }
        }
    }

    private void K0() {
        H0();
        C0();
    }

    private void M0(v7.c cVar) {
        Handler handler = this.G;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            D0(cVar);
        }
    }

    private void v0() {
        zj.p.C(this.T || Objects.equals(this.O.f188381p, "application/cea-608") || Objects.equals(this.O.f188381p, "application/x-mp4-cea-608") || Objects.equals(this.O.f188381p, "application/cea-708"), "Legacy decoding is disabled, can't handle %s samples (expected %s).", this.O.f188381p, "application/x-media3-cues");
    }

    private void w0() {
        M0(new v7.c(n0.C(), z0(this.P)));
    }

    private long x0(long j15) {
        int iB = this.D.b(j15);
        if (iB == 0 || this.D.j() == 0) {
            return this.D.f233236b;
        }
        if (iB != -1) {
            return this.D.g(iB - 1);
        }
        q qVar = this.D;
        return qVar.g(qVar.j() - 1);
    }

    private long y0() {
        if (this.F == -1) {
            return Long.MAX_VALUE;
        }
        zj.p.q(this.D);
        if (this.F >= this.D.j()) {
            return Long.MAX_VALUE;
        }
        return this.D.g(this.F);
    }

    private long z0(long j15) {
        zj.p.w(j15 != -9223372036854775807L);
        return j15 - e0();
    }

    public void L0(long j15) {
        zj.p.w(E());
        this.R = j15;
    }

    @Override // a8.a3
    public int a(t7.p pVar) {
        if (E0(pVar) || this.f89927y.a(pVar)) {
            return a3.y(pVar.Q == 0 ? 4 : 2);
        }
        return w.j(pVar.f188381p) ? a3.y(1) : a3.y(0);
    }

    @Override // a8.z2
    public boolean e() {
        return this.L;
    }

    @Override // a8.z2
    public boolean f() {
        t7.p pVar = this.O;
        if (pVar == null) {
            return true;
        }
        if (!E0((t7.p) zj.p.q(pVar))) {
            return !this.L && (!this.K || B0(this.D, this.P) || B0(this.E, this.P) || this.C == null);
        }
        if (((a) zj.p.q(this.f89926x)).d(this.P) != Long.MIN_VALUE) {
            return true;
        }
        try {
            B();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // a8.z2, a8.a3
    public String getName() {
        return "TextRenderer";
    }

    @Override // a8.z2
    public void h(long j15, long j16) {
        if (E()) {
            long j17 = this.R;
            if (j17 != -9223372036854775807L && j15 >= j17) {
                G0();
                this.L = true;
            }
        }
        if (this.L) {
            return;
        }
        if (E0((t7.p) zj.p.q(this.O))) {
            zj.p.q(this.f89926x);
            I0(j15);
        } else {
            v0();
            J0(j15);
        }
    }

    @Override // a8.b
    protected void h0() {
        this.O = null;
        this.R = -9223372036854775807L;
        w0();
        this.P = -9223372036854775807L;
        if (this.B != null) {
            H0();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        D0((v7.c) message.obj);
        return true;
    }

    @Override // a8.b
    protected void k0(long j15, boolean z15, boolean z16) {
        this.P = j15;
        a aVar = this.f89926x;
        if (aVar != null) {
            aVar.clear();
        }
        w0();
        this.K = false;
        this.L = false;
        this.R = -9223372036854775807L;
        t7.p pVar = this.O;
        if (pVar == null || E0(pVar)) {
            return;
        }
        if (this.A != 0) {
            K0();
            return;
        }
        G0();
        l lVar = (l) zj.p.q(this.B);
        lVar.flush();
        lVar.f(a0());
    }

    @Override // a8.b
    protected void q0(t7.p[] pVarArr, long j15, long j16, c0.b bVar) {
        t7.p pVar = pVarArr[0];
        this.O = pVar;
        if (E0(pVar)) {
            this.f89926x = this.O.N == 1 ? new e() : new f();
            return;
        }
        v0();
        if (this.B != null) {
            this.A = 1;
        } else {
            C0();
        }
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        this.H = (h) zj.p.q(hVar);
        this.G = looper == null ? null : o0.y(looper, this);
        this.f89927y = gVar;
        this.f89924v = new l9.b();
        this.f89925w = new z7.f(1);
        this.I = new y1();
        this.R = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.T = false;
    }
}
