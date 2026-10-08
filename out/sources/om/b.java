package om;

import bh.y;
import bh.z;
import java.util.EnumMap;
import java.util.Map;
import jg.r;
import pm.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f146735d = new EnumMap(qm.a.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f146736e = new EnumMap(qm.a.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f146737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qm.a f146738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f146739c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r.a(this.f146737a, bVar.f146737a) && r.a(this.f146738b, bVar.f146738b) && r.a(this.f146739c, bVar.f146739c);
    }

    public int hashCode() {
        return r.b(this.f146737a, this.f146738b, this.f146739c);
    }

    public String toString() {
        y yVarA = z.a("RemoteModel");
        yVarA.a("modelName", this.f146737a);
        yVarA.a("baseModel", this.f146738b);
        yVarA.a("modelType", this.f146739c);
        return yVarA.toString();
    }
}
