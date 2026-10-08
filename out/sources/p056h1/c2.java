package p056h1;

import c5.n;
import er.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import r0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001a\u007f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0015\u001a\u00020\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lh1/b1;", "T", "Lh1/e3;", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "", "positionedItems", "Lr0/o;", "stickyItems", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "b", "(Lh1/e3;IILjava/util/List;Lr0/o;IIIILer/l;)Ljava/util/List;", "c", "(Lh1/b1;)I", "mainAxisOffset", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c2 {
    public static final <T extends b1> List<T> b(e3 e3Var, int i15, int i16, List<T> list, o oVar, int i17, int i18, int i19, int i25, l<? super Integer, ? extends T> lVar) {
        e3 e3Var2 = e3Var;
        if (e3Var2 == null || list.isEmpty() || oVar._size == 0) {
            return v.n();
        }
        o oVarB = e3Var2.b(i15, i16, oVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i26 = 0; i26 < size; i26++) {
            T t15 = list.get(i26);
            if (oVar.c(t15.getIndex())) {
                arrayList2.add(t15);
            }
        }
        int[] iArr = oVarB.content;
        int i27 = oVarB._size;
        int i28 = 0;
        while (i28 < i27) {
            int i29 = iArr[i28];
            Iterator<T> it = list.iterator();
            int i35 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i35 = -1;
                    break;
                }
                if (it.next().getIndex() == i29) {
                    break;
                }
                i35++;
            }
            T tB = i35 == -1 ? lVar.b(Integer.valueOf(i29)) : list.remove(i35);
            ArrayList arrayList3 = arrayList2;
            T t16 = tB;
            int iA = e3Var2.a(arrayList3, i29, tB.k(), i35 == -1 ? PKIFailureInfo.systemUnavail : c(tB), i17, i18, i19, i25);
            t16.d(true);
            t16.j(iA, 0, i19, i25);
            arrayList.add(t16);
            i28++;
            e3Var2 = e3Var;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(b1 b1Var) {
        long jM = b1Var.m(0);
        return b1Var.h() ? n.j(jM) : n.i(jM);
    }
}
