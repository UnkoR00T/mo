package af;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class t implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile u f6151e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lf.a f6152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lf.a f6153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gf.e f6154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hf.r f6155d;

    t(lf.a aVar, lf.a aVar2, gf.e eVar, hf.r rVar, hf.v vVar) {
        this.f6152a = aVar;
        this.f6153b = aVar2;
        this.f6154c = eVar;
        this.f6155d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        i.a aVarG = i.a().i(this.f6152a.a()).l(this.f6153b.a()).k(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a());
        if (nVar.c().d() != null && nVar.c().d().a() != null) {
            aVarG.j(nVar.c().d().a());
        }
        return aVarG.d();
    }

    public static t c() {
        u uVar = f6151e;
        if (uVar != null) {
            return uVar.h();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<ye.c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(ye.c.b("proto"));
    }

    public static void f(Context context) {
        if (f6151e == null) {
            synchronized (t.class) {
                try {
                    if (f6151e == null) {
                        f6151e = e.a().a(context).build();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // af.s
    public void a(n nVar, ye.j jVar) {
        this.f6154c.a(nVar.f().f(nVar.c().c()), b(nVar), jVar);
    }

    public hf.r e() {
        return this.f6155d;
    }

    public ye.i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }

    @Deprecated
    public ye.i h(String str) {
        return new p(d(null), o.a().b(str).a(), this);
    }
}
