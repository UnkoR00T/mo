package d8;

import ak.h2;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40299a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t7.s.f f40300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f40301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y7.f.a f40302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f40303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k8.j f40304f;

    private u b(t7.s.f fVar) {
        y7.f.a aVarC = this.f40302d;
        if (aVarC == null) {
            aVarC = new y7.l.b().c(this.f40303e);
        }
        Uri uri = fVar.f188487c;
        g0 g0Var = new g0(uri == null ? null : uri.toString(), fVar.f188492h, aVarC);
        h2<Map.Entry<String, String>> it = fVar.f188489e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            g0Var.c(next.getKey(), next.getValue());
        }
        h.b bVarE = new h.b().f(fVar.f188485a, f0.f40199d).c(fVar.f188490f).d(fVar.f188491g).e(ek.g.n(fVar.f188494j));
        k8.j jVar = this.f40304f;
        if (jVar != null) {
            bVarE.b(jVar);
        }
        h hVarA = bVarE.a(g0Var);
        hVarA.G(0, fVar.c());
        return hVarA;
    }

    @Override // d8.w
    public u a(t7.s sVar) {
        u uVar;
        zj.p.q(sVar.f188433b);
        t7.s.f fVar = sVar.f188433b.f188530c;
        if (fVar == null) {
            return u.f40327a;
        }
        synchronized (this.f40299a) {
            try {
                if (!fVar.equals(this.f40300b)) {
                    this.f40300b = fVar;
                    this.f40301c = b(fVar);
                }
                uVar = (u) zj.p.q(this.f40301c);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return uVar;
    }
}
