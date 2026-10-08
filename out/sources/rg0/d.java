package rg0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import eg0.p;
import fr.t;
import iy.b0;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ju.j;
import ju.p0;
import oq.i0;
import oq.u;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import vq.k;
import xy.AccessToken;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R.\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lrg0/d;", "Lwy/b;", "Leg0/p;", "isUserCertActiveUC", "Lqg0/b;", "checkActivationStateUC", "Laq/a;", "Lwy/d;", "sessionTokenLoader", "Lez/a;", "currentTimeProvider", "<init>", "(Leg0/p;Lqg0/b;Laq/a;Lez/a;)V", "Loq/i0;", "R", "()V", "clear", "", "serviceIssuer", "Lxy/a;", "token", "h0", "(Ljava/lang/String;Lxy/a;)V", "", "J", "(Ljava/lang/String;)Z", "Liy/b0;", "a0", "(Ljava/lang/String;)Liy/b0;", "Lwy/e;", "refreshTokenLoader", "Ldx/i;", "Ldx/b;", "I", "(Lwy/e;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "Leg0/p;", "b", "Lqg0/b;", "c", "Laq/a;", "d", "Lez/a;", "", "e", "Ljava/util/Map;", i.f37094u, "()Ljava/util/Map;", "m0", "(Ljava/util/Map;)V", "sessionToken", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements wy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p isUserCertActiveUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qg0.b checkActivationStateUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aq.a<wy.d> sessionTokenLoader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile Map<String, AccessToken> sessionToken = v0.i();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements er.p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173741e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173741e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = d.this.isUserCertActiveUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f173741e = 1;
                obj = pVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return vq.b.a(false);
            }
            if (iVar instanceof dx.i.Right) {
                return ((dx.i.Right) iVar).b();
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return d.this.new a(eVar);
        }
    }

    public d(p pVar, qg0.b bVar, aq.a<wy.d> aVar, ez.a aVar2) {
        this.isUserCertActiveUC = pVar;
        this.checkActivationStateUC = bVar;
        this.sessionTokenLoader = aVar;
        this.currentTimeProvider = aVar2;
    }

    @Override // wy.b
    public Object I(wy.e eVar, String str, tq.e<? super dx.i<? extends dx.b, AccessToken>> eVar2) {
        return this.sessionTokenLoader.get().a(eVar2);
    }

    @Override // wy.b
    public boolean J(String serviceIssuer) {
        return t.c(this.checkActivationStateUC.a(gz.b.a.C1792a.f78542a), qg0.b.a.C4172a.f166360a) && ((Boolean) j.b(null, new a(null), 1, null)).booleanValue();
    }

    @Override // wy.b
    public Map<String, AccessToken> L() {
        return this.sessionToken;
    }

    @Override // wy.b
    public void R() {
        m0(v0.i());
    }

    @Override // wy.b
    public b0 a0(String serviceIssuer) {
        AccessToken accessToken = L().get(serviceIssuer);
        if (accessToken != null) {
            if (this.currentTimeProvider.a() - accessToken.getTimestamp() > TimeUnit.SECONDS.toMillis(accessToken.getValidityInSeconds())) {
                accessToken = null;
            }
            if (accessToken != null) {
                return accessToken.getToken();
            }
        }
        return null;
    }

    @Override // wy.c
    public void clear() {
        R();
    }

    @Override // wy.b
    public void h0(String serviceIssuer, AccessToken token) {
        m0(v0.p(L(), y.a(serviceIssuer, token)));
    }

    public void m0(Map<String, AccessToken> map) {
        this.sessionToken = map;
    }
}
