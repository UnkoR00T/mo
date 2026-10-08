package s02;

import eo0.CentralTokens;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ls02/a;", "", "Lgz/b$a$a;", "Leo0/k$a;", "Lj02/b;", "dataSource", "Ls02/e;", "isCentralAccessTokenExpiredUC", "<init>", "(Lj02/b;Ls02/e;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lj02/b;", "b", "Ls02/e;", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f177054d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dx.b.Business f177055e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j02.b dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e isCentralAccessTokenExpiredUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f177061g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f177062h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f177063j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f177064k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f177065l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f177066m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f177067n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f177068p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f177070r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177068p = obj;
            this.f177070r |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    static {
        n02.a aVar = n02.a.REFRESH_TOKEN_EXPIRED;
        Label.Companion companion = Label.INSTANCE;
        f177055e = new dx.b.Business(aVar, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    public a(j02.b bVar, e eVar) {
        this.dataSource = bVar;
        this.isCentralAccessTokenExpiredUC = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010a A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:13:0x003d, B:44:0x0106, B:46:0x010a, B:47:0x0110, B:48:0x011d, B:53:0x012f, B:56:0x013d, B:37:0x00cd, B:40:0x00dd, B:49:0x011e, B:50:0x0123, B:51:0x0124, B:52:0x012e, B:33:0x0095), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0110 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:13:0x003d, B:44:0x0106, B:46:0x010a, B:47:0x0110, B:48:0x011d, B:53:0x012f, B:56:0x013d, B:37:0x00cd, B:40:0x00dd, B:49:0x011e, B:50:0x0123, B:51:0x0124, B:52:0x012e, B:33:0x0095), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, CentralTokens.Access>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b bVar2;
        gz.b.a.C1792a c1792a2;
        int i15;
        dx.j<dx.b> jVarA;
        ex.b bVar3;
        ex.b bVar4;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar5;
        CentralTokens.Access access;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f177070r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f177070r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objP = bVar.f177068p;
        Object objE = uq.b.e();
        ?? r15 = bVar.f177070r;
        try {
            try {
                if (r15 == 0) {
                    u.b(objP);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    e eVar2 = this.isCentralAccessTokenExpiredUC;
                    gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                    bVar.f177058d = vq.j.a(c1792a);
                    bVar.f177059e = jVarA;
                    bVar.f177060f = vq.j.a(aVar);
                    bVar.f177061g = aVar;
                    bVar.f177062h = aVar;
                    i15 = 0;
                    bVar.f177063j = 0;
                    bVar.f177064k = 0;
                    bVar.f177065l = 0;
                    bVar.f177066m = 0;
                    bVar.f177067n = 0;
                    bVar.f177070r = 1;
                    objP = eVar2.c(c1792a3, bVar);
                    if (objP != objE) {
                        c1792a2 = c1792a;
                        i19 = 0;
                        i18 = 0;
                        i17 = 0;
                        bVar2 = aVar;
                        bVar4 = bVar2;
                        bVar3 = bVar4;
                        i16 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = bVar.f177067n;
                        int i27 = bVar.f177066m;
                        int i28 = bVar.f177065l;
                        int i29 = bVar.f177064k;
                        int i35 = bVar.f177063j;
                        ex.b bVar6 = (ex.b) bVar.f177062h;
                        bVar2 = (ex.b) bVar.f177061g;
                        ex.b bVar7 = (ex.b) bVar.f177060f;
                        dx.j<dx.b> jVar = (dx.j) bVar.f177059e;
                        c1792a2 = (gz.b.a.C1792a) bVar.f177058d;
                        try {
                            u.b(objP);
                            i15 = i26;
                            jVarA = jVar;
                            bVar3 = bVar7;
                            bVar4 = bVar6;
                            i16 = i35;
                            i17 = i29;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar5 = (ex.b) bVar.f177061g;
                        u.b(objP);
                    }
                    access = (CentralTokens.Access) objP;
                    if (access != null) {
                        return new dx.i.Right(access);
                    }
                    bVar5.b(new dx.b.Generic(null, 1, null));
                    throw new oq.g();
                } catch (CancellationException e18) {
                    throw e18;
                }
                boolean zBooleanValue = ((Boolean) bVar4.a((dx.i) objP)).booleanValue();
                if (zBooleanValue) {
                    bVar2.b(f177055e);
                    throw new oq.g();
                }
                if (zBooleanValue) {
                    throw new p();
                }
                j02.b bVar8 = this.dataSource;
                bVar.f177058d = vq.j.a(c1792a2);
                bVar.f177059e = jVarA;
                bVar.f177060f = vq.j.a(bVar3);
                bVar.f177061g = bVar2;
                bVar.f177062h = null;
                bVar.f177063j = i16;
                bVar.f177064k = i17;
                bVar.f177065l = i18;
                bVar.f177066m = i19;
                bVar.f177067n = i15;
                bVar.f177070r = 2;
                objP = bVar8.P(bVar);
                if (objP != objE) {
                    bVar5 = bVar2;
                    access = (CentralTokens.Access) objP;
                    if (access != null) {
                        return new dx.i.Right(access);
                    }
                    bVar5.b(new dx.b.Generic(null, 1, null));
                    throw new oq.g();
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
