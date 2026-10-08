package wf;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import bg.c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import zj.l;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f212945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f212946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f212947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f212948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f212949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f212950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f212951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f212952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f212953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f212954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f212955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f212956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f212957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f212958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f212959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f212960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f212961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f212936r = new b().h("").a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f212937s = c.c(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f212938t = c.c(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f212939u = c.c(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f212940v = c.c(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f212941w = c.c(4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f212942x = c.c(5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f212943y = c.c(6);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f212944z = c.c(7);
    private static final String A = c.c(8);
    private static final String B = c.c(9);
    private static final String C = c.c(10);
    private static final String D = c.c(11);
    private static final String E = c.c(12);
    private static final String F = c.c(13);
    private static final String G = c.c(14);
    private static final String H = c.c(15);
    private static final String I = c.c(16);
    public static final nf.a<a> J = new nf.c();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f212962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f212963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f212964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f212965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f212966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f212967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f212968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f212969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f212970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f212971j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f212972k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f212973l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f212974m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f212975n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f212976o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f212977p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f212978q;

        public a a() {
            return new a(this.f212962a, this.f212964c, this.f212965d, this.f212963b, this.f212966e, this.f212967f, this.f212968g, this.f212969h, this.f212970i, this.f212971j, this.f212972k, this.f212973l, this.f212974m, this.f212975n, this.f212976o, this.f212977p, this.f212978q);
        }

        public b b() {
            this.f212975n = false;
            return this;
        }

        public CharSequence c() {
            return this.f212962a;
        }

        public b d(float f15, int i15) {
            this.f212966e = f15;
            this.f212967f = i15;
            return this;
        }

        public b e(int i15) {
            this.f212968g = i15;
            return this;
        }

        public b f(float f15) {
            this.f212969h = f15;
            return this;
        }

        public b g(int i15) {
            this.f212970i = i15;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f212962a = charSequence;
            return this;
        }

        public b i(Layout.Alignment alignment) {
            this.f212964c = alignment;
            return this;
        }

        public b j(float f15, int i15) {
            this.f212972k = f15;
            this.f212971j = i15;
            return this;
        }

        public b() {
            this.f212962a = null;
            this.f212963b = null;
            this.f212964c = null;
            this.f212965d = null;
            this.f212966e = -3.4028235E38f;
            this.f212967f = PKIFailureInfo.systemUnavail;
            this.f212968g = PKIFailureInfo.systemUnavail;
            this.f212969h = -3.4028235E38f;
            this.f212970i = PKIFailureInfo.systemUnavail;
            this.f212971j = PKIFailureInfo.systemUnavail;
            this.f212972k = -3.4028235E38f;
            this.f212973l = -3.4028235E38f;
            this.f212974m = -3.4028235E38f;
            this.f212975n = false;
            this.f212976o = -16777216;
            this.f212977p = PKIFailureInfo.systemUnavail;
        }

        private b(a aVar) {
            this.f212962a = aVar.f212945a;
            this.f212963b = aVar.f212948d;
            this.f212964c = aVar.f212946b;
            this.f212965d = aVar.f212947c;
            this.f212966e = aVar.f212949e;
            this.f212967f = aVar.f212950f;
            this.f212968g = aVar.f212951g;
            this.f212969h = aVar.f212952h;
            this.f212970i = aVar.f212953i;
            this.f212971j = aVar.f212958n;
            this.f212972k = aVar.f212959o;
            this.f212973l = aVar.f212954j;
            this.f212974m = aVar.f212955k;
            this.f212975n = aVar.f212956l;
            this.f212976o = aVar.f212957m;
            this.f212977p = aVar.f212960p;
            this.f212978q = aVar.f212961q;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f212945a, aVar.f212945a) && this.f212946b == aVar.f212946b && this.f212947c == aVar.f212947c && ((bitmap = this.f212948d) != null ? !((bitmap2 = aVar.f212948d) == null || !bitmap.sameAs(bitmap2)) : aVar.f212948d == null) && this.f212949e == aVar.f212949e && this.f212950f == aVar.f212950f && this.f212951g == aVar.f212951g && this.f212952h == aVar.f212952h && this.f212953i == aVar.f212953i && this.f212954j == aVar.f212954j && this.f212955k == aVar.f212955k && this.f212956l == aVar.f212956l && this.f212957m == aVar.f212957m && this.f212958n == aVar.f212958n && this.f212959o == aVar.f212959o && this.f212960p == aVar.f212960p && this.f212961q == aVar.f212961q) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return l.b(this.f212945a, this.f212946b, this.f212947c, this.f212948d, Float.valueOf(this.f212949e), Integer.valueOf(this.f212950f), Integer.valueOf(this.f212951g), Float.valueOf(this.f212952h), Integer.valueOf(this.f212953i), Float.valueOf(this.f212954j), Float.valueOf(this.f212955k), Boolean.valueOf(this.f212956l), Integer.valueOf(this.f212957m), Integer.valueOf(this.f212958n), Float.valueOf(this.f212959o), Integer.valueOf(this.f212960p), Float.valueOf(this.f212961q));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f15, int i15, int i16, float f16, int i17, int i18, float f17, float f18, float f19, boolean z15, int i19, int i25, float f25) {
        if (charSequence == null) {
            bg.a.b(bitmap);
        } else {
            bg.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f212945a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f212945a = charSequence.toString();
        } else {
            this.f212945a = null;
        }
        this.f212946b = alignment;
        this.f212947c = alignment2;
        this.f212948d = bitmap;
        this.f212949e = f15;
        this.f212950f = i15;
        this.f212951g = i16;
        this.f212952h = f16;
        this.f212953i = i17;
        this.f212954j = f18;
        this.f212955k = f19;
        this.f212956l = z15;
        this.f212957m = i19;
        this.f212958n = i18;
        this.f212959o = f17;
        this.f212960p = i25;
        this.f212961q = f25;
    }
}
