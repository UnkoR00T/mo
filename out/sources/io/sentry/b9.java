package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f94683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f94684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Double f94685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f94686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f94687e;

    public b9(Boolean bool) {
        this(bool, null);
    }

    public Double a() {
        return this.f94687e;
    }

    public Boolean b() {
        return this.f94686d;
    }

    public Double c() {
        return this.f94685c;
    }

    public Double d() {
        return this.f94684b;
    }

    public Boolean e() {
        return this.f94683a;
    }

    public b9(Boolean bool, Double d15) {
        this(bool, d15, null, Boolean.FALSE, null);
    }

    public b9(Boolean bool, Double d15, Double d16) {
        this(bool, d15, d16, Boolean.FALSE, null);
    }

    public b9(Boolean bool, Double d15, Boolean bool2, Double d16) {
        this(bool, d15, null, bool2, d16);
    }

    public b9(Boolean bool, Double d15, Double d16, Boolean bool2, Double d17) {
        this.f94683a = bool;
        this.f94684b = d15;
        this.f94685c = d16;
        this.f94686d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f94687e = d17;
    }
}
