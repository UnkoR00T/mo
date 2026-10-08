package w24;

import f24.CertificateData;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lw24/v0;", "Lk24/f;", "Lv24/a;", "certificateRepository", "<init>", "(Lv24/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Liy/b0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv24/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 implements k24.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.a certificateRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209978h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209980k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209981l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209982m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209983n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209984p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f209985q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209987s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209985q = obj;
            this.f209987s |= PKIFailureInfo.systemUnavail;
            return v0.this.c(null, this);
        }
    }

    public v0(v24.a aVar) {
        this.certificateRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, iy.b0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        gz.b.a.C1792a c1792a2;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i19;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f209987s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209987s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB2 = aVar.f209985q;
        ?? E = uq.b.e();
        int i26 = aVar.f209987s;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objB2);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        v24.a aVar3 = this.certificateRepository;
                        aVar.f209974d = vq.j.a(c1792a);
                        aVar.f209975e = jVarA;
                        aVar.f209976f = vq.j.a(aVar2);
                        aVar.f209977g = aVar2;
                        aVar.f209978h = aVar2;
                        i15 = 0;
                        aVar.f209980k = 0;
                        aVar.f209981l = 0;
                        aVar.f209982m = 0;
                        aVar.f209983n = 0;
                        aVar.f209984p = 0;
                        aVar.f209987s = 1;
                        Object objE = aVar3.e(true, aVar);
                        if (objE != E) {
                            c1792a2 = c1792a;
                            jVar = jVarA;
                            objB2 = objE;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                            bVar3 = bVar2;
                            i19 = 0;
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
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
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f209978h;
                    try {
                        oq.u.b(objB2);
                        return new dx.i.Right(iy.c0.g(((CertificateData) bVar.a((dx.i) objB2)).getCertKeyPair().getCertificate().getSerialNumber().toString(16)));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = aVar.f209984p;
                i16 = aVar.f209983n;
                i17 = aVar.f209982m;
                int i28 = aVar.f209981l;
                int i29 = aVar.f209980k;
                ex.b bVar4 = (ex.b) aVar.f209978h;
                ex.b bVar5 = (ex.b) aVar.f209977g;
                bVar3 = (ex.b) aVar.f209976f;
                jVar = (dx.j) aVar.f209975e;
                c1792a2 = (gz.b.a.C1792a) aVar.f209974d;
                try {
                    oq.u.b(objB2);
                    i15 = i27;
                    bVar = bVar5;
                    bVar2 = bVar4;
                    i19 = i29;
                    i18 = i28;
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    E = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
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
                f24.c cVar = (f24.c) bVar2.a((dx.i) objB2);
                v24.a aVar4 = this.certificateRepository;
                aVar.f209974d = vq.j.a(c1792a2);
                aVar.f209975e = jVar;
                aVar.f209976f = vq.j.a(bVar3);
                aVar.f209977g = vq.j.a(bVar);
                aVar.f209978h = bVar;
                aVar.f209979j = vq.j.a(cVar);
                aVar.f209980k = i19;
                aVar.f209981l = i18;
                aVar.f209982m = i17;
                aVar.f209983n = i16;
                aVar.f209984p = i15;
                aVar.f209987s = 2;
                objB2 = aVar4.b(cVar, aVar);
                if (objB2 != E) {
                    return new dx.i.Right(iy.c0.g(((CertificateData) bVar.a((dx.i) objB2)).getCertKeyPair().getCertificate().getSerialNumber().toString(16)));
                }
                return E;
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }
}
