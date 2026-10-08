package j9;

import ak.n0;
import java.util.ArrayList;
import java.util.Arrays;
import o8.v0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import t7.x;
import w7.c0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f100393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f100394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f100395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v0.c f100396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v0.a f100397r;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0.c f100398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0.a f100399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f100400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v0.b[] f100401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f100402e;

        public a(v0.c cVar, v0.a aVar, byte[] bArr, v0.b[] bVarArr, int i15) {
            this.f100398a = cVar;
            this.f100399b = aVar;
            this.f100400c = bArr;
            this.f100401d = bVarArr;
            this.f100402e = i15;
        }
    }

    j() {
    }

    static void n(c0 c0Var, long j15) {
        if (c0Var.b() < c0Var.j() + 4) {
            c0Var.c0(Arrays.copyOf(c0Var.f(), c0Var.j() + 4));
        } else {
            c0Var.e0(c0Var.j() + 4);
        }
        byte[] bArrF = c0Var.f();
        bArrF[c0Var.j() - 4] = (byte) (j15 & 255);
        bArrF[c0Var.j() - 3] = (byte) ((j15 >>> 8) & 255);
        bArrF[c0Var.j() - 2] = (byte) ((j15 >>> 16) & 255);
        bArrF[c0Var.j() - 1] = (byte) ((j15 >>> 24) & 255);
    }

    private static int o(byte b15, a aVar) {
        return !aVar.f100401d[p(b15, aVar.f100402e, 1)].f143211a ? aVar.f100398a.f143221g : aVar.f100398a.f143222h;
    }

    static int p(byte b15, int i15, int i16) {
        return (b15 >> i16) & (GF2Field.MASK >>> (8 - i15));
    }

    public static boolean r(c0 c0Var) {
        try {
            return v0.o(1, c0Var, true);
        } catch (x unused) {
            return false;
        }
    }

    @Override // j9.i
    protected void e(long j15) {
        super.e(j15);
        this.f100395p = j15 != 0;
        v0.c cVar = this.f100396q;
        this.f100394o = cVar != null ? cVar.f143221g : 0;
    }

    @Override // j9.i
    protected long f(c0 c0Var) {
        if ((c0Var.f()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(c0Var.f()[0], (a) p.q(this.f100393n));
        long j15 = this.f100395p ? (this.f100394o + iO) / 4 : 0;
        n(c0Var, j15);
        this.f100395p = true;
        this.f100394o = iO;
        return j15;
    }

    @Override // j9.i
    protected boolean i(c0 c0Var, long j15, i.b bVar) throws x {
        if (this.f100393n != null) {
            p.q(bVar.f100391a);
            return false;
        }
        a aVarQ = q(c0Var);
        this.f100393n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        v0.c cVar = aVarQ.f100398a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f143224j);
        arrayList.add(aVarQ.f100400c);
        bVar.f100391a = new t7.p.b().X("audio/ogg").A0("audio/vorbis").T(cVar.f143219e).u0(cVar.f143218d).U(cVar.f143216b).B0(cVar.f143217c).l0(arrayList).s0(v0.d(n0.w(aVarQ.f100399b.f143209b))).Q();
        return true;
    }

    @Override // j9.i
    protected void l(boolean z15) {
        super.l(z15);
        if (z15) {
            this.f100393n = null;
            this.f100396q = null;
            this.f100397r = null;
        }
        this.f100394o = 0;
        this.f100395p = false;
    }

    a q(c0 c0Var) throws x {
        v0.c cVar = this.f100396q;
        if (cVar == null) {
            this.f100396q = v0.l(c0Var);
            return null;
        }
        v0.a aVar = this.f100397r;
        if (aVar == null) {
            this.f100397r = v0.j(c0Var);
            return null;
        }
        byte[] bArr = new byte[c0Var.j()];
        System.arraycopy(c0Var.f(), 0, bArr, 0, c0Var.j());
        v0.b[] bVarArrM = v0.m(c0Var, cVar.f143216b);
        return new a(cVar, aVar, bArr, bVarArrM, v0.b(bVarArrM.length - 1));
    }
}
