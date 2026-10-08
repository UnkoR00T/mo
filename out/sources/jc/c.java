package jc;

import oq.z;
import p028con.d3;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f101389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f101390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f101391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3 f101392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AUX.a f101393e;

    public c(byte[] bArr, byte[] bArr2, byte[] bArr3, d3 d3Var, AUX.a aVar) {
        this.f101389a = bArr;
        this.f101390b = bArr2;
        this.f101391c = bArr3;
        this.f101392d = d3Var;
        this.f101393e = aVar;
    }

    public static void a(byte[] bArr, int i15) {
        if (z.e(bArr[i15]) != -1) {
            bArr[i15] = (byte) (bArr[i15] + 1);
            return;
        }
        bArr[i15] = 0;
        if (i15 > 0) {
            a(bArr, i15 - 1);
        }
    }
}
