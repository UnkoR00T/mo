package v9;

import android.util.SparseArray;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements o8.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o8.u f204904l = new o8.u() { // from class: v9.b0
        @Override // o8.u
        public final o8.p[] f() {
            return c0.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.k0 f204905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f204906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.c0 f204907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f204908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f204909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f204910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f204911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f204912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f204913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o8.r f204914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f204915k;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f204916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w7.k0 f204917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w7.b0 f204918c = new w7.b0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f204919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f204920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f204921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f204922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f204923h;

        public a(m mVar, w7.k0 k0Var) {
            this.f204916a = mVar;
            this.f204917b = k0Var;
        }

        private void b() {
            this.f204918c.r(8);
            this.f204919d = this.f204918c.g();
            this.f204920e = this.f204918c.g();
            this.f204918c.r(6);
            this.f204922g = this.f204918c.h(8);
        }

        private void c() {
            this.f204923h = 0L;
            if (this.f204919d) {
                this.f204918c.r(4);
                long jH = ((long) this.f204918c.h(3)) << 30;
                this.f204918c.r(1);
                long jH2 = jH | ((long) (this.f204918c.h(15) << 15));
                this.f204918c.r(1);
                long jH3 = jH2 | ((long) this.f204918c.h(15));
                this.f204918c.r(1);
                if (!this.f204921f && this.f204920e) {
                    this.f204918c.r(4);
                    long jH4 = ((long) this.f204918c.h(3)) << 30;
                    this.f204918c.r(1);
                    long jH5 = jH4 | ((long) (this.f204918c.h(15) << 15));
                    this.f204918c.r(1);
                    long jH6 = jH5 | ((long) this.f204918c.h(15));
                    this.f204918c.r(1);
                    this.f204917b.b(jH6);
                    this.f204921f = true;
                }
                this.f204923h = this.f204917b.b(jH3);
            }
        }

        public void a(w7.c0 c0Var) {
            c0Var.u(this.f204918c.f210609a, 0, 3);
            this.f204918c.p(0);
            b();
            c0Var.u(this.f204918c.f210609a, 0, this.f204922g);
            this.f204918c.p(0);
            c();
            this.f204916a.f(this.f204923h, 4);
            this.f204916a.b(c0Var);
            this.f204916a.e(false);
        }

        public void d() {
            this.f204921f = false;
            this.f204916a.c();
        }
    }

    public c0() {
        this(new w7.k0(0L));
    }

    public static /* synthetic */ o8.p[] h() {
        return new o8.p[]{new c0()};
    }

    private void i(long j15) {
        if (this.f204915k) {
            return;
        }
        this.f204915k = true;
        if (this.f204908d.c() == -9223372036854775807L) {
            this.f204914j.f(new o8.l0.b(this.f204908d.c()));
            return;
        }
        z zVar = new z(this.f204908d.d(), this.f204908d.c(), j15);
        this.f204913i = zVar;
        this.f204914j.f(zVar.b());
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        boolean z15 = this.f204905a.f() == -9223372036854775807L;
        if (!z15) {
            long jD = this.f204905a.d();
            z15 = (jD == -9223372036854775807L || jD == 0 || jD == j16) ? false : true;
        }
        if (z15) {
            this.f204905a.i(j16);
        }
        z zVar = this.f204913i;
        if (zVar != null) {
            zVar.h(j16);
        }
        for (int i15 = 0; i15 < this.f204906b.size(); i15++) {
            this.f204906b.valueAt(i15).d();
        }
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(o8.q qVar) {
        byte[] bArr = new byte[14];
        qVar.p(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.k(bArr[13] & 7);
        qVar.p(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        this.f204914j = rVar;
    }

    @Override // o8.p
    public int g(o8.q qVar, o8.k0 k0Var) {
        m nVar;
        zj.p.q(this.f204914j);
        long jA = qVar.a();
        if (jA != -1 && !this.f204908d.e()) {
            return this.f204908d.g(qVar, k0Var);
        }
        i(jA);
        z zVar = this.f204913i;
        if (zVar != null && zVar.d()) {
            return this.f204913i.c(qVar, k0Var);
        }
        qVar.g();
        long j15 = jA != -1 ? jA - qVar.j() : -1L;
        if ((j15 != -1 && j15 < 4) || !qVar.e(this.f204907c.f(), 0, 4, true)) {
            return -1;
        }
        this.f204907c.f0(0);
        int iZ = this.f204907c.z();
        if (iZ == 441) {
            return -1;
        }
        if (iZ == 442) {
            qVar.p(this.f204907c.f(), 0, 10);
            this.f204907c.f0(9);
            qVar.n((this.f204907c.Q() & 7) + 14);
            return 0;
        }
        if (iZ == 443) {
            qVar.p(this.f204907c.f(), 0, 2);
            this.f204907c.f0(0);
            qVar.n(this.f204907c.Y() + 6);
            return 0;
        }
        if (((iZ & (-256)) >> 8) != 1) {
            qVar.n(1);
            return 0;
        }
        int i15 = iZ & GF2Field.MASK;
        a aVar = this.f204906b.get(i15);
        if (!this.f204909e) {
            if (aVar == null) {
                if (i15 == 189) {
                    nVar = new c("video/mp2p");
                    this.f204910f = true;
                    this.f204912h = qVar.getPosition();
                } else if ((iZ & BERTags.FLAGS) == 192) {
                    nVar = new t("video/mp2p");
                    this.f204910f = true;
                    this.f204912h = qVar.getPosition();
                } else if ((iZ & 240) == 224) {
                    nVar = new n("video/mp2p");
                    this.f204911g = true;
                    this.f204912h = qVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.d(this.f204914j, new l0.d(i15, 256));
                    aVar = new a(nVar, this.f204905a);
                    this.f204906b.put(i15, aVar);
                }
            }
            if (qVar.getPosition() > ((this.f204910f && this.f204911g) ? this.f204912h + 8192 : 1048576L)) {
                this.f204909e = true;
                this.f204914j.s();
            }
        }
        qVar.p(this.f204907c.f(), 0, 2);
        this.f204907c.f0(0);
        int iY = this.f204907c.Y() + 6;
        if (aVar == null) {
            qVar.n(iY);
        } else {
            this.f204907c.b0(iY);
            qVar.readFully(this.f204907c.f(), 0, iY);
            this.f204907c.f0(6);
            aVar.a(this.f204907c);
            w7.c0 c0Var = this.f204907c;
            c0Var.e0(c0Var.b());
        }
        return 0;
    }

    public c0(w7.k0 k0Var) {
        this.f204905a = k0Var;
        this.f204907c = new w7.c0(PKIFailureInfo.certConfirmed);
        this.f204906b = new SparseArray<>();
        this.f204908d = new a0();
    }
}
