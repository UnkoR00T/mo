package rd;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i implements n0<md.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f173189a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173190b = sd.c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private i() {
    }

    @Override // rd.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public md.b a(sd.c cVar, float f15) {
        md.b.a aVar = md.b.a.CENTER;
        cVar.Y();
        md.b.a aVar2 = aVar;
        String strQ2 = null;
        String strQ3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zR = true;
        while (cVar.p()) {
            switch (cVar.E(f173190b)) {
                case 0:
                    strQ2 = cVar.q2();
                    break;
                case 1:
                    strQ3 = cVar.q2();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cVar.nextInt();
                    aVar2 = md.b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = md.b.a.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = cVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cVar.nextDouble();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fNextDouble4 = (float) cVar.nextDouble();
                    break;
                case 10:
                    zR = cVar.r();
                    break;
                case 11:
                    cVar.h();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f15, ((float) cVar.nextDouble()) * f15);
                    cVar.m();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.h();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f15, ((float) cVar.nextDouble()) * f15);
                    cVar.m();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.H();
                    cVar.G0();
                    break;
            }
        }
        cVar.h0();
        return new md.b(strQ2, strQ3, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zR, pointF, pointF2);
    }
}
