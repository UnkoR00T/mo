package js;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f104643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f104644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<zs.c, p0> f104645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oq.k f104646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f104647e;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(p0 p0Var, p0 p0Var2, Map<zs.c, ? extends p0> map) {
        this.f104643a = p0Var;
        this.f104644b = p0Var2;
        this.f104645c = map;
        this.f104646d = oq.l.a(new g0(this));
        p0 p0Var3 = p0.IGNORE;
        this.f104647e = p0Var == p0Var3 && p0Var2 == p0Var3 && map.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(h0 h0Var) {
        List listC = pq.v.c();
        listC.add(h0Var.f104643a.e());
        p0 p0Var = h0Var.f104644b;
        if (p0Var != null) {
            listC.add("under-migration:" + p0Var.e());
        }
        for (Map.Entry<zs.c, p0> entry : h0Var.f104645c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + entry.getValue().e());
        }
        return (String[]) pq.v.a(listC).toArray(new String[0]);
    }

    public final p0 c() {
        return this.f104643a;
    }

    public final p0 d() {
        return this.f104644b;
    }

    public final Map<zs.c, p0> e() {
        return this.f104645c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f104643a == h0Var.f104643a && this.f104644b == h0Var.f104644b && fr.t.c(this.f104645c, h0Var.f104645c);
    }

    public final boolean f() {
        return this.f104647e;
    }

    public int hashCode() {
        int iHashCode = this.f104643a.hashCode() * 31;
        p0 p0Var = this.f104644b;
        return ((iHashCode + (p0Var == null ? 0 : p0Var.hashCode())) * 31) + this.f104645c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f104643a + ", migrationLevel=" + this.f104644b + ", userDefinedLevelForSpecificAnnotation=" + this.f104645c + ')';
    }

    public /* synthetic */ h0(p0 p0Var, p0 p0Var2, Map map, int i15, fr.k kVar) {
        this(p0Var, (i15 & 2) != 0 ? null : p0Var2, (i15 & 4) != 0 ? pq.v0.i() : map);
    }
}
