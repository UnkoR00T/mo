package jf;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cf.b<Integer> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f102327a = new i();
    }

    public static i a() {
        return a.f102327a;
    }

    public static int c() {
        return f.c();
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
