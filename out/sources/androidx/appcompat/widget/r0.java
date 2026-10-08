package androidx.appcompat.widget;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9015a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9016b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9017c = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9018d = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9019e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9020f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9021g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9022h = false;

    r0() {
    }

    public int a() {
        return this.f9021g ? this.f9015a : this.f9016b;
    }

    public int b() {
        return this.f9015a;
    }

    public int c() {
        return this.f9016b;
    }

    public int d() {
        return this.f9021g ? this.f9016b : this.f9015a;
    }

    public void e(int i15, int i16) {
        this.f9022h = false;
        if (i15 != Integer.MIN_VALUE) {
            this.f9019e = i15;
            this.f9015a = i15;
        }
        if (i16 != Integer.MIN_VALUE) {
            this.f9020f = i16;
            this.f9016b = i16;
        }
    }

    public void f(boolean z15) {
        if (z15 == this.f9021g) {
            return;
        }
        this.f9021g = z15;
        if (!this.f9022h) {
            this.f9015a = this.f9019e;
            this.f9016b = this.f9020f;
            return;
        }
        if (z15) {
            int i15 = this.f9018d;
            if (i15 == Integer.MIN_VALUE) {
                i15 = this.f9019e;
            }
            this.f9015a = i15;
            int i16 = this.f9017c;
            if (i16 == Integer.MIN_VALUE) {
                i16 = this.f9020f;
            }
            this.f9016b = i16;
            return;
        }
        int i17 = this.f9017c;
        if (i17 == Integer.MIN_VALUE) {
            i17 = this.f9019e;
        }
        this.f9015a = i17;
        int i18 = this.f9018d;
        if (i18 == Integer.MIN_VALUE) {
            i18 = this.f9020f;
        }
        this.f9016b = i18;
    }

    public void g(int i15, int i16) {
        this.f9017c = i15;
        this.f9018d = i16;
        this.f9022h = true;
        if (this.f9021g) {
            if (i16 != Integer.MIN_VALUE) {
                this.f9015a = i16;
            }
            if (i15 != Integer.MIN_VALUE) {
                this.f9016b = i15;
                return;
            }
            return;
        }
        if (i15 != Integer.MIN_VALUE) {
            this.f9015a = i15;
        }
        if (i16 != Integer.MIN_VALUE) {
            this.f9016b = i16;
        }
    }
}
