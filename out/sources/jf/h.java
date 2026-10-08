package jf;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cf.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<Context> f102326a;

    public h(nq.a<Context> aVar) {
        this.f102326a = aVar;
    }

    public static h a(nq.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) cf.d.d(f.b(context));
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f102326a.get());
    }
}
