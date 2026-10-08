package v;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class o extends j3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f202728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<u1> f202729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f202730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f202731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f202732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o.i0 f202733f;

    static final class b extends j3.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u1 f202734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<u1> f202735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f202736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f202737d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f202738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private o.i0 f202739f;

        b() {
        }

        @Override // v.j3.f.a
        public j3.f a() {
            String str = "";
            if (this.f202734a == null) {
                str = " surface";
            }
            if (this.f202735b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f202737d == null) {
                str = str + " mirrorMode";
            }
            if (this.f202738e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f202739f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new o(this.f202734a, this.f202735b, this.f202736c, this.f202737d.intValue(), this.f202738e.intValue(), this.f202739f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v.j3.f.a
        public j3.f.a b(o.i0 i0Var) {
            if (i0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f202739f = i0Var;
            return this;
        }

        @Override // v.j3.f.a
        public j3.f.a c(int i15) {
            this.f202737d = Integer.valueOf(i15);
            return this;
        }

        @Override // v.j3.f.a
        public j3.f.a d(String str) {
            this.f202736c = str;
            return this;
        }

        @Override // v.j3.f.a
        public j3.f.a e(List<u1> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f202735b = list;
            return this;
        }

        @Override // v.j3.f.a
        public j3.f.a f(int i15) {
            this.f202738e = Integer.valueOf(i15);
            return this;
        }

        public j3.f.a g(u1 u1Var) {
            if (u1Var == null) {
                throw new NullPointerException("Null surface");
            }
            this.f202734a = u1Var;
            return this;
        }
    }

    @Override // v.j3.f
    public o.i0 b() {
        return this.f202733f;
    }

    @Override // v.j3.f
    public int c() {
        return this.f202731d;
    }

    @Override // v.j3.f
    public String d() {
        return this.f202730c;
    }

    @Override // v.j3.f
    public List<u1> e() {
        return this.f202729b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j3.f) {
            j3.f fVar = (j3.f) obj;
            if (this.f202728a.equals(fVar.f()) && this.f202729b.equals(fVar.e()) && ((str = this.f202730c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f202731d == fVar.c() && this.f202732e == fVar.g() && this.f202733f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // v.j3.f
    public u1 f() {
        return this.f202728a;
    }

    @Override // v.j3.f
    public int g() {
        return this.f202732e;
    }

    public int hashCode() {
        int iHashCode = (((this.f202728a.hashCode() ^ 1000003) * 1000003) ^ this.f202729b.hashCode()) * 1000003;
        String str = this.f202730c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f202731d) * 1000003) ^ this.f202732e) * 1000003) ^ this.f202733f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f202728a + ", sharedSurfaces=" + this.f202729b + ", physicalCameraId=" + this.f202730c + ", mirrorMode=" + this.f202731d + ", surfaceGroupId=" + this.f202732e + ", dynamicRange=" + this.f202733f + "}";
    }

    private o(u1 u1Var, List<u1> list, String str, int i15, int i16, o.i0 i0Var) {
        this.f202728a = u1Var;
        this.f202729b = list;
        this.f202730c = str;
        this.f202731d = i15;
        this.f202732e = i16;
        this.f202733f = i0Var;
    }
}
