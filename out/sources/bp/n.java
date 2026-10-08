package bp;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<cp.l> f20964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f20965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dp.i f20966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private dp.c f20967d;

    n(List<cp.l> list, d dVar, OutputStream outputStream, dp.i iVar) {
        super(outputStream);
        this.f20964a = list;
        this.f20965b = dVar;
        this.f20966c = iVar;
        if (list.isEmpty()) {
            this.f20967d = null;
        } else {
            this.f20967d = iVar.h();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.f20967d != null) {
                try {
                    for (int size = this.f20964a.size() - 1; size >= 0; size--) {
                        dp.e eVar = new dp.e(this.f20967d);
                        if (size == 0) {
                            try {
                                this.f20964a.get(size).d(eVar, ((FilterOutputStream) this).out, this.f20965b, size);
                            } catch (Throwable th4) {
                                eVar.close();
                                throw th4;
                            }
                        } else {
                            dp.c cVarH = this.f20966c.h();
                            try {
                                dp.f fVar = new dp.f(cVarH);
                                try {
                                    this.f20964a.get(size).d(eVar, fVar, this.f20965b, size);
                                    fVar.close();
                                    dp.c cVar = this.f20967d;
                                    try {
                                        this.f20967d = cVarH;
                                        cVar.close();
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cVarH = cVar;
                                        cVarH.close();
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    fVar.close();
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                        eVar.close();
                    }
                    this.f20967d.close();
                    this.f20967d = null;
                } catch (Throwable th8) {
                    this.f20967d.close();
                    this.f20967d = null;
                    throw th8;
                }
            }
            super.close();
        } catch (Throwable th9) {
            super.close();
            throw th9;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.f20967d == null) {
            super.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        dp.c cVar = this.f20967d;
        if (cVar != null) {
            cVar.write(bArr);
        } else {
            super.write(bArr);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        dp.c cVar = this.f20967d;
        if (cVar != null) {
            cVar.write(bArr, i15, i16);
        } else {
            super.write(bArr, i15, i16);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i15) throws IOException {
        dp.c cVar = this.f20967d;
        if (cVar != null) {
            cVar.write(i15);
        } else {
            super.write(i15);
        }
    }
}
