package a8;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e3 f4381j = new b().i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak.u0<Integer> f4382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f4384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public final boolean f4386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4390i;

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f4392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Double f4393c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ak.u0<Integer> f4391a = ak.u0.F(1, 5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4394d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4395e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4396f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f4397g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f4398h = true;

        public e3 i() {
            return new e3(this);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return this.f4382a.equals(e3Var.f4382a) && this.f4387f == e3Var.f4387f && this.f4390i == e3Var.f4390i && Objects.equals(this.f4383b, e3Var.f4383b) && Objects.equals(this.f4384c, e3Var.f4384c) && this.f4385d == e3Var.f4385d && this.f4388g == e3Var.f4388g && this.f4389h == e3Var.f4389h;
    }

    public int hashCode() {
        return Objects.hash(this.f4382a, this.f4383b, this.f4384c, Boolean.valueOf(this.f4385d), Boolean.valueOf(this.f4387f), Boolean.valueOf(this.f4390i), Boolean.valueOf(this.f4388g), Boolean.valueOf(this.f4389h));
    }

    private e3(b bVar) {
        this.f4382a = bVar.f4391a;
        this.f4383b = bVar.f4392b;
        this.f4384c = bVar.f4393c;
        this.f4385d = bVar.f4394d;
        this.f4386e = !bVar.f4395e;
        this.f4387f = bVar.f4395e;
        this.f4390i = bVar.f4396f;
        this.f4388g = bVar.f4397g;
        this.f4389h = bVar.f4398h;
    }
}
