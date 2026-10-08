package bp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class d extends b implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Map<i, b> f20660c = new xp.f();

    private static String s4(b bVar, List<b> list) throws IOException {
        if (bVar == null) {
            return "null";
        }
        if (list.contains(bVar)) {
            return String.valueOf(bVar.hashCode());
        }
        list.add(bVar);
        if (!(bVar instanceof d)) {
            if (bVar instanceof a) {
                StringBuilder sb5 = new StringBuilder("COSArray{");
                Iterator<b> it = ((a) bVar).iterator();
                while (it.hasNext()) {
                    sb5.append(s4(it.next(), list));
                    sb5.append(";");
                }
                sb5.append("}");
                return sb5.toString();
            }
            if (!(bVar instanceof l)) {
                return bVar.toString();
            }
            return "COSObject{" + s4(((l) bVar).X3(), list) + "}";
        }
        StringBuilder sb6 = new StringBuilder("COSDictionary{");
        for (Map.Entry<i, b> entry : ((d) bVar).entrySet()) {
            sb6.append(entry.getKey());
            sb6.append(":");
            sb6.append(s4(entry.getValue(), list));
            sb6.append(";");
        }
        sb6.append("}");
        if (bVar instanceof o) {
            InputStream inputStreamP5 = ((o) bVar).p5();
            byte[] bArrE = dp.a.e(inputStreamP5);
            sb6.append("COSStream{");
            sb6.append(Arrays.hashCode(bArrE));
            sb6.append("}");
            inputStreamP5.close();
        }
        return sb6.toString();
    }

    public d A3() {
        return new t(this);
    }

    public int A4(i iVar, i iVar2, int i15) {
        b bVarQ4 = q4(iVar, iVar2);
        return bVarQ4 instanceof k ? ((k) bVarQ4).J3() : i15;
    }

    public int B4(String str, int i15) {
        return y4(i.J3(str), i15);
    }

    public b C4(i iVar) {
        return this.f20660c.get(iVar);
    }

    public b D4(i iVar, i iVar2) {
        b bVarC4 = C4(iVar);
        return (bVarC4 != null || iVar2 == null) ? bVarC4 : C4(iVar2);
    }

    public i E4(Object obj) {
        for (Map.Entry<i, b> entry : this.f20660c.entrySet()) {
            b value = entry.getValue();
            if (value.equals(obj) || ((value instanceof l) && ((l) value).X3().equals(obj))) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.b(this);
    }

    public long F4(i iVar) {
        return G4(iVar, -1L);
    }

    public long G4(i iVar, long j15) {
        b bVarP4 = p4(iVar);
        return bVarP4 instanceof k ? ((k) bVarP4).X3() : j15;
    }

    public String H4(i iVar) {
        b bVarP4 = p4(iVar);
        if (bVarP4 instanceof i) {
            return ((i) bVarP4).A3();
        }
        if (bVarP4 instanceof p) {
            return ((p) bVarP4).J3();
        }
        return null;
    }

    public String I4(i iVar, String str) {
        String strH4 = H4(iVar);
        return strH4 == null ? str : strH4;
    }

    public boolean J3(i iVar) {
        return this.f20660c.containsKey(iVar);
    }

    public String J4(String str) {
        return H4(i.J3(str));
    }

    public String K4(String str, String str2) {
        return I4(i.J3(str), str2);
    }

    public String L4(i iVar) {
        b bVarP4 = p4(iVar);
        if (bVarP4 instanceof p) {
            return ((p) bVarP4).J3();
        }
        return null;
    }

    public String M4(String str) {
        return L4(i.J3(str));
    }

    public boolean N3(String str) {
        return J3(i.J3(str));
    }

    public Collection<b> N4() {
        return this.f20660c.values();
    }

    @Override // bp.q
    public boolean O0() {
        return this.f20659b;
    }

    public Set<i> O4() {
        return this.f20660c.keySet();
    }

    public void P4(i iVar) {
        this.f20660c.remove(iVar);
    }

    public void Q4(i iVar, boolean z15) {
        Y4(iVar, c.i3(z15));
    }

    public void R4(String str, boolean z15) {
        Y4(i.J3(str), c.i3(z15));
    }

    public void S4(i iVar, Calendar calendar) {
        g5(iVar, xp.b.c(calendar));
    }

    public void T4(i iVar, int i15, boolean z15) {
        int iY4 = y4(iVar, 0);
        W4(iVar, z15 ? i15 | iY4 : (~i15) & iY4);
    }

    public void U4(i iVar, float f15) {
        Y4(iVar, new f(f15));
    }

    public void V4(String str, float f15) {
        U4(i.J3(str), f15);
    }

    public void W4(i iVar, int i15) {
        Y4(iVar, h.g4(i15));
    }

    public boolean X3(Object obj) {
        boolean zContainsValue = this.f20660c.containsValue(obj);
        return (zContainsValue || !(obj instanceof l)) ? zContainsValue : this.f20660c.containsValue(((l) obj).X3());
    }

    public void X4(String str, int i15) {
        W4(i.J3(str), i15);
    }

    public void Y4(i iVar, b bVar) {
        if (bVar == null) {
            P4(iVar);
            return;
        }
        Map<i, b> map = this.f20660c;
        if ((map instanceof xp.f) && map.size() >= 1000) {
            this.f20660c = new LinkedHashMap(this.f20660c);
        }
        this.f20660c.put(iVar, bVar);
    }

    public void Z4(i iVar, hp.c cVar) {
        Y4(iVar, cVar != null ? cVar.D1() : null);
    }

    public void a5(String str, b bVar) {
        Y4(i.J3(str), bVar);
    }

    public void b5(String str, hp.c cVar) {
        Z4(i.J3(str), cVar);
    }

    public void c5(i iVar, long j15) {
        Y4(iVar, h.g4(j15));
    }

    public void clear() {
        this.f20660c.clear();
    }

    public void d5(i iVar, String str) {
        Y4(iVar, str != null ? i.J3(str) : null);
    }

    public void e5(String str, String str2) {
        d5(i.J3(str), str2);
    }

    public Set<Map.Entry<i, b>> entrySet() {
        return this.f20660c.entrySet();
    }

    public void f5(boolean z15) {
        this.f20659b = z15;
    }

    public boolean g4(i iVar, i iVar2, boolean z15) {
        b bVarQ4 = q4(iVar, iVar2);
        if (bVarQ4 instanceof c) {
            return bVarQ4 == c.f20656e;
        }
        return z15;
    }

    public void g5(i iVar, String str) {
        Y4(iVar, str != null ? new p(str) : null);
    }

    public boolean h4(i iVar, boolean z15) {
        return g4(iVar, null, z15);
    }

    public void h5(String str, String str2) {
        g5(i.J3(str), str2);
    }

    public void i3(d dVar) {
        Map<i, b> map = this.f20660c;
        if ((map instanceof xp.f) && map.size() + dVar.f20660c.size() >= 1000) {
            this.f20660c = new LinkedHashMap(this.f20660c);
        }
        this.f20660c.putAll(dVar.f20660c);
    }

    public boolean i4(String str, boolean z15) {
        return h4(i.J3(str), z15);
    }

    public a j4(i iVar) {
        b bVarP4 = p4(iVar);
        if (bVarP4 instanceof a) {
            return (a) bVarP4;
        }
        return null;
    }

    public d k4(i iVar) {
        b bVarP4 = p4(iVar);
        if (bVarP4 instanceof d) {
            return (d) bVarP4;
        }
        return null;
    }

    public i l4(i iVar) {
        b bVarP4 = p4(iVar);
        if (bVarP4 instanceof i) {
            return (i) bVarP4;
        }
        return null;
    }

    public i m4(i iVar, i iVar2) {
        b bVarP4 = p4(iVar);
        return bVarP4 instanceof i ? (i) bVarP4 : iVar2;
    }

    public l n4(i iVar) {
        b bVarC4 = C4(iVar);
        if (bVarC4 instanceof l) {
            return (l) bVarC4;
        }
        return null;
    }

    public o o4(i iVar) {
        b bVarP4 = p4(iVar);
        if (bVarP4 instanceof o) {
            return (o) bVarP4;
        }
        return null;
    }

    public b p4(i iVar) {
        b bVarX3 = this.f20660c.get(iVar);
        if (bVarX3 instanceof l) {
            bVarX3 = ((l) bVarX3).X3();
        }
        if (bVarX3 instanceof j) {
            return null;
        }
        return bVarX3;
    }

    public b q4(i iVar, i iVar2) {
        b bVarP4 = p4(iVar);
        return (bVarP4 != null || iVar2 == null) ? bVarP4 : p4(iVar2);
    }

    public b r4(String str) {
        return p4(i.J3(str));
    }

    public int size() {
        return this.f20660c.size();
    }

    public boolean t4(i iVar, int i15) {
        return (y4(iVar, 0) & i15) == i15;
    }

    public String toString() {
        try {
            return s4(this, new ArrayList());
        } catch (IOException e15) {
            return "COSDictionary{" + e15.getMessage() + "}";
        }
    }

    public float u4(i iVar, float f15) {
        b bVarP4 = p4(iVar);
        return bVarP4 instanceof k ? ((k) bVarP4).i3() : f15;
    }

    public float v4(String str) {
        return u4(i.J3(str), -1.0f);
    }

    public float w4(String str, float f15) {
        return u4(i.J3(str), f15);
    }

    public int x4(i iVar) {
        return y4(iVar, -1);
    }

    public int y4(i iVar, int i15) {
        return A4(iVar, null, i15);
    }

    public int z4(i iVar, i iVar2) {
        return A4(iVar, iVar2, -1);
    }
}
