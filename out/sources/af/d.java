package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class d extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f6117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye.e f6118c;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f6120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ye.e f6121c;

        b() {
        }

        @Override // af.o.a
        public o a() {
            String str = "";
            if (this.f6119a == null) {
                str = " backendName";
            }
            if (this.f6121c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f6119a, this.f6120b, this.f6121c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // af.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f6119a = str;
            return this;
        }

        @Override // af.o.a
        public o.a c(byte[] bArr) {
            this.f6120b = bArr;
            return this;
        }

        @Override // af.o.a
        public o.a d(ye.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f6121c = eVar;
            return this;
        }
    }

    @Override // af.o
    public String b() {
        return this.f6116a;
    }

    @Override // af.o
    public byte[] c() {
        return this.f6117b;
    }

    @Override // af.o
    public ye.e d() {
        return this.f6118c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f6116a.equals(oVar.b())) {
                if (Arrays.equals(this.f6117b, oVar instanceof d ? ((d) oVar).f6117b : oVar.c()) && this.f6118c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f6116a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6117b)) * 1000003) ^ this.f6118c.hashCode();
    }

    private d(String str, byte[] bArr, ye.e eVar) {
        this.f6116a = str;
        this.f6117b = bArr;
        this.f6118c = eVar;
    }
}
