package j5;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ArrayList<String> f99450g;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f99450g = arrayList;
        arrayList.add("ConstraintSets");
        f99450g.add("Variables");
        f99450g.add("Generate");
        f99450g.add("Transitions");
        f99450g.add("KeyFrames");
        f99450g.add("KeyAttributes");
        f99450g.add("KeyPositions");
        f99450g.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c m0(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.t(0L);
        dVar.s(str.length() - 1);
        dVar.q0(cVar);
        return dVar;
    }

    @Override // j5.b, j5.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || Objects.equals(o0(), ((d) obj).o0())) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // j5.b, j5.c
    public int hashCode() {
        return super.hashCode();
    }

    public String o0() {
        return g();
    }

    public c p0() {
        if (this.f99444f.size() > 0) {
            return this.f99444f.get(0);
        }
        return null;
    }

    public void q0(c cVar) {
        if (this.f99444f.size() > 0) {
            this.f99444f.set(0, cVar);
        } else {
            this.f99444f.add(cVar);
        }
    }
}
