package wg0;

import iy.c0;
import iy.q;
import iy.r;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pg0.DecryptedUserKeyData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwg0/j;", "Lqg0/g;", "Liy/g;", "cipherAes", "Lrg0/a;", "appSessionManager", "Lwg0/d;", "createSecretKeyAndParamsUC", "Lwg0/i;", "loadAndDecryptUserKeyDataUC", "<init>", "(Liy/g;Lrg0/a;Lwg0/d;Lwg0/i;)V", "Lqg0/g$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lqg0/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/g;", "b", "Lrg0/a;", "c", "Lwg0/d;", "Lwg0/i;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements qg0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rg0.a appSessionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d createSecretKeyAndParamsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i loadAndDecryptUserKeyDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213160g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213161h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213162j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213163k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f213164l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f213165m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213166n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213167p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213168q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213169r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f213170s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f213172v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213170s = obj;
            this.f213172v |= PKIFailureInfo.systemUnavail;
            return j.this.c(null, this);
        }
    }

    public j(iy.g gVar, rg0.a aVar, d dVar, i iVar) {
        this.cipherAes = gVar;
        this.appSessionManager = aVar;
        this.createSecretKeyAndParamsUC = dVar;
        this.loadAndDecryptUserKeyDataUC = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0231  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0242  */
    /* JADX WARN: Code duplicated, block: B:82:0x0250  */
    /* JADX WARN: Code duplicated, block: B:84:0x0254  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(qg0.g.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        int i16;
        int i17;
        qg0.g.Params params2;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i18;
        int i19;
        dx.j<dx.b> jVar;
        DecryptedUserKeyData decryptedUserKeyData;
        int i25;
        ex.b bVar4;
        int i26;
        int i27;
        int i28;
        int i29;
        ex.b bVar5;
        ex.b bVar6;
        SecretKey secretKey;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i35 = aVar.f213172v;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f213172v = i35 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f213170s;
        Object objE = uq.b.e();
        ?? r15 = aVar.f213172v;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(objA);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        i iVar = this.loadAndDecryptUserKeyDataUC;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        aVar.f213157d = params;
                        aVar.f213158e = jVarA;
                        aVar.f213159f = vq.j.a(aVar2);
                        aVar.f213160g = aVar2;
                        aVar.f213161h = aVar2;
                        aVar.f213164l = 0;
                        aVar.f213165m = 0;
                        aVar.f213166n = 0;
                        aVar.f213167p = 0;
                        aVar.f213168q = 0;
                        aVar.f213172v = 1;
                        objA = iVar.a(c1792a, aVar);
                        if (objA != objE) {
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            params2 = params;
                            bVar = aVar2;
                            bVar2 = bVar;
                            bVar3 = bVar2;
                            i18 = 0;
                            i19 = 0;
                            jVar = jVarA;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        if (r15 == 2) {
                            i25 = aVar.f213169r;
                            int i36 = aVar.f213168q;
                            i26 = aVar.f213167p;
                            i27 = aVar.f213166n;
                            i28 = aVar.f213165m;
                            i29 = aVar.f213164l;
                            bVar5 = (ex.b) aVar.f213162j;
                            decryptedUserKeyData = (DecryptedUserKeyData) aVar.f213161h;
                            bVar2 = (ex.b) aVar.f213160g;
                            bVar4 = (ex.b) aVar.f213159f;
                            dx.j jVar2 = (dx.j) aVar.f213158e;
                            qg0.g.Params params3 = (qg0.g.Params) aVar.f213157d;
                            try {
                                u.b(objA);
                                i15 = i36;
                                r15 = jVar2;
                                params2 = params3;
                                PassKeyAndParams passKeyAndParams = (PassKeyAndParams) bVar5.a((dx.i) objA);
                                iy.g gVar = this.cipherAes;
                                byte[] data = decryptedUserKeyData.getWrappedMasterKey().getData();
                                DecryptedUserKeyData decryptedUserKeyData2 = decryptedUserKeyData;
                                SecretKey passwordKey = passKeyAndParams.getPasswordKey();
                                ex.b bVar7 = bVar4;
                                qg0.g.Params params4 = params2;
                                try {
                                    iy.h.a.c cVar = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                    aVar.f213157d = vq.j.a(params4);
                                    aVar.f213158e = r15;
                                    aVar.f213159f = vq.j.a(bVar7);
                                    aVar.f213160g = vq.j.a(bVar2);
                                    aVar.f213161h = vq.j.a(decryptedUserKeyData2);
                                    aVar.f213162j = bVar2;
                                    aVar.f213163k = vq.j.a(passKeyAndParams);
                                    aVar.f213164l = i29;
                                    aVar.f213165m = i28;
                                    aVar.f213166n = i27;
                                    aVar.f213167p = i26;
                                    aVar.f213168q = i15;
                                    aVar.f213169r = i25;
                                    aVar.f213172v = 3;
                                    objA = gVar.j(data, passwordKey, cVar, aVar);
                                    if (objA != objE) {
                                        bVar6 = bVar2;
                                        r15 = r15;
                                    }
                                    return objE;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
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
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                r15 = jVar2;
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
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar6 = (ex.b) aVar.f213162j;
                        dx.j jVar3 = (dx.j) aVar.f213158e;
                        u.b(objA);
                        r15 = jVar3;
                        secretKey = (SecretKey) bVar6.a((dx.i) objA);
                        if (secretKey != null) {
                            return new dx.i.Left(new dx.b.Generic(new Exception("LoginToAppUCImpl: Key data cannot be null!")));
                        }
                        this.appSessionManager.c(c0.f(secretKey.getEncoded()));
                        return new dx.i.Right(i0.f148189a);
                    }
                    int i37 = aVar.f213168q;
                    int i38 = aVar.f213167p;
                    int i39 = aVar.f213166n;
                    int i45 = aVar.f213165m;
                    int i46 = aVar.f213164l;
                    ex.b bVar8 = (ex.b) aVar.f213161h;
                    ex.b bVar9 = (ex.b) aVar.f213160g;
                    ex.b bVar10 = (ex.b) aVar.f213159f;
                    dx.j<dx.b> jVar4 = (dx.j) aVar.f213158e;
                    params2 = (qg0.g.Params) aVar.f213157d;
                    try {
                        u.b(objA);
                        i15 = i37;
                        jVar = jVar4;
                        bVar3 = bVar10;
                        bVar2 = bVar9;
                        bVar = bVar8;
                        i19 = i46;
                        i17 = i45;
                        i18 = i39;
                        i16 = i38;
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        r15 = jVar4;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                    decryptedUserKeyData = (DecryptedUserKeyData) bVar.a((dx.i) objA);
                    if (decryptedUserKeyData != null) {
                        d dVar = this.createSecretKeyAndParamsUC;
                        ex.b bVar11 = bVar3;
                        d.Params params5 = new d.Params(params2.getPin(), decryptedUserKeyData.getKeyParams());
                        aVar.f213157d = vq.j.a(params2);
                        aVar.f213158e = jVar;
                        aVar.f213159f = vq.j.a(bVar11);
                        aVar.f213160g = bVar2;
                        aVar.f213161h = decryptedUserKeyData;
                        aVar.f213162j = bVar2;
                        aVar.f213164l = i19;
                        aVar.f213165m = i17;
                        aVar.f213166n = i18;
                        aVar.f213167p = i16;
                        aVar.f213168q = i15;
                        i25 = 0;
                        aVar.f213169r = 0;
                        aVar.f213172v = 2;
                        objA = dVar.h(params5, aVar);
                        if (objA != objE) {
                            bVar4 = bVar11;
                            i26 = i16;
                            i27 = i18;
                            i28 = i17;
                            i29 = i19;
                            bVar5 = bVar2;
                            r15 = jVar;
                            PassKeyAndParams passKeyAndParams2 = (PassKeyAndParams) bVar5.a((dx.i) objA);
                            iy.g gVar2 = this.cipherAes;
                            byte[] data2 = decryptedUserKeyData.getWrappedMasterKey().getData();
                            DecryptedUserKeyData decryptedUserKeyData3 = decryptedUserKeyData;
                            SecretKey passwordKey2 = passKeyAndParams2.getPasswordKey();
                            ex.b bVar12 = bVar4;
                            qg0.g.Params params6 = params2;
                            iy.h.a.c cVar2 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                            aVar.f213157d = vq.j.a(params6);
                            aVar.f213158e = r15;
                            aVar.f213159f = vq.j.a(bVar12);
                            aVar.f213160g = vq.j.a(bVar2);
                            aVar.f213161h = vq.j.a(decryptedUserKeyData3);
                            aVar.f213162j = bVar2;
                            aVar.f213163k = vq.j.a(passKeyAndParams2);
                            aVar.f213164l = i29;
                            aVar.f213165m = i28;
                            aVar.f213166n = i27;
                            aVar.f213167p = i26;
                            aVar.f213168q = i15;
                            aVar.f213169r = i25;
                            aVar.f213172v = 3;
                            objA = gVar2.j(data2, passwordKey2, cVar2, aVar);
                            if (objA != objE) {
                                bVar6 = bVar2;
                                r15 = r15;
                                secretKey = (SecretKey) bVar6.a((dx.i) objA);
                                if (secretKey != null) {
                                    this.appSessionManager.c(c0.f(secretKey.getEncoded()));
                                    return new dx.i.Right(i0.f148189a);
                                }
                            }
                        }
                        return objE;
                    }
                    return new dx.i.Left(new dx.b.Generic(new Exception("LoginToAppUCImpl: Key data cannot be null!")));
                } catch (Exception e29) {
                    e = e29;
                }
            } catch (CancellationException e35) {
                throw e35;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
