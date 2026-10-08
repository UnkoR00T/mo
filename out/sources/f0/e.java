package f0;

import android.util.Size;
import v.f2;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static void a(w3.b<?, ?, ?> bVar, int i15) {
        Size sizeS;
        f2 f2Var = (f2) bVar.d();
        int I = f2Var.I(-1);
        if (I == -1 || I != i15) {
            ((f2.a) bVar).b(i15);
        }
        if (I == -1 || i15 == -1 || I == i15) {
            return;
        }
        if (Math.abs(y.c.b(i15) - y.c.b(I)) % 180 != 90 || (sizeS = f2Var.S(null)) == null) {
            return;
        }
        ((f2.a) bVar).c(new Size(sizeS.getHeight(), sizeS.getWidth()));
    }
}
