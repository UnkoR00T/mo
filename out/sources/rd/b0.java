package rd;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f173174a = new b0();

    private b0() {
    }

    @Override // rd.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(sd.c cVar, float f15) {
        sd.c.b bVarY = cVar.y();
        if (bVarY != sd.c.b.BEGIN_ARRAY && bVarY != sd.c.b.BEGIN_OBJECT) {
            if (bVarY == sd.c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.nextDouble()) * f15, ((float) cVar.nextDouble()) * f15);
                while (cVar.p()) {
                    cVar.G0();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarY);
        }
        return s.e(cVar, f15);
    }
}
