package js;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f104625j = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f104626a;

    c(String str) {
        this.f104626a = str;
    }

    public final String e() {
        return this.f104626a;
    }
}
