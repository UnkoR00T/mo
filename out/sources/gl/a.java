package gl;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f73517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f73518b = d.a.DEFAULT;

    /* JADX INFO: renamed from: gl.a$a, reason: collision with other inner class name */
    private static final class C1685a implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f73519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d.a f73520d;

        C1685a(int i15, d.a aVar) {
            this.f73519c = i15;
            this.f73520d = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f73519c == dVar.tag() && this.f73520d.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f73519c) + (this.f73520d.hashCode() ^ 2041407134);
        }

        @Override // gl.d
        public d.a intEncoding() {
            return this.f73520d;
        }

        @Override // gl.d
        public int tag() {
            return this.f73519c;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f73519c + "intEncoding=" + this.f73520d + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C1685a(this.f73517a, this.f73518b);
    }

    public a c(int i15) {
        this.f73517a = i15;
        return this;
    }
}
