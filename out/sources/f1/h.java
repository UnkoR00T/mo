package f1;

import n4.CollectionInfo;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p056h1.t1;
import p056h1.u1;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.x5;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf1/y0;", "state", "", "isVertical", "Lh1/t1;", "a", "(Lf1/y0;Z)Lh1/t1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u0018"}, d2 = {"f1/h$a", "Lh1/t1;", "", "index", "Loq/i0;", "f", "(ILtq/e;)Ljava/lang/Object;", "Ln4/d;", "c", "()Ln4/d;", "a", "Lm2/f6;", "h", "()I", "totalItemsCount", "", "e", "()F", "scrollOffset", "b", "maxScrollOffset", "d", "viewport", "contentPadding", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f6 totalItemsCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f54778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f54779c;

        a(final y0 y0Var, boolean z15) {
            this.f54778b = y0Var;
            this.f54779c = z15;
            this.totalItemsCount = x5.d(new er.a() { // from class: f1.g
                @Override // er.a
                public final Object a() {
                    return Integer.valueOf(h.a.i(y0Var));
                }
            });
        }

        private final int h() {
            return ((Number) this.totalItemsCount.getValue()).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(y0 y0Var) {
            return y0Var.C().getTotalItemsCount();
        }

        @Override // p056h1.t1
        public int a() {
            return this.f54778b.C().f() + this.f54778b.C().getAfterContentPadding();
        }

        @Override // p056h1.t1
        public float b() {
            return u1.a(this.f54778b.x(), this.f54778b.y(), this.f54778b.e());
        }

        @Override // p056h1.t1
        public CollectionInfo c() {
            return this.f54779c ? new CollectionInfo(h(), 1) : new CollectionInfo(1, h());
        }

        @Override // p056h1.t1
        public int d() {
            return (int) (this.f54778b.C().getOrientation() == a2.Vertical ? this.f54778b.C().b() & BodyPartID.bodyIdMax : this.f54778b.C().b() >> 32);
        }

        @Override // p056h1.t1
        public float e() {
            return u1.b(this.f54778b.x(), this.f54778b.y());
        }

        @Override // p056h1.t1
        public Object f(int i15, tq.e<? super oq.i0> eVar) {
            Object objR = y0.R(this.f54778b, i15, 0, eVar, 2, null);
            return objR == uq.b.e() ? objR : oq.i0.f148189a;
        }
    }

    public static final t1 a(y0 y0Var, boolean z15) {
        return new a(y0Var, z15);
    }
}
