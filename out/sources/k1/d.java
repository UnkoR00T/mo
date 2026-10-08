package k1;

import er.q;
import f3.m;
import n4.l;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import w0.j1;
import w0.n1;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf3/m;", "", "selected", "Lb1/l;", "interactionSource", "Lw0/j1;", "indication", "enabled", "Ln4/l;", "role", "Lkotlin/Function0;", "Loq/i0;", "onClick", "a", "(Lf3/m;ZLb1/l;Lw0/j1;ZLn4/l;Ler/a;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements q<m, r, Integer, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1 f107256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f107257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f107258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f107259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.a f107260e;

        public a(j1 j1Var, boolean z15, boolean z16, l lVar, er.a aVar) {
            this.f107256a = j1Var;
            this.f107257b = z15;
            this.f107258c = z16;
            this.f107259d = lVar;
            this.f107260e = aVar;
        }

        public final m c(m mVar, r rVar, int i15) {
            rVar.X(-1525724089);
            if (t.k()) {
                t.o(-1525724089, i15, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = b1.k.a();
                rVar.v(objE);
            }
            b1.l lVar = (b1.l) objE;
            m mVarU = n1.e(m.INSTANCE, lVar, this.f107256a).u(new k1.a(this.f107257b, lVar, null, false, this.f107258c, this.f107259d, this.f107260e, null));
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return mVarU;
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ m w(m mVar, r rVar, Integer num) {
            return c(mVar, rVar, num.intValue());
        }
    }

    public static final m a(m mVar, boolean z15, b1.l lVar, j1 j1Var, boolean z16, l lVar2, er.a<i0> aVar) {
        m mVarU;
        if (j1Var instanceof r1) {
            mVarU = new k1.a(z15, lVar, (r1) j1Var, false, z16, lVar2, aVar, null);
        } else if (j1Var == null) {
            mVarU = new k1.a(z15, lVar, null, false, z16, lVar2, aVar, null);
        } else {
            mVarU = lVar != null ? n1.e(m.INSTANCE, lVar, j1Var).u(new k1.a(z15, lVar, null, false, z16, lVar2, aVar, null)) : f3.j.c(m.INSTANCE, null, new a(j1Var, z15, z16, lVar2, aVar), 1, null);
        }
        return mVar.u(mVarU);
    }

    public static /* synthetic */ m b(m mVar, boolean z15, b1.l lVar, j1 j1Var, boolean z16, l lVar2, er.a aVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z16 = true;
        }
        boolean z17 = z16;
        if ((i15 & 16) != 0) {
            lVar2 = null;
        }
        return a(mVar, z15, lVar, j1Var, z17, lVar2, aVar);
    }
}
