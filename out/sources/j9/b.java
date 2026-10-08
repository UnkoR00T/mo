package j9;

import java.util.Arrays;
import o8.l0;
import o8.q;
import o8.v;
import o8.w;
import o8.x;
import o8.y;
import w7.c0;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y f100349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f100350o;

    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f100351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y.a f100352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f100353c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f100354d = -1;

        public a(y yVar, y.a aVar) {
            this.f100351a = yVar;
            this.f100352b = aVar;
        }

        @Override // j9.g
        public long a(q qVar) {
            long j15 = this.f100354d;
            if (j15 < 0) {
                return -1L;
            }
            long j16 = -(j15 + 2);
            this.f100354d = -1L;
            return j16;
        }

        @Override // j9.g
        public l0 b() {
            p.w(this.f100353c != -1);
            return new x(this.f100351a, this.f100353c);
        }

        @Override // j9.g
        public void c(long j15) {
            long[] jArr = this.f100352b.f143244a;
            this.f100354d = jArr[o0.g(jArr, j15, true, true)];
        }

        public void d(long j15) {
            this.f100353c = j15;
        }
    }

    b() {
    }

    private int n(c0 c0Var) {
        int i15 = (c0Var.f()[2] & 255) >> 4;
        if (i15 == 6 || i15 == 7) {
            c0Var.g0(4);
            c0Var.Z();
        }
        int iK = v.k(c0Var, i15);
        c0Var.f0(0);
        return iK;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(c0 c0Var) {
        return c0Var.a() >= 5 && c0Var.Q() == 127 && c0Var.S() == 1179402563;
    }

    @Override // j9.i
    protected long f(c0 c0Var) {
        if (o(c0Var.f())) {
            return n(c0Var);
        }
        return -1L;
    }

    @Override // j9.i
    protected boolean i(c0 c0Var, long j15, i.b bVar) {
        byte[] bArrF = c0Var.f();
        y yVar = this.f100349n;
        if (yVar == null) {
            y yVar2 = new y(bArrF, 17);
            this.f100349n = yVar2;
            bVar.f100391a = yVar2.g(Arrays.copyOfRange(bArrF, 9, c0Var.j()), null).b().X("audio/ogg").Q();
            return true;
        }
        if ((bArrF[0] & 127) == 3) {
            y.a aVarG = w.g(c0Var);
            y yVarB = yVar.b(aVarG);
            this.f100349n = yVarB;
            this.f100350o = new a(yVarB, aVarG);
            return true;
        }
        if (!o(bArrF)) {
            return true;
        }
        a aVar = this.f100350o;
        if (aVar != null) {
            aVar.d(j15);
            bVar.f100392b = this.f100350o;
        }
        p.q(bVar.f100391a);
        return false;
    }

    @Override // j9.i
    protected void l(boolean z15) {
        super.l(z15);
        if (z15) {
            this.f100349n = null;
            this.f100350o = null;
        }
    }
}
