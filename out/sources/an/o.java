package an;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import fh.e4;
import fh.il;
import fh.j0;
import fh.ka;
import fh.m0;
import fh.r1;
import fh.rg;
import fh.uj;
import fh.uk;
import fh.w0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final uk f7923a = uk.a("\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f7924b = new Comparator() { // from class: an.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            uk ukVar = o.f7923a;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    static zm.a a(ka[] kaVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i15 = 0;
        for (ka kaVar : kaVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(kaVar.f63328k);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(kaVar.f63328k, sparseArray2);
            }
            sparseArray2.append(kaVar.f63329l, kaVar);
        }
        j0 j0Var = new j0();
        int i16 = 0;
        while (i16 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i16);
            j0 j0Var2 = new j0();
            for (int i17 = i15; i17 < sparseArray3.size(); i17++) {
                j0Var2.a((ka) sparseArray3.valueAt(i17));
            }
            m0 m0VarB = j0Var2.b();
            List listA = w0.a(m0VarB, new uj() { // from class: an.l
                @Override // fh.uj
                public final Object b(Object obj) {
                    ka kaVar2 = (ka) obj;
                    uk ukVar = o.f7923a;
                    List listB = e.b(kaVar2.f63320b);
                    String str = il.b(kaVar2.f63323e) ? "" : kaVar2.f63323e;
                    Rect rectA = e.a(listB);
                    String str2 = il.b(kaVar2.f63325g) ? "und" : kaVar2.f63325g;
                    final Matrix matrix2 = matrix;
                    return new zm.a.b(str, rectA, listB, str2, matrix2, w0.a(Arrays.asList(kaVar2.f63319a), new uj() { // from class: an.n
                        @Override // fh.uj
                        public final Object b(Object obj2) {
                            rg rgVar = (rg) obj2;
                            uk ukVar2 = o.f7923a;
                            List listB2 = e.b(rgVar.f63492b);
                            return new zm.a.C6362a(il.b(rgVar.f63494d) ? "" : rgVar.f63494d, e.a(listB2), listB2, il.b(rgVar.f63496f) ? "und" : rgVar.f63496f, matrix2, rgVar.f63495e, rgVar.f63492b.f63015e, m0.k());
                        }
                    }), kaVar2.f63324f, kaVar2.f63320b.f63015e);
                }
            });
            e4 e4Var = ((ka) m0VarB.get(i15)).f63320b;
            r1 r1VarListIterator = m0VarB.listIterator(i15);
            int iMax = PKIFailureInfo.systemUnavail;
            int iMin = Integer.MAX_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            int iMax2 = Integer.MIN_VALUE;
            while (r1VarListIterator.hasNext()) {
                e4 e4Var2 = ((ka) r1VarListIterator.next()).f63320b;
                int i18 = -e4Var.f63011a;
                int i19 = -e4Var.f63012b;
                int i25 = i15;
                double dSin = Math.sin(Math.toRadians(e4Var.f63015e));
                SparseArray sparseArray4 = sparseArray;
                int i26 = i16;
                double dCos = Math.cos(Math.toRadians(e4Var.f63015e));
                Point[] pointArr = new Point[4];
                Point point = new Point(e4Var2.f63011a, e4Var2.f63012b);
                pointArr[i25] = point;
                point.offset(i18, i19);
                Point point2 = pointArr[i25];
                int i27 = point2.x;
                r1 r1Var = r1VarListIterator;
                int i28 = point2.y;
                int i29 = (int) ((((double) i27) * dCos) + (((double) i28) * dSin));
                point2.x = i29;
                int i35 = (int) ((((double) (-i27)) * dSin) + (((double) i28) * dCos));
                point2.y = i35;
                pointArr[1] = new Point(e4Var2.f63013c + i29, i35);
                pointArr[2] = new Point(e4Var2.f63013c + i29, e4Var2.f63014d + i35);
                pointArr[3] = new Point(i29, i35 + e4Var2.f63014d);
                for (int i36 = i25; i36 < 4; i36++) {
                    Point point3 = pointArr[i36];
                    iMin = Math.min(iMin, point3.x);
                    iMax = Math.max(iMax, point3.x);
                    iMin2 = Math.min(iMin2, point3.y);
                    iMax2 = Math.max(iMax2, point3.y);
                }
                r1VarListIterator = r1Var;
                i15 = i25;
                sparseArray = sparseArray4;
                i16 = i26;
            }
            SparseArray sparseArray5 = sparseArray;
            int i37 = i16;
            int i38 = i15;
            int i39 = e4Var.f63011a;
            int i45 = e4Var.f63012b;
            double dSin2 = Math.sin(Math.toRadians(e4Var.f63015e));
            double dCos2 = Math.cos(Math.toRadians(e4Var.f63015e));
            Point[] pointArr2 = {new Point(iMin, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(iMin, iMax2)};
            int i46 = i38;
            while (i46 < 4) {
                Point point4 = pointArr2[i46];
                int i47 = point4.x;
                double d15 = dSin2;
                int i48 = point4.y;
                point4.x = (int) ((((double) i47) * dCos2) - (((double) i48) * d15));
                point4.y = (int) ((((double) i47) * d15) + (((double) i48) * dCos2));
                point4.offset(i39, i45);
                i46++;
                dSin2 = d15;
            }
            List listAsList = Arrays.asList(pointArr2);
            j0Var.a(new zm.a.e(f7923a.b(w0.a(listA, new uj() { // from class: an.m
                @Override // fh.uj
                public final Object b(Object obj) {
                    return ((zm.a.b) obj).c();
                }
            })), e.a(listAsList), listAsList, b(listA), matrix, listA));
            i16 = i37 + 1;
            i15 = i38;
            sparseArray = sparseArray5;
        }
        m0 m0VarB2 = j0Var.b();
        return new zm.a(f7923a.b(w0.a(m0VarB2, new uj() { // from class: an.k
            @Override // fh.uj
            public final Object b(Object obj) {
                return ((zm.a.e) obj).c();
            }
        })), m0VarB2);
    }

    private static String b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strA = ((zm.a.b) it.next()).a();
            map.put(strA, Integer.valueOf((map.containsKey(strA) ? ((Integer) map.get(strA)).intValue() : 0) + 1));
        }
        Set setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(setEntrySet, f7924b)).getKey();
        return !il.b(str) ? str : "und";
    }
}
