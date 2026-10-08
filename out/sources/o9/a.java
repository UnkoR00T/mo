package o9;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import l9.e;
import l9.s;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.c0;
import w7.l;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f143358a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f143359b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3551a f143360c = new C3551a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f143361d;

    /* JADX INFO: renamed from: o9.a$a, reason: collision with other inner class name */
    private static final class C3551a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f143362a = new c0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f143363b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f143364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f143365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f143366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f143367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f143368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f143369h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f143370i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(c0 c0Var, int i15) {
            int iT;
            if (i15 < 4) {
                return;
            }
            c0Var.g0(3);
            int i16 = i15 - 4;
            if ((c0Var.Q() & 128) != 0) {
                if (i16 < 7 || (iT = c0Var.T()) < 4) {
                    return;
                }
                this.f143369h = c0Var.Y();
                this.f143370i = c0Var.Y();
                this.f143362a.b0(iT - 4);
                i16 = i15 - 11;
            }
            int iG = this.f143362a.g();
            int iJ = this.f143362a.j();
            if (iG >= iJ || i16 <= 0) {
                return;
            }
            int iMin = Math.min(i16, iJ - iG);
            c0Var.u(this.f143362a.f(), iG, iMin);
            this.f143362a.f0(iG + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(c0 c0Var, int i15) {
            if (i15 < 19) {
                return;
            }
            this.f143365d = c0Var.Y();
            this.f143366e = c0Var.Y();
            c0Var.g0(11);
            this.f143367f = c0Var.Y();
            this.f143368g = c0Var.Y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(c0 c0Var, int i15) {
            if (i15 % 5 != 2) {
                return;
            }
            c0Var.g0(2);
            Arrays.fill(this.f143363b, 0);
            int i16 = i15 / 5;
            for (int i17 = 0; i17 < i16; i17++) {
                int iQ = c0Var.Q();
                int iQ2 = c0Var.Q();
                int iQ3 = c0Var.Q();
                int iQ4 = c0Var.Q();
                double d15 = iQ2;
                double d16 = iQ3 - 128;
                double d17 = iQ4 - 128;
                this.f143363b[iQ] = (o0.o((int) ((d15 - (0.34414d * d17)) - (d16 * 0.71414d)), 0, GF2Field.MASK) << 8) | (c0Var.Q() << 24) | (o0.o((int) ((1.402d * d16) + d15), 0, GF2Field.MASK) << 16) | o0.o((int) (d15 + (d17 * 1.772d)), 0, GF2Field.MASK);
            }
            this.f143364c = true;
        }

        public v7.a d() {
            int iQ;
            if (this.f143365d == 0 || this.f143366e == 0 || this.f143369h == 0 || this.f143370i == 0 || this.f143362a.j() == 0 || this.f143362a.g() != this.f143362a.j() || !this.f143364c) {
                return null;
            }
            this.f143362a.f0(0);
            int i15 = this.f143369h * this.f143370i;
            int[] iArr = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int iQ2 = this.f143362a.Q();
                if (iQ2 != 0) {
                    iQ = i16 + 1;
                    iArr[i16] = this.f143363b[iQ2];
                } else {
                    int iQ3 = this.f143362a.Q();
                    if (iQ3 != 0) {
                        iQ = ((iQ3 & 64) == 0 ? iQ3 & 63 : ((iQ3 & 63) << 8) | this.f143362a.Q()) + i16;
                        Arrays.fill(iArr, i16, iQ, (iQ3 & 128) == 0 ? this.f143363b[0] : this.f143363b[this.f143362a.Q()]);
                    }
                }
                i16 = iQ;
            }
            return new v7.a.b().f(Bitmap.createBitmap(iArr, this.f143369h, this.f143370i, Bitmap.Config.ARGB_8888)).k(this.f143367f / this.f143365d).l(0).h(this.f143368g / this.f143366e, 0).i(0).n(this.f143369h / this.f143365d).g(this.f143370i / this.f143366e).a();
        }

        public void h() {
            this.f143365d = 0;
            this.f143366e = 0;
            this.f143367f = 0;
            this.f143368g = 0;
            this.f143369h = 0;
            this.f143370i = 0;
            this.f143362a.b0(0);
            this.f143364c = false;
        }
    }

    private static v7.a d(c0 c0Var, C3551a c3551a) {
        int iJ = c0Var.j();
        int iQ = c0Var.Q();
        int iY = c0Var.Y();
        int iG = c0Var.g() + iY;
        v7.a aVarD = null;
        if (iG > iJ) {
            c0Var.f0(iJ);
            return null;
        }
        if (iQ != 128) {
            switch (iQ) {
                case 20:
                    c3551a.g(c0Var, iY);
                    break;
                case 21:
                    c3551a.e(c0Var, iY);
                    break;
                case 22:
                    c3551a.f(c0Var, iY);
                    break;
            }
        } else {
            aVarD = c3551a.d();
            c3551a.h();
        }
        c0Var.f0(iG);
        return aVarD;
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<e> lVar) {
        this.f143358a.d0(bArr, i16 + i15);
        this.f143358a.f0(i15);
        if (this.f143361d == null) {
            this.f143361d = new Inflater();
        }
        if (o0.G0(this.f143358a, this.f143359b, this.f143361d)) {
            this.f143358a.d0(this.f143359b.f(), this.f143359b.j());
        }
        this.f143360c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f143358a.a() >= 3) {
            v7.a aVarD = d(this.f143358a, this.f143360c);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        lVar.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // l9.s
    public int c() {
        return 2;
    }
}
