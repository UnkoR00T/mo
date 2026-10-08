package j5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<c> f99444f;

    public b(char[] cArr) {
        super(cArr);
        this.f99444f = new ArrayList<>();
    }

    public a A(String str) throws h {
        c cVarZ = z(str);
        if (cVarZ instanceof a) {
            return (a) cVarZ;
        }
        throw new h("no array found for key <" + str + ">, found [" + cVarZ.n() + "] : " + cVarZ, this);
    }

    public a F(String str) {
        c cVarX = X(str);
        if (cVarX instanceof a) {
            return (a) cVarX;
        }
        return null;
    }

    public float G(int i15) throws h {
        c cVarX = x(i15);
        if (cVarX != null) {
            return cVarX.i();
        }
        throw new h("no float at index " + i15, this);
    }

    public float P(String str) throws h {
        c cVarZ = z(str);
        if (cVarZ != null) {
            return cVarZ.i();
        }
        throw new h("no float found for key <" + str + ">, found [" + cVarZ.n() + "] : " + cVarZ, this);
    }

    public float Q(String str) {
        c cVarX = X(str);
        if (cVarX instanceof e) {
            return cVarX.i();
        }
        return Float.NaN;
    }

    public int R(int i15) throws h {
        c cVarX = x(i15);
        if (cVarX != null) {
            return cVarX.j();
        }
        throw new h("no int at index " + i15, this);
    }

    public int S(String str) throws h {
        c cVarZ = z(str);
        if (cVarZ != null) {
            return cVarZ.j();
        }
        throw new h("no int found for key <" + str + ">, found [" + cVarZ.n() + "] : " + cVarZ, this);
    }

    public f T(String str) throws h {
        c cVarZ = z(str);
        if (cVarZ instanceof f) {
            return (f) cVarZ;
        }
        throw new h("no object found for key <" + str + ">, found [" + cVarZ.n() + "] : " + cVarZ, this);
    }

    public f U(String str) {
        c cVarX = X(str);
        if (cVarX instanceof f) {
            return (f) cVarX;
        }
        return null;
    }

    public c W(int i15) {
        if (i15 < 0 || i15 >= this.f99444f.size()) {
            return null;
        }
        return this.f99444f.get(i15);
    }

    public c X(String str) {
        Iterator<c> it = this.f99444f.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.g().equals(str)) {
                return dVar.p0();
            }
        }
        return null;
    }

    public String Y(int i15) throws h {
        c cVarX = x(i15);
        if (cVarX instanceof i) {
            return cVarX.g();
        }
        throw new h("no string at index " + i15, this);
    }

    public void clear() {
        this.f99444f.clear();
    }

    public String e0(String str) throws h {
        c cVarZ = z(str);
        if (cVarZ instanceof i) {
            return cVarZ.g();
        }
        throw new h("no string found for key <" + str + ">, found [" + (cVarZ != null ? cVarZ.n() : null) + "] : " + cVarZ, this);
    }

    @Override // j5.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f99444f.equals(((b) obj).f99444f);
        }
        return false;
    }

    public String f0(int i15) {
        c cVarW = W(i15);
        if (cVarW instanceof i) {
            return cVarW.g();
        }
        return null;
    }

    public String g0(String str) {
        c cVarX = X(str);
        if (cVarX instanceof i) {
            return cVarX.g();
        }
        return null;
    }

    public boolean h0(String str) {
        for (c cVar : this.f99444f) {
            if ((cVar instanceof d) && ((d) cVar).g().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // j5.c
    public int hashCode() {
        return Objects.hash(this.f99444f, Integer.valueOf(super.hashCode()));
    }

    public ArrayList<String> i0() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (c cVar : this.f99444f) {
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).g());
            }
        }
        return arrayList;
    }

    public void j0(String str, c cVar) {
        Iterator<c> it = this.f99444f.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.g().equals(str)) {
                dVar.q0(cVar);
                return;
            }
        }
        this.f99444f.add((d) d.m0(str, cVar));
    }

    public void k0(String str, float f15) {
        j0(str, new e(f15));
    }

    public void l0(String str, String str2) {
        i iVar = new i(str2.toCharArray());
        iVar.t(0L);
        iVar.s(str2.length() - 1);
        j0(str, iVar);
    }

    public int size() {
        return this.f99444f.size();
    }

    @Override // j5.c
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        for (c cVar : this.f99444f) {
            if (sb5.length() > 0) {
                sb5.append("; ");
            }
            sb5.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb5) + " >";
    }

    public void v(c cVar) {
        this.f99444f.add(cVar);
        if (g.f99454a) {
            System.out.println("added element " + cVar + " to " + this);
        }
    }

    @Override // j5.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public b clone() {
        b bVar = (b) super.clone();
        ArrayList<c> arrayList = new ArrayList<>(this.f99444f.size());
        Iterator<c> it = this.f99444f.iterator();
        while (it.hasNext()) {
            c cVarClone = it.next().clone();
            cVarClone.q(bVar);
            arrayList.add(cVarClone);
        }
        bVar.f99444f = arrayList;
        return bVar;
    }

    public c x(int i15) throws h {
        if (i15 >= 0 && i15 < this.f99444f.size()) {
            return this.f99444f.get(i15);
        }
        throw new h("no element at index " + i15, this);
    }

    public c z(String str) throws h {
        Iterator<c> it = this.f99444f.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.g().equals(str)) {
                return dVar.p0();
            }
        }
        throw new h("no element for key <" + str + ">", this);
    }
}
