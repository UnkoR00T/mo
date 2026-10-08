package hf;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cf.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Context> f84122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<bf.e> f84123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<jf.d> f84124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.a<x> f84125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nq.a<Executor> f84126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nq.a<kf.b> f84127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nq.a<lf.a> f84128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nq.a<lf.a> f84129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nq.a<jf.c> f84130i;

    public s(nq.a<Context> aVar, nq.a<bf.e> aVar2, nq.a<jf.d> aVar3, nq.a<x> aVar4, nq.a<Executor> aVar5, nq.a<kf.b> aVar6, nq.a<lf.a> aVar7, nq.a<lf.a> aVar8, nq.a<jf.c> aVar9) {
        this.f84122a = aVar;
        this.f84123b = aVar2;
        this.f84124c = aVar3;
        this.f84125d = aVar4;
        this.f84126e = aVar5;
        this.f84127f = aVar6;
        this.f84128g = aVar7;
        this.f84129h = aVar8;
        this.f84130i = aVar9;
    }

    public static s a(nq.a<Context> aVar, nq.a<bf.e> aVar2, nq.a<jf.d> aVar3, nq.a<x> aVar4, nq.a<Executor> aVar5, nq.a<kf.b> aVar6, nq.a<lf.a> aVar7, nq.a<lf.a> aVar8, nq.a<jf.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, bf.e eVar, jf.d dVar, x xVar, Executor executor, kf.b bVar, lf.a aVar, lf.a aVar2, jf.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f84122a.get(), this.f84123b.get(), this.f84124c.get(), this.f84125d.get(), this.f84126e.get(), this.f84127f.get(), this.f84128g.get(), this.f84129h.get(), this.f84130i.get());
    }
}
