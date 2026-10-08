package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd f63487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f63488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f63489c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f63490d = null;

    /* synthetic */ rd(od odVar, qd qdVar) {
        this.f63487a = odVar.f63430a;
        this.f63488b = odVar.f63431b;
    }

    @z1(zza = 1)
    public final pd a() {
        return this.f63487a;
    }

    @z1(zza = 2)
    public final Integer b() {
        return this.f63488b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return jg.r.a(this.f63487a, rdVar.f63487a) && jg.r.a(this.f63488b, rdVar.f63488b) && jg.r.a(null, null) && jg.r.a(null, null);
    }

    public final int hashCode() {
        return jg.r.b(this.f63487a, this.f63488b, null, null);
    }
}
