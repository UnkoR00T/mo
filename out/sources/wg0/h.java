package wg0;

import iy.q;
import iy.r;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pg0.DecryptedUserKeyData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwg0/h;", "Lqg0/f;", "Liy/g;", "cipherAes", "Lwg0/d;", "createPassKeyAndParamsUC", "Lwg0/i;", "loadAndDecryptUserKeyDataUC", "<init>", "(Liy/g;Lwg0/d;Lwg0/i;)V", "Lqg0/f$a;", "params", "", "d", "(Lqg0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/g;", "b", "Lwg0/d;", "c", "Lwg0/i;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements qg0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d createPassKeyAndParamsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i loadAndDecryptUserKeyDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213120g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213121h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213122j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213123k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f213124l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f213125m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213126n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213127p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213128q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213129r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f213130s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f213132v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213130s = obj;
            this.f213132v |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(iy.g gVar, d dVar, i iVar) {
        this.cipherAes = gVar;
        this.createPassKeyAndParamsUC = dVar;
        this.loadAndDecryptUserKeyDataUC = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e2 A[Catch: Exception -> 0x0050, c -> 0x0053, CancellationException -> 0x0056, TryCatch #0 {Exception -> 0x0050, blocks: (B:14:0x004b, B:57:0x01d8, B:59:0x01e2, B:61:0x01e9, B:62:0x01fd, B:63:0x01fe, B:66:0x020c, B:53:0x016a, B:47:0x0118, B:49:0x0122, B:43:0x00e1), top: B:86:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0215  */
    /* JADX WARN: Code duplicated, block: B:72:0x0226  */
    /* JADX WARN: Code duplicated, block: B:73:0x0234  */
    /* JADX WARN: Code duplicated, block: B:75:0x0238  */
    /* JADX WARN: Code duplicated, block: B:79:0x024a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x024c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0252  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(qg0.f.Params params, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.i left;
        boolean z15;
        int i15;
        qg0.f.Params params2;
        int i16;
        dx.j<dx.b> jVarA;
        int i17;
        ex.b bVar;
        int i18;
        ex.b bVar2;
        ex.b aVar2;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        ex.b bVar3;
        ex.b bVar4;
        DecryptedUserKeyData decryptedUserKeyData;
        int i29;
        ex.b bVar5;
        ex.b bVar6;
        SecretKey secretKey;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i35 = aVar.f213132v;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f213132v = i35 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objJ = aVar.f213130s;
        Object objE = uq.b.e();
        int i36 = aVar.f213132v;
        ?? r15 = 3;
        try {
            try {
                if (i36 == 0) {
                    u.b(objJ);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    i iVar = this.loadAndDecryptUserKeyDataUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    aVar.f213117d = params;
                    aVar.f213118e = jVarA;
                    aVar.f213119f = vq.j.a(aVar2);
                    aVar.f213120g = aVar2;
                    aVar.f213121h = aVar2;
                    aVar.f213124l = 0;
                    aVar.f213125m = 0;
                    aVar.f213126n = 0;
                    aVar.f213127p = 0;
                    aVar.f213128q = 0;
                    aVar.f213132v = 1;
                    objJ = iVar.a(c1792a, aVar);
                    if (objJ != objE) {
                        params2 = params;
                        bVar2 = aVar2;
                        bVar = bVar2;
                        i15 = 0;
                        i16 = 0;
                        i18 = 0;
                        i19 = 0;
                        i17 = 0;
                    }
                    return objE;
                }
                try {
                    if (i36 != 1) {
                        if (i36 == 2) {
                            i25 = aVar.f213129r;
                            int i37 = aVar.f213128q;
                            i16 = aVar.f213127p;
                            i26 = aVar.f213126n;
                            i27 = aVar.f213125m;
                            i28 = aVar.f213124l;
                            bVar3 = (ex.b) aVar.f213122j;
                            DecryptedUserKeyData decryptedUserKeyData2 = (DecryptedUserKeyData) aVar.f213121h;
                            bVar = (ex.b) aVar.f213120g;
                            ex.b bVar7 = (ex.b) aVar.f213119f;
                            dx.j<dx.b> jVar = (dx.j) aVar.f213118e;
                            qg0.f.Params params3 = (qg0.f.Params) aVar.f213117d;
                            try {
                                u.b(objJ);
                                bVar4 = bVar7;
                                jVarA = jVar;
                                decryptedUserKeyData = decryptedUserKeyData2;
                                params2 = params3;
                                i29 = i37;
                                PassKeyAndParams passKeyAndParams = (PassKeyAndParams) bVar3.a((dx.i) objJ);
                                iy.g gVar = this.cipherAes;
                                byte[] data = decryptedUserKeyData.getWrappedMasterKey().getData();
                                SecretKey passwordKey = passKeyAndParams.getPasswordKey();
                                iy.h.a.c cVar = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                aVar.f213117d = vq.j.a(params2);
                                aVar.f213118e = jVarA;
                                aVar.f213119f = vq.j.a(bVar4);
                                aVar.f213120g = bVar;
                                aVar.f213121h = vq.j.a(decryptedUserKeyData);
                                aVar.f213122j = bVar;
                                aVar.f213123k = vq.j.a(passKeyAndParams);
                                aVar.f213124l = i28;
                                aVar.f213125m = i27;
                                aVar.f213126n = i26;
                                aVar.f213127p = i16;
                                aVar.f213128q = i29;
                                aVar.f213129r = i25;
                                aVar.f213132v = 3;
                                objJ = gVar.j(data, passwordKey, cVar, aVar);
                                if (objJ != objE) {
                                    bVar5 = bVar;
                                    bVar6 = bVar5;
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
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
                                left = new dx.i.Left(objB);
                            }
                        } else {
                            if (i36 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar5 = (ex.b) aVar.f213122j;
                            bVar6 = (ex.b) aVar.f213120g;
                            u.b(objJ);
                        }
                        secretKey = (SecretKey) bVar5.a((dx.i) objJ);
                        if (secretKey == null) {
                            bVar = bVar6;
                            bVar.b(new dx.b.Generic(new NullPointerException("IsUserPinValidUCImpl: userKeyData is null")));
                            throw new oq.g();
                        }
                        left = new dx.i.Right(secretKey);
                    } else {
                        i15 = aVar.f213128q;
                        int i38 = aVar.f213127p;
                        int i39 = aVar.f213126n;
                        int i45 = aVar.f213125m;
                        int i46 = aVar.f213124l;
                        ex.b bVar8 = (ex.b) aVar.f213121h;
                        ex.b bVar9 = (ex.b) aVar.f213120g;
                        ex.b bVar10 = (ex.b) aVar.f213119f;
                        dx.j<dx.b> jVar2 = (dx.j) aVar.f213118e;
                        params2 = (qg0.f.Params) aVar.f213117d;
                        try {
                            u.b(objJ);
                            i16 = i38;
                            jVarA = jVar2;
                            i17 = i46;
                            bVar = bVar9;
                            i18 = i39;
                            bVar2 = bVar8;
                            aVar2 = bVar10;
                            i19 = i45;
                        } catch (ex.c e18) {
                            e = e18;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
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
                                if (iVarA instanceof dx.i.Right) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                        }
                    }
                    if (left.a() != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    return vq.b.a(z15);
                } catch (CancellationException e26) {
                    throw e26;
                }
                DecryptedUserKeyData decryptedUserKeyData3 = (DecryptedUserKeyData) bVar2.a((dx.i) objJ);
                if (decryptedUserKeyData3 != null) {
                    d dVar = this.createPassKeyAndParamsUC;
                    ex.b bVar11 = aVar2;
                    d.Params params4 = new d.Params(params2.getPin(), decryptedUserKeyData3.getKeyParams());
                    aVar.f213117d = vq.j.a(params2);
                    aVar.f213118e = jVarA;
                    aVar.f213119f = vq.j.a(bVar11);
                    aVar.f213120g = bVar;
                    aVar.f213121h = decryptedUserKeyData3;
                    aVar.f213122j = bVar;
                    aVar.f213124l = i17;
                    aVar.f213125m = i19;
                    aVar.f213126n = i18;
                    aVar.f213127p = i16;
                    aVar.f213128q = i15;
                    aVar.f213129r = 0;
                    aVar.f213132v = 2;
                    Object objH = dVar.h(params4, aVar);
                    if (objH != objE) {
                        decryptedUserKeyData = decryptedUserKeyData3;
                        i29 = i15;
                        i25 = 0;
                        objJ = objH;
                        i26 = i18;
                        i27 = i19;
                        i28 = i17;
                        bVar3 = bVar;
                        bVar4 = bVar11;
                        PassKeyAndParams passKeyAndParams2 = (PassKeyAndParams) bVar3.a((dx.i) objJ);
                        iy.g gVar2 = this.cipherAes;
                        byte[] data2 = decryptedUserKeyData.getWrappedMasterKey().getData();
                        SecretKey passwordKey2 = passKeyAndParams2.getPasswordKey();
                        iy.h.a.c cVar2 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                        aVar.f213117d = vq.j.a(params2);
                        aVar.f213118e = jVarA;
                        aVar.f213119f = vq.j.a(bVar4);
                        aVar.f213120g = bVar;
                        aVar.f213121h = vq.j.a(decryptedUserKeyData);
                        aVar.f213122j = bVar;
                        aVar.f213123k = vq.j.a(passKeyAndParams2);
                        aVar.f213124l = i28;
                        aVar.f213125m = i27;
                        aVar.f213126n = i26;
                        aVar.f213127p = i16;
                        aVar.f213128q = i29;
                        aVar.f213129r = i25;
                        aVar.f213132v = 3;
                        objJ = gVar2.j(data2, passwordKey2, cVar2, aVar);
                        if (objJ != objE) {
                            bVar5 = bVar;
                            bVar6 = bVar5;
                            secretKey = (SecretKey) bVar5.a((dx.i) objJ);
                            if (secretKey == null) {
                                left = new dx.i.Right(secretKey);
                                if (left.a() != null) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                return vq.b.a(z15);
                            }
                            bVar = bVar6;
                        }
                    }
                    return objE;
                }
                bVar.b(new dx.b.Generic(new NullPointerException("IsUserPinValidUCImpl: userKeyData is null")));
                throw new oq.g();
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
