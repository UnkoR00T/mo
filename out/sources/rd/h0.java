package rd;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements n0<od.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f173187a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173188b = sd.c.a.a("c", "v", "i", "o");

    private h0() {
    }

    @Override // rd.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public od.o a(sd.c cVar, float f15) {
        if (cVar.y() == sd.c.b.BEGIN_ARRAY) {
            cVar.h();
        }
        cVar.Y();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zR = false;
        while (cVar.p()) {
            int iE = cVar.E(f173188b);
            if (iE == 0) {
                zR = cVar.r();
            } else if (iE == 1) {
                listF = s.f(cVar, f15);
            } else if (iE == 2) {
                listF2 = s.f(cVar, f15);
            } else if (iE != 3) {
                cVar.H();
                cVar.G0();
            } else {
                listF3 = s.f(cVar, f15);
            }
        }
        cVar.h0();
        if (cVar.y() == sd.c.b.END_ARRAY) {
            cVar.m();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new od.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i15 = 1; i15 < size; i15++) {
            PointF pointF2 = listF.get(i15);
            int i16 = i15 - 1;
            arrayList.add(new md.a(td.j.a(listF.get(i16), listF3.get(i16)), td.j.a(pointF2, listF2.get(i15)), pointF2));
        }
        if (zR) {
            PointF pointF3 = listF.get(0);
            int i17 = size - 1;
            arrayList.add(new md.a(td.j.a(listF.get(i17), listF3.get(i17)), td.j.a(pointF3, listF2.get(0)), pointF3));
        }
        return new od.o(pointF, zR, arrayList);
    }
}
