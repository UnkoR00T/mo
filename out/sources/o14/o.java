package o14;

import a14.a0;
import a14.y;
import a14.z;
import fu.r;
import java.util.concurrent.CancellationException;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.DomainFile;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lo14/o;", "La14/z;", "La14/a0;", "saveFilesOnDeviceUseCase", "La14/y;", "requestPermissionUseCase", "<init>", "(La14/a0;La14/y;)V", "", "fileNameWithExtension", "d", "(Ljava/lang/String;)Ljava/lang/String;", "e", "La14/z$a;", "params", "Ldx/i;", "Ldx/b;", "Lu04/b;", "f", "(La14/z$a;Ltq/e;)Ljava/lang/Object;", "a", "La14/a0;", "getSaveFilesOnDeviceUseCase", "()La14/a0;", "b", "La14/y;", "getRequestPermissionUseCase", "()La14/y;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y requestPermissionUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f140651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f140652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f140653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f140654h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f140655j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f140656k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f140657l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f140658m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f140659n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f140660p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f140661q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f140662r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f140664t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140662r = obj;
            this.f140664t |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, this);
        }
    }

    public o(a0 a0Var, y yVar) {
        this.saveFilesOnDeviceUseCase = a0Var;
        this.requestPermissionUseCase = yVar;
    }

    private final String d(String fileNameWithExtension) {
        return r.P(r.k1(fileNameWithExtension, ".", null, 2, null), "?=", "", false, 4, null);
    }

    private final String e(String fileNameWithExtension) {
        return r.s1(fileNameWithExtension, ".", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(z.Params params, tq.e<? super dx.i<? extends dx.b, ? extends u04.b>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        z.Params params2;
        u04.c cVar;
        ex.b aVar2;
        int i15;
        z.Params params3;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f140664t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f140664t = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f140662r;
        Object objE = uq.b.e();
        ?? r15 = aVar.f140664t;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(objC);
                        y yVar = this.requestPermissionUseCase;
                        y.Params params4 = new y.Params(gy.d.EXTERNAL_STORAGE);
                        aVar.f140650d = params;
                        aVar.f140664t = 1;
                        objC = yVar.c(params4, aVar);
                        if (objC != objE) {
                            params2 = params;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        if (r15 == 2) {
                            int i26 = aVar.f140661q;
                            i16 = aVar.f140660p;
                            i17 = aVar.f140659n;
                            int i27 = aVar.f140658m;
                            int i28 = aVar.f140657l;
                            ex.b bVar4 = (ex.b) aVar.f140655j;
                            ex.b bVar5 = (ex.b) aVar.f140654h;
                            ex.b bVar6 = (ex.b) aVar.f140653g;
                            dx.j<dx.b> jVar2 = (dx.j) aVar.f140652f;
                            cVar = (u04.c) aVar.f140651e;
                            params3 = (z.Params) aVar.f140650d;
                            try {
                                u.b(objC);
                                i15 = i26;
                                jVar = jVar2;
                                bVar2 = bVar6;
                                bVar = bVar4;
                                aVar2 = bVar5;
                                i19 = i28;
                                i18 = i27;
                                DomainFile domainFile = (DomainFile) bVar.a((dx.i) objC);
                                a0 a0Var = this.saveFilesOnDeviceUseCase;
                                a0.Params params5 = new a0.Params(domainFile.getInputStream(), e(domainFile.getFileName()), d(domainFile.getFileName()));
                                aVar.f140650d = vq.j.a(params3);
                                aVar.f140651e = vq.j.a(cVar);
                                aVar.f140652f = jVar;
                                aVar.f140653g = vq.j.a(bVar2);
                                aVar.f140654h = vq.j.a(aVar2);
                                aVar.f140655j = aVar2;
                                aVar.f140656k = vq.j.a(domainFile);
                                aVar.f140657l = i19;
                                aVar.f140658m = i18;
                                aVar.f140659n = i17;
                                aVar.f140660p = i16;
                                aVar.f140661q = i15;
                                aVar.f140664t = 3;
                                objC = a0Var.c(params5, aVar);
                                if (objC != objE) {
                                    bVar3 = aVar2;
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
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) aVar.f140655j;
                        u.b(objC);
                        bVar3.a((dx.i) objC);
                        return new dx.i.Right(u04.b.OK);
                    }
                    params2 = (z.Params) aVar.f140650d;
                    u.b(objC);
                    cVar = (u04.c) objC;
                    if (cVar instanceof u04.c.b) {
                        return new dx.i.Right(((u04.c.b) cVar).getShouldShowRationale() ? u04.b.NOT_PERMISSION_GRANTED : u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS);
                    }
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        er.l<tq.e<? super dx.i<? extends dx.b, DomainFile>>, Object> lVarA = params2.a();
                        aVar.f140650d = vq.j.a(params2);
                        aVar.f140651e = vq.j.a(cVar);
                        aVar.f140652f = jVarA;
                        aVar.f140653g = vq.j.a(aVar2);
                        aVar.f140654h = aVar2;
                        aVar.f140655j = aVar2;
                        i15 = 0;
                        aVar.f140657l = 0;
                        aVar.f140658m = 0;
                        aVar.f140659n = 0;
                        aVar.f140660p = 0;
                        aVar.f140661q = 0;
                        aVar.f140664t = 2;
                        objC = lVarA.b(aVar);
                        if (objC != objE) {
                            params3 = params2;
                            jVar = jVarA;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                            DomainFile domainFile2 = (DomainFile) bVar.a((dx.i) objC);
                            a0 a0Var2 = this.saveFilesOnDeviceUseCase;
                            a0.Params params6 = new a0.Params(domainFile2.getInputStream(), e(domainFile2.getFileName()), d(domainFile2.getFileName()));
                            aVar.f140650d = vq.j.a(params3);
                            aVar.f140651e = vq.j.a(cVar);
                            aVar.f140652f = jVar;
                            aVar.f140653g = vq.j.a(bVar2);
                            aVar.f140654h = vq.j.a(aVar2);
                            aVar.f140655j = aVar2;
                            aVar.f140656k = vq.j.a(domainFile2);
                            aVar.f140657l = i19;
                            aVar.f140658m = i18;
                            aVar.f140659n = i17;
                            aVar.f140660p = i16;
                            aVar.f140661q = i15;
                            aVar.f140664t = 3;
                            objC = a0Var2.c(params6, aVar);
                            if (objC != objE) {
                                bVar3 = aVar2;
                                bVar3.a((dx.i) objC);
                                return new dx.i.Right(u04.b.OK);
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
                                throw new oq.p();
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
