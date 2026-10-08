package f1;

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
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0011\u001a\u0095\u0002\u0010/\u001a\u00020.2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u000e2*\u0010-\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)\u0012\u0004\u0012\u00020,0(H\u0000¢\u0006\u0004\b/\u00100\u001aI\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0018012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b3\u00104\u001a;\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b6\u00107\u001a\u0093\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0018012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b@\u0010A¨\u0006B"}, d2 = {"", "itemsCount", "Lf1/k0;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "isVertical", "Ld1/i$n;", "verticalArrangement", "Ld1/i$e;", "horizontalArrangement", "reverseLayout", "Lc5/d;", "density", "Lh1/f0;", "Lf1/j0;", "itemAnimator", "beyondBoundsItemCount", "", "pinnedItems", "hasLookaheadOccurred", "isLookingAhead", "Lju/p0;", "coroutineScope", "Lh1/s2;", "placementScopeInvalidator", "Ln3/x1;", "graphicsContext", "Lh1/e3;", "stickyItemsPlacement", "shouldRunItemAnimation", "Lkotlin/Function3;", "Lkotlin/Function1;", "Le4/a2$a;", "Loq/i0;", "Le4/x0;", "layout", "Lf1/i0;", "i", "(ILf1/k0;IIIIIIFJZLd1/i$n;Ld1/i$e;ZLc5/d;Lh1/f0;ILjava/util/List;ZZLju/p0;Lm2/a3;Ln3/x1;Lh1/e3;ZLer/q;)Lf1/i0;", "", "visibleItems", "g", "(Ljava/util/List;Lf1/k0;IILjava/util/List;)Ljava/util/List;", "currentFirstItemIndex", "h", "(ILf1/k0;ILjava/util/List;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "e", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLd1/i$n;Ld1/i$e;ZLc5/d;)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    private static final List<j0> e(List<j0> list, List<j0> list2, List<j0> list3, int i15, int i16, int i17, int i18, int i19, boolean z15, d1.i.n nVar, d1.i.e eVar, boolean z16, c5.d dVar) {
        int i25 = z15 ? i16 : i15;
        int i26 = 0;
        boolean z17 = i17 < Math.min(i25, i18);
        if (z17) {
            if (!(i19 == 0)) {
                c1.e.c("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z17) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                c1.e.a("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i26 < size) {
                iArr[i26] = list.get(f(i26, z16, size)).getSize();
                i26++;
            }
            int[] iArr2 = new int[size];
            if (z15) {
                if (nVar == null) {
                    c1.e.b("null verticalArrangement when isVertical == true");
                    throw new oq.g();
                }
                nVar.c(dVar, i25, iArr, iArr2);
            } else {
                if (eVar == null) {
                    c1.e.b("null horizontalArrangement when isVertical == false");
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
                    int size2 = iArr2[first];
                    j0 j0Var = list.get(f(first, z16, size));
                    if (z16) {
                        size2 = (i25 - size2) - j0Var.getSize();
                    }
                    j0Var.q(size2, i15, i16);
                    arrayList.add(j0Var);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i19;
            for (int i27 = 0; i27 < size3; i27++) {
                j0 j0Var2 = list2.get(i27);
                mainAxisSizeWithSpacings -= j0Var2.getMainAxisSizeWithSpacings();
                j0Var2.q(mainAxisSizeWithSpacings, i15, i16);
                arrayList.add(j0Var2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i19;
            for (int i28 = 0; i28 < size4; i28++) {
                j0 j0Var3 = list.get(i28);
                j0Var3.q(mainAxisSizeWithSpacings2, i15, i16);
                arrayList.add(j0Var3);
                mainAxisSizeWithSpacings2 += j0Var3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            while (i26 < size5) {
                j0 j0Var4 = list3.get(i26);
                j0Var4.q(mainAxisSizeWithSpacings2, i15, i16);
                arrayList.add(j0Var4);
                mainAxisSizeWithSpacings2 += j0Var4.getMainAxisSizeWithSpacings();
                i26++;
            }
        }
        return arrayList;
    }

    private static final int f(int i15, boolean z15, int i16) {
        return !z15 ? i15 : (i16 - i15) - 1;
    }

    private static final List<j0> g(List<j0> list, k0 k0Var, int i15, int i16, List<Integer> list2) {
        k0 k0Var2;
        k0 k0Var3;
        int iMin = Math.min(((j0) pq.v.x0(list)).getIndex() + i16, i15 - 1);
        int index = ((j0) pq.v.x0(list)).getIndex() + 1;
        ArrayList arrayList = null;
        if (index <= iMin) {
            int i17 = index;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                k0Var2 = k0Var;
                arrayList.add(k0.f(k0Var2, i17, 0L, 2, null));
                if (i17 == iMin) {
                    break;
                }
                i17++;
                k0Var = k0Var2;
            }
        } else {
            k0Var2 = k0Var;
        }
        if (arrayList != null && ((j0) pq.v.x0(arrayList)).getIndex() > iMin) {
            iMin = ((j0) pq.v.x0(arrayList)).getIndex();
        }
        int size = list2.size();
        int i18 = 0;
        while (i18 < size) {
            int iIntValue = list2.get(i18).intValue();
            if (iIntValue > iMin) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                k0Var3 = k0Var2;
                arrayList.add(k0.f(k0Var3, iIntValue, 0L, 2, null));
            } else {
                k0Var3 = k0Var2;
            }
            i18++;
            k0Var2 = k0Var3;
        }
        return arrayList == null ? pq.v.n() : arrayList;
    }

    private static final List<j0> h(int i15, k0 k0Var, int i16, List<Integer> list) {
        k0 k0Var2;
        int iMax = Math.max(0, i15 - i16);
        int i17 = i15 - 1;
        ArrayList arrayList = null;
        if (iMax <= i17) {
            int i18 = i17;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                k0Var2 = k0Var;
                arrayList.add(k0.f(k0Var2, i18, 0L, 2, null));
                if (i18 == iMax) {
                    break;
                }
                i18--;
                k0Var = k0Var2;
            }
        } else {
            k0Var2 = k0Var;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i19 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(k0.f(k0Var2, iIntValue, 0L, 2, null));
                }
                if (i19 < 0) {
                    break;
                }
                size = i19;
            }
        }
        return arrayList == null ? pq.v.n() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:170:0x041a  */
    public static final i0 i(int i15, k0 k0Var, int i16, int i17, int i18, int i19, int i25, int i26, float f15, long j15, boolean z15, d1.i.n nVar, d1.i.e eVar, boolean z16, c5.d dVar, p056h1.f0<j0> f0Var, int i27, List<Integer> list, boolean z17, boolean z18, ju.p0 p0Var, final a3<oq.i0> a3Var, x1 x1Var, e3 e3Var, boolean z19, er.q<? super Integer, ? super Integer, ? super er.l<? super a2.a, oq.i0>, ? extends p036e4.x0> qVar) {
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        k0 k0Var2;
        int i38;
        int iMax;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        List<j0> list2;
        int i49;
        final k0 k0Var3;
        int i55;
        final boolean z25;
        int i56;
        Integer numValueOf;
        if (!(i17 >= 0)) {
            c1.e.a("invalid beforeContentPadding");
        }
        if (!(i18 >= 0)) {
            c1.e.a("invalid afterContentPadding");
        }
        if (i15 <= 0) {
            int iN = c5.b.n(j15);
            int iM = c5.b.m(j15);
            f0Var.m(0, iN, iM, new ArrayList(), k0Var.i(), k0Var, z15, z18, 1, z17, 0, 0, p0Var, x1Var);
            if (!z18) {
                long jI = f0Var.i();
                if (!c5.r.e(jI, c5.r.INSTANCE.a())) {
                    iN = c5.c.g(j15, (int) (jI >> 32));
                    iM = c5.c.f(j15, (int) (jI & BodyPartID.bodyIdMax));
                }
            }
            return new i0(null, 0, false, 0.0f, qVar.w(Integer.valueOf(iN), Integer.valueOf(iM), new er.l() { // from class: f1.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.j((a2.a) obj);
                }
            }), 0.0f, false, p0Var, dVar, k0Var.getChildConstraints(), pq.v.n(), -i17, i16 + i18, 0, z16, z15 ? p143z0.a2.Vertical : p143z0.a2.Horizontal, i18, i19, null);
        }
        int i57 = i25;
        if (i57 >= i15) {
            i57 = i15 - 1;
            i28 = 0;
        } else {
            i28 = i26;
        }
        int iRound = Math.round(f15);
        int i58 = i28 - iRound;
        if (i57 == 0 && i58 < 0) {
            iRound += i58;
            i58 = 0;
        }
        int i59 = iRound;
        pq.m mVar = new pq.m();
        int i65 = -i17;
        int i66 = (i19 < 0 ? i19 : 0) + i65;
        int mainAxisSizeWithSpacings = i58 + i66;
        int iMax2 = 0;
        while (mainAxisSizeWithSpacings < 0 && i57 > 0) {
            int i67 = i57 - 1;
            pq.m mVar2 = mVar;
            j0 j0VarF = k0.f(k0Var, i67, 0L, 2, null);
            mVar2.add(0, j0VarF);
            iMax2 = Math.max(iMax2, j0VarF.getCrossAxisSize());
            mainAxisSizeWithSpacings = j0VarF.getMainAxisSizeWithSpacings() + mainAxisSizeWithSpacings;
            i57 = i67;
            mVar = mVar2;
            i66 = i66;
            i65 = i65;
            i59 = i59;
        }
        int i68 = mainAxisSizeWithSpacings;
        pq.m mVar3 = mVar;
        int i69 = i65;
        int i75 = iMax2;
        int i76 = i59;
        int i77 = i66;
        if (i68 < i77) {
            i35 = i76 - (i77 - i68);
            i29 = i77;
        } else {
            i29 = i68;
            i35 = i76;
        }
        int i78 = i29 - i77;
        int i79 = i16 + i18;
        int iE = lr.m.e(i79, 0);
        int mainAxisSizeWithSpacings2 = -i78;
        int i85 = i57;
        int i86 = 0;
        boolean z26 = false;
        while (i86 < mVar3.size()) {
            if (mainAxisSizeWithSpacings2 >= iE) {
                mVar3.remove(i86);
                oq.i0 i0Var = oq.i0.f148189a;
                z26 = true;
            } else {
                i85++;
                mainAxisSizeWithSpacings2 += ((j0) mVar3.get(i86)).getMainAxisSizeWithSpacings();
                i86++;
            }
        }
        int i87 = i57;
        int i88 = i79;
        int i89 = i75;
        int i95 = i85;
        int mainAxisSizeWithSpacings3 = mainAxisSizeWithSpacings2;
        int mainAxisSizeWithSpacings4 = i78;
        while (i95 < i15 && (mainAxisSizeWithSpacings3 < iE || mainAxisSizeWithSpacings3 <= 0 || mVar3.isEmpty())) {
            int i96 = i89;
            int i97 = iE;
            int i98 = i87;
            int i99 = i88;
            j0 j0VarF2 = k0.f(k0Var, i95, 0L, 2, null);
            int i100 = i95;
            mainAxisSizeWithSpacings3 += j0VarF2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings3 > i77 || i100 == i15 - 1) {
                int iMax3 = Math.max(i96, j0VarF2.getCrossAxisSize());
                mVar3.add(j0VarF2);
                i87 = i98;
                i89 = iMax3;
            } else {
                mainAxisSizeWithSpacings4 -= j0VarF2.getMainAxisSizeWithSpacings();
                oq.i0 i0Var2 = oq.i0.f148189a;
                i89 = i96;
                z26 = true;
                i87 = i100 + 1;
            }
            i95 = i100 + 1;
            i88 = i99;
            iE = i97;
        }
        int i101 = i88;
        int i102 = i95;
        int i103 = i87;
        int iMax4 = i89;
        if (mainAxisSizeWithSpacings3 < i16) {
            int i104 = i16 - mainAxisSizeWithSpacings3;
            int i105 = mainAxisSizeWithSpacings3 + i104;
            int i106 = i103;
            int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings4 - i104;
            while (mainAxisSizeWithSpacings5 < i17 && i106 > 0) {
                i106--;
                int i107 = mainAxisSizeWithSpacings5;
                j0 j0VarF3 = k0.f(k0Var, i106, 0L, 2, null);
                mVar3.add(0, j0VarF3);
                iMax4 = Math.max(iMax4, j0VarF3.getCrossAxisSize());
                mainAxisSizeWithSpacings5 = i107 + j0VarF3.getMainAxisSizeWithSpacings();
                i102 = i102;
                i105 = i105;
            }
            int i108 = mainAxisSizeWithSpacings5;
            int i109 = i105;
            i37 = i102;
            k0Var2 = k0Var;
            i38 = i104 + i35;
            if (i108 < 0) {
                i38 += i108;
                iMax = iMax4;
                i45 = i106;
                i36 = i109 + i108;
                i39 = 0;
            } else {
                iMax = iMax4;
                i39 = i108;
                i45 = i106;
                i36 = i109;
            }
        } else {
            i36 = mainAxisSizeWithSpacings3;
            i37 = i102;
            k0Var2 = k0Var;
            i38 = i35;
            iMax = iMax4;
            i39 = mainAxisSizeWithSpacings4;
            i45 = i103;
        }
        float f16 = (hr.a.a(Math.round(f15)) != hr.a.a(i38) || Math.abs(Math.round(f15)) < Math.abs(i38)) ? f15 : i38;
        float f17 = f15 - f16;
        float f18 = 0.0f;
        if (z18 && i38 > i35 && f17 <= 0.0f) {
            f18 = (i38 - i35) + f17;
        }
        if (!(i39 >= 0)) {
            c1.e.a("negative currentFirstItemScrollOffset");
        }
        int i110 = -i39;
        j0 j0Var = (j0) mVar3.first();
        if (i17 > 0 || i19 < 0) {
            int size = mVar3.size();
            int i111 = 0;
            while (true) {
                if (i111 >= size) {
                    i46 = i39;
                    i47 = i110;
                    break;
                }
                i47 = i110;
                int mainAxisSizeWithSpacings6 = ((j0) mVar3.get(i111)).getMainAxisSizeWithSpacings();
                if (i39 == 0 || mainAxisSizeWithSpacings6 > i39) {
                    i46 = i39;
                    break;
                }
                i46 = i39;
                if (i111 == pq.v.p(mVar3)) {
                    break;
                }
                i39 = i46 - mainAxisSizeWithSpacings6;
                i111++;
                j0Var = (j0) mVar3.get(i111);
                i110 = i47;
            }
            i48 = i46;
        } else {
            i48 = i39;
            i47 = i110;
        }
        j0 j0Var2 = j0Var;
        List<j0> listH = h(i45, k0Var2, i27, list);
        int size2 = listH.size();
        for (int i112 = 0; i112 < size2; i112++) {
            iMax = Math.max(iMax, listH.get(i112).getCrossAxisSize());
        }
        List<j0> listG = g(mVar3, k0Var2, i15, i27, list);
        int size3 = listG.size();
        for (int i113 = 0; i113 < size3; i113++) {
            iMax = Math.max(iMax, listG.get(i113).getCrossAxisSize());
        }
        boolean z27 = fr.t.c(j0Var2, mVar3.first()) && listH.isEmpty() && listG.isEmpty();
        int iG = c5.c.g(j15, z15 ? iMax : i36);
        if (z15) {
            iMax = i36;
        }
        int iF = c5.c.f(j15, iMax);
        float f19 = f16;
        int i114 = i36;
        List<j0> listE = e(mVar3, listH, listG, iG, iF, i114, i16, i47, z15, nVar, eVar, z16, dVar);
        int iG2 = iG;
        if (!w0.g0.isSkipItemPlacementAnimationFixEnabled || z19) {
            list2 = listE;
            i49 = i114;
            int i115 = i48;
            f0Var.m((int) f19, iG2, iF, list2, k0Var.i(), k0Var, z15, z18, 1, z17, i115, i49, p0Var, x1Var);
            k0Var3 = k0Var;
            i55 = i115;
            z25 = z18;
        } else {
            i55 = i48;
            k0Var3 = k0Var;
            z25 = z18;
            list2 = listE;
            i49 = i114;
        }
        if (z25) {
            i56 = iF;
        } else {
            long jI2 = f0Var.i();
            if (c5.r.e(jI2, c5.r.INSTANCE.a())) {
                i56 = iF;
            } else {
                int i116 = z15 ? iF : iG2;
                iG2 = c5.c.g(j15, Math.max(iG2, (int) (jI2 >> 32)));
                int iF2 = c5.c.f(j15, Math.max(iF, (int) (jI2 & BodyPartID.bodyIdMax)));
                int i117 = z15 ? iF2 : iG2;
                if (i117 != i116) {
                    int size4 = list2.size();
                    for (int i118 = 0; i118 < size4; i118++) {
                        list2.get(i118).r(i117);
                    }
                }
                i56 = iF2;
            }
        }
        int i119 = iG2;
        j0 j0Var3 = (j0) mVar3.n();
        int index = j0Var3 != null ? j0Var3.getIndex() : 0;
        j0 j0Var4 = (j0) mVar3.s();
        final List<j0> list3 = list2;
        final List listB = c2.b(e3Var, index, j0Var4 != null ? j0Var4.getIndex() : 0, list3, k0Var3.h(), i17, i18, i119, i56, new er.l() { // from class: f1.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.k(k0Var3, ((Integer) obj).intValue());
            }
        });
        Integer numValueOf2 = null;
        if (z27) {
            j0 j0Var5 = (j0) pq.v.n0(list3);
            if (j0Var5 != null) {
                numValueOf = Integer.valueOf(j0Var5.getIndex());
            } else {
                numValueOf = null;
            }
        } else {
            j0 j0Var6 = (j0) mVar3.n();
            if (j0Var6 != null) {
                numValueOf = Integer.valueOf(j0Var6.getIndex());
            } else {
                numValueOf = null;
            }
        }
        if (z27) {
            j0 j0Var7 = (j0) pq.v.z0(list3);
            if (j0Var7 != null) {
                numValueOf2 = Integer.valueOf(j0Var7.getIndex());
            }
        } else {
            j0 j0Var8 = (j0) mVar3.s();
            if (j0Var8 != null) {
                numValueOf2 = Integer.valueOf(j0Var8.getIndex());
            }
        }
        return new i0(j0Var2, i55, i37 < i15 || i49 > i16, f19, qVar.w(Integer.valueOf(i119), Integer.valueOf(i56), new er.l() { // from class: f1.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.l(a3Var, list3, listB, z25, (a2.a) obj);
            }
        }), f18, z26, p0Var, dVar, k0Var3.getChildConstraints(), p056h1.d1.c(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, list3, listB), i69, i101, i15, z16, z15 ? p143z0.a2.Vertical : p143z0.a2.Horizontal, i18, i19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(a2.a aVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 k(k0 k0Var, int i15) {
        return k0.f(k0Var, i15, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(a3 a3Var, final List list, final List list2, final boolean z15, a2.a aVar) {
        aVar.r0(new er.l() { // from class: f1.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.m(list, list2, z15, (a2.a) obj);
            }
        });
        s2.a(a3Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(List list, List list2, boolean z15, a2.a aVar) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((j0) list.get(i15)).p(aVar, z15);
        }
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((j0) list2.get(i16)).p(aVar, z15);
        }
        return oq.i0.f148189a;
    }
}
