package androidx.coordinatorlayout.widget;

import i6.f;
import i6.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import r0.l1;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f<ArrayList<T>> f11803a = new g(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l1<T, ArrayList<T>> f11804b = new l1<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f11805c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<T> f11806d = new HashSet<>();

    private void e(T t15, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t15)) {
            return;
        }
        if (hashSet.contains(t15)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t15);
        ArrayList<T> arrayList2 = this.f11804b.get(t15);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                e(arrayList2.get(i15), arrayList, hashSet);
            }
        }
        hashSet.remove(t15);
        arrayList.add(t15);
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayListZ = this.f11803a.z();
        return arrayListZ == null ? new ArrayList<>() : arrayListZ;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f11803a.A(arrayList);
    }

    public void a(T t15, T t16) {
        if (!this.f11804b.containsKey(t15) || !this.f11804b.containsKey(t16)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f11804b.get(t15);
        if (arrayListF == null) {
            arrayListF = f();
            this.f11804b.put(t15, arrayListF);
        }
        arrayListF.add(t16);
    }

    public void b(T t15) {
        if (this.f11804b.containsKey(t15)) {
            return;
        }
        this.f11804b.put(t15, null);
    }

    public void c() {
        int size = this.f11804b.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            ArrayList<T> arrayListK = this.f11804b.k(i15);
            if (arrayListK != null) {
                k(arrayListK);
            }
        }
        this.f11804b.clear();
    }

    public boolean d(T t15) {
        return this.f11804b.containsKey(t15);
    }

    public List g(T t15) {
        return this.f11804b.get(t15);
    }

    public List<T> h(T t15) {
        int size = this.f11804b.getSize();
        ArrayList arrayList = null;
        for (int i15 = 0; i15 < size; i15++) {
            ArrayList<T> arrayListK = this.f11804b.k(i15);
            if (arrayListK != null && arrayListK.contains(t15)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f11804b.f(i15));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f11805c.clear();
        this.f11806d.clear();
        int size = this.f11804b.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            e(this.f11804b.f(i15), this.f11805c, this.f11806d);
        }
        return this.f11805c;
    }

    public boolean j(T t15) {
        int size = this.f11804b.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            ArrayList<T> arrayListK = this.f11804b.k(i15);
            if (arrayListK != null && arrayListK.contains(t15)) {
                return true;
            }
        }
        return false;
    }
}
