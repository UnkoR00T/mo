package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f11415g = {0, 4, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static SparseIntArray f11416h = new SparseIntArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static SparseIntArray f11417i = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11418a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f11419b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11420c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f11421d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11422e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<Integer, a> f11423f = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f11425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0253d f11426c = new C0253d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f11427d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f11428e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f11429f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f11430g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0252a f11431h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        static class C0252a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f11432a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f11433b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f11434c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f11435d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f11436e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f11437f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int[] f11438g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            String[] f11439h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f11440i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int[] f11441j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean[] f11442k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f11443l = 0;

            C0252a() {
            }

            void a(int i15, float f15) {
                int i16 = this.f11437f;
                int[] iArr = this.f11435d;
                if (i16 >= iArr.length) {
                    this.f11435d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f11436e;
                    this.f11436e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f11435d;
                int i17 = this.f11437f;
                iArr2[i17] = i15;
                float[] fArr2 = this.f11436e;
                this.f11437f = i17 + 1;
                fArr2[i17] = f15;
            }

            void b(int i15, int i16) {
                int i17 = this.f11434c;
                int[] iArr = this.f11432a;
                if (i17 >= iArr.length) {
                    this.f11432a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f11433b;
                    this.f11433b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f11432a;
                int i18 = this.f11434c;
                iArr3[i18] = i15;
                int[] iArr4 = this.f11433b;
                this.f11434c = i18 + 1;
                iArr4[i18] = i16;
            }

            void c(int i15, String str) {
                int i16 = this.f11440i;
                int[] iArr = this.f11438g;
                if (i16 >= iArr.length) {
                    this.f11438g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f11439h;
                    this.f11439h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f11438g;
                int i17 = this.f11440i;
                iArr2[i17] = i15;
                String[] strArr2 = this.f11439h;
                this.f11440i = i17 + 1;
                strArr2[i17] = str;
            }

            void d(int i15, boolean z15) {
                int i16 = this.f11443l;
                int[] iArr = this.f11441j;
                if (i16 >= iArr.length) {
                    this.f11441j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f11442k;
                    this.f11442k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f11441j;
                int i17 = this.f11443l;
                iArr2[i17] = i15;
                boolean[] zArr2 = this.f11442k;
                this.f11443l = i17 + 1;
                zArr2[i17] = z15;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i15, ConstraintLayout.b bVar) {
            this.f11424a = i15;
            b bVar2 = this.f11428e;
            bVar2.f11463j = bVar.f11322e;
            bVar2.f11465k = bVar.f11324f;
            bVar2.f11467l = bVar.f11326g;
            bVar2.f11469m = bVar.f11328h;
            bVar2.f11471n = bVar.f11330i;
            bVar2.f11473o = bVar.f11332j;
            bVar2.f11475p = bVar.f11334k;
            bVar2.f11477q = bVar.f11336l;
            bVar2.f11479r = bVar.f11338m;
            bVar2.f11480s = bVar.f11340n;
            bVar2.f11481t = bVar.f11342o;
            bVar2.f11482u = bVar.f11350s;
            bVar2.f11483v = bVar.f11352t;
            bVar2.f11484w = bVar.f11354u;
            bVar2.f11485x = bVar.f11356v;
            bVar2.f11486y = bVar.G;
            bVar2.f11487z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f11344p;
            bVar2.C = bVar.f11346q;
            bVar2.D = bVar.f11348r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f11459h = bVar.f11318c;
            bVar2.f11455f = bVar.f11314a;
            bVar2.f11457g = bVar.f11316b;
            bVar2.f11451d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f11453e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f11472n0 = bVar.f11315a0;
            bVar2.f11474o0 = bVar.f11317b0;
            bVar2.Z = bVar.P;
            bVar2.f11446a0 = bVar.Q;
            bVar2.f11448b0 = bVar.T;
            bVar2.f11450c0 = bVar.U;
            bVar2.f11452d0 = bVar.R;
            bVar2.f11454e0 = bVar.S;
            bVar2.f11456f0 = bVar.V;
            bVar2.f11458g0 = bVar.W;
            bVar2.f11470m0 = bVar.f11319c0;
            bVar2.P = bVar.f11360x;
            bVar2.R = bVar.f11362z;
            bVar2.O = bVar.f11358w;
            bVar2.Q = bVar.f11361y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f11478q0 = bVar.f11321d0;
            bVar2.L = bVar.getMarginEnd();
            this.f11428e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i15, androidx.constraintlayout.widget.e.a aVar) {
            f(i15, aVar);
            this.f11426c.f11506d = aVar.f11524x0;
            e eVar = this.f11429f;
            eVar.f11510b = aVar.A0;
            eVar.f11511c = aVar.B0;
            eVar.f11512d = aVar.C0;
            eVar.f11513e = aVar.D0;
            eVar.f11514f = aVar.E0;
            eVar.f11515g = aVar.F0;
            eVar.f11516h = aVar.G0;
            eVar.f11518j = aVar.H0;
            eVar.f11519k = aVar.I0;
            eVar.f11520l = aVar.J0;
            eVar.f11522n = aVar.f11526z0;
            eVar.f11521m = aVar.f11525y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int i15, androidx.constraintlayout.widget.e.a aVar) {
            g(i15, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f11428e;
                bVar2.f11464j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f11460h0 = barrier.getType();
                this.f11428e.f11466k0 = barrier.getReferencedIds();
                this.f11428e.f11462i0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f11428e;
            bVar.f11322e = bVar2.f11463j;
            bVar.f11324f = bVar2.f11465k;
            bVar.f11326g = bVar2.f11467l;
            bVar.f11328h = bVar2.f11469m;
            bVar.f11330i = bVar2.f11471n;
            bVar.f11332j = bVar2.f11473o;
            bVar.f11334k = bVar2.f11475p;
            bVar.f11336l = bVar2.f11477q;
            bVar.f11338m = bVar2.f11479r;
            bVar.f11340n = bVar2.f11480s;
            bVar.f11342o = bVar2.f11481t;
            bVar.f11350s = bVar2.f11482u;
            bVar.f11352t = bVar2.f11483v;
            bVar.f11354u = bVar2.f11484w;
            bVar.f11356v = bVar2.f11485x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f11360x = bVar2.P;
            bVar.f11362z = bVar2.R;
            bVar.G = bVar2.f11486y;
            bVar.H = bVar2.f11487z;
            bVar.f11344p = bVar2.B;
            bVar.f11346q = bVar2.C;
            bVar.f11348r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f11315a0 = bVar2.f11472n0;
            bVar.f11317b0 = bVar2.f11474o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f11446a0;
            bVar.T = bVar2.f11448b0;
            bVar.U = bVar2.f11450c0;
            bVar.R = bVar2.f11452d0;
            bVar.S = bVar2.f11454e0;
            bVar.V = bVar2.f11456f0;
            bVar.W = bVar2.f11458g0;
            bVar.Z = bVar2.G;
            bVar.f11318c = bVar2.f11459h;
            bVar.f11314a = bVar2.f11455f;
            bVar.f11316b = bVar2.f11457g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f11451d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f11453e;
            String str = bVar2.f11470m0;
            if (str != null) {
                bVar.f11319c0 = str;
            }
            bVar.f11321d0 = bVar2.f11478q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f11428e.L);
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f11428e.a(this.f11428e);
            aVar.f11427d.a(this.f11427d);
            aVar.f11426c.a(this.f11426c);
            aVar.f11429f.a(this.f11429f);
            aVar.f11424a = this.f11424a;
            aVar.f11431h = this.f11431h;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f11444r0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11453e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f11466k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f11468l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f11470m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11445a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11447b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11449c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11455f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11457g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f11459h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f11461i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f11463j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11465k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f11467l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11469m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f11471n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f11473o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f11475p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f11477q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f11479r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f11480s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11481t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11482u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f11483v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11484w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f11485x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f11486y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f11487z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = PKIFailureInfo.systemUnavail;
        public int P = PKIFailureInfo.systemUnavail;
        public int Q = PKIFailureInfo.systemUnavail;
        public int R = PKIFailureInfo.systemUnavail;
        public int S = PKIFailureInfo.systemUnavail;
        public int T = PKIFailureInfo.systemUnavail;
        public int U = PKIFailureInfo.systemUnavail;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f11446a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f11448b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f11450c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f11452d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f11454e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f11456f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f11458g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f11460h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f11462i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f11464j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f11472n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f11474o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f11476p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f11478q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11444r0 = sparseIntArray;
            sparseIntArray.append(i.O5, 24);
            f11444r0.append(i.P5, 25);
            f11444r0.append(i.R5, 28);
            f11444r0.append(i.S5, 29);
            f11444r0.append(i.X5, 35);
            f11444r0.append(i.W5, 34);
            f11444r0.append(i.f11736x5, 4);
            f11444r0.append(i.f11728w5, 3);
            f11444r0.append(i.f11712u5, 1);
            f11444r0.append(i.f11582f6, 6);
            f11444r0.append(i.f11591g6, 7);
            f11444r0.append(i.E5, 17);
            f11444r0.append(i.F5, 18);
            f11444r0.append(i.G5, 19);
            f11444r0.append(i.f11680q5, 90);
            f11444r0.append(i.f11554c5, 26);
            f11444r0.append(i.T5, 31);
            f11444r0.append(i.U5, 32);
            f11444r0.append(i.D5, 10);
            f11444r0.append(i.C5, 9);
            f11444r0.append(i.f11618j6, 13);
            f11444r0.append(i.f11645m6, 16);
            f11444r0.append(i.f11627k6, 14);
            f11444r0.append(i.f11600h6, 11);
            f11444r0.append(i.f11636l6, 15);
            f11444r0.append(i.f11609i6, 12);
            f11444r0.append(i.f11537a6, 38);
            f11444r0.append(i.M5, 37);
            f11444r0.append(i.L5, 39);
            f11444r0.append(i.Z5, 40);
            f11444r0.append(i.K5, 20);
            f11444r0.append(i.Y5, 36);
            f11444r0.append(i.B5, 5);
            f11444r0.append(i.N5, 91);
            f11444r0.append(i.V5, 91);
            f11444r0.append(i.Q5, 91);
            f11444r0.append(i.f11720v5, 91);
            f11444r0.append(i.f11704t5, 91);
            f11444r0.append(i.f11581f5, 23);
            f11444r0.append(i.f11599h5, 27);
            f11444r0.append(i.f11617j5, 30);
            f11444r0.append(i.f11626k5, 8);
            f11444r0.append(i.f11590g5, 33);
            f11444r0.append(i.f11608i5, 2);
            f11444r0.append(i.f11563d5, 22);
            f11444r0.append(i.f11572e5, 21);
            f11444r0.append(i.f11546b6, 41);
            f11444r0.append(i.H5, 42);
            f11444r0.append(i.f11696s5, 87);
            f11444r0.append(i.f11688r5, 88);
            f11444r0.append(i.f11654n6, 76);
            f11444r0.append(i.f11744y5, 61);
            f11444r0.append(i.A5, 62);
            f11444r0.append(i.f11752z5, 63);
            f11444r0.append(i.f11573e6, 69);
            f11444r0.append(i.J5, 70);
            f11444r0.append(i.f11662o5, 71);
            f11444r0.append(i.f11644m5, 72);
            f11444r0.append(i.f11653n5, 73);
            f11444r0.append(i.f11671p5, 74);
            f11444r0.append(i.f11635l5, 75);
            f11444r0.append(i.f11555c6, 84);
            f11444r0.append(i.f11564d6, 86);
            f11444r0.append(i.f11555c6, 83);
            f11444r0.append(i.I5, 85);
            f11444r0.append(i.f11546b6, 87);
            f11444r0.append(i.H5, 88);
            f11444r0.append(i.f11693s2, 89);
            f11444r0.append(i.f11680q5, 90);
        }

        public void a(b bVar) {
            this.f11445a = bVar.f11445a;
            this.f11451d = bVar.f11451d;
            this.f11447b = bVar.f11447b;
            this.f11453e = bVar.f11453e;
            this.f11455f = bVar.f11455f;
            this.f11457g = bVar.f11457g;
            this.f11459h = bVar.f11459h;
            this.f11461i = bVar.f11461i;
            this.f11463j = bVar.f11463j;
            this.f11465k = bVar.f11465k;
            this.f11467l = bVar.f11467l;
            this.f11469m = bVar.f11469m;
            this.f11471n = bVar.f11471n;
            this.f11473o = bVar.f11473o;
            this.f11475p = bVar.f11475p;
            this.f11477q = bVar.f11477q;
            this.f11479r = bVar.f11479r;
            this.f11480s = bVar.f11480s;
            this.f11481t = bVar.f11481t;
            this.f11482u = bVar.f11482u;
            this.f11483v = bVar.f11483v;
            this.f11484w = bVar.f11484w;
            this.f11485x = bVar.f11485x;
            this.f11486y = bVar.f11486y;
            this.f11487z = bVar.f11487z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f11446a0 = bVar.f11446a0;
            this.f11448b0 = bVar.f11448b0;
            this.f11450c0 = bVar.f11450c0;
            this.f11452d0 = bVar.f11452d0;
            this.f11454e0 = bVar.f11454e0;
            this.f11456f0 = bVar.f11456f0;
            this.f11458g0 = bVar.f11458g0;
            this.f11460h0 = bVar.f11460h0;
            this.f11462i0 = bVar.f11462i0;
            this.f11464j0 = bVar.f11464j0;
            this.f11470m0 = bVar.f11470m0;
            int[] iArr = bVar.f11466k0;
            if (iArr == null || bVar.f11468l0 != null) {
                this.f11466k0 = null;
            } else {
                this.f11466k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f11468l0 = bVar.f11468l0;
            this.f11472n0 = bVar.f11472n0;
            this.f11474o0 = bVar.f11474o0;
            this.f11476p0 = bVar.f11476p0;
            this.f11478q0 = bVar.f11478q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f11545b5);
            this.f11447b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                int i16 = f11444r0.get(index);
                switch (i16) {
                    case 1:
                        this.f11479r = d.n(typedArrayObtainStyledAttributes, index, this.f11479r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f11477q = d.n(typedArrayObtainStyledAttributes, index, this.f11477q);
                        break;
                    case 4:
                        this.f11475p = d.n(typedArrayObtainStyledAttributes, index, this.f11475p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f11485x = d.n(typedArrayObtainStyledAttributes, index, this.f11485x);
                        break;
                    case 10:
                        this.f11484w = d.n(typedArrayObtainStyledAttributes, index, this.f11484w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f11455f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11455f);
                        break;
                    case 18:
                        this.f11457g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11457g);
                        break;
                    case 19:
                        this.f11459h = typedArrayObtainStyledAttributes.getFloat(index, this.f11459h);
                        break;
                    case 20:
                        this.f11486y = typedArrayObtainStyledAttributes.getFloat(index, this.f11486y);
                        break;
                    case 21:
                        this.f11453e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f11453e);
                        break;
                    case 22:
                        this.f11451d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f11451d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f11463j = d.n(typedArrayObtainStyledAttributes, index, this.f11463j);
                        break;
                    case 25:
                        this.f11465k = d.n(typedArrayObtainStyledAttributes, index, this.f11465k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f11467l = d.n(typedArrayObtainStyledAttributes, index, this.f11467l);
                        break;
                    case 29:
                        this.f11469m = d.n(typedArrayObtainStyledAttributes, index, this.f11469m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case BERTags.DATE /* 31 */:
                        this.f11482u = d.n(typedArrayObtainStyledAttributes, index, this.f11482u);
                        break;
                    case 32:
                        this.f11483v = d.n(typedArrayObtainStyledAttributes, index, this.f11483v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f11473o = d.n(typedArrayObtainStyledAttributes, index, this.f11473o);
                        break;
                    case 35:
                        this.f11471n = d.n(typedArrayObtainStyledAttributes, index, this.f11471n);
                        break;
                    case 36:
                        this.f11487z = typedArrayObtainStyledAttributes.getFloat(index, this.f11487z);
                        break;
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        d.o(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case EACTags.CURRENCY_CODE /* 42 */:
                        d.o(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i16) {
                            case 61:
                                this.B = d.n(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i16) {
                                    case EACTags.DISPLAY_IMAGE /* 69 */:
                                        this.f11456f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f11458g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case EACTags.MESSAGE_REFERENCE /* 71 */:
                                        c2.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f11460h0 = typedArrayObtainStyledAttributes.getInt(index, this.f11460h0);
                                        break;
                                    case 73:
                                        this.f11462i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11462i0);
                                        break;
                                    case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                                        this.f11468l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case EACTags.DEPRECATED /* 75 */:
                                        this.f11476p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f11476p0);
                                        break;
                                    case 76:
                                        this.f11478q0 = typedArrayObtainStyledAttributes.getInt(index, this.f11478q0);
                                        break;
                                    case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                                        this.f11480s = d.n(typedArrayObtainStyledAttributes, index, this.f11480s);
                                        break;
                                    case 78:
                                        this.f11481t = d.n(typedArrayObtainStyledAttributes, index, this.f11481t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case EACTags.ANSWER_TO_RESET /* 81 */:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case EACTags.HISTORICAL_BYTES /* 82 */:
                                        this.f11446a0 = typedArrayObtainStyledAttributes.getInt(index, this.f11446a0);
                                        break;
                                    case 83:
                                        this.f11450c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11450c0);
                                        break;
                                    case 84:
                                        this.f11448b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11448b0);
                                        break;
                                    case 85:
                                        this.f11454e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11454e0);
                                        break;
                                    case 86:
                                        this.f11452d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11452d0);
                                        break;
                                    case 87:
                                        this.f11472n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f11472n0);
                                        break;
                                    case 88:
                                        this.f11474o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f11474o0);
                                        break;
                                    case 89:
                                        this.f11470m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f11461i = typedArrayObtainStyledAttributes.getBoolean(index, this.f11461i);
                                        break;
                                    case 91:
                                        c2.g("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f11444r0.get(index));
                                        break;
                                    default:
                                        c2.g("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f11444r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f11488o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11489a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11490b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11491c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f11492d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11493e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11494f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f11495g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11496h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f11497i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f11498j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11499k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f11500l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11501m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f11502n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11488o = sparseIntArray;
            sparseIntArray.append(i.f11705t6, 1);
            f11488o.append(i.f11721v6, 2);
            f11488o.append(i.f11753z6, 3);
            f11488o.append(i.f11697s6, 4);
            f11488o.append(i.f11689r6, 5);
            f11488o.append(i.f11681q6, 6);
            f11488o.append(i.f11713u6, 7);
            f11488o.append(i.f11745y6, 8);
            f11488o.append(i.f11737x6, 9);
            f11488o.append(i.f11729w6, 10);
        }

        public void a(c cVar) {
            this.f11489a = cVar.f11489a;
            this.f11490b = cVar.f11490b;
            this.f11492d = cVar.f11492d;
            this.f11493e = cVar.f11493e;
            this.f11494f = cVar.f11494f;
            this.f11497i = cVar.f11497i;
            this.f11495g = cVar.f11495g;
            this.f11496h = cVar.f11496h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f11672p6);
            this.f11489a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                switch (f11488o.get(index)) {
                    case 1:
                        this.f11497i = typedArrayObtainStyledAttributes.getFloat(index, this.f11497i);
                        break;
                    case 2:
                        this.f11493e = typedArrayObtainStyledAttributes.getInt(index, this.f11493e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f11492d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f11492d = i5.b.f89317c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f11494f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f11490b = d.n(typedArrayObtainStyledAttributes, index, this.f11490b);
                        break;
                    case 6:
                        this.f11491c = typedArrayObtainStyledAttributes.getInteger(index, this.f11491c);
                        break;
                    case 7:
                        this.f11495g = typedArrayObtainStyledAttributes.getFloat(index, this.f11495g);
                        break;
                    case 8:
                        this.f11499k = typedArrayObtainStyledAttributes.getInteger(index, this.f11499k);
                        break;
                    case 9:
                        this.f11498j = typedArrayObtainStyledAttributes.getFloat(index, this.f11498j);
                        break;
                    case 10:
                        int i16 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i16 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f11502n = resourceId;
                            if (resourceId != -1) {
                                this.f11501m = -2;
                            }
                        } else if (i16 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f11500l = string;
                            if (string.indexOf("/") > 0) {
                                this.f11502n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f11501m = -2;
                            } else {
                                this.f11501m = -1;
                            }
                        } else {
                            this.f11501m = typedArrayObtainStyledAttributes.getInteger(index, this.f11502n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0253d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11503a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11504b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11505c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f11506d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f11507e = Float.NaN;

        public void a(C0253d c0253d) {
            this.f11503a = c0253d.f11503a;
            this.f11504b = c0253d.f11504b;
            this.f11506d = c0253d.f11506d;
            this.f11507e = c0253d.f11507e;
            this.f11505c = c0253d.f11505c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.K6);
            this.f11503a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == i.M6) {
                    this.f11506d = typedArrayObtainStyledAttributes.getFloat(index, this.f11506d);
                } else if (index == i.L6) {
                    this.f11504b = typedArrayObtainStyledAttributes.getInt(index, this.f11504b);
                    this.f11504b = d.f11415g[this.f11504b];
                } else if (index == i.O6) {
                    this.f11505c = typedArrayObtainStyledAttributes.getInt(index, this.f11505c);
                } else if (index == i.N6) {
                    this.f11507e = typedArrayObtainStyledAttributes.getFloat(index, this.f11507e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f11508o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11509a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f11510b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f11511c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f11512d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f11513e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f11514f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f11515g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f11516h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11517i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f11518j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f11519k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f11520l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f11521m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f11522n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11508o = sparseIntArray;
            sparseIntArray.append(i.f11547b7, 1);
            f11508o.append(i.f11556c7, 2);
            f11508o.append(i.f11565d7, 3);
            f11508o.append(i.Z6, 4);
            f11508o.append(i.f11538a7, 5);
            f11508o.append(i.V6, 6);
            f11508o.append(i.W6, 7);
            f11508o.append(i.X6, 8);
            f11508o.append(i.Y6, 9);
            f11508o.append(i.f11574e7, 10);
            f11508o.append(i.f11583f7, 11);
            f11508o.append(i.f11592g7, 12);
        }

        public void a(e eVar) {
            this.f11509a = eVar.f11509a;
            this.f11510b = eVar.f11510b;
            this.f11511c = eVar.f11511c;
            this.f11512d = eVar.f11512d;
            this.f11513e = eVar.f11513e;
            this.f11514f = eVar.f11514f;
            this.f11515g = eVar.f11515g;
            this.f11516h = eVar.f11516h;
            this.f11517i = eVar.f11517i;
            this.f11518j = eVar.f11518j;
            this.f11519k = eVar.f11519k;
            this.f11520l = eVar.f11520l;
            this.f11521m = eVar.f11521m;
            this.f11522n = eVar.f11522n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.U6);
            this.f11509a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                switch (f11508o.get(index)) {
                    case 1:
                        this.f11510b = typedArrayObtainStyledAttributes.getFloat(index, this.f11510b);
                        break;
                    case 2:
                        this.f11511c = typedArrayObtainStyledAttributes.getFloat(index, this.f11511c);
                        break;
                    case 3:
                        this.f11512d = typedArrayObtainStyledAttributes.getFloat(index, this.f11512d);
                        break;
                    case 4:
                        this.f11513e = typedArrayObtainStyledAttributes.getFloat(index, this.f11513e);
                        break;
                    case 5:
                        this.f11514f = typedArrayObtainStyledAttributes.getFloat(index, this.f11514f);
                        break;
                    case 6:
                        this.f11515g = typedArrayObtainStyledAttributes.getDimension(index, this.f11515g);
                        break;
                    case 7:
                        this.f11516h = typedArrayObtainStyledAttributes.getDimension(index, this.f11516h);
                        break;
                    case 8:
                        this.f11518j = typedArrayObtainStyledAttributes.getDimension(index, this.f11518j);
                        break;
                    case 9:
                        this.f11519k = typedArrayObtainStyledAttributes.getDimension(index, this.f11519k);
                        break;
                    case 10:
                        this.f11520l = typedArrayObtainStyledAttributes.getDimension(index, this.f11520l);
                        break;
                    case 11:
                        this.f11521m = true;
                        this.f11522n = typedArrayObtainStyledAttributes.getDimension(index, this.f11522n);
                        break;
                    case 12:
                        this.f11517i = d.n(typedArrayObtainStyledAttributes, index, this.f11517i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f11416h.append(i.f11603i0, 25);
        f11416h.append(i.f11612j0, 26);
        f11416h.append(i.f11630l0, 29);
        f11416h.append(i.f11639m0, 30);
        f11416h.append(i.f11691s0, 36);
        f11416h.append(i.f11683r0, 35);
        f11416h.append(i.P, 4);
        f11416h.append(i.O, 3);
        f11416h.append(i.K, 1);
        f11416h.append(i.M, 91);
        f11416h.append(i.L, 92);
        f11416h.append(i.B0, 6);
        f11416h.append(i.C0, 7);
        f11416h.append(i.W, 17);
        f11416h.append(i.X, 18);
        f11416h.append(i.Y, 19);
        f11416h.append(i.G, 99);
        f11416h.append(i.f11548c, 27);
        f11416h.append(i.f11648n0, 32);
        f11416h.append(i.f11657o0, 33);
        f11416h.append(i.V, 10);
        f11416h.append(i.U, 9);
        f11416h.append(i.F0, 13);
        f11416h.append(i.I0, 16);
        f11416h.append(i.G0, 14);
        f11416h.append(i.D0, 11);
        f11416h.append(i.H0, 15);
        f11416h.append(i.E0, 12);
        f11416h.append(i.f11715v0, 40);
        f11416h.append(i.f11585g0, 39);
        f11416h.append(i.f11576f0, 41);
        f11416h.append(i.f11707u0, 42);
        f11416h.append(i.f11567e0, 20);
        f11416h.append(i.f11699t0, 37);
        f11416h.append(i.T, 5);
        f11416h.append(i.f11594h0, 87);
        f11416h.append(i.f11675q0, 87);
        f11416h.append(i.f11621k0, 87);
        f11416h.append(i.N, 87);
        f11416h.append(i.J, 87);
        f11416h.append(i.f11593h, 24);
        f11416h.append(i.f11611j, 28);
        f11416h.append(i.f11714v, 31);
        f11416h.append(i.f11722w, 8);
        f11416h.append(i.f11602i, 34);
        f11416h.append(i.f11620k, 2);
        f11416h.append(i.f11575f, 23);
        f11416h.append(i.f11584g, 21);
        f11416h.append(i.f11723w0, 95);
        f11416h.append(i.Z, 96);
        f11416h.append(i.f11566e, 22);
        f11416h.append(i.f11629l, 43);
        f11416h.append(i.f11738y, 44);
        f11416h.append(i.f11698t, 45);
        f11416h.append(i.f11706u, 46);
        f11416h.append(i.f11690s, 60);
        f11416h.append(i.f11674q, 47);
        f11416h.append(i.f11682r, 48);
        f11416h.append(i.f11638m, 49);
        f11416h.append(i.f11647n, 50);
        f11416h.append(i.f11656o, 51);
        f11416h.append(i.f11665p, 52);
        f11416h.append(i.f11730x, 53);
        f11416h.append(i.f11731x0, 54);
        f11416h.append(i.f11531a0, 55);
        f11416h.append(i.f11739y0, 56);
        f11416h.append(i.f11540b0, 57);
        f11416h.append(i.f11747z0, 58);
        f11416h.append(i.f11549c0, 59);
        f11416h.append(i.Q, 61);
        f11416h.append(i.S, 62);
        f11416h.append(i.R, 63);
        f11416h.append(i.f11746z, 64);
        f11416h.append(i.S0, 65);
        f11416h.append(i.F, 66);
        f11416h.append(i.T0, 67);
        f11416h.append(i.L0, 79);
        f11416h.append(i.f11557d, 38);
        f11416h.append(i.K0, 68);
        f11416h.append(i.A0, 69);
        f11416h.append(i.f11558d0, 70);
        f11416h.append(i.J0, 97);
        f11416h.append(i.D, 71);
        f11416h.append(i.B, 72);
        f11416h.append(i.C, 73);
        f11416h.append(i.E, 74);
        f11416h.append(i.A, 75);
        f11416h.append(i.M0, 76);
        f11416h.append(i.f11666p0, 77);
        f11416h.append(i.U0, 78);
        f11416h.append(i.I, 80);
        f11416h.append(i.H, 81);
        f11416h.append(i.N0, 82);
        f11416h.append(i.R0, 83);
        f11416h.append(i.Q0, 84);
        f11416h.append(i.P0, 85);
        f11416h.append(i.O0, 86);
        f11417i.append(i.Y3, 6);
        f11417i.append(i.Y3, 7);
        f11417i.append(i.T2, 27);
        f11417i.append(i.f11544b4, 13);
        f11417i.append(i.f11571e4, 16);
        f11417i.append(i.f11553c4, 14);
        f11417i.append(i.Z3, 11);
        f11417i.append(i.f11562d4, 15);
        f11417i.append(i.f11535a4, 12);
        f11417i.append(i.S3, 40);
        f11417i.append(i.L3, 39);
        f11417i.append(i.K3, 41);
        f11417i.append(i.R3, 42);
        f11417i.append(i.J3, 20);
        f11417i.append(i.Q3, 37);
        f11417i.append(i.D3, 5);
        f11417i.append(i.M3, 87);
        f11417i.append(i.P3, 87);
        f11417i.append(i.N3, 87);
        f11417i.append(i.A3, 87);
        f11417i.append(i.f11750z3, 87);
        f11417i.append(i.Y2, 24);
        f11417i.append(i.f11534a3, 28);
        f11417i.append(i.f11642m3, 31);
        f11417i.append(i.f11651n3, 8);
        f11417i.append(i.Z2, 34);
        f11417i.append(i.f11543b3, 2);
        f11417i.append(i.W2, 23);
        f11417i.append(i.X2, 21);
        f11417i.append(i.T3, 95);
        f11417i.append(i.E3, 96);
        f11417i.append(i.V2, 22);
        f11417i.append(i.f11552c3, 43);
        f11417i.append(i.f11669p3, 44);
        f11417i.append(i.f11624k3, 45);
        f11417i.append(i.f11633l3, 46);
        f11417i.append(i.f11615j3, 60);
        f11417i.append(i.f11597h3, 47);
        f11417i.append(i.f11606i3, 48);
        f11417i.append(i.f11561d3, 49);
        f11417i.append(i.f11570e3, 50);
        f11417i.append(i.f11579f3, 51);
        f11417i.append(i.f11588g3, 52);
        f11417i.append(i.f11660o3, 53);
        f11417i.append(i.U3, 54);
        f11417i.append(i.F3, 55);
        f11417i.append(i.V3, 56);
        f11417i.append(i.G3, 57);
        f11417i.append(i.W3, 58);
        f11417i.append(i.H3, 59);
        f11417i.append(i.C3, 62);
        f11417i.append(i.B3, 63);
        f11417i.append(i.f11678q3, 64);
        f11417i.append(i.f11670p4, 65);
        f11417i.append(i.f11726w3, 66);
        f11417i.append(i.f11679q4, 67);
        f11417i.append(i.f11598h4, 79);
        f11417i.append(i.U2, 38);
        f11417i.append(i.f11607i4, 98);
        f11417i.append(i.f11589g4, 68);
        f11417i.append(i.X3, 69);
        f11417i.append(i.I3, 70);
        f11417i.append(i.f11710u3, 71);
        f11417i.append(i.f11694s3, 72);
        f11417i.append(i.f11702t3, 73);
        f11417i.append(i.f11718v3, 74);
        f11417i.append(i.f11686r3, 75);
        f11417i.append(i.f11616j4, 76);
        f11417i.append(i.O3, 77);
        f11417i.append(i.f11687r4, 78);
        f11417i.append(i.f11742y3, 80);
        f11417i.append(i.f11734x3, 81);
        f11417i.append(i.f11625k4, 82);
        f11417i.append(i.f11661o4, 83);
        f11417i.append(i.f11652n4, 84);
        f11417i.append(i.f11643m4, 85);
        f11417i.append(i.f11634l4, 86);
        f11417i.append(i.f11580f4, 97);
    }

    private int[] i(View view, String str) {
        int iIntValue;
        Object objL;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i15 = 0;
        int i16 = 0;
        while (i15 < strArrSplit.length) {
            String strTrim = strArrSplit[i15].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objL = ((ConstraintLayout) view.getParent()).l(0, strTrim)) != null && (objL instanceof Integer)) {
                iIntValue = ((Integer) objL).intValue();
            }
            iArr[i16] = iIntValue;
            i15++;
            i16++;
        }
        return i16 != strArrSplit.length ? Arrays.copyOf(iArr, i16) : iArr;
    }

    private a j(Context context, AttributeSet attributeSet, boolean z15) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z15 ? i.S2 : i.f11539b);
        r(aVar, typedArrayObtainStyledAttributes, z15);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a k(int i15) {
        if (!this.f11423f.containsKey(Integer.valueOf(i15))) {
            this.f11423f.put(Integer.valueOf(i15), new a());
        }
        return this.f11423f.get(Integer.valueOf(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(TypedArray typedArray, int i15, int i16) {
        int resourceId = typedArray.getResourceId(i15, i16);
        return resourceId == -1 ? typedArray.getInt(i15, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    static void o(Object obj, TypedArray typedArray, int i15, int i16) {
        int dimensionPixelSize;
        boolean z15;
        a.C0252a c0252a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i17 = typedArray.peekValue(i15).type;
        if (i17 == 3) {
            p(obj, typedArray.getString(i15), i16);
            return;
        }
        int i18 = 0;
        if (i17 != 5) {
            dimensionPixelSize = typedArray.getInt(i15, 0);
            if (dimensionPixelSize == -4) {
                z15 = true;
                i18 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z15 = false;
            }
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i16 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i18;
                    bVar2.f11315a0 = z15;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i18;
                    bVar2.f11317b0 = z15;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i16 == 0) {
                    bVar.f11451d = i18;
                    bVar.f11472n0 = z15;
                    return;
                } else {
                    bVar.f11453e = i18;
                    bVar.f11474o0 = z15;
                    return;
                }
            }
            if (obj instanceof a.C0252a) {
                c0252a = (a.C0252a) obj;
                if (i16 == 0) {
                    c0252a.b(23, i18);
                    c0252a.d(80, z15);
                } else {
                    c0252a.b(21, i18);
                    c0252a.d(81, z15);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i15, 0);
        i18 = dimensionPixelSize;
        z15 = false;
        if (obj instanceof ConstraintLayout.b) {
            bVar2 = (ConstraintLayout.b) obj;
            if (i16 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar2).width = i18;
                bVar2.f11315a0 = z15;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i18;
                bVar2.f11317b0 = z15;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i16 == 0) {
                bVar.f11451d = i18;
                bVar.f11472n0 = z15;
                return;
            } else {
                bVar.f11453e = i18;
                bVar.f11474o0 = z15;
                return;
            }
        }
        if (obj instanceof a.C0252a) {
            c0252a = (a.C0252a) obj;
            if (i16 == 0) {
                c0252a.b(23, i18);
                c0252a.d(80, z15);
            } else {
                c0252a.b(21, i18);
                c0252a.d(81, z15);
            }
        }
    }

    static void p(Object obj, String str, int i15) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i15 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    q(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0252a) {
                        ((a.C0252a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f15 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i15 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f15;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f15;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i15 == 0) {
                            bVar3.f11451d = 0;
                            bVar3.W = f15;
                            return;
                        } else {
                            bVar3.f11453e = 0;
                            bVar3.V = f15;
                            return;
                        }
                    }
                    if (obj instanceof a.C0252a) {
                        a.C0252a c0252a = (a.C0252a) obj;
                        if (i15 == 0) {
                            c0252a.b(23, 0);
                            c0252a.a(39, f15);
                            return;
                        } else {
                            c0252a.b(21, 0);
                            c0252a.a(40, f15);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i15 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i15 == 0) {
                            bVar5.f11451d = 0;
                            bVar5.f11456f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f11453e = 0;
                            bVar5.f11458g0 = fMax;
                            bVar5.f11446a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0252a) {
                        a.C0252a c0252a2 = (a.C0252a) obj;
                        if (i15 == 0) {
                            c0252a2.b(23, 0);
                            c0252a2.b(54, 2);
                        } else {
                            c0252a2.b(21, 0);
                            c0252a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void q(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i15 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i16 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i15 = 0;
                } else if (strSubstring.equalsIgnoreCase(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n)) {
                    i15 = 1;
                }
                i16 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i16);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i16, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f15 = Float.parseFloat(strSubstring3);
                        float f16 = Float.parseFloat(strSubstring4);
                        if (f15 > 0.0f && f16 > 0.0f) {
                            fAbs = i15 == 1 ? Math.abs(f16 / f15) : Math.abs(f15 / f16);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i15;
    }

    private void r(a aVar, TypedArray typedArray, boolean z15) {
        if (z15) {
            s(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i15 = 0; i15 < indexCount; i15++) {
            int index = typedArray.getIndex(i15);
            if (index != i.f11557d && i.f11714v != index && i.f11722w != index) {
                aVar.f11427d.f11489a = true;
                aVar.f11428e.f11447b = true;
                aVar.f11426c.f11503a = true;
                aVar.f11429f.f11509a = true;
            }
            switch (f11416h.get(index)) {
                case 1:
                    b bVar = aVar.f11428e;
                    bVar.f11479r = n(typedArray, index, bVar.f11479r);
                    break;
                case 2:
                    b bVar2 = aVar.f11428e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f11428e;
                    bVar3.f11477q = n(typedArray, index, bVar3.f11477q);
                    break;
                case 4:
                    b bVar4 = aVar.f11428e;
                    bVar4.f11475p = n(typedArray, index, bVar4.f11475p);
                    break;
                case 5:
                    aVar.f11428e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f11428e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f11428e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f11428e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f11428e;
                    bVar8.f11485x = n(typedArray, index, bVar8.f11485x);
                    break;
                case 10:
                    b bVar9 = aVar.f11428e;
                    bVar9.f11484w = n(typedArray, index, bVar9.f11484w);
                    break;
                case 11:
                    b bVar10 = aVar.f11428e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f11428e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f11428e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f11428e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f11428e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f11428e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f11428e;
                    bVar16.f11455f = typedArray.getDimensionPixelOffset(index, bVar16.f11455f);
                    break;
                case 18:
                    b bVar17 = aVar.f11428e;
                    bVar17.f11457g = typedArray.getDimensionPixelOffset(index, bVar17.f11457g);
                    break;
                case 19:
                    b bVar18 = aVar.f11428e;
                    bVar18.f11459h = typedArray.getFloat(index, bVar18.f11459h);
                    break;
                case 20:
                    b bVar19 = aVar.f11428e;
                    bVar19.f11486y = typedArray.getFloat(index, bVar19.f11486y);
                    break;
                case 21:
                    b bVar20 = aVar.f11428e;
                    bVar20.f11453e = typedArray.getLayoutDimension(index, bVar20.f11453e);
                    break;
                case 22:
                    C0253d c0253d = aVar.f11426c;
                    c0253d.f11504b = typedArray.getInt(index, c0253d.f11504b);
                    C0253d c0253d2 = aVar.f11426c;
                    c0253d2.f11504b = f11415g[c0253d2.f11504b];
                    break;
                case 23:
                    b bVar21 = aVar.f11428e;
                    bVar21.f11451d = typedArray.getLayoutDimension(index, bVar21.f11451d);
                    break;
                case 24:
                    b bVar22 = aVar.f11428e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f11428e;
                    bVar23.f11463j = n(typedArray, index, bVar23.f11463j);
                    break;
                case 26:
                    b bVar24 = aVar.f11428e;
                    bVar24.f11465k = n(typedArray, index, bVar24.f11465k);
                    break;
                case 27:
                    b bVar25 = aVar.f11428e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f11428e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f11428e;
                    bVar27.f11467l = n(typedArray, index, bVar27.f11467l);
                    break;
                case 30:
                    b bVar28 = aVar.f11428e;
                    bVar28.f11469m = n(typedArray, index, bVar28.f11469m);
                    break;
                case BERTags.DATE /* 31 */:
                    b bVar29 = aVar.f11428e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f11428e;
                    bVar30.f11482u = n(typedArray, index, bVar30.f11482u);
                    break;
                case 33:
                    b bVar31 = aVar.f11428e;
                    bVar31.f11483v = n(typedArray, index, bVar31.f11483v);
                    break;
                case 34:
                    b bVar32 = aVar.f11428e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f11428e;
                    bVar33.f11473o = n(typedArray, index, bVar33.f11473o);
                    break;
                case 36:
                    b bVar34 = aVar.f11428e;
                    bVar34.f11471n = n(typedArray, index, bVar34.f11471n);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    b bVar35 = aVar.f11428e;
                    bVar35.f11487z = typedArray.getFloat(index, bVar35.f11487z);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    aVar.f11424a = typedArray.getResourceId(index, aVar.f11424a);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    b bVar36 = aVar.f11428e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f11428e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    b bVar38 = aVar.f11428e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    b bVar39 = aVar.f11428e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    C0253d c0253d3 = aVar.f11426c;
                    c0253d3.f11506d = typedArray.getFloat(index, c0253d3.f11506d);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    e eVar = aVar.f11429f;
                    eVar.f11521m = true;
                    eVar.f11522n = typedArray.getDimension(index, eVar.f11522n);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    e eVar2 = aVar.f11429f;
                    eVar2.f11511c = typedArray.getFloat(index, eVar2.f11511c);
                    break;
                case 46:
                    e eVar3 = aVar.f11429f;
                    eVar3.f11512d = typedArray.getFloat(index, eVar3.f11512d);
                    break;
                case 47:
                    e eVar4 = aVar.f11429f;
                    eVar4.f11513e = typedArray.getFloat(index, eVar4.f11513e);
                    break;
                case 48:
                    e eVar5 = aVar.f11429f;
                    eVar5.f11514f = typedArray.getFloat(index, eVar5.f11514f);
                    break;
                case 49:
                    e eVar6 = aVar.f11429f;
                    eVar6.f11515g = typedArray.getDimension(index, eVar6.f11515g);
                    break;
                case 50:
                    e eVar7 = aVar.f11429f;
                    eVar7.f11516h = typedArray.getDimension(index, eVar7.f11516h);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    e eVar8 = aVar.f11429f;
                    eVar8.f11518j = typedArray.getDimension(index, eVar8.f11518j);
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    e eVar9 = aVar.f11429f;
                    eVar9.f11519k = typedArray.getDimension(index, eVar9.f11519k);
                    break;
                case 53:
                    e eVar10 = aVar.f11429f;
                    eVar10.f11520l = typedArray.getDimension(index, eVar10.f11520l);
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    b bVar40 = aVar.f11428e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f11428e;
                    bVar41.f11446a0 = typedArray.getInt(index, bVar41.f11446a0);
                    break;
                case 56:
                    b bVar42 = aVar.f11428e;
                    bVar42.f11448b0 = typedArray.getDimensionPixelSize(index, bVar42.f11448b0);
                    break;
                case 57:
                    b bVar43 = aVar.f11428e;
                    bVar43.f11450c0 = typedArray.getDimensionPixelSize(index, bVar43.f11450c0);
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    b bVar44 = aVar.f11428e;
                    bVar44.f11452d0 = typedArray.getDimensionPixelSize(index, bVar44.f11452d0);
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    b bVar45 = aVar.f11428e;
                    bVar45.f11454e0 = typedArray.getDimensionPixelSize(index, bVar45.f11454e0);
                    break;
                case 60:
                    e eVar11 = aVar.f11429f;
                    eVar11.f11510b = typedArray.getFloat(index, eVar11.f11510b);
                    break;
                case 61:
                    b bVar46 = aVar.f11428e;
                    bVar46.B = n(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f11428e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f11428e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f11427d;
                    cVar.f11490b = n(typedArray, index, cVar.f11490b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f11427d.f11492d = typedArray.getString(index);
                    } else {
                        aVar.f11427d.f11492d = i5.b.f89317c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f11427d.f11494f = typedArray.getInt(index, 0);
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    c cVar2 = aVar.f11427d;
                    cVar2.f11497i = typedArray.getFloat(index, cVar2.f11497i);
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    C0253d c0253d4 = aVar.f11426c;
                    c0253d4.f11507e = typedArray.getFloat(index, c0253d4.f11507e);
                    break;
                case EACTags.DISPLAY_IMAGE /* 69 */:
                    aVar.f11428e.f11456f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f11428e.f11458g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case EACTags.MESSAGE_REFERENCE /* 71 */:
                    c2.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f11428e;
                    bVar49.f11460h0 = typedArray.getInt(index, bVar49.f11460h0);
                    break;
                case 73:
                    b bVar50 = aVar.f11428e;
                    bVar50.f11462i0 = typedArray.getDimensionPixelSize(index, bVar50.f11462i0);
                    break;
                case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                    aVar.f11428e.f11468l0 = typedArray.getString(index);
                    break;
                case EACTags.DEPRECATED /* 75 */:
                    b bVar51 = aVar.f11428e;
                    bVar51.f11476p0 = typedArray.getBoolean(index, bVar51.f11476p0);
                    break;
                case 76:
                    c cVar3 = aVar.f11427d;
                    cVar3.f11493e = typedArray.getInt(index, cVar3.f11493e);
                    break;
                case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                    aVar.f11428e.f11470m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0253d c0253d5 = aVar.f11426c;
                    c0253d5.f11505c = typedArray.getInt(index, c0253d5.f11505c);
                    break;
                case 79:
                    c cVar4 = aVar.f11427d;
                    cVar4.f11495g = typedArray.getFloat(index, cVar4.f11495g);
                    break;
                case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                    b bVar52 = aVar.f11428e;
                    bVar52.f11472n0 = typedArray.getBoolean(index, bVar52.f11472n0);
                    break;
                case EACTags.ANSWER_TO_RESET /* 81 */:
                    b bVar53 = aVar.f11428e;
                    bVar53.f11474o0 = typedArray.getBoolean(index, bVar53.f11474o0);
                    break;
                case EACTags.HISTORICAL_BYTES /* 82 */:
                    c cVar5 = aVar.f11427d;
                    cVar5.f11491c = typedArray.getInteger(index, cVar5.f11491c);
                    break;
                case 83:
                    e eVar12 = aVar.f11429f;
                    eVar12.f11517i = n(typedArray, index, eVar12.f11517i);
                    break;
                case 84:
                    c cVar6 = aVar.f11427d;
                    cVar6.f11499k = typedArray.getInteger(index, cVar6.f11499k);
                    break;
                case 85:
                    c cVar7 = aVar.f11427d;
                    cVar7.f11498j = typedArray.getFloat(index, cVar7.f11498j);
                    break;
                case 86:
                    int i16 = typedArray.peekValue(index).type;
                    if (i16 == 1) {
                        aVar.f11427d.f11502n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f11427d;
                        if (cVar8.f11502n != -1) {
                            cVar8.f11501m = -2;
                        }
                    } else if (i16 == 3) {
                        aVar.f11427d.f11500l = typedArray.getString(index);
                        if (aVar.f11427d.f11500l.indexOf("/") > 0) {
                            aVar.f11427d.f11502n = typedArray.getResourceId(index, -1);
                            aVar.f11427d.f11501m = -2;
                        } else {
                            aVar.f11427d.f11501m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f11427d;
                        cVar9.f11501m = typedArray.getInteger(index, cVar9.f11502n);
                    }
                    break;
                case 87:
                    c2.g("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f11416h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    c2.g("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f11416h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f11428e;
                    bVar54.f11480s = n(typedArray, index, bVar54.f11480s);
                    break;
                case 92:
                    b bVar55 = aVar.f11428e;
                    bVar55.f11481t = n(typedArray, index, bVar55.f11481t);
                    break;
                case 93:
                    b bVar56 = aVar.f11428e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f11428e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    o(aVar.f11428e, typedArray, index, 0);
                    break;
                case 96:
                    o(aVar.f11428e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f11428e;
                    bVar58.f11478q0 = typedArray.getInt(index, bVar58.f11478q0);
                    break;
            }
        }
        b bVar59 = aVar.f11428e;
        if (bVar59.f11468l0 != null) {
            bVar59.f11466k0 = null;
        }
    }

    private static void s(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0252a c0252a = new a.C0252a();
        aVar.f11431h = c0252a;
        aVar.f11427d.f11489a = false;
        aVar.f11428e.f11447b = false;
        aVar.f11426c.f11503a = false;
        aVar.f11429f.f11509a = false;
        for (int i15 = 0; i15 < indexCount; i15++) {
            int index = typedArray.getIndex(i15);
            switch (f11417i.get(index)) {
                case 2:
                    c0252a.b(2, typedArray.getDimensionPixelSize(index, aVar.f11428e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    c2.g("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f11416h.get(index));
                    break;
                case 5:
                    c0252a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0252a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f11428e.E));
                    break;
                case 7:
                    c0252a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f11428e.F));
                    break;
                case 8:
                    c0252a.b(8, typedArray.getDimensionPixelSize(index, aVar.f11428e.L));
                    break;
                case 11:
                    c0252a.b(11, typedArray.getDimensionPixelSize(index, aVar.f11428e.R));
                    break;
                case 12:
                    c0252a.b(12, typedArray.getDimensionPixelSize(index, aVar.f11428e.S));
                    break;
                case 13:
                    c0252a.b(13, typedArray.getDimensionPixelSize(index, aVar.f11428e.O));
                    break;
                case 14:
                    c0252a.b(14, typedArray.getDimensionPixelSize(index, aVar.f11428e.Q));
                    break;
                case 15:
                    c0252a.b(15, typedArray.getDimensionPixelSize(index, aVar.f11428e.T));
                    break;
                case 16:
                    c0252a.b(16, typedArray.getDimensionPixelSize(index, aVar.f11428e.P));
                    break;
                case 17:
                    c0252a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f11428e.f11455f));
                    break;
                case 18:
                    c0252a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f11428e.f11457g));
                    break;
                case 19:
                    c0252a.a(19, typedArray.getFloat(index, aVar.f11428e.f11459h));
                    break;
                case 20:
                    c0252a.a(20, typedArray.getFloat(index, aVar.f11428e.f11486y));
                    break;
                case 21:
                    c0252a.b(21, typedArray.getLayoutDimension(index, aVar.f11428e.f11453e));
                    break;
                case 22:
                    c0252a.b(22, f11415g[typedArray.getInt(index, aVar.f11426c.f11504b)]);
                    break;
                case 23:
                    c0252a.b(23, typedArray.getLayoutDimension(index, aVar.f11428e.f11451d));
                    break;
                case 24:
                    c0252a.b(24, typedArray.getDimensionPixelSize(index, aVar.f11428e.H));
                    break;
                case 27:
                    c0252a.b(27, typedArray.getInt(index, aVar.f11428e.G));
                    break;
                case 28:
                    c0252a.b(28, typedArray.getDimensionPixelSize(index, aVar.f11428e.I));
                    break;
                case BERTags.DATE /* 31 */:
                    c0252a.b(31, typedArray.getDimensionPixelSize(index, aVar.f11428e.M));
                    break;
                case 34:
                    c0252a.b(34, typedArray.getDimensionPixelSize(index, aVar.f11428e.J));
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    c0252a.a(37, typedArray.getFloat(index, aVar.f11428e.f11487z));
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    int resourceId = typedArray.getResourceId(index, aVar.f11424a);
                    aVar.f11424a = resourceId;
                    c0252a.b(38, resourceId);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    c0252a.a(39, typedArray.getFloat(index, aVar.f11428e.W));
                    break;
                case 40:
                    c0252a.a(40, typedArray.getFloat(index, aVar.f11428e.V));
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    c0252a.b(41, typedArray.getInt(index, aVar.f11428e.X));
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    c0252a.b(42, typedArray.getInt(index, aVar.f11428e.Y));
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    c0252a.a(43, typedArray.getFloat(index, aVar.f11426c.f11506d));
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    c0252a.d(44, true);
                    c0252a.a(44, typedArray.getDimension(index, aVar.f11429f.f11522n));
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    c0252a.a(45, typedArray.getFloat(index, aVar.f11429f.f11511c));
                    break;
                case 46:
                    c0252a.a(46, typedArray.getFloat(index, aVar.f11429f.f11512d));
                    break;
                case 47:
                    c0252a.a(47, typedArray.getFloat(index, aVar.f11429f.f11513e));
                    break;
                case 48:
                    c0252a.a(48, typedArray.getFloat(index, aVar.f11429f.f11514f));
                    break;
                case 49:
                    c0252a.a(49, typedArray.getDimension(index, aVar.f11429f.f11515g));
                    break;
                case 50:
                    c0252a.a(50, typedArray.getDimension(index, aVar.f11429f.f11516h));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    c0252a.a(51, typedArray.getDimension(index, aVar.f11429f.f11518j));
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    c0252a.a(52, typedArray.getDimension(index, aVar.f11429f.f11519k));
                    break;
                case 53:
                    c0252a.a(53, typedArray.getDimension(index, aVar.f11429f.f11520l));
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    c0252a.b(54, typedArray.getInt(index, aVar.f11428e.Z));
                    break;
                case 55:
                    c0252a.b(55, typedArray.getInt(index, aVar.f11428e.f11446a0));
                    break;
                case 56:
                    c0252a.b(56, typedArray.getDimensionPixelSize(index, aVar.f11428e.f11448b0));
                    break;
                case 57:
                    c0252a.b(57, typedArray.getDimensionPixelSize(index, aVar.f11428e.f11450c0));
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    c0252a.b(58, typedArray.getDimensionPixelSize(index, aVar.f11428e.f11452d0));
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    c0252a.b(59, typedArray.getDimensionPixelSize(index, aVar.f11428e.f11454e0));
                    break;
                case 60:
                    c0252a.a(60, typedArray.getFloat(index, aVar.f11429f.f11510b));
                    break;
                case 62:
                    c0252a.b(62, typedArray.getDimensionPixelSize(index, aVar.f11428e.C));
                    break;
                case 63:
                    c0252a.a(63, typedArray.getFloat(index, aVar.f11428e.D));
                    break;
                case 64:
                    c0252a.b(64, n(typedArray, index, aVar.f11427d.f11490b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0252a.c(65, typedArray.getString(index));
                    } else {
                        c0252a.c(65, i5.b.f89317c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0252a.b(66, typedArray.getInt(index, 0));
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    c0252a.a(67, typedArray.getFloat(index, aVar.f11427d.f11497i));
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    c0252a.a(68, typedArray.getFloat(index, aVar.f11426c.f11507e));
                    break;
                case EACTags.DISPLAY_IMAGE /* 69 */:
                    c0252a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0252a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case EACTags.MESSAGE_REFERENCE /* 71 */:
                    c2.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0252a.b(72, typedArray.getInt(index, aVar.f11428e.f11460h0));
                    break;
                case 73:
                    c0252a.b(73, typedArray.getDimensionPixelSize(index, aVar.f11428e.f11462i0));
                    break;
                case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                    c0252a.c(74, typedArray.getString(index));
                    break;
                case EACTags.DEPRECATED /* 75 */:
                    c0252a.d(75, typedArray.getBoolean(index, aVar.f11428e.f11476p0));
                    break;
                case 76:
                    c0252a.b(76, typedArray.getInt(index, aVar.f11427d.f11493e));
                    break;
                case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                    c0252a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0252a.b(78, typedArray.getInt(index, aVar.f11426c.f11505c));
                    break;
                case 79:
                    c0252a.a(79, typedArray.getFloat(index, aVar.f11427d.f11495g));
                    break;
                case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                    c0252a.d(80, typedArray.getBoolean(index, aVar.f11428e.f11472n0));
                    break;
                case EACTags.ANSWER_TO_RESET /* 81 */:
                    c0252a.d(81, typedArray.getBoolean(index, aVar.f11428e.f11474o0));
                    break;
                case EACTags.HISTORICAL_BYTES /* 82 */:
                    c0252a.b(82, typedArray.getInteger(index, aVar.f11427d.f11491c));
                    break;
                case 83:
                    c0252a.b(83, n(typedArray, index, aVar.f11429f.f11517i));
                    break;
                case 84:
                    c0252a.b(84, typedArray.getInteger(index, aVar.f11427d.f11499k));
                    break;
                case 85:
                    c0252a.a(85, typedArray.getFloat(index, aVar.f11427d.f11498j));
                    break;
                case 86:
                    int i16 = typedArray.peekValue(index).type;
                    if (i16 == 1) {
                        aVar.f11427d.f11502n = typedArray.getResourceId(index, -1);
                        c0252a.b(89, aVar.f11427d.f11502n);
                        c cVar = aVar.f11427d;
                        if (cVar.f11502n != -1) {
                            cVar.f11501m = -2;
                            c0252a.b(88, -2);
                        }
                    } else if (i16 == 3) {
                        aVar.f11427d.f11500l = typedArray.getString(index);
                        c0252a.c(90, aVar.f11427d.f11500l);
                        if (aVar.f11427d.f11500l.indexOf("/") > 0) {
                            aVar.f11427d.f11502n = typedArray.getResourceId(index, -1);
                            c0252a.b(89, aVar.f11427d.f11502n);
                            aVar.f11427d.f11501m = -2;
                            c0252a.b(88, -2);
                        } else {
                            aVar.f11427d.f11501m = -1;
                            c0252a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f11427d;
                        cVar2.f11501m = typedArray.getInteger(index, cVar2.f11502n);
                        c0252a.b(88, aVar.f11427d.f11501m);
                    }
                    break;
                case 87:
                    c2.g("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f11416h.get(index));
                    break;
                case 93:
                    c0252a.b(93, typedArray.getDimensionPixelSize(index, aVar.f11428e.N));
                    break;
                case 94:
                    c0252a.b(94, typedArray.getDimensionPixelSize(index, aVar.f11428e.U));
                    break;
                case 95:
                    o(c0252a, typedArray, index, 0);
                    break;
                case 96:
                    o(c0252a, typedArray, index, 1);
                    break;
                case 97:
                    c0252a.b(97, typedArray.getInt(index, aVar.f11428e.f11478q0));
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.j.V0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f11424a);
                        aVar.f11424a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f11425b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f11425b = typedArray.getString(index);
                    } else {
                        aVar.f11424a = typedArray.getResourceId(index, aVar.f11424a);
                    }
                    break;
                case 99:
                    c0252a.d(99, typedArray.getBoolean(index, aVar.f11428e.f11461i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z15) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f11423f.keySet());
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = constraintLayout.getChildAt(i15);
            int id5 = childAt.getId();
            if (!this.f11423f.containsKey(Integer.valueOf(id5))) {
                c2.g("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else {
                if (this.f11422e && id5 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id5 != -1 && this.f11423f.containsKey(Integer.valueOf(id5))) {
                    hashSet.remove(Integer.valueOf(id5));
                    a aVar = this.f11423f.get(Integer.valueOf(id5));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f11428e.f11464j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id5);
                            barrier.setType(aVar.f11428e.f11460h0);
                            barrier.setMargin(aVar.f11428e.f11462i0);
                            barrier.setAllowsGoneWidget(aVar.f11428e.f11476p0);
                            b bVar = aVar.f11428e;
                            int[] iArr = bVar.f11466k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f11468l0;
                                if (str != null) {
                                    bVar.f11466k0 = i(barrier, str);
                                    barrier.setReferencedIds(aVar.f11428e.f11466k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z15) {
                            androidx.constraintlayout.widget.a.e(childAt, aVar.f11430g);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0253d c0253d = aVar.f11426c;
                        if (c0253d.f11505c == 0) {
                            childAt.setVisibility(c0253d.f11504b);
                        }
                        childAt.setAlpha(aVar.f11426c.f11506d);
                        childAt.setRotation(aVar.f11429f.f11510b);
                        childAt.setRotationX(aVar.f11429f.f11511c);
                        childAt.setRotationY(aVar.f11429f.f11512d);
                        childAt.setScaleX(aVar.f11429f.f11513e);
                        childAt.setScaleY(aVar.f11429f.f11514f);
                        e eVar = aVar.f11429f;
                        if (eVar.f11517i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f11429f.f11517i);
                            if (viewFindViewById != null) {
                                float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left2 = left - childAt.getLeft();
                                    float top2 = top - childAt.getTop();
                                    childAt.setPivotX(left2);
                                    childAt.setPivotY(top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f11515g)) {
                                childAt.setPivotX(aVar.f11429f.f11515g);
                            }
                            if (!Float.isNaN(aVar.f11429f.f11516h)) {
                                childAt.setPivotY(aVar.f11429f.f11516h);
                            }
                        }
                        childAt.setTranslationX(aVar.f11429f.f11518j);
                        childAt.setTranslationY(aVar.f11429f.f11519k);
                        childAt.setTranslationZ(aVar.f11429f.f11520l);
                        e eVar2 = aVar.f11429f;
                        if (eVar2.f11521m) {
                            childAt.setElevation(eVar2.f11522n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f11423f.get(num);
            if (aVar2 != null) {
                if (aVar2.f11428e.f11464j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f11428e;
                    int[] iArr2 = bVar3.f11466k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f11468l0;
                        if (str2 != null) {
                            bVar3.f11466k0 = i(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f11428e.f11466k0);
                        }
                    }
                    barrier2.setType(aVar2.f11428e.f11460h0);
                    barrier2.setMargin(aVar2.f11428e.f11462i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f11428e.f11445a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = constraintLayout.getChildAt(i16);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i15) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i15, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f11423f.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = constraintLayout.getChildAt(i15);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id5 = childAt.getId();
            if (this.f11422e && id5 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f11423f.containsKey(Integer.valueOf(id5))) {
                this.f11423f.put(Integer.valueOf(id5), new a());
            }
            a aVar = this.f11423f.get(Integer.valueOf(id5));
            if (aVar != null) {
                aVar.f11430g = androidx.constraintlayout.widget.a.a(this.f11421d, childAt);
                aVar.f(id5, bVar);
                aVar.f11426c.f11504b = childAt.getVisibility();
                aVar.f11426c.f11506d = childAt.getAlpha();
                aVar.f11429f.f11510b = childAt.getRotation();
                aVar.f11429f.f11511c = childAt.getRotationX();
                aVar.f11429f.f11512d = childAt.getRotationY();
                aVar.f11429f.f11513e = childAt.getScaleX();
                aVar.f11429f.f11514f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f11429f;
                    eVar.f11515g = pivotX;
                    eVar.f11516h = pivotY;
                }
                aVar.f11429f.f11518j = childAt.getTranslationX();
                aVar.f11429f.f11519k = childAt.getTranslationY();
                aVar.f11429f.f11520l = childAt.getTranslationZ();
                e eVar2 = aVar.f11429f;
                if (eVar2.f11521m) {
                    eVar2.f11522n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f11428e.f11476p0 = barrier.getAllowsGoneWidget();
                    aVar.f11428e.f11466k0 = barrier.getReferencedIds();
                    aVar.f11428e.f11460h0 = barrier.getType();
                    aVar.f11428e.f11462i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f11423f.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = eVar.getChildAt(i15);
            androidx.constraintlayout.widget.e.a aVar = (androidx.constraintlayout.widget.e.a) childAt.getLayoutParams();
            int id5 = childAt.getId();
            if (this.f11422e && id5 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f11423f.containsKey(Integer.valueOf(id5))) {
                this.f11423f.put(Integer.valueOf(id5), new a());
            }
            a aVar2 = this.f11423f.get(Integer.valueOf(id5));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id5, aVar);
                }
                aVar2.g(id5, aVar);
            }
        }
    }

    public void h(int i15, int i16, int i17, float f15) {
        b bVar = k(i15).f11428e;
        bVar.B = i16;
        bVar.C = i17;
        bVar.D = f15;
    }

    public void l(Context context, int i15) {
        XmlResourceParser xml = context.getResources().getXml(i15);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarJ = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarJ.f11428e.f11445a = true;
                    }
                    this.f11423f.put(Integer.valueOf(aVarJ.f11424a), aVarJ);
                }
            }
        } catch (IOException e15) {
            c2.f("ConstraintSet", "Error parsing resource: " + i15, e15);
        } catch (XmlPullParserException e16) {
            c2.f("ConstraintSet", "Error parsing resource: " + i15, e16);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void m(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarJ = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37002d)) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f11428e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f11427d.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f11426c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f11429f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarJ.f11428e;
                                bVar.f11445a = true;
                                bVar.f11447b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarJ.f11428e.f11464j0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarJ == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.a.d(context, xmlPullParser, aVarJ.f11430g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f11423f.put(Integer.valueOf(aVarJ.f11424a), aVarJ);
                    aVarJ = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e15) {
            c2.f("ConstraintSet", "Error parsing XML resource", e15);
        } catch (XmlPullParserException e16) {
            c2.f("ConstraintSet", "Error parsing XML resource", e16);
        }
    }
}
