package yd;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f226449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f226450c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f226448a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f226451d = 0;

    private boolean b() {
        return this.f226450c.f226436b != 0;
    }

    private int d() {
        try {
            return this.f226449b.get() & 255;
        } catch (Exception unused) {
            this.f226450c.f226436b = 1;
            return 0;
        }
    }

    private void e() {
        this.f226450c.f226438d.f226424a = n();
        this.f226450c.f226438d.f226425b = n();
        this.f226450c.f226438d.f226426c = n();
        this.f226450c.f226438d.f226427d = n();
        int iD = d();
        boolean z15 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f226450c.f226438d;
        bVar.f226428e = (iD & 64) != 0;
        if (z15) {
            bVar.f226434k = g(iPow);
        } else {
            bVar.f226434k = null;
        }
        this.f226450c.f226438d.f226433j = this.f226449b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f226450c;
        cVar.f226437c++;
        cVar.f226439e.add(cVar.f226438d);
    }

    private void f() {
        int iD = d();
        this.f226451d = iD;
        if (iD <= 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            try {
                int i16 = this.f226451d;
                if (i15 >= i16) {
                    return;
                }
                int i17 = i16 - i15;
                this.f226449b.get(this.f226448a, i15, i17);
                i15 += i17;
            } catch (Exception unused) {
                this.f226450c.f226436b = 1;
                return;
            }
        }
    }

    private int[] g(int i15) {
        byte[] bArr = new byte[i15 * 3];
        int[] iArr = null;
        try {
            this.f226449b.get(bArr);
            iArr = new int[256];
            int i16 = 0;
            int i17 = 0;
            while (i16 < i15) {
                int i18 = bArr[i17] & 255;
                int i19 = i17 + 2;
                int i25 = bArr[i17 + 1] & 255;
                i17 += 3;
                int i26 = i16 + 1;
                iArr[i16] = (i25 << 8) | (i18 << 16) | (-16777216) | (bArr[i19] & 255);
                i16 = i26;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.f226450c.f226436b = 1;
            return iArr;
        }
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i15) {
        boolean z15 = false;
        while (!z15 && !b() && this.f226450c.f226437c <= i15) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f226450c.f226438d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb5 = new StringBuilder();
                    for (int i16 = 0; i16 < 11; i16++) {
                        sb5.append((char) this.f226448a[i16]);
                    }
                    if (sb5.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f226450c;
                if (cVar.f226438d == null) {
                    cVar.f226438d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f226450c.f226436b = 1;
            } else {
                z15 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f226450c.f226438d;
        int i15 = (iD & 28) >> 2;
        bVar.f226430g = i15;
        if (i15 == 0) {
            bVar.f226430g = 1;
        }
        bVar.f226429f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f226450c.f226438d;
        bVar2.f226432i = iN * 10;
        bVar2.f226431h = d();
        d();
    }

    private void k() {
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < 6; i15++) {
            sb5.append((char) d());
        }
        if (!sb5.toString().startsWith("GIF")) {
            this.f226450c.f226436b = 1;
            return;
        }
        l();
        if (!this.f226450c.f226442h || b()) {
            return;
        }
        c cVar = this.f226450c;
        cVar.f226435a = g(cVar.f226443i);
        c cVar2 = this.f226450c;
        cVar2.f226446l = cVar2.f226435a[cVar2.f226444j];
    }

    private void l() {
        this.f226450c.f226440f = n();
        this.f226450c.f226441g = n();
        int iD = d();
        c cVar = this.f226450c;
        cVar.f226442h = (iD & 128) != 0;
        cVar.f226443i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f226450c.f226444j = d();
        this.f226450c.f226445k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f226448a;
            if (bArr[0] == 1) {
                this.f226450c.f226447m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f226451d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f226449b.getShort();
    }

    private void o() {
        this.f226449b = null;
        Arrays.fill(this.f226448a, (byte) 0);
        this.f226450c = new c();
        this.f226451d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f226449b.position(Math.min(this.f226449b.position() + iD, this.f226449b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f226449b = null;
        this.f226450c = null;
    }

    public c c() {
        if (this.f226449b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f226450c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f226450c;
            if (cVar.f226437c < 0) {
                cVar.f226436b = 1;
            }
        }
        return this.f226450c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f226449b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f226449b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
