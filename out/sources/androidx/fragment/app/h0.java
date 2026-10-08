package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f12533b = new StringBuilder(128);

    h0(String str) {
        this.f12532a = str;
    }

    private void b() {
        if (this.f12533b.length() > 0) {
            this.f12533b.toString();
            StringBuilder sb5 = this.f12533b;
            sb5.delete(0, sb5.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            char c15 = cArr[i15 + i17];
            if (c15 == '\n') {
                b();
            } else {
                this.f12533b.append(c15);
            }
        }
    }
}
