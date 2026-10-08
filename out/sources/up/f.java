package up;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class f implements b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fp.b f199569a;

    public f(fp.b bVar) {
        this.f199569a = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fp.b bVar = this.f199569a;
        if (bVar != null) {
            try {
                bVar.close();
            } finally {
                this.f199569a = null;
            }
        }
    }

    @Override // up.b
    public InputStream getContent() {
        return this.f199569a.c0();
    }
}
