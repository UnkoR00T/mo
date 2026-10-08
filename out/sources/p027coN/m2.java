package p027coN;

import java.util.NoSuchElementException;
import p028con.m3;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f28659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3 f28660c;

    public m2(byte[] bArr) {
        m3 m3Var;
        this.f28659b = new byte[0];
        this.f28660c = m3.Unrecognised;
        if (bArr.length >= 2) {
            byte[] bArr2 = {bArr[bArr.length - 2], bArr[bArr.length - 1]};
            int i15 = ((bArr2[0] & 255) << 8) + (bArr2[1] & 255);
            this.f28658a = i15;
            m3.f37127b.getClass();
            if ((65280 & i15) == 24832) {
                m3Var = m3.DataPending;
            } else {
                try {
                    for (m3 m3Var2 : m3.values()) {
                        if (m3Var2.f37138a == (65535 & i15)) {
                            m3Var = m3Var2;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (NoSuchElementException unused) {
                    m3Var = m3.Unrecognised;
                }
            }
            this.f28660c = m3Var;
            this.f28659b = n.t(bArr, 0, bArr.length - 2);
        }
    }
}
