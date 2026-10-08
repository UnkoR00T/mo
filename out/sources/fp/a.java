package fp;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class a extends FilterOutputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f65741c = {13, 10};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f65742d = {10};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f65743e = {10};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f65744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f65745b;

    public a(OutputStream outputStream) {
        super(outputStream);
        this.f65744a = 0L;
        this.f65745b = false;
    }

    public long b() {
        return this.f65744a;
    }

    public boolean h() {
        return this.f65745b;
    }

    public void m(boolean z15) {
        this.f65745b = z15;
    }

    public void p() throws IOException {
        write(f65741c);
    }

    public void r() throws IOException {
        if (h()) {
            return;
        }
        write(f65743e);
        m(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        m(false);
        ((FilterOutputStream) this).out.write(bArr, i15, i16);
        this.f65744a += (long) i16;
    }

    public a(OutputStream outputStream, long j15) {
        super(outputStream);
        this.f65745b = false;
        this.f65744a = j15;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i15) throws IOException {
        m(false);
        ((FilterOutputStream) this).out.write(i15);
        this.f65744a++;
    }
}
