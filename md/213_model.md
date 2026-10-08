# Paczka 213 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `v7/a.java (część 1/2)`

## v7/a.java (część 1/2)

```java
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

    /* JADX INFO: renamed 
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

```
