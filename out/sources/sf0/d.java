package sf0;

import a80.h;
import dx.i;
import dx.j;
import eg0.l;
import eg0.y;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import ry.CertKeyPair;
import tq.e;
import z70.UpdatedCertificate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsf0/d;", "Lqf0/b;", "Leg0/l;", "getUserCertUC", "La80/h;", "updateJuniorCertificateUC", "Leg0/y;", "updateUserCertUC", "Leg0/a;", "changeUserCertStatusUC", "<init>", "(Leg0/l;La80/h;Leg0/y;Leg0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Leg0/l;", "b", "La80/h;", "c", "Leg0/y;", "d", "Leg0/a;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements qf0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l getUserCertUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h updateJuniorCertificateUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y updateUserCertUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final eg0.a changeUserCertStatusUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f181128g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f181129h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f181130j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f181131k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f181132l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f181133m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f181134n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f181135p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f181136q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f181137r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f181139t;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181137r = obj;
            this.f181139t |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(l lVar, h hVar, y yVar, eg0.a aVar) {
        this.getUserCertUC = lVar;
        this.updateJuniorCertificateUC = hVar;
        this.updateUserCertUC = yVar;
        this.changeUserCertStatusUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0233  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00d4: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:39:0x00d4 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00d8: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:41:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00dc: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:43:0x00dc */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        Object obj;
        int i15;
        int i16;
        int i17;
        CertKeyPair certKeyPair;
        ex.b bVar;
        gz.b.a.C1792a c1792a2;
        int i18;
        j<dx.b> jVarA;
        ex.b bVar2;
        ex.b bVar3;
        int i19;
        int i25;
        UpdatedCertificate updatedCertificate;
        ex.b bVar4;
        gz.b.a.C1792a c1792a3;
        ex.b bVar5;
        ex.b bVar6;
        CertKeyPair certKeyPair2;
        ex.b bVar7;
        int i26;
        ex.b bVar8;
        int i27;
        UpdatedCertificate updatedCertificate2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i28 = aVar.f181139t;
            if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f181139t = i28 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f181137r;
        Object objE = uq.b.e();
        ?? r15 = aVar.f181139t;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    l lVar = this.getUserCertUC;
                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                    aVar.f181125d = vq.j.a(c1792a);
                    aVar.f181126e = jVarA;
                    aVar.f181127f = vq.j.a(aVar2);
                    aVar.f181128g = aVar2;
                    aVar.f181129h = aVar2;
                    i18 = 0;
                    aVar.f181132l = 0;
                    aVar.f181133m = 0;
                    aVar.f181134n = 0;
                    aVar.f181135p = 0;
                    aVar.f181136q = 0;
                    aVar.f181139t = 1;
                    objC = lVar.c(c1792a4, aVar);
                    if (objC != objE) {
                        c1792a2 = c1792a;
                        i15 = 0;
                        i26 = 0;
                        i27 = 0;
                        bVar8 = aVar2;
                        bVar3 = bVar8;
                        bVar2 = bVar3;
                        i19 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        try {
                            if (r15 == 2) {
                                int i29 = aVar.f181136q;
                                i15 = aVar.f181135p;
                                i16 = aVar.f181134n;
                                i17 = aVar.f181133m;
                                int i35 = aVar.f181132l;
                                certKeyPair = (CertKeyPair) aVar.f181130j;
                                ex.b bVar9 = (ex.b) aVar.f181129h;
                                bVar = (ex.b) aVar.f181128g;
                                ex.b bVar10 = (ex.b) aVar.f181127f;
                                j<dx.b> jVar = (j) aVar.f181126e;
                                c1792a2 = (gz.b.a.C1792a) aVar.f181125d;
                                u.b(objC);
                                i18 = i29;
                                jVarA = jVar;
                                bVar2 = bVar10;
                                bVar3 = bVar9;
                                i19 = i35;
                                i25 = i15;
                                c1792a3 = c1792a2;
                                updatedCertificate2 = (UpdatedCertificate) bVar3.a((i) objC);
                                y yVar = this.updateUserCertUC;
                                y.Params params = new y.Params(updatedCertificate2.getCertPKCS12Base64(), updatedCertificate2.getCertPKCS12AESSecretKeyBase64(), updatedCertificate2.getPublicCertBase64(), updatedCertificate2.getPasswordPKCS12Base64(), updatedCertificate2.getPeselTicket(), certKeyPair.getPrivateKey());
                                aVar.f181125d = vq.j.a(c1792a3);
                                aVar.f181126e = jVarA;
                                aVar.f181127f = vq.j.a(bVar2);
                                aVar.f181128g = bVar;
                                aVar.f181129h = bVar;
                                aVar.f181130j = vq.j.a(certKeyPair);
                                aVar.f181131k = vq.j.a(updatedCertificate2);
                                aVar.f181132l = i19;
                                aVar.f181133m = i17;
                                aVar.f181134n = i16;
                                aVar.f181135p = i25;
                                aVar.f181136q = i18;
                                aVar.f181139t = 3;
                                objC = yVar.c(params, aVar);
                                if (objC == objE) {
                                    bVar4 = bVar;
                                    bVar5 = bVar2;
                                    certKeyPair2 = certKeyPair;
                                    bVar6 = bVar4;
                                    updatedCertificate = updatedCertificate2;
                                    bVar6.a((i) objC);
                                    eg0.a aVar3 = this.changeUserCertStatusUC;
                                    eg0.a.Params params2 = new eg0.a.Params(wf0.a.ACTIVE);
                                    aVar.f181125d = vq.j.a(c1792a3);
                                    aVar.f181126e = jVarA;
                                    aVar.f181127f = vq.j.a(bVar5);
                                    aVar.f181128g = vq.j.a(bVar4);
                                    aVar.f181129h = bVar4;
                                    aVar.f181130j = vq.j.a(certKeyPair2);
                                    aVar.f181131k = vq.j.a(updatedCertificate);
                                    aVar.f181132l = i19;
                                    aVar.f181133m = i17;
                                    aVar.f181134n = i16;
                                    aVar.f181135p = i25;
                                    aVar.f181136q = i18;
                                    aVar.f181139t = 4;
                                    objC = aVar3.c(params2, aVar);
                                    if (objC != objE) {
                                        bVar7 = bVar4;
                                    }
                                }
                                return objE;
                            }
                            if (r15 == 3) {
                                int i36 = aVar.f181136q;
                                i25 = aVar.f181135p;
                                i16 = aVar.f181134n;
                                i17 = aVar.f181133m;
                                int i37 = aVar.f181132l;
                                updatedCertificate = (UpdatedCertificate) aVar.f181131k;
                                CertKeyPair certKeyPair3 = (CertKeyPair) aVar.f181130j;
                                ex.b bVar11 = (ex.b) aVar.f181129h;
                                bVar4 = (ex.b) aVar.f181128g;
                                ex.b bVar12 = (ex.b) aVar.f181127f;
                                j<dx.b> jVar2 = (j) aVar.f181126e;
                                c1792a3 = (gz.b.a.C1792a) aVar.f181125d;
                                try {
                                    u.b(objC);
                                    i18 = i36;
                                    jVarA = jVar2;
                                    bVar5 = bVar12;
                                    bVar6 = bVar11;
                                    certKeyPair2 = certKeyPair3;
                                    i19 = i37;
                                    bVar6.a((i) objC);
                                    eg0.a aVar4 = this.changeUserCertStatusUC;
                                    eg0.a.Params params3 = new eg0.a.Params(wf0.a.ACTIVE);
                                    aVar.f181125d = vq.j.a(c1792a3);
                                    aVar.f181126e = jVarA;
                                    aVar.f181127f = vq.j.a(bVar5);
                                    aVar.f181128g = vq.j.a(bVar4);
                                    aVar.f181129h = bVar4;
                                    aVar.f181130j = vq.j.a(certKeyPair2);
                                    aVar.f181131k = vq.j.a(updatedCertificate);
                                    aVar.f181132l = i19;
                                    aVar.f181133m = i17;
                                    aVar.f181134n = i16;
                                    aVar.f181135p = i25;
                                    aVar.f181136q = i18;
                                    aVar.f181139t = 4;
                                    objC = aVar4.c(params3, aVar);
                                    if (objC != objE) {
                                        bVar7 = bVar4;
                                    }
                                    return objE;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r15 = jVar2;
                                    f fVar = f.f163100a;
                                    String message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r15));
                                    i iVarA = r15.a(e);
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
                            }
                            if (r15 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar7 = (ex.b) aVar.f181129h;
                            u.b(objC);
                        } catch (CancellationException e18) {
                            throw e18;
                        }
                    } else {
                        int i38 = aVar.f181136q;
                        i15 = aVar.f181135p;
                        i26 = aVar.f181134n;
                        int i39 = aVar.f181133m;
                        int i45 = aVar.f181132l;
                        ex.b bVar13 = (ex.b) aVar.f181129h;
                        ex.b bVar14 = (ex.b) aVar.f181128g;
                        ex.b bVar15 = (ex.b) aVar.f181127f;
                        j<dx.b> jVar3 = (j) aVar.f181126e;
                        c1792a2 = (gz.b.a.C1792a) aVar.f181125d;
                        u.b(objC);
                        i18 = i38;
                        jVarA = jVar3;
                        bVar2 = bVar15;
                        bVar3 = bVar14;
                        bVar8 = bVar13;
                        i19 = i45;
                        i27 = i39;
                    }
                    bVar7.a((i) objC);
                    return new i.Right(i0.f148189a);
                } catch (ex.c e19) {
                    e = e19;
                } catch (CancellationException e25) {
                    throw e25;
                } catch (Exception e26) {
                    e = e26;
                    r15 = obj;
                }
                CertKeyPair certKeyPair4 = (CertKeyPair) bVar8.a((i) objC);
                h hVar = this.updateJuniorCertificateUC;
                h.Params params4 = new h.Params(certKeyPair4);
                aVar.f181125d = vq.j.a(c1792a2);
                aVar.f181126e = jVarA;
                aVar.f181127f = vq.j.a(bVar2);
                aVar.f181128g = bVar3;
                aVar.f181129h = bVar3;
                aVar.f181130j = certKeyPair4;
                aVar.f181132l = i19;
                aVar.f181133m = i27;
                aVar.f181134n = i26;
                aVar.f181135p = i15;
                aVar.f181136q = i18;
                aVar.f181139t = 2;
                Object objC2 = hVar.c(params4, aVar);
                if (objC2 != objE) {
                    i16 = i26;
                    i17 = i27;
                    bVar = bVar3;
                    certKeyPair = certKeyPair4;
                    objC = objC2;
                    i25 = i15;
                    c1792a3 = c1792a2;
                    updatedCertificate2 = (UpdatedCertificate) bVar3.a((i) objC);
                    y yVar2 = this.updateUserCertUC;
                    y.Params params5 = new y.Params(updatedCertificate2.getCertPKCS12Base64(), updatedCertificate2.getCertPKCS12AESSecretKeyBase64(), updatedCertificate2.getPublicCertBase64(), updatedCertificate2.getPasswordPKCS12Base64(), updatedCertificate2.getPeselTicket(), certKeyPair.getPrivateKey());
                    aVar.f181125d = vq.j.a(c1792a3);
                    aVar.f181126e = jVarA;
                    aVar.f181127f = vq.j.a(bVar2);
                    aVar.f181128g = bVar;
                    aVar.f181129h = bVar;
                    aVar.f181130j = vq.j.a(certKeyPair);
                    aVar.f181131k = vq.j.a(updatedCertificate2);
                    aVar.f181132l = i19;
                    aVar.f181133m = i17;
                    aVar.f181134n = i16;
                    aVar.f181135p = i25;
                    aVar.f181136q = i18;
                    aVar.f181139t = 3;
                    objC = yVar2.c(params5, aVar);
                    if (objC == objE) {
                        bVar4 = bVar;
                        bVar5 = bVar2;
                        certKeyPair2 = certKeyPair;
                        bVar6 = bVar4;
                        updatedCertificate = updatedCertificate2;
                        bVar6.a((i) objC);
                        eg0.a aVar5 = this.changeUserCertStatusUC;
                        eg0.a.Params params6 = new eg0.a.Params(wf0.a.ACTIVE);
                        aVar.f181125d = vq.j.a(c1792a3);
                        aVar.f181126e = jVarA;
                        aVar.f181127f = vq.j.a(bVar5);
                        aVar.f181128g = vq.j.a(bVar4);
                        aVar.f181129h = bVar4;
                        aVar.f181130j = vq.j.a(certKeyPair2);
                        aVar.f181131k = vq.j.a(updatedCertificate);
                        aVar.f181132l = i19;
                        aVar.f181133m = i17;
                        aVar.f181134n = i16;
                        aVar.f181135p = i25;
                        aVar.f181136q = i18;
                        aVar.f181139t = 4;
                        objC = aVar5.c(params6, aVar);
                        if (objC != objE) {
                            bVar7 = bVar4;
                            bVar7.a((i) objC);
                            return new i.Right(i0.f148189a);
                        }
                    }
                }
                return objE;
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
