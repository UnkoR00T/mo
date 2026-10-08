package cp1;

import androidx.p016lifecycle.t0;
import er.l;
import mu.a0;
import mu.h0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcp1/e;", "Landroidx/lifecycle/t0;", "Lcp1/d;", "", "Luy/a;", "accelerometerManager", "<init>", "(Luy/a;)V", "Loq/i0;", "d", "()V", "Lmu/g;", "", "b", "Lmu/g;", "w", "()Lmu/g;", "rotation", "Lmu/a0;", "Lcp1/a;", "c", "Lmu/a0;", "Z8", "()Lmu/a0;", "navEvent", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends t0 implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.g<Float> rotation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a0<cp1.a> navEvent = h0.b(0, 0, null, 7, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37241e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f37241e;
            if (i15 == 0) {
                u.b(obj);
                a0<cp1.a> a0VarZ8 = e.this.Z8();
                cp1.a.C0769a c0769a = cp1.a.C0769a.f37235a;
                this.f37241e = 1;
                if (a0VarZ8.F(c0769a, this) == objE) {
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
            return e.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public e(uy.a aVar) {
        this.rotation = aVar.w();
    }

    public a0<cp1.a> Z8() {
        return this.navEvent;
    }

    @Override // cp1.d
    public void d() {
        i00.a.a(this, new a(null));
    }

    @Override // cp1.d
    public mu.g<Float> w() {
        return this.rotation;
    }
}
