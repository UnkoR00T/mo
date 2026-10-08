package d1;

import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.g0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010'\u001a\u00020&2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J7\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J)\u00106\u001a\u00020&*\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020/H\u0016¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010<J)\u0010?\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b?\u0010<J)\u0010@\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010<J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010K¨\u0006L"}, d2 = {"Ld1/g0;", "Le4/w0;", "Ld1/j3;", "Ld1/i$n;", "verticalArrangement", "Lf3/c$b;", "horizontalAlignment", "<init>", "(Ld1/i$n;Lf3/c$b;)V", "Le4/a2;", "placeable", "Ld1/l3;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "Lc5/t;", "layoutDirection", "t", "(Le4/a2;Ld1/l3;IILc5/t;)I", "j", "(Le4/a2;)I", "b", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Le4/y0;", "measureScope", "Loq/i0;", "a", "(I[I[ILe4/y0;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Le4/x0;", "k", "([Le4/a2;Le4/y0;I[III[IIII)Le4/x0;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Lc5/b;", "d", "(IIIIZ)J", "", "Le4/v0;", "measurables", CryptoServicesPermission.CONSTRAINTS, "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ld1/i$n;", "Lf3/c$b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ColumnMeasurePolicy implements p036e4.w0, j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.n verticalArrangement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.c.b horizontalAlignment;

    public ColumnMeasurePolicy(i.n nVar, f3.c.b bVar) {
        this.verticalArrangement = nVar;
        this.horizontalAlignment = bVar;
    }

    private final int t(p036e4.a2 placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine, c5.t layoutDirection) {
        m0 crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize, b(placeable), layoutDirection, placeable, beforeCrossAxisAlignmentLine) : this.horizontalAlignment.a(b(placeable), crossAxisLayoutSize, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(p036e4.a2[] a2VarArr, ColumnMeasurePolicy columnMeasurePolicy, int i15, int i16, p036e4.y0 y0Var, int[] iArr, e4.a2.a aVar) {
        int length = a2VarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            p036e4.a2 a2Var = a2VarArr[i17];
            e4.a2.a.E(aVar, a2Var, columnMeasurePolicy.t(a2Var, i3.d(a2Var), i15, i16, y0Var.getLayoutDirection()), iArr[i18], 0.0f, 4, null);
            i17++;
            i18++;
        }
        return oq.i0.f148189a;
    }

    @Override // d1.j3
    public void a(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, p036e4.y0 measureScope) {
        this.verticalArrangement.c(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
    }

    @Override // d1.j3
    public int b(p036e4.a2 a2Var) {
        return a2Var.getWidth();
    }

    @Override // p036e4.w0
    public int c(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.h(list, i15, wVar.X0(this.verticalArrangement.getSpacing()));
    }

    @Override // d1.j3
    public long d(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return e0.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // p036e4.w0
    public p036e4.x0 e(p036e4.y0 y0Var, List<? extends p036e4.v0> list, long j15) {
        return k3.a(this, c5.b.m(j15), c5.b.n(j15), c5.b.k(j15), c5.b.l(j15), y0Var.X0(this.verticalArrangement.getSpacing()), y0Var, list, new p036e4.a2[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) other;
        return fr.t.c(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && fr.t.c(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    @Override // p036e4.w0
    public int f(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.e(list, i15, wVar.X0(this.verticalArrangement.getSpacing()));
    }

    @Override // p036e4.w0
    public int h(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.g(list, i15, wVar.X0(this.verticalArrangement.getSpacing()));
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    @Override // p036e4.w0
    public int i(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
        return b2.f39028a.f(list, i15, wVar.X0(this.verticalArrangement.getSpacing()));
    }

    @Override // d1.j3
    public int j(p036e4.a2 a2Var) {
        return a2Var.getHeight();
    }

    @Override // d1.j3
    public p036e4.x0 k(final p036e4.a2[] placeables, final p036e4.y0 measureScope, final int beforeCrossAxisAlignmentLine, final int[] mainAxisPositions, int mainAxisLayoutSize, final int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return p036e4.y0.j2(measureScope, crossAxisLayoutSize, mainAxisLayoutSize, null, new er.l() { // from class: d1.f0
            @Override // er.l
            public final Object b(Object obj) {
                return ColumnMeasurePolicy.u(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, measureScope, mainAxisPositions, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}
