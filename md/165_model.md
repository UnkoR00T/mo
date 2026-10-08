# Paczka 165 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `mi/b.java`, `mz/y.java`, `mz/z.java`

## mi/b.java

```java
package mi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.a71;
import com.google.android.libraries.places.internal.dg;
import com.google.android.libraries.places.internal.f61;
import com.google.android.libraries.places.internal.hg;
import com.google.android.libraries.places.internal.ig;
import com.google.android.libraries.places.internal.qh;
import com.google.android.libraries.places.internal.rh;
import com.google.android.libraries.places.internal.sh;
import com.google.android.libraries.places.internal.yh;
import com.google.android.libraries.places.internal.zf;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg f126670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yh f126671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f126672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f126673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f126674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private qh f126675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private qh f126676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a71 f126677h;

    public b(hg hgVar, yh yhVar, List list, int i15, Boolean bool, qh qhVar, qh qhVar2) {
        this.f126670a = hgVar;
        this.f126671b = yhVar;
        this.f126672c = list;
        this.f126673d = i15;
        this.f126674e = bool;
        this.f126675f = qhVar;
        this.f126676g = qhVar2;
    }

    private final zf e(Context context) {
        zf zfVarI = ig.I();
        hg hgVar = this.f126670a;
        zfVarI.A(hgVar);
        zfVarI.I(this.f126671b);
        zfVarI.D(this.f126672c);
        zfVarI.H(f61.a(context, this.f126673d));
        Boolean bool = this.f126674e;
        if (bool != null) {
            zfVarI.G(bool.booleanValue());
        }
        if (hgVar != hg.VARIANT_COMPACT_ADVANCED && hgVar != hg.VARIANT_FULL_ADVANCED) {
            return zfVarI;
        }
        rh rhVarI = sh.I();
        qh qhVar = this.f126675f;
        if (qhVar != null) {
            rhVarI.D(qhVar);
        }
        qh qhVar2 = this.f126676g;
        if (qhVar2 != null) {
            rhVarI.A(qhVar2);
        }
        zfVarI.J((sh) rhVarI.H0());
        return zfVarI;
    }

    private final void f(zf zfVar) {
        a71 a71Var = this.f126677h;
        if (a71Var != null) {
            a71Var.b((ig) zfVar.H0());
        }
    }

    private final void g(Context context, int i15, Integer num) {
        zf zfVarE = e(context);
        zfVarE.K(i15);
        if (num != null) {
            zfVarE.F(num.intValue());
        }
        f(zfVarE);
    }

    public final void a(Context context) {
        g(context, 3, null);
    }

    public final void b(Context context) {
        g(context, 4, null);
    }

    public final void c(Context context, int i15) {
        g(context, 5, Integer.valueOf(i15));
    }

    public final void d(Context context) {
        g(context, 6, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        ?? BooleanValue;
        parcel.writeString(this.f126670a.name());
        parcel.writeString(this.f126671b.name());
        List list = this.f126672c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((dg) it.next()).name());
        }
        parcel.writeInt(this.f126673d);
        Boolean bool = this.f126674e;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeValue(this.f126675f);
        parcel.writeValue(this.f126676g);
    }
}

```

## mz/y.java

```java
package mz;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lmz/y;", "Lmz/d;", "Lmz/o;", "Lmz/e;", "", "addressEmail", "subject", "body", "attachmentUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "p", "()Ljava/lang/Integer;", "Ljava/lang/String;", "c", "d", "getAttachmentUri", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements d, o, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String addressEmail;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String subject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String attachmentUri;

    public y(String str, String str2, String str3, String str4) {
        this.addressEmail = str;
        this.subject = str2;
        this.body = str3;
        this.attachmentUri = str4;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.SEND";
    }

    @Override // mz.o
    public String b() {
        return "text/plain";
    }

    @Override // mz.d
    public Bundle getExtras() {
        Bundle bundle = new Bundle();
        String str = this.addressEmail;
        if (str != null) {
            bundle.putStringArray("android.intent.extra.EMAIL", (String[]) pq.v.e(str).toArray(new String[0]));
        }
        String str2 = this.subject;
        if (str2 != null) {
            bundle.putString("android.intent.extra.SUBJECT", str2);
        }
        String str3 = this.body;
        if (str3 != null) {
            bundle.putString("android.intent.extra.TEXT", str3);
        }
        bundle.putParcelable("android.intent.extra.STREAM", Uri.parse(this.attachmentUri));
        return bundle;
    }

    @Override // mz.e
    public Integer p() {
        return 1;
    }
}

```

## mz/z.java

```java
package mz;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmz/z;", "Lmz/e;", "Lmz/o;", "Lmz/d;", "", "uri", "<init>", "(Ljava/lang/String;)V", "", "p", "()Ljava/lang/Integer;", "a", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements e, o, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String uri;

    public z(String str) {
        this.uri = str;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.SEND";
    }

    @Override // mz.o
    public String b() {
        return "application/pdf";
    }

    @Override // mz.d
    public Bundle getExtras() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.STREAM", Uri.parse(this.uri));
        return bundle;
    }

    @Override // mz.e
    public Integer p() {
        return 1;
    }
}

```
