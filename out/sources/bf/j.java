package bf;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cf.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Context> f19107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<lf.a> f19108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<lf.a> f19109c;

    public j(nq.a<Context> aVar, nq.a<lf.a> aVar2, nq.a<lf.a> aVar3) {
        this.f19107a = aVar;
        this.f19108b = aVar2;
        this.f19109c = aVar3;
    }

    public static j a(nq.a<Context> aVar, nq.a<lf.a> aVar2, nq.a<lf.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, lf.a aVar, lf.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f19107a.get(), this.f19108b.get(), this.f19109c.get());
    }
}
