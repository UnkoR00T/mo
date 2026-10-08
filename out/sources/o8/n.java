package o8;

import java.io.EOFException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f143160a = new byte[PKIFailureInfo.certConfirmed];

    @Override // o8.s0
    public void b(w7.c0 c0Var, int i15, int i16) {
        c0Var.g0(i15);
    }

    @Override // o8.s0
    public void c(long j15, int i15, int i16, int i17, s0.a aVar) {
    }

    @Override // o8.s0
    public void e(t7.p pVar) {
    }

    @Override // o8.s0
    public int g(t7.h hVar, int i15, boolean z15, int i16) throws EOFException {
        int i17 = hVar.read(this.f143160a, 0, Math.min(this.f143160a.length, i15));
        if (i17 != -1) {
            return i17;
        }
        if (z15) {
            return -1;
        }
        throw new EOFException();
    }
}
