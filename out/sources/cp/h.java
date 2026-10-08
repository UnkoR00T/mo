package cp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class h extends l {
    h() {
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws IOException {
        bp.i iVar = (bp.i) dVar.p4(bp.i.M5);
        if (iVar == null || iVar.equals(bp.i.f20847q4)) {
            new o().a(inputStream, outputStream, dVar, i15);
            return new k(dVar);
        }
        throw new IOException("Unsupported crypt filter " + iVar.A3());
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        bp.i iVar = (bp.i) dVar.p4(bp.i.M5);
        if (iVar == null || iVar.equals(bp.i.f20847q4)) {
            new o().c(inputStream, outputStream, dVar);
            return;
        }
        throw new IOException("Unsupported crypt filter " + iVar.A3());
    }
}
