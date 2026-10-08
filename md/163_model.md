# Paczka 163 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `kj2/LocalDocumentDataWrapped.java`, `l9/b.java`, `l9/d.java`, `m6/c.java`, `mg/b.java`, `mg/e.java`

## kj2/LocalDocumentDataWrapped.java

```java
package kj2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kj2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lkj2/c;", "Landroid/os/Parcelable;", "Lxh2/a;", "dataHeader", "Lkj2/a;", "dataContainer", "<init>", "(Lxh2/a;Lkj2/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxh2/a;", "b", "()Lxh2/a;", "Lkj2/a;", "()Lkj2/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalDocumentDataWrapped implements Parcelable {
    public static final Parcelable.Creator<LocalDocumentDataWrapped> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataHeader")
    private final xh2.a dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataContainer")
    private final LocalDocumentDataContainer dataContainer;

    /* JADX INFO: renamed from: kj2.c$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocalDocumentDataWrapped> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalDocumentDataWrapped createFromParcel(Parcel parcel) {
            return new LocalDocumentDataWrapped((xh2.a) parcel.readSerializable(), LocalDocumentDataContainer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LocalDocumentDataWrapped[] newArray(int i15) {
            return new LocalDocumentDataWrapped[i15];
        }
    }

    public LocalDocumentDataWrapped(xh2.a aVar, LocalDocumentDataContainer localDocumentDataContainer) {
        this.dataHeader = aVar;
        this.dataContainer = localDocumentDataContainer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDocumentDataContainer getDataContainer() {
        return this.dataContainer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final xh2.a getDataHeader() {
        return this.dataHeader;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalDocumentDataWrapped)) {
            return false;
        }
        LocalDocumentDataWrapped localDocumentDataWrapped = (LocalDocumentDataWrapped) other;
        return t.c(this.dataHeader, localDocumentDataWrapped.dataHeader) && t.c(this.dataContainer, localDocumentDataWrapped.dataContainer);
    }

    public int hashCode() {
        return (this.dataHeader.hashCode() * 31) + this.dataContainer.hashCode();
    }

    public String toString() {
        return "LocalDocumentDataWrapped(dataHeader=" + this.dataHeader + ", dataContainer=" + this.dataContainer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.dataHeader);
        this.dataContainer.writeToParcel(dest, flags);
    }
}

```

## l9/b.java

```java
package l9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public e a(long j15, byte[] bArr, int i15, int i16) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i15, i16);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(w7.f.a(new zj.g() { // from class: l9.a
            @Override // zj.g
            public final Object apply(Object obj) {
                return v7.a.b((Bundle) obj);
            }
        }, (ArrayList) zj.p.q(bundle.getParcelableArrayList("c"))), j15, bundle.getLong("d"));
    }
}

```

## l9/d.java

```java
package l9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public byte[] a(List<v7.a> list, long j15) {
        ArrayList<Bundle> arrayListB = w7.f.b(list, new zj.g() { // from class: l9.c
            @Override // zj.g
            public final Object apply(Object obj) {
                return ((v7.a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListB);
        bundle.putLong("d", j15);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}

```

## m6/c.java

Powiązane klasy (możesz dosłać): `j6/l0.java`

```java
package m6;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import i6.i;
import io.sentry.android.core.c2;
import j6.l0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class c {

    class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f123820a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z15, b bVar) {
            super(inputConnection, z15);
            this.f123820a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i15, Bundle bundle) {
            if (this.f123820a.a(d.f(inputContentInfo), i15, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i15, bundle);
        }
    }

    public interface b {
        boolean a(d dVar, int i15, Bundle bundle);
    }

    public static /* synthetic */ boolean a(View view, d dVar, int i15, Bundle bundle) {
        if ((i15 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e15) {
                c2.h("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e15);
                return false;
            }
        }
        return l0.X(view, new j6.d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }

    private static b b(final View view) {
        i.g(view);
        return new b() { // from class: m6.b
            @Override // m6.c.b
            public final boolean a(d dVar, int i15, Bundle bundle) {
                return c.a(view, dVar, i15, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        i6.c.d(inputConnection, "inputConnection must be non-null");
        i6.c.d(editorInfo, "editorInfo must be non-null");
        i6.c.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }
}

```

## mg/b.java

```java
package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126323b;

    public b(boolean z15, int i15) {
        this.f126322a = z15;
        this.f126323b = i15;
    }

    public boolean h() {
        return this.f126322a;
    }

    public int m() {
        return this.f126323b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, h());
        kg.c.m(parcel, 2, m());
        kg.c.b(parcel, iA);
    }
}

```

## mg/e.java

```java
package mg;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class e extends kg.a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f126324a;

    public e(PendingIntent pendingIntent) {
        this.f126324a = pendingIntent;
    }

    public PendingIntent h() {
        return this.f126324a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, h(), i15, false);
        kg.c.b(parcel, iA);
    }
}

```
