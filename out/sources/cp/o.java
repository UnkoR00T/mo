package cp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class o extends l {
    o() {
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws IOException {
        dp.a.c(inputStream, outputStream);
        outputStream.flush();
        return new k(dVar);
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        dp.a.c(inputStream, outputStream);
        outputStream.flush();
    }
}
