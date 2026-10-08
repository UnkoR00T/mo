package wr;

/* JADX INFO: loaded from: classes4.dex */
public enum e {
    ALL(null, 1, null),
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ wq.a f214534n = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f214535a;

    e(String str) {
        this.f214535a = str == null ? au.a.f(name()) : str;
    }

    public final String e() {
        return this.f214535a;
    }

    /* synthetic */ e(String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str);
    }
}
