# Paczka 166 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `n7/c.java`, `ng/a.java`, `ng/e.java`, `ng/f.java`, `nh/g.java`

## n7/c.java

```java
package n7;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"", "value", "", "a", "(Ljava/lang/Object;)Z", "", "Ljava/lang/Class;", "Ljava/util/List;", "ACCEPTABLE_CLASSES", "lifecycle-viewmodel-savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Class<? extends Object>> f133373a = n.k0(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class});

    public static final boolean a(Object obj) {
        if (obj == null) {
            return true;
        }
        List<Class<? extends Object>> list = f133373a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}

```

## ng/a.java

```java
package ng;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f135901e = e.f135908a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f135902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f135903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f135904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f135905d;

    public a(List list, boolean z15, String str, String str2) {
        jg.s.l(list);
        this.f135902a = list;
        this.f135903b = z15;
        this.f135904c = str;
        this.f135905d = str2;
    }

    public static a h(mg.f fVar) {
        return p(fVar.a(), true);
    }

    static a p(List list, boolean z15) {
        TreeSet treeSet = new TreeSet(f135901e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((hg.g) it.next()).b());
        }
        return new a(new ArrayList(treeSet), z15, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f135903b == aVar.f135903b && jg.r.a(this.f135902a, aVar.f135902a) && jg.r.a(this.f135904c, aVar.f135904c) && jg.r.a(this.f135905d, aVar.f135905d);
    }

    public final int hashCode() {
        return jg.r.b(Boolean.valueOf(this.f135903b), this.f135902a, this.f135904c, this.f135905d);
    }

    public List<gg.c> m() {
        return this.f135902a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.y(parcel, 1, m(), false);
        kg.c.c(parcel, 2, this.f135903b);
        kg.c.u(parcel, 3, this.f135904c, false);
        kg.c.u(parcel, 4, this.f135905d, false);
        kg.c.b(parcel, iA);
    }
}

```

## ng/e.java

```java
package ng;

import android.os.Parcelable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ e f135908a = new e();

    private /* synthetic */ e() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        gg.c cVar = (gg.c) obj2;
        gg.c cVar2 = (gg.c) obj;
        Parcelable.Creator<a> creator = a.CREATOR;
        return !cVar2.m().equals(cVar.m()) ? cVar2.m().compareTo(cVar.m()) : Long.compare(cVar2.p(), cVar.p());
    }
}

```

## ng/f.java

```java
package ng;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayListL = null;
        String strH = null;
        boolean zO = false;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                arrayListL = kg.b.l(parcel, iT, gg.c.CREATOR);
            } else if (iN == 2) {
                zO = kg.b.o(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(arrayListL, zO, strH2, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}

```

## nh/g.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136273a;

    public g(String str) {
        jg.s.m(str, "json must not be null");
        this.f136273a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        String str = this.f136273a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, str, false);
        kg.c.b(parcel, iA);
    }
}

```
