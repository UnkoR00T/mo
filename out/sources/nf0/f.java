package nf0;

import cf0.DownloadTaskData;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnf0/f;", "Ldf0/f;", "Lmf0/a;", "downloadTaskDataRepository", "Lof0/a;", "asyncDownloadDocumentsManager", "Lez/a;", "currentTimeProvider", "<init>", "(Lmf0/a;Lof0/a;Lez/a;)V", "Ldf0/f$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ldf0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmf0/a;", "b", "Lof0/a;", "c", "Lez/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements df0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final of0.a asyncDownloadDocumentsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135598h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f135599j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f135600k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135601l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135602m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135603n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f135604p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f135606r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135604p = obj;
            this.f135606r |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(mf0.a aVar, of0.a aVar2, ez.a aVar3) {
        this.downloadTaskDataRepository = aVar;
        this.asyncDownloadDocumentsManager = aVar2;
        this.currentTimeProvider = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d2 A[Catch: Exception -> 0x0074, c -> 0x0078, CancellationException -> 0x007c, TRY_LEAVE, TryCatch #6 {c -> 0x0078, CancellationException -> 0x007c, Exception -> 0x0074, blocks: (B:24:0x0070, B:37:0x00c4, B:39:0x00d2, B:47:0x0135), top: B:80:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TRY_LEAVE, TryCatch #9 {Exception -> 0x0041, blocks: (B:13:0x003c, B:43:0x011d, B:45:0x0123, B:49:0x013f, B:57:0x0150, B:60:0x015e), top: B:75:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0135 A[Catch: Exception -> 0x0074, c -> 0x0078, CancellationException -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {c -> 0x0078, CancellationException -> 0x007c, Exception -> 0x0074, blocks: (B:24:0x0070, B:37:0x00c4, B:39:0x00d2, B:47:0x0135), top: B:80:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:67:0x0186  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(df0.f.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        dx.j<dx.b> jVar;
        df0.f.Params params2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        df0.f.Params params3;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f135606r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f135606r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f135604p;
        ?? E = uq.b.e();
        int i26 = aVar.f135606r;
        try {
            try {
                if (i26 == 0) {
                    u.b(objC);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        mf0.a aVar3 = this.downloadTaskDataRepository;
                        String taskId = params.getTaskId();
                        aVar.f135594d = params;
                        aVar.f135595e = jVarA;
                        aVar.f135596f = vq.j.a(aVar2);
                        aVar.f135597g = vq.j.a(aVar2);
                        aVar.f135598h = aVar2;
                        i15 = 0;
                        aVar.f135599j = 0;
                        aVar.f135600k = 0;
                        aVar.f135601l = 0;
                        aVar.f135602m = 0;
                        aVar.f135603n = 0;
                        aVar.f135606r = 1;
                        objC = aVar3.c(taskId, aVar);
                        if (objC != E) {
                            jVar = jVarA;
                            params2 = params;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                            if (((Boolean) aVar2.a((dx.i) objC)).booleanValue()) {
                                this.asyncDownloadDocumentsManager.c(params2.getTaskId());
                            } else {
                                mf0.a aVar4 = this.downloadTaskDataRepository;
                                DownloadTaskData downloadTaskData = new DownloadTaskData(params2.getTaskId(), this.currentTimeProvider.a(), params2.getDocumentDownloadMethod(), false, params2.getMainDocumentAuthToken(), params2.b(), 8, null);
                                aVar.f135594d = params2;
                                aVar.f135595e = jVar;
                                aVar.f135596f = vq.j.a(bVar2);
                                aVar.f135597g = vq.j.a(bVar);
                                aVar.f135598h = null;
                                aVar.f135599j = i15;
                                aVar.f135600k = i19;
                                aVar.f135601l = i18;
                                aVar.f135602m = i17;
                                aVar.f135603n = i16;
                                aVar.f135606r = 2;
                                objC = aVar4.i(downloadTaskData, aVar);
                                if (objC != E) {
                                    params3 = params2;
                                    iVar = (dx.i) objC;
                                    if (iVar instanceof dx.i.Right) {
                                        this.asyncDownloadDocumentsManager.c(params3.getTaskId());
                                    }
                                }
                            }
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
                if (i26 == 1) {
                    i16 = aVar.f135603n;
                    i17 = aVar.f135602m;
                    i18 = aVar.f135601l;
                    i19 = aVar.f135600k;
                    i15 = aVar.f135599j;
                    aVar2 = (ex.b) aVar.f135598h;
                    bVar = (ex.b) aVar.f135597g;
                    bVar2 = (ex.b) aVar.f135596f;
                    jVar = (dx.j) aVar.f135595e;
                    params2 = (df0.f.Params) aVar.f135594d;
                    try {
                        u.b(objC);
                        if (((Boolean) aVar2.a((dx.i) objC)).booleanValue()) {
                            mf0.a aVar5 = this.downloadTaskDataRepository;
                            DownloadTaskData downloadTaskData2 = new DownloadTaskData(params2.getTaskId(), this.currentTimeProvider.a(), params2.getDocumentDownloadMethod(), false, params2.getMainDocumentAuthToken(), params2.b(), 8, null);
                            aVar.f135594d = params2;
                            aVar.f135595e = jVar;
                            aVar.f135596f = vq.j.a(bVar2);
                            aVar.f135597g = vq.j.a(bVar);
                            aVar.f135598h = null;
                            aVar.f135599j = i15;
                            aVar.f135600k = i19;
                            aVar.f135601l = i18;
                            aVar.f135602m = i17;
                            aVar.f135603n = i16;
                            aVar.f135606r = 2;
                            objC = aVar5.i(downloadTaskData2, aVar);
                            if (objC != E) {
                                params3 = params2;
                                iVar = (dx.i) objC;
                                if (iVar instanceof dx.i.Right) {
                                    this.asyncDownloadDocumentsManager.c(params3.getTaskId());
                                }
                            }
                            return E;
                        }
                        this.asyncDownloadDocumentsManager.c(params2.getTaskId());
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
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
                } else {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    params3 = (df0.f.Params) aVar.f135594d;
                    try {
                        u.b(objC);
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Right) {
                            this.asyncDownloadDocumentsManager.c(params3.getTaskId());
                        }
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }
}
