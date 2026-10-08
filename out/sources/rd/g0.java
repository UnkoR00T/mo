package rd;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements n0<ud.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f173185a = new g0();

    private g0() {
    }

    @Override // rd.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.d a(sd.c cVar, float f15) {
        boolean z15 = cVar.y() == sd.c.b.BEGIN_ARRAY;
        if (z15) {
            cVar.h();
        }
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.p()) {
            cVar.G0();
        }
        if (z15) {
            cVar.m();
        }
        return new ud.d((fNextDouble / 100.0f) * f15, (fNextDouble2 / 100.0f) * f15);
    }
}
