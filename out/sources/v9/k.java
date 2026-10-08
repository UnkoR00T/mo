package v9;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o8.s0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.c0 f205006a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f205008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f205009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f205010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f205011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f205012g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f205014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f205015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f205016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t7.p f205017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f205018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f205019n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f205013h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f205022q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f205007b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f205020o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f205021p = -1;

    public k(String str, int i15, int i16, String str2) {
        this.f205006a = new w7.c0(new byte[i16]);
        this.f205008c = str;
        this.f205009d = i15;
        this.f205010e = str2;
    }

    private boolean a(w7.c0 c0Var, byte[] bArr, int i15) {
        int iMin = Math.min(c0Var.a(), i15 - this.f205014i);
        c0Var.u(bArr, this.f205014i, iMin);
        int i16 = this.f205014i + iMin;
        this.f205014i = i16;
        return i16 == i15;
    }

    private void g() {
        byte[] bArrF = this.f205006a.f();
        if (this.f205017l == null) {
            t7.p pVarI = o8.o.i(bArrF, this.f205011f, this.f205008c, this.f205009d, this.f205010e, null);
            this.f205017l = pVarI;
            this.f205012g.e(pVarI);
        }
        this.f205018m = o8.o.b(bArrF);
        this.f205016k = ek.g.e(w7.o0.T0(o8.o.h(bArrF), this.f205017l.I));
    }

    private void h() throws t7.x {
        o8.o.b bVarJ = o8.o.j(this.f205006a.f());
        k(bVarJ);
        this.f205018m = bVarJ.f143180d;
        long j15 = bVarJ.f143181e;
        if (j15 == -9223372036854775807L) {
            j15 = 0;
        }
        this.f205016k = j15;
    }

    private void i() throws t7.x {
        o8.o.b bVarL = o8.o.l(this.f205006a.f(), this.f205007b);
        if (this.f205019n == 3) {
            k(bVarL);
        }
        this.f205018m = bVarL.f143180d;
        long j15 = bVarL.f143181e;
        if (j15 == -9223372036854775807L) {
            j15 = 0;
        }
        this.f205016k = j15;
    }

    private boolean j(w7.c0 c0Var) {
        while (c0Var.a() > 0) {
            int i15 = this.f205015j << 8;
            this.f205015j = i15;
            int iQ = i15 | c0Var.Q();
            this.f205015j = iQ;
            int iC = o8.o.c(iQ);
            this.f205019n = iC;
            if (iC != 0) {
                byte[] bArrF = this.f205006a.f();
                int i16 = this.f205015j;
                bArrF[0] = (byte) ((i16 >> 24) & GF2Field.MASK);
                bArrF[1] = (byte) ((i16 >> 16) & GF2Field.MASK);
                bArrF[2] = (byte) ((i16 >> 8) & GF2Field.MASK);
                bArrF[3] = (byte) (i16 & GF2Field.MASK);
                this.f205014i = 4;
                this.f205015j = 0;
                return true;
            }
        }
        return false;
    }

    private void k(o8.o.b bVar) {
        int i15;
        int i16 = bVar.f143178b;
        if (i16 == -2147483647 || (i15 = bVar.f143179c) == -1) {
            return;
        }
        t7.p pVar = this.f205017l;
        if (pVar != null && i15 == pVar.H && i16 == pVar.I && Objects.equals(bVar.f143177a, pVar.f188381p)) {
            return;
        }
        t7.p pVar2 = this.f205017l;
        t7.p pVarQ = (pVar2 == null ? new t7.p.b() : pVar2.b()).k0(this.f205011f).X(this.f205010e).A0(bVar.f143177a).U(bVar.f143179c).B0(bVar.f143178b).o0(this.f205008c).y0(this.f205009d).Q();
        this.f205017l = pVarQ;
        this.f205012g.e(pVarQ);
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) throws t7.x {
        zj.p.q(this.f205012g);
        while (c0Var.a() > 0) {
            switch (this.f205013h) {
                case 0:
                    if (j(c0Var)) {
                        int i15 = this.f205019n;
                        if (i15 == 3 || i15 == 4) {
                            this.f205013h = 4;
                        } else if (i15 != 1) {
                            this.f205013h = 2;
                        } else {
                            this.f205013h = 1;
                        }
                    }
                    break;
                case 1:
                    if (a(c0Var, this.f205006a.f(), 18)) {
                        g();
                        this.f205006a.f0(0);
                        this.f205012g.a(this.f205006a, 18);
                        this.f205013h = 6;
                    }
                    break;
                case 2:
                    if (a(c0Var, this.f205006a.f(), 7)) {
                        this.f205020o = o8.o.k(this.f205006a.f());
                        this.f205013h = 3;
                    }
                    break;
                case 3:
                    if (a(c0Var, this.f205006a.f(), this.f205020o)) {
                        h();
                        this.f205006a.f0(0);
                        this.f205012g.a(this.f205006a, this.f205020o);
                        this.f205013h = 6;
                    }
                    break;
                case 4:
                    if (a(c0Var, this.f205006a.f(), 6)) {
                        int iM = o8.o.m(this.f205006a.f());
                        this.f205021p = iM;
                        int i16 = this.f205014i;
                        if (i16 > iM) {
                            int i17 = i16 - iM;
                            this.f205014i = i16 - i17;
                            c0Var.f0(c0Var.g() - i17);
                        }
                        this.f205013h = 5;
                    }
                    break;
                case 5:
                    if (a(c0Var, this.f205006a.f(), this.f205021p)) {
                        i();
                        this.f205006a.f0(0);
                        this.f205012g.a(this.f205006a, this.f205021p);
                        this.f205013h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c0Var.a(), this.f205018m - this.f205014i);
                    this.f205012g.a(c0Var, iMin);
                    int i18 = this.f205014i + iMin;
                    this.f205014i = i18;
                    if (i18 == this.f205018m) {
                        zj.p.w(this.f205022q != -9223372036854775807L);
                        this.f205012g.c(this.f205022q, this.f205019n == 4 ? 0 : 1, this.f205018m, 0, null);
                        this.f205022q += this.f205016k;
                        this.f205013h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f205013h = 0;
        this.f205014i = 0;
        this.f205015j = 0;
        this.f205022q = -9223372036854775807L;
        this.f205007b.set(0);
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205011f = dVar.b();
        this.f205012g = rVar.v(dVar.c(), 1);
    }

    @Override // v9.m
    public void e(boolean z15) {
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205022q = j15;
    }
}
