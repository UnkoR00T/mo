package ep;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
class c extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f52605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52608d;

    c(OutputStream outputStream) {
        super(outputStream);
        this.f52605a = false;
        this.f52606b = false;
        this.f52607c = 0;
        this.f52608d = true;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        try {
            if (this.f52605a && !this.f52606b) {
                super.write(13);
                this.f52607c++;
            }
            this.f52605a = false;
            this.f52606b = false;
            super.flush();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i15, int i16) {
        int i17;
        try {
            if (this.f52607c == 0 && i16 > 10) {
                this.f52608d = false;
                for (0; i17 < 10; i17 + 1) {
                    byte b15 = bArr[i17];
                    i17 = (b15 >= 9 && (b15 <= 10 || b15 >= 32 || b15 == 13)) ? i17 + 1 : 0;
                    this.f52608d = true;
                    break;
                }
            }
            if (this.f52608d) {
                if (this.f52605a) {
                    this.f52605a = false;
                    if (!this.f52606b && i16 == 1 && bArr[i15] == 10) {
                        return;
                    } else {
                        super.write(13);
                    }
                }
                if (this.f52606b) {
                    super.write(10);
                    this.f52606b = false;
                }
                if (i16 > 0) {
                    byte b16 = bArr[(i15 + i16) - 1];
                    if (b16 == 13) {
                        this.f52605a = true;
                        i16--;
                    } else if (b16 == 10) {
                        this.f52606b = true;
                        int i18 = i16 - 1;
                        if (i18 <= 0 || bArr[(i15 + i18) - 1] != 13) {
                            i16 = i18;
                        } else {
                            this.f52605a = true;
                            i16 -= 2;
                        }
                    }
                }
            }
            super.write(bArr, i15, i16);
            this.f52607c += i16;
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
