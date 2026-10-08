package t7;

import java.util.Objects;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f188306e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f188307f = o0.u0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f188308g = o0.u0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f188309h = o0.u0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f188310i = o0.u0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f188314d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f188315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f188316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f188317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f188318d;

        public b(int i15) {
            this.f188315a = i15;
        }

        public k e() {
            zj.p.d(this.f188316b <= this.f188317c);
            return new k(this);
        }

        public b f(int i15) {
            this.f188317c = i15;
            return this;
        }

        public b g(int i15) {
            this.f188316b = i15;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f188311a == kVar.f188311a && this.f188312b == kVar.f188312b && this.f188313c == kVar.f188313c && Objects.equals(this.f188314d, kVar.f188314d);
    }

    public int hashCode() {
        int i15 = (((((527 + this.f188311a) * 31) + this.f188312b) * 31) + this.f188313c) * 31;
        String str = this.f188314d;
        return i15 + (str == null ? 0 : str.hashCode());
    }

    private k(b bVar) {
        this.f188311a = bVar.f188315a;
        this.f188312b = bVar.f188316b;
        this.f188313c = bVar.f188317c;
        this.f188314d = bVar.f188318d;
    }
}
