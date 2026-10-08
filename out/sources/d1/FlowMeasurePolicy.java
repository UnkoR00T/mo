package d1;

import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.j1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\"J/\u0010%\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\"J/\u0010&\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\"JK\u0010)\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-JK\u0010/\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b/\u0010*J\u0019\u00101\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b3\u00102J\u0019\u00104\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b4\u00102J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010NR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010O¨\u0006P"}, d2 = {"Ld1/j1;", "Le4/c1;", "Ld1/g1;", "", "isHorizontal", "Ld1/i$e;", "horizontalArrangement", "Ld1/i$n;", "verticalArrangement", "Lc5/h;", "mainAxisSpacing", "Ld1/m0;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Ld1/d1;", "overflow", "<init>", "(ZLd1/i$e;Ld1/i$n;FLd1/m0;FIILd1/d1;Lfr/k;)V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "f", "i", "crossAxisAvailable", "crossAxisSpacing", "A", "(Ljava/util/List;IIIIILd1/d1;)I", "arrangementSpacing", "v", "(Ljava/util/List;II)I", "mainAxisAvailable", "u", "size", "w", "(Le4/v;I)I", "z", "B", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "g", "()Z", "b", "Ld1/i$e;", "q", "()Ld1/i$e;", "Ld1/i$n;", "r", "()Ld1/i$n;", "d", "F", "Ld1/m0;", "m", "()Ld1/m0;", "I", "Ld1/d1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class FlowMeasurePolicy implements p036e4.c1, g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHorizontal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.e horizontalArrangement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.n verticalArrangement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float mainAxisSpacing;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final m0 crossAxisAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float crossAxisArrangementSpacing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxItemsInMainAxis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final FlowLayoutOverflowState overflow;

    public /* synthetic */ FlowMeasurePolicy(boolean z15, i.e eVar, i.n nVar, float f15, m0 m0Var, float f16, int i15, int i16, FlowLayoutOverflowState flowLayoutOverflowState, fr.k kVar) {
        this(z15, eVar, nVar, f15, m0Var, f16, i15, i16, flowLayoutOverflowState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(e4.a2.a aVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(e4.a2.a aVar) {
        return oq.i0.f148189a;
    }

    public final int A(List<? extends p036e4.v> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        List<? extends p036e4.v> list = measurables;
        int i15 = maxItemsInMainAxis;
        int i16 = maxLines;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            p036e4.v vVar = list.get(i17);
            int iB = B(vVar, crossAxisAvailable);
            iArr[i17] = iB;
            iArr2[i17] = z(vVar, iB);
        }
        int i18 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i18 = i15 * i16;
        }
        int i19 = 1;
        int iMin = Math.min(i18 - (((i18 >= list.size() || !(overflow.getType() == a1.a.ExpandIndicator || overflow.getType() == a1.a.ExpandOrCollapseIndicator)) && (i18 < list.size() || i16 < overflow.getMinLinesToShowCollapse() || overflow.getType() != a1.a.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iB1 = pq.n.b1(iArr) + ((list.size() - 1) * mainAxisSpacing);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iE = iArr2[0];
        int iT0 = pq.n.t0(iArr2);
        if (1 <= iT0) {
            int i25 = 1;
            while (true) {
                int i26 = iArr2[i25];
                if (iE < i26) {
                    iE = i26;
                }
                if (i25 == iT0) {
                    break;
                }
                i25++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i27 = iArr[0];
        int iT1 = pq.n.t0(iArr);
        if (1 <= iT1) {
            while (true) {
                int i28 = iArr[i19];
                if (i27 < i28) {
                    i27 = i28;
                }
                if (i19 == iT1) {
                    break;
                }
                i19++;
            }
        }
        int i29 = i27;
        int i35 = iB1;
        while (i29 <= i35 && iE != crossAxisAvailable) {
            int i36 = (i29 + i35) / 2;
            long jQ = z0.q(list, iArr, iArr2, i36, mainAxisSpacing, crossAxisSpacing, i15, i16, overflow);
            iE = r0.n.e(jQ);
            int iF = r0.n.f(jQ);
            if (iE > crossAxisAvailable || iF < iMin) {
                i29 = i36 + 1;
                if (i29 > i35) {
                    return i29;
                }
            } else {
                if (iE >= crossAxisAvailable) {
                    return i36;
                }
                i35 = i36 - 1;
            }
            list = measurables;
            i15 = maxItemsInMainAxis;
            i16 = maxLines;
            iB1 = i36;
        }
        return iB1;
    }

    public final int B(p036e4.v vVar, int i15) {
        return getIsHorizontal() ? vVar.e0(i15) : vVar.U(i15);
    }

    @Override // p036e4.c1
    public int c(p036e4.w wVar, List<? extends List<? extends p036e4.v>> list, int i15) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) pq.v.o0(list, 1);
        p036e4.v vVar = list2 != null ? (p036e4.v) pq.v.n0(list2) : null;
        List list3 = (List) pq.v.o0(list, 2);
        flowLayoutOverflowState.k(vVar, list3 != null ? (p036e4.v) pq.v.n0(list3) : null, getIsHorizontal(), c5.c.b(0, 0, 0, i15, 7, null));
        if (getIsHorizontal()) {
            List<? extends p036e4.v> listN = (List) pq.v.n0(list);
            if (listN == null) {
                listN = pq.v.n();
            }
            return A(listN, i15, wVar.X0(this.mainAxisSpacing), wVar.X0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends p036e4.v> listN2 = (List) pq.v.n0(list);
        if (listN2 == null) {
            listN2 = pq.v.n();
        }
        return u(listN2, i15, wVar.X0(this.mainAxisSpacing), wVar.X0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // p036e4.c1
    public p036e4.x0 e(p036e4.y0 y0Var, List<? extends List<? extends p036e4.v0>> list, long j15) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (c5.b.k(j15) == 0 && this.overflow.getType() != a1.a.Visible)) {
            return p036e4.y0.j2(y0Var, 0, 0, null, new er.l() { // from class: d1.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return FlowMeasurePolicy.x((e4.a2.a) obj);
                }
            }, 4, null);
        }
        List list2 = (List) pq.v.l0(list);
        if (list2.isEmpty()) {
            return p036e4.y0.j2(y0Var, 0, 0, null, new er.l() { // from class: d1.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return FlowMeasurePolicy.y((e4.a2.a) obj);
                }
            }, 4, null);
        }
        List list3 = (List) pq.v.o0(list, 1);
        p036e4.v0 v0Var = list3 != null ? (p036e4.v0) pq.v.n0(list3) : null;
        List list4 = (List) pq.v.o0(list, 2);
        p036e4.v0 v0Var2 = list4 != null ? (p036e4.v0) pq.v.n0(list4) : null;
        this.overflow.h(list2.size());
        this.overflow.j(this, v0Var, v0Var2, j15);
        return z0.m(y0Var, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, u2.c(j15, getIsHorizontal() ? h2.Horizontal : h2.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && fr.t.c(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && fr.t.c(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && c5.h.p(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && fr.t.c(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && c5.h.p(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && fr.t.c(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // p036e4.c1
    public int f(p036e4.w wVar, List<? extends List<? extends p036e4.v>> list, int i15) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) pq.v.o0(list, 1);
        p036e4.v vVar = list2 != null ? (p036e4.v) pq.v.n0(list2) : null;
        List list3 = (List) pq.v.o0(list, 2);
        flowLayoutOverflowState.k(vVar, list3 != null ? (p036e4.v) pq.v.n0(list3) : null, getIsHorizontal(), c5.c.b(0, i15, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends p036e4.v> listN = (List) pq.v.n0(list);
            if (listN == null) {
                listN = pq.v.n();
            }
            return u(listN, i15, wVar.X0(this.mainAxisSpacing), wVar.X0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends p036e4.v> listN2 = (List) pq.v.n0(list);
        if (listN2 == null) {
            listN2 = pq.v.n();
        }
        return v(listN2, i15, wVar.X0(this.mainAxisSpacing));
    }

    @Override // d1.g1
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    @Override // p036e4.c1
    public int h(p036e4.w wVar, List<? extends List<? extends p036e4.v>> list, int i15) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) pq.v.o0(list, 1);
        p036e4.v vVar = list2 != null ? (p036e4.v) pq.v.n0(list2) : null;
        List list3 = (List) pq.v.o0(list, 2);
        flowLayoutOverflowState.k(vVar, list3 != null ? (p036e4.v) pq.v.n0(list3) : null, getIsHorizontal(), c5.c.b(0, i15, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends p036e4.v> listN = (List) pq.v.n0(list);
            if (listN == null) {
                listN = pq.v.n();
            }
            return u(listN, i15, wVar.X0(this.mainAxisSpacing), wVar.X0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends p036e4.v> listN2 = (List) pq.v.n0(list);
        if (listN2 == null) {
            listN2 = pq.v.n();
        }
        return A(listN2, i15, wVar.X0(this.mainAxisSpacing), wVar.X0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + c5.h.q(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + c5.h.q(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    @Override // p036e4.c1
    public int i(p036e4.w wVar, List<? extends List<? extends p036e4.v>> list, int i15) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) pq.v.o0(list, 1);
        p036e4.v vVar = list2 != null ? (p036e4.v) pq.v.n0(list2) : null;
        List list3 = (List) pq.v.o0(list, 2);
        flowLayoutOverflowState.k(vVar, list3 != null ? (p036e4.v) pq.v.n0(list3) : null, getIsHorizontal(), c5.c.b(0, 0, 0, i15, 7, null));
        if (getIsHorizontal()) {
            List<? extends p036e4.v> listN = (List) pq.v.n0(list);
            if (listN == null) {
                listN = pq.v.n();
            }
            return v(listN, i15, wVar.X0(this.mainAxisSpacing));
        }
        List<? extends p036e4.v> listN2 = (List) pq.v.n0(list);
        if (listN2 == null) {
            listN2 = pq.v.n();
        }
        return u(listN2, i15, wVar.X0(this.mainAxisSpacing), wVar.X0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // d1.g1
    /* JADX INFO: renamed from: m, reason: from getter */
    public m0 getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // d1.g1
    /* JADX INFO: renamed from: q, reason: from getter */
    public i.e getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // d1.g1
    /* JADX INFO: renamed from: r, reason: from getter */
    public i.n getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) c5.h.r(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) c5.h.r(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    public final int u(List<? extends p036e4.v> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        long jB;
        int i15 = 0;
        if (measurables.isEmpty()) {
            jB = r0.n.b(0, 0);
        } else {
            r0 r0Var = new r0(maxItemsInMainAxis, overflow, u2.a(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
            p036e4.v vVar = (p036e4.v) pq.v.o0(measurables, 0);
            int iZ = vVar != null ? z(vVar, mainAxisAvailable) : 0;
            int iB = vVar != null ? B(vVar, iZ) : 0;
            int i16 = 0;
            if (r0Var.b(measurables.size() > 1, 0, r0.n.b(mainAxisAvailable, Integer.MAX_VALUE), vVar == null ? null : r0.n.a(r0.n.b(iB, iZ)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                r0.n nVarD = overflow.d(vVar != null, 0, 0);
                jB = r0.n.b(nVarD != null ? r0.n.f(nVarD.getPackedValue()) : 0, 0);
            } else {
                int size = measurables.size();
                int i17 = mainAxisAvailable;
                int i18 = 0;
                int i19 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i18 < size) {
                    int i28 = i17 - iB;
                    int i29 = i18 + 1;
                    int iMax = Math.max(i27, iZ);
                    p036e4.v vVar2 = (p036e4.v) pq.v.o0(measurables, i29);
                    int iZ2 = vVar2 != null ? z(vVar2, mainAxisAvailable) : i15;
                    int iB2 = vVar2 != null ? B(vVar2, iZ2) + mainAxisSpacing : i15;
                    boolean z15 = i18 + 2 < measurables.size();
                    int i35 = i29 - i25;
                    int i36 = i26;
                    int i37 = iB2;
                    int i38 = iZ2;
                    r0.b bVarB = r0Var.b(z15, i35, r0.n.b(i28, Integer.MAX_VALUE), vVar2 == null ? null : r0.n.a(r0.n.b(iB2, iZ2)), i36, i16, iMax, false, false);
                    if (bVarB.getIsLastItemInLine()) {
                        int iF = i16 + iMax + crossAxisSpacing;
                        r0.a aVarA = r0Var.a(bVarB, vVar2 != null, i36, iF, i28, i35);
                        int i39 = i37 - mainAxisSpacing;
                        i26 = i36 + 1;
                        if (bVarB.getIsLastItemInContainer()) {
                            if (aVarA != null) {
                                long ellipsisSize = aVarA.getEllipsisSize();
                                if (!aVarA.getPlaceEllipsisOnLastContentLine()) {
                                    iF += r0.n.f(ellipsisSize) + crossAxisSpacing;
                                }
                            }
                            i16 = iF;
                            i19 = i29;
                            break;
                        }
                        i16 = iF;
                        iB = i39;
                        i25 = i29;
                        i27 = 0;
                        i17 = mainAxisAvailable;
                    } else {
                        i17 = i28;
                        i26 = i36;
                        i27 = iMax;
                        iB = i37;
                    }
                    iZ = i38;
                    i18 = i29;
                    i19 = i18;
                    i15 = 0;
                }
                jB = r0.n.b(i16 - crossAxisSpacing, i19);
            }
        }
        return r0.n.e(jB);
    }

    public final int v(List<? extends p036e4.v> measurables, int height, int arrangementSpacing) {
        int i15 = this.maxItemsInMainAxis;
        int size = measurables.size();
        int i16 = 0;
        int iMax = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < size) {
            int iW = w(measurables.get(i16), height) + arrangementSpacing;
            int i19 = i16 + 1;
            if (i19 - i17 == i15 || i19 == measurables.size()) {
                iMax = Math.max(iMax, (i18 + iW) - arrangementSpacing);
                i18 = 0;
                i17 = i16;
            } else {
                i18 += iW;
            }
            i16 = i19;
        }
        return iMax;
    }

    public final int w(p036e4.v vVar, int i15) {
        return getIsHorizontal() ? vVar.m0(i15) : vVar.n(i15);
    }

    public final int z(p036e4.v vVar, int i15) {
        return getIsHorizontal() ? vVar.U(i15) : vVar.e0(i15);
    }

    private FlowMeasurePolicy(boolean z15, i.e eVar, i.n nVar, float f15, m0 m0Var, float f16, int i15, int i16, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z15;
        this.horizontalArrangement = eVar;
        this.verticalArrangement = nVar;
        this.mainAxisSpacing = f15;
        this.crossAxisAlignment = m0Var;
        this.crossAxisArrangementSpacing = f16;
        this.maxItemsInMainAxis = i15;
        this.maxLines = i16;
        this.overflow = flowLayoutOverflowState;
    }
}
