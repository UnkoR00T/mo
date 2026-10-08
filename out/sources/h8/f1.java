package h8;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class f1<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.l<V> f81578c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f81577b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f81576a = -1;

    public f1(w7.l<V> lVar) {
        this.f81578c = lVar;
    }

    public void a(int i15, V v15) {
        if (this.f81576a == -1) {
            zj.p.w(this.f81577b.size() == 0);
            this.f81576a = 0;
        }
        if (this.f81577b.size() > 0) {
            SparseArray<V> sparseArray = this.f81577b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zj.p.d(i15 >= iKeyAt);
            if (iKeyAt == i15) {
                w7.l<V> lVar = this.f81578c;
                SparseArray<V> sparseArray2 = this.f81577b;
                lVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f81577b.append(i15, v15);
    }

    public void b() {
        for (int i15 = 0; i15 < this.f81577b.size(); i15++) {
            this.f81578c.accept(this.f81577b.valueAt(i15));
        }
        this.f81576a = -1;
        this.f81577b.clear();
    }

    public void c(int i15) {
        for (int size = this.f81577b.size() - 1; size >= 0 && i15 < this.f81577b.keyAt(size); size--) {
            this.f81578c.accept(this.f81577b.valueAt(size));
            this.f81577b.removeAt(size);
        }
        this.f81576a = this.f81577b.size() > 0 ? Math.min(this.f81576a, this.f81577b.size() - 1) : -1;
    }

    public void d(int i15) {
        int i16 = 0;
        while (i16 < this.f81577b.size() - 1) {
            int i17 = i16 + 1;
            if (i15 < this.f81577b.keyAt(i17)) {
                return;
            }
            this.f81578c.accept(this.f81577b.valueAt(i16));
            this.f81577b.removeAt(i16);
            int i18 = this.f81576a;
            if (i18 > 0) {
                this.f81576a = i18 - 1;
            }
            i16 = i17;
        }
    }

    public V e(int i15) {
        if (this.f81576a == -1) {
            this.f81576a = 0;
        }
        while (true) {
            int i16 = this.f81576a;
            if (i16 <= 0 || i15 >= this.f81577b.keyAt(i16)) {
                break;
            }
            this.f81576a--;
        }
        while (this.f81576a < this.f81577b.size() - 1 && i15 >= this.f81577b.keyAt(this.f81576a + 1)) {
            this.f81576a++;
        }
        return this.f81577b.valueAt(this.f81576a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f81577b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f81577b.size() == 0;
    }
}
