package p036e4;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.k;
import c5.r;
import c5.t;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import java.util.Map;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010!\u001a\u00020\u001d*\u00020 H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0014\u0010#\u001a\u00020\r*\u00020\u001cH\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020\r*\u00020 H\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020\u001c*\u00020\rH\u0097\u0001¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\u001c*\u00020\u001dH\u0097\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0014\u0010*\u001a\u00020\u001c*\u00020 H\u0097\u0001¢\u0006\u0004\b*\u0010\"J\u0014\u0010+\u001a\u00020 *\u00020\u001dH\u0097\u0001¢\u0006\u0004\b+\u0010,J\u0014\u0010-\u001a\u00020 *\u00020\u001cH\u0097\u0001¢\u0006\u0004\b-\u0010,J\u0014\u00100\u001a\u00020/*\u00020.H\u0097\u0001¢\u0006\u0004\b0\u00101J\u0014\u00102\u001a\u00020.*\u00020/H\u0097\u0001¢\u0006\u0004\b2\u00101JH\u00103\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0013H\u0096\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010E\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010-\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0018\u0010L\u001a\u00020\n*\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010BR\u0014\u0010R\u001a\u00020O8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bV\u0010T¨\u0006X"}, d2 = {"Le4/g;", "Le4/f;", "Le4/y0;", "Le4/s0;", "Landroidx/compose/ui/node/f;", "coordinator", "Le4/e;", "approachNode", "<init>", "(Landroidx/compose/ui/node/f;Le4/e;)V", "Le4/b0;", "e", "(Le4/b0;)Le4/b0;", "", "width", "height", "", "Le4/a;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "Loq/i0;", "rulers", "Le4/a2$a;", "placementBlock", "Le4/x0;", "E0", "(IILjava/util/Map;Ler/l;Ler/l;)Le4/x0;", "Lc5/h;", "", "l2", "(F)F", "Lc5/v;", "e1", "(J)F", "X0", "(F)I", "q2", "(J)I", "b2", "(I)F", "d2", "h0", "y0", "(F)J", "Z", "Lc5/k;", "Lm3/k;", "B2", "(J)J", "a0", "x1", "(IILjava/util/Map;Ler/l;)Le4/x0;", "a", "Landroidx/compose/ui/node/f;", "G", "()Landroidx/compose/ui/node/f;", "b", "Le4/e;", "F", "()Le4/e;", "I", "(Le4/e;)V", "", "c", "E", "()Z", i.f37087n, "(Z)V", "approachMeasureRequired", "Lc5/r;", "u1", "()J", "lookaheadSize", "i", "(Le4/a2$a;)Le4/b0;", "lookaheadScopeCoordinates", "J0", "isLookingAhead", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f, y0, s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f coordinator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e approachNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean approachMeasureRequired;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"e4/g$a", "Le4/x0;", "Loq/i0;", "k", "()V", "", "a", "I", "l", "()I", "width", "b", "getHeight", "height", "", "Le4/a;", "c", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "d", "Ler/l;", "m", "()Ler/l;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<p036e4.a, Integer> alignmentLines;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final l<k2, i0> rulers;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<a2.a, i0> f47248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f47249f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i15, int i16, Map<p036e4.a, Integer> map, l<? super k2, i0> lVar, l<? super a2.a, i0> lVar2, g gVar) {
            this.f47248e = lVar2;
            this.f47249f = gVar;
            this.width = i15;
            this.height = i16;
            this.alignmentLines = map;
            this.rulers = lVar;
        }

        @Override // p036e4.x0
        public int getHeight() {
            return this.height;
        }

        @Override // p036e4.x0
        public Map<p036e4.a, Integer> i() {
            return this.alignmentLines;
        }

        @Override // p036e4.x0
        public void k() {
            this.f47248e.b(this.f47249f.getCoordinator().getPlacementScope());
        }

        @Override // p036e4.x0
        /* JADX INFO: renamed from: l, reason: from getter */
        public int getWidth() {
            return this.width;
        }

        @Override // p036e4.x0
        public l<k2, i0> m() {
            return this.rulers;
        }
    }

    public g(f fVar, e eVar) {
        this.coordinator = fVar;
        this.approachNode = eVar;
    }

    @Override // c5.d
    public long B2(long j15) {
        return this.coordinator.B2(j15);
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    @Override // p036e4.y0
    public x0 E0(int width, int height, Map<p036e4.a, Integer> alignmentLines, l<? super k2, i0> rulers, l<? super a2.a, i0> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            d4.a.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers, placementBlock, this);
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final e getApproachNode() {
        return this.approachNode;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final f getCoordinator() {
        return this.coordinator;
    }

    public final void H(boolean z15) {
        this.approachMeasureRequired = z15;
    }

    public final void I(e eVar) {
        this.approachNode = eVar;
    }

    @Override // p036e4.w
    public boolean J0() {
        return false;
    }

    @Override // c5.d
    public int X0(float f15) {
        return this.coordinator.X0(f15);
    }

    @Override // c5.l
    public long Z(float f15) {
        return this.coordinator.Z(f15);
    }

    @Override // c5.d
    public long a0(long j15) {
        return this.coordinator.a0(j15);
    }

    @Override // c5.d
    public float b2(int i15) {
        return this.coordinator.b2(i15);
    }

    @Override // c5.d
    public float d2(float f15) {
        return this.coordinator.d2(f15);
    }

    @Override // p036e4.s0
    public b0 e(b0 b0Var) {
        q0 lookaheadLayoutCoordinates;
        if (b0Var instanceof q0) {
            return b0Var;
        }
        if (b0Var instanceof NodeCoordinator) {
            k lookaheadDelegate = ((NodeCoordinator) b0Var).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? b0Var : lookaheadLayoutCoordinates;
        }
        d4.a.b("Unsupported LayoutCoordinates");
        throw new oq.g();
    }

    @Override // c5.d
    public float e1(long j15) {
        return this.coordinator.e1(j15);
    }

    @Override // c5.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // p036e4.w
    public t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // c5.l
    public float h0(long j15) {
        return this.coordinator.h0(j15);
    }

    @Override // p036e4.s0
    public b0 i(a2.a aVar) {
        NodeCoordinator nodeCoordinatorB0;
        androidx.compose.ui.node.g lookaheadRoot = this.coordinator.getLayoutNode().getLookaheadRoot();
        if (lookaheadRoot == null) {
            d4.a.b("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new oq.g();
        }
        if (!lookaheadRoot.getIsVirtualLookaheadRoot()) {
            return lookaheadRoot.y0();
        }
        androidx.compose.ui.node.g gVarC0 = lookaheadRoot.C0();
        return (gVarC0 == null || (nodeCoordinatorB0 = gVarC0.b0()) == null) ? lookaheadRoot.R().get(0).y0() : nodeCoordinatorB0;
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // c5.d
    public float l2(float f15) {
        return this.coordinator.l2(f15);
    }

    @Override // c5.d
    public int q2(long j15) {
        return this.coordinator.q2(j15);
    }

    @Override // p036e4.c
    public long u1() {
        x0 x0VarJ1 = this.coordinator.getLookaheadDelegate().J1();
        return r.c((((long) x0VarJ1.getWidth()) << 32) | (((long) x0VarJ1.getHeight()) & BodyPartID.bodyIdMax));
    }

    @Override // p036e4.y0
    public x0 x1(int width, int height, Map<p036e4.a, Integer> alignmentLines, l<? super a2.a, i0> placementBlock) {
        return this.coordinator.x1(width, height, alignmentLines, placementBlock);
    }

    @Override // c5.d
    public long y0(float f15) {
        return this.coordinator.y0(f15);
    }
}
