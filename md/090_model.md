# Paczka 090 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ah/m.java`, `android/app/ForegroundServiceStartNotAllowedException.java`, `b00/s.java`, `bi/a.java`, `bi/b.java`, `bi/c.java`, `bi/d.java`, `bi/e.java`, `bi/f.java`, `bi/g.java`, `bi/h.java`

## ah/m.java

```java
package ah;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f6292a = m.class.getClassLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6293b = 0;

    private m() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

```

## android/app/ForegroundServiceStartNotAllowedException.java

```java
package android.app;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ForegroundServiceStartNotAllowedException extends ServiceStartNotAllowedException implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }
}

```

## b00/s.java

```java
package b00;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;
import p071kotlin.Metadata;
import p087nuL.b0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lb00/s;", "LnuL/b0;", "Lb00/t;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;Lb00/t;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)Landroid/net/Uri;", "a", "Landroid/net/Uri;", "photoUri", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends b0<Params, Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Uri photoUri;

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Params input) {
        this.photoUri = input.getUri();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri uri = this.photoUri;
        if (uri == null) {
            uri = null;
        }
        intent.putExtra("output", uri);
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.setType("image/*");
        ArrayList arrayList = new ArrayList();
        for (Intent intent3 : pq.v.q(intent, intent2)) {
            for (ResolveInfo resolveInfo : Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent3, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentActivities(intent3, 0)) {
                Intent intent4 = new Intent(intent3);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent4.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                arrayList.add(intent4);
            }
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) arrayList.remove(0), input.getTitle());
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        return intentCreateChooser;
    }

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Uri c(int resultCode, Intent intent) {
        Uri data;
        if (resultCode != -1) {
            return null;
        }
        if (intent != null && (data = intent.getData()) != null) {
            return data;
        }
        Uri uri = this.photoUri;
        if (uri == null) {
            return null;
        }
        return uri;
    }
}

```

## bi/a.java

```java
package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f19764a;

    a() {
        this(new byte[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.f(parcel, 2, this.f19764a, false);
        kg.c.b(parcel, iA);
    }

    public a(byte[] bArr) {
        this.f19764a = bArr;
    }
}

```

## bi/b.java

```java
package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f19765a;

    b() {
        this(new byte[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.f(parcel, 2, this.f19765a, false);
        kg.c.b(parcel, iA);
    }

    public b(byte[] bArr) {
        this.f19765a = bArr;
    }
}

```

## bi/c.java

```java
package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f19766a;

    public c(byte[] bArr) {
        this.f19766a = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        byte[] bArr = this.f19766a;
        int iA = kg.c.a(parcel);
        kg.c.f(parcel, 1, bArr, false);
        kg.c.b(parcel, iA);
    }
}

```

## bi/d.java

```java
package bi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final PendingIntent f19767a;

    public d(PendingIntent pendingIntent) {
        this.f19767a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f19767a, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## bi/e.java

```java
package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 2) {
                kg.b.B(parcel, iT);
            } else {
                bArrB = kg.b.b(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}

```

## bi/f.java

```java
package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 2) {
                kg.b.B(parcel, iT);
            } else {
                bArrB = kg.b.b(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new b(bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b[i15];
    }
}

```

## bi/g.java

```java
package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                bArrB = kg.b.b(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new c(bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c[i15];
    }
}

```

## bi/h.java

```java
package bi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                pendingIntent = (PendingIntent) kg.b.g(parcel, iT, PendingIntent.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new d(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d[i15];
    }
}

```
