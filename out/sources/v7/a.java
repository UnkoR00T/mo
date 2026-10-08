package v7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f204168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f204169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f204170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f204171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f204172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f204173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f204174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f204175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f204176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f204177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f204178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f204179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f204180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f204181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f204182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f204183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f204184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f204185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final a f204160s = new b().o("").a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f204161t = o0.u0(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f204162u = o0.u0(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f204163v = o0.u0(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f204164w = o0.u0(2);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f204165x = o0.u0(3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f204166y = o0.u0(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f204167z = o0.u0(4);
    private static final String A = o0.u0(5);
    private static final String B = o0.u0(6);
    private static final String C = o0.u0(7);
    private static final String D = o0.u0(8);
    private static final String E = o0.u0(9);
    private static final String F = o0.u0(10);
    private static final String G = o0.u0(11);
    private static final String H = o0.u0(12);
    private static final String I = o0.u0(13);
    private static final String J = o0.u0(14);
    private static final String K = o0.u0(15);
    private static final String L = o0.u0(16);
    private static final String M = o0.u0(19);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f204186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f204187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f204188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f204189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f204190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f204191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f204192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f204193h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f204194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f204195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f204196k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f204197l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f204198m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f204199n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f204200o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f204201p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f204202q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f204203r;

        public a a() {
            return new a(this.f204186a, this.f204188c, this.f204189d, this.f204187b, this.f204190e, this.f204191f, this.f204192g, this.f204193h, this.f204194i, this.f204195j, this.f204196k, this.f204197l, this.f204198m, this.f204199n, this.f204200o, this.f204201p, this.f204202q, this.f204203r);
        }

        public b b() {
            this.f204199n = false;
            return this;
        }

        public int c() {
            return this.f204192g;
        }

        public int d() {
            return this.f204194i;
        }

        public CharSequence e() {
            return this.f204186a;
        }

        public b f(Bitmap bitmap) {
            this.f204187b = bitmap;
            this.f204186a = null;
            return this;
        }

        public b g(float f15) {
            this.f204198m = f15;
            return this;
        }

        public b h(float f15, int i15) {
            this.f204190e = f15;
            this.f204191f = i15;
            return this;
        }

        public b i(int i15) {
            this.f204192g = i15;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f204189d = alignment;
            return this;
        }

        public b k(float f15) {
            this.f204193h = f15;
            return this;
        }

        public b l(int i15) {
            this.f204194i = i15;
            return this;
        }

        public b m(float f15) {
            this.f204202q = f15;
            return this;
        }

        public b n(float f15) {
            this.f204197l = f15;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f204186a = charSequence;
            this.f204187b = null;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f204188c = alignment;
            return this;
        }

        public b q(float f15, int i15) {
            this.f204196k = f15;
            this.f204195j = i15;
            return this;
        }

        public b r(int i15) {
            this.f204201p = i15;
            return this;
        }

        public b s(int i15) {
            this.f204200o = i15;
            this.f204199n = true;
            return this;
        }

        public b t(int i15) {
            this.f204203r = i15;
            return this;
        }

        public b() {
            this.f204186a = null;
            this.f204187b = null;
            this.f204188c = null;
            this.f204189d = null;
            this.f204190e = -3.4028235E38f;
            this.f204191f = PKIFailureInfo.systemUnavail;
            this.f204192g = PKIFailureInfo.systemUnavail;
            this.f204193h = -3.4028235E38f;
            this.f204194i = PKIFailureInfo.systemUnavail;
            this.f204195j = PKIFailureInfo.systemUnavail;
            this.f204196k = -3.4028235E38f;
            this.f204197l = -3.4028235E38f;
            this.f204198m = -3.4028235E38f;
            this.f204199n = false;
            this.f204200o = -16777216;
            this.f204201p = PKIFailureInfo.systemUnavail;
        }

        private b(a aVar) {
            this.f204186a = aVar.f204168a;
            this.f204187b = aVar.f204171d;
            this.f204188c = aVar.f204169b;
            this.f204189d = aVar.f204170c;
            this.f204190e = aVar.f204172e;
            this.f204191f = aVar.f204173f;
            this.f204192g = aVar.f204174g;
            this.f204193h = aVar.f204175h;
            this.f204194i = aVar.f204176i;
            this.f204195j = aVar.f204181n;
            this.f204196k = aVar.f204182o;
            this.f204197l = aVar.f204177j;
            this.f204198m = aVar.f204178k;
            this.f204199n = aVar.f204179l;
            this.f204200o = aVar.f204180m;
            this.f204201p = aVar.f204183p;
            this.f204202q = aVar.f204184q;
            this.f204203r = aVar.f204185r;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f204161t);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f204162u);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    d.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f204163v);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f204164w);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f204165x);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f204166y);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f204167z;
        if (bundle.containsKey(str)) {
            String str2 = A;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = B;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = C;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = D;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = F;
        if (bundle.containsKey(str6)) {
            String str7 = E;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = G;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = H;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = I;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(J, false)) {
            bVar.b();
        }
        String str11 = K;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = L;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        String str13 = M;
        if (bundle.containsKey(str13)) {
            bVar.t(bundle.getInt(str13));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f204168a;
        if (charSequence != null) {
            bundle.putCharSequence(f204161t, charSequence);
            CharSequence charSequence2 = this.f204168a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = d.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f204162u, arrayListA);
                }
            }
        }
        bundle.putSerializable(f204163v, this.f204169b);
        bundle.putSerializable(f204164w, this.f204170c);
        bundle.putFloat(f204167z, this.f204172e);
        bundle.putInt(A, this.f204173f);
        bundle.putInt(B, this.f204174g);
        bundle.putFloat(C, this.f204175h);
        bundle.putInt(D, this.f204176i);
        bundle.putInt(E, this.f204181n);
        bundle.putFloat(F, this.f204182o);
        bundle.putFloat(G, this.f204177j);
        bundle.putFloat(H, this.f204178k);
        bundle.putBoolean(J, this.f204179l);
        bundle.putInt(I, this.f204180m);
        bundle.putInt(K, this.f204183p);
        bundle.putFloat(L, this.f204184q);
        bundle.putInt(M, this.f204185r);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f204171d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            p.w(this.f204171d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f204166y, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f204168a, aVar.f204168a) && this.f204169b == aVar.f204169b && this.f204170c == aVar.f204170c && ((bitmap = this.f204171d) != null ? !((bitmap2 = aVar.f204171d) == null || !bitmap.sameAs(bitmap2)) : aVar.f204171d == null) && this.f204172e == aVar.f204172e && this.f204173f == aVar.f204173f && this.f204174g == aVar.f204174g && this.f204175h == aVar.f204175h && this.f204176i == aVar.f204176i && this.f204177j == aVar.f204177j && this.f204178k == aVar.f204178k && this.f204179l == aVar.f204179l && this.f204180m == aVar.f204180m && this.f204181n == aVar.f204181n && this.f204182o == aVar.f204182o && this.f204183p == aVar.f204183p && this.f204184q == aVar.f204184q && this.f204185r == aVar.f204185r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f204168a, this.f204169b, this.f204170c, this.f204171d, Float.valueOf(this.f204172e), Integer.valueOf(this.f204173f), Integer.valueOf(this.f204174g), Float.valueOf(this.f204175h), Integer.valueOf(this.f204176i), Float.valueOf(this.f204177j), Float.valueOf(this.f204178k), Boolean.valueOf(this.f204179l), Integer.valueOf(this.f204180m), Integer.valueOf(this.f204181n), Float.valueOf(this.f204182o), Integer.valueOf(this.f204183p), Float.valueOf(this.f204184q), Integer.valueOf(this.f204185r));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f15, int i15, int i16, float f16, int i17, int i18, float f17, float f18, float f19, boolean z15, int i19, int i25, float f25, int i26) {
        if (charSequence == null) {
            p.q(bitmap);
        } else {
            p.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f204168a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f204168a = charSequence.toString();
        } else {
            this.f204168a = null;
        }
        this.f204169b = alignment;
        this.f204170c = alignment2;
        this.f204171d = bitmap;
        this.f204172e = f15;
        this.f204173f = i15;
        this.f204174g = i16;
        this.f204175h = f16;
        this.f204176i = i17;
        this.f204177j = f18;
        this.f204178k = f19;
        this.f204179l = z15;
        this.f204180m = i19;
        this.f204181n = i18;
        this.f204182o = f17;
        this.f204183p = i25;
        this.f204184q = f25;
        this.f204185r = i26;
    }
}
