package u;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements g0.a0<a, o.t0.i> {

    public static abstract class a {
        public static a c(g0.b0<byte[]> b0Var, o.t0.h hVar) {
            return new e(b0Var, hVar);
        }

        abstract o.t0.h a();

        abstract g0.b0<byte[]> b();
    }

    static void b(File file, byte[] bArr) throws o.v0 {
        try {
            FileOutputStream fileOutputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
            try {
                fileOutputStreamA.write(bArr, 0, new e0.c().b(bArr));
                fileOutputStreamA.close();
            } catch (Throwable th4) {
                try {
                    fileOutputStreamA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            throw new o.v0(1, "Failed to write to temp file", e15);
        }
    }

    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.t0.i apply(a aVar) throws o.v0 {
        g0.b0<byte[]> b0VarB = aVar.b();
        o.t0.h hVarA = aVar.a();
        File fileE = a0.e(hVarA);
        b(fileE, b0VarB.c());
        y.f fVarD = b0VarB.d();
        Objects.requireNonNull(fVarD);
        a0.l(fileE, fVarD, hVarA, b0VarB.f());
        return new o.t0.i(a0.j(fileE, hVarA), 256);
    }
}
