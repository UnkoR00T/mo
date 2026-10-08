package be;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
final class d implements zd.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.f f18649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.f f18650c;

    d(zd.f fVar, zd.f fVar2) {
        this.f18649b = fVar;
        this.f18650c = fVar2;
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        this.f18649b.b(messageDigest);
        this.f18650c.b(messageDigest);
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f18649b.equals(dVar.f18649b) && this.f18650c.equals(dVar.f18650c)) {
                return true;
            }
        }
        return false;
    }

    @Override // zd.f
    public int hashCode() {
        return (this.f18649b.hashCode() * 31) + this.f18650c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f18649b + ", signature=" + this.f18650c + '}';
    }
}
