package dx0;

import iy.a0;
import iy.b0;
import iy.i0;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ldx0/g;", "Ldx0/f;", "Liy/a;", "base64Coder", "Liy/i0;", "certificateDecoder", "Ldx0/h;", "decryptUserCertificateUseCase", "Lpx/d;", "remoteLogger", "Lcx0/c;", "documentsContainerInteractor", "<init>", "(Liy/a;Liy/i0;Ldx0/h;Lpx/d;Lcx0/c;)V", "Ldx0/f$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ldx0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/a;", "b", "Liy/i0;", "c", "Ldx0/h;", "Lpx/d;", "e", "Lcx0/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 certificateDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h decryptUserCertificateUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cx0.c documentsContainerInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45163g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45164h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45165j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f45166k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f45167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f45168m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45169n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f45170p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f45171q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f45172r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f45173s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f45175v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45173s = obj;
            this.f45175v |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(iy.a aVar, i0 i0Var, h hVar, px.d dVar, cx0.c cVar) {
        this.base64Coder = aVar;
        this.certificateDecoder = i0Var;
        this.decryptUserCertificateUseCase = hVar;
        this.remoteLogger = dVar;
        this.documentsContainerInteractor = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01d4 A[Catch: Exception -> 0x0092, c -> 0x0096, CancellationException -> 0x009a, TryCatch #5 {c -> 0x0096, CancellationException -> 0x009a, Exception -> 0x0092, blocks: (B:26:0x008d, B:50:0x01cc, B:52:0x01d4, B:54:0x01ef, B:35:0x00c4), top: B:78:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x024f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0275  */
    /* JADX WARN: Code duplicated, block: B:69:0x0286  */
    /* JADX WARN: Code duplicated, block: B:70:0x0294  */
    /* JADX WARN: Code duplicated, block: B:72:0x0298  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(f.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        int i15;
        byte[] bArr;
        X509Certificate x509Certificate;
        f.Params params2;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i19;
        ex.b bVar4;
        dx.j<dx.b> jVar;
        ex.b bVar5;
        byte[] bArr2;
        X509Certificate x509Certificate2;
        ex.b bVar6;
        int i25;
        int i26;
        f.Params params3;
        int i27;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i28 = aVar.f45175v;
            if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f45175v = i28 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object objC = aVar2.f45173s;
        Object objE = uq.b.e();
        ?? r15 = aVar2.f45175v;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(objC);
                        jVarA = xw.c.f221622a.a();
                        ex.a aVar3 = new ex.a();
                        byte[] bArr3 = (byte[]) aVar3.a(iy.a.c(this.base64Coder, params.getCertResponse().getUserCertificateWithKeys().getPublicCertBase64(), null, 2, null));
                        X509Certificate x509Certificate3 = (X509Certificate) aVar3.a(this.certificateDecoder.decode(bArr3));
                        this.remoteLogger.F8("AsyncProcessAndSaveNewCertUC: new cert decoded", px.d.a.GENERAL);
                        cx0.c cVar = this.documentsContainerInteractor;
                        aVar2.f45160d = params;
                        aVar2.f45161e = jVarA;
                        aVar2.f45162f = vq.j.a(aVar3);
                        aVar2.f45163g = aVar3;
                        aVar2.f45164h = vq.j.a(bArr3);
                        aVar2.f45165j = vq.j.a(x509Certificate3);
                        aVar2.f45166k = aVar3;
                        i15 = 0;
                        aVar2.f45168m = 0;
                        aVar2.f45169n = 0;
                        aVar2.f45170p = 0;
                        aVar2.f45171q = 0;
                        aVar2.f45172r = 0;
                        aVar2.f45175v = 1;
                        Object objD = cVar.d(x509Certificate3, aVar2);
                        if (objD != objE) {
                            bArr = bArr3;
                            x509Certificate = x509Certificate3;
                            objC = objD;
                            params2 = params;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar3;
                            bVar2 = bVar;
                            bVar3 = bVar2;
                            i19 = 0;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        try {
                            if (r15 == 2) {
                                i27 = aVar2.f45172r;
                                i17 = aVar2.f45171q;
                                i26 = aVar2.f45170p;
                                i18 = aVar2.f45169n;
                                i25 = aVar2.f45168m;
                                bVar6 = (ex.b) aVar2.f45166k;
                                x509Certificate2 = (X509Certificate) aVar2.f45165j;
                                bArr2 = (byte[]) aVar2.f45164h;
                                bVar2 = (ex.b) aVar2.f45163g;
                                bVar5 = (ex.b) aVar2.f45162f;
                                jVar = (dx.j) aVar2.f45161e;
                                params3 = (f.Params) aVar2.f45160d;
                                u.b(objC);
                                iVar = (dx.i) objC;
                                f.Params params4 = params3;
                                if (iVar instanceof dx.i.Left) {
                                    this.remoteLogger.F8("AsyncProcessAndSaveNewCertUC: cert decryption failed", px.d.a.ERROR);
                                }
                                h.Result bVar7 = (h.Result) bVar6.a(iVar);
                                cx0.c cVar2 = this.documentsContainerInteractor;
                                rq0.b documentType = params4.getDocumentType();
                                b0 peselTicket = params4.getCertResponse().getPeselTicket();
                                a0 a0VarA = bVar7.getCertPkcs12();
                                b0 b0VarB = bVar7.getPassword();
                                aVar2.f45160d = vq.j.a(params4);
                                aVar2.f45161e = jVar;
                                aVar2.f45162f = vq.j.a(bVar5);
                                aVar2.f45163g = vq.j.a(bVar2);
                                aVar2.f45164h = vq.j.a(bArr2);
                                aVar2.f45165j = vq.j.a(x509Certificate2);
                                aVar2.f45166k = bVar2;
                                aVar2.f45167l = vq.j.a(bVar7);
                                aVar2.f45168m = i25;
                                aVar2.f45169n = i18;
                                aVar2.f45170p = i26;
                                aVar2.f45171q = i17;
                                aVar2.f45172r = i27;
                                aVar2.f45175v = 3;
                                objC = cVar2.c(documentType, peselTicket, a0VarA, b0VarB, aVar2);
                                if (objC != objE) {
                                    bVar4 = bVar2;
                                }
                                return objE;
                            }
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar4 = (ex.b) aVar2.f45166k;
                            u.b(objC);
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    } else {
                        int i29 = aVar2.f45172r;
                        int i35 = aVar2.f45171q;
                        int i36 = aVar2.f45170p;
                        i18 = aVar2.f45169n;
                        int i37 = aVar2.f45168m;
                        ex.b bVar8 = (ex.b) aVar2.f45166k;
                        X509Certificate x509Certificate4 = (X509Certificate) aVar2.f45165j;
                        byte[] bArr4 = (byte[]) aVar2.f45164h;
                        bVar2 = (ex.b) aVar2.f45163g;
                        ex.b bVar9 = (ex.b) aVar2.f45162f;
                        dx.j<dx.b> jVar2 = (dx.j) aVar2.f45161e;
                        params2 = (f.Params) aVar2.f45160d;
                        u.b(objC);
                        i15 = i29;
                        jVarA = jVar2;
                        bVar3 = bVar9;
                        bArr = bArr4;
                        x509Certificate = x509Certificate4;
                        bVar = bVar8;
                        i19 = i37;
                        i17 = i35;
                        i16 = i36;
                    }
                    bVar4.a((dx.i) objC);
                    return new dx.i.Right(oq.i0.f148189a);
                    dx.i iVar2 = (dx.i) objC;
                    X509Certificate x509Certificate5 = x509Certificate;
                    if (iVar2 instanceof dx.i.Left) {
                        this.remoteLogger.F8("AsyncProcessAndSaveNewCertUC: invalid PESEL", px.d.a.ERROR);
                    }
                    bVar.a(iVar2);
                    h hVar = this.decryptUserCertificateUseCase;
                    h.Params aVar4 = new h.Params(params2.getCertResponse().getUserCertificateWithKeys(), params2.getKeyPair().getPrivate());
                    aVar2.f45160d = params2;
                    aVar2.f45161e = jVarA;
                    aVar2.f45162f = vq.j.a(bVar3);
                    aVar2.f45163g = bVar2;
                    aVar2.f45164h = vq.j.a(bArr);
                    aVar2.f45165j = vq.j.a(x509Certificate5);
                    aVar2.f45166k = bVar2;
                    aVar2.f45168m = i19;
                    aVar2.f45169n = i18;
                    aVar2.f45170p = i16;
                    aVar2.f45171q = i17;
                    aVar2.f45172r = i15;
                    aVar2.f45175v = 2;
                    objC = hVar.d(aVar4, aVar2);
                    if (objC != objE) {
                        f.Params params5 = params2;
                        i26 = i16;
                        params3 = params5;
                        x509Certificate2 = x509Certificate5;
                        jVar = jVarA;
                        i27 = i15;
                        i25 = i19;
                        bVar6 = bVar2;
                        bArr2 = bArr;
                        bVar5 = bVar3;
                        iVar = (dx.i) objC;
                        f.Params params6 = params3;
                        if (iVar instanceof dx.i.Left) {
                            this.remoteLogger.F8("AsyncProcessAndSaveNewCertUC: cert decryption failed", px.d.a.ERROR);
                        }
                        h.Result bVar10 = (h.Result) bVar6.a(iVar);
                        cx0.c cVar3 = this.documentsContainerInteractor;
                        rq0.b documentType2 = params6.getDocumentType();
                        b0 peselTicket2 = params6.getCertResponse().getPeselTicket();
                        a0 a0VarA2 = bVar10.getCertPkcs12();
                        b0 b0VarB2 = bVar10.getPassword();
                        aVar2.f45160d = vq.j.a(params6);
                        aVar2.f45161e = jVar;
                        aVar2.f45162f = vq.j.a(bVar5);
                        aVar2.f45163g = vq.j.a(bVar2);
                        aVar2.f45164h = vq.j.a(bArr2);
                        aVar2.f45165j = vq.j.a(x509Certificate2);
                        aVar2.f45166k = bVar2;
                        aVar2.f45167l = vq.j.a(bVar10);
                        aVar2.f45168m = i25;
                        aVar2.f45169n = i18;
                        aVar2.f45170p = i26;
                        aVar2.f45171q = i17;
                        aVar2.f45172r = i27;
                        aVar2.f45175v = 3;
                        objC = cVar3.c(documentType2, peselTicket2, a0VarA2, b0VarB2, aVar2);
                        if (objC != objE) {
                            bVar4 = bVar2;
                            bVar4.a((dx.i) objC);
                            return new dx.i.Right(oq.i0.f148189a);
                        }
                    }
                    return objE;
                } catch (Exception e16) {
                    e = e16;
                    px.f fVar = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e17) {
                e = e17;
                return new dx.i.Left((dx.b) ex.d.a(e));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (ex.c e19) {
            e = e19;
            return new dx.i.Left((dx.b) ex.d.a(e));
        } catch (CancellationException e25) {
            throw e25;
        } catch (Exception e26) {
            e = e26;
            r15 = jVar;
            px.f fVar2 = px.f.f163100a;
            message = e.getMessage();
            if (message == null) {
                message = "";
            }
            fVar2.d(message, e, px.c.a(r15));
            iVarA = r15.a(e);
            if (iVarA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
            } else {
                if (iVarA instanceof dx.i.Right) {
                    throw new p();
                }
                objB = ((dx.i.Right) iVarA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
