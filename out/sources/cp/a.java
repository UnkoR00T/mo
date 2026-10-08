package cp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class a extends l {
    a() {
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(inputStream);
            try {
                dp.a.c(bVar2, outputStream);
                outputStream.flush();
                dp.a.b(bVar2);
                return new k(dVar);
            } catch (Throwable th4) {
                th = th4;
                bVar = bVar2;
                dp.a.b(bVar);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        c cVar = new c(outputStream);
        dp.a.c(inputStream, cVar);
        cVar.close();
        outputStream.flush();
    }
}
