package up;

import dp.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bp.e f199565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f199566b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f199568d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f199567c = 0;

    private void p(g gVar) {
        this.f199568d = gVar;
        ep.f fVar = new ep.f(this.f199568d);
        fVar.V0();
        this.f199565a = fVar.e0();
    }

    public int b() {
        return this.f199567c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            bp.e eVar = this.f199565a;
            if (eVar != null) {
                eVar.close();
            }
        } finally {
            g gVar = this.f199568d;
            if (gVar != null) {
                gVar.close();
            }
        }
    }

    public int h() {
        return this.f199566b;
    }

    public bp.e m() {
        return this.f199565a;
    }

    public void r(int i15) {
        this.f199567c = i15;
    }

    public void u(InputStream inputStream) {
        p(new dp.d(inputStream));
    }
}
