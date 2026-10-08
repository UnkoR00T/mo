package eh;

/* JADX INFO: loaded from: classes3.dex */
final class r1 implements w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v1 f50993d;

    r1(int i15, v1 v1Var) {
        this.f50992c = i15;
        this.f50993d = v1Var;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return w1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f50992c == w1Var.zza() && this.f50993d.equals(w1Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f50992c ^ 14552422) + (this.f50993d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f50992c + "intEncoding=" + this.f50993d + ')';
    }

    @Override // eh.w1
    public final int zza() {
        return this.f50992c;
    }

    @Override // eh.w1
    public final v1 zzb() {
        return this.f50993d;
    }
}
