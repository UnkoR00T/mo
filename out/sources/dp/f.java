package dp;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class f extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f43657a;

    public f(h hVar) {
        this.f43657a = hVar;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) {
        this.f43657a.write(bArr, i15, i16);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f43657a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i15) {
        this.f43657a.write(i15);
    }
}
