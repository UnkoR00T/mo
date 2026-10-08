package nf0;

import iy.c0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnf0/g;", "Ldf0/g;", "Ljf0/a;", "documentDownloadRepository", "Lmf0/a;", "downloadTaskDataRepository", "La80/c;", "asyncMainDocumentTerminationUC", "Lof0/a;", "asyncDownloadDocumentsManager", "<init>", "(Ljf0/a;Lmf0/a;La80/c;Lof0/a;)V", "Ldf0/g$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ldf0/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljf0/a;", "b", "Lmf0/a;", "c", "La80/c;", "Lof0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements df0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jf0.a documentDownloadRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a80.c asyncMainDocumentTerminationUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final of0.a asyncDownloadDocumentsManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f135615h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f135616j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f135617k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135618l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135619m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f135620n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f135622q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135620n = obj;
            this.f135622q |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(jf0.a aVar, mf0.a aVar2, a80.c cVar, of0.a aVar3) {
        this.documentDownloadRepository = aVar;
        this.downloadTaskDataRepository = aVar2;
        this.asyncMainDocumentTerminationUC = cVar;
        this.asyncDownloadDocumentsManager = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [df0.g$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v15, types: [df0.g$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v33 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(df0.g.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        int i19;
        ex.c e15;
        ?? r15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f135622q;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f135622q = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f135620n;
        Object objE = uq.b.e();
        int i26 = aVar.f135622q;
        try {
            try {
                if (i26 == 0) {
                    u.b(obj);
                    jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        a80.c cVar = this.asyncMainDocumentTerminationUC;
                        a80.c.Params params2 = new a80.c.Params(c0.g(params.getAuthToken()));
                        aVar.f135611d = params;
                        aVar.f135612e = jVarA;
                        aVar.f135613f = vq.j.a(aVar2);
                        aVar.f135614g = vq.j.a(aVar2);
                        i15 = 0;
                        aVar.f135615h = 0;
                        aVar.f135616j = 0;
                        aVar.f135617k = 0;
                        aVar.f135618l = 0;
                        aVar.f135619m = 0;
                        aVar.f135622q = 1;
                        if (cVar.c(params2, aVar) != objE) {
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                            i19 = 0;
                            r15 = params;
                        }
                        return objE;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        dx.j<dx.b> jVar = jVarA;
                        e = e18;
                        params = jVar;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(params));
                        iVarA = params.a(e);
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
                    try {
                        u.b(obj);
                        return new dx.i.Right(i0.f148189a);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                int i27 = aVar.f135619m;
                i16 = aVar.f135618l;
                i17 = aVar.f135617k;
                i18 = aVar.f135616j;
                int i28 = aVar.f135615h;
                ex.b bVar3 = (ex.b) aVar.f135614g;
                ex.b bVar4 = (ex.b) aVar.f135613f;
                dx.j<dx.b> jVar2 = (dx.j) aVar.f135612e;
                df0.g.Params params3 = (df0.g.Params) aVar.f135611d;
                try {
                    u.b(obj);
                    jVarA = jVar2;
                    bVar2 = bVar4;
                    bVar = bVar3;
                    i19 = i28;
                    i15 = i27;
                    r15 = params3;
                } catch (ex.c e26) {
                    e15 = e26;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e27) {
                    throw e27;
                } catch (Exception e28) {
                    e = e28;
                    params = jVar2;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(params));
                    iVarA = params.a(e);
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
                this.documentDownloadRepository.a(r15.getTaskId());
                this.asyncDownloadDocumentsManager.a(r15.getTaskId());
                mf0.a aVar3 = this.downloadTaskDataRepository;
                String taskId = r15.getTaskId();
                aVar.f135611d = vq.j.a(r15);
                aVar.f135612e = jVarA;
                aVar.f135613f = vq.j.a(bVar2);
                aVar.f135614g = vq.j.a(bVar);
                aVar.f135615h = i19;
                aVar.f135616j = i18;
                aVar.f135617k = i17;
                aVar.f135618l = i16;
                aVar.f135619m = i15;
                aVar.f135622q = 2;
                if (aVar3.g(taskId, aVar) != objE) {
                    return new dx.i.Right(i0.f148189a);
                }
                return objE;
            } catch (Exception e29) {
                e = e29;
            }
        } catch (CancellationException e35) {
            throw e35;
        }
    }
}
