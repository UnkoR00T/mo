package p005Con;

import pq.n;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f255b = new int[256];

    static {
        int[] iArr = new int[256];
        f254a = iArr;
        n.C(iArr, -1, 0, 0, 6, null);
        for (int i15 = 0; i15 < 64; i15++) {
            f254a[f1.f256a[i15]] = i15;
        }
        f254a[61] = -2;
        n.C(f255b, -1, 0, 0, 6, null);
        for (int i16 = 0; i16 < 64; i16++) {
            f255b[f1.f257b[i16]] = i16;
        }
        f255b[61] = -2;
    }
}
