package dh;

/* JADX INFO: loaded from: classes3.dex */
final class e implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f41658d;

    e(int i15, i iVar) {
        this.f41657c = i15;
        this.f41658d = iVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f41657c == jVar.zza() && this.f41658d.equals(jVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f41657c ^ 14552422) + (this.f41658d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f41657c + "intEncoding=" + this.f41658d + ')';
    }

    @Override // dh.j
    public final int zza() {
        return this.f41657c;
    }

    @Override // dh.j
    public final i zzb() {
        return this.f41658d;
    }
}
