package d1;

import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.o3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%Ji\u0010,\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J7\u00104\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J)\u00109\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J)\u0010<\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010:J)\u0010=\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010:J)\u0010>\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010:J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u0002022\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010I¨\u0006J"}, d2 = {"Ld1/o3;", "Le4/w0;", "Ld1/j3;", "Ld1/i$e;", "horizontalArrangement", "Lf3/c$c;", "verticalAlignment", "<init>", "(Ld1/i$e;Lf3/c$c;)V", "Le4/a2;", "placeable", "Ld1/l3;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "t", "(Le4/a2;Ld1/l3;II)I", "j", "(Le4/a2;)I", "b", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "measureScope", "Loq/i0;", "a", "(I[I[ILe4/y0;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "k", "([Le4/a2;Le4/y0;I[III[IIII)Le4/x0;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "d", "(IIIIZ)J", "Le4/w;", "Le4/v;", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ld1/i$e;", "Lf3/c$c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RowMeasurePolicy implements p036e4.w0, j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.e horizontalArrangement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.c.InterfaceC1317c verticalAlignment;

    public RowMeasurePolicy(i.e eVar, f3.c.InterfaceC1317c interfaceC1317c) {
        this.horizontalArrangement = eVar;
        this.verticalAlignment = interfaceC1317c;
    }

    private final int t(p036e4.a2 placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine) {
        m0 crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize, b(placeable), c5.t.Ltr, placeable, beforeCrossAxisAlignmentLine) : this.verticalAlignment.a(b(placeable), crossAxisLayoutSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(p036e4.a2[] a2VarArr, RowMeasurePolicy rowMeasurePolicy, int i15, int i16, int[] iArr, e4.a2.a aVar) {
        int length = a2VarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            p036e4.a2 a2Var = a2VarArr[i17];
            e4.a2.a.E(aVar, a2Var, iArr[i18], rowMeasurePolicy.t(a2Var, i3.d(a2Var), i15, i16), 0.0f, 4, null);
            i17++;
            i18++;
        }
        return oq.i0.f148189a;
    }

    @Override // d1.j3
    public void a(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, p036e4.y0 measureScope) {
        this.horizontalArrangement.b(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
    }

    @Override // d1.j3
    public int b(p036e4.a2 a2Var) {
        return a2Var.getHeight();
    }

    @Override // p036e4.w0
    public int c(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.d(list, i15, wVar.X0(this.horizontalArrangement.getSpacing()));
    }

    @Override // d1.j3
    public long d(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return m3.a(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // p036e4.w0
    public p036e4.x0 e(p036e4.y0 y0Var, List<? extends p036e4.v0> list, long j15) {
        return k3.a(this, c5.b.n(j15), c5.b.m(j15), c5.b.l(j15), c5.b.k(j15), y0Var.X0(this.horizontalArrangement.getSpacing()), y0Var, list, new p036e4.a2[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) other;
        return fr.t.c(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && fr.t.c(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    @Override // p036e4.w0
    public int f(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.a(list, i15, wVar.X0(this.horizontalArrangement.getSpacing()));
    }

    @Override // p036e4.w0
    public int h(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.c(list, i15, wVar.X0(this.horizontalArrangement.getSpacing()));
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    @Override // p036e4.w0
    public int i(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.b(list, i15, wVar.X0(this.horizontalArrangement.getSpacing()));
    }

    @Override // d1.j3
    public int j(p036e4.a2 a2Var) {
        return a2Var.getWidth();
    }

    @Override // d1.j3
    public p036e4.x0 k(final p036e4.a2[] placeables, p036e4.y0 measureScope, final int beforeCrossAxisAlignmentLine, final int[] mainAxisPositions, int mainAxisLayoutSize, final int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return p036e4.y0.j2(measureScope, mainAxisLayoutSize, crossAxisLayoutSize, null, new er.l() { // from class: d1.n3
            @Override // er.l
            public final Object b(Object obj) {
                return RowMeasurePolicy.u(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, mainAxisPositions, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }
}
