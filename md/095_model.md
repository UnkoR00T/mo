# Paczka 095 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `c3/SnapshotStateList.java (część 2/2)`

## c3/SnapshotStateList.java (część 2/2)

```java
package c3;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p071kotlin.Metadata;
import p076m2.w3;

/* JADX INFO: renamed from: c3.f0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 R*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001RB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u000
    public final List<T> s() {
        return g0.g(this).j();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        T t15 = get(index);
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVar = eVarJ.set(index, element);
            if (fr.t.c(eVar, eVarJ)) {
                return t15;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVar, false);
            }
            w.V(lVarC, this);
        } while (!zF);
        return t15;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            w3.a("fromIndex or toIndex are out of bounds");
        }
        return new x0(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return fr.j.a(this);
    }

    public String toString() {
        return "SnapshotStateList(value=" + ((p0) w.I((p0) getFirstStateRecord())).j() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List<T> listS = s();
        int size = listS.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeValue(listS.get(i15));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarAddAll = eVarJ.addAll(elements);
            if (fr.t.c(eVarAddAll, eVarJ)) {
                return false;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarAddAll, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new o0(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarRemove = eVarJ.remove(element);
            if (fr.t.c(eVarRemove, eVarJ)) {
                return false;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarRemove, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) fr.j.b(this, tArr);
    }

    public SnapshotStateList() {
        this(t2.a.b());
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarAdd = eVarJ.add(index, element);
            if (fr.t.c(eVarAdd, eVarJ)) {
                return;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarAdd, true);
            }
            w.V(lVarC, this);
        } while (!zF);
    }
}
```
