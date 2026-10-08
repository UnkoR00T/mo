package gf;

import android.content.Context;
import hf.x;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cf.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Context> f72514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<jf.d> f72515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<hf.f> f72516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.a<lf.a> f72517d;

    public i(nq.a<Context> aVar, nq.a<jf.d> aVar2, nq.a<hf.f> aVar3, nq.a<lf.a> aVar4) {
        this.f72514a = aVar;
        this.f72515b = aVar2;
        this.f72516c = aVar3;
        this.f72517d = aVar4;
    }

    public static i a(nq.a<Context> aVar, nq.a<jf.d> aVar2, nq.a<hf.f> aVar3, nq.a<lf.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, jf.d dVar, hf.f fVar, lf.a aVar) {
        return (x) cf.d.d(h.a(context, dVar, fVar, aVar));
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f72514a.get(), this.f72515b.get(), this.f72516c.get(), this.f72517d.get());
    }
}
