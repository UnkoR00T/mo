package bp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a extends b implements Iterable<b>, q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f20651b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20652c;

    public void A3(b bVar) {
        this.f20651b.add(bVar);
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.u(this);
    }

    public void J3(hp.c cVar) {
        this.f20651b.add(cVar.D1());
    }

    public void N3(int i15, Collection<b> collection) {
        this.f20651b.addAll(i15, collection);
    }

    @Override // bp.q
    public boolean O0() {
        return this.f20652c;
    }

    public void X3(Collection<b> collection) {
        this.f20651b.addAll(collection);
    }

    public void clear() {
        this.f20651b.clear();
    }

    public b g4(int i15) {
        return this.f20651b.get(i15);
    }

    public int getInt(int i15) {
        return h4(i15, -1);
    }

    public int h4(int i15, int i16) {
        if (i15 < size()) {
            b bVar = this.f20651b.get(i15);
            if (bVar instanceof k) {
                return ((k) bVar).J3();
            }
        }
        return i16;
    }

    public void i3(int i15, b bVar) {
        this.f20651b.add(i15, bVar);
    }

    public String i4(int i15) {
        return j4(i15, null);
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return this.f20651b.iterator();
    }

    public String j4(int i15, String str) {
        if (i15 < size()) {
            b bVar = this.f20651b.get(i15);
            if (bVar instanceof i) {
                return ((i) bVar).A3();
            }
        }
        return str;
    }

    public b k4(int i15) {
        b bVarX3 = this.f20651b.get(i15);
        if (bVarX3 instanceof l) {
            bVarX3 = ((l) bVarX3).X3();
        }
        if (bVarX3 instanceof j) {
            return null;
        }
        return bVarX3;
    }

    public int l4(b bVar) {
        for (int i15 = 0; i15 < size(); i15++) {
            b bVarG4 = g4(i15);
            if (bVarG4 == null) {
                if (bVarG4 == bVar) {
                    return i15;
                }
            } else {
                if (bVarG4.equals(bVar) || ((bVarG4 instanceof l) && ((l) bVarG4).X3().equals(bVar))) {
                    return i15;
                }
            }
        }
        return -1;
    }

    public b m4(int i15) {
        return this.f20651b.remove(i15);
    }

    public boolean n4(b bVar) {
        return this.f20651b.remove(bVar);
    }

    public boolean o4(b bVar) {
        boolean zN4 = n4(bVar);
        if (!zN4) {
            for (int i15 = 0; i15 < size(); i15++) {
                b bVarG4 = g4(i15);
                if ((bVarG4 instanceof l) && ((l) bVarG4).X3().equals(bVar)) {
                    return n4(bVarG4);
                }
            }
        }
        return zN4;
    }

    public void p4(int i15, b bVar) {
        this.f20651b.set(i15, bVar);
    }

    public void q4(float[] fArr) {
        clear();
        for (float f15 : fArr) {
            A3(new f(f15));
        }
    }

    public void r4(boolean z15) {
        this.f20652c = z15;
    }

    public float[] s4() {
        int size = size();
        float[] fArr = new float[size];
        for (int i15 = 0; i15 < size; i15++) {
            b bVarK4 = k4(i15);
            fArr[i15] = bVarK4 instanceof k ? ((k) bVarK4).i3() : 0.0f;
        }
        return fArr;
    }

    public int size() {
        return this.f20651b.size();
    }

    public List<? extends b> toList() {
        return new ArrayList(this.f20651b);
    }

    public String toString() {
        return "COSArray{" + this.f20651b + "}";
    }
}
