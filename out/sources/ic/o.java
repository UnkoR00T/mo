package ic;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90896a = {1, 29};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f90897b = new byte[0];

    @Override // ic.q
    public final byte[] a() {
        throw null;
    }

    @Override // ic.q
    public final byte[] b() {
        return this.f90896a;
    }

    @Override // ic.q
    public final void d(byte[] bArr) {
        this.f90897b = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // ic.q
    public final String getName() {
        return "EfSod";
    }
}
