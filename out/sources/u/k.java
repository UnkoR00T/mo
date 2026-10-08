package u;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k implements g0.a0<b, g0.b0<byte[]>> {

    private static class a {
        static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    public static abstract class b {
        public static b c(g0.b0<Bitmap> b0Var, int i15) {
            return new u.a(b0Var, i15);
        }

        abstract int a();

        abstract g0.b0<Bitmap> b();
    }

    private static int b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) ? 256 : 4101;
    }

    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.b0<byte[]> apply(b bVar) {
        g0.b0<Bitmap> b0VarB = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b0VarB.c().compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        y.f fVarD = b0VarB.d();
        Objects.requireNonNull(fVarD);
        return g0.b0.m(byteArray, fVarD, b(b0VarB.c()), b0VarB.h(), b0VarB.b(), b0VarB.f(), b0VarB.g(), b0VarB.a());
    }
}
