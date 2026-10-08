package bd4;

import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbd4/d;", "Lz64/d;", "Lq34/f;", "clearDocumentsSummaryDataUC", "Lq34/e;", "clearDocumentsDatabaseUseCase", "<init>", "(Lq34/f;Lq34/e;)V", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "b", "Lq34/f;", "Lq34/e;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements z64.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q34.f clearDocumentsSummaryDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.e clearDocumentsDatabaseUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f18595h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f18596j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f18597k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f18598l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f18599m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18601p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f18599m = obj;
            this.f18601p |= PKIFailureInfo.systemUnavail;
            return d.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f18606h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f18607j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f18608k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f18609l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f18610m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18612p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f18610m = obj;
            this.f18612p |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    public d(q34.f fVar, q34.e eVar) {
        this.clearDocumentsSummaryDataUC = fVar;
        this.clearDocumentsDatabaseUseCase = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bd4.d$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // z64.d
    public Object a(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            b bVar2 = (b) eVar;
            int i15 = bVar2.f18612p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f18612p = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar2;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f18610m;
        Object objE = uq.b.e();
        int i16 = bVar.f18612p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        q34.f fVar = this.clearDocumentsSummaryDataUC;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        bVar.f18607j = jVarA;
                        bVar.f18608k = vq.j.a(aVar);
                        bVar.f18609l = vq.j.a(aVar);
                        bVar.f18602d = 0;
                        bVar.f18603e = 0;
                        bVar.f18604f = 0;
                        bVar.f18605g = 0;
                        bVar.f18606h = 0;
                        bVar.f18612p = 1;
                        if (fVar.c(c1792a, bVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        bVar = jVarA;
                        e = e18;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(bVar));
                        i iVarA = bVar.a(e);
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
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bd4.d$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // z64.d
    public Object b(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            int i15 = aVar2.f18601p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f18601p = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar2;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f18599m;
        Object objE = uq.b.e();
        int i16 = aVar.f18601p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        q34.e eVar2 = this.clearDocumentsDatabaseUseCase;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        aVar.f18596j = jVarA;
                        aVar.f18597k = vq.j.a(aVar3);
                        aVar.f18598l = vq.j.a(aVar3);
                        aVar.f18591d = 0;
                        aVar.f18592e = 0;
                        aVar.f18593f = 0;
                        aVar.f18594g = 0;
                        aVar.f18595h = 0;
                        aVar.f18601p = 1;
                        if (eVar2.c(c1792a, aVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        aVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        i iVarA = aVar.a(e);
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
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
