package xo1;

import androidx.p016lifecycle.t0;
import er.l;
import mu.a0;
import mu.h0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lxo1/g;", "Landroidx/lifecycle/t0;", "Lxo1/f;", "", "Luy/a;", "accelerometerManager", "<init>", "(Luy/a;)V", "Loq/i0;", "d", "()V", "Lmu/g;", "", "b", "Lmu/g;", "w", "()Lmu/g;", "rotation", "Lmu/a0;", "Lxo1/a;", "c", "Lmu/a0;", "Z8", "()Lmu/a0;", "navEvent", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends t0 implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.g<Float> rotation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a0<xo1.a> navEvent = h0.b(0, 0, null, 7, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220198e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220198e;
            if (i15 == 0) {
                u.b(obj);
                a0<xo1.a> a0VarZ8 = g.this.Z8();
                xo1.a.C5881a c5881a = xo1.a.C5881a.f220188a;
                this.f220198e = 1;
                if (a0VarZ8.F(c5881a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public g(uy.a aVar) {
        this.rotation = aVar.w();
    }

    public a0<xo1.a> Z8() {
        return this.navEvent;
    }

    @Override // xo1.f
    public void d() {
        i00.a.a(this, new a(null));
    }

    @Override // xo1.f
    public mu.g<Float> w() {
        return this.rotation;
    }
}
