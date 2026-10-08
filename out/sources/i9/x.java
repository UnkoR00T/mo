package i9;

import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0.a f90498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f90500e;

    public x(boolean z15, String str, int i15, byte[] bArr, int i16, int i17, byte[] bArr2) {
        zj.p.d((bArr2 == null) ^ (i15 == 0));
        this.f90496a = z15;
        this.f90497b = str;
        this.f90499d = i15;
        this.f90500e = bArr2;
        this.f90498c = new s0.a(a(str), bArr, i16, i17);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b15 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b15 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b15 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b15 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b15 = 3;
                }
                break;
        }
        switch (b15) {
            case 0:
            case 1:
                return 2;
            default:
                w7.t.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
