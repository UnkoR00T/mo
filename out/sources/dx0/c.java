package dx0;

import iy.b0;
import java.security.KeyPair;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldx0/c;", "Ldx0/b;", "La14/k;", "generateRsaKeyPairUseCase", "Lpx/d;", "remoteLogger", "Luh0/c;", "beAsyncActivateMobileApplicationUseCase", "<init>", "(La14/k;Lpx/d;Luh0/c;)V", "Ldx0/b$a;", "params", "Ldx/i;", "Ldx/b;", "Ldx0/b$b;", "d", "(Ldx0/b$a;Ltq/e;)Ljava/lang/Object;", "a", "La14/k;", "b", "Lpx/d;", "c", "Luh0/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a14.k generateRsaKeyPairUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uh0.c beAsyncActivateMobileApplicationUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45122g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45123h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45124j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f45125k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f45126l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f45127m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45128n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f45129p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f45130q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f45132s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45130q = obj;
            this.f45132s |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(a14.k kVar, px.d dVar, uh0.c cVar) {
        this.generateRsaKeyPairUseCase = kVar;
        this.remoteLogger = dVar;
        this.beAsyncActivateMobileApplicationUseCase = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #4 {Exception -> 0x0049, blocks: (B:13:0x0044, B:47:0x012e, B:53:0x0153, B:50:0x0135, B:52:0x0139, B:54:0x015f, B:55:0x0164, B:58:0x017a, B:61:0x0188, B:37:0x00ce, B:39:0x00f1, B:43:0x00fa, B:40:0x00f4, B:42:0x00f8, B:56:0x0165, B:57:0x0179, B:33:0x009a), top: B:76:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0139 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #4 {Exception -> 0x0049, blocks: (B:13:0x0044, B:47:0x012e, B:53:0x0153, B:50:0x0135, B:52:0x0139, B:54:0x015f, B:55:0x0164, B:58:0x017a, B:61:0x0188, B:37:0x00ce, B:39:0x00f1, B:43:0x00fa, B:40:0x00f4, B:42:0x00f8, B:56:0x0165, B:57:0x0179, B:33:0x009a), top: B:76:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x015f A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #4 {Exception -> 0x0049, blocks: (B:13:0x0044, B:47:0x012e, B:53:0x0153, B:50:0x0135, B:52:0x0139, B:54:0x015f, B:55:0x0164, B:58:0x017a, B:61:0x0188, B:37:0x00ce, B:39:0x00f1, B:43:0x00fa, B:40:0x00f4, B:42:0x00f8, B:56:0x0165, B:57:0x0179, B:33:0x009a), top: B:76:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(b.Params params, tq.e<? super dx.i<? extends dx.b, b.Result>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        b.Params params2;
        int i18;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar2;
        int i19;
        ex.b bVar3;
        Object right;
        th0.a aVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f45132s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f45132s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f45130q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f45132s;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    a14.k kVar = this.generateRsaKeyPairUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    aVar.f45119d = params;
                    aVar.f45120e = jVarA;
                    aVar.f45121f = vq.j.a(aVar2);
                    aVar.f45122g = aVar2;
                    aVar.f45123h = aVar2;
                    i18 = 0;
                    aVar.f45125k = 0;
                    aVar.f45126l = 0;
                    aVar.f45127m = 0;
                    aVar.f45128n = 0;
                    aVar.f45129p = 0;
                    aVar.f45132s = 1;
                    objC = kVar.c(c1792a, aVar);
                    if (objC != objE) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        i19 = 0;
                        bVar2 = aVar2;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f45129p;
                        i15 = aVar.f45128n;
                        i16 = aVar.f45127m;
                        i17 = aVar.f45126l;
                        int i27 = aVar.f45125k;
                        ex.b bVar4 = (ex.b) aVar.f45123h;
                        ex.b bVar5 = (ex.b) aVar.f45122g;
                        ex.b bVar6 = (ex.b) aVar.f45121f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f45120e;
                        params2 = (b.Params) aVar.f45119d;
                        try {
                            u.b(objC);
                            i18 = i26;
                            jVarA = jVar;
                            bVar = bVar6;
                            bVar2 = bVar4;
                            aVar2 = bVar5;
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
                        bVar3 = (ex.b) aVar.f45123h;
                        u.b(objC);
                    }
                    right = (dx.i) objC;
                    if (!(right instanceof dx.i.Left)) {
                        if (right instanceof dx.i.Right) {
                            throw new p();
                        }
                        uh0.c.Result result = (uh0.c.Result) ((dx.i.Right) right).b();
                        right = new dx.i.Right(new b.Result(result.getResponse(), result.getKeyPair()));
                    }
                    return new dx.i.Right((b.Result) bVar3.a(right));
                } catch (CancellationException e18) {
                    throw e18;
                }
                KeyPair keyPair = (KeyPair) bVar2.a((dx.i) objC);
                this.remoteLogger.F8("AsyncActivateMobileApplicationUC: keyPair generated", px.d.a.GENERAL);
                uh0.c cVar = this.beAsyncActivateMobileApplicationUseCase;
                b0 challenge = params2.getChallenge();
                rq0.b documentType = params2.getDocumentType();
                ex.b bVar7 = bVar;
                if (documentType == rq0.b.d.ID_CARD) {
                    aVar3 = th0.a.b.f190201a;
                } else {
                    if (documentType != rq0.b.d.DIIA_REFUGEE_CARD) {
                        aVar2.b(new dx.b.Generic(new Exception("AsyncActivateMobileApplicationUseCase error: not supported parent documentType")));
                        throw new oq.g();
                    }
                    aVar3 = th0.a.C4962a.f190200a;
                }
                uh0.c.Params params3 = new uh0.c.Params(challenge, keyPair, aVar3);
                aVar.f45119d = vq.j.a(params2);
                aVar.f45120e = jVarA;
                aVar.f45121f = vq.j.a(bVar7);
                aVar.f45122g = vq.j.a(aVar2);
                aVar.f45123h = aVar2;
                aVar.f45124j = vq.j.a(keyPair);
                aVar.f45125k = i19;
                aVar.f45126l = i17;
                aVar.f45127m = i16;
                aVar.f45128n = i15;
                aVar.f45129p = i18;
                aVar.f45132s = 2;
                objC = cVar.c(params3, aVar);
                if (objC != objE) {
                    bVar3 = aVar2;
                    right = (dx.i) objC;
                    if (!(right instanceof dx.i.Left)) {
                        if (right instanceof dx.i.Right) {
                            throw new p();
                        }
                        uh0.c.Result result2 = (uh0.c.Result) ((dx.i.Right) right).b();
                        right = new dx.i.Right(new b.Result(result2.getResponse(), result2.getKeyPair()));
                    }
                    return new dx.i.Right((b.Result) bVar3.a(right));
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
