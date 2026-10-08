package bf;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cf.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Context> f19115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<i> f19116b;

    public l(nq.a<Context> aVar, nq.a<i> aVar2) {
        this.f19115a = aVar;
        this.f19116b = aVar2;
    }

    public static l a(nq.a<Context> aVar, nq.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f19115a.get(), this.f19116b.get());
    }
}
