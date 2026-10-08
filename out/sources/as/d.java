package as;

import bs.b0;
import bs.q;
import fu.r;
import java.util.Set;
import js.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f14279a;

    public d(ClassLoader classLoader) {
        this.f14279a = classLoader;
    }

    @Override // js.u
    public Set<String> a(zs.c cVar) {
        return null;
    }

    @Override // js.u
    public qs.g b(u.a aVar) {
        zs.b bVarA = aVar.a();
        zs.c cVarF = bVarA.f();
        String strO = r.O(bVarA.g().a(), '.', '$', false, 4, null);
        if (!cVarF.c()) {
            strO = cVarF.a() + '.' + strO;
        }
        Class<?> clsA = e.a(this.f14279a, strO);
        if (clsA != null) {
            return new q(clsA);
        }
        return null;
    }

    @Override // js.u
    public qs.u c(zs.c cVar, boolean z15) {
        return new b0(cVar);
    }
}
