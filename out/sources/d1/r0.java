package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001:\u0002 \u0016B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Ld1/r0;", "", "", "maxItemsInMainAxis", "Ld1/d1;", "overflow", "Ld1/u2;", CryptoServicesPermission.CONSTRAINTS, "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILd1/d1;JIIILfr/k;)V", "Ld1/r0$b;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "Ld1/r0$a;", "a", "(Ld1/r0$b;ZIIII)Ld1/r0$a;", "nextItemHasNext", "Lr0/n;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "b", "(ZIJLr0/n;IIIZZ)Ld1/r0$b;", "I", "Ld1/d1;", "c", "J", "d", "e", "f", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxItemsInMainAxis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FlowLayoutOverflowState overflow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSpacing;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld1/r0$a;", "", "Le4/v0;", "ellipsis", "Le4/a2;", "placeable", "Lr0/n;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Le4/v0;Le4/a2;JZLfr/k;)V", "a", "Le4/v0;", "()Le4/v0;", "b", "Le4/a2;", "d", "()Le4/a2;", "c", "J", "()J", "Z", "()Z", "e", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p036e4.v0 ellipsis;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p036e4.a2 placeable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long ellipsisSize;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean placeEllipsisOnLastContentLine;

        public /* synthetic */ a(p036e4.v0 v0Var, p036e4.a2 a2Var, long j15, boolean z15, fr.k kVar) {
            this(v0Var, a2Var, j15, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final p036e4.v0 getEllipsis() {
            return this.ellipsis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getEllipsisSize() {
            return this.ellipsisSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final p036e4.a2 getPlaceable() {
            return this.placeable;
        }

        public final void e(boolean z15) {
            this.placeEllipsisOnLastContentLine = z15;
        }

        private a(p036e4.v0 v0Var, p036e4.a2 a2Var, long j15, boolean z15) {
            this.ellipsis = v0Var;
            this.placeable = a2Var;
            this.ellipsisSize = j15;
            this.placeEllipsisOnLastContentLine = z15;
        }

        public /* synthetic */ a(p036e4.v0 v0Var, p036e4.a2 a2Var, long j15, boolean z15, int i15, fr.k kVar) {
            this(v0Var, a2Var, j15, (i15 & 8) != 0 ? true : z15, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Ld1/r0$b;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", "a", "Z", "b", "()Z", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isLastItemInLine;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLastItemInContainer;

        public b(boolean z15, boolean z16) {
            this.isLastItemInLine = z15;
            this.isLastItemInContainer = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsLastItemInLine() {
            return this.isLastItemInLine;
        }
    }

    public /* synthetic */ r0(int i15, FlowLayoutOverflowState flowLayoutOverflowState, long j15, int i16, int i17, int i18, fr.k kVar) {
        this(i15, flowLayoutOverflowState, j15, i16, i17, i18);
    }

    public final a a(b wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
        a aVarC;
        if (!wrapInfo.getIsLastItemInContainer() || (aVarC = this.overflow.c(hasNext, lastContentLineIndex, totalCrossAxisSize)) == null) {
            return null;
        }
        aVarC.e(lastContentLineIndex >= 0 && (nextIndexInLine == 0 || (leftOverMainAxis - r0.n.e(aVarC.getEllipsisSize()) >= 0 && nextIndexInLine < this.maxItemsInMainAxis)));
        return aVarC;
    }

    public final b b(boolean nextItemHasNext, int nextIndexInLine, long leftOver, r0.n nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
        int i15 = totalCrossAxisSize + currentLineCrossAxisSize;
        if (nextSize == null) {
            return new b(true, true);
        }
        if (this.overflow.getType() != a1.a.Visible && (lineIndex >= this.maxLines || r0.n.f(leftOver) - r0.n.f(nextSize.getPackedValue()) < 0)) {
            return new b(true, true);
        }
        if (nextIndexInLine != 0 && (nextIndexInLine >= this.maxItemsInMainAxis || r0.n.e(leftOver) - r0.n.e(nextSize.getPackedValue()) < 0)) {
            return isWrappingRound ? new b(true, true) : new b(true, b(nextItemHasNext, 0, r0.n.b(c5.b.l(this.constraints), (r0.n.f(leftOver) - this.crossAxisSpacing) - currentLineCrossAxisSize), r0.n.a(r0.n.b(r0.n.e(nextSize.getPackedValue()) - this.mainAxisSpacing, r0.n.f(nextSize.getPackedValue()))), lineIndex + 1, i15, 0, true, false).getIsLastItemInContainer());
        }
        int iMax = totalCrossAxisSize + Math.max(currentLineCrossAxisSize, r0.n.f(nextSize.getPackedValue()));
        r0.n nVarD = isEllipsisWrap ? null : this.overflow.d(nextItemHasNext, lineIndex, iMax);
        if (nVarD != null) {
            nVarD.getPackedValue();
            if (nextIndexInLine + 1 >= this.maxItemsInMainAxis || ((r0.n.e(leftOver) - r0.n.e(nextSize.getPackedValue())) - this.mainAxisSpacing) - r0.n.e(nVarD.getPackedValue()) < 0) {
                if (isEllipsisWrap) {
                    return new b(true, true);
                }
                b bVarB = b(false, 0, r0.n.b(c5.b.l(this.constraints), (r0.n.f(leftOver) - this.crossAxisSpacing) - Math.max(currentLineCrossAxisSize, r0.n.f(nextSize.getPackedValue()))), nVarD, lineIndex + 1, iMax, 0, true, true);
                return new b(bVarB.getIsLastItemInContainer(), bVarB.getIsLastItemInContainer());
            }
        }
        return new b(false, false);
    }

    private r0(int i15, FlowLayoutOverflowState flowLayoutOverflowState, long j15, int i16, int i17, int i18) {
        this.maxItemsInMainAxis = i15;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j15;
        this.maxLines = i16;
        this.mainAxisSpacing = i17;
        this.crossAxisSpacing = i18;
    }
}
