package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i1 f26465a;

    /* synthetic */ wj(uj ujVar, vj vjVar) {
        this.f26465a = ujVar.f26406a;
    }

    @p2(zza = 1)
    public final i1 a() {
        return this.f26465a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wj) {
            return jg.r.a(this.f26465a, ((wj) obj).f26465a);
        }
        return false;
    }

    public final int hashCode() {
        return jg.r.b(this.f26465a);
    }
}
