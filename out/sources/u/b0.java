package u;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements g0.a0<g0.b0<androidx.camera.core.o>, Bitmap> {
    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(g0.b0<androidx.camera.core.o> b0Var) throws Throwable {
        androidx.camera.core.r rVar;
        Bitmap bitmapM;
        androidx.camera.core.r rVar2 = null;
        try {
            try {
                int iE = b0Var.e();
                if (iE == 35) {
                    androidx.camera.core.o oVarC = b0Var.c();
                    boolean z15 = b0Var.f() % 180 != 0;
                    rVar = new androidx.camera.core.r(androidx.camera.core.p.a(z15 ? oVarC.getHeight() : oVarC.l(), z15 ? oVarC.l() : oVarC.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.o oVarG = ImageProcessingUtil.g(oVarC, rVar, ByteBuffer.allocateDirect(oVarC.l() * oVarC.getHeight() * 4), b0Var.f(), false);
                        oVarC.close();
                        if (oVarG == null) {
                            throw new o.v0(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapM = f0.b.b(oVarG);
                        oVarG.close();
                    } catch (UnsupportedOperationException e15) {
                        e = e15;
                        throw new o.v0(0, "Can't convert " + (b0Var.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th4) {
                        th = th4;
                        rVar2 = rVar;
                        if (rVar2 != null) {
                            rVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (iE != 256 && iE != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + b0Var.e());
                    }
                    androidx.camera.core.o oVarC2 = b0Var.c();
                    Bitmap bitmapB = f0.b.b(oVarC2);
                    oVarC2.close();
                    rVar = null;
                    bitmapM = f0.b.m(bitmapB, b0Var.f());
                }
                if (rVar != null) {
                    rVar.close();
                }
                return bitmapM;
            } catch (UnsupportedOperationException e16) {
                e = e16;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
