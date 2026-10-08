package u;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class z implements g0.a0<a, o.t0.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DngCreator f193494a;

    static abstract class a {
        a() {
        }

        static a d(androidx.camera.core.o oVar, int i15, o.t0.h hVar) {
            return new c(oVar, i15, hVar);
        }

        abstract androidx.camera.core.o a();

        abstract o.t0.h b();

        abstract int c();
    }

    public z(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    static int b(int i15) {
        if (i15 == 0) {
            return 1;
        }
        if (i15 == 90) {
            return 6;
        }
        if (i15 != 180) {
            return i15 != 270 ? 0 : 8;
        }
        return 3;
    }

    private void c(File file, androidx.camera.core.o oVar, int i15) {
        try {
            try {
                try {
                    try {
                        FileOutputStream fileOutputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
                        try {
                            this.f193494a.setOrientation(b(i15));
                            this.f193494a.writeImage(fileOutputStreamA, oVar.m0());
                            fileOutputStreamA.close();
                            oVar.close();
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
                } catch (IllegalStateException e16) {
                    throw new o.v0(1, "Not enough metadata information has been set to write a well-formatted DNG file", e16);
                }
            } catch (IllegalArgumentException e17) {
                throw new o.v0(1, "Image with an unsupported format was used", e17);
            }
        } catch (Throwable th6) {
            oVar.close();
            throw th6;
        }
    }

    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.t0.i apply(a aVar) {
        o.t0.h hVarB = aVar.b();
        File fileE = a0.e(hVarB);
        c(fileE, aVar.a(), aVar.c());
        return new o.t0.i(a0.j(fileE, hVarB), 32);
    }

    z(DngCreator dngCreator) {
        this.f193494a = dngCreator;
    }
}
