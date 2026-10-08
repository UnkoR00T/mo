package h9;

import o8.i0;

/* JADX INFO: loaded from: classes3.dex */
final class a extends o8.i implements i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f81907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f81908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f81909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f81910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f81911m;

    public a(long j15, long j16, i0.a aVar, boolean z15) {
        this(j15, j16, aVar.f143119f, aVar.f143116c, z15, true);
    }

    @Override // h9.i
    public long a() {
        return this.f81907i;
    }

    @Override // h9.i
    public long d() {
        return this.f81911m;
    }

    @Override // h9.i
    public long f(long j15) {
        return j(j15);
    }

    @Override // h9.i
    public int g() {
        return this.f81908j;
    }

    public a l(long j15) {
        return new a(j15, this.f81907i, this.f81908j, this.f81909k, this.f81910l, false);
    }

    public a(long j15, long j16, int i15, int i16, boolean z15) {
        this(j15, j16, i15, i16, z15, true);
    }

    private a(long j15, long j16, int i15, int i16, boolean z15, boolean z16) {
        super(j15, j16, i15, i16, z15, z16);
        long j17 = j15;
        this.f81907i = j16;
        this.f81908j = i15;
        this.f81909k = i16;
        this.f81910l = z15;
        this.f81911m = j17 == -1 ? -1L : j17;
    }
}
