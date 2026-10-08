package bp;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h[] f20677f = new h[357];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f20678g = g4(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f20679h = g4(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f20680j = g4(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f20681k = g4(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final h f20682l = h4(true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final h f20683m = h4(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20685e;

    private h(long j15, boolean z15) {
        this.f20684d = j15;
        this.f20685e = z15;
    }

    public static h g4(long j15) {
        if (-100 > j15 || j15 > 256) {
            return new h(j15, true);
        }
        int i15 = ((int) j15) + 100;
        h[] hVarArr = f20677f;
        if (hVarArr[i15] == null) {
            hVarArr[i15] = new h(j15, true);
        }
        return hVarArr[i15];
    }

    private static h h4(boolean z15) {
        return z15 ? new h(Long.MAX_VALUE, false) : new h(Long.MIN_VALUE, false);
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.p(this);
    }

    @Override // bp.k
    public int J3() {
        return (int) this.f20684d;
    }

    @Override // bp.k
    public long X3() {
        return this.f20684d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && ((h) obj).J3() == J3();
    }

    public int hashCode() {
        long j15 = this.f20684d;
        return (int) (j15 ^ (j15 >> 32));
    }

    @Override // bp.k
    public float i3() {
        return this.f20684d;
    }

    public boolean i4() {
        return this.f20685e;
    }

    public void j4(OutputStream outputStream) throws IOException {
        outputStream.write(String.valueOf(this.f20684d).getBytes("ISO-8859-1"));
    }

    public String toString() {
        return "COSInt{" + this.f20684d + "}";
    }
}
