package af;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f6093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f6094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f6096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f6097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f6098g;

    /* JADX INFO: renamed from: af.b$b, reason: collision with other inner class name */
    static final class C0125b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f6100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f6101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f6102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f6103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f6104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f6105g;

        C0125b() {
        }

        @Override // af.i.a
        public i d() {
            String str = "";
            if (this.f6099a == null) {
                str = " transportName";
            }
            if (this.f6101c == null) {
                str = str + " encodedPayload";
            }
            if (this.f6102d == null) {
                str = str + " eventMillis";
            }
            if (this.f6103e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f6104f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f6099a, this.f6100b, this.f6101c, this.f6102d.longValue(), this.f6103e.longValue(), this.f6104f, this.f6105g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // af.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f6104f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // af.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f6104f = map;
            return this;
        }

        @Override // af.i.a
        public i.a g(Integer num) {
            this.f6100b = num;
            return this;
        }

        @Override // af.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f6101c = hVar;
            return this;
        }

        @Override // af.i.a
        public i.a i(long j15) {
            this.f6102d = Long.valueOf(j15);
            return this;
        }

        @Override // af.i.a
        public i.a j(Integer num) {
            this.f6105g = num;
            return this;
        }

        @Override // af.i.a
        public i.a k(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6099a = str;
            return this;
        }

        @Override // af.i.a
        public i.a l(long j15) {
            this.f6103e = Long.valueOf(j15);
            return this;
        }
    }

    @Override // af.i
    protected Map<String, String> c() {
        return this.f6097f;
    }

    @Override // af.i
    public Integer d() {
        return this.f6093b;
    }

    @Override // af.i
    public h e() {
        return this.f6094c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f6092a.equals(iVar.k()) && ((num = this.f6093b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f6094c.equals(iVar.e()) && this.f6095d == iVar.f() && this.f6096e == iVar.l() && this.f6097f.equals(iVar.c()) && ((num2 = this.f6098g) != null ? num2.equals(iVar.j()) : iVar.j() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // af.i
    public long f() {
        return this.f6095d;
    }

    public int hashCode() {
        int iHashCode = (this.f6092a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f6093b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f6094c.hashCode()) * 1000003;
        long j15 = this.f6095d;
        int i15 = (iHashCode2 ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003;
        long j16 = this.f6096e;
        int iHashCode3 = (((i15 ^ ((int) (j16 ^ (j16 >>> 32)))) * 1000003) ^ this.f6097f.hashCode()) * 1000003;
        Integer num2 = this.f6098g;
        return iHashCode3 ^ (num2 != null ? num2.hashCode() : 0);
    }

    @Override // af.i
    public Integer j() {
        return this.f6098g;
    }

    @Override // af.i
    public String k() {
        return this.f6092a;
    }

    @Override // af.i
    public long l() {
        return this.f6096e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f6092a + ", code=" + this.f6093b + ", encodedPayload=" + this.f6094c + ", eventMillis=" + this.f6095d + ", uptimeMillis=" + this.f6096e + ", autoMetadata=" + this.f6097f + ", productId=" + this.f6098g + "}";
    }

    private b(String str, Integer num, h hVar, long j15, long j16, Map<String, String> map, Integer num2) {
        this.f6092a = str;
        this.f6093b = num;
        this.f6094c = hVar;
        this.f6095d = j15;
        this.f6096e = j16;
        this.f6097f = map;
        this.f6098g = num2;
    }
}
