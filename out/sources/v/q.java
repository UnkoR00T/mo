package v;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class q extends n3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f202761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f202762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.i0 f202763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f202764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Range<Integer> f202765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p1 f202766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f202767h;

    static final class b extends n3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Size f202768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Size f202769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o.i0 f202770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f202771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Range<Integer> f202772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p1 f202773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Boolean f202774g;

        @Override // v.n3.a
        public n3 a() {
            String str = "";
            if (this.f202768a == null) {
                str = " resolution";
            }
            if (this.f202769b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f202770c == null) {
                str = str + " dynamicRange";
            }
            if (this.f202771d == null) {
                str = str + " sessionType";
            }
            if (this.f202772e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f202774g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new q(this.f202768a, this.f202769b, this.f202770c, this.f202771d.intValue(), this.f202772e, this.f202773f, this.f202774g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v.n3.a
        public n3.a b(o.i0 i0Var) {
            if (i0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f202770c = i0Var;
            return this;
        }

        @Override // v.n3.a
        public n3.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f202772e = range;
            return this;
        }

        @Override // v.n3.a
        public n3.a d(p1 p1Var) {
            this.f202773f = p1Var;
            return this;
        }

        @Override // v.n3.a
        public n3.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null originalConfiguredResolution");
            }
            this.f202769b = size;
            return this;
        }

        @Override // v.n3.a
        public n3.a f(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f202768a = size;
            return this;
        }

        @Override // v.n3.a
        public n3.a g(int i15) {
            this.f202771d = Integer.valueOf(i15);
            return this;
        }

        @Override // v.n3.a
        public n3.a h(boolean z15) {
            this.f202774g = Boolean.valueOf(z15);
            return this;
        }

        b() {
        }

        private b(n3 n3Var) {
            this.f202768a = n3Var.f();
            this.f202769b = n3Var.e();
            this.f202770c = n3Var.b();
            this.f202771d = Integer.valueOf(n3Var.g());
            this.f202772e = n3Var.c();
            this.f202773f = n3Var.d();
            this.f202774g = Boolean.valueOf(n3Var.h());
        }
    }

    @Override // v.n3
    public o.i0 b() {
        return this.f202763d;
    }

    @Override // v.n3
    public Range<Integer> c() {
        return this.f202765f;
    }

    @Override // v.n3
    public p1 d() {
        return this.f202766g;
    }

    @Override // v.n3
    public Size e() {
        return this.f202762c;
    }

    public boolean equals(Object obj) {
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n3) {
            n3 n3Var = (n3) obj;
            if (this.f202761b.equals(n3Var.f()) && this.f202762c.equals(n3Var.e()) && this.f202763d.equals(n3Var.b()) && this.f202764e == n3Var.g() && this.f202765f.equals(n3Var.c()) && ((p1Var = this.f202766g) != null ? p1Var.equals(n3Var.d()) : n3Var.d() == null) && this.f202767h == n3Var.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.n3
    public Size f() {
        return this.f202761b;
    }

    @Override // v.n3
    public int g() {
        return this.f202764e;
    }

    @Override // v.n3
    public boolean h() {
        return this.f202767h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f202761b.hashCode() ^ 1000003) * 1000003) ^ this.f202762c.hashCode()) * 1000003) ^ this.f202763d.hashCode()) * 1000003) ^ this.f202764e) * 1000003) ^ this.f202765f.hashCode()) * 1000003;
        p1 p1Var = this.f202766g;
        return ((iHashCode ^ (p1Var == null ? 0 : p1Var.hashCode())) * 1000003) ^ (this.f202767h ? 1231 : 1237);
    }

    @Override // v.n3
    public n3.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f202761b + ", originalConfiguredResolution=" + this.f202762c + ", dynamicRange=" + this.f202763d + ", sessionType=" + this.f202764e + ", expectedFrameRateRange=" + this.f202765f + ", implementationOptions=" + this.f202766g + ", zslDisabled=" + this.f202767h + "}";
    }

    private q(Size size, Size size2, o.i0 i0Var, int i15, Range<Integer> range, p1 p1Var, boolean z15) {
        this.f202761b = size;
        this.f202762c = size2;
        this.f202763d = i0Var;
        this.f202764e = i15;
        this.f202765f = range;
        this.f202766g = p1Var;
        this.f202767h = z15;
    }
}
