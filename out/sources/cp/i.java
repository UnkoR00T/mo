package cp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class i extends l {
    i() {
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) {
        return b(inputStream, outputStream, dVar, i15, j.f37213g);
    }

    @Override // cp.l
    public k b(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15, j jVar) throws IOException {
        dp.a.c(inputStream, outputStream);
        return new k(dVar);
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) {
        throw new UnsupportedOperationException("DCTFilter encoding not implemented, use the JPEGFactory methods instead");
    }
}
