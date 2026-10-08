package f1;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0015\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010<R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010>R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00109R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010K\u001a\u0004\bN\u0010MR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010J\u001a\u0004\bE\u0010RR$\u0010U\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\bT\u0010;R\u001a\u0010W\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\bV\u0010;R\u001a\u0010X\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bO\u0010;R\u001a\u0010Z\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\b8\u0010;R\u001a\u0010\\\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\bI\u0010;R\u0017\u0010^\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b]\u00109\u001a\u0004\bG\u0010;R\"\u0010a\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010>\u001a\u0004\bC\u0010@\"\u0004\bA\u0010`R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00109R\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u00109R\u0016\u0010f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u00109R\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u00020\u0003*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010kR\u0018\u0010n\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010mR\u0014\u0010o\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006p"}, d2 = {"Lf1/j0;", "Lf1/q;", "Lh1/b1;", "", "index", "", "Le4/a2;", "placeables", "", "isVertical", "Lf3/c$b;", "horizontalAlignment", "Lf3/c$c;", "verticalAlignment", "Lc5/t;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Lc5/n;", "visualOffset", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "Lh1/f0;", "animator", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(ILjava/util/List;ZLf3/c$b;Lf3/c$c;Lc5/t;ZIIIJLjava/lang/Object;Ljava/lang/Object;Lh1/f0;JLfr/k;)V", "l", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "Loq/i0;", "j", "(IIII)V", "q", "(III)V", "mainAxisLayoutSize", "r", "(I)V", "m", "(I)J", "delta", "updateAnimations", "b", "(IZ)V", "Le4/a2$a;", "scope", "isLookingAhead", "p", "(Le4/a2$a;Z)V", "a", "I", "getIndex", "()I", "Ljava/util/List;", "c", "Z", "h", "()Z", "d", "Lf3/c$b;", "e", "Lf3/c$c;", "f", "Lc5/t;", "g", "i", "k", "J", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getContentType", "n", "Lh1/f0;", "o", "()J", "value", "getOffset", "offset", "getSize", "size", "lane", "s", "span", "t", "mainAxisSizeWithSpacings", "u", "crossAxisSize", "v", "(Z)V", "nonScrollableItem", "w", "x", "minMainAxisOffset", "y", "maxMainAxisOffset", "", "z", "[I", "placeableOffsets", "(J)I", "mainAxis", "(Le4/a2;)I", "mainAxisSize", "placeablesCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 implements q, p056h1.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<a2> placeables;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f3.c.b horizontalAlignment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f3.c.InterfaceC1317c verticalAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c5.t layoutDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int spacing;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p056h1.f0<j0> animator;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int[] placeableOffsets;

    public /* synthetic */ j0(int i15, List list, boolean z15, f3.c.b bVar, f3.c.InterfaceC1317c interfaceC1317c, c5.t tVar, boolean z16, int i16, int i17, int i18, long j15, Object obj, Object obj2, p056h1.f0 f0Var, long j16, fr.k kVar) {
        this(i15, list, z15, bVar, interfaceC1317c, tVar, z16, i16, i17, i18, j15, obj, obj2, f0Var, j16);
    }

    private final int i(long j15) {
        return getIsVertical() ? c5.n.j(j15) : c5.n.i(j15);
    }

    private final int o(a2 a2Var) {
        return getIsVertical() ? a2Var.getHeight() : a2Var.getWidth();
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    public final void b(int delta, boolean updateAnimations) {
        int iIntValue;
        int iJ;
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 & 1;
            if ((getIsVertical() && i16 != 0) || (!getIsVertical() && i16 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i15] = iArr[i15] + delta;
            }
        }
        if (updateAnimations) {
            int iC = c();
            for (int i17 = 0; i17 < iC; i17++) {
                p056h1.a0 a0VarE = this.animator.e(getKey(), i17);
                if (a0VarE != null) {
                    long rawOffset = a0VarE.getRawOffset();
                    if (getIsVertical()) {
                        iIntValue = c5.n.i(rawOffset);
                        iJ = Integer.valueOf(c5.n.j(rawOffset) + delta).intValue();
                    } else {
                        iIntValue = Integer.valueOf(c5.n.i(rawOffset) + delta).intValue();
                        iJ = c5.n.j(rawOffset);
                    }
                    a0VarE.J(c5.n.d((((long) iIntValue) << 32) | (BodyPartID.bodyIdMax & ((long) iJ))));
                }
            }
        }
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

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // f1.q
    public Object getContentType() {
        return this.contentType;
    }

    @Override // f1.q, p056h1.b1
    public int getIndex() {
        return this.index;
    }

    @Override // p056h1.b1
    public Object getKey() {
        return this.key;
    }

    @Override // f1.q
    public int getOffset() {
        return this.offset;
    }

    @Override // f1.q
    public int getSize() {
        return this.size;
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // p056h1.b1
    public void j(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        q(mainAxisOffset, layoutWidth, layoutHeight);
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
        if (index == 0 && c() == 0) {
            if (getIsVertical()) {
                return c5.n.d((BodyPartID.bodyIdMax & ((long) getOffset())) | (((long) 0) << 32));
            }
            return c5.n.d((BodyPartID.bodyIdMax & ((long) 0)) | (((long) getOffset()) << 32));
        }
        int[] iArr = this.placeableOffsets;
        int i15 = index * 2;
        int i16 = iArr[i15];
        return c5.n.d((BodyPartID.bodyIdMax & ((long) iArr[i15 + 1])) | (((long) i16) << 32));
    }

    @Override // p056h1.b1
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    public final void p(a2.a scope, boolean isLookingAhead) {
        q3.c layer;
        a2.a aVar;
        long jI;
        int i15 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            c1.e.a("position() should be called first");
        }
        int iC = c();
        while (i15 < iC) {
            a2 a2Var = this.placeables.get(i15);
            int iO = this.minMainAxisOffset - o(a2Var);
            int i16 = this.maxMainAxisOffset;
            long jM = m(i15);
            p056h1.a0 a0VarE = this.animator.e(getKey(), i15);
            if (a0VarE != null) {
                if (isLookingAhead) {
                    a0VarE.F(jM);
                } else {
                    if (!c5.n.h(a0VarE.getLookaheadOffset(), p056h1.a0.INSTANCE.a())) {
                        jM = a0VarE.getLookaheadOffset();
                    }
                    long jM2 = c5.n.m(jM, a0VarE.r());
                    if ((i(jM) <= iO && i(jM2) <= iO) || (i(jM) >= i16 && i(jM2) >= i16)) {
                        a0VarE.n();
                    }
                    jM = jM2;
                }
                layer = a0VarE.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    jI = (((long) ((this.mainAxisLayoutSize - c5.n.j(jM)) - o(a2Var))) & BodyPartID.bodyIdMax) | (((long) c5.n.i(jM)) << 32);
                } else {
                    jI = (((long) ((this.mainAxisLayoutSize - c5.n.i(jM)) - o(a2Var))) << 32) | (BodyPartID.bodyIdMax & ((long) c5.n.j(jM)));
                }
                jM = c5.n.d(jI);
            }
            long jM3 = c5.n.m(jM, this.visualOffset);
            if (!isLookingAhead && a0VarE != null) {
                a0VarE.E(jM3);
            }
            if (!getIsVertical()) {
                aVar = scope;
                q3.c cVar = layer;
                if (cVar != null) {
                    a2.a.X(aVar, a2Var, jM3, cVar, 0.0f, 4, null);
                } else {
                    a2.a.W(aVar, a2Var, jM3, 0.0f, null, 6, null);
                }
            } else if (layer != null) {
                aVar = scope;
                a2.a.o0(aVar, a2Var, jM3, layer, 0.0f, 4, null);
            } else {
                aVar = scope;
                a2.a.m0(aVar, a2Var, jM3, 0.0f, null, 6, null);
            }
            i15++;
            scope = aVar;
        }
    }

    public final void q(int mainAxisOffset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = mainAxisOffset;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        List<a2> list = this.placeables;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            a2 a2Var = list.get(i15);
            int i16 = i15 * 2;
            if (getIsVertical()) {
                int[] iArr = this.placeableOffsets;
                f3.c.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    c1.e.b("null horizontalAlignment when isVertical == true");
                    throw new oq.g();
                }
                iArr[i16] = bVar.a(a2Var.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i16 + 1] = mainAxisOffset;
                width = a2Var.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i16] = mainAxisOffset;
                int i17 = i16 + 1;
                f3.c.InterfaceC1317c interfaceC1317c = this.verticalAlignment;
                if (interfaceC1317c == null) {
                    c1.e.b("null verticalAlignment when isVertical == false");
                    throw new oq.g();
                }
                iArr2[i17] = interfaceC1317c.a(a2Var.getHeight(), layoutHeight);
                width = a2Var.getWidth();
            }
            mainAxisOffset += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void r(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j0(int i15, List<? extends a2> list, boolean z15, f3.c.b bVar, f3.c.InterfaceC1317c interfaceC1317c, c5.t tVar, boolean z16, int i16, int i17, int i18, long j15, Object obj, Object obj2, p056h1.f0<j0> f0Var, long j16) {
        this.index = i15;
        this.placeables = list;
        this.isVertical = z15;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = interfaceC1317c;
        this.layoutDirection = tVar;
        this.reverseLayout = z16;
        this.beforeContentPadding = i16;
        this.afterContentPadding = i17;
        this.spacing = i18;
        this.visualOffset = j15;
        this.key = obj;
        this.contentType = obj2;
        this.animator = f0Var;
        this.constraints = j16;
        this.span = 1;
        this.mainAxisLayoutSize = PKIFailureInfo.systemUnavail;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i19 = 0; i19 < size; i19++) {
            a2 a2Var = (a2) list.get(i19);
            height += getIsVertical() ? a2Var.getHeight() : a2Var.getWidth();
            iMax = Math.max(iMax, !getIsVertical() ? a2Var.getHeight() : a2Var.getWidth());
        }
        this.size = height;
        this.mainAxisSizeWithSpacings = lr.m.e(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }
}
