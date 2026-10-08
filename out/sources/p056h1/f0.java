package p056h1;

import c5.b;
import c5.n;
import f3.m;
import fr.t;
import g4.l0;
import g4.q;
import g4.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ju.p0;
import n3.x1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p056h1.b1;
import p071kotlin.Metadata;
import pq.v;
import r0.g1;
import r0.i1;
import r0.t0;
import r0.u0;
import sq.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003947B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0005J3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\b\u0002\u0010\u000f\u001a\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f*\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0089\u0001\u0010,\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0005J\u001f\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\f¢\u0006\u0004\b1\u00102R*\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u0002000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0017\u0010Q\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bK\u0010PR\u0018\u0010S\u001a\u00020\u0012*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010RR\u0018\u0010\r\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010TR\u0018\u0010U\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010TR\u0011\u0010X\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bH\u0010W¨\u0006Y"}, d2 = {"Lh1/f0;", "Lh1/b1;", "T", "", "<init>", "()V", "key", "Loq/i0;", "o", "(Ljava/lang/Object;)V", "n", "item", "", "mainAxisOffset", "Lh1/f0$c;", "itemInfo", "k", "(Lh1/b1;ILh1/f0$c;)V", "", "isMovingAway", "q", "(Lh1/b1;Z)V", "", "s", "([ILh1/b1;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Lh1/r0;", "keyIndexMap", "Lh1/e1;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "Lju/p0;", "coroutineScope", "Ln3/x1;", "graphicsContext", "m", "(IIILjava/util/List;Lh1/r0;Lh1/e1;ZZIZIILju/p0;Ln3/x1;)V", "p", "placeableIndex", "Lh1/a0;", "e", "(Ljava/lang/Object;I)Lh1/a0;", "Lr0/t0;", "a", "Lr0/t0;", "keyToItemInfoMap", "b", "Lh1/r0;", "c", "I", "firstVisibleIndex", "Lr0/u0;", "d", "Lr0/u0;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "f", "movingInFromEndBound", "g", "movingAwayToStartBound", "h", "movingAwayToEndBound", "i", "disappearingItems", "Lg4/q;", "j", "Lg4/q;", "displayingNode", "Lf3/m;", "Lf3/m;", "()Lf3/m;", "modifier", "(Lh1/b1;)Z", "hasAnimations", "(Lh1/b1;)I", "crossAxisOffset", "Lc5/r;", "()J", "minSizeToFitDisappearingItems", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0<T extends b1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r0 keyIndexMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private q displayingNode;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, f0<T>.c> keyToItemInfoMap = g1.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u0<Object> movingAwayKeys = i1.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromStartBound = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromEndBound = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToStartBound = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToEndBound = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<a0> disappearingItems = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final m modifier = new DisplayingDisappearingItemsElement(this);

    /* JADX INFO: renamed from: h1.f0$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh1/f0$a;", "Lg4/l0;", "Lh1/f0$b;", "Lh1/f0;", "animator", "<init>", "(Lh1/f0;)V", "a", "()Lh1/f0$b;", "node", "Loq/i0;", "l", "(Lh1/f0$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lh1/f0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends l0<DisplayingDisappearingItemsNode> {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f0<?> animator;

        public DisplayingDisappearingItemsElement(f0<?> f0Var) {
            this.animator = f0Var;
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DisplayingDisappearingItemsNode create() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && t.c(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void update(DisplayingDisappearingItemsNode node) {
            node.n3(this.animator);
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }
    }

    /* JADX INFO: renamed from: h1.f0$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lh1/f0$b;", "Lf3/m$c;", "Lg4/q;", "Lh1/f0;", "animator", "<init>", "(Lh1/f0;)V", "Lp3/c;", "Loq/i0;", "y", "(Lp3/c;)V", "W2", "()V", "X2", "n3", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "r", "Lh1/f0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsNode extends m.c implements q {

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private f0<?> animator;

        public DisplayingDisappearingItemsNode(f0<?> f0Var) {
            this.animator = f0Var;
        }

        @Override // f3.m.c
        public void W2() {
            ((f0) this.animator).displayingNode = this;
        }

        @Override // f3.m.c
        public void X2() {
            this.animator.p();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && t.c(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public final void n3(f0<?> animator) {
            if (t.c(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.p();
            ((f0) animator).displayingNode = this;
            this.animator = animator;
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }

        @Override // g4.q
        public void y(p3.c cVar) {
            List list = ((f0) this.animator).disappearingItems;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                a0 a0Var = (a0) list.get(i15);
                q3.c layer = a0Var.getLayer();
                if (layer != null) {
                    float fI = n.i(a0Var.getFinalOffset());
                    float fJ = n.j(a0Var.getFinalOffset());
                    float fI2 = fI - n.i(layer.getTopLeft());
                    float fJ2 = fJ - n.j(layer.getTopLeft());
                    cVar.getDrawContext().getTransform().d(fI2, fJ2);
                    try {
                        q3.e.a(cVar, layer);
                        cVar.getDrawContext().getTransform().d(-fI2, -fJ2);
                    } catch (Throwable th4) {
                        cVar.getDrawContext().getTransform().d(-fI2, -fJ2);
                        throw th4;
                    }
                }
            }
            cVar.H2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b*\u0010!R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lh1/f0$c;", "", "<init>", "(Lh1/f0;)V", "positionedItem", "Lju/p0;", "coroutineScope", "Ln3/x1;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "Loq/i0;", "l", "(Lh1/b1;Lju/p0;Ln3/x1;III)V", "", "Lh1/a0;", "value", "a", "[Lh1/a0;", "b", "()[Lh1/a0;", "animations", "Lc5/b;", "Lc5/b;", "c", "()Lc5/b;", "setConstraints-_Sx5XlM", "(Lc5/b;)V", CryptoServicesPermission.CONSTRAINTS, "I", "d", "()I", "setCrossAxisOffset", "(I)V", "e", "j", "lane", "h", "k", "span", "f", "g", "", "i", "()Z", "isRunningPlacement", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private b constraints;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int crossAxisOffset;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int lane;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int layoutMinOffset;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int layoutMaxOffset;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private a0[] animations = h0.f79414a;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int span = 1;

        public c() {
        }

        private final boolean i() {
            for (a0 a0Var : this.animations) {
                if (a0Var != null && a0Var.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void m(c cVar, b1 b1Var, p0 p0Var, x1 x1Var, int i15, int i16, int i17, int i18, Object obj) {
            if ((i18 & 32) != 0) {
                i17 = f0.this.f(b1Var);
            }
            cVar.l(b1Var, p0Var, x1Var, i15, i16, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 n(f0 f0Var) {
            q qVar = f0Var.displayingNode;
            if (qVar != null) {
                r.a(qVar);
            }
            return i0.f148189a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a0[] getAnimations() {
            return this.animations;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getLane() {
            return this.lane;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getSpan() {
            return this.span;
        }

        public final void j(int i15) {
            this.lane = i15;
        }

        public final void k(int i15) {
            this.span = i15;
        }

        public final void l(T positionedItem, p0 coroutineScope, x1 graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!i()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int iC = positionedItem.c(); iC < length; iC++) {
                a0 a0Var = this.animations[iC];
                if (a0Var != null) {
                    a0Var.y();
                }
            }
            if (this.animations.length != positionedItem.c()) {
                this.animations = (a0[]) Arrays.copyOf(this.animations, positionedItem.c());
            }
            this.constraints = b.a(positionedItem.getOrg.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int iC2 = positionedItem.c();
            for (int i15 = 0; i15 < iC2; i15++) {
                h0.c(positionedItem.l(i15));
                a0 a0Var2 = this.animations[i15];
                if (a0Var2 != null) {
                    a0Var2.y();
                }
                this.animations[i15] = null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f79389a;

        public d(r0 r0Var) {
            this.f79389a = r0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return a.e(Integer.valueOf(this.f79389a.c(((b1) t15).getKey())), Integer.valueOf(this.f79389a.c(((b1) t16).getKey())));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f79390a;

        public e(r0 r0Var) {
            this.f79390a = r0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return a.e(Integer.valueOf(this.f79390a.c(((b1) t15).getKey())), Integer.valueOf(this.f79390a.c(((b1) t16).getKey())));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f79391a;

        public f(r0 r0Var) {
            this.f79391a = r0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return a.e(Integer.valueOf(this.f79391a.c(((b1) t16).getKey())), Integer.valueOf(this.f79391a.c(((b1) t15).getKey())));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f79392a;

        public g(r0 r0Var) {
            this.f79392a = r0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return a.e(Integer.valueOf(this.f79392a.c(((b1) t16).getKey())), Integer.valueOf(this.f79392a.c(((b1) t15).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(b1 b1Var) {
        long jM = b1Var.m(0);
        return !b1Var.getIsVertical() ? n.j(jM) : n.i(jM);
    }

    private final boolean g(T t15) {
        int iC = t15.c();
        for (int i15 = 0; i15 < iC; i15++) {
            h0.c(t15.l(i15));
        }
        return false;
    }

    private final int h(b1 b1Var) {
        long jM = b1Var.m(0);
        return b1Var.getIsVertical() ? n.j(jM) : n.i(jM);
    }

    private final void k(T item, int mainAxisOffset, f0<T>.c itemInfo) {
        int i15 = 0;
        long jM = item.m(0);
        long jF = item.getIsVertical() ? n.f(jM, 0, mainAxisOffset, 1, null) : n.f(jM, mainAxisOffset, 0, 2, null);
        a0[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i16 = 0;
        while (i15 < length) {
            a0 a0Var = animations[i15];
            int i17 = i16 + 1;
            if (a0Var != null) {
                a0Var.J(n.m(jF, n.l(item.m(i16), jM)));
            }
            i15++;
            i16 = i17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l(f0 f0Var, b1 b1Var, int i15, c cVar, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            cVar = f0Var.keyToItemInfoMap.e(b1Var.getKey());
        }
        f0Var.k(b1Var, i15, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[LOOP:0: B:7:0x0015->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[EDGE_INSN: B:26:0x005e->B:23:0x005e BREAK  A[LOOP:0: B:7:0x0015->B:22:0x005b], SYNTHETIC] */
    private final void n() {
        if (this.keyToItemInfoMap.i()) {
            t0<Object, f0<T>.c> t0Var = this.keyToItemInfoMap;
            Object[] objArr = t0Var.values;
            long[] jArr = t0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                for (a0 a0Var : ((c) objArr[(i15 << 3) + i17]).getAnimations()) {
                                    if (a0Var != null) {
                                        a0Var.y();
                                    }
                                }
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            this.keyToItemInfoMap.k();
        }
    }

    private final void o(Object key) {
        a0[] animations;
        f0<T>.c cVarU = this.keyToItemInfoMap.u(key);
        if (cVarU == null || (animations = cVarU.getAnimations()) == null) {
            return;
        }
        for (a0 a0Var : animations) {
            if (a0Var != null) {
                a0Var.y();
            }
        }
    }

    private final void q(T item, boolean isMovingAway) {
        a0[] animations = this.keyToItemInfoMap.e(item.getKey()).getAnimations();
        int length = animations.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            a0 a0Var = animations[i15];
            int i17 = i16 + 1;
            if (a0Var != null) {
                long jM = item.m(i16);
                long rawOffset = a0Var.getRawOffset();
                if (!n.h(rawOffset, a0.INSTANCE.a()) && !n.h(rawOffset, jM)) {
                    a0Var.m(n.l(jM, rawOffset), isMovingAway);
                }
                a0Var.J(jM);
            }
            i15++;
            i16 = i17;
        }
    }

    static /* synthetic */ void r(f0 f0Var, b1 b1Var, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        f0Var.q(b1Var, z15);
    }

    private final int s(int[] iArr, T t15) {
        int iN = t15.getLane();
        int iA = t15.getSpan() + iN;
        int iMax = 0;
        while (iN < iA) {
            int iK = iArr[iN] + t15.getMainAxisSizeWithSpacings();
            iArr[iN] = iK;
            iMax = Math.max(iMax, iK);
            iN++;
        }
        return iMax;
    }

    public final a0 e(Object key, int placeableIndex) {
        a0[] animations;
        f0<T>.c cVarE = this.keyToItemInfoMap.e(key);
        if (cVarE == null || (animations = cVarE.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    public final long i() {
        long jA = c5.r.INSTANCE.a();
        List<a0> list = this.disappearingItems;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            a0 a0Var = list.get(i15);
            q3.c layer = a0Var.getLayer();
            if (layer != null) {
                int iMax = Math.max((int) (jA >> 32), n.i(a0Var.getRawOffset()) + ((int) (layer.getSize() >> 32)));
                jA = c5.r.c((((long) Math.max((int) (jA & BodyPartID.bodyIdMax), n.j(a0Var.getRawOffset()) + ((int) (layer.getSize() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iMax) << 32));
            }
        }
        return jA;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final m getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x00d8 A[EDGE_INSN: B:226:0x00d8->B:42:0x00d8 BREAK  A[LOOP:1: B:28:0x008c->B:40:0x00cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[LOOP:1: B:28:0x008c->B:40:0x00cd, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int consumedScroll, int layoutWidth, int layoutHeight, List<T> positionedItems, r0 keyIndexMap, e1<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, p0 coroutineScope, x1 graphicsContext) {
        List<T> list;
        boolean z15;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i15;
        Object obj;
        f0<T>.c cVarE;
        int i16;
        int i17;
        int i18;
        r0 r0Var = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        List<T> list2 = positionedItems;
        int size = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                if (!this.keyToItemInfoMap.h()) {
                    break;
                }
                n();
                return;
            } else if (g(positionedItems.get(i19))) {
                break;
            } else {
                i19++;
            }
        }
        int i25 = this.firstVisibleIndex;
        b1 b1Var = (b1) v.n0(positionedItems);
        this.firstVisibleIndex = b1Var != null ? b1Var.getIndex() : 0;
        long jD = isVertical ? n.d((((long) consumedScroll) & BodyPartID.bodyIdMax) | (((long) 0) << 32)) : n.d((((long) consumedScroll) << 32) | (((long) 0) & BodyPartID.bodyIdMax));
        boolean z16 = isLookingAhead || !hasLookaheadOccurred;
        t0<Object, f0<T>.c> t0Var = this.keyToItemInfoMap;
        Object[] objArr3 = t0Var.keys;
        long[] jArr3 = t0Var.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            z15 = z16;
            int i26 = 0;
            while (true) {
                long j15 = jArr3[i26];
                long[] jArr4 = jArr3;
                list = list2;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i27 = 8 - ((~(i26 - length)) >>> 31);
                    for (int i28 = 0; i28 < i27; i28++) {
                        if ((j15 & 255) < 128) {
                            this.movingAwayKeys.i(objArr3[(i26 << 3) + i28]);
                        }
                        j15 >>= 8;
                    }
                    if (i27 != 8) {
                        break;
                    }
                    if (i26 != length) {
                        break;
                    }
                    i26++;
                    list2 = list;
                    jArr3 = jArr4;
                } else if (i26 != length) {
                    break;
                    break;
                } else {
                    i26++;
                    list2 = list;
                    jArr3 = jArr4;
                }
            }
        } else {
            list = list2;
            z15 = z16;
        }
        int size2 = list.size();
        int i29 = 0;
        while (i29 < size2) {
            T t15 = positionedItems.get(i29);
            this.movingAwayKeys.z(t15.getKey());
            if (g(t15)) {
                f0<T>.c cVarE2 = this.keyToItemInfoMap.e(t15.getKey());
                int iC = r0Var != null ? r0Var.c(t15.getKey()) : -1;
                boolean z17 = iC == -1 && r0Var != null;
                if (cVarE2 == null) {
                    f0<T>.c cVar = new c();
                    c.m(cVar, t15, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    i17 = size2;
                    i18 = i29;
                    this.keyToItemInfoMap.x(t15.getKey(), cVar);
                    if (t15.getIndex() == iC || iC == -1) {
                        long jM = t15.m(0);
                        k(t15, t15.getIsVertical() ? n.j(jM) : n.i(jM), cVar);
                        if (z17) {
                            a0[] animations = cVar.getAnimations();
                            for (a0 a0Var : animations) {
                                if (a0Var != null) {
                                    a0Var.k();
                                    i0 i0Var = i0.f148189a;
                                }
                            }
                        }
                        i0 i0Var2 = i0.f148189a;
                    } else if (iC < i25) {
                        this.movingInFromStartBound.add(t15);
                    } else {
                        this.movingInFromEndBound.add(t15);
                    }
                } else {
                    i17 = size2;
                    i18 = i29;
                    if (z15) {
                        c.m(cVarE2, t15, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                        a0[] animations2 = cVarE2.getAnimations();
                        int length2 = animations2.length;
                        int i35 = 0;
                        while (i35 < length2) {
                            a0 a0Var2 = animations2[i35];
                            a0[] a0VarArr = animations2;
                            int i36 = length2;
                            if (a0Var2 != null && !n.h(a0Var2.getRawOffset(), a0.INSTANCE.a())) {
                                a0Var2.J(n.m(a0Var2.getRawOffset(), jD));
                            }
                            i35++;
                            animations2 = a0VarArr;
                            length2 = i36;
                        }
                        if (z17) {
                            for (a0 a0Var3 : cVarE2.getAnimations()) {
                                if (a0Var3 != null) {
                                    if (a0Var3.v()) {
                                        this.disappearingItems.remove(a0Var3);
                                        q qVar = this.displayingNode;
                                        if (qVar != null) {
                                            r.a(qVar);
                                            i0 i0Var3 = i0.f148189a;
                                        }
                                    }
                                    a0Var3.k();
                                }
                            }
                        }
                        r(this, t15, false, 2, null);
                    }
                    i0 i0Var4 = i0.f148189a;
                }
            } else {
                i17 = size2;
                i18 = i29;
                o(t15.getKey());
                i0 i0Var5 = i0.f148189a;
            }
            i29 = i18 + 1;
            size2 = i17;
        }
        int[] iArr = new int[laneCount];
        if (z15 && r0Var != null) {
            if (!this.movingInFromStartBound.isEmpty()) {
                List<T> list3 = this.movingInFromStartBound;
                if (list3.size() > 1) {
                    v.C(list3, new f(r0Var));
                }
                List<T> list4 = this.movingInFromStartBound;
                int size3 = list4.size();
                for (int i37 = 0; i37 < size3; i37++) {
                    T t16 = list4.get(i37);
                    l(this, t16, layoutMinOffset - s(iArr, t16), null, 4, null);
                    r(this, t16, false, 2, null);
                }
                pq.n.C(iArr, 0, 0, 0, 6, null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list5 = this.movingInFromEndBound;
                if (list5.size() > 1) {
                    v.C(list5, new d(r0Var));
                }
                List<T> list6 = this.movingInFromEndBound;
                int size4 = list6.size();
                for (int i38 = 0; i38 < size4; i38++) {
                    T t17 = list6.get(i38);
                    l(this, t17, (layoutMaxOffset + s(iArr, t17)) - t17.getMainAxisSizeWithSpacings(), null, 4, null);
                    r(this, t17, false, 2, null);
                }
                pq.n.C(iArr, 0, 0, 0, 6, null);
            }
        }
        u0<Object> u0Var = this.movingAwayKeys;
        Object[] objArr4 = u0Var.elements;
        long[] jArr5 = u0Var.metadata;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i39 = 0;
            while (true) {
                long j16 = jArr5[i39];
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i45 = 8 - ((~(i39 - length3)) >>> 31);
                    int i46 = 0;
                    while (i46 < i45) {
                        if ((j16 & 255) >= 128 || (cVarE = this.keyToItemInfoMap.e((obj = objArr4[(i39 << 3) + i46]))) == 0) {
                            jArr2 = jArr5;
                            objArr2 = objArr4;
                            i15 = i46;
                        } else {
                            jArr2 = jArr5;
                            int iC2 = keyIndexMap.c(obj);
                            objArr2 = objArr4;
                            cVarE.k(Math.min(laneCount, cVarE.getSpan()));
                            i15 = i46;
                            cVarE.j(Math.min(laneCount - cVarE.getSpan(), cVarE.getLane()));
                            if (iC2 == -1) {
                                a0[] animations3 = cVarE.getAnimations();
                                int length4 = animations3.length;
                                int i47 = 0;
                                boolean z18 = false;
                                int i48 = 0;
                                while (i47 < length4) {
                                    a0[] a0VarArr2 = animations3;
                                    a0 a0Var4 = a0VarArr2[i47];
                                    int i49 = i48 + 1;
                                    if (a0Var4 == null) {
                                        i16 = i47;
                                    } else if (a0Var4.v()) {
                                        i0 i0Var6 = i0.f148189a;
                                        i16 = i47;
                                        z18 = true;
                                    } else {
                                        if (a0Var4.u()) {
                                            a0Var4.y();
                                            cVarE.getAnimations()[i48] = null;
                                            i16 = i47;
                                            this.disappearingItems.remove(a0Var4);
                                            q qVar2 = this.displayingNode;
                                            if (qVar2 != null) {
                                                r.a(qVar2);
                                                i0 i0Var7 = i0.f148189a;
                                            }
                                        } else {
                                            i16 = i47;
                                            if (a0Var4.getLayer() != null) {
                                                a0Var4.l();
                                            }
                                            if (a0Var4.v()) {
                                                this.disappearingItems.add(a0Var4);
                                                q qVar3 = this.displayingNode;
                                                if (qVar3 != null) {
                                                    r.a(qVar3);
                                                    i0 i0Var8 = i0.f148189a;
                                                }
                                                z18 = true;
                                            } else {
                                                a0Var4.y();
                                                cVarE.getAnimations()[i48] = null;
                                            }
                                            i0 i0Var9 = i0.f148189a;
                                        }
                                        i47 = i16 + 1;
                                        animations3 = a0VarArr2;
                                        i48 = i49;
                                    }
                                    i47 = i16 + 1;
                                    animations3 = a0VarArr2;
                                    i48 = i49;
                                }
                                if (!z18) {
                                    o(obj);
                                }
                                i0 i0Var10 = i0.f148189a;
                            } else {
                                b1 b1VarA = itemProvider.a(iC2, cVarE.getLane(), cVarE.getSpan(), cVarE.getConstraints().getValue());
                                b1VarA.d(true);
                                a0[] animations4 = cVarE.getAnimations();
                                int length5 = animations4.length;
                                int i55 = 0;
                                while (true) {
                                    if (i55 < length5) {
                                        a0 a0Var5 = animations4[i55];
                                        int i56 = length5;
                                        if (a0Var5 != null && a0Var5.w()) {
                                        }
                                        i55++;
                                        length5 = i56;
                                    } else if (r0Var != null && iC2 == r0Var.c(obj)) {
                                        o(obj);
                                        i0 i0Var11 = i0.f148189a;
                                    }
                                    cVarE.l(b1VarA, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, cVarE.getCrossAxisOffset());
                                    if (iC2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add((T) b1VarA);
                                    } else {
                                        this.movingAwayToEndBound.add((T) b1VarA);
                                    }
                                }
                            }
                        }
                        j16 >>= 8;
                        i46 = i15 + 1;
                        jArr5 = jArr2;
                        objArr4 = objArr2;
                    }
                    jArr = jArr5;
                    objArr = objArr4;
                    if (i45 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr5;
                    objArr = objArr4;
                }
                if (i39 == length3) {
                    break;
                }
                i39++;
                jArr5 = jArr;
                objArr4 = objArr;
            }
        }
        if (!this.movingAwayToStartBound.isEmpty()) {
            List<T> list7 = this.movingAwayToStartBound;
            if (list7.size() > 1) {
                v.C(list7, new g(keyIndexMap));
            }
            List<T> list8 = this.movingAwayToStartBound;
            int size5 = list8.size();
            for (int i57 = 0; i57 < size5; i57++) {
                T t18 = list8.get(i57);
                f0<T>.c cVarE3 = this.keyToItemInfoMap.e(t18.getKey());
                t18.j((isLookingAhead ? h((b1) v.l0(positionedItems)) : cVarE3.getLayoutMinOffset()) - s(iArr, t18), cVarE3.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z15) {
                    q(t18, true);
                }
            }
            pq.n.C(iArr, 0, 0, 0, 6, null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list9 = this.movingAwayToEndBound;
            if (list9.size() > 1) {
                v.C(list9, new e(keyIndexMap));
            }
            List<T> list10 = this.movingAwayToEndBound;
            int size6 = list10.size();
            for (int i58 = 0; i58 < size6; i58++) {
                T t19 = list10.get(i58);
                f0<T>.c cVarE4 = this.keyToItemInfoMap.e(t19.getKey());
                t19.j((cVarE4.getLayoutMaxOffset() - t19.getMainAxisSizeWithSpacings()) + s(iArr, t19), cVarE4.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z15) {
                    q(t19, true);
                }
            }
        }
        List<T> list11 = this.movingAwayToStartBound;
        v.X(list11);
        i0 i0Var12 = i0.f148189a;
        positionedItems.addAll(0, list11);
        positionedItems.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.n();
    }

    public final void p() {
        n();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }
}
