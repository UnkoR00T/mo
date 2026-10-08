package bf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<af.i> f19089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19090b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable<af.i> f19091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f19092b;

        b() {
        }

        @Override // bf.f.a
        public f a() {
            String str = "";
            if (this.f19091a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f19091a, this.f19092b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // bf.f.a
        public f.a b(Iterable<af.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f19091a = iterable;
            return this;
        }

        @Override // bf.f.a
        public f.a c(byte[] bArr) {
            this.f19092b = bArr;
            return this;
        }
    }

    @Override // bf.f
    public Iterable<af.i> b() {
        return this.f19089a;
    }

    @Override // bf.f
    public byte[] c() {
        return this.f19090b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f19089a.equals(fVar.b())) {
                if (Arrays.equals(this.f19090b, fVar instanceof a ? ((a) fVar).f19090b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19089a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19090b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f19089a + ", extras=" + Arrays.toString(this.f19090b) + "}";
    }

    private a(Iterable<af.i> iterable, byte[] bArr) {
        this.f19089a = iterable;
        this.f19090b = bArr;
    }
}
