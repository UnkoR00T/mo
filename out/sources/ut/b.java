package ut;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ wq.a f201252k = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f201253a;

    b(String str) {
        this.f201253a = str;
    }

    public final String e() {
        return this.f201253a;
    }
}
