package p3;

import n3.e2;
import n3.h1;
import n3.m2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/d;", "Lp3/h;", "b", "(Lp3/d;)Lp3/h;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"p3/b$a", "Lp3/h;", "", "left", "top", "right", "bottom", "Loq/i0;", "j", "(FFFF)V", "Ln3/m1;", "clipOp", "c", "(FFFFI)V", "Ln3/m2;", "path", "e", "(Ln3/m2;I)V", "d", "(FF)V", "degrees", "Lm3/e;", "pivot", "i", "(FJ)V", "scaleX", "scaleY", "h", "(FFJ)V", "Ln3/g2;", "matrix", "b", "([F)V", "Lm3/k;", "a", "()J", "size", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f152582a;

        a(d dVar) {
            this.f152582a = dVar;
        }

        @Override // p3.h
        public long a() {
            return this.f152582a.a();
        }

        @Override // p3.h
        public void b(float[] matrix) {
            this.f152582a.f().t(matrix);
        }

        @Override // p3.h
        public void c(float left, float top, float right, float bottom, int clipOp) {
            this.f152582a.f().c(left, top, right, bottom, clipOp);
        }

        @Override // p3.h
        public void d(float left, float top) {
            this.f152582a.f().d(left, top);
        }

        @Override // p3.h
        public void e(m2 path, int clipOp) {
            this.f152582a.f().e(path, clipOp);
        }

        @Override // p3.h
        public void h(float scaleX, float scaleY, long pivot) {
            h1 h1VarF = this.f152582a.f();
            int i15 = (int) (pivot >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i15);
            int i16 = (int) (pivot & BodyPartID.bodyIdMax);
            h1VarF.d(fIntBitsToFloat, Float.intBitsToFloat(i16));
            h1VarF.f(scaleX, scaleY);
            h1VarF.d(-Float.intBitsToFloat(i15), -Float.intBitsToFloat(i16));
        }

        @Override // p3.h
        public void i(float degrees, long pivot) {
            h1 h1VarF = this.f152582a.f();
            int i15 = (int) (pivot >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i15);
            int i16 = (int) (pivot & BodyPartID.bodyIdMax);
            h1VarF.d(fIntBitsToFloat, Float.intBitsToFloat(i16));
            h1VarF.n(degrees);
            h1VarF.d(-Float.intBitsToFloat(i15), -Float.intBitsToFloat(i16));
        }

        @Override // p3.h
        public void j(float left, float top, float right, float bottom) {
            h1 h1VarF = this.f152582a.f();
            d dVar = this.f152582a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (a() >> 32)) - (right + left);
            long jD = m3.k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (a() & BodyPartID.bodyIdMax)) - (bottom + top))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
            if (!(Float.intBitsToFloat((int) (jD >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jD & BodyPartID.bodyIdMax)) >= 0.0f)) {
                e2.a("Width and height must be greater than or equal to zero");
            }
            dVar.g(jD);
            h1VarF.d(left, top);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(d dVar) {
        return new a(dVar);
    }
}
