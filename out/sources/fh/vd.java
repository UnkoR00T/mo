package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f63590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ie f63591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f63592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f63593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f63594e;

    public final vd a(Boolean bool) {
        this.f63593d = bool;
        return this;
    }

    public final vd b(Boolean bool) {
        this.f63594e = bool;
        return this;
    }

    public final vd c(Long l15) {
        this.f63590a = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final vd d(ie ieVar) {
        this.f63591b = ieVar;
        return this;
    }

    public final vd e(Boolean bool) {
        this.f63592c = bool;
        return this;
    }

    public final xd f() {
        return new xd(this, null);
    }
}
