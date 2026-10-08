package hf;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements cf.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Executor> f84137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<jf.d> f84138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<x> f84139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.a<kf.b> f84140d;

    public w(nq.a<Executor> aVar, nq.a<jf.d> aVar2, nq.a<x> aVar3, nq.a<kf.b> aVar4) {
        this.f84137a = aVar;
        this.f84138b = aVar2;
        this.f84139c = aVar3;
        this.f84140d = aVar4;
    }

    public static w a(nq.a<Executor> aVar, nq.a<jf.d> aVar2, nq.a<x> aVar3, nq.a<kf.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, jf.d dVar, x xVar, kf.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f84137a.get(), this.f84138b.get(), this.f84139c.get(), this.f84140d.get());
    }
}
