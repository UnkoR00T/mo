package o;

import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f140059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rational f140060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f140061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f140062d;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rational f140064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f140065c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f140063a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f140066d = 0;

        public a(Rational rational, int i15) {
            this.f140064b = rational;
            this.f140065c = i15;
        }

        public k2 a() {
            i6.i.h(this.f140064b, "The crop aspect ratio must be set.");
            return new k2(this.f140063a, this.f140064b, this.f140065c, this.f140066d);
        }

        public a b(int i15) {
            this.f140066d = i15;
            return this;
        }

        public a c(int i15) {
            this.f140063a = i15;
            return this;
        }
    }

    k2(int i15, Rational rational, int i16, int i17) {
        this.f140059a = i15;
        this.f140060b = rational;
        this.f140061c = i16;
        this.f140062d = i17;
    }

    public Rational a() {
        return this.f140060b;
    }

    public int b() {
        return this.f140062d;
    }

    public int c() {
        return this.f140061c;
    }

    public int d() {
        return this.f140059a;
    }
}
