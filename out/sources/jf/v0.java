package jf;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements cf.b<u0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Context> f102378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<String> f102379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<Integer> f102380c;

    public v0(nq.a<Context> aVar, nq.a<String> aVar2, nq.a<Integer> aVar3) {
        this.f102378a = aVar;
        this.f102379b = aVar2;
        this.f102380c = aVar3;
    }

    public static v0 a(nq.a<Context> aVar, nq.a<String> aVar2, nq.a<Integer> aVar3) {
        return new v0(aVar, aVar2, aVar3);
    }

    public static u0 c(Context context, String str, int i15) {
        return new u0(context, str, i15);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u0 get() {
        return c(this.f102378a.get(), this.f102379b.get(), this.f102380c.get().intValue());
    }
}
