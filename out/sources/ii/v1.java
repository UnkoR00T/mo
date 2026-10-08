package ii;

/* JADX INFO: loaded from: classes4.dex */
final class v1 extends e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f92824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92825c;

    v1() {
    }

    @Override // ii.e0.a
    public final Integer b() {
        Integer num = this.f92825c;
        if (num != null) {
            return num;
        }
        throw new IllegalStateException("Property \"nanos\" has not been set");
    }

    @Override // ii.e0.a
    public final Long c() {
        Long l15 = this.f92824b;
        if (l15 != null) {
            return l15;
        }
        throw new IllegalStateException("Property \"units\" has not been set");
    }

    @Override // ii.e0.a
    public final e0.a d(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null nanos");
        }
        this.f92825c = num;
        return this;
    }

    @Override // ii.e0.a
    public final e0.a e(Long l15) {
        if (l15 == null) {
            throw new NullPointerException("Null units");
        }
        this.f92824b = l15;
        return this;
    }

    @Override // ii.e0.a
    final e0 f() {
        Long l15;
        Integer num;
        String str = this.f92823a;
        if (str != null && (l15 = this.f92824b) != null && (num = this.f92825c) != null) {
            return new i5(str, l15, num);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92823a == null) {
            sb5.append(" currencyCode");
        }
        if (this.f92824b == null) {
            sb5.append(" units");
        }
        if (this.f92825c == null) {
            sb5.append(" nanos");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final e0.a g(String str) {
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.f92823a = str;
        return this;
    }
}
