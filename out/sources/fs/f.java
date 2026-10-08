package fs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.b0;
import oq.d0;
import oq.g0;
import oq.p;
import oq.r;
import oq.y;
import oq.z;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66815a;

        static {
            int[] iArr = new int[us.b.C5222b.c.EnumC5225c.values().length];
            try {
                iArr[us.b.C5222b.c.EnumC5225c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f66815a = iArr;
        }
    }

    public static final String a(ws.d dVar, int i15) {
        String strB = dVar.b(i15);
        if (!dVar.a(i15)) {
            return strB;
        }
        return '.' + strB;
    }

    public static final es.e b(us.b bVar, ws.d dVar) {
        String strA = a(dVar, bVar.E());
        List<us.b.C5222b> listC = bVar.C();
        ArrayList arrayList = new ArrayList();
        for (us.b.C5222b c5222b : listC) {
            es.f fVarC = c(c5222b.B(), dVar);
            r rVarA = fVarC != null ? y.a(dVar.getString(c5222b.A()), fVarC) : null;
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return new es.e(strA, v0.s(arrayList));
    }

    public static final es.f c(us.b.C5222b.c cVar, ws.d dVar) {
        if (ws.b.S.d(cVar.U()).booleanValue()) {
            us.b.C5222b.c.EnumC5225c enumC5225cY = cVar.Y();
            int i15 = enumC5225cY != null ? a.f66815a[enumC5225cY.ordinal()] : -1;
            if (i15 == 1) {
                return new es.f.p(z.e((byte) cVar.W()), null);
            }
            if (i15 == 2) {
                return new es.f.s(g0.e((short) cVar.W()), null);
            }
            if (i15 == 3) {
                return new es.f.q(b0.e((int) cVar.W()), null);
            }
            if (i15 == 4) {
                return new es.f.r(d0.e(cVar.W()), null);
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + cVar.Y()).toString());
        }
        us.b.C5222b.c.EnumC5225c enumC5225cY2 = cVar.Y();
        switch (enumC5225cY2 != null ? a.f66815a[enumC5225cY2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new p();
            case 1:
                return new es.f.e((byte) cVar.W());
            case 2:
                return new es.f.n((short) cVar.W());
            case 3:
                return new es.f.j((int) cVar.W());
            case 4:
                return new es.f.m(cVar.W());
            case 5:
                return new es.f.C1250f((char) cVar.W());
            case 6:
                return new es.f.i(cVar.V());
            case 7:
                return new es.f.g(cVar.R());
            case 8:
                return new es.f.d(cVar.W() != 0);
            case 9:
                return new es.f.o(dVar.getString(cVar.X()));
            case 10:
                String strA = a(dVar, cVar.O());
                return cVar.K() == 0 ? new es.f.k(strA) : new es.f.b(strA, cVar.K());
            case 11:
                return new es.f.h(a(dVar, cVar.O()), dVar.getString(cVar.T()));
            case 12:
                return new es.f.a(b(cVar.J(), dVar));
            case 13:
                List<us.b.C5222b.c> listN = cVar.N();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listN.iterator();
                while (it.hasNext()) {
                    es.f fVarC = c((us.b.C5222b.c) it.next(), dVar);
                    if (fVarC != null) {
                        arrayList.add(fVarC);
                    }
                }
                return new es.f.c(arrayList);
        }
    }
}
