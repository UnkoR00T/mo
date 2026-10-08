package bt;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class n extends AbstractList<String> implements RandomAccess, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f21453b = new n().n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Object> f21454a;

    public n() {
        this.f21454a = new ArrayList();
    }

    private static d f(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        return obj instanceof String ? d.j((String) obj) : d.h((byte[]) obj);
    }

    private static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof d ? ((d) obj).B() : j.b((byte[]) obj);
    }

    @Override // bt.o
    public d P1(int i15) {
        Object obj = this.f21454a.get(i15);
        d dVarF = f(obj);
        if (dVarF != obj) {
            this.f21454a.set(i15, dVarF);
        }
        return dVarF;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f21454a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i15, String str) {
        this.f21454a.add(i15, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i15) {
        Object objRemove = this.f21454a.remove(i15);
        ((AbstractList) this).modCount++;
        return g(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i15, String str) {
        return g(this.f21454a.set(i15, str));
    }

    @Override // bt.o
    public void i1(d dVar) {
        this.f21454a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // bt.o
    public o n0() {
        return new x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21454a.size();
    }

    @Override // bt.o
    public List<?> y() {
        return Collections.unmodifiableList(this.f21454a);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i15, Collection<? extends String> collection) {
        if (collection instanceof o) {
            collection = ((o) collection).y();
        }
        boolean zAddAll = this.f21454a.addAll(i15, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i15) {
        Object obj = this.f21454a.get(i15);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strB = dVar.B();
            if (dVar.q()) {
                this.f21454a.set(i15, strB);
            }
            return strB;
        }
        byte[] bArr = (byte[]) obj;
        String strB2 = j.b(bArr);
        if (j.a(bArr)) {
            this.f21454a.set(i15, strB2);
        }
        return strB2;
    }

    public n(o oVar) {
        this.f21454a = new ArrayList(oVar.size());
        addAll(oVar);
    }
}
