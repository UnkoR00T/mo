package hd;

import android.graphics.PointF;
import fd.a0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements s, id.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f83689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.a<Float, Float> f83691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private od.o f83692d;

    public q(a0 a0Var, pd.b bVar, od.n nVar) {
        this.f83689a = a0Var;
        this.f83690b = nVar.c();
        id.a<Float, Float> aVarL = nVar.b().l();
        this.f83691c = aVarL;
        bVar.j(aVarL);
        aVarL.a(this);
    }

    private static int c(int i15, int i16) {
        int i17 = i15 / i16;
        return ((i15 ^ i16) >= 0 || i16 * i17 == i15) ? i17 : i17 - 1;
    }

    private static int g(int i15, int i16) {
        return i15 - (c(i15, i16) * i16);
    }

    private od.o j(od.o oVar) {
        List<md.a> listA = oVar.a();
        boolean zD = oVar.d();
        int size = listA.size() - 1;
        int i15 = 0;
        while (size >= 0) {
            md.a aVar = listA.get(size);
            md.a aVar2 = listA.get(g(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? aVar2.c() : oVar.b();
            i15 = (((size != 0 || zD) ? aVar2.b() : pointFC).equals(pointFC) && aVar.a().equals(pointFC) && !(!oVar.d() && (size == 0 || size == listA.size() - 1))) ? i15 + 2 : i15 + 1;
            size--;
        }
        od.o oVar2 = this.f83692d;
        if (oVar2 == null || oVar2.a().size() != i15) {
            ArrayList arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                arrayList.add(new md.a());
            }
            this.f83692d = new od.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f83692d.e(zD);
        return this.f83692d;
    }

    @Override // id.a.b
    public void a() {
        this.f83689a.invalidateSelf();
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
    }

    @Override // hd.s
    public void e(id.a.b bVar) {
        this.f83691c.a(bVar);
    }

    public id.a<Float, Float> h() {
        return this.f83691c;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // hd.s
    public od.o i(od.o oVar) {
        boolean z15;
        List<md.a> listA = oVar.a();
        if (listA.size() > 2) {
            float fFloatValue = this.f83691c.h().floatValue();
            if (fFloatValue != 0.0f) {
                od.o oVarJ = j(oVar);
                oVarJ.f(oVar.b().x, oVar.b().y);
                List<md.a> listA2 = oVarJ.a();
                boolean zD = oVar.d();
                int i15 = 0;
                int i16 = 0;
                while (i15 < listA.size()) {
                    md.a aVar = listA.get(i15);
                    md.a aVar2 = listA.get(g(i15 - 1, listA.size()));
                    md.a aVar3 = listA.get(g(i15 - 2, listA.size()));
                    PointF pointFC = (i15 != 0 || zD) ? aVar2.c() : oVar.b();
                    PointF pointFB = (i15 != 0 || zD) ? aVar2.b() : pointFC;
                    PointF pointFA = aVar.a();
                    PointF pointFC2 = aVar3.c();
                    PointF pointFC3 = aVar.c();
                    if (oVar.d()) {
                        z15 = false;
                    } else {
                        z15 = true;
                        if (i15 != 0 && i15 != listA.size() - 1) {
                            z15 = false;
                        }
                    }
                    if (pointFB.equals(pointFC) && pointFA.equals(pointFC) && !z15) {
                        float f15 = pointFC.x;
                        float f16 = f15 - pointFC2.x;
                        float f17 = pointFC.y;
                        float f18 = f17 - pointFC2.y;
                        float f19 = pointFC3.x - f15;
                        float f25 = pointFC3.y - f17;
                        float fHypot = (float) Math.hypot(f16, f18);
                        float fHypot2 = (float) Math.hypot(f19, f25);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f26 = pointFC.x;
                        float f27 = ((pointFC2.x - f26) * fMin) + f26;
                        float f28 = pointFC.y;
                        float f29 = ((pointFC2.y - f28) * fMin) + f28;
                        float f35 = ((pointFC3.x - f26) * fMin2) + f26;
                        float f36 = ((pointFC3.y - f28) * fMin2) + f28;
                        float f37 = f27 - ((f27 - f26) * 0.5519f);
                        float f38 = f29 - ((f29 - f28) * 0.5519f);
                        float f39 = f35 - ((f35 - f26) * 0.5519f);
                        float f45 = f36 - ((f36 - f28) * 0.5519f);
                        md.a aVar4 = listA2.get(g(i16 - 1, listA2.size()));
                        md.a aVar5 = listA2.get(i16);
                        aVar4.e(f27, f29);
                        aVar4.f(f27, f29);
                        if (i15 == 0) {
                            oVarJ.f(f27, f29);
                        }
                        aVar5.d(f37, f38);
                        md.a aVar6 = listA2.get(i16 + 1);
                        aVar5.e(f39, f45);
                        aVar5.f(f35, f36);
                        aVar6.d(f35, f36);
                        i16 += 2;
                    } else {
                        md.a aVar7 = listA2.get(g(i16 - 1, listA2.size()));
                        md.a aVar8 = listA2.get(i16);
                        aVar7.e(aVar2.b().x, aVar2.b().y);
                        aVar7.f(aVar2.c().x, aVar2.c().y);
                        aVar8.d(aVar.a().x, aVar.a().y);
                        i16++;
                    }
                    i15++;
                    listA = listA;
                }
                return oVarJ;
            }
        }
        return oVar;
    }
}
