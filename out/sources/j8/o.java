package j8;

import a8.a3;
import a8.b3;
import a8.z2;
import ak.d0;
import ak.n0;
import ak.n1;
import ak.u0;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import h8.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import t7.f0;
import t7.g0;
import t7.h0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class o extends u implements a3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final n1<Integer> f100052l = n1.b(new Comparator() { // from class: j8.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return o.u((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f100053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f100054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.b f100055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f100056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread f100057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l8.c f100058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t7.b f100059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f100060k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends h<b> implements Comparable<b> {
        private final boolean A;
        private final boolean B;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f100061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f100062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f100063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final e f100064h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f100065j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f100066k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f100067l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f100068m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f100069n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f100070p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f100071q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f100072r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f100073s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f100074t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f100075v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f100076w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f100077x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final int f100078y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final boolean f100079z;

        public b(int i15, f0 f0Var, int i16, e eVar, int i17, boolean z15, zj.q<t7.p> qVar, int i18) {
            int i19;
            int iJ;
            int iJ2;
            super(i15, f0Var, i16);
            this.f100064h = eVar;
            int i25 = eVar.G0 ? 24 : 16;
            this.f100070p = eVar.C0 && (i18 & i25) != 0;
            this.f100063g = o.W(this.f100115d.f188369d);
            this.f100065j = a3.p(i17, false);
            int i26 = 0;
            while (true) {
                i19 = Integer.MAX_VALUE;
                if (i26 >= eVar.f188246q.size()) {
                    iJ = 0;
                    i26 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = o.J(this.f100115d, eVar.f188246q.get(i26), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
            this.f100067l = i26;
            this.f100066k = iJ;
            this.f100068m = o.M(this.f100115d.f188371f, eVar.f188248s);
            this.f100069n = o.I(this.f100115d, eVar.f188247r);
            t7.p pVar = this.f100115d;
            int i27 = pVar.f188371f;
            this.f100071q = i27 == 0 || (i27 & 1) != 0;
            this.f100074t = (pVar.f188370e & 1) != 0;
            this.B = o.R(pVar);
            t7.p pVar2 = this.f100115d;
            int i28 = pVar2.H;
            this.f100075v = i28;
            this.f100076w = pVar2.I;
            int i29 = pVar2.f188375j;
            this.f100077x = i29;
            this.f100062f = (i29 == -1 || i29 <= eVar.f188250u) && (i28 == -1 || i28 <= eVar.f188249t) && qVar.apply(pVar2);
            String[] strArrK0 = o0.k0();
            int i35 = 0;
            while (true) {
                if (i35 >= strArrK0.length) {
                    iJ2 = 0;
                    i35 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ2 = o.J(this.f100115d, strArrK0[i35], false);
                    if (iJ2 > 0) {
                        break;
                    } else {
                        i35++;
                    }
                }
            }
            this.f100072r = i35;
            this.f100073s = iJ2;
            for (int i36 = 0; i36 < eVar.f188251v.size(); i36++) {
                String str = this.f100115d.f188381p;
                if (str != null && str.equals(eVar.f188251v.get(i36))) {
                    i19 = i36;
                    break;
                }
            }
            this.f100078y = i19;
            this.f100079z = a3.o(i17) == 128;
            this.A = a3.K(i17) == 64;
            this.f100061e = l(i17, z15, i25);
        }

        public static int g(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static n0<b> k(int i15, f0 f0Var, e eVar, int[] iArr, boolean z15, zj.q<t7.p> qVar, int i16) {
            n0.a aVarS = n0.s();
            for (int i17 = 0; i17 < f0Var.f188177a; i17++) {
                aVarS.a(new b(i15, f0Var, i17, eVar, iArr[i17], z15, qVar, i16));
            }
            return aVarS.k();
        }

        private int l(int i15, boolean z15, int i16) {
            if (!a3.p(i15, this.f100064h.I0)) {
                return 0;
            }
            if (!this.f100062f && !this.f100064h.B0) {
                return 0;
            }
            e eVar = this.f100064h;
            if (eVar.f188252w.f188260a == 2 && !o.X(eVar, i15, this.f100115d)) {
                return 0;
            }
            if (!a3.p(i15, false) || !this.f100062f || this.f100115d.f188375j == -1) {
                return 1;
            }
            e eVar2 = this.f100064h;
            if (eVar2.G || eVar2.F) {
                return 1;
            }
            return ((!eVar2.K0 && z15) || eVar2.f188252w.f188260a == 2 || (i15 & i16) == 0) ? 1 : 2;
        }

        @Override // j8.o.h
        public int b() {
            return this.f100061e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            n1 n1VarG = (this.f100062f && this.f100065j) ? o.f100052l : o.f100052l.g();
            d0 d0VarG = d0.k().h(this.f100065j, bVar.f100065j).g(Integer.valueOf(this.f100067l), Integer.valueOf(bVar.f100067l), n1.d().g()).d(this.f100066k, bVar.f100066k).d(this.f100068m, bVar.f100068m).g(Integer.valueOf(this.f100069n), Integer.valueOf(bVar.f100069n), n1.d().g()).h(this.f100074t, bVar.f100074t).h(this.f100071q, bVar.f100071q).g(Integer.valueOf(this.f100072r), Integer.valueOf(bVar.f100072r), n1.d().g()).d(this.f100073s, bVar.f100073s).h(this.f100062f, bVar.f100062f).g(Integer.valueOf(this.f100078y), Integer.valueOf(bVar.f100078y), n1.d().g());
            if (this.f100064h.F) {
                d0VarG = d0VarG.g(Integer.valueOf(this.f100077x), Integer.valueOf(bVar.f100077x), o.f100052l.g());
            }
            d0 d0VarG2 = d0VarG.h(this.f100079z, bVar.f100079z).h(this.A, bVar.A).h(this.B, bVar.B).g(Integer.valueOf(this.f100075v), Integer.valueOf(bVar.f100075v), n1VarG).g(Integer.valueOf(this.f100076w), Integer.valueOf(bVar.f100076w), n1VarG);
            if (Objects.equals(this.f100063g, bVar.f100063g)) {
                d0VarG2 = d0VarG2.g(Integer.valueOf(this.f100077x), Integer.valueOf(bVar.f100077x), n1VarG);
            }
            return d0VarG2.j();
        }

        @Override // j8.o.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean e(b bVar) {
            int i15;
            String str;
            int i16;
            if (!this.f100064h.E0 && ((i16 = this.f100115d.H) == -1 || i16 != bVar.f100115d.H)) {
                return false;
            }
            if (!this.f100070p && ((str = this.f100115d.f188381p) == null || !TextUtils.equals(str, bVar.f100115d.f188381p))) {
                return false;
            }
            e eVar = this.f100064h;
            if (!eVar.D0 && ((i15 = this.f100115d.I) == -1 || i15 != bVar.f100115d.I)) {
                return false;
            }
            if (eVar.F0) {
                return true;
            }
            return this.f100079z == bVar.f100079z && this.A == bVar.A;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends h<c> implements Comparable<c> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f100080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f100081f;

        public c(int i15, f0 f0Var, int i16, e eVar, int i17) {
            super(i15, f0Var, i16);
            this.f100080e = a3.p(i17, eVar.I0) ? 1 : 0;
            this.f100081f = this.f100115d.e();
        }

        public static int g(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static n0<c> k(int i15, f0 f0Var, e eVar, int[] iArr) {
            n0.a aVarS = n0.s();
            for (int i16 = 0; i16 < f0Var.f188177a; i16++) {
                aVarS.a(new c(i15, f0Var, i16, eVar, iArr[i16]));
            }
            return aVarS.k();
        }

        @Override // j8.o.h
        public int b() {
            return this.f100080e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f100081f, cVar.f100081f);
        }

        @Override // j8.o.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean e(c cVar) {
            return false;
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f100082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f100083b;

        public d(t7.p pVar, int i15) {
            this.f100082a = (pVar.f188370e & 1) != 0;
            this.f100083b = a3.p(i15, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return d0.k().h(this.f100083b, dVar.f100083b).h(this.f100082a, dVar.f100082a).j();
        }
    }

    public static final class e extends h0 {
        public static final e O0;

        @Deprecated
        public static final e P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private static final String f100084a1;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        private static final String f100085b1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        private static final String f100086c1;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        private static final String f100087d1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static final String f100088e1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        private static final String f100089f1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private static final String f100090g1;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private static final String f100091h1;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        private static final String f100092i1;
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        public final boolean E0;
        public final boolean F0;
        public final boolean G0;
        public final boolean H0;
        public final boolean I0;
        public final boolean J0;
        public final boolean K0;
        public final boolean L0;
        private final SparseArray<Map<j1, f>> M0;
        private final SparseBooleanArray N0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final boolean f100093x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f100094y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final boolean f100095z0;

        public static final class a extends h0.c {
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private boolean R;
            private boolean S;
            private boolean T;
            private boolean U;
            private boolean V;
            private boolean W;
            private boolean X;
            private final SparseArray<Map<j1, f>> Y;
            private final SparseBooleanArray Z;

            private static SparseArray<Map<j1, f>> e0(SparseArray<Map<j1, f>> sparseArray) {
                SparseArray<Map<j1, f>> sparseArray2 = new SparseArray<>();
                for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                    sparseArray2.put(sparseArray.keyAt(i15), new HashMap(sparseArray.valueAt(i15)));
                }
                return sparseArray2;
            }

            private void f0() {
                this.J = true;
                this.K = false;
                this.L = true;
                this.M = false;
                this.N = true;
                this.O = false;
                this.P = false;
                this.Q = false;
                this.R = false;
                this.S = true;
                this.T = true;
                this.U = true;
                this.V = false;
                this.W = true;
                this.X = false;
            }

            @Override // t7.h0.c
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public e J() {
                return new e(this);
            }

            protected a g0(h0 h0Var) {
                super.L(h0Var);
                return this;
            }

            public a() {
                this.Y = new SparseArray<>();
                this.Z = new SparseBooleanArray();
                f0();
            }

            private a(e eVar) {
                super(eVar);
                this.J = eVar.f100093x0;
                this.K = eVar.f100094y0;
                this.L = eVar.f100095z0;
                this.M = eVar.A0;
                this.N = eVar.B0;
                this.O = eVar.C0;
                this.P = eVar.D0;
                this.Q = eVar.E0;
                this.R = eVar.F0;
                this.S = eVar.G0;
                this.T = eVar.H0;
                this.U = eVar.I0;
                this.V = eVar.J0;
                this.W = eVar.K0;
                this.X = eVar.L0;
                this.Y = e0(eVar.M0);
                this.Z = eVar.N0.clone();
            }
        }

        static {
            e eVarJ = new a().J();
            O0 = eVarJ;
            P0 = eVarJ;
            Q0 = o0.u0(1000);
            R0 = o0.u0(1001);
            S0 = o0.u0(1002);
            T0 = o0.u0(1003);
            U0 = o0.u0(1004);
            V0 = o0.u0(1005);
            W0 = o0.u0(1006);
            X0 = o0.u0(1007);
            Y0 = o0.u0(1008);
            Z0 = o0.u0(1009);
            f100084a1 = o0.u0(1010);
            f100085b1 = o0.u0(1011);
            f100086c1 = o0.u0(1012);
            f100087d1 = o0.u0(1013);
            f100088e1 = o0.u0(1014);
            f100089f1 = o0.u0(1015);
            f100090g1 = o0.u0(1016);
            f100091h1 = o0.u0(1017);
            f100092i1 = o0.u0(1018);
        }

        private static boolean c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i15 = 0; i15 < size; i15++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i15)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean d(SparseArray<Map<j1, f>> sparseArray, SparseArray<Map<j1, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i15 = 0; i15 < size; i15++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i15));
                if (iIndexOfKey < 0 || !e(sparseArray.valueAt(i15), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(Map<j1, f> map, Map<j1, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<j1, f> entry : map.entrySet()) {
                j1 key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        @Override // t7.h0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f100093x0 == eVar.f100093x0 && this.f100094y0 == eVar.f100094y0 && this.f100095z0 == eVar.f100095z0 && this.A0 == eVar.A0 && this.B0 == eVar.B0 && this.C0 == eVar.C0 && this.D0 == eVar.D0 && this.E0 == eVar.E0 && this.F0 == eVar.F0 && this.G0 == eVar.G0 && this.H0 == eVar.H0 && this.I0 == eVar.I0 && this.J0 == eVar.J0 && this.K0 == eVar.K0 && this.L0 == eVar.L0 && c(this.N0, eVar.N0) && d(this.M0, eVar.M0)) {
                    return true;
                }
            }
            return false;
        }

        public a f() {
            return new a();
        }

        public boolean g(int i15) {
            return this.N0.get(i15);
        }

        @Deprecated
        public f h(int i15, j1 j1Var) {
            Map<j1, f> map = this.M0.get(i15);
            if (map != null) {
                return map.get(j1Var);
            }
            return null;
        }

        @Override // t7.h0
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f100093x0 ? 1 : 0)) * 31) + (this.f100094y0 ? 1 : 0)) * 31) + (this.f100095z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0)) * 31) + (this.E0 ? 1 : 0)) * 31) + (this.F0 ? 1 : 0)) * 31) + (this.G0 ? 1 : 0)) * 31) + (this.H0 ? 1 : 0)) * 31) + (this.I0 ? 1 : 0)) * 31) + (this.J0 ? 1 : 0)) * 31) + (this.K0 ? 1 : 0)) * 31) + (this.L0 ? 1 : 0);
        }

        @Deprecated
        public boolean i(int i15, j1 j1Var) {
            Map<j1, f> map = this.M0.get(i15);
            return map != null && map.containsKey(j1Var);
        }

        private e(a aVar) {
            super(aVar);
            this.f100093x0 = aVar.J;
            this.f100094y0 = aVar.K;
            this.f100095z0 = aVar.L;
            this.A0 = aVar.M;
            this.B0 = aVar.N;
            this.C0 = aVar.O;
            this.D0 = aVar.P;
            this.E0 = aVar.Q;
            this.F0 = aVar.R;
            this.G0 = aVar.S;
            this.H0 = aVar.T;
            this.I0 = aVar.U;
            this.J0 = aVar.V;
            this.K0 = aVar.W;
            this.L0 = aVar.X;
            this.M0 = aVar.Y;
            this.N0 = aVar.Z;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f100096d = o0.u0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f100097e = o0.u0(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f100098f = o0.u0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f100099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f100100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f100101c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f100099a == fVar.f100099a && Arrays.equals(this.f100100b, fVar.f100100b) && this.f100101c == fVar.f100101c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f100099a * 31) + Arrays.hashCode(this.f100100b)) * 31) + this.f100101c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g extends h<g> implements Comparable<g> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f100102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f100103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f100104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f100105h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f100106j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f100107k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f100108l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f100109m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f100110n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f100111p;

        public g(int i15, f0 f0Var, int i16, e eVar, int i17, String str, String str2) {
            int iJ;
            super(i15, f0Var, i16);
            int i18 = 0;
            this.f100103f = a3.p(i17, false);
            int i19 = this.f100115d.f188370e & (~eVar.C);
            this.f100104g = (i19 & 1) != 0;
            this.f100105h = (i19 & 2) != 0;
            n0<String> n0VarE = str2 != null ? n0.E(str2) : eVar.f188254y.isEmpty() ? n0.E("") : eVar.f188254y;
            int i25 = 0;
            while (true) {
                if (i25 >= n0VarE.size()) {
                    iJ = 0;
                    i25 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = o.J(this.f100115d, n0VarE.get(i25), eVar.D);
                    if (iJ > 0) {
                        break;
                    } else {
                        i25++;
                    }
                }
            }
            this.f100106j = i25;
            this.f100107k = iJ;
            int iM = o.M(this.f100115d.f188371f, str2 != null ? 1088 : eVar.A);
            this.f100108l = iM;
            t7.p pVar = this.f100115d;
            this.f100111p = (1088 & pVar.f188371f) != 0;
            int I = o.I(pVar, eVar.f188255z);
            this.f100109m = I;
            int iJ2 = o.J(this.f100115d, str, o.W(str) == null);
            this.f100110n = iJ2;
            boolean z15 = iJ > 0 || (eVar.f188254y.isEmpty() && iM > 0) || ((eVar.f188254y.isEmpty() && I != Integer.MAX_VALUE) || this.f100104g || ((this.f100105h && iJ2 > 0) || eVar.f188253x));
            if (a3.p(i17, eVar.I0) && z15) {
                i18 = 1;
            }
            this.f100102e = i18;
        }

        public static int g(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static n0<g> k(int i15, f0 f0Var, e eVar, int[] iArr, String str, String str2) {
            n0.a aVarS = n0.s();
            for (int i16 = 0; i16 < f0Var.f188177a; i16++) {
                aVarS.a(new g(i15, f0Var, i16, eVar, iArr[i16], str, str2));
            }
            return aVarS.k();
        }

        @Override // j8.o.h
        public int b() {
            return this.f100102e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            d0 d0VarD = d0.k().h(this.f100103f, gVar.f100103f).g(Integer.valueOf(this.f100106j), Integer.valueOf(gVar.f100106j), n1.d().g()).d(this.f100107k, gVar.f100107k).d(this.f100108l, gVar.f100108l).g(Integer.valueOf(this.f100109m), Integer.valueOf(gVar.f100109m), n1.d().g()).h(this.f100104g, gVar.f100104g).g(Boolean.valueOf(this.f100105h), Boolean.valueOf(gVar.f100105h), this.f100107k == 0 ? n1.d() : n1.d().g()).d(this.f100110n, gVar.f100110n);
            if (this.f100108l == 0) {
                d0VarD = d0VarD.i(this.f100111p, gVar.f100111p);
            }
            return d0VarD.j();
        }

        @Override // j8.o.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean e(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class h<T extends h<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f100112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f100113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f100114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t7.p f100115d;

        public interface a<T extends h<T>> {
            List<T> a(int i15, f0 f0Var, int[] iArr);
        }

        public h(int i15, f0 f0Var, int i16) {
            this.f100112a = i15;
            this.f100113b = f0Var;
            this.f100114c = i16;
            this.f100115d = f0Var.a(i16);
        }

        public abstract int b();

        public abstract boolean e(T t15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i extends h<i> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f100116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e f100117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f100118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f100119h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f100120j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f100121k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f100122l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f100123m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f100124n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f100125p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f100126q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f100127r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final boolean f100128s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f100129t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f100130v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f100131w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f100132x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f100133y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final int f100134z;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public i(int i15, f0 f0Var, int i16, e eVar, int i17, String str, int i18, boolean z15) {
            boolean z16;
            boolean z17;
            int i19;
            int iJ;
            t7.p pVar;
            int i25;
            int i26;
            int i27;
            t7.p pVar2;
            int i28;
            int i29;
            int i35;
            super(i15, f0Var, i16);
            this.f100117f = eVar;
            int i36 = eVar.f100095z0 ? 24 : 16;
            this.f100130v = eVar.f100094y0 && (i18 & i36) != 0;
            if (!z15 || (((i28 = (pVar2 = this.f100115d).f188388w) != -1 && i28 > eVar.f188230a) || ((i29 = pVar2.f188389x) != -1 && i29 > eVar.f188231b))) {
                z16 = false;
            } else {
                float f15 = pVar2.A;
                if ((f15 == -1.0f || f15 <= eVar.f188232c) && ((i35 = pVar2.f188375j) == -1 || i35 <= eVar.f188233d)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            this.f100116e = z16;
            if (!z15 || (((i25 = (pVar = this.f100115d).f188388w) != -1 && i25 < eVar.f188234e) || ((i26 = pVar.f188389x) != -1 && i26 < eVar.f188235f))) {
                z17 = false;
            } else {
                float f16 = pVar.A;
                if ((f16 == -1.0f || f16 >= eVar.f188236g) && ((i27 = pVar.f188375j) == -1 || i27 >= eVar.f188237h)) {
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
            this.f100118g = z17;
            this.f100119h = a3.p(i17, false);
            t7.p pVar3 = this.f100115d;
            float f17 = pVar3.A;
            this.f100120j = f17 != -1.0f && f17 >= 10.0f;
            this.f100121k = pVar3.f188375j;
            this.f100122l = pVar3.e();
            int i37 = 0;
            while (true) {
                i19 = Integer.MAX_VALUE;
                if (i37 >= eVar.f188244o.size()) {
                    i37 = Integer.MAX_VALUE;
                    iJ = 0;
                    break;
                } else {
                    iJ = o.J(this.f100115d, eVar.f188244o.get(i37), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i37++;
                    }
                }
            }
            this.f100124n = i37;
            this.f100125p = iJ;
            this.f100126q = o.M(this.f100115d.f188371f, eVar.f188245p);
            int i38 = this.f100115d.f188371f;
            this.f100128s = i38 == 0 || (i38 & 1) != 0;
            this.f100129t = o.J(this.f100115d, str, o.W(str) == null);
            for (int i39 = 0; i39 < eVar.f188242m.size(); i39++) {
                String str2 = this.f100115d.f188381p;
                if (str2 != null && str2.equals(eVar.f188242m.get(i39))) {
                    i19 = i39;
                    break;
                }
            }
            this.f100123m = i19;
            this.f100127r = o.I(this.f100115d, eVar.f188243n);
            this.f100132x = a3.o(i17) == 128;
            this.f100133y = a3.K(i17) == 64;
            this.f100134z = o.O(this.f100115d.f188381p);
            this.f100131w = p(i17, i36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int k(i iVar, i iVar2) {
            d0 d0VarH = d0.k().h(iVar.f100119h, iVar2.f100119h).g(Integer.valueOf(iVar.f100124n), Integer.valueOf(iVar2.f100124n), n1.d().g()).d(iVar.f100125p, iVar2.f100125p).d(iVar.f100126q, iVar2.f100126q).g(Integer.valueOf(iVar.f100127r), Integer.valueOf(iVar2.f100127r), n1.d().g()).h(iVar.f100128s, iVar2.f100128s).d(iVar.f100129t, iVar2.f100129t).h(iVar.f100120j, iVar2.f100120j).h(iVar.f100116e, iVar2.f100116e).h(iVar.f100118g, iVar2.f100118g).g(Integer.valueOf(iVar.f100123m), Integer.valueOf(iVar2.f100123m), n1.d().g()).h(iVar.f100132x, iVar2.f100132x).h(iVar.f100133y, iVar2.f100133y);
            if (iVar.f100132x && iVar.f100133y) {
                d0VarH = d0VarH.d(iVar.f100134z, iVar2.f100134z);
            }
            return d0VarH.j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int l(i iVar, i iVar2) {
            n1 n1VarG = (iVar.f100116e && iVar.f100119h) ? o.f100052l : o.f100052l.g();
            d0 d0VarK = d0.k();
            if (iVar.f100117f.F) {
                d0VarK = d0VarK.g(Integer.valueOf(iVar.f100121k), Integer.valueOf(iVar2.f100121k), o.f100052l.g());
            }
            return d0VarK.g(Integer.valueOf(iVar.f100122l), Integer.valueOf(iVar2.f100122l), n1VarG).g(Integer.valueOf(iVar.f100121k), Integer.valueOf(iVar2.f100121k), n1VarG).j();
        }

        public static int n(List<i> list, List<i> list2) {
            return d0.k().g((i) Collections.max(list, new Comparator() { // from class: j8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o.i.k((o.i) obj, (o.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: j8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o.i.k((o.i) obj, (o.i) obj2);
                }
            }), new Comparator() { // from class: j8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o.i.k((o.i) obj, (o.i) obj2);
                }
            }).d(list.size(), list2.size()).g((i) Collections.max(list, new Comparator() { // from class: j8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o.i.l((o.i) obj, (o.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: j8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o.i.l((o.i) obj, (o.i) obj2);
                }
            }), new Comparator() { // from class: j8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o.i.l((o.i) obj, (o.i) obj2);
                }
            }).j();
        }

        public static n0<i> o(int i15, f0 f0Var, e eVar, int[] iArr, String str, int i16, Point point) {
            int iK = o.K(f0Var, point != null ? point.x : eVar.f188238i, point != null ? point.y : eVar.f188239j, eVar.f188241l);
            n0.a aVarS = n0.s();
            for (int i17 = 0; i17 < f0Var.f188177a; i17++) {
                int iE = f0Var.a(i17).e();
                aVarS.a(new i(i15, f0Var, i17, eVar, iArr[i17], str, i16, iK == Integer.MAX_VALUE || (iE != -1 && iE <= iK)));
            }
            return aVarS.k();
        }

        private int p(int i15, int i16) {
            if ((this.f100115d.f188371f & 16384) != 0 || !a3.p(i15, this.f100117f.I0)) {
                return 0;
            }
            if (!this.f100116e && !this.f100117f.f100093x0) {
                return 0;
            }
            if (!a3.p(i15, false) || !this.f100118g || !this.f100116e || this.f100115d.f188375j == -1) {
                return 1;
            }
            e eVar = this.f100117f;
            return (eVar.G || eVar.F || (i15 & i16) == 0) ? 1 : 2;
        }

        @Override // j8.o.h
        public int b() {
            return this.f100131w;
        }

        @Override // j8.o.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean e(i iVar) {
            if (!this.f100130v && !Objects.equals(this.f100115d.f188381p, iVar.f100115d.f188381p)) {
                return false;
            }
            if (this.f100117f.A0) {
                return true;
            }
            return this.f100132x == iVar.f100132x && this.f100133y == iVar.f100133y;
        }
    }

    public o(Context context) {
        this(context, new j8.a.b());
    }

    private static void D(u.a aVar, e eVar, r.a[] aVarArr) {
        int iD = aVar.d();
        for (int i15 = 0; i15 < iD; i15++) {
            j1 j1VarF = aVar.f(i15);
            if (eVar.i(i15, j1VarF)) {
                f fVarH = eVar.h(i15, j1VarF);
                aVarArr[i15] = (fVarH == null || fVarH.f100100b.length == 0) ? null : new r.a(j1VarF.b(fVarH.f100099a), fVarH.f100100b, fVarH.f100101c);
            }
        }
    }

    private static void E(u.a aVar, e eVar, r.a[] aVarArr) {
        for (int i15 = 0; i15 < aVar.d(); i15++) {
            int iE = aVar.e(i15);
            if (eVar.g(i15) || eVar.I.contains(Integer.valueOf(iE))) {
                aVarArr[i15] = null;
            }
        }
    }

    private static void F(u.a aVar, h0 h0Var, r.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i15 = 0; i15 < iD; i15++) {
            G(aVar.f(i15), h0Var, map);
        }
        G(aVar.h(), h0Var, map);
        for (int i16 = 0; i16 < iD; i16++) {
            g0 g0Var = (g0) map.get(Integer.valueOf(aVar.e(i16)));
            if (g0Var != null) {
                aVarArr[i16] = (g0Var.f188206b.isEmpty() || aVar.f(i16).d(g0Var.f188205a) == -1) ? null : new r.a(g0Var.f188205a, ek.g.n(g0Var.f188206b));
            }
        }
    }

    private static void G(j1 j1Var, h0 h0Var, Map<Integer, g0> map) {
        g0 g0Var;
        for (int i15 = 0; i15 < j1Var.f81616a; i15++) {
            g0 g0Var2 = h0Var.H.get(j1Var.b(i15));
            if (g0Var2 != null && ((g0Var = map.get(Integer.valueOf(g0Var2.a()))) == null || (g0Var.f188206b.isEmpty() && !g0Var2.f188206b.isEmpty()))) {
                map.put(Integer.valueOf(g0Var2.a()), g0Var2);
            }
        }
    }

    private static Pair<r.a, Integer> H(r.a[] aVarArr, int i15) {
        for (int i16 = 0; i16 < aVarArr.length; i16++) {
            r.a aVar = aVarArr[i16];
            if (aVar != null && aVar.f100135a.f188179c == i15) {
                return Pair.create(aVar, Integer.valueOf(i16));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(t7.p pVar, n0<String> n0Var) {
        for (int i15 = 0; i15 < n0Var.size(); i15++) {
            for (int i16 = 0; i16 < pVar.f188368c.size(); i16++) {
                if (pVar.f188368c.get(i16).f188424b.equals(n0Var.get(i15))) {
                    return i15;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    protected static int J(t7.p pVar, String str, boolean z15) {
        if (!TextUtils.isEmpty(str) && str.equals(pVar.f188369d)) {
            return 4;
        }
        String strW = W(str);
        String strW2 = W(pVar.f188369d);
        if (strW2 == null || strW == null) {
            return (z15 && strW2 == null) ? 1 : 0;
        }
        if (strW2.startsWith(strW) || strW.startsWith(strW2)) {
            return 3;
        }
        return o0.a1(strW2, "-")[0].equals(o0.a1(strW, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(f0 f0Var, int i15, int i16, boolean z15) {
        int i17;
        int i18 = Integer.MAX_VALUE;
        if (i15 != Integer.MAX_VALUE && i16 != Integer.MAX_VALUE) {
            for (int i19 = 0; i19 < f0Var.f188177a; i19++) {
                t7.p pVarA = f0Var.a(i19);
                int i25 = pVarA.f188388w;
                if (i25 > 0 && (i17 = pVarA.f188389x) > 0) {
                    Point pointC = w.c(z15, i15, i16, i25, i17);
                    int i26 = pVarA.f188388w;
                    int i27 = pVarA.f188389x;
                    int i28 = i26 * i27;
                    if (i26 >= ((int) (pointC.x * 0.98f)) && i27 >= ((int) (pointC.y * 0.98f)) && i28 < i18) {
                        i18 = i28;
                    }
                }
            }
        }
        return i18;
    }

    private static String L(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return o0.Z(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(int i15, int i16) {
        if (i15 == 0 || i15 != i16) {
            return Integer.bitCount(i15 & i16);
        }
        return Integer.MAX_VALUE;
    }

    private static u0<String> N(r.a[] aVarArr, e eVar) {
        u0.a aVarS = u0.s();
        for (int i15 = 0; i15 < aVarArr.length; i15++) {
            r.a aVar = aVarArr[i15];
            if (aVar != null && !eVar.g(i15) && !eVar.I.contains(Integer.valueOf(aVar.f100135a.f188179c))) {
                aVarS.a(aVar.f100135a.f188178b);
                int i16 = 0;
                while (true) {
                    int[] iArr = aVar.f100136b;
                    if (i16 < iArr.length) {
                        String str = aVar.f100135a.a(iArr[i16]).f188379n;
                        if (str != null) {
                            aVarS.a(str);
                        }
                        i16++;
                    }
                }
            }
        }
        return aVarS.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int O(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P(t7.p pVar, e eVar) {
        int i15;
        l8.c cVar;
        l8.c cVar2;
        if (!eVar.H0) {
            return true;
        }
        Boolean bool = this.f100060k;
        if ((bool != null && bool.booleanValue()) || (i15 = pVar.H) == -1 || i15 <= 2) {
            return true;
        }
        if (!Q(pVar) || (Build.VERSION.SDK_INT >= 32 && (cVar2 = this.f100058i) != null && cVar2.e())) {
            return Build.VERSION.SDK_INT >= 32 && (cVar = this.f100058i) != null && cVar.e() && this.f100058i.c() && this.f100058i.d() && this.f100058i.a(this.f100059j, pVar);
        }
        return true;
    }

    private static boolean Q(t7.p pVar) {
        String str = pVar.f188381p;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean R(t7.p pVar) {
        String str = pVar.f188381p;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    private static void S(e eVar, u.a aVar, int[][][] iArr, b3[] b3VarArr, r[] rVarArr) {
        int i15 = -1;
        boolean z15 = false;
        int i16 = 0;
        for (int i17 = 0; i17 < aVar.d(); i17++) {
            int iE = aVar.e(i17);
            r rVar = rVarArr[i17];
            if (iE != 1 && rVar != null) {
                return;
            }
            if (iE == 1 && rVar != null && rVar.length() == 1) {
                if (X(eVar, iArr[i17][aVar.f(i17).d(rVar.i())][rVar.e(0)], rVar.l())) {
                    i16++;
                    i15 = i17;
                }
            }
        }
        if (i16 == 1) {
            int i18 = eVar.f188252w.f188261b ? 1 : 2;
            b3 b3Var = b3VarArr[i15];
            if (b3Var != null && b3Var.f4258b) {
                z15 = true;
            }
            b3VarArr[i15] = new b3(i18, z15);
        }
    }

    private static void T(u.a aVar, int[][][] iArr, b3[] b3VarArr, r[] rVarArr) {
        boolean z15;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        while (true) {
            if (i17 >= aVar.d()) {
                z15 = true;
                break;
            }
            int iE = aVar.e(i17);
            r rVar = rVarArr[i17];
            if ((iE == 1 || iE == 2) && rVar != null && Y(iArr[i17], aVar.f(i17), rVar)) {
                if (iE == 1) {
                    if (i16 != -1) {
                        z15 = false;
                        break;
                    }
                    i16 = i17;
                } else {
                    if (i15 != -1) {
                        z15 = false;
                        break;
                    }
                    i15 = i17;
                }
            }
            i17++;
        }
        if (z15 && ((i16 == -1 || i15 == -1) ? false : true)) {
            b3 b3Var = new b3(0, true);
            b3VarArr[i16] = b3Var;
            b3VarArr[i15] = b3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        boolean z15;
        l8.c cVar;
        synchronized (this.f100053d) {
            try {
                z15 = this.f100056g.H0 && Build.VERSION.SDK_INT >= 32 && (cVar = this.f100058i) != null && cVar.e();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            e();
        }
    }

    private void V(z2 z2Var) {
        boolean z15;
        synchronized (this.f100053d) {
            z15 = this.f100056g.L0;
        }
        if (z15) {
            f(z2Var);
        }
    }

    protected static String W(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean X(e eVar, int i15, t7.p pVar) {
        if (a3.C(i15) == 0) {
            return false;
        }
        if (eVar.f188252w.f188262c && (a3.C(i15) & 2048) == 0) {
            return false;
        }
        if (eVar.f188252w.f188261b) {
            boolean z15 = (pVar.K == 0 && pVar.L == 0) ? false : true;
            boolean z16 = (a3.C(i15) & 1024) != 0;
            if (z15 && !z16) {
                return false;
            }
        }
        return true;
    }

    private static boolean Y(int[][] iArr, j1 j1Var, r rVar) {
        if (rVar == null) {
            return false;
        }
        int iD = j1Var.d(rVar.i());
        for (int i15 = 0; i15 < rVar.length(); i15++) {
            if (a3.w(iArr[iD][rVar.e(i15)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<r.a, Integer> f0(int i15, u.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i16;
        RandomAccess randomAccessE;
        u.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i17 = 0;
        while (i17 < iD) {
            if (i15 == aVar3.e(i17)) {
                j1 j1VarF = aVar3.f(i17);
                for (int i18 = 0; i18 < j1VarF.f81616a; i18++) {
                    f0 f0VarB = j1VarF.b(i18);
                    List<T> listA = aVar2.a(i17, f0VarB, iArr[i17][i18]);
                    boolean[] zArr = new boolean[f0VarB.f188177a];
                    int i19 = 0;
                    while (i19 < f0VarB.f188177a) {
                        T t15 = listA.get(i19);
                        int iB = t15.b();
                        if (zArr[i19] || iB == 0) {
                            i16 = iD;
                        } else {
                            if (iB == 1) {
                                randomAccessE = n0.E(t15);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t15);
                                int i25 = i19 + 1;
                                while (i25 < f0VarB.f188177a) {
                                    T t16 = listA.get(i25);
                                    int i26 = iD;
                                    if (t16.b() == 2 && t15.e(t16)) {
                                        arrayList2.add(t16);
                                        zArr[i25] = true;
                                    }
                                    i25++;
                                    iD = i26;
                                }
                                randomAccessE = arrayList2;
                            }
                            i16 = iD;
                            arrayList.add(randomAccessE);
                        }
                        i19++;
                        iD = i16;
                    }
                }
            }
            i17++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i27 = 0; i27 < list.size(); i27++) {
            iArr2[i27] = ((h) list.get(i27)).f100114c;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new r.a(hVar.f100113b, iArr2), Integer.valueOf(hVar.f100112a));
    }

    public static /* synthetic */ List p(final o oVar, final e eVar, boolean z15, int[] iArr, int i15, f0 f0Var, int[] iArr2) {
        oVar.getClass();
        return b.k(i15, f0Var, eVar, iArr2, z15, new zj.q() { // from class: j8.e
            @Override // zj.q
            public final boolean apply(Object obj) {
                return this.f100037a.P((t7.p) obj, eVar);
            }
        }, iArr[i15]);
    }

    public static /* synthetic */ int u(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    protected void Z(r.a[] aVarArr, u.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        String str;
        String str2;
        Pair<r.a, Integer> pairE0;
        int iD = aVar.d();
        Pair<r.a, Integer> pairH = H(aVarArr, 1);
        if (pairH == null && (pairH = a0(aVar, iArr, iArr2, eVar)) != null) {
            aVarArr[((Integer) pairH.second).intValue()] = (r.a) pairH.first;
        }
        if (pairH == null) {
            str = null;
        } else {
            Object obj = pairH.first;
            str = ((r.a) obj).f100135a.a(((r.a) obj).f100136b[0]).f188369d;
        }
        Pair<r.a, Integer> pairH2 = H(aVarArr, 2);
        Pair<r.a, Integer> pairH3 = H(aVarArr, 4);
        if (pairH2 == null && pairH3 == null) {
            str2 = str;
            Pair<r.a, Integer> pairG0 = g0(aVar, iArr, iArr2, eVar, str2);
            Pair<r.a, Integer> pairB0 = (eVar.E || pairG0 == null) ? b0(aVar, iArr, eVar) : null;
            if (pairB0 != null) {
                aVarArr[((Integer) pairB0.second).intValue()] = (r.a) pairB0.first;
            } else if (pairG0 != null) {
                aVarArr[((Integer) pairG0.second).intValue()] = (r.a) pairG0.first;
            }
        } else {
            str2 = str;
        }
        if (H(aVarArr, 3) == null && (pairE0 = e0(aVar, iArr, eVar, str2)) != null) {
            aVarArr[((Integer) pairE0.second).intValue()] = (r.a) pairE0.first;
        }
        c0(aVarArr, aVar, iArr, eVar);
        for (int i15 = 0; i15 < iD; i15++) {
            int iE = aVar.e(i15);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4 && iE != 5 && aVarArr[i15] == null) {
                aVarArr[i15] = d0(iE, aVar.f(i15), iArr[i15], eVar);
            }
        }
    }

    @Override // a8.a3.a
    public void a(z2 z2Var) {
        V(z2Var);
    }

    protected Pair<r.a, Integer> a0(u.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z15 = false;
        for (int i15 = 0; i15 < aVar.d(); i15++) {
            if (2 == aVar.e(i15) && aVar.f(i15).f81616a > 0) {
                z15 = true;
                break;
            }
        }
        return f0(1, aVar, iArr, new h.a() { // from class: j8.k
            @Override // j8.o.h.a
            public final List a(int i16, f0 f0Var, int[] iArr3) {
                return o.p(this.f100045a, eVar, z15, iArr2, i16, f0Var, iArr3);
            }
        }, new Comparator() { // from class: j8.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.b.g((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<r.a, Integer> b0(u.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f188252w.f188260a == 2) {
            return null;
        }
        return f0(4, aVar, iArr, new h.a() { // from class: j8.g
            @Override // j8.o.h.a
            public final List a(int i15, f0 f0Var, int[] iArr2) {
                return o.c.k(i15, f0Var, eVar, iArr2);
            }
        }, new Comparator() { // from class: j8.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.c.g((List) obj, (List) obj2);
            }
        });
    }

    @Override // j8.x
    public a3.a c() {
        return this;
    }

    protected void c0(r.a[] aVarArr, u.a aVar, int[][][] iArr, e eVar) {
        if (eVar.f188252w.f188260a == 2) {
            return;
        }
        u0<String> u0VarN = N(aVarArr, eVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i15 = 0; i15 < aVar.d(); i15++) {
            if (aVar.e(i15) == 5) {
                j1 j1VarF = aVar.f(i15);
                for (int i16 = 0; i16 < j1VarF.f81616a; i16++) {
                    f0 f0VarB = j1VarF.b(i16);
                    arrayList.add(f0VarB);
                    int[] iArr2 = (int[]) iArr[i15][i16].clone();
                    for (int i17 = 0; i17 < iArr2.length; i17++) {
                        String str = f0VarB.a(i17).f188379n;
                        if (str != null && !u0VarN.contains(str)) {
                            iArr2[i17] = a3.y(0);
                        }
                    }
                    arrayList2.add(iArr2);
                }
            }
        }
        f0[] f0VarArr = new f0[arrayList.size()];
        o0.Q0(arrayList, f0VarArr);
        j1 j1Var = new j1(f0VarArr);
        int[][] iArr3 = new int[arrayList2.size()][];
        o0.Q0(arrayList2, iArr3);
        for (int i18 = 0; i18 < aVar.d(); i18++) {
            if (aVar.e(i18) == 5) {
                r.a aVarD0 = d0(5, j1Var, iArr3, eVar);
                aVarArr[i18] = aVarD0;
                if (aVarD0 == null) {
                    return;
                } else {
                    Arrays.fill(iArr3[j1Var.d(aVarD0.f100135a)], a3.y(0));
                }
            }
        }
    }

    protected r.a d0(int i15, j1 j1Var, int[][] iArr, e eVar) {
        if (eVar.f188252w.f188260a == 2) {
            return null;
        }
        int i16 = 0;
        f0 f0Var = null;
        d dVar = null;
        for (int i17 = 0; i17 < j1Var.f81616a; i17++) {
            f0 f0VarB = j1Var.b(i17);
            int[] iArr2 = iArr[i17];
            for (int i18 = 0; i18 < f0VarB.f188177a; i18++) {
                if (a3.p(iArr2[i18], eVar.I0)) {
                    d dVar2 = new d(f0VarB.a(i18), iArr2[i18]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        f0Var = f0VarB;
                        i16 = i18;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (f0Var == null) {
            return null;
        }
        return new r.a(f0Var, i16);
    }

    protected Pair<r.a, Integer> e0(u.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f188252w.f188260a == 2) {
            return null;
        }
        final String strL = eVar.B ? L(this.f100054e) : null;
        return f0(3, aVar, iArr, new h.a() { // from class: j8.m
            @Override // j8.o.h.a
            public final List a(int i15, f0 f0Var, int[] iArr2) {
                return o.g.k(i15, f0Var, eVar, iArr2, str, strL);
            }
        }, new Comparator() { // from class: j8.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.g.g((List) obj, (List) obj2);
            }
        });
    }

    @Override // j8.x
    public boolean g() {
        return true;
    }

    protected Pair<r.a, Integer> g0(u.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) {
        Context context;
        final Point pointR = null;
        if (eVar.f188252w.f188260a == 2) {
            return null;
        }
        if (eVar.f188240k && (context = this.f100054e) != null) {
            pointR = o0.R(context);
        }
        return f0(2, aVar, iArr, new h.a() { // from class: j8.i
            @Override // j8.o.h.a
            public final List a(int i15, f0 f0Var, int[] iArr3) {
                return o.i.o(i15, f0Var, eVar, iArr3, str, iArr2[i15], pointR);
            }
        }, new Comparator() { // from class: j8.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.i.n((List) obj, (List) obj2);
            }
        });
    }

    @Override // j8.x
    public void i() {
        l8.c cVar;
        synchronized (this.f100053d) {
            try {
                Thread thread = this.f100057h;
                if (thread != null) {
                    zj.p.x(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (cVar = this.f100058i) != null) {
            cVar.g();
            this.f100058i = null;
        }
        super.i();
    }

    @Override // j8.x
    public void k(t7.b bVar) {
        if (this.f100059j.equals(bVar)) {
            return;
        }
        this.f100059j = bVar;
        U();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00af */
    @Override // j8.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.util.Pair<a8.b3[], j8.r[]> o(j8.u.a r9, int[][][] r10, int[] r11, h8.c0.b r12, t7.e0 r13) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r1 = r8.f100053d
            monitor-enter(r1)
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Laa
            r8.f100057h = r0     // Catch: java.lang.Throwable -> Laa
            j8.o$e r7 = r8.f100056g     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.Boolean r0 = r8.f100060k
            if (r0 != 0) goto L1e
            android.content.Context r0 = r8.f100054e
            if (r0 == 0) goto L1e
            boolean r0 = w7.o0.D0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.f100060k = r0
        L1e:
            boolean r0 = r7.H0
            if (r0 == 0) goto L3c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L3c
            l8.c r0 = r8.f100058i
            if (r0 != 0) goto L3c
            l8.c r0 = new l8.c
            android.content.Context r1 = r8.f100054e
            j8.f r2 = new j8.f
            r2.<init>()
            java.lang.Boolean r3 = r8.f100060k
            r0.<init>(r1, r2, r3)
            r8.f100058i = r0
        L3c:
            int r0 = r9.d()
            j8.r$a[] r3 = new j8.r.a[r0]
            F(r9, r7, r3)
            D(r9, r7, r3)
            E(r9, r7, r3)
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r2.Z(r3, r4, r5, r6, r7)
            F(r4, r7, r3)
            D(r4, r7, r3)
            E(r4, r7, r3)
            j8.r$b r9 = r2.f100055f
            k8.d r10 = r8.b()
            j8.r[] r9 = r9.a(r3, r10, r12, r13)
            a8.b3[] r10 = new a8.b3[r0]
            r11 = 0
        L68:
            if (r11 >= r0) goto L95
            int r12 = r4.e(r11)
            boolean r13 = r7.g(r11)
            if (r13 != 0) goto L8f
            ak.u0<java.lang.Integer> r13 = r7.I
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r12 = r13.contains(r12)
            if (r12 == 0) goto L81
            goto L8f
        L81:
            int r12 = r4.e(r11)
            r13 = -2
            if (r12 == r13) goto L8c
            r12 = r9[r11]
            if (r12 == 0) goto L8f
        L8c:
            a8.b3 r12 = a8.b3.f4256c
            goto L90
        L8f:
            r12 = 0
        L90:
            r10[r11] = r12
            int r11 = r11 + 1
            goto L68
        L95:
            boolean r11 = r7.J0
            if (r11 == 0) goto L9c
            T(r4, r5, r10, r9)
        L9c:
            t7.h0$b r11 = r7.f188252w
            int r11 = r11.f188260a
            if (r11 == 0) goto La5
            S(r7, r4, r5, r10, r9)
        La5:
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Laa:
            r0 = move-exception
            r2 = r8
        Lac:
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laf
            throw r9
        Laf:
            r0 = move-exception
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.o.o(j8.u$a, int[][][], int[], h8.c0$b, t7.e0):android.util.Pair");
    }

    public o(Context context, r.b bVar) {
        this(context, e.O0, bVar);
    }

    public o(Context context, h0 h0Var, r.b bVar) {
        this(h0Var, bVar, context);
    }

    private o(h0 h0Var, r.b bVar, Context context) {
        this.f100053d = new Object();
        this.f100054e = context != null ? context.getApplicationContext() : null;
        this.f100055f = bVar;
        if (h0Var instanceof e) {
            this.f100056g = (e) h0Var;
        } else {
            this.f100056g = e.O0.f().g0(h0Var).J();
        }
        this.f100059j = t7.b.f188093i;
        if (this.f100056g.H0 && context == null) {
            w7.t.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
