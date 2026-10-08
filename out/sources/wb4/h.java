package wb4;

import dx.j;
import fr.t;
import iy.a0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwb4/h;", "Lqb4/h;", "Lub4/a;", "biometricUserInteractor", "Lqb4/b;", "authenticateWithBiometricUseCase", "Lqb4/g;", "getBiometricStatusUseCase", "Lwy/a;", "masterKeyProvider", "<init>", "(Lub4/a;Lqb4/b;Lqb4/g;Lwy/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lpb4/a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lub4/a;", "b", "Lqb4/b;", "c", "Lqb4/g;", "d", "Lwy/a;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements qb4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ub4.a biometricUserInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qb4.b authenticateWithBiometricUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qb4.g getBiometricStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212019g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f212020h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f212021j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f212022k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f212023l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f212024m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f212025n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f212026p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f212027q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f212028r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f212030t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212028r = obj;
            this.f212030t |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(ub4.a aVar, qb4.b bVar, qb4.g gVar, wy.a aVar2) {
        this.biometricUserInteractor = aVar;
        this.authenticateWithBiometricUseCase = bVar;
        this.getBiometricStatusUseCase = gVar;
        this.masterKeyProvider = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0111 A[Catch: Exception -> 0x004c, c -> 0x0050, CancellationException -> 0x0054, TryCatch #3 {Exception -> 0x004c, blocks: (B:14:0x0047, B:40:0x0105, B:42:0x0111, B:44:0x0119, B:46:0x0121, B:48:0x0133, B:49:0x0138, B:56:0x0145, B:59:0x0154), top: B:87:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0119 A[Catch: Exception -> 0x004c, c -> 0x0050, CancellationException -> 0x0054, TryCatch #3 {Exception -> 0x004c, blocks: (B:14:0x0047, B:40:0x0105, B:42:0x0111, B:44:0x0119, B:46:0x0121, B:48:0x0133, B:49:0x0138, B:56:0x0145, B:59:0x0154), top: B:87:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0121 A[Catch: Exception -> 0x004c, c -> 0x0050, CancellationException -> 0x0054, TryCatch #3 {Exception -> 0x004c, blocks: (B:14:0x0047, B:40:0x0105, B:42:0x0111, B:44:0x0119, B:46:0x0121, B:48:0x0133, B:49:0x0138, B:56:0x0145, B:59:0x0154), top: B:87:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0133 A[Catch: Exception -> 0x004c, c -> 0x0050, CancellationException -> 0x0054, TryCatch #3 {Exception -> 0x004c, blocks: (B:14:0x0047, B:40:0x0105, B:42:0x0111, B:44:0x0119, B:46:0x0121, B:48:0x0133, B:49:0x0138, B:56:0x0145, B:59:0x0154), top: B:87:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends pb4.a>> eVar) throws Throwable {
        a aVar;
        Exception exc;
        ?? r15;
        Object objB;
        Object objA;
        gz.b.a.C1792a c1792a2;
        a0 a0Var;
        pb4.a aVar2;
        j<dx.b> jVarA;
        ex.c cVar;
        ex.a aVar3;
        Object objC;
        pb4.a aVar4;
        ex.b bVar;
        pb4.e eVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f212030t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f212030t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC2 = aVar.f212028r;
        Object objE = uq.b.e();
        int i16 = aVar.f212030t;
        try {
            try {
                if (i16 == 0) {
                    u.b(objC2);
                    ub4.a aVar5 = this.biometricUserInteractor;
                    aVar.f212016d = vq.j.a(c1792a);
                    aVar.f212030t = 1;
                    objA = aVar5.a(aVar);
                    if (objA != objE) {
                    }
                    return objE;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) aVar.f212022k;
                        aVar4 = (pb4.a) aVar.f212018f;
                        try {
                            u.b(objC2);
                            eVar2 = (pb4.e) bVar.a((dx.i) objC2);
                            if (eVar2 instanceof pb4.e.a) {
                                return new dx.i.Left(dx.b.InterfaceC1027b.a.c.f45024a);
                            }
                            if (!t.c(eVar2, pb4.e.b.f154093a)) {
                                throw new p();
                            }
                            this.masterKeyProvider.b(((pb4.a.AuthenticationSucceed) aVar4).getResultData());
                            return new dx.i.Right(aVar4);
                        } catch (ex.c e15) {
                            cVar = e15;
                            return new dx.i.Left((dx.b) ex.d.a(cVar));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    a0Var = (a0) aVar.f212017e;
                    c1792a2 = (gz.b.a.C1792a) aVar.f212016d;
                    u.b(objC2);
                    aVar2 = (pb4.a) objC2;
                    if (aVar2 instanceof pb4.a.AuthenticationSucceed) {
                        if (!t.c(aVar2, pb4.a.C3814a.f154078a) || t.c(aVar2, pb4.a.d.f154081a)) {
                            return new dx.i.Right(aVar2);
                        }
                        if (aVar2 instanceof pb4.a.Error) {
                            return new dx.i.Left(((pb4.a.Error) aVar2).getErrorType());
                        }
                        throw new p();
                    }
                    jVarA = xw.c.f221622a.a();
                    try {
                        aVar3 = new ex.a();
                        qb4.g gVar = this.getBiometricStatusUseCase;
                        qb4.g.Params params = new qb4.g.Params(false);
                        aVar.f212016d = vq.j.a(c1792a2);
                        aVar.f212017e = vq.j.a(a0Var);
                        aVar.f212018f = aVar2;
                        aVar.f212019g = jVarA;
                        aVar.f212020h = vq.j.a(aVar3);
                        aVar.f212021j = vq.j.a(aVar3);
                        aVar.f212022k = aVar3;
                        aVar.f212023l = 0;
                        aVar.f212024m = 0;
                        aVar.f212025n = 0;
                        aVar.f212026p = 0;
                        aVar.f212027q = 0;
                        aVar.f212030t = 3;
                        objC = gVar.c(params, aVar);
                        if (objC != objE) {
                            aVar4 = aVar2;
                            objC2 = objC;
                            bVar = aVar3;
                            eVar2 = (pb4.e) bVar.a((dx.i) objC2);
                            if (eVar2 instanceof pb4.e.a) {
                                return new dx.i.Left(dx.b.InterfaceC1027b.a.c.f45024a);
                            }
                            if (!t.c(eVar2, pb4.e.b.f154093a)) {
                                throw new p();
                            }
                            this.masterKeyProvider.b(((pb4.a.AuthenticationSucceed) aVar4).getResultData());
                            return new dx.i.Right(aVar4);
                        }
                        return objE;
                    } catch (ex.c e17) {
                        cVar = e17;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        exc = e19;
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        dx.i iVarA = r15.a(exc);
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
                }
                c1792a = (gz.b.a.C1792a) aVar.f212016d;
                u.b(objC2);
                objA = ((qy.b) objC2).getValue();
                a0 a0Var2 = (a0) objA;
                qb4.b bVar2 = this.authenticateWithBiometricUseCase;
                qb4.b.AbstractC4144b.Decrypt decrypt = new qb4.b.AbstractC4144b.Decrypt(a0Var2, qb4.b.a.LOGIN, null, null, null, 28, null);
                aVar.f212016d = vq.j.a(c1792a);
                aVar.f212017e = vq.j.a(a0Var2);
                aVar.f212030t = 2;
                objC2 = bVar2.c(decrypt, aVar);
                if (objC2 != objE) {
                    c1792a2 = c1792a;
                    a0Var = a0Var2;
                    aVar2 = (pb4.a) objC2;
                    if (aVar2 instanceof pb4.a.AuthenticationSucceed) {
                        if (t.c(aVar2, pb4.a.C3814a.f154078a)) {
                        }
                        return new dx.i.Right(aVar2);
                    }
                    jVarA = xw.c.f221622a.a();
                    aVar3 = new ex.a();
                    qb4.g gVar2 = this.getBiometricStatusUseCase;
                    qb4.g.Params params2 = new qb4.g.Params(false);
                    aVar.f212016d = vq.j.a(c1792a2);
                    aVar.f212017e = vq.j.a(a0Var);
                    aVar.f212018f = aVar2;
                    aVar.f212019g = jVarA;
                    aVar.f212020h = vq.j.a(aVar3);
                    aVar.f212021j = vq.j.a(aVar3);
                    aVar.f212022k = aVar3;
                    aVar.f212023l = 0;
                    aVar.f212024m = 0;
                    aVar.f212025n = 0;
                    aVar.f212026p = 0;
                    aVar.f212027q = 0;
                    aVar.f212030t = 3;
                    objC = gVar2.c(params2, aVar);
                    if (objC != objE) {
                        aVar4 = aVar2;
                        objC2 = objC;
                        bVar = aVar3;
                        eVar2 = (pb4.e) bVar.a((dx.i) objC2);
                        if (eVar2 instanceof pb4.e.a) {
                            return new dx.i.Left(dx.b.InterfaceC1027b.a.c.f45024a);
                        }
                        if (!t.c(eVar2, pb4.e.b.f154093a)) {
                            throw new p();
                        }
                        this.masterKeyProvider.b(((pb4.a.AuthenticationSucceed) aVar4).getResultData());
                        return new dx.i.Right(aVar4);
                    }
                }
                return objE;
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            exc = e26;
            r15 = objE;
        }
    }
}
