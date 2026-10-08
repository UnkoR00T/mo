package fh;

/* JADX INFO: loaded from: classes3.dex */
final class u1 implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y1 f63553d;

    u1(int i15, y1 y1Var) {
        this.f63552c = i15;
        this.f63553d = y1Var;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return z1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f63552c == z1Var.zza() && this.f63553d.equals(z1Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f63552c ^ 14552422) + (this.f63553d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f63552c + "intEncoding=" + this.f63553d + ')';
    }

    @Override // fh.z1
    public final int zza() {
        return this.f63552c;
    }

    @Override // fh.z1
    public final y1 zzb() {
        return this.f63553d;
    }
}
