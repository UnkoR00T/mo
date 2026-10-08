package v9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f205279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f205280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f205281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f205282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f205283e;

    public w(int i15, int i16) {
        this.f205279a = i15;
        byte[] bArr = new byte[i16 + 3];
        this.f205282d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i15, int i16) {
        if (this.f205280b) {
            int i17 = i16 - i15;
            byte[] bArr2 = this.f205282d;
            int length = bArr2.length;
            int i18 = this.f205283e;
            if (length < i18 + i17) {
                this.f205282d = Arrays.copyOf(bArr2, (i18 + i17) * 2);
            }
            System.arraycopy(bArr, i15, this.f205282d, this.f205283e, i17);
            this.f205283e += i17;
        }
    }

    public boolean b(int i15) {
        if (!this.f205280b) {
            return false;
        }
        this.f205283e -= i15;
        this.f205280b = false;
        this.f205281c = true;
        return true;
    }

    public boolean c() {
        return this.f205281c;
    }

    public void d() {
        this.f205280b = false;
        this.f205281c = false;
    }

    public void e(int i15) {
        zj.p.w(!this.f205280b);
        boolean z15 = i15 == this.f205279a;
        this.f205280b = z15;
        if (z15) {
            this.f205283e = 3;
            this.f205281c = false;
        }
    }
}
