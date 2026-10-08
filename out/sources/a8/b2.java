package a8;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4252c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f4253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f4254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4255c;

        public b2 d() {
            return new b2(this);
        }

        public b e(long j15) {
            zj.p.d(j15 >= 0 || j15 == -9223372036854775807L);
            this.f4255c = j15;
            return this;
        }

        public b f(long j15) {
            this.f4253a = j15;
            return this;
        }

        public b g(float f15) {
            zj.p.d(f15 > 0.0f || f15 == -3.4028235E38f);
            this.f4254b = f15;
            return this;
        }

        public b() {
            this.f4253a = -9223372036854775807L;
            this.f4254b = -3.4028235E38f;
            this.f4255c = -9223372036854775807L;
        }

        private b(b2 b2Var) {
            this.f4253a = b2Var.f4250a;
            this.f4254b = b2Var.f4251b;
            this.f4255c = b2Var.f4252c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f4250a == b2Var.f4250a && this.f4251b == b2Var.f4251b && this.f4252c == b2Var.f4252c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f4250a), Float.valueOf(this.f4251b), Long.valueOf(this.f4252c));
    }

    private b2(b bVar) {
        this.f4250a = bVar.f4253a;
        this.f4251b = bVar.f4254b;
        this.f4252c = bVar.f4255c;
    }
}
