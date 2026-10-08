package w24;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lw24/u1;", "Lk24/i;", "Ls24/a;", "containersErrorInteractor", "Lk24/g;", "getMainCertificateTypeUC", "<init>", "(Ls24/a;Lk24/g;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls24/a;", "b", "Lk24/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u1 implements k24.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s24.a containersErrorInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k24.g getMainCertificateTypeUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f209964h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f209965j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209966k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209967l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209968m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f209969n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209971q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209969n = obj;
            this.f209971q |= PKIFailureInfo.systemUnavail;
            return u1.this.c(null, this);
        }
    }

    public u1(s24.a aVar, k24.g gVar) {
        this.containersErrorInteractor = aVar;
        this.getMainCertificateTypeUC = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:13:0x003d, B:44:0x00fd, B:47:0x0109, B:48:0x0113, B:49:0x0125, B:50:0x0126, B:53:0x0134, B:37:0x00c9, B:40:0x00d2, B:33:0x0091), top: B:69:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        a aVar;
        Object objB;
        gz.b.a.C1792a c1792a2;
        int i15;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b aVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar2;
        f24.c cVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f209971q;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209971q = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f209969n;
        Object objE = uq.b.e();
        ?? r15 = aVar.f209971q;
        boolean z15 = true;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    k24.g gVar = this.getMainCertificateTypeUC;
                    k24.g.Params params = new k24.g.Params(false, 1, null);
                    aVar.f209960d = vq.j.a(c1792a);
                    aVar.f209961e = jVarA;
                    aVar.f209962f = vq.j.a(aVar2);
                    aVar.f209963g = aVar2;
                    aVar.f209964h = 0;
                    aVar.f209965j = 0;
                    aVar.f209966k = 0;
                    aVar.f209967l = 0;
                    aVar.f209968m = 0;
                    aVar.f209971q = 1;
                    objC = gVar.c(params, aVar);
                    if (objC != objE) {
                        c1792a2 = c1792a;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        i17 = 0;
                        i16 = 0;
                        bVar = aVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f209968m;
                        int i27 = aVar.f209967l;
                        int i28 = aVar.f209966k;
                        int i29 = aVar.f209965j;
                        int i35 = aVar.f209964h;
                        ex.b bVar3 = (ex.b) aVar.f209963g;
                        ex.b bVar4 = (ex.b) aVar.f209962f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f209961e;
                        c1792a2 = (gz.b.a.C1792a) aVar.f209960d;
                        try {
                            oq.u.b(objC);
                            i15 = i26;
                            jVarA = jVar;
                            bVar = bVar4;
                            aVar2 = bVar3;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) aVar.f209963g;
                        oq.u.b(objC);
                    }
                    cVar = (f24.c) ((dx.i) objC).a();
                    if (cVar != null) {
                        z15 = false;
                        return new dx.i.Right(vq.b.a(z15));
                    }
                    bVar2.b(s24.a.c(this.containersErrorInteractor, cVar, false, false, 6, null));
                    throw new oq.g();
                } catch (CancellationException e18) {
                    throw e18;
                }
                if (((dx.i) objC).a() == null) {
                    k24.g gVar2 = this.getMainCertificateTypeUC;
                    k24.g.Params params2 = new k24.g.Params(false);
                    aVar.f209960d = vq.j.a(c1792a2);
                    aVar.f209961e = jVarA;
                    aVar.f209962f = vq.j.a(bVar);
                    aVar.f209963g = aVar2;
                    aVar.f209964h = i16;
                    aVar.f209965j = i17;
                    aVar.f209966k = i18;
                    aVar.f209967l = i19;
                    aVar.f209968m = i15;
                    aVar.f209971q = 2;
                    objC = gVar2.c(params2, aVar);
                    if (objC != objE) {
                        bVar2 = aVar2;
                        cVar = (f24.c) ((dx.i) objC).a();
                        if (cVar != null) {
                            bVar2.b(s24.a.c(this.containersErrorInteractor, cVar, false, false, 6, null));
                            throw new oq.g();
                        }
                        z15 = false;
                    }
                    return objE;
                }
                return new dx.i.Right(vq.b.a(z15));
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
