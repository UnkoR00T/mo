# Paczka 170 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ni/c.java`, `ni/l.java`, `ni/m.java`, `ni/n.java`, `nj/a.java`

## ni/c.java

```java
package ni;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f136413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f136414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f136415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f136416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f136417f;

    public c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f136412a = str;
        this.f136413b = str2;
        this.f136414c = str3;
        this.f136415d = str4;
        this.f136416e = str5;
        this.f136417f = str6;
    }

    public final String a() {
        return this.f136412a;
    }

    public final String b() {
        return this.f136413b;
    }

    public final String c() {
        return this.f136414c;
    }

    public final String d() {
        return this.f136415d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f136416e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.c(this.f136412a, cVar.f136412a) && t.c(this.f136413b, cVar.f136413b) && t.c(this.f136414c, cVar.f136414c) && t.c(this.f136415d, cVar.f136415d) && t.c(this.f136416e, cVar.f136416e) && t.c(this.f136417f, cVar.f136417f);
    }

    public final String f() {
        return this.f136417f;
    }

    public final int hashCode() {
        int iHashCode = this.f136412a.hashCode() * 31;
        String str = this.f136413b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f136414c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f136415d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f136416e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f136417f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f136412a;
        int length = String.valueOf(str).length();
        String str2 = this.f136413b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f136414c;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f136415d;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f136416e;
        int length5 = String.valueOf(str5).length();
        String str6 = this.f136417f;
        StringBuilder sb5 = new StringBuilder(length + 43 + length2 + 17 + length3 + 18 + length4 + 15 + length5 + 17 + String.valueOf(str6).length() + 1);
        sb5.append("PhotoPageData(photoUri=");
        sb5.append(str);
        sb5.append(", photoThumbnailUri=");
        sb5.append(str2);
        sb5.append(", reportPhotoUri=");
        sb5.append(str3);
        sb5.append(", userDisplayName=");
        sb5.append(str4);
        sb5.append(", userImageUri=");
        sb5.append(str5);
        sb5.append(", userProfileUri=");
        sb5.append(str6);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(this.f136412a);
        parcel.writeString(this.f136413b);
        parcel.writeString(this.f136414c);
        parcel.writeString(this.f136415d);
        parcel.writeString(this.f136416e);
        parcel.writeString(this.f136417f);
    }
}

```

## ni/l.java

```java
package ni;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import java.util.List;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends ib.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f136425m;

    public l(FragmentManager fragmentManager, androidx.p016lifecycle.j jVar) {
        super(fragmentManager, jVar);
        this.f136425m = v.n();
    }

    @Override // ib.a
    public final o E(int i15) {
        int i16 = k.N0;
        c cVar = (c) this.f136425m.get(i15);
        int size = this.f136425m.size() - 1;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("page_data", cVar);
        bundle.putBoolean("has_previous", i15 > 0);
        bundle.putBoolean("has_next", i15 < size);
        kVar.F1(bundle);
        return kVar;
    }

    public final void W(List list) {
        this.f136425m = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int g() {
        return this.f136425m.size();
    }
}

```

## ni/m.java

```java
package ni;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i15 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i15);
        for (int i16 = 0; i16 != i15; i16++) {
            arrayList.add(c.CREATOR.createFromParcel(parcel));
        }
        return new n(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new n[i15];
    }
}

```

## ni/n.java

```java
package ni;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f136426a;

    public n(List list) {
        this.f136426a = list;
    }

    public final List a() {
        return this.f136426a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && t.c(this.f136426a, ((n) obj).f136426a);
    }

    public final int hashCode() {
        return this.f136426a.hashCode();
    }

    public final String toString() {
        List list = this.f136426a;
        StringBuilder sb5 = new StringBuilder(list.toString().length() + 43);
        sb5.append("ParcelablePhotoPageDataList(photoPageData=");
        sb5.append(list);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        List list = this.f136426a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).writeToParcel(parcel, i15);
        }
    }
}

```

## nj/a.java

```java
package nj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import r0.l1;

/* JADX INFO: loaded from: classes4.dex */
public class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new C3371a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1<String, Bundle> f136522c;

    /* JADX INFO: renamed from: nj.a$a, reason: collision with other inner class name */
    class C3371a implements Parcelable.ClassLoaderCreator<a> {
        C3371a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i15) {
            return new a[i15];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C3371a c3371a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f136522c + "}";
    }

    @Override // r6.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        super.writeToParcel(parcel, i15);
        int size = this.f136522c.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i16 = 0; i16 < size; i16++) {
            strArr[i16] = this.f136522c.f(i16);
            bundleArr[i16] = this.f136522c.k(i16);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f136522c = new l1<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i15 = parcel.readInt();
        String[] strArr = new String[i15];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i15];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f136522c = new l1<>(i15);
        for (int i16 = 0; i16 < i15; i16++) {
            this.f136522c.put(strArr[i16], bundleArr[i16]);
        }
    }
}

```
