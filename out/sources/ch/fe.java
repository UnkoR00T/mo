package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final de f25877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f25878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f25879c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f25880d = null;

    /* synthetic */ fe(ce ceVar, ee eeVar) {
        this.f25877a = ceVar.f25820a;
        this.f25878b = ceVar.f25821b;
    }

    @p2(zza = 1)
    public final de a() {
        return this.f25877a;
    }

    @p2(zza = 2)
    public final Integer b() {
        return this.f25878b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return jg.r.a(this.f25877a, feVar.f25877a) && jg.r.a(this.f25878b, feVar.f25878b) && jg.r.a(null, null) && jg.r.a(null, null);
    }

    public final int hashCode() {
        return jg.r.b(this.f25877a, this.f25878b, null, null);
    }
}
