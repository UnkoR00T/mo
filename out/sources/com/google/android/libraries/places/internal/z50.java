package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class z50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a60 f34467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f34468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s60 f34469d;

    public final z50 a(String str) {
        this.f34466a = str;
        return this;
    }

    public final z50 b(long j15) {
        this.f34468c = Long.valueOf(j15);
        return this;
    }

    public final z50 c(a60 a60Var) {
        this.f34467b = a60Var;
        return this;
    }

    public final z50 d(s60 s60Var) {
        this.f34469d = s60Var;
        return this;
    }

    public final b60 e() {
        zj.p.r(this.f34466a, "description");
        zj.p.r(this.f34467b, "severity");
        zj.p.r(this.f34468c, "timestampNanos");
        zj.p.x(true, "at least one of channelRef and subchannelRef must be null");
        return new b60(this.f34466a, this.f34467b, this.f34468c.longValue(), null, this.f34469d, null);
    }
}
