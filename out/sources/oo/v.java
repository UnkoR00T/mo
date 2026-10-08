package oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class v extends t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f147250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f147251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f147252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<Object> f147253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f147254p;

    class a extends q {
        a() {
        }

        @Override // oo.q
        public List<Number> a(List<Number> list, p pVar) {
            return v.this.f(list, pVar);
        }
    }

    public v(to.c cVar, String str, String str2, int i15, List<Object> list, int i16, int i17) {
        super(cVar, str, str2);
        this.f147252n = 0;
        this.f147254p = i15;
        this.f147253o = list;
        this.f147250l = i16;
        this.f147251m = i17;
        r(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Number> f(List<Number> list, p pVar) {
        boolean z15 = true;
        this.f147246k++;
        String str = p.f147230c.get(pVar.a());
        if ("hstem".equals(str)) {
            v(p(list, list.size() % 2 != 0), true);
            return null;
        }
        if ("vstem".equals(str)) {
            v(p(list, list.size() % 2 != 0), false);
            return null;
        }
        if ("vmoveto".equals(str)) {
            List<Number> listP = p(list, list.size() > 1);
            w();
            n(listP, pVar);
            return null;
        }
        if ("rlineto".equals(str)) {
            o(x(list, 2), pVar);
            return null;
        }
        if ("hlineto".equals(str)) {
            t(list, true);
            return null;
        }
        if ("vlineto".equals(str)) {
            t(list, false);
            return null;
        }
        if ("rrcurveto".equals(str)) {
            o(x(list, 6), pVar);
            return null;
        }
        if ("endchar".equals(str)) {
            if (list.size() != 5 && list.size() != 1) {
                z15 = false;
            }
            List<Number> listP2 = p(list, z15);
            q();
            if (listP2.size() != 4) {
                n(listP2, pVar);
                return null;
            }
            listP2.add(0, 0);
            n(listP2, new p(12, 6));
            return null;
        }
        if ("rmoveto".equals(str)) {
            List<Number> listP3 = p(list, list.size() > 2);
            w();
            n(listP3, pVar);
            return null;
        }
        if ("hmoveto".equals(str)) {
            List<Number> listP4 = p(list, list.size() > 1);
            w();
            n(listP4, pVar);
            return null;
        }
        if ("vhcurveto".equals(str)) {
            s(list, false);
            return null;
        }
        if ("hvcurveto".equals(str)) {
            s(list, true);
            return null;
        }
        if ("hflex".equals(str)) {
            if (list.size() < 7) {
                return null;
            }
            o(Arrays.asList(Arrays.asList(list.get(0), 0, list.get(1), list.get(2), list.get(3), 0), Arrays.asList(list.get(4), 0, list.get(5), Float.valueOf(-list.get(2).floatValue()), list.get(6), 0)), new p(8));
            return null;
        }
        if ("flex".equals(str)) {
            o(Arrays.asList(list.subList(0, 6), list.subList(6, 12)), new p(8));
            return null;
        }
        if ("hflex1".equals(str)) {
            if (list.size() < 9) {
                return null;
            }
            o(Arrays.asList(Arrays.asList(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), 0), Arrays.asList(list.get(5), 0, list.get(6), list.get(7), list.get(8), 0)), new p(8));
            return null;
        }
        if ("flex1".equals(str)) {
            int iIntValue = 0;
            int iIntValue2 = 0;
            for (int i15 = 0; i15 < 5; i15++) {
                int i16 = i15 * 2;
                iIntValue += list.get(i16).intValue();
                iIntValue2 += list.get(i16 + 1).intValue();
            }
            o(Arrays.asList(list.subList(0, 6), Arrays.asList(list.get(6), list.get(7), list.get(8), list.get(9), Math.abs(iIntValue) > Math.abs(iIntValue2) ? list.get(10) : Integer.valueOf(-iIntValue), Math.abs(iIntValue) > Math.abs(iIntValue2) ? Integer.valueOf(-iIntValue2) : list.get(10))), new p(8));
            return null;
        }
        if ("hstemhm".equals(str)) {
            v(p(list, list.size() % 2 != 0), true);
            return null;
        }
        if ("hintmask".equals(str) || "cntrmask".equals(str)) {
            List<Number> listP5 = p(list, list.size() % 2 != 0);
            if (listP5.isEmpty()) {
                return null;
            }
            v(listP5, false);
            return null;
        }
        if ("vstemhm".equals(str)) {
            v(p(list, list.size() % 2 != 0), false);
            return null;
        }
        if ("rcurveline".equals(str)) {
            if (list.size() < 2) {
                return null;
            }
            o(x(list.subList(0, list.size() - 2), 6), new p(8));
            n(list.subList(list.size() - 2, list.size()), new p(5));
            return null;
        }
        if ("rlinecurve".equals(str)) {
            if (list.size() < 6) {
                return null;
            }
            o(x(list.subList(0, list.size() - 6), 2), new p(5));
            n(list.subList(list.size() - 6, list.size()), new p(8));
            return null;
        }
        if ("vvcurveto".equals(str)) {
            u(list, false);
            return null;
        }
        if ("hhcurveto".equals(str)) {
            u(list, true);
            return null;
        }
        n(list, pVar);
        return null;
    }

    private void n(List<Number> list, p pVar) {
        this.f147245j.addAll(list);
        this.f147245j.add(pVar);
    }

    private void o(List<List<Number>> list, p pVar) {
        Iterator<List<Number>> it = list.iterator();
        while (it.hasNext()) {
            n(it.next(), pVar);
        }
    }

    private List<Number> p(List<Number> list, boolean z15) {
        Float fValueOf = Float.valueOf(0.0f);
        if (this.f147245j.isEmpty()) {
            if (z15) {
                n(Arrays.asList(fValueOf, Float.valueOf(list.get(0).floatValue() + this.f147251m)), new p(13));
                return list.subList(1, list.size());
            }
            n(Arrays.asList(fValueOf, Float.valueOf(this.f147250l)), new p(13));
        }
        return list;
    }

    private void q() {
        p pVar;
        if (this.f147252n > 0) {
            List<Object> list = this.f147245j;
            pVar = (p) list.get(list.size() - 1);
        } else {
            pVar = null;
        }
        p pVar2 = new p(9);
        if (pVar == null || pVar2.equals(pVar)) {
            return;
        }
        n(Collections.EMPTY_LIST, pVar2);
    }

    private void r(List<Object> list) {
        this.f147245j = new ArrayList();
        this.f147252n = 0;
        new a().b(list);
    }

    private void s(List<Number> list, boolean z15) {
        List<Number> listSubList = list;
        boolean z16 = z15;
        while (true) {
            int i15 = 4;
            if (listSubList.size() < 4) {
                return;
            }
            boolean z17 = listSubList.size() == 5;
            if (z16) {
                n(Arrays.asList(listSubList.get(0), 0, listSubList.get(1), listSubList.get(2), z17 ? listSubList.get(4) : 0, listSubList.get(3)), new p(8));
            } else {
                n(Arrays.asList(0, listSubList.get(0), listSubList.get(1), listSubList.get(2), listSubList.get(3), z17 ? listSubList.get(4) : 0), new p(8));
            }
            if (z17) {
                i15 = 5;
            }
            listSubList = listSubList.subList(i15, listSubList.size());
            z16 = !z16;
        }
    }

    private void t(List<Number> list, boolean z15) {
        while (!list.isEmpty()) {
            n(list.subList(0, 1), new p(z15 ? 6 : 7));
            list = list.subList(1, list.size());
            z15 = !z15;
        }
    }

    private void u(List<Number> list, boolean z15) {
        int i15;
        List<Number> listSubList = list;
        while (true) {
            if (listSubList.size() < 4) {
                return;
            }
            int i16 = listSubList.size() % 4 == 1 ? 1 : 0;
            if (z15) {
                i15 = 4;
                n(Arrays.asList(listSubList.get(i16), i16 != 0 ? listSubList.get(0) : 0, listSubList.get(i16 != 0 ? 2 : 1), listSubList.get(i16 != 0 ? 3 : 2), listSubList.get(i16 == 0 ? 3 : 4), 0), new p(8));
            } else {
                i15 = 4;
                n(Arrays.asList(i16 != 0 ? listSubList.get(0) : 0, listSubList.get(i16), listSubList.get(i16 != 0 ? 2 : 1), listSubList.get(i16 != 0 ? 3 : 2), 0, listSubList.get(i16 != 0 ? 4 : 3)), new p(8));
            }
            listSubList = listSubList.subList(i16 != 0 ? 5 : i15, listSubList.size());
        }
    }

    private void v(List<Number> list, boolean z15) {
    }

    private void w() {
        if (this.f147252n > 0) {
            q();
        }
        this.f147252n++;
    }

    private static <E> List<List<E>> x(List<E> list, int i15) {
        int size = list.size() / i15;
        ArrayList arrayList = new ArrayList(size);
        int i16 = 0;
        while (i16 < size) {
            int i17 = i16 * i15;
            i16++;
            arrayList.add(list.subList(i17, i16 * i15));
        }
        return arrayList;
    }
}
