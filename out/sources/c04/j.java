package c04;

import ay.Challenge;
import java.util.concurrent.CancellationException;
import k34.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import th0.RevokeUserCertificateMobileApiResponse;
import uh0.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lc04/j;", "Lwz3/i;", "Lwz3/e;", "getChallengeUC", "Luh0/p;", "revokeUserCertificateUseCase", "Lzz3/a;", "authenticationContainersInteractor", "<init>", "(Lwz3/e;Luh0/p;Lzz3/a;)V", "Lwz3/i$a;", "params", "Ldx/i;", "Ldx/b;", "Lth0/s;", "d", "(Lwz3/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lwz3/e;", "getGetChallengeUC", "()Lwz3/e;", "b", "Luh0/p;", "getRevokeUserCertificateUseCase", "()Luh0/p;", "c", "Lzz3/a;", "getAuthenticationContainersInteractor", "()Lzz3/a;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements wz3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p revokeUserCertificateUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zz3.a authenticationContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f22484h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f22485j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f22486k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f22487l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f22488m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f22489n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f22490p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22491q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f22492r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f22493s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22494t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f22495v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f22496w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f22498y;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22496w = obj;
            this.f22498y |= PKIFailureInfo.systemUnavail;
            return j.this.c(null, this);
        }
    }

    public j(wz3.e eVar, p pVar, zz3.a aVar) {
        this.getChallengeUC = eVar;
        this.revokeUserCertificateUseCase = pVar;
        this.authenticationContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x0302 A[Catch: Exception -> 0x02e2, c -> 0x02e6, CancellationException -> 0x02ea, TryCatch #10 {c -> 0x02e6, CancellationException -> 0x02ea, Exception -> 0x02e2, blocks: (B:72:0x0220, B:103:0x02fc, B:104:0x0301, B:105:0x0302, B:106:0x0320), top: B:138:0x020a }] */
    /* JADX WARN: Code duplicated, block: B:115:0x033e  */
    /* JADX WARN: Code duplicated, block: B:118:0x034f  */
    /* JADX WARN: Code duplicated, block: B:119:0x035d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0361  */
    /* JADX WARN: Code duplicated, block: B:124:0x036e  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x020c A[Catch: Exception -> 0x02ee, c -> 0x02f2, CancellationException -> 0x02f6, TryCatch #17 {c -> 0x02f2, CancellationException -> 0x02f6, Exception -> 0x02ee, blocks: (B:66:0x0204, B:68:0x020c, B:70:0x0210), top: B:129:0x0204 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0210 A[Catch: Exception -> 0x02ee, c -> 0x02f2, CancellationException -> 0x02f6, TRY_LEAVE, TryCatch #17 {c -> 0x02f2, CancellationException -> 0x02f6, Exception -> 0x02ee, blocks: (B:66:0x0204, B:68:0x020c, B:70:0x0210), top: B:129:0x0204 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0259  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x02e3: MOVE (r4 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:91:0x02e3 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x02e7: MOVE (r4 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:93:0x02e7 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x02eb: MOVE (r4 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:95:0x02eb */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(wz3.i.Params params, tq.e<? super dx.i<? extends dx.b, RevokeUserCertificateMobileApiResponse>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        Object objC;
        dx.j<dx.b> jVar;
        wz3.i.Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        dx.i iVar;
        Object objF;
        int i25;
        int i26;
        dx.i iVar2;
        int i27;
        Challenge challenge;
        int i28;
        int i29;
        dx.i iVar3;
        Object obj;
        u uVar;
        ?? r25;
        Object objB2;
        Object obj2;
        u uVar2;
        Object obj3;
        ex.b bVar3;
        ex.b bVar4;
        Challenge challenge2;
        int i35;
        ex.b bVar5;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        ?? r15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i46 = aVar.f22498y;
            if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f22498y = i46 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC2 = aVar.f22496w;
        Object objE = uq.b.e();
        ?? r16 = aVar.f22498y;
        try {
            try {
                try {
                    if (r16 == 0) {
                        oq.u.b(objC2);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        aVar2 = new ex.a();
                        wz3.e eVar2 = this.getChallengeUC;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        aVar.f22480d = params;
                        aVar.f22481e = jVarA;
                        aVar.f22482f = vq.j.a(aVar2);
                        aVar.f22483g = aVar2;
                        aVar.f22484h = aVar2;
                        aVar.f22489n = 0;
                        aVar.f22490p = 0;
                        aVar.f22491q = 0;
                        aVar.f22492r = 0;
                        aVar.f22493s = 0;
                        aVar.f22498y = 1;
                        objC = eVar2.c(c1792a, aVar);
                        if (objC != objE) {
                            jVar = jVarA;
                            params2 = params;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                        }
                        return objE;
                    }
                    if (r16 != 1) {
                        if (r16 != 2) {
                            if (r16 == 3) {
                                int i47 = aVar.f22495v;
                                int i48 = aVar.f22494t;
                                int i49 = aVar.f22493s;
                                int i55 = aVar.f22492r;
                                int i56 = aVar.f22491q;
                                int i57 = aVar.f22490p;
                                int i58 = aVar.f22489n;
                                ex.b bVar6 = (ex.b) aVar.f22488m;
                                u uVar3 = (u) aVar.f22487l;
                                Challenge challenge3 = (Challenge) aVar.f22486k;
                                dx.i iVar4 = (dx.i) aVar.f22485j;
                                ex.b bVar7 = (ex.b) aVar.f22484h;
                                ex.b bVar8 = (ex.b) aVar.f22483g;
                                ex.b bVar9 = (ex.b) aVar.f22482f;
                                dx.j jVar2 = (dx.j) aVar.f22481e;
                                wz3.i.Params params3 = (wz3.i.Params) aVar.f22480d;
                                try {
                                    oq.u.b(objC2);
                                    bVar3 = bVar8;
                                    obj3 = objC2;
                                    bVar2 = bVar9;
                                    uVar2 = uVar3;
                                    i35 = i58;
                                    i36 = i57;
                                    i37 = i56;
                                    i38 = i55;
                                    i39 = i49;
                                    i45 = i48;
                                    i27 = i47;
                                    obj2 = objE;
                                    bVar4 = bVar7;
                                    r15 = jVar2;
                                    iVar2 = iVar4;
                                    params2 = params3;
                                    challenge2 = challenge3;
                                    bVar5 = bVar6;
                                    try {
                                        CertKeyPair certKeyPair = (CertKeyPair) bVar5.a((dx.i) obj3);
                                        p pVar = this.revokeUserCertificateUseCase;
                                        wz3.i.Params params4 = params2;
                                        p.Params params5 = new p.Params(params4.getCertSerialNumber(), challenge2, certKeyPair);
                                        aVar.f22480d = vq.j.a(params4);
                                        aVar.f22481e = r15;
                                        aVar.f22482f = vq.j.a(bVar2);
                                        aVar.f22483g = vq.j.a(bVar3);
                                        aVar.f22484h = bVar4;
                                        aVar.f22485j = vq.j.a(iVar2);
                                        aVar.f22486k = vq.j.a(challenge2);
                                        aVar.f22487l = vq.j.a(certKeyPair);
                                        aVar.f22488m = vq.j.a(uVar2);
                                        aVar.f22489n = i35;
                                        aVar.f22490p = i36;
                                        aVar.f22491q = i37;
                                        aVar.f22492r = i38;
                                        aVar.f22493s = i39;
                                        aVar.f22494t = i45;
                                        aVar.f22495v = i27;
                                        aVar.f22498y = 4;
                                        objC2 = pVar.c(params5, aVar);
                                        if (objC2 == obj2) {
                                            return obj2;
                                        }
                                    } catch (ex.c e15) {
                                        e = e15;
                                    } catch (CancellationException e16) {
                                        throw e16;
                                    } catch (Exception e17) {
                                        e = e17;
                                        r16 = r15;
                                        px.f fVar = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e, px.c.a(r16));
                                        iVarA = r16.a(e);
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
                                } catch (ex.c e18) {
                                    e = e18;
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
                                    r16 = jVar2;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r16));
                                    iVarA = r16.a(e);
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
                                if (r16 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar4 = (ex.b) aVar.f22484h;
                                oq.u.b(objC2);
                            }
                            iVar = (dx.i) objC2;
                            bVar = bVar4;
                            return new dx.i.Right((RevokeUserCertificateMobileApiResponse) bVar.a(iVar));
                        }
                        int i59 = aVar.f22495v;
                        int i65 = aVar.f22494t;
                        int i66 = aVar.f22493s;
                        int i67 = aVar.f22492r;
                        int i68 = aVar.f22491q;
                        int i69 = aVar.f22490p;
                        int i75 = aVar.f22489n;
                        Challenge challenge4 = (Challenge) aVar.f22486k;
                        dx.i iVar5 = (dx.i) aVar.f22485j;
                        bVar = (ex.b) aVar.f22484h;
                        ex.b bVar10 = (ex.b) aVar.f22483g;
                        ex.b bVar11 = (ex.b) aVar.f22482f;
                        dx.j jVar3 = (dx.j) aVar.f22481e;
                        wz3.i.Params params6 = (wz3.i.Params) aVar.f22480d;
                        try {
                            oq.u.b(objC2);
                            params2 = params6;
                            objF = objC2;
                            bVar2 = bVar11;
                            i26 = i66;
                            r16 = jVar3;
                            i27 = i59;
                            i25 = i68;
                            i28 = i67;
                            i29 = i65;
                            iVar2 = iVar5;
                            aVar2 = bVar10;
                            challenge = challenge4;
                            i19 = i75;
                            i18 = i69;
                            try {
                                iVar3 = (dx.i) objF;
                                try {
                                    if (!(iVar3 instanceof dx.i.Left)) {
                                        aVar2.b(new dx.b.Generic(new Exception("Main document missing!")));
                                        throw new oq.g();
                                    }
                                    if (iVar3 instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    uVar = (u) ((dx.i.Right) iVar3).b();
                                    zz3.a aVar3 = this.authenticationContainersInteractor;
                                    aVar.f22480d = params2;
                                    aVar.f22481e = r16;
                                    r25 = r16;
                                    aVar.f22482f = vq.j.a(bVar2);
                                    aVar.f22483g = vq.j.a(aVar2);
                                    aVar.f22484h = bVar;
                                    aVar.f22485j = vq.j.a(iVar2);
                                    aVar.f22486k = challenge;
                                    aVar.f22487l = vq.j.a(uVar);
                                    aVar.f22488m = aVar2;
                                    aVar.f22489n = i19;
                                    aVar.f22490p = i18;
                                    aVar.f22491q = i25;
                                    aVar.f22492r = i28;
                                    aVar.f22493s = i26;
                                    aVar.f22494t = i29;
                                    aVar.f22495v = i27;
                                    aVar.f22498y = 3;
                                    objB2 = aVar3.b(uVar, aVar);
                                    obj2 = objE;
                                    if (objB2 == obj2) {
                                        return obj2;
                                    }
                                    uVar2 = uVar;
                                    obj3 = objB2;
                                    bVar3 = aVar2;
                                    bVar4 = bVar;
                                    challenge2 = challenge;
                                    i35 = i19;
                                    bVar5 = bVar3;
                                    i36 = i18;
                                    i37 = i25;
                                    i38 = i28;
                                    i39 = i26;
                                    i45 = i29;
                                    r15 = r25;
                                    CertKeyPair certKeyPair2 = (CertKeyPair) bVar5.a((dx.i) obj3);
                                    p pVar2 = this.revokeUserCertificateUseCase;
                                    wz3.i.Params params7 = params2;
                                    p.Params params8 = new p.Params(params7.getCertSerialNumber(), challenge2, certKeyPair2);
                                    aVar.f22480d = vq.j.a(params7);
                                    aVar.f22481e = r15;
                                    aVar.f22482f = vq.j.a(bVar2);
                                    aVar.f22483g = vq.j.a(bVar3);
                                    aVar.f22484h = bVar4;
                                    aVar.f22485j = vq.j.a(iVar2);
                                    aVar.f22486k = vq.j.a(challenge2);
                                    aVar.f22487l = vq.j.a(certKeyPair2);
                                    aVar.f22488m = vq.j.a(uVar2);
                                    aVar.f22489n = i35;
                                    aVar.f22490p = i36;
                                    aVar.f22491q = i37;
                                    aVar.f22492r = i38;
                                    aVar.f22493s = i39;
                                    aVar.f22494t = i45;
                                    aVar.f22495v = i27;
                                    aVar.f22498y = 4;
                                    objC2 = pVar2.c(params8, aVar);
                                    if (objC2 == obj2) {
                                        return obj2;
                                    }
                                    iVar = (dx.i) objC2;
                                    bVar = bVar4;
                                    return new dx.i.Right((RevokeUserCertificateMobileApiResponse) bVar.a(iVar));
                                } catch (ex.c e26) {
                                    e = e26;
                                } catch (CancellationException e27) {
                                    throw e27;
                                } catch (Exception e28) {
                                    e = e28;
                                    r16 = obj;
                                    px.f fVar3 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar3.d(message, e, px.c.a(r16));
                                    iVarA = r16.a(e);
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
                            } catch (ex.c e29) {
                                e = e29;
                            } catch (CancellationException e35) {
                                throw e35;
                            } catch (Exception e36) {
                                e = e36;
                            }
                        } catch (ex.c e37) {
                            e = e37;
                        } catch (CancellationException e38) {
                            throw e38;
                        } catch (Exception e39) {
                            e = e39;
                            r16 = jVar3;
                            px.f fVar4 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar4.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
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
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    }
                    int i76 = aVar.f22493s;
                    int i77 = aVar.f22492r;
                    int i78 = aVar.f22491q;
                    int i79 = aVar.f22490p;
                    int i85 = aVar.f22489n;
                    ex.b bVar12 = (ex.b) aVar.f22484h;
                    aVar2 = (ex.b) aVar.f22483g;
                    ex.b bVar13 = (ex.b) aVar.f22482f;
                    jVar = (dx.j) aVar.f22481e;
                    params2 = (wz3.i.Params) aVar.f22480d;
                    try {
                        oq.u.b(objC2);
                        i15 = i76;
                        objC = objC2;
                        bVar2 = bVar13;
                        bVar = bVar12;
                        i19 = i85;
                        i18 = i79;
                        i17 = i78;
                        i16 = i77;
                    } catch (ex.c e45) {
                        e = e45;
                    } catch (CancellationException e46) {
                        throw e46;
                    } catch (Exception e47) {
                        e = e47;
                        r16 = jVar;
                        px.f fVar5 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar5.d(message, e, px.c.a(r16));
                        iVarA = r16.a(e);
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
                    iVar = (dx.i) objC;
                    if (!(iVar instanceof dx.i.Left)) {
                        if (!(iVar instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        Challenge challenge5 = (Challenge) ((dx.i.Right) iVar).b();
                        zz3.a aVar4 = this.authenticationContainersInteractor;
                        aVar.f22480d = params2;
                        aVar.f22481e = jVar;
                        aVar.f22482f = vq.j.a(bVar2);
                        aVar.f22483g = aVar2;
                        aVar.f22484h = bVar;
                        aVar.f22485j = vq.j.a(iVar);
                        aVar.f22486k = challenge5;
                        aVar.f22489n = i19;
                        aVar.f22490p = i18;
                        aVar.f22491q = i17;
                        aVar.f22492r = i16;
                        aVar.f22493s = i15;
                        aVar.f22494t = 0;
                        aVar.f22495v = 0;
                        aVar.f22498y = 2;
                        int i86 = i15;
                        objF = zz3.a.f(aVar4, false, aVar, 1, null);
                        if (objF != objE) {
                            i25 = i17;
                            i26 = i86;
                            iVar2 = iVar;
                            i27 = 0;
                            r16 = jVar;
                            challenge = challenge5;
                            i28 = i16;
                            i29 = 0;
                            iVar3 = (dx.i) objF;
                            if (!(iVar3 instanceof dx.i.Left)) {
                                aVar2.b(new dx.b.Generic(new Exception("Main document missing!")));
                                throw new oq.g();
                            }
                            if (iVar3 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            uVar = (u) ((dx.i.Right) iVar3).b();
                            zz3.a aVar5 = this.authenticationContainersInteractor;
                            aVar.f22480d = params2;
                            aVar.f22481e = r16;
                            r25 = r16;
                            aVar.f22482f = vq.j.a(bVar2);
                            aVar.f22483g = vq.j.a(aVar2);
                            aVar.f22484h = bVar;
                            aVar.f22485j = vq.j.a(iVar2);
                            aVar.f22486k = challenge;
                            aVar.f22487l = vq.j.a(uVar);
                            aVar.f22488m = aVar2;
                            aVar.f22489n = i19;
                            aVar.f22490p = i18;
                            aVar.f22491q = i25;
                            aVar.f22492r = i28;
                            aVar.f22493s = i26;
                            aVar.f22494t = i29;
                            aVar.f22495v = i27;
                            aVar.f22498y = 3;
                            objB2 = aVar5.b(uVar, aVar);
                            obj2 = objE;
                            if (objB2 == obj2) {
                                return obj2;
                            }
                            uVar2 = uVar;
                            obj3 = objB2;
                            bVar3 = aVar2;
                            bVar4 = bVar;
                            challenge2 = challenge;
                            i35 = i19;
                            bVar5 = bVar3;
                            i36 = i18;
                            i37 = i25;
                            i38 = i28;
                            i39 = i26;
                            i45 = i29;
                            r15 = r25;
                            CertKeyPair certKeyPair3 = (CertKeyPair) bVar5.a((dx.i) obj3);
                            p pVar3 = this.revokeUserCertificateUseCase;
                            wz3.i.Params params9 = params2;
                            p.Params params10 = new p.Params(params9.getCertSerialNumber(), challenge2, certKeyPair3);
                            aVar.f22480d = vq.j.a(params9);
                            aVar.f22481e = r15;
                            aVar.f22482f = vq.j.a(bVar2);
                            aVar.f22483g = vq.j.a(bVar3);
                            aVar.f22484h = bVar4;
                            aVar.f22485j = vq.j.a(iVar2);
                            aVar.f22486k = vq.j.a(challenge2);
                            aVar.f22487l = vq.j.a(certKeyPair3);
                            aVar.f22488m = vq.j.a(uVar2);
                            aVar.f22489n = i35;
                            aVar.f22490p = i36;
                            aVar.f22491q = i37;
                            aVar.f22492r = i38;
                            aVar.f22493s = i39;
                            aVar.f22494t = i45;
                            aVar.f22495v = i27;
                            aVar.f22498y = 4;
                            objC2 = pVar3.c(params10, aVar);
                            if (objC2 == obj2) {
                                return obj2;
                            }
                            iVar = (dx.i) objC2;
                            bVar = bVar4;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        }
                        return objE;
                    }
                    return new dx.i.Right((RevokeUserCertificateMobileApiResponse) bVar.a(iVar));
                } catch (CancellationException e48) {
                    throw e48;
                }
            } catch (Exception e49) {
                e = e49;
            }
        } catch (ex.c e55) {
            e = e55;
        } catch (CancellationException e56) {
            throw e56;
        }
    }
}
