package o8;

/* JADX INFO: loaded from: classes3.dex */
public interface l0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m0 f143129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m0 f143130b;

        public a(m0 m0Var) {
            this(m0Var, m0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f143129a.equals(aVar.f143129a) && this.f143130b.equals(aVar.f143130b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f143129a.hashCode() * 31) + this.f143130b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("[");
            sb5.append(this.f143129a);
            if (this.f143129a.equals(this.f143130b)) {
                str = "";
            } else {
                str = ", " + this.f143130b;
            }
            sb5.append(str);
            sb5.append("]");
            return sb5.toString();
        }

        public a(m0 m0Var, m0 m0Var2) {
            this.f143129a = (m0) zj.p.q(m0Var);
            this.f143130b = (m0) zj.p.q(m0Var2);
        }
    }

    public static class b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f143131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f143132b;

        public b(long j15) {
            this(j15, 0L);
        }

        @Override // o8.l0
        public a c(long j15) {
            return this.f143132b;
        }

        @Override // o8.l0
        public boolean e() {
            return false;
        }

        @Override // o8.l0
        public long h() {
            return this.f143131a;
        }

        public b(long j15, long j16) {
            this.f143131a = j15;
            this.f143132b = new a(j16 == 0 ? m0.f143157c : new m0(0L, j16));
        }
    }

    default boolean b() {
        return false;
    }

    a c(long j15);

    boolean e();

    long h();
}
