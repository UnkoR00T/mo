package z6;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f233157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f233158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f233159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f233160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f233161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f233162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f233163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f233164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f233165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e.p f233166j;

    public j() {
        this.f233157a = Math.sqrt(1500.0d);
        this.f233158b = 0.5d;
        this.f233159c = false;
        this.f233165i = Double.MAX_VALUE;
        this.f233166j = new e.p();
    }

    private void d() {
        if (this.f233159c) {
            return;
        }
        if (this.f233165i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d15 = this.f233158b;
        if (d15 > 1.0d) {
            double d16 = this.f233157a;
            this.f233162f = ((-d15) * d16) + (d16 * Math.sqrt((d15 * d15) - 1.0d));
            double d17 = this.f233158b;
            double d18 = this.f233157a;
            this.f233163g = ((-d17) * d18) - (d18 * Math.sqrt((d17 * d17) - 1.0d));
        } else if (d15 >= 0.0d && d15 < 1.0d) {
            this.f233164h = this.f233157a * Math.sqrt(1.0d - (d15 * d15));
        }
        this.f233159c = true;
    }

    public float a() {
        return (float) this.f233158b;
    }

    public float b() {
        return (float) this.f233165i;
    }

    public float c() {
        double d15 = this.f233157a;
        return (float) (d15 * d15);
    }

    public boolean e(float f15, float f16) {
        return ((double) Math.abs(f16)) < this.f233161e && ((double) Math.abs(f15 - b())) < this.f233160d;
    }

    public j f(float f15) {
        if (f15 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f233158b = f15;
        this.f233159c = false;
        return this;
    }

    public j g(float f15) {
        this.f233165i = f15;
        return this;
    }

    public j h(float f15) {
        if (f15 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f233157a = Math.sqrt(f15);
        this.f233159c = false;
        return this;
    }

    void i(double d15) {
        double dAbs = Math.abs(d15);
        this.f233160d = dAbs;
        this.f233161e = dAbs * 62.5d;
    }

    e.p j(double d15, double d16, long j15) {
        double dPow;
        double dCos;
        d();
        double d17 = j15 / 1000.0d;
        double d18 = d15 - this.f233165i;
        double d19 = this.f233158b;
        if (d19 > 1.0d) {
            double d25 = this.f233163g;
            double d26 = this.f233162f;
            double d27 = d18 - (((d25 * d18) - d16) / (d25 - d26));
            double d28 = ((d18 * d25) - d16) / (d25 - d26);
            dPow = (Math.pow(2.718281828459045d, d25 * d17) * d27) + (Math.pow(2.718281828459045d, this.f233162f * d17) * d28);
            double d29 = this.f233163g;
            double dPow2 = d27 * d29 * Math.pow(2.718281828459045d, d29 * d17);
            double d35 = this.f233162f;
            dCos = dPow2 + (d28 * d35 * Math.pow(2.718281828459045d, d35 * d17));
        } else if (d19 == 1.0d) {
            double d36 = this.f233157a;
            double d37 = d16 + (d36 * d18);
            double d38 = d18 + (d37 * d17);
            dPow = Math.pow(2.718281828459045d, (-d36) * d17) * d38;
            double dPow3 = d38 * Math.pow(2.718281828459045d, (-this.f233157a) * d17);
            double d39 = this.f233157a;
            dCos = (d37 * Math.pow(2.718281828459045d, (-d39) * d17)) + (dPow3 * (-d39));
        } else {
            double d45 = 1.0d / this.f233164h;
            double d46 = this.f233157a;
            double d47 = d45 * ((d19 * d46 * d18) + d16);
            dPow = Math.pow(2.718281828459045d, (-d19) * d46 * d17) * ((Math.cos(this.f233164h * d17) * d18) + (Math.sin(this.f233164h * d17) * d47));
            double d48 = this.f233157a;
            double d49 = this.f233158b;
            double dPow4 = Math.pow(2.718281828459045d, (-d49) * d48 * d17);
            double d55 = this.f233164h;
            double dSin = (-d55) * d18 * Math.sin(d55 * d17);
            double d56 = this.f233164h;
            dCos = ((-d48) * dPow * d49) + (dPow4 * (dSin + (d47 * d56 * Math.cos(d56 * d17))));
        }
        e.p pVar = this.f233166j;
        pVar.f233153a = (float) (dPow + this.f233165i);
        pVar.f233154b = (float) dCos;
        return pVar;
    }

    public j(float f15) {
        this.f233157a = Math.sqrt(1500.0d);
        this.f233158b = 0.5d;
        this.f233159c = false;
        this.f233165i = Double.MAX_VALUE;
        this.f233166j = new e.p();
        this.f233165i = f15;
    }
}
