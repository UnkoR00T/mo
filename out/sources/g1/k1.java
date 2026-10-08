package g1;

import n4.CollectionInfo;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p056h1.t1;
import p056h1.u1;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg1/e1;", "state", "", "reverseScrolling", "Lh1/t1;", "a", "(Lg1/e1;ZLm2/r;I)Lh1/t1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k1 {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"g1/k1$a", "Lh1/t1;", "", "index", "Loq/i0;", "f", "(ILtq/e;)Ljava/lang/Object;", "Ln4/d;", "c", "()Ln4/d;", "", "e", "()F", "scrollOffset", "b", "maxScrollOffset", "d", "()I", "viewport", "a", "contentPadding", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1 f69373a;

        a(e1 e1Var) {
            this.f69373a = e1Var;
        }

        @Override // p056h1.t1
        public int a() {
            return this.f69373a.A().f() + this.f69373a.A().getAfterContentPadding();
        }

        @Override // p056h1.t1
        public float b() {
            return u1.a(this.f69373a.v(), this.f69373a.w(), this.f69373a.e());
        }

        @Override // p056h1.t1
        public CollectionInfo c() {
            return new CollectionInfo(-1, -1);
        }

        @Override // p056h1.t1
        public int d() {
            return (int) (this.f69373a.A().getOrientation() == a2.Vertical ? this.f69373a.A().b() & BodyPartID.bodyIdMax : this.f69373a.A().b() >> 32);
        }

        @Override // p056h1.t1
        public float e() {
            return u1.b(this.f69373a.v(), this.f69373a.w());
        }

        @Override // p056h1.t1
        public Object f(int i15, tq.e<? super oq.i0> eVar) {
            Object objO = e1.O(this.f69373a, i15, 0, eVar, 2, null);
            return objO == uq.b.e() ? objO : oq.i0.f148189a;
        }
    }

    public static final t1 a(e1 e1Var, boolean z15, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1247008005, i15, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z16 = ((((i15 & 14) ^ 6) > 4 && rVar.W(e1Var)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.a(z15)) || (i15 & 48) == 32);
        Object objE = rVar.E();
        if (z16 || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(e1Var);
            rVar.v(objE);
        }
        a aVar = (a) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return aVar;
    }
}
