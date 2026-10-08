package i9;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f90488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f90489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t7.p f90490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f90491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f90492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f90493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f90494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x[] f90495l;

    public w(int i15, int i16, long j15, long j16, long j17, long j18, t7.p pVar, int i17, x[] xVarArr, int i18, long[] jArr, long[] jArr2) {
        this.f90484a = i15;
        this.f90485b = i16;
        this.f90486c = j15;
        this.f90487d = j16;
        this.f90488e = j17;
        this.f90489f = j18;
        this.f90490g = pVar;
        this.f90491h = i17;
        this.f90495l = xVarArr;
        this.f90494k = i18;
        this.f90492i = jArr;
        this.f90493j = jArr2;
    }

    public w a(t7.p pVar) {
        return new w(this.f90484a, this.f90485b, this.f90486c, this.f90487d, this.f90488e, this.f90489f, pVar, this.f90491h, this.f90495l, this.f90494k, this.f90492i, this.f90493j);
    }

    public x b(int i15) {
        x[] xVarArr = this.f90495l;
        if (xVarArr == null) {
            return null;
        }
        return xVarArr[i15];
    }
}
