package a8;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8.c0.b f4370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4380k;

    e2(h8.c0.b bVar, long j15, long j16, long j17, long j18, long j19, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        boolean z25 = true;
        zj.p.d(!z19 || z17);
        zj.p.d(!z18 || z17);
        if (z16 && (z17 || z18 || z19)) {
            z25 = false;
        }
        zj.p.d(z25);
        this.f4370a = bVar;
        this.f4371b = j15;
        this.f4372c = j16;
        this.f4373d = j17;
        this.f4374e = j18;
        this.f4375f = j19;
        this.f4376g = z15;
        this.f4377h = z16;
        this.f4378i = z17;
        this.f4379j = z18;
        this.f4380k = z19;
    }

    public e2 a(long j15) {
        return j15 == this.f4373d ? this : new e2(this.f4370a, this.f4371b, this.f4372c, j15, this.f4374e, this.f4375f, this.f4376g, this.f4377h, this.f4378i, this.f4379j, this.f4380k);
    }

    public e2 b(long j15, long j16) {
        return (j15 == this.f4371b && j16 == this.f4372c) ? this : new e2(this.f4370a, j15, j16, this.f4373d, this.f4374e, this.f4375f, this.f4376g, this.f4377h, this.f4378i, this.f4379j, this.f4380k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e2.class == obj.getClass()) {
            e2 e2Var = (e2) obj;
            if (this.f4371b == e2Var.f4371b && this.f4373d == e2Var.f4373d && this.f4374e == e2Var.f4374e && this.f4375f == e2Var.f4375f && this.f4376g == e2Var.f4376g && this.f4377h == e2Var.f4377h && this.f4378i == e2Var.f4378i && this.f4379j == e2Var.f4379j && this.f4380k == e2Var.f4380k && Objects.equals(this.f4370a, e2Var.f4370a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f4370a.hashCode()) * 31) + ((int) this.f4371b)) * 31) + ((int) this.f4373d)) * 31) + ((int) this.f4374e)) * 31) + ((int) this.f4375f)) * 31) + (this.f4376g ? 1 : 0)) * 31) + (this.f4377h ? 1 : 0)) * 31) + (this.f4378i ? 1 : 0)) * 31) + (this.f4379j ? 1 : 0)) * 31) + (this.f4380k ? 1 : 0);
    }
}
