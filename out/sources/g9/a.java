package g9;

import java.util.ArrayDeque;
import o8.q;
import t7.x;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f71273a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f71274b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f71275c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g9.b f71276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f71277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f71278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f71279g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f71280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f71281b;

        private b(int i15, long j15) {
            this.f71280a = i15;
            this.f71281b = j15;
        }
    }

    private long c(q qVar) {
        qVar.g();
        while (true) {
            qVar.p(this.f71273a, 0, 4);
            int iC = g.c(this.f71273a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f71273a, iC, false);
                if (this.f71276d.f(iA)) {
                    qVar.n(iC);
                    return iA;
                }
            }
            qVar.n(1);
        }
    }

    private double d(q qVar, int i15) {
        long jE = e(qVar, i15);
        return i15 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(q qVar, int i15) {
        qVar.readFully(this.f71273a, 0, i15);
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            j15 = (j15 << 8) | ((long) (this.f71273a[i16] & 255));
        }
        return j15;
    }

    private static String f(q qVar, int i15) {
        if (i15 == 0) {
            return "";
        }
        byte[] bArr = new byte[i15];
        qVar.readFully(bArr, 0, i15);
        while (i15 > 0 && bArr[i15 - 1] == 0) {
            i15--;
        }
        return new String(bArr, 0, i15);
    }

    @Override // g9.c
    public boolean a(q qVar) throws x {
        p.q(this.f71276d);
        while (true) {
            b bVarPeek = this.f71274b.peek();
            if (bVarPeek != null && qVar.getPosition() >= bVarPeek.f71281b) {
                this.f71276d.a(this.f71274b.pop().f71280a);
                return true;
            }
            if (this.f71277e == 0) {
                long jD = this.f71275c.d(qVar, true, false, 4);
                if (jD == -2) {
                    jD = c(qVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f71278f = (int) jD;
                this.f71277e = 1;
            }
            if (this.f71277e == 1) {
                this.f71279g = this.f71275c.d(qVar, false, true, 8);
                this.f71277e = 2;
            }
            int iE = this.f71276d.e(this.f71278f);
            if (iE != 0) {
                if (iE == 1) {
                    long position = qVar.getPosition();
                    this.f71274b.push(new b(this.f71278f, this.f71279g + position));
                    this.f71276d.h(this.f71278f, position, this.f71279g);
                    this.f71277e = 0;
                    return true;
                }
                if (iE == 2) {
                    long j15 = this.f71279g;
                    if (j15 <= 8) {
                        this.f71276d.d(this.f71278f, e(qVar, (int) j15));
                        this.f71277e = 0;
                        return true;
                    }
                    throw x.a("Invalid integer size: " + this.f71279g, null);
                }
                if (iE == 3) {
                    long j16 = this.f71279g;
                    if (j16 <= 2147483647L) {
                        this.f71276d.g(this.f71278f, f(qVar, (int) j16));
                        this.f71277e = 0;
                        return true;
                    }
                    throw x.a("String element size: " + this.f71279g, null);
                }
                if (iE == 4) {
                    this.f71276d.c(this.f71278f, (int) this.f71279g, qVar);
                    this.f71277e = 0;
                    return true;
                }
                if (iE != 5) {
                    throw x.a("Invalid element type " + iE, null);
                }
                long j17 = this.f71279g;
                if (j17 == 4 || j17 == 8) {
                    this.f71276d.b(this.f71278f, d(qVar, (int) j17));
                    this.f71277e = 0;
                    return true;
                }
                throw x.a("Invalid float size: " + this.f71279g, null);
            }
            qVar.n((int) this.f71279g);
            this.f71277e = 0;
        }
    }

    @Override // g9.c
    public void b(g9.b bVar) {
        this.f71276d = bVar;
    }

    @Override // g9.c
    public void reset() {
        this.f71277e = 0;
        this.f71274b.clear();
        this.f71275c.e();
    }
}
