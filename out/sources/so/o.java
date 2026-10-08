package so;

/* JADX INFO: loaded from: classes4.dex */
public class o extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k[] f182731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i0 f182732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s f182733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f182734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f182735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f182736l;

    o(n0 n0Var) {
        super(n0Var);
        this.f182735k = 0;
        this.f182736l = null;
    }

    private k k(int i15) {
        k kVar = new k();
        r rVar = this.f182736l;
        kVar.d(this, this.f182732h, rVar == null ? 0 : rVar.k(i15));
        if (kVar.a().a()) {
            kVar.a().c();
        }
        return kVar;
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) {
        this.f182733i = n0Var.N();
        int iZ = n0Var.Z();
        this.f182734j = iZ;
        if (iZ < 5000) {
            this.f182731g = new k[iZ];
        }
        this.f182732h = i0Var;
        this.f182736l = this.f182682f.M();
        this.f182681e = true;
    }

    public k j(int i15) {
        k kVarK;
        int i16;
        k kVar;
        if (i15 < 0 || i15 >= this.f182734j) {
            return null;
        }
        k[] kVarArr = this.f182731g;
        if (kVarArr != null && (kVar = kVarArr[i15]) != null) {
            return kVar;
        }
        synchronized (this.f182732h) {
            try {
                long[] jArrJ = this.f182733i.j();
                if (jArrJ[i15] == jArrJ[i15 + 1]) {
                    kVarK = new k();
                    kVarK.e();
                } else {
                    long jB = this.f182732h.b();
                    this.f182732h.seek(c() + jArrJ[i15]);
                    kVarK = k(i15);
                    this.f182732h.seek(jB);
                }
                k[] kVarArr2 = this.f182731g;
                if (kVarArr2 != null && kVarArr2[i15] == null && (i16 = this.f182735k) < 100) {
                    kVarArr2[i15] = kVarK;
                    this.f182735k = i16 + 1;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return kVarK;
    }
}
