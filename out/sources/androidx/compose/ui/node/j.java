package androidx.compose.ui.node;

import fr.t;
import fr.w;
import g4.c1;
import g4.j0;
import g4.m0;
import g4.u1;
import java.util.Map;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.a2;
import p036e4.b0;
import p036e4.b2;
import p036e4.c0;
import p036e4.i2;
import p036e4.k2;
import p036e4.w2;
import p036e4.x0;
import p071kotlin.Metadata;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0081\u0001\u0082\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\n2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\nH ¢\u0006\u0004\b(\u0010\u0005J\u0013\u0010*\u001a\u00020\n*\u00020)H\u0004¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020,2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u00101J]\u0010<\u001a\u00020;2\u0006\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020$2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020$042\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\n\u0018\u0001062\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\n06H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b?\u0010@J\u001d\u0010B\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010A\u001a\u00020,¢\u0006\u0004\bB\u0010CR\u001c\u0010G\u001a\b\u0018\u00010DR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010J\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\n\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010S\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010!R\"\u0010W\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010O\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010!R\"\u0010[\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010O\u001a\u0004\bY\u0010Q\"\u0004\bZ\u0010!R\u0017\u0010`\u001a\u0002098\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR0\u0010h\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u0019\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010k\u001a\u00060DR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010q\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010pR\u0014\u0010u\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010yR\u0014\u0010}\u001a\u00020;8 X \u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010Q¨\u0006\u0083\u0001"}, d2 = {"Landroidx/compose/ui/node/j;", "Le4/a2;", "Lg4/j0;", "Lg4/m0;", "<init>", "()V", "Landroidx/compose/ui/node/g;", "layoutNode", "Le4/i2;", "ruler", "Loq/i0;", "o1", "(Landroidx/compose/ui/node/g;Le4/i2;)V", "B1", "(Le4/i2;)Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/p;", "placeableResult", "Lc5/n;", "positionOnScreen", "Lc5/r;", "size", "q1", "(Landroidx/compose/ui/node/p;JJ)V", "v1", "(Landroidx/compose/ui/node/p;)V", "Lr0/u0;", "Lg4/u1;", "layoutNodes", "Z1", "(Lr0/u0;)V", "", "newMFR", "R", "(Z)V", "Le4/a;", "alignmentLine", "", "I", "(Le4/a;)I", "p1", "h2", "Landroidx/compose/ui/node/NodeCoordinator;", "R1", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "", "defaultValue", "C1", "(Le4/i2;F)F", "V1", "(Le4/i2;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "rulers", "Le4/a2$a;", "placementBlock", "Le4/x0;", "E0", "(IILjava/util/Map;Ler/l;Ler/l;)Le4/x0;", "result", "y1", "(Le4/x0;)V", "value", "a2", "(Le4/i2;F)V", "Landroidx/compose/ui/node/j$c;", "f", "Landroidx/compose/ui/node/j$c;", "_rulerScope", "g", "Ler/l;", "rulersLambda", "h", "Landroidx/compose/ui/node/p;", "cachedRulerPlaceableResult", "j", "Z", "W1", "()Z", "m2", "isPlacedUnderMotionFrameOfReference", "k", "Y1", "r2", "isShallowPlacing", "l", "X1", "p2", "isPlacingForAlignment", "m", "Le4/a2$a;", "N1", "()Le4/a2$a;", "placementScope", "Landroidx/compose/ui/node/r;", "n", "Landroidx/compose/ui/node/r;", "rulerValues", "Lr0/t0;", "p", "Lr0/t0;", "rulerReaders", "Q1", "()Landroidx/compose/ui/node/j$c;", "rulerScope", "O1", "()J", "position", "E1", "()Landroidx/compose/ui/node/j;", "child", "M1", "parent", "G1", "hasMeasureResult", "A2", "()Landroidx/compose/ui/node/g;", "Le4/b0;", "()Le4/b0;", "coordinates", "J1", "()Le4/x0;", "measureResult", "J0", "isLookingAhead", "q", "c", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j extends a2 implements j0, m0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final er.l<p, i0> f10160r = a.f10170b;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c _rulerScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private er.l<? super k2, i0> rulersLambda;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private p cachedRulerPlaceableResult;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isShallowPlacing;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a2.a placementScope = b2.a(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private r rulerValues;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private t0<i2, u0<u1<g>>> rulerReaders;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/p;", "result", "Loq/i0;", "c", "(Landroidx/compose/ui/node/p;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.l<p, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10170b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p pVar) {
            c(pVar);
            return i0.f148189a;
        }

        public final void c(p pVar) {
            if (pVar.K1()) {
                pVar.getPlaceable().v1(pVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/j$c;", "Le4/k2;", "<init>", "(Landroidx/compose/ui/node/j;)V", "Le4/i2;", "", "value", "Loq/i0;", "g2", "(Le4/i2;F)V", "", "a", "Z", "c", "()Z", "h", "(Z)V", "coordinatesAccessed", "Lc5/n;", "b", "J", "e", "()J", "i", "(J)V", "positionOnScreen", "Lc5/r;", "k", "size", "Le4/b0;", "m", "()Le4/b0;", "coordinates", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class c implements k2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean coordinatesAccessed;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long positionOnScreen = c5.n.INSTANCE.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long size = c5.r.INSTANCE.a();

        public c() {
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCoordinatesAccessed() {
            return this.coordinatesAccessed;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        @Override // p036e4.k2
        public void g2(i2 i2Var, float f15) {
            j.this.a2(i2Var, f15);
        }

        @Override // c5.d
        /* JADX INFO: renamed from: getDensity */
        public float get_density() {
            return j.this.get_density();
        }

        public final void h(boolean z15) {
            this.coordinatesAccessed = z15;
        }

        public final void i(long j15) {
            this.positionOnScreen = j15;
        }

        @Override // c5.l
        /* JADX INFO: renamed from: i2 */
        public float get_fontScale() {
            return j.this.get_fontScale();
        }

        public final void k(long j15) {
            this.size = j15;
        }

        @Override // p036e4.k2
        public b0 m() {
            this.coordinatesAccessed = true;
            b0 b0VarM = j.this.m();
            if (c5.n.h(this.positionOnScreen, c5.n.INSTANCE.a())) {
                this.positionOnScreen = c5.o.d(c0.i(b0VarM));
                this.size = b0VarM.b();
            }
            j.this.getLayoutNode().getLayoutDelegate().H();
            return b0VarM;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements er.a<i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f10176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f10178e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j15, long j16, p pVar) {
            super(0);
            this.f10176c = j15;
            this.f10177d = j16;
            this.f10178e = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            j.this.Q1().h(false);
            j.this.Q1().i(this.f10176c);
            j.this.Q1().k(this.f10177d);
            er.l<k2, i0> lVarM = this.f10178e.getResult().m();
            if (lVarM != null) {
                lVarM.b(j.this.Q1());
            }
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/node/j$e", "Le4/x0;", "Loq/i0;", "k", "()V", "", "l", "()I", "width", "getHeight", "height", "", "Le4/a;", "i", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "m", "()Ler/l;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<p036e4.a, Integer> f10181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.l<k2, i0> f10182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.l<a2.a, i0> f10183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f10184f;

        /* JADX WARN: Multi-variable type inference failed */
        e(int i15, int i16, Map<p036e4.a, Integer> map, er.l<? super k2, i0> lVar, er.l<? super a2.a, i0> lVar2, j jVar) {
            this.f10179a = i15;
            this.f10180b = i16;
            this.f10181c = map;
            this.f10182d = lVar;
            this.f10183e = lVar2;
            this.f10184f = jVar;
        }

        @Override // p036e4.x0
        public int getHeight() {
            return this.f10180b;
        }

        @Override // p036e4.x0
        public Map<p036e4.a, Integer> i() {
            return this.f10181c;
        }

        @Override // p036e4.x0
        public void k() {
            this.f10183e.b(this.f10184f.getPlacementScope());
        }

        @Override // p036e4.x0
        /* JADX INFO: renamed from: l, reason: from getter */
        public int getWidth() {
            return this.f10179a;
        }

        @Override // p036e4.x0
        public er.l<k2, i0> m() {
            return this.f10182d;
        }
    }

    private final j B1(i2 ruler) {
        j jVarM1;
        j jVar = this;
        while (true) {
            r rVar = jVar.rulerValues;
            if ((rVar != null && rVar.b(ruler)) || (jVarM1 = jVar.M1()) == null) {
                return jVar;
            }
            jVar = jVarM1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c Q1() {
        c cVar = this._rulerScope;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this._rulerScope = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Z1(u0<u1<g>> layoutNodes) {
        g gVar;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128 && (gVar = (g) ((u1) objArr[(i15 << 3) + i17]).get()) != null) {
                        if (J0()) {
                            gVar.G1(false);
                        } else {
                            gVar.L1(false);
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x009f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void o1(g layoutNode, i2 ruler) {
        char c15;
        long j15;
        long j16;
        long j17;
        int i15;
        int i16;
        long[] jArr;
        long[] jArr2;
        long j18;
        int i17;
        char c16;
        long j19;
        int i18;
        int i19;
        int i25;
        boolean z15;
        t0<i2, u0<u1<g>>> t0Var = this.rulerReaders;
        char c17 = 7;
        long j25 = -9187201950435737472L;
        int i26 = 8;
        if (t0Var != null) {
            Object[] objArr = t0Var.values;
            long[] jArr3 = t0Var.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i27 = 0;
                j16 = 128;
                while (true) {
                    long j26 = jArr3[i27];
                    j17 = 255;
                    if ((((~j26) << c17) & j26 & j25) != j25) {
                        int i28 = 8 - ((~(i27 - length)) >>> 31);
                        int i29 = 0;
                        while (i29 < i28) {
                            if ((j26 & 255) < 128) {
                                c16 = c17;
                                u0 u0Var = (u0) objArr[(i27 << 3) + i29];
                                j19 = j25;
                                Object[] objArr2 = u0Var.elements;
                                long[] jArr4 = u0Var.metadata;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i35 = i26;
                                    int i36 = 0;
                                    while (true) {
                                        int i37 = length2;
                                        long j27 = jArr4[i36];
                                        jArr2 = jArr3;
                                        j18 = j26;
                                        if ((((~j27) << c16) & j27 & j19) != j19) {
                                            int i38 = 8 - ((~(i36 - i37)) >>> 31);
                                            int i39 = 0;
                                            while (i39 < i38) {
                                                if ((j27 & 255) < 128) {
                                                    int i45 = (i36 << 3) + i39;
                                                    g gVar = (g) ((u1) objArr2[i45]).get();
                                                    i19 = i39;
                                                    if (gVar != null) {
                                                        boolean zC = gVar.c();
                                                        i25 = i29;
                                                        z15 = zC;
                                                        if (!z15) {
                                                            u0Var.B(i45);
                                                        }
                                                    } else {
                                                        i25 = i29;
                                                    }
                                                    if (!z15) {
                                                        u0Var.B(i45);
                                                    }
                                                } else {
                                                    i19 = i39;
                                                    i25 = i29;
                                                }
                                                j27 >>= i35;
                                                i39 = i19 + 1;
                                                i29 = i25;
                                            }
                                            i17 = i29;
                                            if (i38 != i35) {
                                                break;
                                            }
                                        } else {
                                            i17 = i29;
                                        }
                                        length2 = i37;
                                        if (i36 == length2) {
                                            break;
                                        }
                                        i36++;
                                        jArr3 = jArr2;
                                        j26 = j18;
                                        i29 = i17;
                                        i35 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j18 = j26;
                                    i17 = i29;
                                }
                                i18 = 8;
                            } else {
                                jArr2 = jArr3;
                                j18 = j26;
                                i17 = i29;
                                c16 = c17;
                                j19 = j25;
                                i18 = i26;
                            }
                            i26 = i18;
                            j26 = j18 >> i18;
                            c17 = c16;
                            j25 = j19;
                            i29 = i17 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c15 = c17;
                        j15 = j25;
                        if (i28 != i26) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c15 = c17;
                        j15 = j25;
                    }
                    if (i27 == length) {
                        break;
                    }
                    i27++;
                    c17 = c15;
                    j25 = j15;
                    jArr3 = jArr;
                    i26 = 8;
                }
            } else {
                c15 = 7;
                j15 = -9187201950435737472L;
                j16 = 128;
                j17 = 255;
            }
        } else {
            c15 = 7;
            j15 = -9187201950435737472L;
            j16 = 128;
            j17 = 255;
        }
        t0<i2, u0<u1<g>>> t0Var2 = this.rulerReaders;
        if (t0Var2 != null) {
            long[] jArr5 = t0Var2.metadata;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i46 = 0;
                while (true) {
                    long j28 = jArr5[i46];
                    if ((((~j28) << c15) & j28 & j15) != j15) {
                        int i47 = 8 - ((~(i46 - length3)) >>> 31);
                        for (int i48 = 0; i48 < i47; i48++) {
                            if ((j28 & j17) < j16) {
                                int i49 = (i46 << 3) + i48;
                                if (((u0) t0Var2.values[i49]).e()) {
                                    t0Var2.v(i49);
                                }
                            }
                            j28 >>= 8;
                        }
                        if (i47 != 8) {
                            break;
                        }
                    }
                    if (i46 == length3) {
                        break;
                    } else {
                        i46++;
                    }
                }
            }
        }
        t0<i2, u0<u1<g>>> t0Var3 = this.rulerReaders;
        fr.k kVar = null;
        if (t0Var3 == null) {
            i15 = 0;
            i16 = 1;
            t0Var3 = new t0<>(i15, i16, kVar);
            this.rulerReaders = t0Var3;
        } else {
            i15 = 0;
            i16 = 1;
        }
        u0<u1<g>> u0VarE = t0Var3.e(ruler);
        if (u0VarE == null) {
            u0VarE = new u0<>(i15, i16, kVar);
            t0Var3.x(ruler, u0VarE);
        }
        u0VarE.x(new u1<>(layoutNode));
    }

    private final void q1(p placeableResult, long positionOnScreen, long size) {
        c1 snapshotObserver;
        t0<i2, u0<u1<g>>> t0Var = this.rulerReaders;
        r rVar = this.rulerValues;
        if (rVar == null) {
            rVar = new r();
            this.rulerValues = rVar;
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.observer.k(placeableResult, f10160r, new d(positionOnScreen, size, placeableResult));
        }
        rVar.d(J0(), this, t0Var);
    }

    static /* synthetic */ void r1(j jVar, p pVar, long j15, long j16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i15 & 2) != 0) {
            j15 = c5.n.INSTANCE.a();
        }
        long j17 = j15;
        if ((i15 & 4) != 0) {
            j16 = c5.r.INSTANCE.a();
        }
        jVar.q1(pVar, j17, j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[LOOP:0: B:11:0x001e->B:21:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[EDGE_INSN: B:27:0x0058->B:22:0x0058 BREAK  A[LOOP:0: B:11:0x001e->B:21:0x0055], SYNTHETIC] */
    public final void v1(p placeableResult) {
        if (this.isPlacingForAlignment) {
            return;
        }
        er.l<k2, i0> lVarM = placeableResult.getResult().m();
        t0<i2, u0<u1<g>>> t0Var = this.rulerReaders;
        if (lVarM != null) {
            r1(this, placeableResult, 0L, 0L, 6, null);
            this.rulersLambda = lVarM;
            return;
        }
        if (t0Var != null) {
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
                                Z1((u0) objArr[(i15 << 3) + i17]);
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
            t0Var.k();
        }
    }

    /* JADX INFO: renamed from: A2 */
    public abstract g getLayoutNode();

    public final float C1(i2 ruler, float defaultValue) {
        if (this.isPlacingForAlignment) {
            return defaultValue;
        }
        j jVar = this;
        while (true) {
            r rVar = jVar.rulerValues;
            float fC = rVar != null ? rVar.c(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fC)) {
                jVar.o1(getLayoutNode(), ruler);
                return ruler.a(fC, jVar.m(), m());
            }
            j jVarM1 = jVar.M1();
            if (jVarM1 == null) {
                jVar.o1(getLayoutNode(), ruler);
                return defaultValue;
            }
            jVar = jVarM1;
        }
    }

    @Override // p036e4.y0
    public x0 E0(int width, int height, Map<p036e4.a, Integer> alignmentLines, er.l<? super k2, i0> rulers, er.l<? super a2.a, i0> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            d4.a.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(width, height, alignmentLines, rulers, placementBlock, this);
    }

    public abstract j E1();

    public abstract boolean G1();

    @Override // p036e4.z0
    public final int I(p036e4.a alignmentLine) {
        int iP1;
        if (G1() && (iP1 = p1(alignmentLine)) != Integer.MIN_VALUE) {
            return iP1 + (alignmentLine instanceof w2 ? c5.n.i(getApparentToRealOffset()) : c5.n.j(getApparentToRealOffset()));
        }
        return PKIFailureInfo.systemUnavail;
    }

    @Override // p036e4.w
    public boolean J0() {
        return false;
    }

    public abstract x0 J1();

    public abstract j M1();

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final a2.a getPlacementScope() {
        return this.placementScope;
    }

    /* JADX INFO: renamed from: O1 */
    public abstract long getPosition();

    @Override // g4.m0
    public void R(boolean newMFR) {
        j jVarM1 = M1();
        g layoutNode = jVarM1 != null ? jVarM1.getLayoutNode() : null;
        if (t.c(layoutNode, getLayoutNode())) {
            m2(newMFR);
            return;
        }
        if ((layoutNode != null ? layoutNode.i0() : null) != g.e.LayingOut) {
            if ((layoutNode != null ? layoutNode.i0() : null) != g.e.LookaheadLayingOut) {
                return;
            }
        }
        m2(newMFR);
    }

    protected final void R1(NodeCoordinator nodeCoordinator) {
        g4.a aVarI;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!t.c(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.b3().i().m();
            return;
        }
        g4.b bVarH = nodeCoordinator.b3().H();
        if (bVarH == null || (aVarI = bVarH.i()) == null) {
            return;
        }
        aVarI.m();
    }

    public final void V1(i2 ruler) {
        t0<i2, u0<u1<g>>> t0Var = B1(ruler).rulerReaders;
        u0<u1<g>> u0VarU = t0Var != null ? t0Var.u(ruler) : null;
        if (u0VarU != null) {
            Z1(u0VarU);
        }
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public final void a2(i2 ruler, float value) {
        r rVar = this.rulerValues;
        if (rVar == null) {
            rVar = new r();
            this.rulerValues = rVar;
        }
        rVar.e(ruler, value);
    }

    public abstract void h2();

    public abstract b0 m();

    public void m2(boolean z15) {
        this.isPlacedUnderMotionFrameOfReference = z15;
    }

    public abstract int p1(p036e4.a alignmentLine);

    public final void p2(boolean z15) {
        this.isPlacingForAlignment = z15;
    }

    public final void r2(boolean z15) {
        this.isShallowPlacing = z15;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x011b A[LOOP:2: B:57:0x00ee->B:67:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x011e A[EDGE_INSN: B:80:0x011e->B:68:0x011e BREAK  A[LOOP:2: B:57:0x00ee->B:67:0x011b], SYNTHETIC] */
    public final void y1(x0 result) {
        char c15;
        t0<i2, u0<u1<g>>> t0Var = this.rulerReaders;
        char c16 = 7;
        if (result == null) {
            if (t0Var != null) {
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
                                if ((j15 & 255) < 128) {
                                    Z1((u0) objArr[(i15 << 3) + i17]);
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
            }
            if (t0Var != null) {
                t0Var.k();
            }
            r rVar = this.rulerValues;
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        if (this.isPlacingForAlignment) {
            return;
        }
        er.l<k2, i0> lVarM = result.m();
        if (lVarM != null) {
            boolean z15 = this.rulersLambda != lVarM;
            long jA = c5.n.INSTANCE.a();
            long jA2 = c5.r.INSTANCE.a();
            if (!z15 && Q1().getCoordinatesAccessed()) {
                b0 b0VarM = m();
                jA = c5.o.d(c0.i(b0VarM));
                jA2 = b0VarM.b();
                z15 = (c5.n.h(jA, Q1().getPositionOnScreen()) && c5.r.e(jA2, Q1().getSize())) ? false : true;
            }
            long j16 = jA;
            long j17 = jA2;
            if (z15) {
                p pVar = this.cachedRulerPlaceableResult;
                if (pVar != null) {
                    pVar.c(result);
                } else {
                    pVar = new p(result, this);
                    this.cachedRulerPlaceableResult = pVar;
                }
                q1(pVar, j16, j17);
                this.rulersLambda = result.m();
                return;
            }
            return;
        }
        if (t0Var != null) {
            Object[] objArr2 = t0Var.values;
            long[] jArr2 = t0Var.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j18 = jArr2[i18];
                    if ((((~j18) << c16) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        int i25 = 0;
                        while (i25 < i19) {
                            if ((j18 & 255) < 128) {
                                Z1((u0) objArr2[(i18 << 3) + i25]);
                            }
                            j18 >>= 8;
                            i25++;
                            c16 = c16;
                        }
                        c15 = c16;
                        if (i19 != 8) {
                            break;
                        }
                    } else {
                        c15 = c16;
                    }
                    if (i18 == length2) {
                        break;
                    }
                    i18++;
                    c16 = c15;
                }
            }
            t0Var.k();
        }
    }
}
