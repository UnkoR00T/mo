package u;

import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import v.g3;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements g0.a0<a, g0.b0<byte[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0.d f193356a;

    static abstract class a {
        a() {
        }

        static a c(g0.b0<androidx.camera.core.o> b0Var, int i15) {
            return new d(b0Var, i15);
        }

        abstract int a();

        abstract g0.b0<androidx.camera.core.o> b();
    }

    c0(g3 g3Var) {
        this.f193356a = new e0.d(g3Var);
    }

    private static y.f b(byte[] bArr) throws o.v0 {
        try {
            return y.f.k(new ByteArrayInputStream(bArr));
        } catch (IOException e15) {
            throw new o.v0(0, "Failed to extract Exif from YUV-generated JPEG", e15);
        }
    }

    private g0.b0<byte[]> c(a aVar, int i15) {
        g0.b0<androidx.camera.core.o> b0VarB = aVar.b();
        byte[] bArrA = this.f193356a.a(b0VarB.c());
        y.f fVarD = b0VarB.d();
        Objects.requireNonNull(fVarD);
        return g0.b0.m(bArrA, fVarD, i15, b0VarB.h(), b0VarB.b(), b0VarB.f(), b0VarB.g(), b0VarB.a());
    }

    private g0.b0<byte[]> d(a aVar) throws o.v0 {
        g0.b0<androidx.camera.core.o> b0VarB = aVar.b();
        androidx.camera.core.o oVarC = b0VarB.c();
        Rect rectB = b0VarB.b();
        try {
            byte[] bArrN = f0.b.n(oVarC, rectB, aVar.a(), b0VarB.f());
            return g0.b0.m(bArrN, b(bArrN), 256, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), b0VarB.f(), y.x.u(b0VarB.g(), rectB), b0VarB.a());
        } catch (f0.b.a e15) {
            throw new o.v0(1, "Failed to encode the image to JPEG.", e15);
        }
    }

    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.b0<byte[]> apply(a aVar) {
        g0.b0<byte[]> b0VarD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                b0VarD = c(aVar, iE);
            } else {
                b0VarD = d(aVar);
            }
            aVar.b().c().close();
            return b0VarD;
        } catch (Throwable th4) {
            aVar.b().c().close();
            throw th4;
        }
    }
}
