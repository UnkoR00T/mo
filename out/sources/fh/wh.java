package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uh f63690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f63691b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f63692c = null;

    /* synthetic */ wh(th thVar, vh vhVar) {
        this.f63690a = thVar.f63543a;
    }

    @z1(zza = 3)
    public final uh a() {
        return this.f63690a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof wh) && jg.r.a(this.f63690a, ((wh) obj).f63690a) && jg.r.a(null, null) && jg.r.a(null, null);
    }

    public final int hashCode() {
        return jg.r.b(this.f63690a, null, null);
    }
}
