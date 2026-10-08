package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f35024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<e> f35025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f35026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f35027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f35028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f35029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f35030g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35031a;

        static {
            int[] iArr = new int[c.a.values().length];
            f35031a = iArr;
            try {
                iArr[c.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private f(e eVar, List<e> list, List<e> list2) {
        this.f35024a = eVar;
        this.f35025b = Collections.unmodifiableList(list);
        this.f35026c = Collections.unmodifiableList(list2);
        float f15 = list.get(list.size() - 1).d().f35016a - eVar.d().f35016a;
        this.f35029f = f15;
        float f16 = eVar.k().f35016a - list2.get(list2.size() - 1).k().f35016a;
        this.f35030g = f16;
        this.f35027d = m(f15, list, true);
        this.f35028e = m(f16, list2, false);
    }

    private e a(List<e> list, float f15, float[] fArr) {
        float[] fArrO = o(list, f15, fArr);
        return fArrO[0] >= 0.5f ? list.get((int) fArrO[2]) : list.get((int) fArrO[1]);
    }

    private static int b(e eVar, float f15) {
        for (int iJ = eVar.j(); iJ < eVar.h().size(); iJ++) {
            if (f15 == eVar.h().get(iJ).f35018c) {
                return iJ;
            }
        }
        return eVar.h().size() - 1;
    }

    private static int c(e eVar) {
        for (int i15 = 0; i15 < eVar.h().size(); i15++) {
            if (!eVar.h().get(i15).f35020e) {
                return i15;
            }
        }
        return -1;
    }

    private static int d(e eVar, float f15) {
        for (int iC = eVar.c() - 1; iC >= 0; iC--) {
            if (f15 == eVar.h().get(iC).f35018c) {
                return iC;
            }
        }
        return 0;
    }

    private static int e(e eVar) {
        for (int size = eVar.h().size() - 1; size >= 0; size--) {
            if (!eVar.h().get(size).f35020e) {
                return size;
            }
        }
        return -1;
    }

    static f f(wi.a aVar, e eVar, float f15, float f16, float f17, c.a aVar2) {
        return new f(eVar, p(aVar, eVar, f15, f16, aVar2), n(aVar, eVar, f15, f17, aVar2));
    }

    private static float[] m(float f15, List<e> list, boolean z15) {
        int size = list.size();
        float[] fArr = new float[size];
        int i15 = 1;
        while (i15 < size) {
            int i16 = i15 - 1;
            e eVar = list.get(i16);
            e eVar2 = list.get(i15);
            fArr[i15] = i15 == size + (-1) ? 1.0f : fArr[i16] + ((z15 ? eVar2.d().f35016a - eVar.d().f35016a : eVar.k().f35016a - eVar2.k().f35016a) / f15);
            i15++;
        }
        return fArr;
    }

    private static List<e> n(wi.a aVar, e eVar, float f15, float f16, c.a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int iE = e(eVar);
        int iB = aVar.g() ? aVar.b() : aVar.c();
        if (!r(aVar, eVar) && iE != -1) {
            int iJ = iE - eVar.j();
            float f17 = eVar.d().f35017b - (eVar.d().f35019d / 2.0f);
            if (iJ <= 0 && eVar.i().f35021f > 0.0f) {
                arrayList.add(x(eVar, (f17 - eVar.i().f35021f) - f16, iB));
                return arrayList;
            }
            float f18 = 0.0f;
            int i15 = 0;
            while (i15 < iJ) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i16 = iE - i15;
                float f19 = f18 + eVar.h().get(i16).f35021f;
                int i17 = i16 + 1;
                int i18 = iB;
                e eVarT = t(eVar2, iE, i17 < eVar.h().size() ? d(eVar2, eVar.h().get(i17).f35018c) + 1 : 0, f17 - f19, eVar.c() + i15 + 1, eVar.j() + i15 + 1, i18);
                if (i15 == iJ - 1 && f16 > 0.0f) {
                    eVarT = u(eVarT, f16, i18, false, f15, aVar2);
                    i18 = i18;
                }
                arrayList.add(eVarT);
                i15++;
                iB = i18;
                f18 = f19;
            }
        } else if (f16 > 0.0f) {
            arrayList.add(u(eVar, f16, iB, false, f15, aVar2));
        }
        return arrayList;
    }

    private static float[] o(List<e> list, float f15, float[] fArr) {
        int size = list.size();
        float f16 = fArr[0];
        int i15 = 1;
        while (i15 < size) {
            float f17 = fArr[i15];
            if (f15 <= f17) {
                return new float[]{si.a.b(0.0f, 1.0f, f16, f17, f15), i15 - 1, i15};
            }
            i15++;
            f16 = f17;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<e> p(wi.a aVar, e eVar, float f15, float f16, c.a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int iC = c(eVar);
        int iB = aVar.g() ? aVar.b() : aVar.c();
        if (!q(eVar) && iC != -1) {
            int iC2 = eVar.c() - iC;
            float f17 = eVar.d().f35017b - (eVar.d().f35019d / 2.0f);
            if (iC2 <= 0 && eVar.b().f35021f > 0.0f) {
                arrayList.add(x(eVar, f17 + eVar.b().f35021f + f16, iB));
                return arrayList;
            }
            float f18 = 0.0f;
            for (int i15 = 0; i15 < iC2; i15++) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i16 = iC + i15;
                int size = eVar.h().size() - 1;
                f18 += eVar.h().get(i16).f35021f;
                int i17 = i16 - 1;
                if (i17 >= 0) {
                    size = b(eVar2, eVar.h().get(i17).f35018c) - 1;
                }
                int i18 = iB;
                e eVarT = t(eVar2, iC, size, f17 + f18, (eVar.c() - i15) - 1, (eVar.j() - i15) - 1, i18);
                iB = i18;
                if (i15 == iC2 - 1 && f16 > 0.0f) {
                    eVarT = u(eVarT, f16, iB, true, f15, aVar2);
                }
                arrayList.add(eVarT);
            }
        } else if (f16 > 0.0f) {
            arrayList.add(u(eVar, f16, iB, true, f15, aVar2));
        }
        return arrayList;
    }

    private static boolean q(e eVar) {
        return eVar.b().f35017b - (eVar.b().f35019d / 2.0f) >= 0.0f && eVar.b() == eVar.e();
    }

    private static boolean r(wi.a aVar, e eVar) {
        int iC = aVar.c();
        if (aVar.g()) {
            iC = aVar.b();
        }
        return eVar.i().f35017b + (eVar.i().f35019d / 2.0f) <= ((float) iC) && eVar.i() == eVar.l();
    }

    private static e s(List<e> list, float f15, float[] fArr) {
        float[] fArrO = o(list, f15, fArr);
        return e.o(list.get((int) fArrO[1]), list.get((int) fArrO[2]), fArrO[0]);
    }

    private static e t(e eVar, int i15, int i16, float f15, int i17, int i18, int i19) {
        ArrayList arrayList = new ArrayList(eVar.h());
        arrayList.add(i16, (e.c) arrayList.remove(i15));
        e.b bVar = new e.b(eVar.g(), i19);
        int i25 = 0;
        while (i25 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i25);
            float f16 = cVar.f35019d;
            bVar.e(f15 + (f16 / 2.0f), cVar.f35018c, f16, i25 >= i17 && i25 <= i18, cVar.f35020e, cVar.f35021f);
            f15 += cVar.f35019d;
            i25++;
        }
        return bVar.i();
    }

    private static e u(e eVar, float f15, int i15, boolean z15, float f16, c.a aVar) {
        return a.f35031a[aVar.ordinal()] != 1 ? w(eVar, f15, i15, z15) : v(eVar, f15, i15, z15, f16);
    }

    private static e v(e eVar, float f15, int i15, boolean z15, float f16) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i15);
        float fM = f15 / eVar.m();
        float f17 = z15 ? f15 : 0.0f;
        int i16 = 0;
        while (i16 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i16);
            if (cVar.f35020e) {
                bVar.e(cVar.f35017b, cVar.f35018c, cVar.f35019d, false, true, cVar.f35021f);
            } else {
                boolean z16 = i16 >= eVar.c() && i16 <= eVar.j();
                float f18 = cVar.f35019d - fM;
                float fB = c.b(f18, eVar.g(), f16);
                float f19 = (f18 / 2.0f) + f17;
                float fAbs = Math.abs(f19 - cVar.f35017b);
                bVar.f(f19, fB, f18, z16, false, cVar.f35021f, z15 ? fAbs : 0.0f, z15 ? 0.0f : fAbs);
                f17 += f18;
            }
            i16++;
        }
        return bVar.i();
    }

    private static e w(e eVar, float f15, int i15, boolean z15) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i15);
        boolean z16 = true;
        int size = z15 ? 0 : arrayList.size() - 1;
        int i16 = 0;
        while (i16 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i16);
            if (cVar.f35020e && i16 == size) {
                bVar.e(cVar.f35017b, cVar.f35018c, cVar.f35019d, false, true, cVar.f35021f);
            } else {
                float f16 = cVar.f35017b;
                float f17 = z15 ? f16 + f15 : f16 - f15;
                float f18 = z15 ? f15 : 0.0f;
                float f19 = z15 ? 0.0f : f15;
                boolean z17 = (i16 < eVar.c() || i16 > eVar.j()) ? false : z16;
                float f25 = f17;
                float f26 = cVar.f35018c;
                float f27 = cVar.f35019d;
                bVar.f(f25, f26, f27, z17, cVar.f35020e, Math.abs(z15 ? Math.max(0.0f, ((f27 / 2.0f) + f25) - i15) : Math.min(0.0f, f25 - (f27 / 2.0f))), f18, f19);
            }
            i16++;
            z16 = true;
        }
        return bVar.i();
    }

    private static e x(e eVar, float f15, int i15) {
        return t(eVar, 0, 0, f15, eVar.c(), eVar.j(), i15);
    }

    e g() {
        return this.f35024a;
    }

    e h() {
        List<e> list = this.f35026c;
        return list.get(list.size() - 1);
    }

    Map<Integer, e> i(int i15, int i16, int i17, boolean z15) {
        float fG = this.f35024a.g();
        HashMap map = new HashMap();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 >= i15) {
                break;
            }
            int i25 = z15 ? (i15 - i18) - 1 : i18;
            if (i25 * fG * (z15 ? -1 : 1) > i17 - this.f35030g || i18 >= i15 - this.f35026c.size()) {
                Integer numValueOf = Integer.valueOf(i25);
                List<e> list = this.f35026c;
                map.put(numValueOf, list.get(c6.a.b(i19, 0, list.size() - 1)));
                i19++;
            }
            i18++;
        }
        int i26 = 0;
        for (int i27 = i15 - 1; i27 >= 0; i27--) {
            int i28 = z15 ? (i15 - i27) - 1 : i27;
            if (i28 * fG * (z15 ? -1 : 1) < i16 + this.f35029f || i27 < this.f35025b.size()) {
                Integer numValueOf2 = Integer.valueOf(i28);
                List<e> list2 = this.f35025b;
                map.put(numValueOf2, list2.get(c6.a.b(i26, 0, list2.size() - 1)));
                i26++;
            }
        }
        return map;
    }

    public e j(float f15, float f16, float f17) {
        return k(f15, f16, f17, false);
    }

    e k(float f15, float f16, float f17, boolean z15) {
        float fB;
        List<e> list;
        float[] fArr;
        float f18 = this.f35029f + f16;
        float f19 = f17 - this.f35030g;
        float f25 = l().b().f35022g;
        float f26 = h().b().f35023h;
        if (this.f35029f == f25) {
            f18 += f25;
        }
        if (this.f35030g == f26) {
            f19 -= f26;
        }
        if (f15 < f18) {
            fB = si.a.b(1.0f, 0.0f, f16, f18, f15);
            list = this.f35025b;
            fArr = this.f35027d;
        } else {
            if (f15 <= f19) {
                return this.f35024a;
            }
            fB = si.a.b(0.0f, 1.0f, f19, f17, f15);
            list = this.f35026c;
            fArr = this.f35028e;
        }
        return z15 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    e l() {
        List<e> list = this.f35025b;
        return list.get(list.size() - 1);
    }
}
