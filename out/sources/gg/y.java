package gg;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class y extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f72748e;

    y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f72748e = bArr;
    }

    @Override // gg.x
    final byte[] m3() {
        return this.f72748e;
    }
}
