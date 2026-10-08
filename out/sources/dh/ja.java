package dh;

/* JADX INFO: loaded from: classes3.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f41945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private mc f41946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f41947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f41948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f41949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f41950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f41951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f41952k;

    public final ja b(String str) {
        this.f41942a = str;
        return this;
    }

    public final ja c(String str) {
        this.f41943b = str;
        return this;
    }

    public final ja d(Integer num) {
        this.f41951j = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final ja e(Boolean bool) {
        this.f41948g = bool;
        return this;
    }

    public final ja f(Boolean bool) {
        this.f41950i = bool;
        return this;
    }

    public final ja g(Boolean bool) {
        this.f41949h = bool;
        return this;
    }

    public final ja h(mc mcVar) {
        this.f41946e = mcVar;
        return this;
    }

    public final ja i(String str) {
        this.f41947f = str;
        return this;
    }

    public final ja j(String str) {
        this.f41944c = str;
        return this;
    }

    public final ja k(Integer num) {
        this.f41952k = num;
        return this;
    }

    public final ja l(String str) {
        this.f41945d = str;
        return this;
    }

    public final ma m() {
        return new ma(this, null);
    }
}
