package mu;

import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmu/s0;", "Lnu/d;", "Lmu/q0;", "<init>", "()V", "flow", "", "d", "(Lmu/q0;)Z", "", "Ltq/e;", "Loq/i0;", "f", "(Lmu/q0;)[Ltq/e;", "g", "h", "()Z", "e", "(Ltq/e;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s0 extends p086nu.d<q0<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // p086nu.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(q0<?> flow) {
        if (ou.d.a(this._state) != null) {
            return false;
        }
        ou.d.b(this._state, r0.f128314a);
        return true;
    }

    public final Object e(tq.e<? super oq.i0> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        if (!androidx.camera.view.i.a(this._state, r0.f128314a, pVar)) {
            oq.t.Companion companion = oq.t.INSTANCE;
            pVar.i(oq.t.b(oq.i0.f148189a));
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : oq.i0.f148189a;
    }

    @Override // p086nu.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public tq.e<oq.i0>[] b(q0<?> flow) {
        ou.d.b(this._state, null);
        return p086nu.c.f138701a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objA = ou.d.a(atomicReference);
            if (objA == null || objA == r0.f128315b) {
                return;
            }
            if (objA == r0.f128314a) {
                if (androidx.camera.view.i.a(this._state, objA, r0.f128315b)) {
                    return;
                }
            } else if (androidx.camera.view.i.a(this._state, objA, r0.f128314a)) {
                oq.t.Companion companion = oq.t.INSTANCE;
                ((ju.p) objA).i(oq.t.b(oq.i0.f148189a));
                return;
            }
        }
    }

    public final boolean h() {
        return this._state.getAndSet(r0.f128314a) == r0.f128315b;
    }
}
