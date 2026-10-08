package rd;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static sd.c.a f173226a = sd.c.a.a("k");

    static <T> List<ud.a<T>> a(sd.c cVar, fd.f fVar, float f15, n0<T> n0Var, boolean z15) {
        sd.c cVar2;
        fd.f fVar2;
        float f16;
        n0<T> n0Var2;
        boolean z16;
        ArrayList arrayList = new ArrayList();
        if (cVar.y() == sd.c.b.STRING) {
            fVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.Y();
        while (cVar.p()) {
            if (cVar.E(f173226a) != 0) {
                cVar.G0();
            } else if (cVar.y() == sd.c.b.BEGIN_ARRAY) {
                cVar.h();
                if (cVar.y() == sd.c.b.NUMBER) {
                    sd.c cVar3 = cVar;
                    fd.f fVar3 = fVar;
                    float f17 = f15;
                    n0<T> n0Var3 = n0Var;
                    boolean z17 = z15;
                    ud.a aVarC = t.c(cVar3, fVar3, f17, n0Var3, false, z17);
                    cVar2 = cVar3;
                    fVar2 = fVar3;
                    f16 = f17;
                    n0Var2 = n0Var3;
                    z16 = z17;
                    arrayList.add(aVarC);
                } else {
                    cVar2 = cVar;
                    fVar2 = fVar;
                    f16 = f15;
                    n0Var2 = n0Var;
                    z16 = z15;
                    while (cVar2.p()) {
                        arrayList.add(t.c(cVar2, fVar2, f16, n0Var2, true, z16));
                    }
                }
                cVar2.m();
                cVar = cVar2;
                fVar = fVar2;
                f15 = f16;
                n0Var = n0Var2;
                z15 = z16;
            } else {
                sd.c cVar4 = cVar;
                arrayList.add(t.c(cVar4, fVar, f15, n0Var, false, z15));
                cVar = cVar4;
            }
        }
        cVar.h0();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends ud.a<T>> list) {
        int i15;
        T t15;
        int size = list.size();
        int i16 = 0;
        while (true) {
            i15 = size - 1;
            if (i16 >= i15) {
                break;
            }
            ud.a<T> aVar = list.get(i16);
            i16++;
            ud.a<T> aVar2 = list.get(i16);
            aVar.f197582h = Float.valueOf(aVar2.f197581g);
            if (aVar.f197577c == null && (t15 = aVar2.f197576b) != null) {
                aVar.f197577c = t15;
                if (aVar instanceof id.i) {
                    ((id.i) aVar).j();
                }
            }
        }
        ud.a<T> aVar3 = list.get(i15);
        if ((aVar3.f197576b == null || aVar3.f197577c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
