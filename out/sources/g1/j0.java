package g1;

import java.util.ArrayList;
import java.util.List;
import n3.x1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p056h1.c2;
import p056h1.e3;
import p056h1.s2;
import p071kotlin.Metadata;
import p076m2.a3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aÙ\u0002\u00105\u001a\u0002042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2$\u0010+\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0*0\u001d0)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000)2\b\u0010.\u001a\u0004\u0018\u00010-2*\u00103\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010)\u0012\u0004\u0012\u0002020/H\u0000¢\u0006\u0004\b5\u00106\u001aM\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u001d2\u0006\u00107\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001d2\b\u0010:\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b;\u0010<\u001a\u0093\u0001\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0E2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002080\u001d2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bF\u0010G\u001a-\u0010K\u001a\u000201\"\u0004\b\u0000\u0010H*\b\u0012\u0004\u0012\u00028\u00000E2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000IH\u0002¢\u0006\u0004\bK\u0010L¨\u0006M"}, d2 = {"", "itemsCount", "Lg1/o0;", "measuredLineProvider", "Lg1/m0;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "isVertical", "Ld1/i$n;", "verticalArrangement", "Ld1/i$e;", "horizontalArrangement", "reverseLayout", "Lc5/d;", "density", "Lh1/f0;", "Lg1/l0;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "isInLookaheadScope", "isLookingAhead", "Lg1/d0;", "approachLayoutInfo", "Lju/p0;", "coroutineScope", "Lh1/s2;", "placementScopeInvalidator", "Ln3/x1;", "graphicsContext", "Lkotlin/Function1;", "Loq/r;", "prefetchInfoRetriever", "lineIndexProvider", "Lh1/e3;", "stickyItemsScrollBehavior", "Lkotlin/Function3;", "Le4/a2$a;", "Loq/i0;", "Le4/x0;", "layout", "Lg1/k0;", "i", "(ILg1/o0;Lg1/m0;IIIIIIFJZLd1/i$n;Ld1/i$e;ZLc5/d;Lh1/f0;ILjava/util/List;ZZLg1/d0;Lju/p0;Lm2/a3;Ln3/x1;Ler/l;Ler/l;Lh1/e3;Ler/q;)Lg1/k0;", "lastVisibleItemIndex", "Lg1/n0;", "visibleLines", "lastApproachLayoutInfo", "h", "(IILg1/o0;ZLjava/util/List;Lg1/d0;)Ljava/util/List;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "f", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLd1/i$n;Ld1/i$e;ZLc5/d;)Ljava/util/List;", "T", "", "arr", "e", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {
    private static final <T> void e(List<T> list, T[] tArr) {
        for (T t15 : tArr) {
            list.add(t15);
        }
    }

    private static final List<l0> f(List<n0> list, List<l0> list2, List<l0> list3, int i15, int i16, int i17, int i18, int i19, boolean z15, d1.i.n nVar, d1.i.e eVar, boolean z16, c5.d dVar) {
        int i25 = z15 ? i16 : i15;
        boolean z17 = i17 < Math.min(i25, i18);
        if (z17) {
            if (!(i19 == 0)) {
                c1.e.c("non-zero firstLineScrollOffset");
            }
        }
        List<n0> list4 = list;
        int size = list4.size();
        int length = 0;
        for (int i26 = 0; i26 < size; i26++) {
            length += list.get(i26).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z17) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                c1.e.a("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i27 = 0; i27 < size2; i27++) {
                iArr[i27] = list.get(g(i27, z16, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z15) {
                if (nVar == null) {
                    c1.e.b("null verticalArrangement");
                    throw new oq.g();
                }
                nVar.c(dVar, i25, iArr, iArr2);
            } else {
                if (eVar == null) {
                    c1.e.b("null horizontalArrangement");
                    throw new oq.g();
                }
                eVar.b(dVar, i25, iArr, c5.t.Ltr, iArr2);
            }
            lr.g gVarQ0 = pq.n.q0(iArr2);
            if (z16) {
                gVarQ0 = lr.m.t(gVarQ0);
            }
            int first = gVarQ0.getFirst();
            int last = gVarQ0.getLast();
            int step = gVarQ0.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    n0 n0Var = list.get(g(first, z16, size2));
                    if (z16) {
                        mainAxisSize = (i25 - mainAxisSize) - n0Var.getMainAxisSize();
                    }
                    e(arrayList, n0Var.f(mainAxisSize, i15, i16));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i19;
                while (true) {
                    int i28 = size3 - 1;
                    l0 l0Var = list2.get(size3);
                    mainAxisSizeWithSpacings -= l0Var.getMainAxisSizeWithSpacings();
                    l0Var.j(mainAxisSizeWithSpacings, 0, i15, i16);
                    arrayList.add(l0Var);
                    if (i28 < 0) {
                        break;
                    }
                    size3 = i28;
                }
            }
            int size4 = list4.size();
            int mainAxisSizeWithSpacings2 = i19;
            for (int i29 = 0; i29 < size4; i29++) {
                n0 n0Var2 = list.get(i29);
                e(arrayList, n0Var2.f(mainAxisSizeWithSpacings2, i15, i16));
                mainAxisSizeWithSpacings2 += n0Var2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i35 = 0; i35 < size5; i35++) {
                l0 l0Var2 = list3.get(i35);
                l0Var2.j(mainAxisSizeWithSpacings2, 0, i15, i16);
                arrayList.add(l0Var2);
                mainAxisSizeWithSpacings2 += l0Var2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int g(int i15, boolean z15, int i16) {
        return !z15 ? i15 : (i16 - i15) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    private static final List<n0> h(int i15, int i16, o0 o0Var, boolean z15, List<n0> list, d0 d0Var) {
        m mVar;
        int index;
        int iMin;
        ArrayList arrayList = null;
        if (z15 && d0Var != null && !d0Var.j().isEmpty()) {
            List<m> listJ = d0Var.j();
            int size = listJ.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    mVar = null;
                    break;
                }
                if (listJ.get(size).getIndex() > i15 && (size == 0 || listJ.get(size - 1).getIndex() <= i15)) {
                    mVar = listJ.get(size);
                    break;
                }
            }
            m mVar2 = (m) pq.v.x0(d0Var.j());
            n0 n0Var = (n0) pq.v.z0(list);
            int index2 = n0Var != null ? n0Var.getIndex() + 1 : 0;
            if (mVar != null && (index = mVar.getIndex()) <= (iMin = Math.min(mVar2.getIndex(), i16 - 1))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                l0[] items = arrayList.get(i17).getItems();
                                int length = items.length;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= length) {
                                        i17++;
                                    } else if (items[i18].getIndex() != index) {
                                        i18++;
                                    }
                                }
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                n0 n0VarC = o0Var.c(index2);
                                index2++;
                                arrayList.add(n0VarC);
                            }
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        n0 n0VarC2 = o0Var.c(index2);
                        index2++;
                        arrayList.add(n0VarC2);
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
        }
        return arrayList == null ? pq.v.n() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0421  */
    public static final k0 i(int i15, final o0 o0Var, final m0 m0Var, int i16, int i17, int i18, int i19, int i25, int i26, float f15, long j15, boolean z15, d1.i.n nVar, d1.i.e eVar, boolean z16, c5.d dVar, p056h1.f0<l0> f0Var, int i27, List<Integer> list, boolean z17, final boolean z18, d0 d0Var, ju.p0 p0Var, final a3<oq.i0> a3Var, x1 x1Var, er.l<? super Integer, ? extends List<oq.r<Integer, c5.b>>> lVar, er.l<? super Integer, Integer> lVar2, e3 e3Var, er.q<? super Integer, ? super Integer, ? super er.l<? super a2.a, oq.i0>, ? extends p036e4.x0> qVar) {
        int i28;
        pq.m mVar;
        int i29;
        l0[] items;
        l0 l0Var;
        l0[] items2;
        l0 l0Var2;
        int i35;
        int i36;
        int i37 = i15;
        boolean z19 = true;
        if (!(i17 >= 0)) {
            c1.e.a("negative beforeContentPadding");
        }
        if (!(i18 >= 0)) {
            c1.e.a("negative afterContentPadding");
        }
        if (i37 <= 0) {
            int iN = c5.b.n(j15);
            int iM = c5.b.m(j15);
            f0Var.m(0, iN, iM, new ArrayList(), m0Var.g(), m0Var, z15, z18, i27, z17, 0, 0, p0Var, x1Var);
            if (!z18) {
                long jI = f0Var.i();
                if (!c5.r.e(jI, c5.r.INSTANCE.a())) {
                    iN = c5.c.g(j15, (int) (jI >> 32));
                    iM = c5.c.f(j15, (int) (jI & BodyPartID.bodyIdMax));
                }
            }
            return new k0(null, 0, false, 0.0f, qVar.w(Integer.valueOf(iN), Integer.valueOf(iM), new er.l() { // from class: g1.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return j0.j((a2.a) obj);
                }
            }), 0.0f, false, p0Var, dVar, i27, lVar, lVar2, pq.v.n(), -i17, i16 + i18, 0, z16, z15 ? p143z0.a2.Vertical : p143z0.a2.Horizontal, i18, i19);
        }
        int iRound = Math.round(f15);
        int i38 = i26 - iRound;
        if (i25 == 0 && i38 < 0) {
            iRound += i38;
            i38 = 0;
        }
        pq.m mVar2 = new pq.m();
        int i39 = -i17;
        int i45 = (i19 < 0 ? i19 : 0) + i39;
        int mainAxisSizeWithSpacings = i38 + i45;
        int i46 = i25;
        while (mainAxisSizeWithSpacings < 0 && i46 > 0) {
            i46--;
            n0 n0VarC = o0Var.c(i46);
            mVar2.add(0, n0VarC);
            mainAxisSizeWithSpacings += n0VarC.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i45) {
            iRound -= i45 - mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i45;
        }
        int mainAxisSizeWithSpacings2 = mainAxisSizeWithSpacings - i45;
        int i47 = i16 + i18;
        int i48 = i46;
        int iE = lr.m.e(i47, 0);
        int mainAxisSizeWithSpacings3 = -mainAxisSizeWithSpacings2;
        int i49 = i48;
        int i55 = 0;
        boolean z25 = false;
        while (i55 < mVar2.size()) {
            if (mainAxisSizeWithSpacings3 >= iE) {
                mVar2.remove(i55);
                oq.i0 i0Var = oq.i0.f148189a;
                z25 = true;
            } else {
                i49++;
                mainAxisSizeWithSpacings3 += ((n0) mVar2.get(i55)).getMainAxisSizeWithSpacings();
                i55++;
            }
        }
        int i56 = i48;
        boolean z26 = z25;
        int i57 = i49;
        while (i57 < i37 && (mainAxisSizeWithSpacings3 < iE || mainAxisSizeWithSpacings3 <= 0 || mVar2.isEmpty())) {
            n0 n0VarC2 = o0Var.c(i57);
            if (n0VarC2.e()) {
                break;
            }
            mainAxisSizeWithSpacings3 += n0VarC2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings3 <= i45) {
                i35 = iE;
                i36 = i45;
                if (((l0) pq.n.M0(n0VarC2.getItems())).getIndex() != i15 - 1) {
                    mainAxisSizeWithSpacings2 -= n0VarC2.getMainAxisSizeWithSpacings();
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    i56 = i57 + 1;
                    z26 = true;
                }
                i57++;
                i37 = i15;
                iE = i35;
                i45 = i36;
            } else {
                i35 = iE;
                i36 = i45;
            }
            mVar2.add(n0VarC2);
            i57++;
            i37 = i15;
            iE = i35;
            i45 = i36;
        }
        if (mainAxisSizeWithSpacings3 < i16) {
            int i58 = i16 - mainAxisSizeWithSpacings3;
            mainAxisSizeWithSpacings2 -= i58;
            mainAxisSizeWithSpacings3 += i58;
            while (mainAxisSizeWithSpacings2 < i17 && i56 > 0) {
                i56--;
                n0 n0VarC3 = o0Var.c(i56);
                mVar2.add(0, n0VarC3);
                mainAxisSizeWithSpacings2 += n0VarC3.getMainAxisSizeWithSpacings();
            }
            i28 = i58 + iRound;
            if (mainAxisSizeWithSpacings2 < 0) {
                i28 += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings3 += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings2 = 0;
            }
        } else {
            i28 = iRound;
        }
        float f16 = (hr.a.a(Math.round(f15)) != hr.a.a(i28) || Math.abs(Math.round(f15)) < Math.abs(i28)) ? f15 : i28;
        float f17 = f15 - f16;
        float f18 = 0.0f;
        if (z18 && i28 > iRound && f17 <= 0.0f) {
            f18 = (i28 - iRound) + f17;
        }
        float f19 = f18;
        if (!(mainAxisSizeWithSpacings2 >= 0)) {
            c1.e.a("negative initial offset");
        }
        int i59 = -mainAxisSizeWithSpacings2;
        n0 n0Var = (n0) mVar2.n();
        int index = (n0Var == null || (items2 = n0Var.getItems()) == null || (l0Var2 = (l0) pq.n.p0(items2)) == null) ? 0 : l0Var2.getIndex();
        n0 n0Var2 = (n0) mVar2.s();
        int index2 = (n0Var2 == null || (items = n0Var2.getItems()) == null || (l0Var = (l0) pq.n.T0(items)) == null) ? 0 : l0Var.getIndex();
        List<Integer> list2 = list;
        int size = list2.size();
        List listN = null;
        List listN2 = null;
        int i65 = 0;
        while (i65 < size) {
            int i66 = size;
            int iIntValue = list.get(i65).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                int iE2 = o0Var.e(iIntValue);
                l0 l0VarA = m0Var.a(iIntValue, 0, iE2, o0Var.a(0, iE2));
                if (listN2 == null) {
                    listN2 = new ArrayList();
                }
                List list3 = listN2;
                list3.add(l0VarA);
                listN2 = list3;
            }
            i65++;
            size = i66;
            index = index;
        }
        int i67 = index;
        if (listN2 == null) {
            listN2 = pq.v.n();
        }
        int i68 = index2;
        List<n0> listH = h(i68, i15, o0Var, z18, mVar2, d0Var);
        int i69 = i15;
        o0 o0Var2 = o0Var;
        int size2 = list2.size();
        int i75 = 0;
        while (i75 < size2) {
            int i76 = size2;
            int iIntValue2 = list.get(i75).intValue();
            int i77 = i75;
            if (i68 + 1 <= iIntValue2 && iIntValue2 < i69) {
                if (z18) {
                    int size3 = listH.size();
                    int i78 = 0;
                    while (true) {
                        if (i78 < size3) {
                            int i79 = i78;
                            l0[] items3 = listH.get(i78).getItems();
                            int i85 = size3;
                            int length = items3.length;
                            int i86 = 0;
                            while (true) {
                                if (i86 < length) {
                                    int i87 = i86;
                                    if (items3[i86].getIndex() != iIntValue2) {
                                        i86 = i87 + 1;
                                    }
                                } else {
                                    i78 = i79 + 1;
                                    size3 = i85;
                                }
                            }
                        }
                    }
                }
                int iE3 = o0Var2.e(iIntValue2);
                l0 l0VarA2 = m0Var.a(iIntValue2, 0, iE3, o0Var2.a(0, iE3));
                if (listN == null) {
                    listN = new ArrayList();
                }
                List list4 = listN;
                list4.add(l0VarA2);
                listN = list4;
            }
            i75 = i77 + 1;
            i69 = i15;
            o0Var2 = o0Var;
            size2 = i76;
            mVar2 = mVar2;
            listH = listH;
        }
        pq.m mVar3 = mVar2;
        List<n0> list5 = listH;
        if (listN == null) {
            listN = pq.v.n();
        }
        List list6 = listN;
        if (i17 > 0 || i19 < 0) {
            int size4 = mVar3.size();
            int i88 = 0;
            pq.m mVar4 = mVar3;
            while (true) {
                mVar = mVar4;
                if (i88 >= size4) {
                    break;
                }
                int mainAxisSizeWithSpacings4 = ((n0) mVar.get(i88)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings2 == 0 || mainAxisSizeWithSpacings4 > mainAxisSizeWithSpacings2 || i88 == pq.v.p(mVar)) {
                    break;
                }
                mainAxisSizeWithSpacings2 -= mainAxisSizeWithSpacings4;
                i88++;
                n0Var = (n0) mVar.get(i88);
                mVar4 = mVar;
            }
        } else {
            mVar = mVar3;
        }
        int i89 = mainAxisSizeWithSpacings2;
        n0 n0Var3 = n0Var;
        int iL = z15 ? c5.b.l(j15) : c5.c.g(j15, mainAxisSizeWithSpacings3);
        int iF = z15 ? c5.c.f(j15, mainAxisSizeWithSpacings3) : c5.b.k(j15);
        List listL0 = mVar;
        if (!list5.isEmpty()) {
            listL0 = pq.v.L0(mVar, list5);
        }
        List list7 = listL0;
        int i95 = iF;
        float f25 = f16;
        int i96 = mainAxisSizeWithSpacings3;
        final List<l0> listF = f(list7, listN2, list6, iL, i95, i96, i16, i59, z15, nVar, eVar, z16, dVar);
        f0Var.m((int) f25, iL, i95, listF, m0Var.g(), m0Var, z15, z18, i27, z17, i89, i96, p0Var, x1Var);
        if (z18) {
            i29 = i95;
        } else {
            long jI2 = f0Var.i();
            if (c5.r.e(jI2, c5.r.INSTANCE.a())) {
                i29 = i95;
            } else {
                int i97 = z15 ? i95 : iL;
                iL = c5.c.g(j15, Math.max(iL, (int) (jI2 >> 32)));
                int iF2 = c5.c.f(j15, Math.max(i95, (int) (jI2 & BodyPartID.bodyIdMax)));
                int i98 = z15 ? iF2 : iL;
                if (i98 != i97) {
                    int size5 = listF.size();
                    for (int i99 = 0; i99 < size5; i99++) {
                        listF.get(i99).v(i98);
                    }
                }
                i29 = iF2;
            }
        }
        int i100 = iL;
        final List listB = c2.b(e3Var, i67, i68, listF, m0Var.f(), i17, i18, i100, i29, new er.l() { // from class: g1.g0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.k(o0Var, m0Var, ((Integer) obj).intValue());
            }
        });
        if (i68 == i15 - 1 && i96 <= i16) {
            z19 = false;
        }
        return new k0(n0Var3, i89, z19, f25, qVar.w(Integer.valueOf(i100), Integer.valueOf(i29), new er.l() { // from class: g1.h0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.l(a3Var, listF, listB, z18, (a2.a) obj);
            }
        }), f19, z26, p0Var, dVar, i27, lVar, lVar2, p056h1.d1.c(i67, i68, listF, listB), i39, i47, i15, z16, z15 ? p143z0.a2.Vertical : p143z0.a2.Horizontal, i18, i19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(a2.a aVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 k(o0 o0Var, m0 m0Var, int i15) {
        int iE = o0Var.e(i15);
        return m0Var.a(i15, 0, iE, o0Var.a(0, iE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(a3 a3Var, final List list, final List list2, final boolean z15, a2.a aVar) {
        aVar.r0(new er.l() { // from class: g1.i0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.m(list, list2, z15, (a2.a) obj);
            }
        });
        s2.a(a3Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(List list, List list2, boolean z15, a2.a aVar) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((l0) list.get(i15)).t(aVar, z15);
        }
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((l0) list2.get(i16)).t(aVar, z15);
        }
        return oq.i0.f148189a;
    }
}
