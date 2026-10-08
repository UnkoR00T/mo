package w24;

import f24.Document;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw24/w;", "Lw24/v;", "Lv24/b;", "documentsContainerRepository", "Lv24/a;", "certificateRepository", "<init>", "(Lv24/b;Lv24/a;)V", "Lw24/v$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lf24/e;", "d", "(Lw24/v$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "b", "Lv24/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v24.a certificateRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f210004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f210005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f210006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f210007g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f210008h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f210009j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f210010k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f210011l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f210012m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f210013n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f210014p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f210015q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f210017s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f210015q = obj;
            this.f210017s |= PKIFailureInfo.systemUnavail;
            return w.this.c(null, this);
        }
    }

    public w(v24.b bVar, v24.a aVar) {
        this.documentsContainerRepository = bVar;
        this.certificateRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x0142  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(v.Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<Document>>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        v.Params params2;
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
            int i25 = aVar.f210017s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f210017s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objH = aVar.f210015q;
        ?? E = uq.b.e();
        int i26 = aVar.f210017s;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objH);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        v24.a aVar3 = this.certificateRepository;
                        f24.c certificateType = params.getCertificateType();
                        aVar.f210004d = vq.j.a(params);
                        aVar.f210005e = jVarA;
                        aVar.f210006f = vq.j.a(aVar2);
                        aVar.f210007g = aVar2;
                        aVar.f210008h = aVar2;
                        i15 = 0;
                        aVar.f210009j = 0;
                        aVar.f210010k = 0;
                        aVar.f210011l = 0;
                        aVar.f210012m = 0;
                        aVar.f210013n = 0;
                        aVar.f210017s = 1;
                        Object objJ = aVar3.j(certificateType, aVar);
                        if (objJ != E) {
                            params2 = params;
                            jVar = jVarA;
                            objH = objJ;
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
                    bVar = (ex.b) aVar.f210008h;
                    try {
                        oq.u.b(objH);
                        return new dx.i.Right((List) bVar.a((dx.i) objH));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = aVar.f210013n;
                i16 = aVar.f210012m;
                i17 = aVar.f210011l;
                i18 = aVar.f210010k;
                int i28 = aVar.f210009j;
                ex.b bVar4 = (ex.b) aVar.f210008h;
                ex.b bVar5 = (ex.b) aVar.f210007g;
                bVar3 = (ex.b) aVar.f210006f;
                jVar = (dx.j) aVar.f210005e;
                params2 = (v.Params) aVar.f210004d;
                try {
                    oq.u.b(objH);
                    i15 = i27;
                    bVar = bVar5;
                    bVar2 = bVar4;
                    i19 = i28;
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
                int iIntValue = ((Number) bVar2.a((dx.i) objH)).intValue();
                v24.b bVar6 = this.documentsContainerRepository;
                aVar.f210004d = vq.j.a(params2);
                aVar.f210005e = jVar;
                aVar.f210006f = vq.j.a(bVar3);
                aVar.f210007g = vq.j.a(bVar);
                aVar.f210008h = bVar;
                aVar.f210009j = i19;
                aVar.f210010k = i18;
                aVar.f210011l = i17;
                aVar.f210012m = i16;
                aVar.f210013n = i15;
                aVar.f210014p = iIntValue;
                aVar.f210017s = 2;
                objH = bVar6.h(iIntValue, aVar);
                if (objH != E) {
                    return new dx.i.Right((List) bVar.a((dx.i) objH));
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
