package p00;

import er.p;
import fr.t;
import fu.r;
import fv.d0;
import fv.w;
import iy.b0;
import iy.c0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.j;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;
import xy.AccessToken;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp00/b;", "Lfv/w;", "Lwy/b;", "networkSessionManager", "Lp00/f;", "interceptorsConfig", "<init>", "(Lwy/b;Lp00/f;)V", "Liy/b0;", "sessionToken", "Lfv/b0;", "request", "e", "(Liy/b0;Lfv/b0;)Lfv/b0;", "c", "(Liy/b0;)Liy/b0;", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "Lwy/b;", "b", "Lp00/f;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f interceptorsConfig;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lxy/a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends AccessToken>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150843e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150843e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wy.b bVar = b.this.networkSessionManager;
            this.f150843e = 1;
            Object objN = wy.b.N(bVar, null, null, this, 2, null);
            return objN == objE ? objE : objN;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, AccessToken>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new a(eVar);
        }
    }

    public b(wy.b bVar, f fVar) {
        this.networkSessionManager = bVar;
        this.interceptorsConfig = fVar;
    }

    private final synchronized b0 c(b0 sessionToken) {
        b0 b0VarQ;
        b0VarQ = wy.b.q(this.networkSessionManager, null, 1, null);
        if (t.c(b0VarQ, sessionToken)) {
            dx.i iVar = (dx.i) j.b(null, new a(null), 1, null);
            if (iVar instanceof dx.i.Left) {
                throw new o00.a((dx.b) ((dx.i.Left) iVar).b());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            b0VarQ = ((AccessToken) ((dx.i.Right) iVar).b()).getToken();
        }
        return b0VarQ;
    }

    static /* synthetic */ b0 d(b bVar, b0 b0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = null;
        }
        return bVar.c(b0Var);
    }

    private final fv.b0 e(b0 sessionToken, fv.b0 request) {
        if (sessionToken != null) {
            fv.b0 b0VarB = request.i().d("Authorization", "Bearer " + c0.e(sessionToken)).b();
            if (b0VarB != null) {
                return b0VarB;
            }
        }
        return request;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    @Override // fv.w
    public d0 a(w.a chain) {
        fv.b0 b0VarE;
        b0 b0VarD;
        fv.b0 b0VarC = chain.getRequest();
        String strD = b0VarC.getUrl().d();
        b0 b0VarQ = wy.b.q(this.networkSessionManager, null, 1, null);
        px.f.f163100a.b(String.valueOf(b0VarC), px.c.a(this));
        List<String> listN = this.interceptorsConfig.n();
        if (!(listN instanceof Collection) || !listN.isEmpty()) {
            Iterator<T> it = listN.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (r.d0(strD, (String) it.next(), false, 2, null)) {
                    }
                } else if (wy.b.s(this.networkSessionManager, null, 1, null)) {
                    if (b0VarQ == null) {
                        b0VarD = d(this, null, 1, null);
                    } else {
                        b0VarD = b0VarQ;
                    }
                    b0VarE = e(b0VarD, b0VarC);
                }
                b0VarE = b0VarC;
            }
        } else if (wy.b.s(this.networkSessionManager, null, 1, null)) {
            if (b0VarQ == null) {
                b0VarD = d(this, null, 1, null);
            } else {
                b0VarD = b0VarQ;
            }
            b0VarE = e(b0VarD, b0VarC);
        } else {
            b0VarE = b0VarC;
        }
        d0 d0VarA = chain.a(b0VarE);
        if (d0VarA.getCode() == dx.b.g.Http.a.UNAUTHORIZED.getCode()) {
            List<String> listN2 = this.interceptorsConfig.n();
            if (!(listN2 instanceof Collection) || !listN2.isEmpty()) {
                Iterator<T> it4 = listN2.iterator();
                while (it4.hasNext()) {
                    if (r.d0(strD, (String) it4.next(), false, 2, null)) {
                        return d0VarA;
                    }
                }
            }
            if (wy.b.s(this.networkSessionManager, null, 1, null)) {
                return chain.a(e(c(b0VarQ), b0VarC));
            }
        }
        return d0VarA;
    }
}
