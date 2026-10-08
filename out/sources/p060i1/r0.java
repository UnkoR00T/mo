package p060i1;

import a1.o;
import a1.p;
import c1.e;
import c5.b;
import c5.d;
import c5.t;
import d1.i;
import er.l;
import er.q;
import f3.c;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import lr.g;
import lr.m;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.v0;
import p036e4.x0;
import p056h1.s2;
import p056h1.z0;
import p071kotlin.Metadata;
import p076m2.a3;
import p143z0.a2;
import pq.n;
import pq.v;
import r0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\u001a\u0085\u0002\u0010-\u001a\u00020,*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2*\u0010(\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$\u0012\u0004\u0012\u00020'0#2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0000¢\u0006\u0004\b-\u0010.\u001aO\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002010$H\u0002¢\u0006\u0004\b3\u00104\u001aG\u00106\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u00105\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002010$H\u0002¢\u0006\u0004\b6\u00107\u001aO\u0010;\u001a\u0004\u0018\u0001012\u0006\u00108\u001a\u00020\u00012\f\u00109\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b;\u0010<\u001a{\u0010A\u001a\u000201*\u00020\u00002\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00012\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0002¢\u0006\u0004\bA\u0010B\u001a\u0093\u0001\u0010L\u001a\b\u0012\u0004\u0012\u0002010K*\u00020\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002010\u00192\f\u0010D\u001a\b\u0012\u0004\u0012\u0002010\u00192\f\u0010E\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lh1/z0;", "", "pageCount", "Li1/l0;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lz0/a2;", "orientation", "Lf3/c$c;", "verticalAlignment", "Lf3/c$b;", "horizontalAlignment", "", "reverseLayout", "Lc5/n;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "La1/o;", "snapPosition", "Lh1/s2;", "placementScopeInvalidator", "Lju/p0;", "coroutineScope", "Lc5/d;", "density", "Lkotlin/Function3;", "Lkotlin/Function1;", "Le4/a2$a;", "Loq/i0;", "Le4/x0;", "layout", "Lr0/j0;", "Le4/a2;", "placeablesCache", "Li1/u0;", "l", "(Lh1/z0;ILi1/l0;IIIIIIJLz0/a2;Lf3/c$c;Lf3/c$b;ZJIILjava/util/List;La1/o;Lm2/a3;Lju/p0;Lc5/d;Ler/q;Lr0/j0;)Li1/u0;", "currentLastPage", "pagesCount", "Li1/n;", "getAndMeasure", "i", "(IIILjava/util/List;Ler/l;)Ljava/util/List;", "currentFirstPage", "j", "(IILjava/util/List;Ler/l;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "f", "(ILjava/util/List;IIILa1/o;I)Li1/n;", "index", "childConstraints", "Lc5/t;", "layoutDirection", "k", "(Lh1/z0;IJLi1/l0;JLz0/a2;Lf3/c$b;Lf3/c$c;Lc5/t;ZILr0/j0;)Li1/n;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "", "g", "(Lh1/z0;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILz0/a2;ZLc5/d;II)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {
    private static final n f(int i15, List<n> list, int i16, int i17, int i18, o oVar, int i19) {
        n nVar;
        if (list.isEmpty()) {
            nVar = null;
        } else {
            n nVar2 = list.get(0);
            n nVar3 = nVar2;
            float f15 = -Math.abs(p.a(i15, i16, i17, i18, nVar3.getOffset(), nVar3.getIndex(), oVar, i19));
            int iP = v.p(list);
            if (1 <= iP) {
                int i25 = 1;
                while (true) {
                    n nVar4 = list.get(i25);
                    n nVar5 = nVar4;
                    float f16 = -Math.abs(p.a(i15, i16, i17, i18, nVar5.getOffset(), nVar5.getIndex(), oVar, i19));
                    if (Float.compare(f15, f16) < 0) {
                        f15 = f16;
                        nVar2 = nVar4;
                    }
                    if (i25 == iP) {
                        break;
                    }
                    i25++;
                }
            }
            nVar = nVar2;
        }
        return nVar;
    }

    private static final List<n> g(z0 z0Var, List<n> list, List<n> list2, List<n> list3, int i15, int i16, int i17, int i18, int i19, a2 a2Var, boolean z15, d dVar, int i25, int i26) {
        ArrayList arrayList;
        int i27 = i19;
        int i28 = i26 + i25;
        int i29 = a2Var == a2.Vertical ? i16 : i15;
        int i35 = 0;
        boolean z16 = i17 < Math.min(i29, i18);
        if (z16) {
            if (!(i27 == 0)) {
                e.c("non-zero pagesScrollOffset=" + i27);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size() + list2.size() + list3.size());
        if (z16) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                e.a("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i35 < size) {
                iArr[i35] = i26;
                i35++;
            }
            int[] iArr2 = new int[size];
            i.f fVarC = i.a.f39161a.c(z0Var.b2(i25));
            if (a2Var == a2.Vertical) {
                fVarC.c(dVar, i29, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                fVarC.b(dVar, i29, iArr, t.Ltr, iArr2);
            }
            g gVarQ0 = n.q0(iArr2);
            if (z15) {
                gVarQ0 = m.t(gVarQ0);
            }
            int first = gVarQ0.getFirst();
            int last = gVarQ0.getLast();
            int step = gVarQ0.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    n nVar = list.get(h(first, z15, size));
                    if (z15) {
                        size2 = (i29 - size2) - nVar.getSize();
                    }
                    nVar.h(size2, i15, i16);
                    arrayList.add(nVar);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            arrayList = arrayList2;
            int size3 = list2.size();
            int i36 = i27;
            for (int i37 = 0; i37 < size3; i37++) {
                n nVar2 = list2.get(i37);
                i36 -= i28;
                nVar2.h(i36, i15, i16);
                arrayList.add(nVar2);
            }
            int size4 = list.size();
            for (int i38 = 0; i38 < size4; i38++) {
                n nVar3 = list.get(i38);
                nVar3.h(i27, i15, i16);
                arrayList.add(nVar3);
                i27 += i28;
            }
            int size5 = list3.size();
            while (i35 < size5) {
                n nVar4 = list3.get(i35);
                nVar4.h(i27, i15, i16);
                arrayList.add(nVar4);
                i27 += i28;
                i35++;
            }
        }
        return arrayList;
    }

    private static final int h(int i15, boolean z15, int i16) {
        return !z15 ? i15 : (i16 - i15) - 1;
    }

    private static final List<n> i(int i15, int i16, int i17, List<Integer> list, l<? super Integer, n> lVar) {
        int iMin = Math.min(i17, (i16 - i15) - 1) + i15;
        int i18 = i15 + 1;
        ArrayList arrayList = null;
        if (i18 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.b(Integer.valueOf(i18)));
                if (i18 == iMin) {
                    break;
                }
                i18++;
            }
        }
        int size = list.size();
        for (int i19 = 0; i19 < size; i19++) {
            int iIntValue = list.get(i19).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i16) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.b(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? v.n() : arrayList;
    }

    private static final List<n> j(int i15, int i16, List<Integer> list, l<? super Integer, n> lVar) {
        int iMax = Math.max(0, i15 - i16);
        int i17 = i15 - 1;
        ArrayList arrayList = null;
        if (iMax <= i17) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.b(Integer.valueOf(i17)));
                if (i17 == iMax) {
                    break;
                }
                i17--;
            }
        }
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            int iIntValue = list.get(i18).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.b(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? v.n() : arrayList;
    }

    private static final n k(z0 z0Var, int i15, long j15, l0 l0Var, long j16, a2 a2Var, c.b bVar, c.InterfaceC1317c interfaceC1317c, t tVar, boolean z15, int i16, j0<List<p036e4.a2>> j0Var) {
        List<p036e4.a2> list;
        Object objD = l0Var.d(i15);
        List<p036e4.a2> listB = j0Var.b(i15);
        if (listB != null) {
            list = listB;
        } else {
            List<v0> listU2 = z0Var.u2(i15);
            int size = listU2.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i17 = 0; i17 < size; i17++) {
                arrayList.add(listU2.get(i17).o0(j15));
            }
            j0Var.r(i15, arrayList);
            list = arrayList;
        }
        return new n(i15, i16, list, j16, objD, a2Var, bVar, interfaceC1317c, tVar, z15, null);
    }

    public static final u0 l(final z0 z0Var, int i15, final l0 l0Var, int i16, int i17, int i18, int i19, int i25, int i26, long j15, final a2 a2Var, final c.InterfaceC1317c interfaceC1317c, final c.b bVar, final boolean z15, final long j16, final int i27, int i28, List<Integer> list, o oVar, final a3<i0> a3Var, p0 p0Var, d dVar, q<? super Integer, ? super Integer, ? super l<? super e4.a2.a, i0>, ? extends x0> qVar, final j0<List<p036e4.a2>> j0Var) {
        int i29;
        boolean z16;
        int iMax;
        int i35;
        int i36;
        int i37;
        n nVar;
        List<n> list2;
        List arrayList;
        List arrayList2;
        int i38;
        if (!(i17 >= 0)) {
            e.a("negative beforeContentPadding");
        }
        if (!(i18 >= 0)) {
            e.a("negative afterContentPadding");
        }
        int iE = m.e(i27 + i19, 0);
        int iJ = m.j(i28, i15);
        a2 a2Var2 = a2.Vertical;
        final long jB = c5.c.b(0, a2Var == a2Var2 ? b.l(j15) : i27, 0, a2Var != a2Var2 ? b.k(j15) : i27, 5, null);
        if (i15 <= 0) {
            return new u0(v.n(), i27, i19, i18, a2Var, -i17, i16 + i18, false, iJ, null, null, 0.0f, 0, false, oVar, qVar.w(Integer.valueOf(b.n(j15)), Integer.valueOf(b.m(j15)), new l() { // from class: i1.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.q((e4.a2.a) obj);
                }
            }), false, null, null, p0Var, dVar, jB, 393216, null);
        }
        int i39 = iJ;
        int i45 = i25;
        int i46 = i26;
        while (i45 > 0 && i46 > 0) {
            i45--;
            i46 -= iE;
        }
        int i47 = i46 * (-1);
        if (i45 >= i15) {
            i45 = i15 - 1;
            i47 = 0;
        }
        pq.m mVar = new pq.m();
        int i48 = -i17;
        int i49 = (i19 < 0 ? i19 : 0) + i48;
        int i55 = i47 + i49;
        int iMax2 = 0;
        while (i55 < 0 && i45 > 0) {
            int i56 = i45 - 1;
            n nVarK = k(z0Var, i56, jB, l0Var, j16, a2Var, bVar, interfaceC1317c, z0Var.getLayoutDirection(), z15, i27, j0Var);
            mVar.add(0, nVarK);
            iMax2 = Math.max(iMax2, nVarK.getCrossAxisSize());
            i55 += iE;
            i45 = i56;
        }
        if (i55 < i49) {
            i55 = i49;
        }
        int i57 = i55 - i49;
        int i58 = i16 + i18;
        int i59 = i45;
        int iE2 = m.e(i58, 0);
        int i65 = -i57;
        int i66 = i59;
        int i67 = 0;
        boolean z17 = false;
        while (i67 < mVar.size()) {
            if (i65 >= iE2) {
                mVar.remove(i67);
                i0 i0Var = i0.f148189a;
                z17 = true;
            } else {
                i66++;
                i65 += iE;
                i67++;
            }
        }
        int i68 = i57;
        int i69 = i66;
        boolean z18 = z17;
        while (i69 < i15 && (i65 < iE2 || i65 <= 0 || mVar.isEmpty())) {
            int i75 = iE2;
            int i76 = i69;
            int iMax3 = iMax2;
            n nVarK2 = k(z0Var, i76, jB, l0Var, j16, a2Var, bVar, interfaceC1317c, z0Var.getLayoutDirection(), z15, i27, j0Var);
            int i77 = i68;
            int i78 = i15 - 1;
            i65 += i76 == i78 ? i27 : iE;
            if (i65 > i49 || i76 == i78) {
                iMax3 = Math.max(iMax3, nVarK2.getCrossAxisSize());
                mVar.add(nVarK2);
                i38 = i59;
                i68 = i77;
            } else {
                i38 = i76 + 1;
                i68 = i77 - iE;
                i0 i0Var2 = i0.f148189a;
                z18 = true;
            }
            iMax2 = iMax3;
            i69 = i76 + 1;
            i59 = i38;
            iE2 = i75;
        }
        int i79 = iMax2;
        int i85 = i69;
        int i86 = i68;
        if (i65 < i16) {
            int i87 = i16 - i65;
            i35 = i86 - i87;
            i65 += i87;
            iMax = i79;
            i36 = i59;
            while (i35 < i17 && i36 > 0) {
                int i88 = i36 - 1;
                n nVarK3 = k(z0Var, i88, jB, l0Var, j16, a2Var, bVar, interfaceC1317c, z0Var.getLayoutDirection(), z15, i27, j0Var);
                mVar.add(0, nVarK3);
                iMax = Math.max(iMax, nVarK3.getCrossAxisSize());
                i35 += iE;
                i85 = i85;
                i36 = i88;
            }
            i29 = i85;
            z16 = false;
            if (i35 < 0) {
                i65 += i35;
                i35 = 0;
            }
        } else {
            i29 = i85;
            z16 = false;
            iMax = i79;
            i35 = i86;
            i36 = i59;
        }
        if (!(i35 >= 0 ? true : z16)) {
            e.a("invalid currentFirstPageScrollOffset");
        }
        int i89 = iMax;
        int i95 = -i35;
        n nVar2 = (n) mVar.first();
        if (i17 > 0 || i19 < 0) {
            int size = mVar.size();
            i37 = i95;
            int i96 = 0;
            while (i96 < size && i35 != 0 && iE <= i35 && i96 != v.p(mVar)) {
                i35 -= iE;
                i96++;
                nVar2 = (n) mVar.get(i96);
            }
        } else {
            i37 = i95;
        }
        int i97 = i35;
        n nVar3 = nVar2;
        List<n> listJ = j(i36, i39, list, new l() { // from class: i1.n0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.m(z0Var, jB, l0Var, j16, a2Var, bVar, interfaceC1317c, z15, i27, j0Var, ((Integer) obj).intValue());
            }
        });
        int size2 = listJ.size();
        int iMax4 = i89;
        int i98 = 0;
        while (i98 < size2) {
            iMax4 = Math.max(iMax4, listJ.get(i98).getCrossAxisSize());
            i98++;
            listJ = listJ;
        }
        List<n> list3 = listJ;
        List<n> listI = i(((n) mVar.last()).getIndex(), i15, i39, list, new l() { // from class: i1.o0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.n(z0Var, jB, l0Var, j16, a2Var, bVar, interfaceC1317c, z15, i27, j0Var, ((Integer) obj).intValue());
            }
        });
        int size3 = listI.size();
        int i99 = 0;
        while (i99 < size3) {
            iMax4 = Math.max(iMax4, listI.get(i99).getCrossAxisSize());
            i99++;
            i39 = i39;
        }
        int i100 = i39;
        boolean z19 = fr.t.c(nVar3, mVar.first()) && list3.isEmpty() && listI.isEmpty();
        a2 a2Var3 = a2.Vertical;
        int iG = c5.c.g(j15, a2Var == a2Var3 ? iMax4 : i65);
        if (a2Var == a2Var3) {
            iMax4 = i65;
        }
        int iF = c5.c.f(j15, iMax4);
        int i101 = iE;
        int i102 = i29;
        int i103 = i65;
        final List<n> listG = g(z0Var, mVar, list3, listI, iG, iF, i103, i16, i37, a2Var, z15, z0Var, i19, i27);
        if (z19) {
            nVar = nVar3;
            list2 = listG;
        } else {
            ArrayList arrayList3 = new ArrayList(listG.size());
            int size4 = listG.size();
            int i104 = 0;
            while (i104 < size4) {
                n nVar4 = listG.get(i104);
                n nVar5 = nVar4;
                n nVar6 = nVar3;
                int i105 = i101;
                if (nVar5.getIndex() >= ((n) mVar.first()).getIndex() && nVar5.getIndex() <= ((n) mVar.last()).getIndex()) {
                    arrayList3.add(nVar4);
                }
                i104++;
                i101 = i105;
                nVar3 = nVar6;
            }
            nVar = nVar3;
            list2 = arrayList3;
        }
        int i106 = i101;
        if (list3.isEmpty()) {
            arrayList = v.n();
        } else {
            arrayList = new ArrayList(listG.size());
            int size5 = listG.size();
            for (int i107 = 0; i107 < size5; i107++) {
                n nVar7 = listG.get(i107);
                if (nVar7.getIndex() < ((n) mVar.first()).getIndex()) {
                    arrayList.add(nVar7);
                }
            }
        }
        List list4 = arrayList;
        if (listI.isEmpty()) {
            arrayList2 = v.n();
        } else {
            arrayList2 = new ArrayList(listG.size());
            int size6 = listG.size();
            for (int i108 = 0; i108 < size6; i108++) {
                n nVar8 = listG.get(i108);
                if (nVar8.getIndex() > ((n) mVar.last()).getIndex()) {
                    arrayList2.add(nVar8);
                }
            }
        }
        List list5 = arrayList2;
        int i109 = i16 + i17 + i18;
        n nVarF = f(i109, list2, i17, i18, i27, oVar, i15);
        return new u0(list2, i27, i19, i18, a2Var, i48, i58, z15, i100, nVar, nVarF, i106 == 0 ? 0.0f : m.m((oVar.a(i109, i27, i17, i18, nVarF != null ? nVarF.getIndex() : 0, i15) - (nVarF != null ? nVarF.getOffset() : 0)) / i106, -0.5f, 0.5f), i97, i102 < i15 || i103 > i16, oVar, qVar.w(Integer.valueOf(iG), Integer.valueOf(iF), new l() { // from class: i1.p0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.o(a3Var, listG, (e4.a2.a) obj);
            }
        }), z18, list4, list5, p0Var, dVar, jB, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n m(z0 z0Var, long j15, l0 l0Var, long j16, a2 a2Var, c.b bVar, c.InterfaceC1317c interfaceC1317c, boolean z15, int i15, j0 j0Var, int i16) {
        return k(z0Var, i16, j15, l0Var, j16, a2Var, bVar, interfaceC1317c, z0Var.getLayoutDirection(), z15, i15, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n n(z0 z0Var, long j15, l0 l0Var, long j16, a2 a2Var, c.b bVar, c.InterfaceC1317c interfaceC1317c, boolean z15, int i15, j0 j0Var, int i16) {
        return k(z0Var, i16, j15, l0Var, j16, a2Var, bVar, interfaceC1317c, z0Var.getLayoutDirection(), z15, i15, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(a3 a3Var, final List list, e4.a2.a aVar) {
        aVar.r0(new l() { // from class: i1.q0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.p(list, (e4.a2.a) obj);
            }
        });
        s2.a(a3Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(List list, e4.a2.a aVar) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((n) list.get(i15)).g(aVar);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(e4.a2.a aVar) {
        return i0.f148189a;
    }
}
