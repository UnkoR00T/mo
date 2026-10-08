package x7;

import ak.n0;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f217160a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f217161b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f217162c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f217163d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217165b;

        public a(int i15, int i16) {
            this.f217164a = i15;
            this.f217165b = i16;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f217168c;

        public b(int i15, int i16, int i17) {
            this.f217166a = i15;
            this.f217167b = i16;
            this.f217168c = i17;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f217170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f217171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f217172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f217173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f217174f;

        public c(int i15, boolean z15, int i16, int i17, int[] iArr, int i18) {
            this.f217169a = i15;
            this.f217170b = z15;
            this.f217171c = i16;
            this.f217172d = i17;
            this.f217173e = iArr;
            this.f217174f = i18;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0<c> f217175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f217176b;

        public d(List<c> list, int[] iArr) {
            this.f217175a = n0.v(list);
            this.f217176b = iArr;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f217179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f217180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f217181e;

        public e(int i15, int i16, int i17, int i18, int i19) {
            this.f217177a = i15;
            this.f217178b = i16;
            this.f217179c = i17;
            this.f217180d = i18;
            this.f217181e = i19;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0<e> f217182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f217183b;

        public f(List<e> list, int[] iArr) {
            this.f217182a = n0.v(list);
            this.f217183b = iArr;
        }
    }

    /* JADX INFO: renamed from: x7.g$g, reason: collision with other inner class name */
    public static final class C5795g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f217186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f217187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f217188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f217189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f217190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f217191h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f217192i;

        public C5795g(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28) {
            this.f217184a = i15;
            this.f217185b = i16;
            this.f217186c = i17;
            this.f217187d = i18;
            this.f217188e = i19;
            this.f217189f = i25;
            this.f217190g = i26;
            this.f217191h = i27;
            this.f217192i = i28;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f217193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f217195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f217196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f217197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f217198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f217199g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f217200h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f217201i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f217202j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f217203k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f217204l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f217205m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f217206n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f217207o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f217208p;

        public h(b bVar, int i15, c cVar, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, float f15, int i29, int i35, int i36, int i37) {
            this.f217193a = bVar;
            this.f217194b = i15;
            this.f217195c = cVar;
            this.f217196d = i16;
            this.f217197e = i17;
            this.f217198f = i18;
            this.f217199g = i19;
            this.f217200h = i25;
            this.f217201i = i26;
            this.f217204l = f15;
            this.f217205m = i29;
            this.f217206n = i35;
            this.f217207o = i36;
            this.f217208p = i37;
            this.f217202j = i27;
            this.f217203k = i28;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f217211c;

        public i(int i15, int i16, int i17) {
            this.f217209a = i15;
            this.f217210b = i16;
            this.f217211c = i17;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0<i> f217212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f217213b;

        public j(List<i> list, int[] iArr) {
            this.f217212a = n0.v(list);
            this.f217213b = iArr;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f217214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n0<a> f217215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f217216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f217217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j f217218e;

        public k(b bVar, List<a> list, d dVar, f fVar, j jVar) {
            this.f217214a = bVar;
            this.f217215b = list != null ? n0.v(list) : n0.C();
            this.f217216c = dVar;
            this.f217217d = fVar;
            this.f217218e = jVar;
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f217221c;

        public l(int i15, int i16, boolean z15) {
            this.f217219a = i15;
            this.f217220b = i16;
            this.f217221c = z15;
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f217224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f217225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f217226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f217227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f217228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f217229h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f217230i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f217231j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f217232k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f217233l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f217234m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f217235n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f217236o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f217237p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f217238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f217239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f217240s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f217241t;

        public m(int i15, int i16, int i17, int i18, int i19, int i25, int i26, float f15, int i27, int i28, boolean z15, boolean z16, int i29, int i35, int i36, boolean z17, int i37, int i38, int i39, int i45) {
            this.f217222a = i15;
            this.f217223b = i16;
            this.f217224c = i17;
            this.f217225d = i18;
            this.f217226e = i19;
            this.f217227f = i25;
            this.f217228g = i26;
            this.f217229h = f15;
            this.f217230i = i27;
            this.f217231j = i28;
            this.f217232k = z15;
            this.f217233l = z16;
            this.f217234m = i29;
            this.f217235n = i35;
            this.f217236o = i36;
            this.f217237p = z17;
            this.f217238q = i37;
            this.f217239r = i38;
            this.f217240s = i39;
            this.f217241t = i45;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k A(x7.j jVar, b bVar) {
        int[] iArr;
        int i15;
        int i16;
        j jVarY;
        int i17;
        int i18;
        int i19;
        int[] iArr2;
        n0 n0Var;
        int i25;
        boolean[][] zArr;
        int[] iArr3;
        int i26;
        jVar.m(4);
        boolean zE = jVar.e();
        boolean zE2 = jVar.e();
        int iF = jVar.f(6);
        int i27 = iF + 1;
        int iF2 = jVar.f(3);
        jVar.m(17);
        c cVarR = r(jVar, true, iF2, null);
        boolean z15 = false;
        for (int i28 = jVar.e() ? 0 : iF2; i28 <= iF2; i28++) {
            jVar.i();
            jVar.i();
            jVar.i();
        }
        int iF3 = jVar.f(6);
        int i29 = jVar.i() + 1;
        d dVar = new d(n0.E(cVarR), new int[1]);
        Object[] objArr = i27 >= 2 && i29 >= 2;
        Object[] objArr2 = zE && zE2;
        int i35 = iF3 + 1;
        Object[] objArr3 = i35 >= i27;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, i29, i35);
        int i36 = 1;
        int[] iArr5 = new int[i29];
        int[] iArr6 = new int[i29];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i37 = 1; i37 < i29; i37++) {
            int i38 = 0;
            for (int i39 = 0; i39 <= iF3; i39++) {
                if (jVar.e()) {
                    iArr4[i37][i38] = i39;
                    iArr6[i37] = i39;
                    i38++;
                }
                iArr5[i37] = i38;
            }
        }
        if (jVar.e()) {
            jVar.m(64);
            if (jVar.e()) {
                jVar.i();
            }
            int i45 = jVar.i();
            int i46 = 0;
            while (i46 < i45) {
                jVar.i();
                if (i46 == 0 || jVar.e()) {
                    z15 = true;
                }
                G(jVar, z15, iF2);
                i46++;
                z15 = false;
            }
        }
        if (!jVar.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        jVar.b();
        c cVarR2 = r(jVar, false, iF2, cVarR);
        boolean zE3 = jVar.e();
        int i47 = 6;
        boolean[] zArr2 = new boolean[16];
        int i48 = 0;
        for (int i49 = 0; i49 < 16; i49++) {
            boolean zE4 = jVar.e();
            zArr2[i49] = zE4;
            if (zE4) {
                i48++;
            }
        }
        if (i48 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr7 = new int[i48];
        for (int i55 = 0; i55 < i48 - (zE3 ? 1 : 0); i55++) {
            iArr7[i55] = jVar.f(3);
        }
        int[] iArr8 = new int[i48 + 1];
        if (zE3) {
            int i56 = 1;
            while (i56 < i48) {
                int[] iArr9 = iArr8;
                for (int i57 = 0; i57 < i56; i57++) {
                    iArr9[i56] = iArr9[i56] + iArr7[i57] + 1;
                }
                i56++;
                iArr8 = iArr9;
            }
            iArr = iArr8;
            iArr[i48] = 6;
        } else {
            iArr = iArr8;
        }
        int[][] iArr10 = (int[][]) Array.newInstance((Class<?>) cls, i27, i48);
        int[] iArr11 = new int[i27];
        iArr11[0] = 0;
        boolean zE5 = jVar.e();
        int i58 = 1;
        while (i58 < i27) {
            if (zE5) {
                i26 = i58;
                iArr11[i26] = jVar.f(i47);
            } else {
                i26 = i58;
                iArr11[i26] = i26;
            }
            if (zE3) {
                int i59 = 0;
                while (i59 < i48) {
                    int i65 = i59 + 1;
                    iArr10[i26][i59] = (iArr11[i26] & ((1 << iArr[i65]) - 1)) >> iArr[i59];
                    i59 = i65;
                }
            } else {
                int i66 = 0;
                while (i66 < i48) {
                    int i67 = i66;
                    iArr10[i26][i67] = jVar.f(iArr7[i66] + 1);
                    i66 = i67 + 1;
                }
            }
            i58 = i26 + 1;
            i47 = 6;
        }
        int[] iArr12 = new int[i35];
        int i68 = 1;
        int i69 = 0;
        while (i69 < i27) {
            iArr12[iArr11[i69]] = -1;
            int[] iArr13 = iArr12;
            int i75 = 0;
            int i76 = 0;
            while (i75 < 16) {
                if (zArr2[i75]) {
                    if (i75 == i36) {
                        iArr13[iArr11[i69]] = iArr10[i69][i76];
                    }
                    i76++;
                }
                i75++;
                i36 = 1;
            }
            if (i69 > 0) {
                int i77 = 0;
                while (true) {
                    if (i77 >= i69) {
                        i68++;
                        break;
                    }
                    int i78 = i77;
                    if (iArr13[iArr11[i69]] == iArr13[iArr11[i77]]) {
                        break;
                    }
                    i77 = i78 + 1;
                }
            }
            i69++;
            iArr12 = iArr13;
            i36 = 1;
        }
        int[] iArr14 = iArr12;
        int iF4 = jVar.f(4);
        if (i68 < 2 || iF4 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr15 = new int[i68];
        for (int i79 = 0; i79 < i68; i79++) {
            iArr15[i79] = jVar.f(iF4);
        }
        int[] iArr16 = new int[i35];
        int i85 = 0;
        while (i85 < i27) {
            int[] iArr17 = iArr16;
            iArr17[Math.min(iArr11[i85], iF3)] = i85;
            i85++;
            iArr16 = iArr17;
        }
        int[] iArr18 = iArr16;
        n0.a aVarS = n0.s();
        int i86 = 0;
        while (i86 <= iF3) {
            int i87 = i68;
            int[] iArr19 = iArr6;
            int iMin = Math.min(iArr14[i86], i87 - 1);
            aVarS.a(new a(iArr18[i86], iMin >= 0 ? iArr15[iMin] : -1));
            i86++;
            i68 = i87;
            iArr6 = iArr19;
            iArr15 = iArr15;
        }
        int[] iArr20 = iArr6;
        n0 n0VarK = aVarS.k();
        if (((a) n0VarK.get(0)).f217165b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i88 = 1;
        while (true) {
            if (i88 > iF3) {
                i15 = -1;
                i16 = -1;
                break;
            }
            i15 = -1;
            if (((a) n0VarK.get(i88)).f217165b != -1) {
                i16 = i88;
                break;
            }
            i88++;
        }
        if (i16 == i15) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i27, i27);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i27, i27);
        int i89 = 1;
        while (i89 < i27) {
            boolean[][] zArr5 = zArr4;
            for (int i95 = 0; i95 < i89; i95++) {
                boolean[] zArr6 = zArr3[i89];
                boolean[] zArr7 = zArr5[i89];
                boolean zE6 = jVar.e();
                zArr7[i95] = zE6;
                zArr6[i95] = zE6;
            }
            i89++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i96 = 1; i96 < i27; i96++) {
            int i97 = 0;
            while (i97 < iF) {
                int[] iArr21 = iArr11;
                for (int i98 = 0; i98 < i96; i98++) {
                    boolean[] zArr9 = zArr8[i96];
                    if (zArr9[i98] && zArr8[i98][i97]) {
                        zArr9[i97] = true;
                        break;
                    }
                }
                i97++;
                iArr11 = iArr21;
            }
        }
        int[] iArr22 = iArr11;
        int[] iArr23 = new int[i35];
        for (int i99 = 0; i99 < i27; i99++) {
            int i100 = 0;
            for (int i101 = 0; i101 < i99; i101++) {
                i100 += zArr3[i99][i101] ? 1 : 0;
            }
            iArr23[iArr22[i99]] = i100;
        }
        int i102 = 0;
        for (int i103 = 0; i103 < i27; i103++) {
            if (iArr23[iArr22[i103]] == 0) {
                i102++;
            }
        }
        if (i102 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr24 = new int[i27];
        int[] iArr25 = new int[i29];
        if (jVar.e()) {
            int i104 = 0;
            while (i104 < i27) {
                int i105 = i104;
                iArr24[i105] = jVar.f(3);
                i104 = i105 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i27, iF2);
        }
        int i106 = 0;
        while (i106 < i29) {
            int i107 = i106;
            boolean[][] zArr10 = zArr3;
            int[] iArr26 = iArr24;
            int iMax = 0;
            for (int i108 = 0; i108 < iArr5[i107]; i108++) {
                iMax = Math.max(iMax, iArr26[((a) n0VarK.get(iArr4[i107][i108])).f217164a]);
            }
            iArr25[i107] = iMax + 1;
            i106 = i107 + 1;
            iArr24 = iArr26;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (jVar.e()) {
            int i109 = 0;
            while (i109 < iF) {
                int i110 = i109 + 1;
                int i111 = i110;
                while (i111 < i27) {
                    if (zArr11[i111][i109]) {
                        jVar.m(3);
                    }
                    i111++;
                    i109 = i109;
                }
                i109 = i110;
            }
        }
        jVar.l();
        int i112 = jVar.i() + 1;
        n0.a aVarS2 = n0.s();
        aVarS2.a(cVarR);
        if (i112 > 1) {
            aVarS2.a(cVarR2);
            for (int i113 = 2; i113 < i112; i113++) {
                cVarR2 = r(jVar, jVar.e(), iF2, cVarR2);
                aVarS2.a(cVarR2);
            }
        }
        n0 n0VarK2 = aVarS2.k();
        int i114 = jVar.i() + i29;
        if (i114 > i29) {
            return new k(bVar, null, dVar, null, null);
        }
        int iF5 = jVar.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i114, i35);
        int[] iArr27 = new int[i114];
        int i115 = 0;
        int[] iArr28 = new int[i114];
        int i116 = 0;
        while (i116 < i29) {
            iArr27[i116] = i115;
            iArr28[i116] = iArr20[i116];
            if (iF5 == 0) {
                i25 = i116;
                zArr = zArr12;
                n0Var = n0VarK2;
                iArr3 = iArr27;
                Arrays.fill(zArr12[i25], i115, iArr5[i25], true);
                iArr3[i25] = iArr5[i25];
            } else {
                n0Var = n0VarK2;
                i25 = i116;
                zArr = zArr12;
                iArr3 = iArr27;
                if (iF5 == 1) {
                    int i117 = iArr20[i25];
                    for (int i118 = 0; i118 < iArr5[i25]; i118++) {
                        zArr[i25][i118] = iArr4[i25][i118] == i117;
                    }
                    iArr3[i25] = 1;
                } else {
                    i115 = 0;
                    zArr[0][0] = true;
                    iArr3[0] = 1;
                }
                i116 = i25 + 1;
                zArr12 = zArr;
                iArr27 = iArr3;
                n0VarK2 = n0Var;
            }
            i115 = 0;
            i116 = i25 + 1;
            zArr12 = zArr;
            iArr27 = iArr3;
            n0VarK2 = n0Var;
        }
        n0 n0Var2 = n0VarK2;
        boolean[][] zArr13 = zArr12;
        int[] iArr29 = iArr27;
        int[] iArr30 = new int[i35];
        int i119 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i35;
        iArr31[i115] = i114;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i120 = 1;
        int i121 = 0;
        while (i120 < i114) {
            if (iF5 == i119) {
                for (int i122 = 0; i122 < iArr5[i120]; i122++) {
                    zArr13[i120][i122] = jVar.e();
                    int i123 = iArr29[i120];
                    boolean z16 = zArr13[i120][i122];
                    iArr29[i120] = i123 + (z16 ? 1 : 0);
                    if (z16) {
                        iArr28[i120] = iArr4[i120][i122];
                    }
                }
            }
            if (i121 == 0) {
                i17 = 0;
                if (iArr4[i120][0] == 0 && zArr13[i120][0]) {
                    for (int i124 = 1; i124 < iArr5[i120]; i124++) {
                        if (iArr4[i120][i124] == i16 && zArr13[i120][i16]) {
                            i121 = i120;
                        }
                    }
                }
            } else {
                i17 = 0;
            }
            int i125 = i17;
            while (i125 < iArr5[i120]) {
                if (i112 > 1) {
                    zArr14[i120][i125] = zArr13[i120][i125];
                    i19 = i16;
                    iArr2 = iArr30;
                    i18 = i112;
                    int iD = ck.a.d(i112, RoundingMode.CEILING);
                    if (!zArr14[i120][i125]) {
                        int i126 = ((a) n0VarK.get(iArr4[i120][i125])).f217164a;
                        int i127 = i17;
                        while (i127 < i125) {
                            int i128 = i126;
                            if (zArr8[i128][((a) n0VarK.get(iArr4[i120][i127])).f217164a]) {
                                zArr14[i120][i125] = true;
                                break;
                            }
                            i127++;
                            i126 = i128;
                        }
                    }
                    if (zArr14[i120][i125]) {
                        if (i121 <= 0 || i120 != i121) {
                            jVar.m(iD);
                        } else {
                            iArr2[i125] = jVar.f(iD);
                        }
                    }
                } else {
                    i18 = i112;
                    i19 = i16;
                    iArr2 = iArr30;
                }
                i125++;
                i16 = i19;
                iArr30 = iArr2;
                i112 = i18;
            }
            int i129 = i112;
            int i130 = i16;
            int[] iArr32 = iArr30;
            if (iArr29[i120] == 1 && iArr23[iArr28[i120]] > 0) {
                jVar.l();
            }
            i120++;
            i16 = i130;
            iArr30 = iArr32;
            i112 = i129;
            i119 = 2;
        }
        int[] iArr33 = iArr30;
        if (i121 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        f fVarT = t(jVar, i27);
        jVar.m(2);
        for (int i131 = 1; i131 < i27; i131++) {
            if (iArr23[iArr22[i131]] == 0) {
                jVar.l();
            }
        }
        F(jVar, i114, iArr25, iArr5, zArr14);
        L(jVar, i27, zArr11);
        if (jVar.e()) {
            jVar.b();
            jVarY = y(jVar, i27, i29, iArr25);
        } else {
            jVarY = null;
        }
        return new k(bVar, n0VarK, new d(n0Var2, iArr33), fVarT, jVarY);
    }

    public static l B(byte[] bArr, int i15, int i16) {
        return C(bArr, i15 + 1, i16);
    }

    public static l C(byte[] bArr, int i15, int i16) {
        x7.j jVar = new x7.j(bArr, i15, i16);
        int i17 = jVar.i();
        int i18 = jVar.i();
        jVar.l();
        return new l(i17, i18, jVar.e());
    }

    public static m D(byte[] bArr, int i15, int i16) {
        return E(bArr, i15 + 1, i16);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0213  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    public static m E(byte[] bArr, int i15, int i16) {
        int i17;
        boolean zE;
        int i18;
        int i19;
        int i25;
        boolean z15;
        int i26;
        int i27;
        float f15;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean zE2;
        boolean zE3;
        int i39;
        int i45;
        x7.j jVar = new x7.j(bArr, i15, i16);
        int iF = jVar.f(8);
        int iF2 = jVar.f(8);
        int iF3 = jVar.f(8);
        int i46 = jVar.i();
        if (iF == 100 || iF == 110 || iF == 122 || iF == 244 || iF == 44 || iF == 83 || iF == 86 || iF == 118 || iF == 128 || iF == 138) {
            i17 = jVar.i();
            zE = i17 == 3 ? jVar.e() : false;
            i18 = jVar.i();
            int i47 = jVar.i();
            jVar.l();
            if (jVar.e()) {
                int i48 = i17 != 3 ? 8 : 12;
                i19 = 16;
                int i49 = 0;
                while (i49 < i48) {
                    if (jVar.e()) {
                        K(jVar, i49 < 6 ? 16 : 64);
                    }
                    i49++;
                }
            } else {
                i19 = 16;
            }
            i25 = i47;
        } else {
            i17 = 1;
            i19 = 16;
            i25 = 0;
            zE = false;
            i18 = 0;
        }
        int i55 = jVar.i() + 4;
        int i56 = jVar.i();
        if (i56 == 0) {
            i26 = jVar.i() + 4;
            iF = iF;
            i56 = i56;
            z15 = false;
        } else {
            if (i56 == 1) {
                boolean zE4 = jVar.e();
                jVar.h();
                jVar.h();
                long jI = jVar.i();
                for (int i57 = 0; i57 < jI; i57++) {
                    jVar.i();
                }
                z15 = zE4;
            } else {
                z15 = false;
            }
            i26 = 0;
        }
        int i58 = jVar.i();
        jVar.l();
        int i59 = jVar.i() + 1;
        int i65 = jVar.i() + 1;
        boolean zE5 = jVar.e();
        int i66 = (2 - (zE5 ? 1 : 0)) * i65;
        if (!zE5) {
            jVar.l();
        }
        jVar.l();
        int i67 = i59 * 16;
        int i68 = i66 * 16;
        if (jVar.e()) {
            int i69 = jVar.i();
            int i75 = jVar.i();
            int i76 = jVar.i();
            int i77 = jVar.i();
            if (i17 == 0) {
                i45 = 2 - (zE5 ? 1 : 0);
                i39 = 1;
            } else {
                i39 = i17 == 3 ? 1 : 2;
                i45 = (i17 == 1 ? 2 : 1) * (2 - (zE5 ? 1 : 0));
            }
            i67 -= (i69 + i75) * i39;
            i68 -= (i76 + i77) * i45;
        }
        int i78 = i67;
        int i79 = iF;
        int i85 = ((i79 == 44 || i79 == 86 || i79 == 100 || i79 == 110 || i79 == 122 || i79 == 244) && (iF2 & 16) != 0) ? 0 : i19;
        float f16 = 1.0f;
        if (jVar.e()) {
            if (jVar.e()) {
                int iF4 = jVar.f(8);
                if (iF4 == 255) {
                    int i86 = i19;
                    int iF5 = jVar.f(i86);
                    int iF6 = jVar.f(i86);
                    if (iF5 != 0 && iF6 != 0) {
                        f16 = iF5 / iF6;
                    }
                } else {
                    float[] fArr = f217161b;
                    if (iF4 < fArr.length) {
                        f16 = fArr[iF4];
                    } else {
                        t.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iF4);
                    }
                }
            }
            if (jVar.e()) {
                jVar.l();
            }
            if (jVar.e()) {
                jVar.m(3);
                i37 = jVar.e() ? 1 : 2;
                if (jVar.e()) {
                    int iF7 = jVar.f(8);
                    int iF8 = jVar.f(8);
                    jVar.m(8);
                    int iJ = t7.g.j(iF7);
                    int iK = t7.g.k(iF8);
                    i38 = iJ;
                    i36 = iK;
                } else {
                    i36 = -1;
                }
                if (jVar.e()) {
                    jVar.i();
                    jVar.i();
                }
                if (jVar.e()) {
                    jVar.m(65);
                }
                zE2 = jVar.e();
                if (zE2) {
                    J(jVar);
                }
                zE3 = jVar.e();
                if (zE3) {
                    J(jVar);
                }
                if (zE2 || zE3) {
                    jVar.l();
                }
                jVar.l();
                if (jVar.e()) {
                    jVar.l();
                    jVar.i();
                    jVar.i();
                    jVar.i();
                    jVar.i();
                    i85 = jVar.i();
                    jVar.i();
                }
                i35 = i36;
                i29 = i37;
                i27 = i85;
                f15 = f16;
                i28 = i38;
            } else {
                i36 = -1;
                i37 = -1;
            }
            i38 = -1;
            if (jVar.e()) {
                jVar.i();
                jVar.i();
            }
            if (jVar.e()) {
                jVar.m(65);
            }
            zE2 = jVar.e();
            if (zE2) {
                J(jVar);
            }
            zE3 = jVar.e();
            if (zE3) {
                J(jVar);
            }
            if (zE2) {
                jVar.l();
            } else {
                jVar.l();
            }
            jVar.l();
            if (jVar.e()) {
                jVar.l();
                jVar.i();
                jVar.i();
                jVar.i();
                jVar.i();
                i85 = jVar.i();
                jVar.i();
            }
            i35 = i36;
            i29 = i37;
            i27 = i85;
            f15 = f16;
            i28 = i38;
        } else {
            i27 = i85;
            f15 = 1.0f;
            i28 = -1;
            i29 = -1;
            i35 = -1;
        }
        return new m(i79, iF2, iF3, i46, i58, i78, i68, f15, i18, i25, zE, zE5, i55, i56, i26, z15, i28, i29, i35, i27);
    }

    private static void F(x7.j jVar, int i15, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i16 = 1; i16 < i15; i16++) {
            boolean zE = jVar.e();
            int i17 = 0;
            while (i17 < iArr[i16]) {
                if ((i17 <= 0 || !zE) ? i17 == 0 : jVar.e()) {
                    for (int i18 = 0; i18 < iArr2[i16]; i18++) {
                        if (zArr[i16][i18]) {
                            jVar.i();
                        }
                    }
                    jVar.i();
                    jVar.i();
                }
                i17++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void G(x7.j jVar, boolean z15, int i15) {
        ?? r15;
        ?? r16;
        boolean zE;
        boolean zE2;
        if (z15) {
            boolean zE3 = jVar.e();
            boolean zE4 = jVar.e();
            if (zE3 || zE4) {
                zE = jVar.e();
                if (zE) {
                    jVar.m(19);
                }
                jVar.m(8);
                if (zE) {
                    jVar.m(4);
                }
                jVar.m(15);
                r16 = zE4;
                r15 = zE3;
            } else {
                zE = false;
                r16 = zE4;
                r15 = zE3;
            }
        } else {
            r15 = 0;
            r16 = 0;
            zE = false;
        }
        for (int i16 = 0; i16 <= i15; i16++) {
            boolean zE5 = jVar.e();
            if (!zE5) {
                zE5 = jVar.e();
            }
            if (zE5) {
                jVar.i();
                zE2 = false;
            } else {
                zE2 = jVar.e();
            }
            int i17 = !zE2 ? jVar.i() : 0;
            int i18 = r15 + r16;
            for (int i19 = 0; i19 < i18; i19++) {
                for (int i25 = 0; i25 <= i17; i25++) {
                    jVar.i();
                    jVar.i();
                    if (zE) {
                        jVar.i();
                        jVar.i();
                    }
                    jVar.l();
                }
            }
        }
    }

    private static void H(x7.j jVar) {
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = 0;
            while (i16 < 6) {
                int i17 = 1;
                if (jVar.e()) {
                    int iMin = Math.min(64, 1 << ((i15 << 1) + 4));
                    if (i15 > 1) {
                        jVar.h();
                    }
                    for (int i18 = 0; i18 < iMin; i18++) {
                        jVar.h();
                    }
                } else {
                    jVar.i();
                }
                if (i15 == 3) {
                    i17 = 3;
                }
                i16 += i17;
            }
        }
    }

    private static void I(x7.j jVar) {
        int i15 = jVar.i();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            if (i18 == 0 || !jVar.e()) {
                int i19 = jVar.i();
                int i25 = jVar.i();
                int[] iArr2 = new int[i19];
                int i26 = 0;
                while (i26 < i19) {
                    iArr2[i26] = (i26 > 0 ? iArr2[i26 - 1] : 0) - (jVar.i() + 1);
                    jVar.l();
                    i26++;
                }
                int[] iArr3 = new int[i25];
                int i27 = 0;
                while (i27 < i25) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) + jVar.i() + 1;
                    jVar.l();
                    i27++;
                }
                i16 = i19;
                iArr = iArr2;
                i17 = i25;
                iArrCopyOf = iArr3;
            } else {
                int i28 = i16 + i17;
                int i29 = (1 - ((jVar.e() ? 1 : 0) * 2)) * (jVar.i() + 1);
                int i35 = i28 + 1;
                boolean[] zArr = new boolean[i35];
                for (int i36 = 0; i36 <= i28; i36++) {
                    if (jVar.e()) {
                        zArr[i36] = true;
                    } else {
                        zArr[i36] = jVar.e();
                    }
                }
                int[] iArr4 = new int[i35];
                int[] iArr5 = new int[i35];
                int i37 = 0;
                for (int i38 = i17 - 1; i38 >= 0; i38--) {
                    int i39 = iArrCopyOf[i38] + i29;
                    if (i39 < 0 && zArr[i16 + i38]) {
                        iArr4[i37] = i39;
                        i37++;
                    }
                }
                if (i29 < 0 && zArr[i28]) {
                    iArr4[i37] = i29;
                    i37++;
                }
                for (int i45 = 0; i45 < i16; i45++) {
                    int i46 = iArr[i45] + i29;
                    if (i46 < 0 && zArr[i45]) {
                        iArr4[i37] = i46;
                        i37++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i37);
                int i47 = 0;
                for (int i48 = i16 - 1; i48 >= 0; i48--) {
                    int i49 = iArr[i48] + i29;
                    if (i49 > 0 && zArr[i48]) {
                        iArr5[i47] = i49;
                        i47++;
                    }
                }
                if (i29 > 0 && zArr[i28]) {
                    iArr5[i47] = i29;
                    i47++;
                }
                for (int i55 = 0; i55 < i17; i55++) {
                    int i56 = iArrCopyOf[i55] + i29;
                    if (i56 > 0 && zArr[i16 + i55]) {
                        iArr5[i47] = i56;
                        i47++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i47);
                iArr = iArrCopyOf2;
                i16 = i37;
                i17 = i47;
            }
        }
    }

    private static void J(x7.j jVar) {
        int i15 = jVar.i() + 1;
        jVar.m(8);
        for (int i16 = 0; i16 < i15; i16++) {
            jVar.i();
            jVar.i();
            jVar.l();
        }
        jVar.m(20);
    }

    private static void K(x7.j jVar, int i15) {
        int iH = 8;
        int i16 = 8;
        for (int i17 = 0; i17 < i15; i17++) {
            if (iH != 0) {
                iH = ((jVar.h() + i16) + 256) % 256;
            }
            if (iH != 0) {
                i16 = iH;
            }
        }
    }

    private static void L(x7.j jVar, int i15, boolean[][] zArr) {
        int i16 = jVar.i() + 2;
        if (jVar.e()) {
            jVar.m(i16);
        } else {
            for (int i17 = 1; i17 < i15; i17++) {
                for (int i18 = 0; i18 < i17; i18++) {
                    if (zArr[i17][i18]) {
                        jVar.m(i16);
                    }
                }
            }
        }
        int i19 = jVar.i();
        for (int i25 = 1; i25 <= i19; i25++) {
            jVar.m(8);
        }
    }

    public static int M(byte[] bArr, int i15) {
        int i16;
        synchronized (f217162c) {
            int iG = 0;
            int i17 = 0;
            while (iG < i15) {
                try {
                    iG = g(bArr, iG, i15);
                    if (iG < i15) {
                        int[] iArr = f217163d;
                        if (iArr.length <= i17) {
                            f217163d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f217163d[i17] = iG;
                        iG += 3;
                        i17++;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            i16 = i15 - i17;
            int i18 = 0;
            int i19 = 0;
            for (int i25 = 0; i25 < i17; i25++) {
                int i26 = f217163d[i25] - i19;
                System.arraycopy(bArr, i19, bArr, i18, i26);
                int i27 = i18 + i26;
                int i28 = i27 + 1;
                bArr[i27] = 0;
                i18 = i27 + 2;
                bArr[i28] = 0;
                i19 += i26 + 3;
            }
            System.arraycopy(bArr, i19, bArr, i18, i16 - i18);
        }
        return i16;
    }

    private static int a(int i15, int i16, int i17, int i18) {
        return i15 - ((i16 == 1 ? 2 : 1) * (i17 + i18));
    }

    private static int b(int i15, int i16, int i17, int i18) {
        int i19 = 2;
        if (i16 != 1 && i16 != 2) {
            i19 = 1;
        }
        return i15 - (i19 * (i17 + i18));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(x7.j jVar) {
        jVar.m(4);
        int iF = jVar.f(3);
        jVar.l();
        c cVarR = r(jVar, true, iF, null);
        return w7.i.i(cVarR.f217169a, cVarR.f217170b, cVarR.f217171c, cVarR.f217172d, cVarR.f217173e, cVarR.f217174f);
    }

    public static int e(byte[] bArr, int i15, int i16, boolean[] zArr) {
        int i17 = i16 - i15;
        p.w(i17 >= 0);
        if (i17 == 0) {
            return i16;
        }
        if (zArr[0]) {
            c(zArr);
            return i15 - 3;
        }
        if (i17 > 1 && zArr[1] && bArr[i15] == 1) {
            c(zArr);
            return i15 - 2;
        }
        if (i17 > 2 && zArr[2] && bArr[i15] == 0 && bArr[i15 + 1] == 1) {
            c(zArr);
            return i15 - 1;
        }
        int i18 = i16 - 1;
        int i19 = i15 + 2;
        while (i19 < i18) {
            byte b15 = bArr[i19];
            if ((b15 & 254) == 0) {
                int i25 = i19 - 2;
                if (bArr[i25] == 0 && bArr[i19 - 1] == 0 && b15 == 1) {
                    c(zArr);
                    return i25;
                }
                i19 -= 2;
            }
            i19 += 3;
        }
        zArr[0] = i17 <= 2 ? !(i17 != 2 ? !(zArr[1] && bArr[i18] == 1) : !(zArr[2] && bArr[i16 + (-2)] == 0 && bArr[i18] == 1)) : bArr[i16 + (-3)] == 0 && bArr[i16 + (-2)] == 0 && bArr[i18] == 1;
        zArr[1] = i17 <= 1 ? zArr[2] && bArr[i18] == 0 : bArr[i16 + (-2)] == 0 && bArr[i18] == 0;
        zArr[2] = bArr[i18] == 0;
        return i16;
    }

    private static n0<Integer> f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        n0.a aVarS = n0.s();
        int i15 = 0;
        while (i15 < bArr.length) {
            int iE = e(bArr, i15, bArr.length, zArr);
            if (iE != bArr.length) {
                aVarS.a(Integer.valueOf(iE));
            }
            i15 = iE + 3;
        }
        return aVarS.k();
    }

    private static int g(byte[] bArr, int i15, int i16) {
        while (i15 < i16 - 2) {
            if (bArr[i15] == 0 && bArr[i15 + 1] == 0 && bArr[i15 + 2] == 3) {
                return i15;
            }
            i15++;
        }
        return i16;
    }

    public static String h(List<byte[]> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            byte[] bArr = list.get(i15);
            int length = bArr.length;
            if (length > 3) {
                n0<Integer> n0VarF = f(bArr);
                for (int i16 = 0; i16 < n0VarF.size(); i16++) {
                    if (n0VarF.get(i16).intValue() + 3 < length) {
                        x7.j jVar = new x7.j(bArr, n0VarF.get(i16).intValue() + 3, length);
                        b bVarQ = q(jVar);
                        if (bVarQ.f217166a == 33 && bVarQ.f217167b == 0) {
                            return d(jVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i15) {
        return (bArr[i15 + 3] & 126) >> 1;
    }

    private static String j(t7.p pVar) {
        String str;
        if (Objects.equals(pVar.f188381p, "video/dolby-vision") && (str = pVar.f188376k) != null) {
            if (str.startsWith("dva1") || pVar.f188376k.startsWith("dvav")) {
                return "video/avc";
            }
            if (pVar.f188376k.startsWith("dvh1") || pVar.f188376k.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return pVar.f188381p;
    }

    public static int k(byte[] bArr, int i15) {
        return bArr[i15 + 3] & 31;
    }

    public static boolean l(byte[] bArr, int i15, int i16, t7.p pVar) {
        if (Objects.equals(pVar.f188381p, "video/avc")) {
            return m(bArr[i15]);
        }
        if (Objects.equals(pVar.f188381p, "video/hevc")) {
            return n(bArr, i15, i16, pVar);
        }
        return true;
    }

    public static boolean m(byte b15) {
        if (((b15 & 96) >> 5) != 0) {
            return true;
        }
        int i15 = b15 & 31;
        return (i15 == 1 || i15 == 9 || i15 == 14) ? false : true;
    }

    private static boolean n(byte[] bArr, int i15, int i16, t7.p pVar) {
        b bVarQ = q(new x7.j(bArr, i15, i16 + i15));
        int i17 = bVarQ.f217166a;
        if (i17 == 35) {
            return false;
        }
        return (i17 <= 14 && i17 % 2 == 0 && bVarQ.f217168c == pVar.G - 1) ? false : true;
    }

    public static boolean o(t7.p pVar, byte[] bArr, int i15) {
        String strJ = j(pVar);
        if (strJ == null) {
            return false;
        }
        switch (strJ) {
            case "video/hevc":
                return ((bArr[i15] & 126) >> 1) == 39;
            case "video/avc":
                return (bArr[i15] & 31) == 6;
            case "video/vvc":
                return ((bArr[i15 + 1] & 248) >> 3) == 23;
            default:
                return false;
        }
    }

    public static int p(t7.p pVar) {
        String strJ = j(pVar);
        if (Objects.equals(strJ, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strJ, "video/hevc") || Objects.equals(strJ, "video/vvc")) ? 2 : 0;
    }

    private static b q(x7.j jVar) {
        jVar.l();
        return new b(jVar.f(6), jVar.f(6), jVar.f(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    private static c r(x7.j jVar, boolean z15, int i15, c cVar) {
        int[] iArr;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean zE;
        int iF;
        int i19;
        int i25;
        int[] iArr2 = new int[6];
        if (!z15) {
            if (cVar != null) {
                int i26 = cVar.f217169a;
                zE = cVar.f217170b;
                iF = cVar.f217171c;
                i19 = cVar.f217172d;
                iArr2 = cVar.f217173e;
                i16 = i26;
            } else {
                iArr = iArr2;
                i16 = 0;
                z16 = false;
                i17 = 0;
                i18 = 0;
            }
            int iF2 = jVar.f(8);
            i25 = 0;
            for (int i27 = 0; i27 < i15; i27++) {
                if (jVar.e()) {
                    i25 += 88;
                }
                if (jVar.e()) {
                    i25 += 8;
                }
            }
            jVar.m(i25);
            if (i15 > 0) {
                jVar.m((8 - i15) * 2);
            }
            return new c(i16, z16, i17, i18, iArr, iF2);
        }
        int iF3 = jVar.f(2);
        zE = jVar.e();
        iF = jVar.f(5);
        i19 = 0;
        for (int i28 = 0; i28 < 32; i28++) {
            if (jVar.e()) {
                i19 |= 1 << i28;
            }
        }
        for (int i29 = 0; i29 < 6; i29++) {
            iArr2[i29] = jVar.f(8);
        }
        i16 = iF3;
        iArr = iArr2;
        z16 = zE;
        i17 = iF;
        i18 = i19;
        int iF4 = jVar.f(8);
        i25 = 0;
        while (i27 < i15) {
            if (jVar.e()) {
                i25 += 88;
            }
            if (jVar.e()) {
                i25 += 8;
            }
        }
        jVar.m(i25);
        if (i15 > 0) {
            jVar.m((8 - i15) * 2);
        }
        return new c(i16, z16, i17, i18, iArr, iF4);
    }

    private static e s(x7.j jVar) {
        int i15;
        int i16;
        int iF;
        int iF2 = jVar.f(16);
        int iF3 = jVar.f(16);
        if (jVar.e()) {
            int iF4 = jVar.f(2);
            if (iF4 == 3) {
                jVar.l();
            }
            int iF5 = jVar.f(4);
            iF = jVar.f(4);
            i16 = iF5;
            i15 = iF4;
        } else {
            i15 = 0;
            i16 = 0;
            iF = 0;
        }
        if (jVar.e()) {
            int i17 = jVar.i();
            int i18 = jVar.i();
            int i19 = jVar.i();
            int i25 = jVar.i();
            iF2 = b(iF2, i15, i17, i18);
            iF3 = a(iF3, i15, i19, i25);
        }
        return new e(i15, i16, iF, iF2, iF3);
    }

    private static f t(x7.j jVar, int i15) {
        int i16 = jVar.i();
        int i17 = i16 + 1;
        n0.a aVarT = n0.t(i17);
        int[] iArr = new int[i15];
        for (int i18 = 0; i18 < i17; i18++) {
            aVarT.a(s(jVar));
        }
        int i19 = 1;
        if (i17 <= 1 || !jVar.e()) {
            while (i19 < i15) {
                iArr[i19] = Math.min(i19, i16);
                i19++;
            }
        } else {
            int iD = ck.a.d(i17, RoundingMode.CEILING);
            while (i19 < i15) {
                iArr[i19] = jVar.f(iD);
                i19++;
            }
        }
        return new f(aVarT.k(), iArr);
    }

    public static C5795g u(byte[] bArr, int i15, int i16) {
        byte b15;
        int i17 = i15 + 2;
        int i18 = i16 - 1;
        while (true) {
            b15 = bArr[i18];
            if (b15 != 0 || i18 <= i17) {
                break;
            }
            i18--;
        }
        if (b15 != 0 && i18 > i17) {
            x7.j jVar = new x7.j(bArr, i17, i18 + 1);
            while (jVar.c(16)) {
                int iF = jVar.f(8);
                int i19 = 0;
                while (iF == 255) {
                    i19 += GF2Field.MASK;
                    iF = jVar.f(8);
                }
                int i25 = i19 + iF;
                int iF2 = jVar.f(8);
                int i26 = 0;
                while (iF2 == 255) {
                    i26 += GF2Field.MASK;
                    iF2 = jVar.f(8);
                }
                int i27 = i26 + iF2;
                if (i27 == 0 || !jVar.c(i27)) {
                    break;
                }
                if (i25 == 176) {
                    int i28 = jVar.i();
                    boolean zE = jVar.e();
                    int i29 = zE ? jVar.i() : 0;
                    int i35 = jVar.i();
                    int i36 = -1;
                    int i37 = -1;
                    int iF3 = -1;
                    int iF4 = -1;
                    int i38 = -1;
                    int iF5 = -1;
                    for (int i39 = 0; i39 <= i35; i39++) {
                        i36 = jVar.i();
                        i37 = jVar.i();
                        iF3 = jVar.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        iF4 = jVar.f(iF3 == 0 ? Math.max(0, i28 - 30) : Math.max(0, (iF3 + i28) - 31));
                        if (zE) {
                            int iF6 = jVar.f(6);
                            if (iF6 == 63) {
                                return null;
                            }
                            i38 = iF6;
                            iF5 = jVar.f(iF6 == 0 ? Math.max(0, i29 - 30) : Math.max(0, (iF6 + i29) - 31));
                        }
                        if (jVar.e()) {
                            jVar.m(10);
                        }
                    }
                    return new C5795g(i28, i29, i35 + 1, i36, i37, iF3, iF4, i38, iF5);
                }
                jVar.m(i27 * 8);
            }
        }
        return null;
    }

    public static h v(byte[] bArr, int i15, int i16, k kVar) {
        return w(bArr, i15 + 2, i16, q(new x7.j(bArr, i15, i16)), kVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    public static h w(byte[] bArr, int i15, int i16, b bVar, k kVar) {
        int i17;
        int iA;
        int iB;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int iMax;
        float f15;
        int i29;
        int i35;
        int i36;
        int i37;
        j jVar;
        int i38;
        int iJ;
        int iK;
        f fVar;
        x7.j jVar2 = new x7.j(bArr, i15, i16);
        jVar2.m(4);
        int iF = jVar2.f(3);
        boolean z15 = bVar.f217167b != 0 && iF == 7;
        int i39 = (kVar == null || kVar.f217215b.isEmpty()) ? 0 : kVar.f217215b.get(Math.min(bVar.f217167b, kVar.f217215b.size() - 1)).f217164a;
        c cVarR = null;
        if (!z15) {
            jVar2.l();
            cVarR = r(jVar2, true, iF, null);
        } else if (kVar != null) {
            d dVar = kVar.f217216c;
            int i45 = dVar.f217176b[i39];
            if (dVar.f217175a.size() > i45) {
                cVarR = kVar.f217216c.f217175a.get(i45);
            }
        }
        int i46 = jVar2.i();
        if (z15) {
            int iF2 = jVar2.e() ? jVar2.f(8) : -1;
            if (kVar == null || (fVar = kVar.f217217d) == null) {
                i25 = 0;
                i19 = 0;
                i27 = 0;
                i28 = 0;
                i18 = 0;
                i17 = 0;
                i26 = 0;
            } else {
                if (iF2 == -1) {
                    iF2 = fVar.f217183b[i39];
                }
                if (iF2 == -1 || fVar.f217182a.size() <= iF2) {
                    i25 = 0;
                    i19 = 0;
                    i27 = 0;
                    i28 = 0;
                    i18 = 0;
                    i17 = 0;
                    i26 = 0;
                } else {
                    e eVar = kVar.f217217d.f217182a.get(iF2);
                    i17 = eVar.f217177a;
                    i26 = eVar.f217180d;
                    i19 = eVar.f217181e;
                    i27 = eVar.f217178b;
                    i18 = eVar.f217179c;
                    i25 = i19;
                    i28 = i26;
                }
            }
        } else {
            i17 = jVar2.i();
            if (i17 == 3) {
                jVar2.l();
            }
            int i47 = jVar2.i();
            int i48 = jVar2.i();
            if (jVar2.e()) {
                int i49 = jVar2.i();
                int i55 = jVar2.i();
                int i56 = jVar2.i();
                int i57 = jVar2.i();
                iB = b(i47, i17, i49, i55);
                iA = a(i48, i17, i56, i57);
            } else {
                iA = i48;
                iB = i47;
            }
            int i58 = jVar2.i();
            i18 = jVar2.i();
            i19 = iA;
            i25 = i48;
            i26 = iB;
            i27 = i58;
            i28 = i47;
        }
        int i59 = jVar2.i();
        if (z15) {
            iMax = -1;
        } else {
            int i65 = jVar2.e() ? 0 : iF;
            iMax = -1;
            while (i65 <= iF) {
                jVar2.i();
                iMax = Math.max(jVar2.i(), iMax);
                jVar2.i();
                i65++;
                i25 = i25;
            }
        }
        int i66 = i25;
        jVar2.i();
        jVar2.i();
        jVar2.i();
        jVar2.i();
        jVar2.i();
        jVar2.i();
        if (jVar2.e()) {
            if (z15 ? jVar2.e() : false) {
                jVar2.m(6);
            } else if (jVar2.e()) {
                H(jVar2);
            }
        }
        int i67 = 2;
        jVar2.m(2);
        if (jVar2.e()) {
            jVar2.m(8);
            jVar2.i();
            jVar2.i();
            jVar2.l();
        }
        I(jVar2);
        if (jVar2.e()) {
            int i68 = jVar2.i();
            int i69 = 0;
            while (i69 < i68) {
                jVar2.m(i59 + 5);
                i69++;
                i67 = 2;
            }
        }
        jVar2.m(i67);
        if (jVar2.e()) {
            if (jVar2.e()) {
                int iF3 = jVar2.f(8);
                if (iF3 == 255) {
                    int iF4 = jVar2.f(16);
                    int iF5 = jVar2.f(16);
                    if (iF4 == 0 || iF5 == 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = iF4 / iF5;
                    }
                } else {
                    float[] fArr = f217161b;
                    if (iF3 < fArr.length) {
                        f15 = fArr[iF3];
                    } else {
                        t.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iF3);
                        f15 = 1.0f;
                    }
                }
            } else {
                f15 = 1.0f;
            }
            if (jVar2.e()) {
                jVar2.l();
            }
            if (jVar2.e()) {
                jVar2.m(3);
                i37 = jVar2.e() ? 1 : 2;
                if (jVar2.e()) {
                    int iF6 = jVar2.f(8);
                    int iF7 = jVar2.f(8);
                    jVar2.m(8);
                    iJ = t7.g.j(iF6);
                    iK = t7.g.k(iF7);
                } else {
                    iJ = -1;
                    iK = -1;
                }
            } else if (kVar == null || (jVar = kVar.f217218e) == null || jVar.f217212a.size() <= (i38 = jVar.f217213b[i39])) {
                i37 = -1;
                iJ = -1;
                iK = -1;
            } else {
                i iVar = kVar.f217218e.f217212a.get(i38);
                iJ = iVar.f217209a;
                int i75 = iVar.f217210b;
                iK = iVar.f217211c;
                i37 = i75;
            }
            if (jVar2.e()) {
                jVar2.i();
                jVar2.i();
            }
            jVar2.l();
            if (jVar2.e()) {
                i19 *= 2;
            }
            i36 = iK;
            i35 = i37;
            i29 = iJ;
        } else {
            f15 = 1.0f;
            i29 = -1;
            i35 = -1;
            i36 = -1;
        }
        return new h(bVar, iF, cVarR, i17, i27, i18, i46, i26, i19, i28, i66, f15, iMax, i29, i35, i36);
    }

    private static i x(x7.j jVar) {
        jVar.m(3);
        int i15 = jVar.e() ? 1 : 2;
        int iJ = t7.g.j(jVar.f(8));
        int iK = t7.g.k(jVar.f(8));
        jVar.m(8);
        return new i(iJ, i15, iK);
    }

    private static j y(x7.j jVar, int i15, int i16, int[] iArr) {
        if (!jVar.e() ? jVar.e() : true) {
            jVar.l();
        }
        boolean zE = jVar.e();
        boolean zE2 = jVar.e();
        if (zE || zE2) {
            for (int i17 = 0; i17 < i16; i17++) {
                for (int i18 = 0; i18 < iArr[i17]; i18++) {
                    boolean zE3 = zE ? jVar.e() : false;
                    boolean zE4 = zE2 ? jVar.e() : false;
                    if (zE3) {
                        jVar.m(32);
                    }
                    if (zE4) {
                        jVar.m(18);
                    }
                }
            }
        }
        boolean zE5 = jVar.e();
        int iF = zE5 ? jVar.f(4) + 1 : i15;
        n0.a aVarT = n0.t(iF);
        int[] iArr2 = new int[i15];
        for (int i19 = 0; i19 < iF; i19++) {
            aVarT.a(x(jVar));
        }
        if (zE5 && iF > 1) {
            for (int i25 = 0; i25 < i15; i25++) {
                iArr2[i25] = jVar.f(4);
            }
        }
        return new j(aVarT.k(), iArr2);
    }

    public static k z(byte[] bArr, int i15, int i16) {
        x7.j jVar = new x7.j(bArr, i15, i16);
        return A(jVar, q(jVar));
    }
}
