package t9;

import ak.n0;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import l9.e;
import l9.s;
import w7.b0;
import w7.c0;
import w7.l;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f188943e = new e(n0.C(), -9223372036854775807L, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f188944a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f188945b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f188946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f188947d;

    private static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f188951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f188952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int[] f188953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f188954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f188955h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Rect f188956i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f188949b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f188950c = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f188948a = new int[4];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f188957j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f188958k = -1;

        /* JADX INFO: renamed from: t9.a$b$a, reason: collision with other inner class name */
        private static final class C4905a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f188959a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f188960b;

            private C4905a() {
            }
        }

        private static int e(int[] iArr, int i15) {
            return (i15 < 0 || i15 >= iArr.length) ? iArr[0] : iArr[i15];
        }

        private static int f(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException e15) {
                t.i("VobsubParser", "Parsing color failed", e15);
                return 0;
            }
        }

        private boolean g(long j15, c0 c0Var) {
            int iQ = c0Var.Q();
            if (iQ == 255) {
                return false;
            }
            switch (iQ) {
                case 1:
                    this.f188949b = j15;
                case 0:
                    return true;
                case 2:
                    this.f188950c = j15;
                    return true;
                case 3:
                    return j(c0Var);
                case 4:
                    return h(c0Var);
                case 5:
                    return i(c0Var);
                case 6:
                    return k(c0Var);
                default:
                    t.h("VobsubParser", "Unrecognized command: " + iQ);
                    return false;
            }
        }

        private boolean h(c0 c0Var) {
            if (c0Var.a() < 2) {
                t.h("VobsubParser", "Incomplete alpha command");
                return false;
            }
            if (!this.f188952e) {
                t.h("VobsubParser", "Ignoring alpha command before color command");
                return false;
            }
            int iQ = c0Var.Q();
            int iQ2 = c0Var.Q();
            int[] iArr = this.f188948a;
            iArr[3] = r(iArr[3], iQ >> 4);
            int[] iArr2 = this.f188948a;
            iArr2[2] = r(iArr2[2], iQ & 15);
            int[] iArr3 = this.f188948a;
            iArr3[1] = r(iArr3[1], iQ2 >> 4);
            int[] iArr4 = this.f188948a;
            iArr4[0] = r(iArr4[0], iQ2 & 15);
            return true;
        }

        private boolean i(c0 c0Var) {
            if (c0Var.a() < 6) {
                t.h("VobsubParser", "Incomplete area command");
                return false;
            }
            int iQ = c0Var.Q();
            int iQ2 = c0Var.Q();
            int i15 = (iQ << 4) | (iQ2 >> 4);
            int iQ3 = ((iQ2 & 15) << 8) | c0Var.Q();
            int iQ4 = c0Var.Q();
            int iQ5 = c0Var.Q();
            this.f188956i = new Rect(i15, (iQ4 << 4) | (iQ5 >> 4), iQ3 + 1, (c0Var.Q() | ((iQ5 & 15) << 8)) + 1);
            return true;
        }

        private boolean j(c0 c0Var) {
            if (c0Var.a() < 2) {
                t.h("VobsubParser", "Incomplete color command");
                return false;
            }
            int iQ = c0Var.Q();
            int iQ2 = c0Var.Q();
            this.f188948a[3] = e(this.f188953f, iQ >> 4);
            this.f188948a[2] = e(this.f188953f, iQ & 15);
            this.f188948a[1] = e(this.f188953f, iQ2 >> 4);
            this.f188948a[0] = e(this.f188953f, iQ2 & 15);
            this.f188952e = true;
            return true;
        }

        private boolean k(c0 c0Var) {
            if (c0Var.a() < 4) {
                t.h("VobsubParser", "Incomplete offsets command");
                return false;
            }
            this.f188957j = c0Var.Y();
            this.f188958k = c0Var.Y();
            return true;
        }

        private boolean l(c0 c0Var, int i15) {
            boolean z15 = false;
            if (c0Var.a() < 4) {
                return false;
            }
            int iG = c0Var.g();
            int iY = c0Var.Y() * 10000;
            int iY2 = i15 + c0Var.Y();
            boolean zG = true;
            if (iY2 != iG && iY2 < c0Var.j()) {
                z15 = true;
            }
            int iJ = z15 ? iY2 : c0Var.j();
            while (c0Var.g() < iJ && zG) {
                zG = g(iY, c0Var);
            }
            if (z15) {
                c0Var.f0(iY2);
            }
            return z15;
        }

        private void n(b0 b0Var, boolean z15, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i15 = !z15 ? 1 : 0;
            int i16 = i15 * iWidth;
            C4905a c4905a = new C4905a();
            while (true) {
                int i17 = 0;
                do {
                    o(b0Var, iWidth, c4905a);
                    int iMin = Math.min(c4905a.f188960b, iWidth - i17);
                    if (iMin > 0) {
                        int i18 = i16 + iMin;
                        Arrays.fill(iArr, i16, i18, this.f188948a[c4905a.f188959a]);
                        i17 += iMin;
                        i16 = i18;
                    }
                } while (i17 < iWidth);
                i15 += 2;
                if (i15 >= iHeight) {
                    return;
                }
                i16 = i15 * iWidth;
                b0Var.c();
            }
        }

        private static void o(b0 b0Var, int i15, C4905a c4905a) {
            int iH = 0;
            for (int i16 = 1; iH < i16 && i16 <= 64; i16 <<= 2) {
                if (b0Var.b() < 4) {
                    c4905a.f188959a = -1;
                    c4905a.f188960b = 0;
                    return;
                }
                iH = (iH << 4) | b0Var.h(4);
            }
            c4905a.f188959a = iH & 3;
            if (iH >= 4) {
                i15 = iH >> 2;
            }
            c4905a.f188960b = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(c0 c0Var) {
            if (this.f188953f == null) {
                t.h("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (!this.f188951d) {
                    t.h("VobsubParser", "Skipping SPU (no plane)");
                    return;
                }
                int iG = c0Var.g() - 2;
                c0Var.f0(c0Var.Y() + iG);
                while (l(c0Var, iG)) {
                }
            }
        }

        private static int r(int i15, int i16) {
            return (i15 & 16777215) | ((i16 * 17) << 24);
        }

        public v7.a d(c0 c0Var) {
            Rect rect;
            if (this.f188953f == null || !this.f188951d || !this.f188952e || (rect = this.f188956i) == null || this.f188957j == -1 || this.f188958k == -1 || rect.width() < 2 || this.f188956i.height() < 2) {
                return null;
            }
            Rect rect2 = this.f188956i;
            int[] iArr = new int[rect2.width() * rect2.height()];
            b0 b0Var = new b0();
            c0Var.f0(this.f188957j);
            b0Var.m(c0Var);
            n(b0Var, true, rect2, iArr);
            c0Var.f0(this.f188958k);
            b0Var.m(c0Var);
            n(b0Var, false, rect2, iArr);
            return new v7.a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f188954g).l(0).h(rect2.top / this.f188955h, 0).i(0).n(rect2.width() / this.f188954g).g(rect2.height() / this.f188955h).a();
        }

        public void m(String str) {
            for (String str2 : o0.Z0(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrZ0 = o0.Z0(str2.substring(9), ",");
                    this.f188953f = new int[strArrZ0.length];
                    for (int i15 = 0; i15 < strArrZ0.length; i15++) {
                        this.f188953f[i15] = f(strArrZ0[i15].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrZ1 = o0.Z0(str2.substring(6).trim(), "x");
                    if (strArrZ1.length != 2) {
                        t.h("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                    } else {
                        try {
                            this.f188954g = Integer.parseInt(strArrZ1[0]);
                            this.f188955h = Integer.parseInt(strArrZ1[1]);
                            this.f188951d = true;
                        } catch (RuntimeException e15) {
                            t.i("VobsubParser", "Parsing IDX failed", e15);
                        }
                    }
                }
            }
        }

        public void q() {
            this.f188949b = -9223372036854775807L;
            this.f188950c = -9223372036854775807L;
            this.f188952e = false;
            this.f188956i = null;
            this.f188957j = -1;
            this.f188958k = -1;
        }
    }

    public a(List<byte[]> list) {
        b bVar = new b();
        this.f188946c = bVar;
        bVar.m(new String(list.get(0), StandardCharsets.UTF_8));
    }

    private e d() {
        if (this.f188947d == null) {
            this.f188947d = new Inflater();
        }
        if (o0.G0(this.f188944a, this.f188945b, this.f188947d)) {
            this.f188944a.d0(this.f188945b.f(), this.f188945b.j());
        }
        this.f188946c.q();
        int iA = this.f188944a.a();
        if (iA < 2 || this.f188944a.Y() != iA) {
            return f188943e;
        }
        this.f188946c.p(this.f188944a);
        v7.a aVarD = this.f188946c.d(this.f188944a);
        long j15 = -9223372036854775807L;
        if (this.f188946c.f188950c != -9223372036854775807L) {
            j15 = (this.f188946c.f188949b == -9223372036854775807L || this.f188946c.f188950c <= this.f188946c.f188949b) ? this.f188946c.f188950c : this.f188946c.f188950c - this.f188946c.f188949b;
        }
        return new e(aVarD != null ? n0.E(aVarD) : n0.C(), this.f188946c.f188949b, j15);
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<e> lVar) {
        this.f188944a.d0(bArr, i16 + i15);
        this.f188944a.f0(i15);
        lVar.accept(d());
    }

    @Override // l9.s
    public int c() {
        return 2;
    }
}
