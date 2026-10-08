package kx3;

import dx.i;
import dx.j;
import fr.k;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkx3/d;", "", "Lgz/b$a$a;", "Li54/b$b;", "Lk54/d;", "getKeycloakCentralAccessTokenUC", "Lkx3/e;", "isCentralAccessTokenExpiredUC", "<init>", "(Lk54/d;Lkx3/e;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lk54/d;", "b", "Lkx3/e;", "c", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f113077c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f113078d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dx.b.Business f113079e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k54.d getKeycloakCentralAccessTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e isCentralAccessTokenExpiredUC;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkx3/d$a;", "", "<init>", "()V", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f113085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f113086h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f113087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f113088k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f113089l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f113090m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113091n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f113092p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f113094r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113092p = obj;
            this.f113094r |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    static {
        jx3.a aVar = jx3.a.REFRESH_TOKEN_EXPIRED;
        Label.Companion companion = Label.INSTANCE;
        f113079e = new dx.b.Business(aVar, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    public d(k54.d dVar, e eVar) {
        this.getKeycloakCentralAccessTokenUC = dVar;
        this.isCentralAccessTokenExpiredUC = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super i<? extends dx.b, i54.b.CentralAccess>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b bVar2;
        ex.b bVar3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f113094r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f113094r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f113092p;
        Object objE = uq.b.e();
        ?? r15 = bVar.f113094r;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    e eVar2 = this.isCentralAccessTokenExpiredUC;
                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                    bVar.f113082d = vq.j.a(c1792a);
                    bVar.f113083e = jVarA;
                    bVar.f113084f = vq.j.a(aVar);
                    bVar.f113085g = aVar;
                    bVar.f113086h = aVar;
                    bVar.f113087j = 0;
                    bVar.f113088k = 0;
                    bVar.f113089l = 0;
                    bVar.f113090m = 0;
                    bVar.f113091n = 0;
                    bVar.f113094r = 1;
                    Object objC = eVar2.c(c1792a2, bVar);
                    if (objC == objE) {
                        return objE;
                    }
                    bVar2 = aVar;
                    obj = objC;
                    bVar3 = bVar2;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar3 = (ex.b) bVar.f113086h;
                    bVar2 = (ex.b) bVar.f113085g;
                    try {
                        u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                boolean zBooleanValue = ((Boolean) bVar3.a((i) obj)).booleanValue();
                if (zBooleanValue) {
                    bVar2.b(f113079e);
                    throw new oq.g();
                }
                if (zBooleanValue) {
                    throw new p();
                }
                i54.b.CentralAccess centralAccessA = this.getKeycloakCentralAccessTokenUC.a(gz.b.a.C1792a.f78542a);
                if (centralAccessA != null) {
                    return new i.Right(centralAccessA);
                }
                bVar2.b(new dx.b.Generic(null, 1, null));
                throw new oq.g();
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                i iVarA = r15.a(e16);
                if (iVarA instanceof i.Left) {
                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                } else {
                    if (!(iVarA instanceof i.Right)) {
                        throw new p();
                    }
                    objB = ((i.Right) iVarA).b();
                }
                return new i.Left(objB);
            }
        } catch (ex.c e17) {
            return new i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
