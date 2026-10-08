package w24;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lw24/x1;", "Lw24/w1;", "Lk24/g;", "getMainCertificateTypeUC", "Lk24/f;", "getMainActiveCertificateSerialNumberUC", "<init>", "(Lk24/g;Lk24/f;)V", "Lw24/w1$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lw24/w1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lk24/g;", "b", "Lk24/f;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x1 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k24.g getMainCertificateTypeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k24.f getMainActiveCertificateSerialNumberUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f210024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f210025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f210026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f210027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f210028h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f210029j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f210030k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f210031l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f210032m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f210033n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f210034p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f210035q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f210037s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f210035q = obj;
            this.f210037s |= PKIFailureInfo.systemUnavail;
            return x1.this.c(null, this);
        }
    }

    public x1(k24.g gVar, k24.f fVar) {
        this.getMainCertificateTypeUC = gVar;
        this.getMainActiveCertificateSerialNumberUC = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0130  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(w1.Params params, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        dx.j<dx.b> jVar;
        w1.Params params2;
        int i15;
        ex.b bVar2;
        ex.b bVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        f24.c cVar;
        w1.Params params3;
        boolean z15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f210037s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f210037s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f210035q;
        Object objE = uq.b.e();
        int i26 = aVar.f210037s;
        ?? r15 = 2;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objC);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    k24.g gVar = this.getMainCertificateTypeUC;
                    k24.g.Params params4 = new k24.g.Params(false, 1, null);
                    aVar.f210024d = params;
                    aVar.f210025e = jVarA;
                    aVar.f210026f = vq.j.a(aVar2);
                    aVar.f210027g = aVar2;
                    aVar.f210028h = aVar2;
                    aVar.f210030k = 0;
                    aVar.f210031l = 0;
                    aVar.f210032m = 0;
                    aVar.f210033n = 0;
                    aVar.f210034p = 0;
                    aVar.f210037s = 1;
                    objC = gVar.c(params4, aVar);
                    if (objC != objE) {
                        jVar = jVarA;
                        i19 = 0;
                        i18 = 0;
                        i17 = 0;
                        params2 = params;
                        bVar2 = aVar2;
                        bVar3 = bVar2;
                        bVar = bVar3;
                        i15 = 0;
                        i16 = 0;
                    }
                    return objE;
                }
                try {
                    if (i26 == 1) {
                        int i27 = aVar.f210034p;
                        int i28 = aVar.f210033n;
                        int i29 = aVar.f210032m;
                        int i35 = aVar.f210031l;
                        int i36 = aVar.f210030k;
                        ex.b bVar4 = (ex.b) aVar.f210028h;
                        ex.b bVar5 = (ex.b) aVar.f210027g;
                        bVar = (ex.b) aVar.f210026f;
                        jVar = (dx.j) aVar.f210025e;
                        params2 = (w1.Params) aVar.f210024d;
                        try {
                            oq.u.b(objC);
                            i15 = i27;
                            bVar2 = bVar5;
                            bVar3 = bVar4;
                            i16 = i36;
                            i17 = i35;
                            i18 = i29;
                            i19 = i28;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = (f24.c) aVar.f210029j;
                        bVar2 = (ex.b) aVar.f210028h;
                        params3 = (w1.Params) aVar.f210024d;
                        oq.u.b(objC);
                    }
                    if (fr.t.c(iy.c0.e(params3.getSerialNumber()), iy.c0.e((iy.b0) bVar2.a((dx.i) objC))) || params3.getCertificateType() != cVar) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    return new dx.i.Right(vq.b.a(z15));
                } catch (CancellationException e18) {
                    throw e18;
                }
                f24.c cVar2 = (f24.c) bVar3.a((dx.i) objC);
                k24.f fVar2 = this.getMainActiveCertificateSerialNumberUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                aVar.f210024d = params2;
                aVar.f210025e = jVar;
                aVar.f210026f = vq.j.a(bVar);
                aVar.f210027g = vq.j.a(bVar2);
                aVar.f210028h = bVar2;
                aVar.f210029j = cVar2;
                aVar.f210030k = i16;
                aVar.f210031l = i17;
                aVar.f210032m = i18;
                aVar.f210033n = i19;
                aVar.f210034p = i15;
                aVar.f210037s = 2;
                Object objC2 = fVar2.c(c1792a, aVar);
                if (objC2 != objE) {
                    cVar = cVar2;
                    objC = objC2;
                    params3 = params2;
                    if (fr.t.c(iy.c0.e(params3.getSerialNumber()), iy.c0.e((iy.b0) bVar2.a((dx.i) objC)))) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    return new dx.i.Right(vq.b.a(z15));
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
