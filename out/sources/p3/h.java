package p3;

import n3.m1;
import n3.m2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJA\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0003"}, d2 = {"Lp3/h;", "", "", "left", "top", "right", "bottom", "Loq/i0;", "j", "(FFFF)V", "Ln3/m1;", "clipOp", "c", "(FFFFI)V", "Ln3/m2;", "path", "e", "(Ln3/m2;I)V", "d", "(FF)V", "degrees", "Lm3/e;", "pivot", "i", "(FJ)V", "scaleX", "scaleY", "h", "(FFJ)V", "Ln3/g2;", "matrix", "b", "([F)V", "Lm3/k;", "a", "()J", "size", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h {
    static /* synthetic */ void f(h hVar, float f15, float f16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i15 & 1) != 0) {
            f15 = 0.0f;
        }
        if ((i15 & 2) != 0) {
            f16 = 0.0f;
        }
        hVar.d(f15, f16);
    }

    static /* synthetic */ void g(h hVar, float f15, float f16, float f17, float f18, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i16 & 1) != 0) {
            f15 = 0.0f;
        }
        if ((i16 & 2) != 0) {
            f16 = 0.0f;
        }
        if ((i16 & 4) != 0) {
            f17 = Float.intBitsToFloat((int) (hVar.a() >> 32));
        }
        if ((i16 & 8) != 0) {
            f18 = Float.intBitsToFloat((int) (hVar.a() & BodyPartID.bodyIdMax));
        }
        if ((i16 & 16) != 0) {
            i15 = m1.INSTANCE.b();
        }
        hVar.c(f15, f16, f17, f18, i15);
    }

    static /* synthetic */ void k(h hVar, m2 m2Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i16 & 2) != 0) {
            i15 = m1.INSTANCE.b();
        }
        hVar.e(m2Var, i15);
    }

    long a();

    void b(float[] matrix);

    void c(float left, float top, float right, float bottom, int clipOp);

    void d(float left, float top);

    void e(m2 path, int clipOp);

    void h(float scaleX, float scaleY, long pivot);

    void i(float degrees, long pivot);

    void j(float left, float top, float right, float bottom);
}
