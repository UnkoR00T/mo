package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f25975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xe f25976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f25977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f25978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f25979e;

    public final je a(Boolean bool) {
        this.f25978d = bool;
        return this;
    }

    public final je b(Boolean bool) {
        this.f25979e = bool;
        return this;
    }

    public final je c(Long l15) {
        this.f25975a = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final je d(xe xeVar) {
        this.f25976b = xeVar;
        return this;
    }

    public final je e(Boolean bool) {
        this.f25977c = bool;
        return this;
    }

    public final le f() {
        return new le(this, null);
    }
}
