package vr;

/* JADX INFO: loaded from: classes4.dex */
public enum f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f208036j = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f208037a;

    f(String str) {
        this.f208037a = str;
    }

    public final boolean e() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
