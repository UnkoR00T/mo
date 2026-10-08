package p8;

import java.io.EOFException;
import java.util.Arrays;
import o8.h0;
import o8.i;
import o8.k0;
import o8.l0;
import o8.n;
import o8.p;
import o8.q;
import o8.r;
import o8.s0;
import o8.u;
import t7.x;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f153390s = new u() { // from class: p8.a
        @Override // o8.u
        public final p[] f() {
            return b.h();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f153391t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f153392u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f153393v = o0.p0("#!AMR\n");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f153394w = o0.p0("#!AMR-WB\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f153395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f153396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0 f153397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f153398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f153399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f153400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f153401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f153402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f153403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f153404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f153405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f153406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private s0 f153407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private s0 f153408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l0 f153409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f153410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f153411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f153412r;

    public b() {
        this(0);
    }

    public static /* synthetic */ p[] h() {
        return new p[]{new b()};
    }

    private void i() {
        zj.p.q(this.f153407m);
        o0.h(this.f153406l);
    }

    private static int j(int i15, long j15) {
        return (int) ((((long) i15) * 8000000) / j15);
    }

    private l0 k(long j15, boolean z15) {
        return new i(j15, this.f153402h, j(this.f153403i, 20000L), this.f153403i, z15);
    }

    private int l(int i15) throws x {
        if (o(i15)) {
            return this.f153398d ? f153392u[i15] : f153391t[i15];
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Illegal AMR ");
        sb5.append(this.f153398d ? "WB" : "NB");
        sb5.append(" frame type ");
        sb5.append(i15);
        throw x.a(sb5.toString(), null);
    }

    private boolean m(int i15) {
        if (this.f153398d) {
            return false;
        }
        return i15 < 12 || i15 > 14;
    }

    private boolean n(long j15, long j16) {
        return Math.abs(j16 - j15) < 20000;
    }

    private boolean o(int i15) {
        if (i15 < 0 || i15 > 15) {
            return false;
        }
        return p(i15) || m(i15);
    }

    private boolean p(int i15) {
        if (this.f153398d) {
            return i15 < 10 || i15 > 13;
        }
        return false;
    }

    private void q() {
        if (this.f153412r) {
            return;
        }
        this.f153412r = true;
        boolean z15 = this.f153398d;
        String str = z15 ? "audio/amr-wb" : "audio/amr";
        this.f153407m.e(new t7.p.b().X(str).A0(z15 ? "audio/amr-wb" : "audio/3gpp").p0(z15 ? f153392u[8] : f153391t[7]).U(1).B0(z15 ? 16000 : 8000).Q());
    }

    private void r(long j15, int i15) {
        int i16;
        if (this.f153409o != null) {
            return;
        }
        int i17 = this.f153396b;
        if ((i17 & 4) != 0) {
            this.f153409o = new h0(new long[]{this.f153402h}, new long[]{0}, -9223372036854775807L);
        } else if ((i17 & 1) == 0 || !((i16 = this.f153403i) == -1 || i16 == this.f153400f)) {
            this.f153409o = new l0.b(-9223372036854775807L);
        } else if (this.f153404j >= 20 || i15 == -1) {
            l0 l0VarK = k(j15, (i17 & 2) != 0);
            this.f153409o = l0VarK;
            this.f153407m.d(l0VarK.h());
        }
        l0 l0Var = this.f153409o;
        if (l0Var != null) {
            this.f153406l.f(l0Var);
        }
    }

    private static boolean s(q qVar, byte[] bArr) {
        qVar.g();
        byte[] bArr2 = new byte[bArr.length];
        qVar.p(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int t(q qVar) throws x {
        qVar.g();
        qVar.p(this.f153395a, 0, 1);
        byte b15 = this.f153395a[0];
        if ((b15 & 131) <= 0) {
            return l((b15 >> 3) & 15);
        }
        throw x.a("Invalid padding bits for frame header " + ((int) b15), null);
    }

    private boolean u(q qVar) {
        byte[] bArr = f153393v;
        if (s(qVar, bArr)) {
            this.f153398d = false;
            qVar.n(bArr.length);
            return true;
        }
        byte[] bArr2 = f153394w;
        if (!s(qVar, bArr2)) {
            return false;
        }
        this.f153398d = true;
        qVar.n(bArr2.length);
        return true;
    }

    private int v(q qVar) throws x {
        if (this.f153401g == 0) {
            try {
                int iT = t(qVar);
                this.f153400f = iT;
                this.f153401g = iT;
                if (this.f153403i == -1) {
                    this.f153402h = qVar.getPosition();
                    this.f153403i = this.f153400f;
                }
                if (this.f153403i == this.f153400f) {
                    this.f153404j++;
                }
                l0 l0Var = this.f153409o;
                if (l0Var instanceof h0) {
                    h0 h0Var = (h0) l0Var;
                    long j15 = this.f153405k + this.f153399e + 20000;
                    long position = qVar.getPosition() + ((long) this.f153400f);
                    if (!h0Var.j(j15, 100000L)) {
                        h0Var.i(j15, position);
                    }
                    if (this.f153410p && n(j15, this.f153411q)) {
                        this.f153410p = false;
                        this.f153408n = this.f153407m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iF = this.f153408n.f(qVar, this.f153401g, true);
        if (iF == -1) {
            return -1;
        }
        int i15 = this.f153401g - iF;
        this.f153401g = i15;
        if (i15 > 0) {
            return 0;
        }
        this.f153408n.c(this.f153405k + this.f153399e, 1, this.f153400f, 0, null);
        this.f153399e += 20000;
        return 0;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f153399e = 0L;
        this.f153400f = 0;
        this.f153401g = 0;
        this.f153411q = j16;
        l0 l0Var = this.f153409o;
        if (!(l0Var instanceof h0)) {
            if (j15 == 0 || !(l0Var instanceof i)) {
                this.f153405k = 0L;
                return;
            } else {
                this.f153405k = ((i) l0Var).j(j15);
                return;
            }
        }
        long jF = ((h0) l0Var).f(j15);
        this.f153405k = jF;
        if (n(jF, this.f153411q)) {
            return;
        }
        this.f153410p = true;
        this.f153408n = this.f153397c;
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        return u(qVar);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f153406l = rVar;
        s0 s0VarV = rVar.v(0, 1);
        this.f153407m = s0VarV;
        this.f153408n = s0VarV;
        rVar.s();
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) throws x {
        i();
        if (qVar.getPosition() == 0 && !u(qVar)) {
            throw x.a("Could not find AMR header.", null);
        }
        q();
        int iV = v(qVar);
        r(qVar.a(), iV);
        if (iV == -1) {
            l0 l0Var = this.f153409o;
            if (l0Var instanceof h0) {
                long j15 = this.f153405k + this.f153399e;
                ((h0) l0Var).k(j15);
                this.f153406l.f(this.f153409o);
                this.f153407m.d(j15);
            }
        }
        return iV;
    }

    public b(int i15) {
        this.f153396b = (i15 & 2) != 0 ? i15 | 1 : i15;
        this.f153395a = new byte[1];
        this.f153403i = -1;
        n nVar = new n();
        this.f153397c = nVar;
        this.f153408n = nVar;
    }
}
