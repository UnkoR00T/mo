package p036e4;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.k;
import c5.n;
import c5.o;
import c5.r;
import d4.a;
import m3.e;
import m3.g;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b#\u0010+R\u0014\u0010/\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0016\u00102\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00107\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006:"}, d2 = {"Le4/q0;", "Le4/b0;", "Landroidx/compose/ui/node/k;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/k;)V", "Lm3/e;", "relativeToScreen", "h", "(J)J", "relativeToLocal", "k", "relativeToWindow", "K", "W", "A0", "sourceCoordinates", "relativeToSource", "r", "(Le4/b0;J)J", "", "includeMotionFrameOfReference", "Q", "(Le4/b0;JZ)J", "clipBounds", "Lm3/g;", "Y", "(Le4/b0;Z)Lm3/g;", "Ln3/g2;", "matrix", "Loq/i0;", "w0", "(Le4/b0;[F)V", "d0", "([F)V", "a", "Landroidx/compose/ui/node/k;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/k;", "d", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lc5/r;", "b", "size", "r0", "()Le4/b0;", "parentLayoutCoordinates", "G", "parentCoordinates", "c", "()Z", "isAttached", "E", "introducesMotionFrameOfReference", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k lookaheadDelegate;

    public q0(k kVar) {
        this.lookaheadDelegate = kVar;
    }

    private final long d() {
        k kVarA = r0.a(this.lookaheadDelegate);
        b0 b0VarM = kVarA.m();
        e.Companion companion = e.INSTANCE;
        return e.p(r(b0VarM, companion.c()), a().r(kVarA.getCoordinator(), companion.c()));
    }

    @Override // p036e4.b0
    public long A0(long relativeToLocal) {
        return a().A0(e.q(relativeToLocal, d()));
    }

    @Override // p036e4.b0
    public boolean E() {
        return this.lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference();
    }

    @Override // p036e4.b0
    public b0 G() {
        k kVarJ3;
        if (!c()) {
            a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = a().getWrappedBy();
        if (wrappedBy == null || (kVarJ3 = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return kVarJ3.m();
    }

    @Override // p036e4.b0
    public long K(long relativeToWindow) {
        return e.q(a().K(relativeToWindow), d());
    }

    @Override // p036e4.b0
    public long Q(b0 sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof q0)) {
            k kVarA = r0.a(this.lookaheadDelegate);
            long jQ = Q(kVarA.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference);
            long position = kVarA.getPosition();
            float fI = n.i(position);
            long jP = e.p(jQ, e.e((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(n.j(position)))) | (Float.floatToRawIntBits(fI) << 32)));
            b0 b0VarG = kVarA.getCoordinator().G();
            if (b0VarG == null) {
                b0VarG = kVarA.getCoordinator().m();
            }
            return e.q(jP, b0VarG.Q(sourceCoordinates, e.INSTANCE.c(), includeMotionFrameOfReference));
        }
        k kVar = ((q0) sourceCoordinates).lookaheadDelegate;
        kVar.getCoordinator().E3();
        k kVarJ3 = a().X2(kVar.getCoordinator()).getLookaheadDelegate();
        if (kVarJ3 != null) {
            long jL = n.l(n.m(kVar.M2(kVarJ3, !includeMotionFrameOfReference), o.d(relativeToSource)), this.lookaheadDelegate.M2(kVarJ3, !includeMotionFrameOfReference));
            return e.e((((long) Float.floatToRawIntBits(n.i(jL))) << 32) | (((long) Float.floatToRawIntBits(n.j(jL))) & BodyPartID.bodyIdMax));
        }
        k kVarA2 = r0.a(kVar);
        long jM = n.m(n.m(kVar.M2(kVarA2, !includeMotionFrameOfReference), kVarA2.getPosition()), o.d(relativeToSource));
        k kVarA3 = r0.a(this.lookaheadDelegate);
        long jL2 = n.l(jM, n.m(this.lookaheadDelegate.M2(kVarA3, !includeMotionFrameOfReference), kVarA3.getPosition()));
        float fI2 = n.i(jL2);
        return kVarA3.getCoordinator().getWrappedBy().Q(kVarA2.getCoordinator().getWrappedBy(), e.e((((long) Float.floatToRawIntBits(n.j(jL2))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fI2) << 32)), includeMotionFrameOfReference);
    }

    @Override // p036e4.b0
    public long W(long relativeToLocal) {
        return a().W(e.q(relativeToLocal, d()));
    }

    @Override // p036e4.b0
    public g Y(b0 sourceCoordinates, boolean clipBounds) {
        return a().Y(sourceCoordinates, clipBounds);
    }

    public final NodeCoordinator a() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // p036e4.b0
    public long b() {
        k kVar = this.lookaheadDelegate;
        return r.c((((long) kVar.getWidth()) << 32) | (((long) kVar.getHeight()) & BodyPartID.bodyIdMax));
    }

    @Override // p036e4.b0
    public boolean c() {
        return a().c();
    }

    @Override // p036e4.b0
    public void d0(float[] matrix) {
        a().d0(matrix);
    }

    @Override // p036e4.b0
    public long h(long relativeToScreen) {
        return e.q(a().h(relativeToScreen), d());
    }

    @Override // p036e4.b0
    public long k(long relativeToLocal) {
        return a().k(e.q(relativeToLocal, d()));
    }

    @Override // p036e4.b0
    public long r(b0 sourceCoordinates, long relativeToSource) {
        return Q(sourceCoordinates, relativeToSource, true);
    }

    @Override // p036e4.b0
    public b0 r0() {
        k kVarJ3;
        if (!c()) {
            a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = a().getLayoutNode().y0().getWrappedBy();
        if (wrappedBy == null || (kVarJ3 = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return kVarJ3.m();
    }

    @Override // p036e4.b0
    public void w0(b0 sourceCoordinates, float[] matrix) {
        a().w0(sourceCoordinates, matrix);
    }
}
