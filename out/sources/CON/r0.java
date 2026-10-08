package CON;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LCON/q0;", "Landroidx/lifecycle/q;", "owner", "", "enabled", "Lkotlin/Function1;", "LCON/m0;", "Loq/i0;", "onBackPressed", "a", "(LCON/q0;Landroidx/lifecycle/q;ZLer/l;)LCON/m0;", "activity"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"CON/r0$a", "LCON/m0;", "Loq/i0;", "d", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends m0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.l<m0, oq.i0> f219d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z15, er.l<? super m0, oq.i0> lVar) {
            super(z15);
            this.f219d = lVar;
        }

        @Override // CON.m0
        public void d() {
            this.f219d.b(this);
        }
    }

    public static final m0 a(q0 q0Var, androidx.p016lifecycle.q qVar, boolean z15, er.l<? super m0, oq.i0> lVar) {
        a aVar = new a(z15, lVar);
        if (qVar != null) {
            q0Var.f(qVar, aVar);
            return aVar;
        }
        q0Var.e(aVar);
        return aVar;
    }

    public static /* synthetic */ m0 b(q0 q0Var, androidx.p016lifecycle.q qVar, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            qVar = null;
        }
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return a(q0Var, qVar, z15, lVar);
    }
}
