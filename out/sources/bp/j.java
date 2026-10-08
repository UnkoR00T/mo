package bp;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f20953b = {110, 117, 108, 108};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f20954c = new j();

    private j() {
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.m(this);
    }

    public void i3(OutputStream outputStream) throws IOException {
        outputStream.write(f20953b);
    }

    public String toString() {
        return "COSNull{}";
    }
}
