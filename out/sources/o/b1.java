package o;

import android.graphics.Matrix;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 implements w0 {
    public static w0 b(t3 t3Var, long j15, int i15, Matrix matrix, int i16) {
        return new d(t3Var, j15, i15, matrix, i16);
    }

    @Override // o.w0
    public void a(y.h.b bVar) {
        bVar.m(e());
    }

    @Override // o.w0
    public abstract int c();

    @Override // o.w0
    public abstract t3 d();

    @Override // o.w0
    public abstract int e();

    public abstract Matrix f();

    @Override // o.w0
    public abstract long getTimestamp();
}
