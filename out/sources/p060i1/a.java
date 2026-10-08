package p060i1;

import c5.y;
import java.util.concurrent.CancellationException;
import lr.m;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p143z0.a2;
import tq.e;
import w0.g0;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Li1/a;", "Lz3/a;", "Li1/i1;", "state", "Lz0/a2;", "orientation", "<init>", "(Li1/i1;Lz0/a2;)V", "Lm3/e;", "", "c", "(J)F", "b", "Lc5/y;", "a", "(JLz0/a2;)J", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "W0", "(JJLtq/e;)Ljava/lang/Object;", "Li1/i1;", "getState", "()Li1/i1;", "Lz0/a2;", "getOrientation", "()Lz0/a2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a implements z3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i1 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    public a(i1 i1Var, a2 a2Var) {
        this.state = i1Var;
        this.orientation = a2Var;
    }

    private final float b(long j15) {
        return Float.intBitsToFloat((int) (this.orientation == a2.Horizontal ? j15 >> 32 : j15 & BodyPartID.bodyIdMax));
    }

    private final float c(long j15) {
        return Float.intBitsToFloat((int) (this.orientation == a2.Horizontal ? j15 >> 32 : j15 & BodyPartID.bodyIdMax));
    }

    @Override // z3.a
    public Object W0(long j15, long j16, e<? super y> eVar) {
        return y.b(a(j16, this.orientation));
    }

    public final long a(long j15, a2 a2Var) {
        return a2Var == a2.Vertical ? y.e(j15, 0.0f, 0.0f, 2, null) : y.e(j15, 0.0f, 0.0f, 1, null);
    }

    @Override // z3.a
    public long d1(long consumed, long available, int source) {
        if (!g.d(source, g.INSTANCE.a()) || b(available) == 0.0f) {
            return m3.e.INSTANCE.c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // z3.a
    public long h2(long available, int source) {
        if (!g.d(source, g.INSTANCE.b()) || Math.abs(this.state.B()) <= 1.0E-6d || Math.abs(c(available)) <= 0.0f) {
            return m3.e.INSTANCE.c();
        }
        g0 g0VarI = this.state.I();
        float fB = this.state.B() * this.state.O();
        float pageSize = ((g0VarI.getPageSize() + g0VarI.getPageSpacing()) * (-Math.signum(this.state.B()))) + fB;
        if (this.state.B() > 0.0f) {
            pageSize = fB;
            fB = pageSize;
        }
        float fM = m.m(c(available), fB, pageSize);
        a2 a2Var = this.orientation;
        a2 a2Var2 = a2.Horizontal;
        float f15 = (a2Var == a2Var2 && g0VarI.getReverseLayout() && g0.isReverseLayoutNestedScrollConnectionInPagerFixEnabled) ? this.state.f(fM) : -this.state.f(-fM);
        float fIntBitsToFloat = this.orientation == a2Var2 ? f15 : Float.intBitsToFloat((int) (available >> 32));
        if (this.orientation != a2.Vertical) {
            f15 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & available));
        }
        return m3.e.f(available, fIntBitsToFloat, f15);
    }
}
