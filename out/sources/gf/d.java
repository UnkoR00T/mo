package gf;

import hf.x;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cf.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Executor> f72508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<bf.e> f72509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<x> f72510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.a<jf.d> f72511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nq.a<kf.b> f72512e;

    public d(nq.a<Executor> aVar, nq.a<bf.e> aVar2, nq.a<x> aVar3, nq.a<jf.d> aVar4, nq.a<kf.b> aVar5) {
        this.f72508a = aVar;
        this.f72509b = aVar2;
        this.f72510c = aVar3;
        this.f72511d = aVar4;
        this.f72512e = aVar5;
    }

    public static d a(nq.a<Executor> aVar, nq.a<bf.e> aVar2, nq.a<x> aVar3, nq.a<jf.d> aVar4, nq.a<kf.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, bf.e eVar, x xVar, jf.d dVar, kf.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f72508a.get(), this.f72509b.get(), this.f72510c.get(), this.f72511d.get(), this.f72512e.get());
    }
}
