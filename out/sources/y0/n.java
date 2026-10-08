package y0;

import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\fJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly0/n;", "Landroidx/compose/ui/window/t;", "Lkotlin/Function0;", "Lc5/n;", "anchorPositionBlock", "Lkotlin/Function2;", "Lc5/p;", "Loq/i0;", "onPositionCalculated", "<init>", "(Ler/a;Ler/p;)V", "anchorPosition", "(JLer/p;Lfr/k;)V", "anchorBounds", "Lc5/r;", "windowSize", "Lc5/t;", "layoutDirection", "popupContentSize", "a", "(Lc5/p;JLc5/t;J)J", "Ler/a;", "b", "Ler/p;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements androidx.compose.ui.window.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.a<c5.n> anchorPositionBlock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.p<c5.n, c5.p, i0> onPositionCalculated;

    public /* synthetic */ n(long j15, er.p pVar, fr.k kVar) {
        this(j15, (er.p<? super c5.n, ? super c5.p, i0>) pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n c(long j15) {
        return c5.n.c(j15);
    }

    @Override // androidx.compose.ui.window.t
    public long a(c5.p anchorBounds, long windowSize, c5.t layoutDirection, long popupContentSize) {
        long packedValue = this.anchorPositionBlock.a().getPackedValue();
        long jD = c5.n.d((((long) o.b(anchorBounds.getLeft() + c5.n.i(packedValue), (int) (popupContentSize >> 32), (int) (windowSize >> 32), layoutDirection == c5.t.Ltr)) << 32) | (BodyPartID.bodyIdMax & ((long) o.c(anchorBounds.getTop() + c5.n.j(packedValue), (int) (popupContentSize & BodyPartID.bodyIdMax), (int) (windowSize & BodyPartID.bodyIdMax), false, 8, null))));
        er.p<c5.n, c5.p, i0> pVar = this.onPositionCalculated;
        if (pVar != null) {
            pVar.B(c5.n.c(packedValue), c5.q.a(jD, popupContentSize));
        }
        return jD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(er.a<c5.n> aVar, er.p<? super c5.n, ? super c5.p, i0> pVar) {
        this.anchorPositionBlock = aVar;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ n(er.a aVar, er.p pVar, int i15, fr.k kVar) {
        this((er.a<c5.n>) aVar, (er.p<? super c5.n, ? super c5.p, i0>) ((i15 & 2) != 0 ? null : pVar));
    }

    public /* synthetic */ n(long j15, er.p pVar, int i15, fr.k kVar) {
        this(j15, (i15 & 2) != 0 ? null : pVar, null);
    }

    private n(final long j15, er.p<? super c5.n, ? super c5.p, i0> pVar) {
        this((er.a<c5.n>) new er.a() { // from class: y0.m
            @Override // er.a
            public final Object a() {
                return n.c(j15);
            }
        }, pVar);
    }
}
