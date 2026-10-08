package o8;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.h f143122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f143123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f143124d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f143126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f143127g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f143125e = new byte[PKIFailureInfo.notAuthorized];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f143121a = new byte[PKIFailureInfo.certConfirmed];

    static {
        t7.t.a("media3.extractor");
    }

    public j(t7.h hVar, long j15, long j16) {
        this.f143122b = hVar;
        this.f143124d = j15;
        this.f143123c = j16;
    }

    private void q(int i15) {
        if (i15 != -1) {
            this.f143124d += (long) i15;
        }
    }

    private void r(int i15) {
        int i16 = this.f143126f + i15;
        byte[] bArr = this.f143125e;
        if (i16 > bArr.length) {
            this.f143125e = Arrays.copyOf(this.f143125e, w7.o0.o(bArr.length * 2, PKIFailureInfo.notAuthorized + i16, i16 + PKIFailureInfo.signerNotTrusted));
        }
    }

    private int s(byte[] bArr, int i15, int i16) {
        int i17 = this.f143127g;
        if (i17 == 0) {
            return 0;
        }
        int iMin = Math.min(i17, i16);
        System.arraycopy(this.f143125e, 0, bArr, i15, iMin);
        v(iMin);
        return iMin;
    }

    private int t(byte[] bArr, int i15, int i16, int i17, boolean z15) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i18 = this.f143122b.read(bArr, i15 + i17, i16 - i17);
        if (i18 != -1) {
            return i17 + i18;
        }
        if (i17 == 0 && z15) {
            return -1;
        }
        throw new EOFException();
    }

    private int u(int i15) {
        int iMin = Math.min(this.f143127g, i15);
        v(iMin);
        return iMin;
    }

    private void v(int i15) {
        int i16 = this.f143127g - i15;
        this.f143127g = i16;
        this.f143126f = 0;
        byte[] bArr = this.f143125e;
        byte[] bArr2 = i16 < bArr.length - PKIFailureInfo.signerNotTrusted ? new byte[PKIFailureInfo.notAuthorized + i16] : bArr;
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        this.f143125e = bArr2;
    }

    @Override // o8.q
    public long a() {
        return this.f143123c;
    }

    @Override // o8.q
    public int b(int i15) throws EOFException, InterruptedIOException {
        int iU = u(i15);
        if (iU == 0) {
            byte[] bArr = this.f143121a;
            iU = t(bArr, 0, Math.min(i15, bArr.length), 0, true);
        }
        q(iU);
        return iU;
    }

    @Override // o8.q
    public boolean d(int i15, boolean z15) throws EOFException, InterruptedIOException {
        int iU = u(i15);
        while (iU < i15 && iU != -1) {
            iU = t(this.f143121a, -iU, Math.min(i15, this.f143121a.length + iU), iU, z15);
        }
        q(iU);
        return iU != -1;
    }

    @Override // o8.q
    public boolean e(byte[] bArr, int i15, int i16, boolean z15) {
        if (!o(i16, z15)) {
            return false;
        }
        System.arraycopy(this.f143125e, this.f143126f - i16, bArr, i15, i16);
        return true;
    }

    @Override // o8.q
    public void g() {
        this.f143126f = 0;
    }

    @Override // o8.q
    public long getPosition() {
        return this.f143124d;
    }

    @Override // o8.q
    public boolean h(byte[] bArr, int i15, int i16, boolean z15) throws EOFException, InterruptedIOException {
        int iS = s(bArr, i15, i16);
        while (iS < i16 && iS != -1) {
            iS = t(bArr, i15, i16, iS, z15);
        }
        q(iS);
        return iS != -1;
    }

    @Override // o8.q
    public long j() {
        return this.f143124d + ((long) this.f143126f);
    }

    @Override // o8.q
    public void k(int i15) throws EOFException, InterruptedIOException {
        o(i15, false);
    }

    @Override // o8.q
    public int l(byte[] bArr, int i15, int i16) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin;
        r(i16);
        int i17 = this.f143127g;
        int i18 = this.f143126f;
        int i19 = i17 - i18;
        if (i19 == 0) {
            jVar = this;
            iMin = jVar.t(this.f143125e, i18, i16, 0, true);
            if (iMin == -1) {
                return -1;
            }
            jVar.f143127g += iMin;
        } else {
            jVar = this;
            iMin = Math.min(i16, i19);
        }
        System.arraycopy(jVar.f143125e, jVar.f143126f, bArr, i15, iMin);
        jVar.f143126f += iMin;
        return iMin;
    }

    @Override // o8.q
    public void n(int i15) throws EOFException, InterruptedIOException {
        d(i15, false);
    }

    @Override // o8.q
    public boolean o(int i15, boolean z15) throws EOFException, InterruptedIOException {
        r(i15);
        int iT = this.f143127g - this.f143126f;
        while (iT < i15) {
            int i16 = i15;
            boolean z16 = z15;
            iT = t(this.f143125e, this.f143126f, i16, iT, z16);
            if (iT == -1) {
                return false;
            }
            this.f143127g = this.f143126f + iT;
            i15 = i16;
            z15 = z16;
        }
        this.f143126f += i15;
        return true;
    }

    @Override // o8.q
    public void p(byte[] bArr, int i15, int i16) {
        e(bArr, i15, i16, false);
    }

    @Override // o8.q, t7.h
    public int read(byte[] bArr, int i15, int i16) throws EOFException, InterruptedIOException {
        int iS = s(bArr, i15, i16);
        if (iS == 0) {
            iS = t(bArr, i15, i16, 0, true);
        }
        q(iS);
        return iS;
    }

    @Override // o8.q
    public void readFully(byte[] bArr, int i15, int i16) throws EOFException, InterruptedIOException {
        h(bArr, i15, i16, false);
    }
}
