package jp;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f104277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f104278b;

    public a() {
        this.f104278b = false;
        this.f104277a = -4;
    }

    public static a e() {
        a aVar = new a();
        aVar.j(true);
        aVar.k(true);
        aVar.l(true);
        aVar.m(true);
        aVar.n(true);
        aVar.o(true);
        aVar.p(true);
        aVar.q(true);
        return aVar;
    }

    private boolean i(int i15) {
        return ((1 << (i15 - 1)) & this.f104277a) != 0;
    }

    private boolean r(int i15, boolean z15) {
        int i16 = this.f104277a;
        int i17 = z15 ? (1 << (i15 - 1)) | i16 : (~(1 << (i15 - 1))) & i16;
        this.f104277a = i17;
        return ((1 << (i15 - 1)) & i17) != 0;
    }

    public boolean a() {
        return i(11);
    }

    public boolean b() {
        return i(10);
    }

    public boolean c() {
        return i(9);
    }

    public boolean d() {
        return i(12);
    }

    public int f() {
        return this.f104277a;
    }

    public int g() {
        r(1, true);
        r(7, false);
        r(8, false);
        for (int i15 = 13; i15 <= 32; i15++) {
            r(i15, false);
        }
        return this.f104277a;
    }

    protected boolean h() {
        if (c() || b() || a()) {
            return true;
        }
        return d();
    }

    public void j(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(11, z15);
    }

    public void k(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(5, z15);
    }

    public void l(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(10, z15);
    }

    public void m(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(9, z15);
    }

    public void n(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(4, z15);
    }

    public void o(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(6, z15);
    }

    public void p(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(3, z15);
    }

    public void q(boolean z15) {
        if (this.f104278b) {
            return;
        }
        r(12, z15);
    }

    public void s() {
        this.f104278b = true;
    }

    public a(byte[] bArr) {
        this.f104278b = false;
        this.f104277a = 0;
        int i15 = (bArr[0] & 255) << 8;
        this.f104277a = i15;
        int i16 = (i15 | (bArr[1] & 255)) << 8;
        this.f104277a = i16;
        int i17 = (i16 | (bArr[2] & 255)) << 8;
        this.f104277a = i17;
        this.f104277a = (bArr[3] & 255) | i17;
    }

    public a(int i15) {
        this.f104278b = false;
        this.f104277a = i15;
    }
}
