package c04;

import iy.c0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lc04/e;", "Lwz3/d;", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Lzz3/a;", "authenticationContainersInteractor", "<init>", "(Liy/j;Liy/a;Lzz3/a;)V", "Lwz3/d$a;", "params", "Ldx/i;", "Ldx/b;", "Lry/a;", "d", "(Lwz3/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/j;", "b", "Liy/a;", "c", "Lzz3/a;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements wz3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zz3.a authenticationContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22416g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f22417h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f22418j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f22419k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f22420l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f22421m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f22422n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f22423p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f22424q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f22426s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22424q = obj;
            this.f22426s |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(iy.j jVar, iy.a aVar, zz3.a aVar2) {
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.authenticationContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0120 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0124 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x013e A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0142 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0171 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0177 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x017d A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0183 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:45:0x0105, B:51:0x0138, B:57:0x015c, B:54:0x013e, B:56:0x0142, B:58:0x0171, B:59:0x0176, B:48:0x0120, B:50:0x0124, B:60:0x0177, B:61:0x017c, B:72:0x01a9, B:75:0x01b7, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:62:0x017d, B:63:0x0182, B:64:0x0183, B:65:0x019f), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(wz3.d.Params params, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        dx.j<dx.b> jVar;
        wz3.d.Params params2;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        int i19;
        dx.i iVar;
        ex.b bVar3;
        ex.b bVar4;
        wz3.d.Params params3;
        dx.i<dx.b, byte[]> iVarC;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f22426s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f22426s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objF = aVar.f22424q;
        Object objE = uq.b.e();
        int i26 = aVar.f22426s;
        ?? r15 = 1;
        try {
            try {
                try {
                    if (i26 != 0) {
                        if (i26 == 1) {
                            i16 = aVar.f22423p;
                            int i27 = aVar.f22422n;
                            i17 = aVar.f22421m;
                            int i28 = aVar.f22420l;
                            int i29 = aVar.f22419k;
                            bVar = (ex.b) aVar.f22416g;
                            ex.b bVar5 = (ex.b) aVar.f22415f;
                            dx.j<dx.b> jVar2 = (dx.j) aVar.f22414e;
                            params2 = (wz3.d.Params) aVar.f22413d;
                            try {
                                u.b(objF);
                                i15 = i27;
                                jVar = jVar2;
                                bVar2 = bVar5;
                                i19 = i29;
                                i18 = i28;
                                iVar = (dx.i) objF;
                                if (!(iVar instanceof dx.i.Left)) {
                                    bVar.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                    throw new oq.g();
                                }
                                if (iVar instanceof dx.i.Right) {
                                    throw new p();
                                }
                                k34.u uVar = (k34.u) ((dx.i.Right) iVar).b();
                                zz3.a aVar2 = this.authenticationContainersInteractor;
                                aVar.f22413d = params2;
                                aVar.f22414e = jVar;
                                aVar.f22415f = vq.j.a(bVar2);
                                aVar.f22416g = bVar;
                                aVar.f22417h = vq.j.a(uVar);
                                aVar.f22418j = bVar;
                                aVar.f22419k = i19;
                                aVar.f22420l = i18;
                                aVar.f22421m = i17;
                                aVar.f22422n = i15;
                                aVar.f22423p = i16;
                                aVar.f22426s = 2;
                                objF = aVar2.b(uVar, aVar);
                                if (objF != objE) {
                                    bVar3 = bVar;
                                    bVar4 = bVar3;
                                    params3 = params2;
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar2;
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
                        }
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) aVar.f22418j;
                        bVar4 = (ex.b) aVar.f22416g;
                        params3 = (wz3.d.Params) aVar.f22413d;
                        u.b(objF);
                        iVarC = this.cmsManager.c(c0.e(params3.getValue()), (CertKeyPair) bVar3.a((dx.i) objF));
                        if (!(iVarC instanceof dx.i.Left)) {
                            if (iVarC instanceof dx.i.Right) {
                                throw new p();
                            }
                            iVarC = new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarC).b(), null, 2, null));
                        }
                        if (!(iVarC instanceof dx.i.Left)) {
                            if (iVarC instanceof dx.i.Right) {
                                throw new p();
                            }
                            iVarC = new dx.i.Right(ry.a.a(ry.a.b(c0.g((String) ((dx.i.Right) iVarC).b()))));
                        }
                        return new dx.i.Right(ry.a.a(((ry.a) bVar4.a(iVarC)).getData()));
                    }
                    u.b(objF);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        zz3.a aVar4 = this.authenticationContainersInteractor;
                        aVar.f22413d = params;
                        aVar.f22414e = jVarA;
                        aVar.f22415f = vq.j.a(aVar3);
                        aVar.f22416g = aVar3;
                        i15 = 0;
                        aVar.f22419k = 0;
                        aVar.f22420l = 0;
                        aVar.f22421m = 0;
                        aVar.f22422n = 0;
                        aVar.f22423p = 0;
                        aVar.f22426s = 1;
                        objF = zz3.a.f(aVar4, false, aVar, 1, null);
                        if (objF != objE) {
                            jVar = jVarA;
                            params2 = params;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar3;
                            bVar2 = bVar;
                            i19 = 0;
                            iVar = (dx.i) objF;
                            if (!(iVar instanceof dx.i.Left)) {
                                bVar.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                throw new oq.g();
                            }
                            if (iVar instanceof dx.i.Right) {
                                throw new p();
                            }
                            k34.u uVar2 = (k34.u) ((dx.i.Right) iVar).b();
                            zz3.a aVar5 = this.authenticationContainersInteractor;
                            aVar.f22413d = params2;
                            aVar.f22414e = jVar;
                            aVar.f22415f = vq.j.a(bVar2);
                            aVar.f22416g = bVar;
                            aVar.f22417h = vq.j.a(uVar2);
                            aVar.f22418j = bVar;
                            aVar.f22419k = i19;
                            aVar.f22420l = i18;
                            aVar.f22421m = i17;
                            aVar.f22422n = i15;
                            aVar.f22423p = i16;
                            aVar.f22426s = 2;
                            objF = aVar5.b(uVar2, aVar);
                            if (objF != objE) {
                                bVar3 = bVar;
                                bVar4 = bVar3;
                                params3 = params2;
                                iVarC = this.cmsManager.c(c0.e(params3.getValue()), (CertKeyPair) bVar3.a((dx.i) objF));
                                if (!(iVarC instanceof dx.i.Left)) {
                                    if (iVarC instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    iVarC = new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarC).b(), null, 2, null));
                                }
                                if (!(iVarC instanceof dx.i.Left)) {
                                    if (iVarC instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    iVarC = new dx.i.Right(ry.a.a(ry.a.b(c0.g((String) ((dx.i.Right) iVarC).b()))));
                                }
                                return new dx.i.Right(ry.a.a(((ry.a) bVar4.a(iVarC)).getData()));
                            }
                        }
                        return objE;
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVarA;
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
                } catch (Exception e26) {
                    e = e26;
                }
            } catch (CancellationException e27) {
                throw e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
