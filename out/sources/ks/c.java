package ks;

import fr.h0;
import fr.q0;
import java.util.Collection;
import java.util.Map;
import pq.v;
import pq.v0;
import st.e1;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public class c implements ls.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f112305f = {q0.j(new h0(c.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.c f112306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h1 f112307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.i f112308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qs.b f112309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f112310e;

    public c(ms.k kVar, qs.a aVar, zs.c cVar) {
        Collection<qs.b> collectionE;
        h1 h1VarA;
        this.f112306a = cVar;
        this.f112307b = (aVar == null || (h1VarA = kVar.a().t().a(aVar)) == null) ? h1.f208052a : h1VarA;
        this.f112308c = kVar.e().d(new b(kVar, this));
        this.f112309d = (aVar == null || (collectionE = aVar.e()) == null) ? null : (qs.b) v.m0(collectionE);
        boolean z15 = false;
        if (aVar != null && aVar.j()) {
            z15 = true;
        }
        this.f112310e = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 e(ms.k kVar, c cVar) {
        return kVar.d().i().p(cVar.g()).t();
    }

    @Override // wr.c
    public Map<zs.f, ft.g<?>> a() {
        return v0.i();
    }

    protected final qs.b c() {
        return this.f112309d;
    }

    @Override // wr.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e1 getType() {
        return (e1) rt.m.a(this.f112308c, this, f112305f[0]);
    }

    @Override // wr.c
    public zs.c g() {
        return this.f112306a;
    }

    @Override // ls.g
    public boolean j() {
        return this.f112310e;
    }

    @Override // wr.c
    public h1 m() {
        return this.f112307b;
    }
}
