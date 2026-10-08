package tg;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f190053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f190054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f190055c;

    /* JADX INFO: renamed from: tg.a$a, reason: collision with other inner class name */
    @Deprecated
    public static class C4952a extends a<Boolean> {
        public C4952a(int i15, String str, Boolean bool) {
            super(i15, str, bool);
        }
    }

    private a(int i15, String str, T t15) {
        this.f190053a = i15;
        this.f190054b = str;
        this.f190055c = t15;
        c.a().a(this);
    }

    @Deprecated
    public static C4952a a(int i15, String str, Boolean bool) {
        return new C4952a(i15, str, bool);
    }
}
