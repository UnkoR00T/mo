package yj2;

import dx.j;
import fr.t;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lyj2/c;", "Luj2/a;", "Lg04/c;", "biometricLoginUseCase", "Lg04/g;", "checkBiometricStatusUseCase", "Luj2/b;", "loginToAppUseCase", "Liy/c;", "bytesConverter", "Lpx/d;", "remoteLogger", "<init>", "(Lg04/c;Lg04/g;Luj2/b;Liy/c;Lpx/d;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Ltj2/a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lg04/c;", "b", "Lg04/g;", "c", "Luj2/b;", "d", "Liy/c;", "e", "Lpx/d;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements uj2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g04.c biometricLoginUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uj2.b loginToAppUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f227354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f227355f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f227356g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f227357h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f227358j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f227359k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f227360l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f227361m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f227362n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f227363p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f227364q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f227365r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f227366s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f227368v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227366s = obj;
            this.f227368v |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(g04.c cVar, g04.g gVar, uj2.b bVar, iy.c cVar2, px.d dVar) {
        this.biometricLoginUseCase = cVar;
        this.checkBiometricStatusUseCase = gVar;
        this.loginToAppUseCase = bVar;
        this.bytesConverter = cVar2;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0144 A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TryCatch #5 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:25:0x0087, B:57:0x0138, B:59:0x0144, B:61:0x014c, B:63:0x0154, B:65:0x0165, B:67:0x016d, B:77:0x0205, B:78:0x020a), top: B:101:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014c A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TryCatch #5 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:25:0x0087, B:57:0x0138, B:59:0x0144, B:61:0x014c, B:63:0x0154, B:65:0x0165, B:67:0x016d, B:77:0x0205, B:78:0x020a), top: B:101:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0154 A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TryCatch #5 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:25:0x0087, B:57:0x0138, B:59:0x0144, B:61:0x014c, B:63:0x0154, B:65:0x0165, B:67:0x016d, B:77:0x0205, B:78:0x020a), top: B:101:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0165 A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TryCatch #5 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:25:0x0087, B:57:0x0138, B:59:0x0144, B:61:0x014c, B:63:0x0154, B:65:0x0165, B:67:0x016d, B:77:0x0205, B:78:0x020a), top: B:101:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x016d A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TRY_LEAVE, TryCatch #5 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:25:0x0087, B:57:0x0138, B:59:0x0144, B:61:0x014c, B:63:0x0154, B:65:0x0165, B:67:0x016d, B:77:0x0205, B:78:0x020a), top: B:101:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e7 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #5 {Exception -> 0x0054, blocks: (B:14:0x004f, B:71:0x01d9, B:73:0x01e7, B:75:0x01ef, B:79:0x020b, B:82:0x0219, B:53:0x00fb), top: B:100:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01ef A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TRY_LEAVE, TryCatch #5 {Exception -> 0x0054, blocks: (B:14:0x004f, B:71:0x01d9, B:73:0x01e7, B:75:0x01ef, B:79:0x020b, B:82:0x0219, B:53:0x00fb), top: B:100:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0205 A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TRY_ENTER, TryCatch #5 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:25:0x0087, B:57:0x0138, B:59:0x0144, B:61:0x014c, B:63:0x0154, B:65:0x0165, B:67:0x016d, B:77:0x0205, B:78:0x020a), top: B:101:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends tj2.a>> eVar) throws Throwable {
        a aVar;
        Object objB;
        gz.b.a.C1792a c1792a2;
        ex.b bVar;
        ex.b bVar2;
        e04.a aVar2;
        j<dx.b> jVar;
        ex.b bVar3;
        ex.b bVar4;
        ex.b aVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        gz.b.a.C1792a c1792a3;
        int i19;
        e04.e eVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f227368v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f227368v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f227366s;
        Object objE = uq.b.e();
        int i26 = aVar.f227368v;
        ?? r15 = 3;
        try {
            try {
                if (i26 == 0) {
                    u.b(objC);
                    g04.c cVar = this.biometricLoginUseCase;
                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                    aVar.f227353d = vq.j.a(c1792a);
                    aVar.f227368v = 1;
                    objC = cVar.c(c1792a4, aVar);
                    if (objC != objE) {
                        c1792a2 = c1792a;
                    }
                    return objE;
                }
                if (i26 != 1) {
                    try {
                        if (i26 == 2) {
                            i19 = aVar.f227365r;
                            i18 = aVar.f227364q;
                            i17 = aVar.f227363p;
                            i16 = aVar.f227362n;
                            i15 = aVar.f227361m;
                            ex.b bVar5 = (ex.b) aVar.f227358j;
                            ex.b bVar6 = (ex.b) aVar.f227357h;
                            bVar3 = (ex.b) aVar.f227356g;
                            jVar = (j) aVar.f227355f;
                            aVar2 = (e04.a) aVar.f227354e;
                            c1792a3 = (gz.b.a.C1792a) aVar.f227353d;
                            try {
                                u.b(objC);
                                bVar4 = bVar5;
                                aVar3 = bVar6;
                                eVar2 = (e04.e) bVar4.a((dx.i) objC);
                                if (eVar2 instanceof e04.e.a) {
                                    return new dx.i.Left(dx.b.InterfaceC1027b.a.c.f45024a);
                                }
                                if (t.c(eVar2, e04.e.b.a.f46688a)) {
                                    return new dx.i.Right(new tj2.a.LoginWithPinSuccess(((e04.a.AuthenticationSucceed) aVar2).getResultData()));
                                }
                                if (t.c(eVar2, e04.e.b.C1057b.f46689a)) {
                                    throw new p();
                                }
                                gz.b.a.C1792a c1792a5 = c1792a3;
                                char[] cArr = (char[]) aVar3.a(this.bytesConverter.c(((e04.a.AuthenticationSucceed) aVar2).getResultData().getData(), new iy.b.Standard(null, 1, null)));
                                uj2.b bVar7 = this.loginToAppUseCase;
                                uj2.b.Params params = new uj2.b.Params(new b0(cArr));
                                aVar.f227353d = vq.j.a(c1792a5);
                                aVar.f227354e = vq.j.a(aVar2);
                                aVar.f227355f = jVar;
                                aVar.f227356g = vq.j.a(bVar3);
                                aVar.f227357h = aVar3;
                                aVar.f227358j = aVar3;
                                aVar.f227359k = vq.j.a(eVar2);
                                aVar.f227360l = vq.j.a(cArr);
                                aVar.f227361m = i15;
                                aVar.f227362n = i16;
                                aVar.f227363p = i17;
                                aVar.f227364q = i18;
                                aVar.f227365r = i19;
                                aVar.f227368v = 3;
                                objC = bVar7.c(params, aVar);
                                if (objC != objE) {
                                    bVar2 = aVar3;
                                    bVar = bVar2;
                                }
                                return objE;
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
                        }
                        if (i26 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) aVar.f227358j;
                        bVar = (ex.b) aVar.f227357h;
                        u.b(objC);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } else {
                    c1792a2 = (gz.b.a.C1792a) aVar.f227353d;
                    u.b(objC);
                }
                if (((uj2.b.Result) bVar2.a((dx.i) objC)).getIsSuccessful()) {
                    return new dx.i.Right(tj2.a.c.f190495a);
                }
                px.b.y5(this.remoteLogger, "BiometricLogin, login to app failed", null, px.c.a(bVar), 2, null);
                return new dx.i.Left(dx.b.j.c.f45087a);
                aVar2 = (e04.a) objC;
                if (t.c(aVar2, e04.a.C1055a.f46678a)) {
                    return new dx.i.Right(tj2.a.C4972a.f190493a);
                }
                if (aVar2 instanceof e04.a.Error) {
                    return new dx.i.Left(((e04.a.Error) aVar2).getErrorType());
                }
                if (t.c(aVar2, e04.a.d.f46681a)) {
                    return new dx.i.Right(tj2.a.d.f190496a);
                }
                if (!(aVar2 instanceof e04.a.AuthenticationSucceed)) {
                    throw new p();
                }
                j<dx.b> jVarA = xw.c.f221622a.a();
                aVar3 = new ex.a();
                g04.g gVar = this.checkBiometricStatusUseCase;
                i16 = 0;
                g04.g.Params params2 = new g04.g.Params(false);
                aVar.f227353d = vq.j.a(c1792a2);
                aVar.f227354e = aVar2;
                aVar.f227355f = jVarA;
                aVar.f227356g = vq.j.a(aVar3);
                aVar.f227357h = aVar3;
                aVar.f227358j = aVar3;
                aVar.f227361m = 0;
                aVar.f227362n = 0;
                aVar.f227363p = 0;
                aVar.f227364q = 0;
                aVar.f227365r = 0;
                aVar.f227368v = 2;
                objC = gVar.c(params2, aVar);
                if (objC != objE) {
                    jVar = jVarA;
                    i18 = 0;
                    i17 = 0;
                    i15 = 0;
                    bVar4 = aVar3;
                    bVar3 = bVar4;
                    c1792a3 = c1792a2;
                    i19 = 0;
                    eVar2 = (e04.e) bVar4.a((dx.i) objC);
                    if (eVar2 instanceof e04.e.a) {
                        return new dx.i.Left(dx.b.InterfaceC1027b.a.c.f45024a);
                    }
                    if (t.c(eVar2, e04.e.b.a.f46688a)) {
                        return new dx.i.Right(new tj2.a.LoginWithPinSuccess(((e04.a.AuthenticationSucceed) aVar2).getResultData()));
                    }
                    if (t.c(eVar2, e04.e.b.C1057b.f46689a)) {
                        throw new p();
                    }
                    gz.b.a.C1792a c1792a6 = c1792a3;
                    char[] cArr2 = (char[]) aVar3.a(this.bytesConverter.c(((e04.a.AuthenticationSucceed) aVar2).getResultData().getData(), new iy.b.Standard(null, 1, null)));
                    uj2.b bVar8 = this.loginToAppUseCase;
                    uj2.b.Params params3 = new uj2.b.Params(new b0(cArr2));
                    aVar.f227353d = vq.j.a(c1792a6);
                    aVar.f227354e = vq.j.a(aVar2);
                    aVar.f227355f = jVar;
                    aVar.f227356g = vq.j.a(bVar3);
                    aVar.f227357h = aVar3;
                    aVar.f227358j = aVar3;
                    aVar.f227359k = vq.j.a(eVar2);
                    aVar.f227360l = vq.j.a(cArr2);
                    aVar.f227361m = i15;
                    aVar.f227362n = i16;
                    aVar.f227363p = i17;
                    aVar.f227364q = i18;
                    aVar.f227365r = i19;
                    aVar.f227368v = 3;
                    objC = bVar8.c(params3, aVar);
                    if (objC != objE) {
                        bVar2 = aVar3;
                        bVar = bVar2;
                        if (((uj2.b.Result) bVar2.a((dx.i) objC)).getIsSuccessful()) {
                            return new dx.i.Right(tj2.a.c.f190495a);
                        }
                        px.b.y5(this.remoteLogger, "BiometricLogin, login to app failed", null, px.c.a(bVar), 2, null);
                        return new dx.i.Left(dx.b.j.c.f45087a);
                    }
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
