package g1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001aJ;\u0010#\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lg1/o0;", "", "", "isVertical", "Lg1/v0;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Lg1/m0;", "measuredItemProvider", "Lg1/z0;", "spanLayoutProvider", "<init>", "(ZLg1/v0;IILg1/m0;Lg1/z0;)V", "startSlot", "span", "Lc5/b;", "a", "(II)J", "index", "e", "(I)I", "lineIndex", "Lg1/n0;", "c", "(I)Lg1/n0;", "d", "", "Lg1/l0;", "items", "", "Lg1/c;", "spans", "mainAxisSpacing", "b", "(I[Lg1/l0;Ljava/util/List;I)Lg1/n0;", "Z", "Lg1/v0;", "I", "Lg1/m0;", "f", "Lg1/z0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v0 slots;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int gridItemsCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int spaceBetweenLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m0 measuredItemProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z0 spanLayoutProvider;

    public o0(boolean z15, v0 v0Var, int i15, int i16, m0 m0Var, z0 z0Var) {
        this.isVertical = z15;
        this.slots = v0Var;
        this.gridItemsCount = i15;
        this.spaceBetweenLines = i16;
        this.measuredItemProvider = m0Var;
        this.spanLayoutProvider = z0Var;
    }

    public final long a(int startSlot, int span) {
        int i15;
        if (span == 1) {
            i15 = this.slots.getSizes()[startSlot];
        } else {
            int i16 = (span + startSlot) - 1;
            i15 = (this.slots.getPositions()[i16] + this.slots.getSizes()[i16]) - this.slots.getPositions()[startSlot];
        }
        int iE = lr.m.e(i15, 0);
        return this.isVertical ? c5.b.INSTANCE.e(iE) : c5.b.INSTANCE.d(iE);
    }

    public abstract n0 b(int index, l0[] items, List<c> spans, int mainAxisSpacing);

    public final n0 c(int lineIndex) {
        z0.c cVarD = this.spanLayoutProvider.d(lineIndex);
        int size = cVarD.b().size();
        int i15 = (size == 0 || cVarD.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        l0[] l0VarArr = new l0[size];
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            int iD = c.d(cVarD.b().get(i17).getPackedValue());
            l0 l0VarE = this.measuredItemProvider.e(cVarD.getFirstItemIndex() + i17, a(i16, iD), i16, iD, i15);
            i16 += iD;
            oq.i0 i0Var = oq.i0.f148189a;
            l0VarArr[i17] = l0VarE;
        }
        return b(lineIndex, l0VarArr, cVarD.b(), i15);
    }

    public final n0 d(int lineIndex) {
        return c(lineIndex);
    }

    public final int e(int index) {
        z0 z0Var = this.spanLayoutProvider;
        return z0Var.k(index, z0Var.getSlotsPerLine());
    }
}
