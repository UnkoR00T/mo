package k5;

import j5.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b {

    static class a implements InterfaceC2581b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f108457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f108458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f108459c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f108461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f108462f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f108464h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f108465i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f108460d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f108463g = 0.0f;

        a(float f15, float f16, float f17, String str, String str2) {
            this.f108457a = f15;
            this.f108458b = f16;
            this.f108459c = f17;
            this.f108461e = str == null ? "" : str;
            this.f108462f = str2 == null ? "" : str2;
            this.f108465i = f16;
            this.f108464h = f15;
        }

        public ArrayList<String> a() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i15 = (int) this.f108464h;
            int i16 = (int) this.f108465i;
            int i17 = i15;
            while (i15 <= i16) {
                arrayList.add(this.f108461e + i17 + this.f108462f);
                i17 += (int) this.f108459c;
                i15++;
            }
            return arrayList;
        }

        @Override // k5.b.InterfaceC2581b
        public float value() {
            float f15 = this.f108463g;
            if (f15 >= this.f108465i) {
                this.f108460d = true;
            }
            if (!this.f108460d) {
                this.f108463g = f15 + this.f108459c;
            }
            return this.f108463g;
        }
    }

    /* JADX INFO: renamed from: k5.b$b, reason: collision with other inner class name */
    interface InterfaceC2581b {
        float value();
    }

    static class c implements InterfaceC2581b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f108466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f108467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f108468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f108469d = false;

        c(float f15, float f16) {
            this.f108466a = f15;
            this.f108467b = f16;
            this.f108468c = f15;
        }

        @Override // k5.b.InterfaceC2581b
        public float value() {
            if (!this.f108469d) {
                this.f108468c += this.f108467b;
            }
            return this.f108468c;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HashMap<String, Integer> f108470a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HashMap<String, InterfaceC2581b> f108471b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HashMap<String, ArrayList<String>> f108472c = new HashMap<>();

        float a(Object obj) {
            if (!(obj instanceof i)) {
                if (obj instanceof j5.e) {
                    return ((j5.e) obj).i();
                }
                return 0.0f;
            }
            String strG = ((i) obj).g();
            if (this.f108471b.containsKey(strG)) {
                return this.f108471b.get(strG).value();
            }
            if (this.f108470a.containsKey(strG)) {
                return this.f108470a.get(strG).floatValue();
            }
            return 0.0f;
        }

        ArrayList<String> b(String str) {
            if (this.f108472c.containsKey(str)) {
                return this.f108472c.get(str);
            }
            return null;
        }

        void c(String str, float f15, float f16) {
            if (this.f108471b.containsKey(str)) {
                this.f108471b.get(str);
            }
            this.f108471b.put(str, new c(f15, f16));
        }

        void d(String str, float f15, float f16, float f17, String str2, String str3) {
            if (this.f108471b.containsKey(str)) {
                this.f108471b.get(str);
            }
            a aVar = new a(f15, f16, f17, str2, str3);
            this.f108471b.put(str, aVar);
            this.f108472c.put(str, aVar.a());
        }

        void e(String str, int i15) {
            this.f108470a.put(str, Integer.valueOf(i15));
        }

        void f(String str, ArrayList<String> arrayList) {
            this.f108472c.put(str, arrayList);
        }
    }

    static void a(g gVar, d dVar, k5.a aVar, j5.f fVar, String str) throws j5.h {
        str.getClass();
        switch (str) {
            case "centerVertically":
                String strE0 = fVar.e0(str);
                boolean zEquals = strE0.equals("parent");
                Object obj = strE0;
                if (zEquals) {
                    obj = g.f108491k;
                }
                k5.a aVarD = gVar.d(obj);
                aVar.m0(aVarD);
                aVar.p(aVarD);
                break;
            case "center":
                String strE1 = fVar.e0(str);
                k5.a aVarD2 = strE1.equals("parent") ? gVar.d(g.f108491k) : gVar.d(strE1);
                aVar.i0(aVarD2);
                aVar.z(aVarD2);
                aVar.m0(aVarD2);
                aVar.p(aVarD2);
                break;
            case "custom":
                i(fVar, aVar, str);
                break;
            case "rotationX":
                aVar.S(dVar.a(fVar.z(str)));
                break;
            case "rotationY":
                aVar.T(dVar.a(fVar.z(str)));
                break;
            case "rotationZ":
                aVar.U(dVar.a(fVar.z(str)));
                break;
            case "translationX":
                aVar.n0(w(gVar, dVar.a(fVar.z(str))));
                break;
            case "translationY":
                aVar.o0(w(gVar, dVar.a(fVar.z(str))));
                break;
            case "translationZ":
                aVar.p0(w(gVar, dVar.a(fVar.z(str))));
                break;
            case "height":
                aVar.Y(j(fVar, str, gVar, gVar.h()));
                break;
            case "motion":
                r(fVar.z(str), aVar);
                break;
            case "pivotX":
                aVar.N(dVar.a(fVar.z(str)));
                break;
            case "pivotY":
                aVar.O(dVar.a(fVar.z(str)));
                break;
            case "scaleX":
                aVar.V(dVar.a(fVar.z(str)));
                break;
            case "scaleY":
                aVar.W(dVar.a(fVar.z(str)));
                break;
            case "hRtlBias":
                float fA = dVar.a(fVar.z(str));
                if (gVar.r()) {
                    fA = 1.0f - fA;
                }
                aVar.F(fA);
                break;
            case "vWeight":
                aVar.d0(dVar.a(fVar.z(str)));
                break;
            case "alpha":
                aVar.g(dVar.a(fVar.z(str)));
                break;
            case "hBias":
                aVar.F(dVar.a(fVar.z(str)));
                break;
            case "vBias":
                aVar.q0(dVar.a(fVar.z(str)));
                break;
            case "width":
                aVar.f0(j(fVar, str, gVar, gVar.h()));
                break;
            case "hWeight":
                aVar.a0(dVar.a(fVar.z(str)));
                break;
            case "centerHorizontally":
                String strE2 = fVar.e0(str);
                boolean zEquals2 = strE2.equals("parent");
                Object obj2 = strE2;
                if (zEquals2) {
                    obj2 = g.f108491k;
                }
                k5.a aVarD3 = gVar.d(obj2);
                aVar.i0(aVarD3);
                aVar.z(aVarD3);
                break;
            case "visibility":
                String strE3 = fVar.e0(str);
                strE3.getClass();
                switch (strE3) {
                    case "invisible":
                        aVar.r0(4);
                        aVar.g(0.0f);
                        break;
                    case "gone":
                        aVar.r0(8);
                        break;
                    case "visible":
                        aVar.r0(0);
                        break;
                }
                break;
            default:
                h(gVar, dVar, fVar, aVar, str);
                break;
        }
    }

    private static int b(String str, String... strArr) {
        for (int i15 = 0; i15 < strArr.length; i15++) {
            if (strArr[i15].equals(str)) {
                return i15;
            }
        }
        return -1;
    }

    static String c(j5.f fVar) {
        Iterator<String> it = fVar.i0().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return fVar.e0("type");
            }
        }
        return null;
    }

    static void d(g gVar, String str, j5.f fVar) throws j5.h {
        boolean zR = gVar.r();
        l5.c cVarB = gVar.b(str, g.c.END);
        ArrayList<String> arrayListI0 = fVar.i0();
        if (arrayListI0 == null) {
            return;
        }
        for (String str2 : arrayListI0) {
            str2.getClass();
            byte b15 = 2;
            switch (str2) {
                case "margin":
                    float fQ = fVar.Q(str2);
                    if (!Float.isNaN(fQ)) {
                        cVarB.K(Float.valueOf(w(gVar, fQ)));
                        break;
                    } else {
                        break;
                    }
                    break;
                case "direction":
                    String strE0 = fVar.e0(str2);
                    strE0.getClass();
                    switch (strE0.hashCode()) {
                        case -1383228885:
                            b15 = strE0.equals("bottom") ? (byte) 0 : (byte) -1;
                            break;
                        case 100571:
                            b15 = strE0.equals("end") ? (byte) 1 : (byte) -1;
                            break;
                        case 115029:
                            if (!strE0.equals("top")) {
                                b15 = -1;
                            }
                            break;
                        case 3317767:
                            b15 = strE0.equals("left") ? (byte) 3 : (byte) -1;
                            break;
                        case 108511772:
                            b15 = strE0.equals("right") ? (byte) 4 : (byte) -1;
                            break;
                        case 109757538:
                            b15 = strE0.equals("start") ? (byte) 5 : (byte) -1;
                            break;
                        default:
                            b15 = -1;
                            break;
                    }
                    switch (b15) {
                        case 0:
                            cVarB.w0(g.c.BOTTOM);
                            break;
                        case 1:
                            if (zR) {
                                cVarB.w0(g.c.LEFT);
                            } else {
                                cVarB.w0(g.c.RIGHT);
                            }
                            break;
                        case 2:
                            cVarB.w0(g.c.TOP);
                            break;
                        case 3:
                            cVarB.w0(g.c.LEFT);
                            break;
                        case 4:
                            cVarB.w0(g.c.RIGHT);
                            break;
                        case 5:
                            if (zR) {
                                cVarB.w0(g.c.RIGHT);
                            } else {
                                cVarB.w0(g.c.LEFT);
                            }
                            break;
                    }
                    break;
                case "contains":
                    j5.a aVarF = fVar.F(str2);
                    if (aVarF == null) {
                        break;
                    } else {
                        for (int i15 = 0; i15 < aVarF.size(); i15++) {
                            cVarB.s0(gVar.d(aVarF.x(i15).g()));
                        }
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    static void e(int i15, g gVar, d dVar, j5.a aVar) throws j5.h {
        String strG;
        l5.d dVarO = i15 == 0 ? gVar.o() : gVar.A();
        j5.c cVarX = aVar.x(1);
        if (cVarX instanceof j5.a) {
            j5.a aVar2 = (j5.a) cVarX;
            if (aVar2.size() < 1) {
                return;
            }
            for (int i16 = 0; i16 < aVar2.size(); i16++) {
                dVarO.s0(aVar2.Y(i16));
            }
            if (aVar.size() > 2) {
                j5.c cVarX2 = aVar.x(2);
                if (cVarX2 instanceof j5.f) {
                    j5.f fVar = (j5.f) cVarX2;
                    for (String str : fVar.i0()) {
                        str.getClass();
                        if (str.equals("style")) {
                            j5.c cVarZ = fVar.z(str);
                            if (cVarZ instanceof j5.a) {
                                j5.a aVar3 = (j5.a) cVarZ;
                                if (aVar3.size() > 1) {
                                    strG = aVar3.Y(0);
                                    dVarO.x0(aVar3.G(1));
                                } else {
                                    strG = cVarZ.g();
                                }
                            } else {
                                strG = cVarZ.g();
                            }
                            strG.getClass();
                            if (strG.equals("packed")) {
                                dVarO.D0(g.a.PACKED);
                            } else if (strG.equals("spread_inside")) {
                                dVarO.D0(g.a.SPREAD_INSIDE);
                            } else {
                                dVarO.D0(g.a.SPREAD);
                            }
                        } else {
                            h(gVar, dVar, fVar, dVarO, str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x020a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e7 A[SYNTHETIC] */
    private static void f(String str, g gVar, String str2, d dVar, j5.f fVar) throws j5.h {
        j5.a aVar;
        int i15;
        float fG;
        float fW;
        float fW2;
        float f15;
        float f16;
        String strG;
        int i16 = 0;
        l5.d dVarO = str.charAt(0) == 'h' ? gVar.o() : gVar.A();
        dVarO.c(str2);
        for (String str3 : fVar.i0()) {
            str3.getClass();
            int i17 = 6;
            int i18 = 3;
            int i19 = 2;
            int i25 = 1;
            int i26 = -1;
            switch (str3) {
                case "bottom":
                    i26 = i16;
                case "contains":
                    i26 = 1;
                case "end":
                    i26 = 2;
                case "top":
                    i26 = 3;
                case "left":
                    i26 = 4;
                case "right":
                    i26 = 5;
                case "start":
                    i26 = 6;
                case "style":
                    i26 = 7;
                default:
                    switch (i26) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            h(gVar, dVar, fVar, dVarO, str3);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            i16 = 0;
                            break;
                        case 1:
                            j5.c cVarZ = fVar.z(str3);
                            if (cVarZ instanceof j5.a) {
                                j5.a aVar2 = (j5.a) cVarZ;
                                if (aVar2.size() >= 1) {
                                    int i27 = i16;
                                    while (i27 < aVar2.size()) {
                                        j5.c cVarX = aVar2.x(i27);
                                        if (cVarX instanceof j5.a) {
                                            j5.a aVar3 = (j5.a) cVarX;
                                            if (aVar3.size() > 0) {
                                                String strG2 = aVar3.x(i16).g();
                                                int size = aVar3.size();
                                                if (size != i19) {
                                                    if (size == i18) {
                                                        j5.a aVar4 = aVar2;
                                                        fG = aVar3.G(i25);
                                                        aVar = aVar4;
                                                        i27 = i27;
                                                        i25 = i25;
                                                        fW = w(gVar, aVar3.G(i19));
                                                        strG2 = strG2;
                                                        fW2 = Float.NaN;
                                                        i15 = i19;
                                                        f16 = fW;
                                                        f15 = Float.NaN;
                                                    } else if (size == 4) {
                                                        float fG2 = aVar3.G(i25);
                                                        float fW3 = w(gVar, aVar3.G(i19));
                                                        i18 = 3;
                                                        j5.a aVar5 = aVar2;
                                                        fG = fG2;
                                                        aVar = aVar5;
                                                        i25 = i25;
                                                        fW = w(gVar, aVar3.G(3));
                                                        f15 = Float.NaN;
                                                        i15 = i19;
                                                        f16 = fW3;
                                                        i27 = i27;
                                                        strG2 = strG2;
                                                        fW2 = Float.NaN;
                                                    } else if (size != i17) {
                                                        aVar = aVar2;
                                                        fG = Float.NaN;
                                                        fW = Float.NaN;
                                                    } else {
                                                        float fG3 = aVar3.G(i25);
                                                        float fW4 = w(gVar, aVar3.G(i19));
                                                        float fW5 = w(gVar, aVar3.G(i18));
                                                        float fW6 = w(gVar, aVar3.G(4));
                                                        int i28 = i19;
                                                        f16 = fW4;
                                                        aVar = aVar2;
                                                        fG = fG3;
                                                        i15 = i28;
                                                        i25 = i25;
                                                        fW = fW5;
                                                        i27 = i27;
                                                        strG2 = strG2;
                                                        fW2 = w(gVar, aVar3.G(5));
                                                        f15 = fW6;
                                                        i18 = 3;
                                                    }
                                                    dVarO.w0(strG2, fG, f16, fW, f15, fW2);
                                                } else {
                                                    float fG4 = aVar3.G(i25);
                                                    j5.a aVar6 = aVar2;
                                                    fG = fG4;
                                                    aVar = aVar6;
                                                    fW = Float.NaN;
                                                }
                                                f15 = fW;
                                                fW2 = f15;
                                                i15 = i19;
                                                f16 = fW2;
                                                dVarO.w0(strG2, fG, f16, fW, f15, fW2);
                                            } else {
                                                i27 = i27;
                                                aVar = aVar2;
                                                i15 = i19;
                                                i25 = i25;
                                            }
                                        } else {
                                            i27 = i27;
                                            aVar = aVar2;
                                            i15 = i19;
                                            i25 = i25;
                                            dVarO.s0(cVarX.g());
                                        }
                                        i27++;
                                        aVar2 = aVar;
                                        i19 = i15;
                                        i25 = i25;
                                        i16 = 0;
                                        i17 = 6;
                                    }
                                    break;
                                }
                            }
                            System.err.println(str2 + " contains should be an array \"" + cVarZ.g() + "\"");
                            return;
                        case 7:
                            j5.c cVarZ2 = fVar.z(str3);
                            if (cVarZ2 instanceof j5.a) {
                                j5.a aVar7 = (j5.a) cVarZ2;
                                if (aVar7.size() > 1) {
                                    strG = aVar7.Y(i16);
                                    dVarO.x0(aVar7.G(1));
                                } else {
                                    strG = cVarZ2.g();
                                }
                            } else {
                                strG = cVarZ2.g();
                            }
                            strG.getClass();
                            if (strG.equals("packed")) {
                                dVarO.D0(g.a.PACKED);
                            } else if (strG.equals("spread_inside")) {
                                dVarO.D0(g.a.SPREAD_INSIDE);
                            } else {
                                dVarO.D0(g.a.SPREAD);
                            }
                            break;
                    }
            }
        }
    }

    static long g(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF" + strSubstring;
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:167:0x0266  */
    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00d0. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    static void h(g gVar, d dVar, j5.f fVar, k5.a aVar, String str) throws j5.h {
        boolean z15;
        char c15;
        boolean z16;
        boolean z17;
        ?? r16;
        boolean z18;
        boolean zR = gVar.r();
        boolean z19 = !zR;
        j5.a aVarF = fVar.F(str);
        if (aVarF == null || aVarF.size() <= 1) {
            String strG0 = fVar.g0(str);
            if (strG0 != null) {
                k5.a aVarD = strG0.equals("parent") ? gVar.d(g.f108491k) : gVar.d(strG0);
                str.getClass();
                switch (str) {
                    case "baseline":
                        gVar.c(aVar.getKey());
                        gVar.c(aVarD.getKey());
                        aVar.k(aVarD);
                        break;
                    case "bottom":
                        aVar.p(aVarD);
                        break;
                    case "end":
                        if (zR) {
                            aVar.H(aVarD);
                            break;
                        } else {
                            aVar.R(aVarD);
                            break;
                        }
                        break;
                    case "top":
                        aVar.m0(aVarD);
                        break;
                    case "start":
                        if (zR) {
                            aVar.R(aVarD);
                            break;
                        } else {
                            aVar.H(aVarD);
                            break;
                        }
                        break;
                }
            }
            return;
        }
        String strY = aVarF.Y(0);
        String strF0 = aVarF.f0(1);
        float fW = aVarF.size() > 2 ? w(gVar, dVar.a(aVarF.W(2))) : 0.0f;
        float fW2 = aVarF.size() > 3 ? w(gVar, dVar.a(aVarF.W(3))) : 0.0f;
        k5.a aVarD2 = strY.equals("parent") ? gVar.d(g.f108491k) : gVar.d(strY);
        str.getClass();
        float f15 = fW;
        switch (str) {
            case "baseline":
                z15 = true;
                c15 = 2;
                strF0.getClass();
                switch (strF0) {
                    case "baseline":
                        gVar.c(aVar.getKey());
                        gVar.c(aVarD2.getKey());
                        aVar.k(aVarD2);
                        break;
                    case "bottom":
                        gVar.c(aVar.getKey());
                        aVar.l(aVarD2);
                        break;
                    case "top":
                        gVar.c(aVar.getKey());
                        aVar.m(aVarD2);
                        break;
                }
                z16 = z15;
                z17 = false;
                break;
            case "circular":
                z15 = true;
                c15 = 2;
                aVar.r(aVarD2, dVar.a(aVarF.x(1)), aVarF.size() > 2 ? w(gVar, dVar.a(aVarF.W(2))) : 0.0f);
                z16 = z15;
                z17 = false;
                break;
            case "bottom":
                strF0.getClass();
                switch (strF0) {
                    case "baseline":
                        gVar.c(aVarD2.getKey());
                        aVar.o(aVarD2);
                        break;
                    case "bottom":
                        aVar.p(aVarD2);
                        break;
                    case "top":
                        aVar.q(aVarD2);
                        break;
                }
                z15 = true;
                c15 = 2;
                z16 = z15;
                z17 = false;
                break;
            case "end":
                z16 = zR;
                z15 = true;
                c15 = 2;
                z17 = true;
                break;
            case "top":
                strF0.getClass();
                switch (strF0) {
                    case "baseline":
                        gVar.c(aVarD2.getKey());
                        aVar.k0(aVarD2);
                        break;
                    case "bottom":
                        aVar.l0(aVarD2);
                        break;
                    case "top":
                        aVar.m0(aVarD2);
                        break;
                }
                z15 = true;
                c15 = 2;
                z16 = z15;
                z17 = false;
                break;
            case "left":
                z16 = true;
                z15 = true;
                c15 = 2;
                z17 = true;
                break;
            case "right":
                z16 = false;
                z15 = true;
                c15 = 2;
                z17 = true;
                break;
            case "start":
                z16 = z19;
                z15 = true;
                c15 = 2;
                z17 = true;
                break;
            default:
                z15 = true;
                c15 = 2;
                z16 = z15;
                z17 = false;
                break;
        }
        if (z17) {
            strF0.getClass();
            switch (strF0.hashCode()) {
                case 100571:
                    if (!strF0.equals("end")) {
                        r16 = -1;
                    } else {
                        r16 = 0;
                    }
                    break;
                case 3317767:
                    if (!strF0.equals("left")) {
                        r16 = -1;
                    } else {
                        r16 = z15;
                    }
                    break;
                case 108511772:
                    if (!strF0.equals("right")) {
                        r16 = -1;
                    } else {
                        r16 = c15;
                    }
                    break;
                case 109757538:
                    if (!strF0.equals("start")) {
                        r16 = -1;
                    } else {
                        r16 = 3;
                    }
                    break;
                default:
                    r16 = -1;
                    break;
            }
            switch (r16) {
                case 0:
                    z18 = zR;
                    break;
                case 1:
                default:
                    z18 = z15;
                    break;
                case 2:
                    z18 = false;
                    break;
                case 3:
                    z18 = z19;
                    break;
            }
            if (z16) {
                if (z18) {
                    aVar.H(aVarD2);
                } else {
                    aVar.I(aVarD2);
                }
            } else if (z18) {
                aVar.Q(aVarD2);
            } else {
                aVar.R(aVarD2);
            }
        }
        aVar.K(Float.valueOf(f15)).M(Float.valueOf(fW2));
    }

    static void i(j5.f fVar, k5.a aVar, String str) throws j5.h {
        ArrayList<String> arrayListI0;
        j5.f fVarU = fVar.U(str);
        if (fVarU == null || (arrayListI0 = fVarU.i0()) == null) {
            return;
        }
        for (String str2 : arrayListI0) {
            j5.c cVarZ = fVarU.z(str2);
            if (cVarZ instanceof j5.e) {
                aVar.f(str2, cVarZ.i());
            } else if (cVarZ instanceof i) {
                long jG = g(cVarZ.g());
                if (jG != -1) {
                    aVar.e(str2, (int) jG);
                }
            }
        }
    }

    static k5.d j(j5.f fVar, String str, g gVar, k5.c cVar) throws j5.h {
        j5.c cVarZ = fVar.z(str);
        k5.d dVarB = k5.d.b(0);
        if (cVarZ instanceof i) {
            return k(cVarZ.g());
        }
        if (cVarZ instanceof j5.e) {
            return k5.d.b(gVar.e(Float.valueOf(cVar.a(fVar.P(str)))));
        }
        if (cVarZ instanceof j5.f) {
            j5.f fVar2 = (j5.f) cVarZ;
            String strG0 = fVar2.g0("value");
            if (strG0 != null) {
                dVarB = k(strG0);
            }
            j5.c cVarX = fVar2.X("min");
            if (cVarX != null) {
                if (cVarX instanceof j5.e) {
                    dVarB.n(gVar.e(Float.valueOf(cVar.a(((j5.e) cVarX).i()))));
                } else if (cVarX instanceof i) {
                    dVarB.o(k5.d.f108474j);
                }
            }
            j5.c cVarX2 = fVar2.X("max");
            if (cVarX2 != null) {
                if (cVarX2 instanceof j5.e) {
                    dVarB.l(gVar.e(Float.valueOf(cVar.a(((j5.e) cVarX2).i()))));
                    return dVarB;
                }
                if (cVarX2 instanceof i) {
                    dVarB.m(k5.d.f108474j);
                }
            }
        }
        return dVarB;
    }

    static k5.d k(String str) {
        k5.d dVarB = k5.d.b(0);
        str.getClass();
        switch (str) {
            case "preferWrap":
                return k5.d.g(k5.d.f108474j);
            case "parent":
                return k5.d.d();
            case "spread":
                return k5.d.g(k5.d.f108475k);
            case "wrap":
                return k5.d.h();
            default:
                if (str.endsWith("%")) {
                    return k5.d.e(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).r(0);
                }
                return str.contains(":") ? k5.d.f(str).s(k5.d.f108475k) : dVarB;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x022e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0298  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:194:0x0403  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void l(String str, g gVar, String str2, d dVar, j5.f fVar) throws j5.h {
        int i15;
        float f15;
        int i16;
        String strG;
        String strY;
        String strY2;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        String strG2;
        String strY3;
        String strY4;
        float fJ;
        float fR;
        float fR2;
        float fR3;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        float fG;
        float fW;
        float f16;
        float fG2;
        float f17 = 0.5f;
        Float fValueOf7 = Float.valueOf(0.5f);
        int i17 = 0;
        l5.f fVarI = gVar.i(str2, str.charAt(0) == 'v');
        for (String str3 : fVar.i0()) {
            str3.getClass();
            int i18 = 4;
            switch (str3.hashCode()) {
                case -1254185091:
                    i15 = str3.equals("hAlign") ? i17 : -1;
                    break;
                case -1237307863:
                    i15 = str3.equals("hStyle") ? 1 : -1;
                    break;
                case -1198076529:
                    i15 = str3.equals("hFlowBias") ? 2 : -1;
                    break;
                case -853376977:
                    i15 = str3.equals("vAlign") ? 3 : -1;
                    break;
                case -836499749:
                    i15 = str3.equals("vStyle") ? 4 : -1;
                    break;
                case -806339567:
                    i15 = str3.equals("padding") ? 5 : -1;
                    break;
                case -732635235:
                    i15 = str3.equals("vFlowBias") ? 6 : -1;
                    break;
                case -567445985:
                    i15 = str3.equals("contains") ? 7 : -1;
                    break;
                case -488900360:
                    i15 = str3.equals("maxElement") ? 8 : -1;
                    break;
                case 3169614:
                    i15 = str3.equals("hGap") ? 9 : -1;
                    break;
                case 3575610:
                    i15 = str3.equals("type") ? 10 : -1;
                    break;
                case 3586688:
                    i15 = str3.equals("vGap") ? 11 : -1;
                    break;
                case 3657802:
                    i15 = str3.equals("wrap") ? 12 : -1;
                    break;
                default:
                    i15 = -1;
                    break;
            }
            switch (i15) {
                case 0:
                    f15 = f17;
                    String strG3 = fVar.z(str3).g();
                    strG3.getClass();
                    if (strG3.equals("end")) {
                        i16 = 0;
                        fVarI.B0(1);
                    } else if (strG3.equals("start")) {
                        i16 = 0;
                        fVarI.B0(0);
                    } else {
                        fVarI.B0(2);
                        i16 = 0;
                    }
                    i17 = i16;
                    f17 = f15;
                    break;
                case 1:
                    f15 = f17;
                    j5.c cVarZ = fVar.z(str3);
                    if (cVarZ instanceof j5.a) {
                        j5.a aVar = (j5.a) cVarZ;
                        if (aVar.size() > 1) {
                            strY = aVar.Y(0);
                            strG = aVar.Y(1);
                            strY2 = aVar.size() > 2 ? aVar.Y(2) : "";
                        } else {
                            strG = cVarZ.g();
                            strY = "";
                            strY2 = strY;
                        }
                    } else {
                        strG = cVarZ.g();
                        strY = "";
                        strY2 = strY;
                    }
                    if (!strG.equals("")) {
                        fVarI.D0(g.a.e(strG));
                    }
                    if (!strY.equals("")) {
                        fVarI.y0(g.a.e(strY));
                    }
                    if (!strY2.equals("")) {
                        fVarI.F0(g.a.e(strY2));
                    }
                    i16 = 0;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 2:
                    f15 = f17;
                    j5.c cVarZ2 = fVar.z(str3);
                    if (cVarZ2 instanceof j5.a) {
                        j5.a aVar2 = (j5.a) cVarZ2;
                        if (aVar2.size() > 1) {
                            fValueOf2 = Float.valueOf(aVar2.G(0));
                            fValueOf = Float.valueOf(aVar2.G(1));
                            fValueOf3 = aVar2.size() > 2 ? Float.valueOf(aVar2.G(2)) : fValueOf7;
                        } else {
                            fValueOf = Float.valueOf(cVarZ2.i());
                            fValueOf2 = fValueOf7;
                            fValueOf3 = fValueOf2;
                        }
                    } else {
                        fValueOf = Float.valueOf(cVarZ2.i());
                        fValueOf2 = fValueOf7;
                        fValueOf3 = fValueOf2;
                    }
                    fVarI.F(fValueOf.floatValue());
                    if (fValueOf2.floatValue() != f15) {
                        fVarI.x0(fValueOf2.floatValue());
                    }
                    if (fValueOf3.floatValue() != f15) {
                        fVarI.E0(fValueOf3.floatValue());
                    }
                    i16 = 0;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 3:
                    f15 = f17;
                    String strG4 = fVar.z(str3).g();
                    strG4.getClass();
                    switch (strG4) {
                        case "baseline":
                            fVarI.O0(3);
                            break;
                        case "bottom":
                            fVarI.O0(1);
                            break;
                        case "top":
                            fVarI.O0(0);
                            break;
                        default:
                            fVarI.O0(2);
                            break;
                    }
                    i16 = 0;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 4:
                    f15 = f17;
                    j5.c cVarZ3 = fVar.z(str3);
                    if (cVarZ3 instanceof j5.a) {
                        j5.a aVar3 = (j5.a) cVarZ3;
                        if (aVar3.size() > 1) {
                            strY3 = aVar3.Y(0);
                            strG2 = aVar3.Y(1);
                            strY4 = aVar3.size() > 2 ? aVar3.Y(2) : "";
                        } else {
                            strG2 = cVarZ3.g();
                            strY3 = "";
                            strY4 = strY3;
                        }
                    } else {
                        strG2 = cVarZ3.g();
                        strY3 = "";
                        strY4 = strY3;
                    }
                    if (!strG2.equals("")) {
                        fVarI.Q0(g.a.e(strG2));
                    }
                    if (!strY3.equals("")) {
                        fVarI.A0(g.a.e(strY3));
                    }
                    if (!strY4.equals("")) {
                        fVarI.H0(g.a.e(strY4));
                    }
                    i16 = 0;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 5:
                    f15 = f17;
                    j5.c cVarZ4 = fVar.z(str3);
                    if (cVarZ4 instanceof j5.a) {
                        j5.a aVar4 = (j5.a) cVarZ4;
                        if (aVar4.size() > 1) {
                            fJ = aVar4.R(0);
                            fR3 = aVar4.R(1);
                            if (aVar4.size() > 2) {
                                fR2 = aVar4.R(2);
                                try {
                                    fR = ((j5.a) cVarZ4).R(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    fR = 0.0f;
                                }
                            } else {
                                fR2 = fJ;
                                fR = fR3;
                            }
                        } else {
                            fJ = cVarZ4.j();
                            fR = fJ;
                            fR2 = fR;
                            fR3 = fR2;
                        }
                    } else {
                        fJ = cVarZ4.j();
                        fR = fJ;
                        fR2 = fR;
                        fR3 = fR2;
                    }
                    fVarI.L0(Math.round(w(gVar, fJ)));
                    fVarI.N0(Math.round(w(gVar, fR3)));
                    fVarI.M0(Math.round(w(gVar, fR2)));
                    fVarI.K0(Math.round(w(gVar, fR)));
                    i16 = 0;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 6:
                    f15 = f17;
                    j5.c cVarZ5 = fVar.z(str3);
                    if (cVarZ5 instanceof j5.a) {
                        j5.a aVar5 = (j5.a) cVarZ5;
                        if (aVar5.size() > 1) {
                            fValueOf5 = Float.valueOf(aVar5.G(0));
                            fValueOf4 = Float.valueOf(aVar5.G(1));
                            fValueOf6 = aVar5.size() > 2 ? Float.valueOf(aVar5.G(2)) : fValueOf7;
                        } else {
                            fValueOf4 = Float.valueOf(cVarZ5.i());
                            fValueOf5 = fValueOf7;
                            fValueOf6 = fValueOf5;
                        }
                    } else {
                        fValueOf4 = Float.valueOf(cVarZ5.i());
                        fValueOf5 = fValueOf7;
                        fValueOf6 = fValueOf5;
                    }
                    try {
                        fVarI.q0(fValueOf4.floatValue());
                        if (fValueOf5.floatValue() != f15) {
                            fVarI.z0(fValueOf5.floatValue());
                        }
                        if (fValueOf6.floatValue() != f15) {
                            fVarI.G0(fValueOf6.floatValue());
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    i16 = 0;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 7:
                    j5.c cVarZ6 = fVar.z(str3);
                    if (cVarZ6 instanceof j5.a) {
                        j5.a aVar6 = (j5.a) cVarZ6;
                        if (aVar6.size() >= 1) {
                            int i19 = i17;
                            while (i19 < aVar6.size()) {
                                j5.c cVarX = aVar6.x(i19);
                                float f18 = f17;
                                if (cVarX instanceof j5.a) {
                                    j5.a aVar7 = (j5.a) cVarX;
                                    if (aVar7.size() > 0) {
                                        String strG5 = aVar7.x(i17).g();
                                        int size = aVar7.size();
                                        if (size != 2) {
                                            if (size == 3) {
                                                fG2 = aVar7.G(1);
                                                fW = w(gVar, aVar7.G(2));
                                                f16 = fW;
                                            } else if (size != i18) {
                                                fG = Float.NaN;
                                                fW = Float.NaN;
                                            } else {
                                                fG2 = aVar7.G(1);
                                                float fW2 = w(gVar, aVar7.G(2));
                                                fW = w(gVar, aVar7.G(3));
                                                f16 = fW2;
                                            }
                                            fG = fG2;
                                            fVarI.w0(strG5, fG, f16, fW);
                                        } else {
                                            fG = aVar7.G(1);
                                            fW = Float.NaN;
                                        }
                                        f16 = fW;
                                        fVarI.w0(strG5, fG, f16, fW);
                                    }
                                } else {
                                    fVarI.s0(cVarX.g());
                                }
                                i19++;
                                f17 = f18;
                                i17 = 0;
                                i18 = 4;
                            }
                            f15 = f17;
                            i16 = i17;
                            i17 = i16;
                            f17 = f15;
                            break;
                        }
                    }
                    System.err.println(str2 + " contains should be an array \"" + cVarZ6.g() + "\"");
                    break;
                case 8:
                    fVarI.I0(fVar.z(str3).j());
                    f15 = f17;
                    i16 = i17;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 9:
                    fVarI.C0(fVar.z(str3).j());
                    f15 = f17;
                    i16 = i17;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 10:
                    if (fVar.z(str3).g().equals("hFlow")) {
                        fVarI.J0(i17);
                    } else {
                        fVarI.J0(1);
                    }
                    f15 = f17;
                    i16 = i17;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 11:
                    fVarI.P0(fVar.z(str3).j());
                    f15 = f17;
                    i16 = i17;
                    i17 = i16;
                    f17 = f15;
                    break;
                case 12:
                    fVarI.R0(g.e.e(fVar.z(str3).g()));
                    f15 = f17;
                    i16 = i17;
                    i17 = i16;
                    f17 = f15;
                    break;
                default:
                    a(gVar, dVar, gVar.d(str2), fVar, str3);
                    f15 = f17;
                    i16 = i17;
                    i17 = i16;
                    f17 = f15;
                    break;
            }
            return;
        }
    }

    static void m(g gVar, d dVar, j5.f fVar) throws j5.h {
        ArrayList<String> arrayListI0 = fVar.i0();
        if (arrayListI0 == null) {
            return;
        }
        for (String str : arrayListI0) {
            j5.c cVarZ = fVar.z(str);
            ArrayList<String> arrayListB = dVar.b(str);
            if (arrayListB != null && (cVarZ instanceof j5.f)) {
                Iterator<String> it = arrayListB.iterator();
                while (it.hasNext()) {
                    t(gVar, dVar, it.next(), (j5.f) cVarZ);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ef  */
    private static void n(String str, g gVar, String str2, d dVar, j5.f fVar) throws j5.h {
        float fJ;
        float fR;
        float fR2;
        float fR3;
        l5.g gVarJ = gVar.j(str2, str);
        for (String str3 : fVar.i0()) {
            str3.getClass();
            int iJ = 0;
            switch (str3) {
                case "orientation":
                    gVarJ.B0(fVar.z(str3).j());
                    break;
                case "padding":
                    j5.c cVarZ = fVar.z(str3);
                    if (cVarZ instanceof j5.a) {
                        j5.a aVar = (j5.a) cVarZ;
                        if (aVar.size() > 1) {
                            fJ = aVar.R(0);
                            fR3 = aVar.R(1);
                            if (aVar.size() > 2) {
                                fR2 = aVar.R(2);
                                try {
                                    fR = ((j5.a) cVarZ).R(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    fR = 0.0f;
                                }
                            } else {
                                fR = fR3;
                                fR2 = fJ;
                            }
                        } else {
                            fJ = cVarZ.j();
                            fR = fJ;
                            fR2 = fR;
                            fR3 = fR2;
                        }
                    } else {
                        fJ = cVarZ.j();
                        fR = fJ;
                        fR2 = fR;
                        fR3 = fR2;
                    }
                    gVarJ.E0(Math.round(w(gVar, fJ)));
                    gVarJ.F0(Math.round(w(gVar, fR3)));
                    gVarJ.D0(Math.round(w(gVar, fR2)));
                    gVarJ.C0(Math.round(w(gVar, fR)));
                    break;
                case "contains":
                    j5.a aVarF = fVar.F(str3);
                    if (aVarF != null) {
                        while (iJ < aVarF.size()) {
                            gVarJ.s0(gVar.d(aVarF.x(iJ).g()));
                            iJ++;
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "hGap":
                    gVarJ.A0(w(gVar, fVar.z(str3).i()));
                    break;
                case "rows":
                    int iJ2 = fVar.z(str3).j();
                    if (iJ2 > 0) {
                        gVarJ.H0(iJ2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "vGap":
                    gVarJ.K0(w(gVar, fVar.z(str3).i()));
                    break;
                case "flags":
                    String strG = "";
                    try {
                        j5.c cVarZ2 = fVar.z(str3);
                        if (cVarZ2 instanceof j5.e) {
                            iJ = cVarZ2.j();
                        } else {
                            strG = cVarZ2.g();
                        }
                    } catch (Exception e15) {
                        System.err.println("Error parsing grid flags " + e15);
                    }
                    if (strG != null && !strG.isEmpty()) {
                        gVarJ.z0(strG);
                        break;
                    } else {
                        gVarJ.y0(iJ);
                        break;
                    }
                    break;
                case "skips":
                    String strG2 = fVar.z(str3).g();
                    if (strG2 == null || !strG2.contains(":")) {
                        break;
                    } else {
                        gVarJ.I0(strG2);
                        break;
                    }
                    break;
                case "spans":
                    String strG3 = fVar.z(str3).g();
                    if (strG3 == null || !strG3.contains(":")) {
                        break;
                    } else {
                        gVarJ.J0(strG3);
                        break;
                    }
                    break;
                case "rowWeights":
                    String strG4 = fVar.z(str3).g();
                    if (strG4 == null || !strG4.contains(",")) {
                        break;
                    } else {
                        gVarJ.G0(strG4);
                        break;
                    }
                    break;
                case "columns":
                    int iJ3 = fVar.z(str3).j();
                    if (iJ3 > 0) {
                        gVarJ.x0(iJ3);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "columnWeights":
                    String strG5 = fVar.z(str3).g();
                    if (strG5 == null || !strG5.contains(",")) {
                        break;
                    } else {
                        gVarJ.w0(strG5);
                        break;
                    }
                    break;
                default:
                    a(gVar, dVar, gVar.d(str2), fVar, str3);
                    break;
            }
        }
    }

    static void o(int i15, g gVar, j5.a aVar) throws j5.h {
        j5.f fVar;
        String strG0;
        j5.c cVarX = aVar.x(1);
        if ((cVarX instanceof j5.f) && (strG0 = (fVar = (j5.f) cVarX).g0("id")) != null) {
            p(i15, gVar, strG0, fVar);
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[left]] */
    static void p(int i15, g gVar, String str, j5.f fVar) throws j5.h {
        String next;
        ArrayList<String> arrayListI0 = fVar.i0();
        if (arrayListI0 == null) {
            return;
        }
        k5.a aVarD = gVar.d(str);
        if (i15 == 0) {
            gVar.p(str);
        } else {
            gVar.B(str);
        }
        boolean z15 = !gVar.r() || i15 == 0;
        l5.h hVar = (l5.h) aVarD.d();
        Iterator<String> it = arrayListI0.iterator();
        float fP = 0.0f;
        boolean z16 = false;
        while (true) {
            boolean z17 = true;
            while (true) {
                if (!it.hasNext()) {
                    if (z16) {
                        if (z17) {
                            hVar.f(fP);
                            return;
                        } else {
                            hVar.f(1.0f - fP);
                            return;
                        }
                    }
                    if (z17) {
                        hVar.h(Float.valueOf(fP));
                        return;
                    } else {
                        hVar.e(Float.valueOf(fP));
                        return;
                    }
                }
                next = it.next();
                next.getClass();
                switch (next) {
                    case "percent":
                        j5.a aVarF = fVar.F(next);
                        if (aVarF != null) {
                            if (aVarF.size() > 1) {
                                String strY = aVarF.Y(0);
                                float fG = aVarF.G(1);
                                strY.getClass();
                                switch (strY) {
                                    case "end":
                                        z17 = !z15;
                                        fP = fG;
                                        break;
                                    case "left":
                                        z17 = true;
                                        fP = fG;
                                        z16 = true;
                                        break;
                                    case "right":
                                        z17 = false;
                                        fP = fG;
                                        break;
                                    case "start":
                                        z17 = z15;
                                        fP = fG;
                                        break;
                                    default:
                                        fP = fG;
                                        break;
                                }
                            }
                            z16 = true;
                            break;
                        } else {
                            fP = fVar.P(next);
                            z16 = true;
                            z17 = true;
                            break;
                        }
                        break;
                    case "end":
                        fP = w(gVar, fVar.P(next));
                        z17 = !z15;
                        break;
                    case "right":
                        fP = w(gVar, fVar.P(next));
                        z17 = false;
                        break;
                    case "start":
                        fP = w(gVar, fVar.P(next));
                        z17 = z15;
                        break;
                }
            }
            fP = w(gVar, fVar.P(next));
        }
    }

    static void q(g gVar, d dVar, j5.a aVar) throws j5.h {
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            j5.c cVarX = aVar.x(i15);
            if (cVarX instanceof j5.a) {
                j5.a aVar2 = (j5.a) cVarX;
                if (aVar2.size() > 1) {
                    String strY = aVar2.Y(0);
                    strY.getClass();
                    switch (strY) {
                        case "vGuideline":
                            o(1, gVar, aVar2);
                            break;
                        case "hChain":
                            e(0, gVar, dVar, aVar2);
                            break;
                        case "vChain":
                            e(1, gVar, dVar, aVar2);
                            break;
                        case "hGuideline":
                            o(0, gVar, aVar2);
                            break;
                    }
                }
            }
        }
    }

    private static void r(j5.c cVar, k5.a aVar) throws j5.h {
        if (cVar instanceof j5.f) {
            j5.f fVar = (j5.f) cVar;
            i5.g gVar = new i5.g();
            ArrayList<String> arrayListI0 = fVar.i0();
            if (arrayListI0 == null) {
                return;
            }
            for (String str : arrayListI0) {
                str.getClass();
                switch (str) {
                    case "stagger":
                        gVar.a(600, fVar.P(str));
                        break;
                    case "easing":
                        gVar.c(603, fVar.e0(str));
                        break;
                    case "quantize":
                        j5.c cVarZ = fVar.z(str);
                        if (!(cVarZ instanceof j5.a)) {
                            gVar.b(610, fVar.S(str));
                            break;
                        } else {
                            j5.a aVar2 = (j5.a) cVarZ;
                            int size = aVar2.size();
                            if (size > 0) {
                                gVar.b(610, aVar2.R(0));
                                if (size > 1) {
                                    gVar.c(611, aVar2.Y(1));
                                    if (size > 2) {
                                        gVar.a(602, aVar2.G(2));
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case "pathArc":
                        String strE0 = fVar.e0(str);
                        int iB = b(strE0, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (iB != -1) {
                            gVar.b(607, iB);
                            break;
                        } else {
                            System.err.println(fVar.l() + " pathArc = '" + strE0 + "'");
                            break;
                        }
                        break;
                    case "relativeTo":
                        gVar.c(605, fVar.e0(str));
                        break;
                }
            }
            aVar.f108441l0 = gVar;
        }
    }

    private static void s(g gVar, d dVar, j5.f fVar) throws j5.h {
        ArrayList<String> arrayListI0 = fVar.i0();
        if (arrayListI0 == null) {
            return;
        }
        for (String str : arrayListI0) {
            j5.c cVarZ = fVar.z(str);
            if (cVarZ instanceof j5.e) {
                dVar.e(str, cVarZ.j());
            } else if (cVarZ instanceof j5.f) {
                j5.f fVar2 = (j5.f) cVarZ;
                if (fVar2.h0("from") && fVar2.h0("to")) {
                    dVar.d(str, dVar.a(fVar2.z("from")), dVar.a(fVar2.z("to")), 1.0f, fVar2.g0("prefix"), fVar2.g0("postfix"));
                } else if (fVar2.h0("from") && fVar2.h0("step")) {
                    dVar.c(str, dVar.a(fVar2.z("from")), dVar.a(fVar2.z("step")));
                } else if (fVar2.h0("ids")) {
                    j5.a aVarA = fVar2.A("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i15 = 0; i15 < aVarA.size(); i15++) {
                        arrayList.add(aVarA.Y(i15));
                    }
                    dVar.f(str, arrayList);
                } else if (fVar2.h0("tag")) {
                    dVar.f(str, gVar.k(fVar2.e0("tag")));
                }
            }
        }
    }

    static void t(g gVar, d dVar, String str, j5.f fVar) throws j5.h {
        u(gVar, dVar, gVar.d(str), fVar);
    }

    static void u(g gVar, d dVar, k5.a aVar, j5.f fVar) throws j5.h {
        if (aVar.E() == null) {
            aVar.f0(k5.d.h());
        }
        if (aVar.C() == null) {
            aVar.Y(k5.d.h());
        }
        ArrayList<String> arrayListI0 = fVar.i0();
        if (arrayListI0 == null) {
            return;
        }
        Iterator<String> it = arrayListI0.iterator();
        while (it.hasNext()) {
            a(gVar, dVar, aVar, fVar, it.next());
        }
    }

    public static void v(j5.f fVar, g gVar, d dVar) {
        ArrayList<String> arrayListI0 = fVar.i0();
        if (arrayListI0 == null) {
            return;
        }
        for (String str : arrayListI0) {
            j5.c cVarZ = fVar.z(str);
            str.getClass();
            switch (str) {
                case "Helpers":
                    if (!(cVarZ instanceof j5.a)) {
                        break;
                    } else {
                        q(gVar, dVar, (j5.a) cVarZ);
                        break;
                    }
                    break;
                case "Generate":
                    if (!(cVarZ instanceof j5.f)) {
                        break;
                    } else {
                        m(gVar, dVar, (j5.f) cVarZ);
                        break;
                    }
                    break;
                case "Variables":
                    if (!(cVarZ instanceof j5.f)) {
                        break;
                    } else {
                        s(gVar, dVar, (j5.f) cVarZ);
                        break;
                    }
                    break;
                default:
                    if (!(cVarZ instanceof j5.f)) {
                        if (cVarZ instanceof j5.e) {
                            dVar.e(str, cVarZ.j());
                        }
                        break;
                    } else {
                        j5.f fVar2 = (j5.f) cVarZ;
                        String strC = c(fVar2);
                        if (strC == null) {
                            t(gVar, dVar, str, fVar2);
                            break;
                        } else {
                            switch (strC) {
                                case "vGuideline":
                                    p(1, gVar, str, fVar2);
                                    break;
                                case "column":
                                case "row":
                                case "grid":
                                    n(strC, gVar, str, dVar, fVar2);
                                    break;
                                case "hChain":
                                case "vChain":
                                    f(strC, gVar, str, dVar, fVar2);
                                    break;
                                case "barrier":
                                    d(gVar, str, fVar2);
                                    break;
                                case "hFlow":
                                case "vFlow":
                                    l(strC, gVar, str, dVar, fVar2);
                                    break;
                                case "hGuideline":
                                    p(0, gVar, str, fVar2);
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    private static float w(g gVar, float f15) {
        return gVar.h().a(f15);
    }
}
