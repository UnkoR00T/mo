# Paczka 214 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `v7/a.java (część 2/2)`

## v7/a.java (część 2/2)

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
```
