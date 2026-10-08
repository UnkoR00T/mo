package j9;

import o8.q;
import o8.s;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import t7.x;
import w7.c0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f100366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f100367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f100368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f100369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f100370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f100371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f100372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f100373j = new int[GF2Field.MASK];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c0 f100374k = new c0(GF2Field.MASK);

    f() {
    }

    public boolean a(q qVar, boolean z15) throws x {
        b();
        this.f100374k.b0(27);
        if (!s.c(qVar, this.f100374k.f(), 0, 27, z15) || this.f100374k.S() != 1332176723) {
            return false;
        }
        int iQ = this.f100374k.Q();
        this.f100364a = iQ;
        if (iQ != 0) {
            if (z15) {
                return false;
            }
            throw x.c("unsupported bit stream revision");
        }
        this.f100365b = this.f100374k.Q();
        this.f100366c = this.f100374k.E();
        this.f100367d = this.f100374k.G();
        this.f100368e = this.f100374k.G();
        this.f100369f = this.f100374k.G();
        int iQ2 = this.f100374k.Q();
        this.f100370g = iQ2;
        this.f100371h = iQ2 + 27;
        this.f100374k.b0(iQ2);
        if (!s.c(qVar, this.f100374k.f(), 0, this.f100370g, z15)) {
            return false;
        }
        for (int i15 = 0; i15 < this.f100370g; i15++) {
            this.f100373j[i15] = this.f100374k.Q();
            this.f100372i += this.f100373j[i15];
        }
        return true;
    }

    public void b() {
        this.f100364a = 0;
        this.f100365b = 0;
        this.f100366c = 0L;
        this.f100367d = 0L;
        this.f100368e = 0L;
        this.f100369f = 0L;
        this.f100370g = 0;
        this.f100371h = 0;
        this.f100372i = 0;
    }

    public boolean c(q qVar) {
        return d(qVar, -1L);
    }

    public boolean d(q qVar, long j15) {
        p.d(qVar.getPosition() == qVar.j());
        this.f100374k.b0(4);
        while (true) {
            if ((j15 != -1 && qVar.getPosition() + 4 >= j15) || !s.c(qVar, this.f100374k.f(), 0, 4, true)) {
                break;
            }
            this.f100374k.f0(0);
            if (this.f100374k.S() == 1332176723) {
                qVar.g();
                return true;
            }
            qVar.n(1);
        }
        do {
            if (j15 != -1 && qVar.getPosition() >= j15) {
                break;
            }
        } while (qVar.b(1) != -1);
        return false;
    }
}
