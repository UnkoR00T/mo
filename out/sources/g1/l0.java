package g1;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J=\u0010+\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020&2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u00020&2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010:R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010:R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010MR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010@R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010M\u001a\u0004\bH\u0010QR\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010:\u001a\u0004\bR\u0010<R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\b9\u0010<R\u0017\u0010U\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\bT\u0010<R\u001a\u0010W\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010:\u001a\u0004\bN\u0010<R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010:R\u0016\u0010Y\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010:R\u0016\u0010Z\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010:R\u001a\u0010\\\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010M\u001a\u0004\b=\u0010QR$\u0010^\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\u00138\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b.\u0010M\u001a\u0004\bS\u0010QR$\u0010)\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b_\u0010:\u001a\u0004\bJ\u0010<R$\u0010*\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b`\u0010:\u001a\u0004\bK\u0010<R\"\u0010c\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010B\u001a\u0004\bG\u0010D\"\u0004\bE\u0010bR\u0018\u0010e\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010dR\u0018\u0010U\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010fR\u0014\u0010g\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010<¨\u0006h"}, d2 = {"Lg1/l0;", "Lg1/m;", "Lh1/b1;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Lc5/t;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Le4/a2;", "placeables", "Lc5/n;", "visualOffset", CMSAttributeTableGenerator.CONTENT_TYPE, "Lh1/f0;", "animator", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLc5/t;IILjava/util/List;JLjava/lang/Object;Lh1/f0;JIILfr/k;)V", "l", "(I)Ljava/lang/Object;", "m", "(I)J", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "Loq/i0;", "j", "(IIII)V", "row", "column", "u", "(IIIIII)V", "mainAxisLayoutSize", "v", "(I)V", "delta", "updateAnimations", "p", "(IZ)V", "Le4/a2$a;", "scope", "isLookingAhead", "t", "(Le4/a2$a;Z)V", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Z", "h", "()Z", "d", "getCrossAxisSize", "e", "f", "Lc5/t;", "g", "i", "Ljava/util/List;", "J", "k", "getContentType", "Lh1/f0;", "()J", "n", "o", "r", "mainAxisSize", "q", "mainAxisSizeWithSpacings", "s", "minMainAxisOffset", "maxMainAxisOffset", "Lc5/r;", "size", "value", "offset", "w", "x", "y", "(Z)V", "nonScrollableItem", "(J)I", "mainAxis", "(Le4/a2;)I", "placeablesCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 implements m, p056h1.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c5.t layoutDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<a2> placeables;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p056h1.f0<l0> animator;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long offset;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int row;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int column;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    public /* synthetic */ l0(int i15, Object obj, boolean z15, int i16, int i17, boolean z16, c5.t tVar, int i18, int i19, List list, long j15, Object obj2, p056h1.f0 f0Var, long j16, int i25, int i26, fr.k kVar) {
        this(i15, obj, z15, i16, i17, z16, tVar, i18, i19, list, j15, obj2, f0Var, j16, i25, i26);
    }

    private final int q(long j15) {
        return getIsVertical() ? c5.n.j(j15) : c5.n.i(j15);
    }

    private final int s(a2 a2Var) {
        return getIsVertical() ? a2Var.getHeight() : a2Var.getWidth();
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    @Override // g1.m
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // p056h1.b1
    public int c() {
        return this.placeables.size();
    }

    @Override // p056h1.b1
    public void d(boolean z15) {
        this.nonScrollableItem = z15;
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: f, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // g1.m
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getRow() {
        return this.row;
    }

    @Override // g1.m, p056h1.b1
    public int getIndex() {
        return this.index;
    }

    @Override // p056h1.b1
    public Object getKey() {
        return this.key;
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // g1.m
    /* JADX INFO: renamed from: i, reason: from getter */
    public int getColumn() {
        return this.column;
    }

    @Override // p056h1.b1
    public void j(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        u(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // p056h1.b1
    public Object l(int index) {
        return this.placeables.get(index).e();
    }

    @Override // p056h1.b1
    public long m(int index) {
        return getOffset();
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    @Override // g1.m
    /* JADX INFO: renamed from: o, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final void p(int delta, boolean updateAnimations) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int i15 = getIsVertical() ? c5.n.i(offset) : c5.n.i(offset) + delta;
        boolean isVertical = getIsVertical();
        int iJ = c5.n.j(offset);
        if (isVertical) {
            iJ += delta;
        }
        this.offset = c5.n.d((((long) i15) << 32) | (((long) iJ) & BodyPartID.bodyIdMax));
        if (updateAnimations) {
            int iC = c();
            for (int i16 = 0; i16 < iC; i16++) {
                p056h1.a0 a0VarE = this.animator.e(getKey(), i16);
                if (a0VarE != null) {
                    long rawOffset = a0VarE.getRawOffset();
                    int i17 = getIsVertical() ? c5.n.i(rawOffset) : Integer.valueOf(c5.n.i(rawOffset) + delta).intValue();
                    boolean isVertical2 = getIsVertical();
                    int iJ2 = c5.n.j(rawOffset);
                    if (isVertical2) {
                        iJ2 = Integer.valueOf(iJ2 + delta).intValue();
                    }
                    a0VarE.J(c5.n.d((((long) iJ2) & BodyPartID.bodyIdMax) | (((long) i17) << 32)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final void t(a2.a scope, boolean isLookingAhead) {
        q3.c layer;
        a2.a aVar;
        int i15;
        int iJ;
        int i16 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            c1.e.a("position() should be called first");
        }
        int iC = c();
        while (i16 < iC) {
            a2 a2Var = this.placeables.get(i16);
            int iS = this.minMainAxisOffset - s(a2Var);
            int i17 = this.maxMainAxisOffset;
            long offset = getOffset();
            p056h1.a0 a0VarE = this.animator.e(getKey(), i16);
            if (a0VarE != null) {
                if (isLookingAhead) {
                    a0VarE.F(offset);
                } else {
                    long jM = c5.n.m(!c5.n.h(a0VarE.getLookaheadOffset(), p056h1.a0.INSTANCE.a()) ? a0VarE.getLookaheadOffset() : offset, a0VarE.r());
                    if ((q(offset) <= iS && q(jM) <= iS) || (q(offset) >= i17 && q(jM) >= i17)) {
                        a0VarE.n();
                    }
                    offset = jM;
                }
                layer = a0VarE.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    i15 = c5.n.i(offset);
                } else {
                    i15 = (this.mainAxisLayoutSize - c5.n.i(offset)) - s(a2Var);
                }
                if (getIsVertical()) {
                    iJ = (this.mainAxisLayoutSize - c5.n.j(offset)) - s(a2Var);
                } else {
                    iJ = c5.n.j(offset);
                }
                offset = c5.n.d((((long) iJ) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
            }
            long jM2 = c5.n.m(offset, this.visualOffset);
            if (!isLookingAhead && a0VarE != null) {
                a0VarE.E(jM2);
            }
            if (!getIsVertical()) {
                aVar = scope;
                q3.c cVar = layer;
                if (cVar != null) {
                    a2.a.X(aVar, a2Var, jM2, cVar, 0.0f, 4, null);
                } else {
                    a2.a.W(aVar, a2Var, jM2, 0.0f, null, 6, null);
                }
            } else if (layer != null) {
                aVar = scope;
                a2.a.o0(aVar, a2Var, jM2, layer, 0.0f, 4, null);
            } else {
                aVar = scope;
                a2.a.m0(aVar, a2Var, jM2, 0.0f, null, 6, null);
            }
            i16++;
            scope = aVar;
        }
    }

    public final void u(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        long jD;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.layoutDirection == c5.t.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        if (getIsVertical()) {
            jD = c5.n.d((((long) crossAxisOffset) << 32) | (BodyPartID.bodyIdMax & ((long) mainAxisOffset)));
        } else {
            jD = c5.n.d((((long) crossAxisOffset) & BodyPartID.bodyIdMax) | (((long) mainAxisOffset) << 32));
        }
        this.offset = jD;
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void v(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0(int i15, Object obj, boolean z15, int i16, int i17, boolean z16, c5.t tVar, int i18, int i19, List<? extends a2> list, long j15, Object obj2, p056h1.f0<l0> f0Var, long j16, int i25, int i26) {
        this.index = i15;
        this.key = obj;
        this.isVertical = z15;
        this.crossAxisSize = i16;
        this.reverseLayout = z16;
        this.layoutDirection = tVar;
        this.beforeContentPadding = i18;
        this.afterContentPadding = i19;
        this.placeables = list;
        this.visualOffset = j15;
        this.contentType = obj2;
        this.animator = f0Var;
        this.constraints = j16;
        this.lane = i25;
        this.span = i26;
        this.mainAxisLayoutSize = PKIFailureInfo.systemUnavail;
        int size = list.size();
        int iMax = 0;
        for (int i27 = 0; i27 < size; i27++) {
            a2 a2Var = (a2) list.get(i27);
            iMax = Math.max(iMax, getIsVertical() ? a2Var.getHeight() : a2Var.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = lr.m.e(i17 + iMax, 0);
        this.size = getIsVertical() ? c5.r.c((((long) iMax) & BodyPartID.bodyIdMax) | (((long) this.crossAxisSize) << 32)) : c5.r.c((((long) this.crossAxisSize) & BodyPartID.bodyIdMax) | (((long) iMax) << 32));
        this.offset = c5.n.INSTANCE.b();
        this.row = -1;
        this.column = -1;
    }
}
