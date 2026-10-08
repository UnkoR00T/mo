package h2;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p046f2.le;
import p046f2.yd;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h2.e1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J7\u0010+\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,J=\u0010/\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J5\u00102\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002010-2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b2\u00103R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010B\u001a\u0004\bC\u0010!R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010B\u001a\u0004\bD\u0010!R)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010N\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u0014\u0010P\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010IR\u0014\u0010R\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010IR\u0014\u0010T\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010IR\u0014\u0010W\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010VR\u0014\u0010[\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010VR\u0014\u0010]\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010VR\u0014\u0010_\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010VR\u0014\u0010a\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010VR\u0014\u0010c\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010V¨\u0006d"}, d2 = {"Lh2/e1;", "", "Lm2/a3;", "Ln3/d3;", "transformOriginState", "Lc5/j;", "contentOffset", "Lc5/d;", "density", "Lf2/yd;", "dropdownMenuAnchorPosition", "", "verticalMargin", "horizontalMargin", "Lkotlin/Function2;", "Lc5/p;", "Loq/i0;", "onPositionCalculated", "<init>", "(Lm2/a3;JLc5/d;Lf2/yd;IILer/p;Lfr/k;)V", "anchorBounds", "Lc5/r;", "windowSize", "Lc5/t;", "layoutDirection", "popupContentSize", "Lc5/n;", "a", "(Lc5/p;JLc5/t;J)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "(Lc5/p;JJLc5/t;)J", "Lr0/o;", "xCandidates", "yCandidates", "e", "(Lr0/o;Lr0/o;Lc5/p;JJ)J", "", "Lh2/r1$a;", "f", "(Ljava/util/List;Lc5/p;JJLc5/t;)Lr0/o;", "Lh2/r1$b;", "g", "(Ljava/util/List;Lc5/p;JJ)Lr0/o;", "Lm2/a3;", "getTransformOriginState", "()Lm2/a3;", "b", "J", "getContentOffset-RKDOV3M", "()J", "c", "Lc5/d;", "getDensity", "()Lc5/d;", "Lf2/yd;", "getDropdownMenuAnchorPosition", "()Lf2/yd;", "I", "getVerticalMargin", "getHorizontalMargin", "Ler/p;", "getOnPositionCalculated", "()Ler/p;", "h", "Lh2/r1$a;", "startToAnchorStart", "i", "endToAnchorStart", "j", "endToAnchorEnd", "k", "startToAnchorEnd", "l", "leftToWindowLeft", "m", "rightToWindowRight", "n", "Lh2/r1$b;", "topToAnchorBottom", "o", "topToAnchorTop", "p", "bottomToAnchorTop", "q", "bottomToAnchorBottom", "r", "centerToAnchorTop", "s", "topToWindowTop", "t", "bottomToWindowBottom", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DropdownMenuPositionProvider implements androidx.compose.ui.window.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p076m2.a3<n3.d3> transformOriginState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c5.d density;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final yd dropdownMenuAnchorPosition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int verticalMargin;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int horizontalMargin;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.p<c5.p, c5.p, oq.i0> onPositionCalculated;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r1.a startToAnchorStart;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final r1.a endToAnchorStart;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r1.a endToAnchorEnd;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final r1.a startToAnchorEnd;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final r1.a leftToWindowLeft;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final r1.a rightToWindowRight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final r1.b topToAnchorBottom;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final r1.b topToAnchorTop;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final r1.b bottomToAnchorTop;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final r1.b bottomToAnchorBottom;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final r1.b centerToAnchorTop;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final r1.b topToWindowTop;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final r1.b bottomToWindowBottom;

    public /* synthetic */ DropdownMenuPositionProvider(p076m2.a3 a3Var, long j15, c5.d dVar, yd ydVar, int i15, int i16, er.p pVar, fr.k kVar) {
        this(a3Var, j15, dVar, ydVar, i15, i16, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(c5.p pVar, c5.p pVar2) {
        return oq.i0.f148189a;
    }

    private final long d(c5.p anchorBounds, long windowSize, long popupContentSize, c5.t layoutDirection) {
        return e(f(pq.v.q(this.startToAnchorStart, this.endToAnchorEnd, c5.n.i(anchorBounds.e()) < ((int) (windowSize >> 32)) / 2 ? this.leftToWindowLeft : this.rightToWindowRight), anchorBounds, windowSize, popupContentSize, layoutDirection), g(pq.v.q(this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, c5.n.j(anchorBounds.e()) < ((int) (BodyPartID.bodyIdMax & windowSize)) / 2 ? this.topToWindowTop : this.bottomToWindowBottom), anchorBounds, windowSize, popupContentSize), anchorBounds, windowSize, popupContentSize);
    }

    private final long e(r0.o xCandidates, r0.o yCandidates, c5.p anchorBounds, long windowSize, long popupContentSize) {
        int iE;
        int iE2;
        int i15;
        int i16;
        int i17 = 0;
        lr.i iVarW = lr.m.w(0, xCandidates._size);
        int first = iVarW.getFirst();
        int last = iVarW.getLast();
        if (first > last) {
            iE = 0;
            break;
        }
        while (true) {
            iE = xCandidates.e(first);
            if (first != xCandidates._size - 1 && (iE < (i16 = this.horizontalMargin) || ((int) (popupContentSize >> 32)) + iE > ((int) (windowSize >> 32)) - i16)) {
                if (first == last) {
                    iE = 0;
                    break;
                }
                first++;
            } else {
                break;
            }
        }
        lr.i iVarW2 = lr.m.w(0, yCandidates._size);
        int first2 = iVarW2.getFirst();
        int last2 = iVarW2.getLast();
        if (first2 <= last2) {
            while (true) {
                iE2 = yCandidates.e(first2);
                if (first2 == yCandidates._size - 1 || (iE2 >= (i15 = this.verticalMargin) && ((int) (popupContentSize & BodyPartID.bodyIdMax)) + iE2 <= ((int) (windowSize & BodyPartID.bodyIdMax)) - i15)) {
                    break;
                }
                if (first2 != last2) {
                    first2++;
                }
            }
            i17 = iE2;
        }
        long jD = c5.n.d((((long) iE) << 32) | (((long) i17) & BodyPartID.bodyIdMax));
        this.onPositionCalculated.B(anchorBounds, c5.q.a(jD, popupContentSize));
        return jD;
    }

    private final r0.o f(List<? extends r1.a> xCandidates, c5.p anchorBounds, long windowSize, long popupContentSize, c5.t layoutDirection) {
        r0.i0 i0Var = new r0.i0(xCandidates.size());
        int size = xCandidates.size();
        for (int i15 = 0; i15 < size; i15++) {
            i0Var.k(xCandidates.get(i15).a(anchorBounds, windowSize, (int) (popupContentSize >> 32), layoutDirection));
        }
        return i0Var;
    }

    private final r0.o g(List<? extends r1.b> yCandidates, c5.p anchorBounds, long windowSize, long popupContentSize) {
        r0.i0 i0Var = new r0.i0(yCandidates.size());
        int size = yCandidates.size();
        for (int i15 = 0; i15 < size; i15++) {
            i0Var.k(yCandidates.get(i15).a(anchorBounds, windowSize, (int) (BodyPartID.bodyIdMax & popupContentSize)));
        }
        return i0Var;
    }

    @Override // androidx.compose.ui.window.t
    public long a(c5.p anchorBounds, long windowSize, c5.t layoutDirection, long popupContentSize) {
        yd ydVar = this.dropdownMenuAnchorPosition;
        if (ydVar instanceof yd.a) {
            return d(anchorBounds, windowSize, popupContentSize, layoutDirection);
        }
        if (ydVar instanceof yd.b) {
            return e(((yd.b) ydVar).a().w(anchorBounds, c5.r.b(windowSize), c5.r.b(popupContentSize)), ((yd.b) this.dropdownMenuAnchorPosition).b().w(anchorBounds, c5.r.b(windowSize), c5.r.b(popupContentSize)), anchorBounds, windowSize, popupContentSize);
        }
        throw new oq.p();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return fr.t.c(this.transformOriginState, dropdownMenuPositionProvider.transformOriginState) && c5.j.e(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && fr.t.c(this.density, dropdownMenuPositionProvider.density) && fr.t.c(this.dropdownMenuAnchorPosition, dropdownMenuPositionProvider.dropdownMenuAnchorPosition) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && this.horizontalMargin == dropdownMenuPositionProvider.horizontalMargin && fr.t.c(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((((((((((this.transformOriginState.hashCode() * 31) + c5.j.h(this.contentOffset)) * 31) + this.density.hashCode()) * 31) + this.dropdownMenuAnchorPosition.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + Integer.hashCode(this.horizontalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(transformOriginState=" + this.transformOriginState + ", contentOffset=" + ((Object) c5.j.i(this.contentOffset)) + ", density=" + this.density + ", dropdownMenuAnchorPosition=" + this.dropdownMenuAnchorPosition + ", verticalMargin=" + this.verticalMargin + ", horizontalMargin=" + this.horizontalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(p076m2.a3<n3.d3> a3Var, long j15, c5.d dVar, yd ydVar, int i15, int i16, er.p<? super c5.p, ? super c5.p, oq.i0> pVar) {
        this.transformOriginState = a3Var;
        this.contentOffset = j15;
        this.density = dVar;
        this.dropdownMenuAnchorPosition = ydVar;
        this.verticalMargin = i15;
        this.horizontalMargin = i16;
        this.onPositionCalculated = pVar;
        int iX0 = dVar.X0(c5.j.f(j15));
        r1 r1Var = r1.f79975a;
        this.startToAnchorStart = r1Var.j(iX0);
        this.endToAnchorStart = r1Var.f(iX0);
        this.endToAnchorEnd = r1Var.e(iX0);
        this.startToAnchorEnd = r1Var.i(iX0);
        this.leftToWindowLeft = r1Var.g(i16);
        this.rightToWindowRight = r1Var.h(i16);
        int iX1 = dVar.X0(c5.j.g(j15));
        this.topToAnchorBottom = r1Var.k(iX1);
        this.topToAnchorTop = r1Var.l(iX1);
        this.bottomToAnchorTop = r1Var.b(iX1);
        this.bottomToAnchorBottom = r1Var.a(iX1);
        this.centerToAnchorTop = r1Var.d(iX1);
        this.topToWindowTop = r1Var.m(i15);
        this.bottomToWindowBottom = r1Var.c(i15);
    }

    public /* synthetic */ DropdownMenuPositionProvider(p076m2.a3 a3Var, long j15, c5.d dVar, yd ydVar, int i15, int i16, er.p pVar, int i17, fr.k kVar) {
        this(a3Var, j15, dVar, ydVar, (i17 & 16) != 0 ? dVar.X0(le.C()) : i15, (i17 & 32) != 0 ? dVar.X0(le.B()) : i16, (i17 & 64) != 0 ? new er.p() { // from class: h2.d1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return DropdownMenuPositionProvider.c((c5.p) obj, (c5.p) obj2);
            }
        } : pVar, null);
    }
}
