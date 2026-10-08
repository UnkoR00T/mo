package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p0 f50555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f50557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f50558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f50559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f50560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f50561k;

    public final fc b(String str) {
        this.f50551a = str;
        return this;
    }

    public final fc c(String str) {
        this.f50552b = str;
        return this;
    }

    public final fc d(Integer num) {
        this.f50560j = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final fc e(Boolean bool) {
        this.f50557g = bool;
        return this;
    }

    public final fc f(Boolean bool) {
        this.f50559i = bool;
        return this;
    }

    public final fc g(Boolean bool) {
        this.f50558h = bool;
        return this;
    }

    public final fc h(p0 p0Var) {
        this.f50555e = p0Var;
        return this;
    }

    public final fc i(String str) {
        this.f50556f = str;
        return this;
    }

    public final fc j(String str) {
        this.f50553c = str;
        return this;
    }

    public final fc k(Integer num) {
        this.f50561k = num;
        return this;
    }

    public final fc l(String str) {
        this.f50554d = str;
        return this;
    }

    public final hc m() {
        return new hc(this, null);
    }
}
