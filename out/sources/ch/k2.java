package ch;

/* JADX INFO: loaded from: classes3.dex */
final class k2 implements p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o2 f26001d;

    k2(int i15, o2 o2Var) {
        this.f26000c = i15;
        this.f26001d = o2Var;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return p2.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.f26000c == p2Var.zza() && this.f26001d.equals(p2Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f26000c ^ 14552422) + (this.f26001d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f26000c + "intEncoding=" + this.f26001d + ')';
    }

    @Override // ch.p2
    public final int zza() {
        return this.f26000c;
    }

    @Override // ch.p2
    public final o2 zzb() {
        return this.f26001d;
    }
}
