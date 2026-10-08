package w24;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw24/l;", "Lw24/k;", "Lw24/n;", "deleteDocumentByTypeUC", "<init>", "(Lw24/n;)V", "Lw24/k$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lw24/k$a;Ltq/e;)Ljava/lang/Object;", "a", "Lw24/n;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n deleteDocumentByTypeUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209740a;

        static {
            int[] iArr = new int[f24.c.values().length];
            try {
                iArr[f24.c.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.c.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.c.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f209740a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209743f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209744g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209745h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209746j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209747k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209748l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209749m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209750n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209751p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f209752q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209754s;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209752q = obj;
            this.f209754s |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, this);
        }
    }

    public l(n nVar) {
        this.deleteDocumentByTypeUC = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(k.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        f24.i iVar;
        ex.b bVar2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f209754s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f209754s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f209752q;
        ?? E = uq.b.e();
        int i16 = bVar.f209754s;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        int i17 = a.f209740a[params.getCertificateType().ordinal()];
                        if (i17 == 1) {
                            iVar = f24.i.ID_CARD;
                        } else if (i17 == 2) {
                            iVar = f24.i.REFUGEE_CARD;
                        } else {
                            if (i17 != 3) {
                                throw new oq.p();
                            }
                            iVar = f24.i.STUDENT_CARD;
                        }
                        n nVar = this.deleteDocumentByTypeUC;
                        n.Params params2 = new n.Params(iVar);
                        bVar.f209741d = vq.j.a(params);
                        bVar.f209742e = jVarA;
                        bVar.f209743f = vq.j.a(aVar);
                        bVar.f209744g = vq.j.a(aVar);
                        bVar.f209745h = vq.j.a(iVar);
                        bVar.f209746j = aVar;
                        bVar.f209747k = 0;
                        bVar.f209748l = 0;
                        bVar.f209749m = 0;
                        bVar.f209750n = 0;
                        bVar.f209751p = 0;
                        bVar.f209754s = 1;
                        Object objC = nVar.c(params2, bVar);
                        if (objC == E) {
                            return E;
                        }
                        obj = objC;
                        bVar2 = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
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
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f209746j;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                bVar2.a((dx.i) obj);
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
