package nf0;

import cf0.AsyncDocumentToGenerate;
import cf0.DownloadTaskData;
import fr.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnf0/q;", "Ldf0/q;", "Ljf0/a;", "documentDownloadRepository", "Lmf0/a;", "downloadTaskDataRepository", "<init>", "(Ljf0/a;Lmf0/a;)V", "Ldf0/q$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ldf0/q$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljf0/a;", "b", "Lmf0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements df0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jf0.a documentDownloadRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135702h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f135703j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f135704k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135705l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135706m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135707n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f135708p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f135709q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f135711s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135709q = obj;
            this.f135711s |= PKIFailureInfo.systemUnavail;
            return q.this.c(null, this);
        }
    }

    public q(jf0.a aVar, mf0.a aVar2) {
        this.documentDownloadRepository = aVar;
        this.downloadTaskDataRepository = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d9 A[Catch: Exception -> 0x007b, c -> 0x007f, CancellationException -> 0x0083, TryCatch #6 {c -> 0x007f, CancellationException -> 0x0083, Exception -> 0x007b, blocks: (B:24:0x0077, B:37:0x00c4, B:38:0x00d3, B:40:0x00d9, B:42:0x00f3, B:45:0x00fd, B:46:0x0101, B:48:0x0107, B:54:0x0128, B:56:0x012c, B:60:0x016b, B:61:0x017f), top: B:91:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd A[Catch: Exception -> 0x007b, c -> 0x007f, CancellationException -> 0x0083, TryCatch #6 {c -> 0x007f, CancellationException -> 0x0083, Exception -> 0x007b, blocks: (B:24:0x0077, B:37:0x00c4, B:38:0x00d3, B:40:0x00d9, B:42:0x00f3, B:45:0x00fd, B:46:0x0101, B:48:0x0107, B:54:0x0128, B:56:0x012c, B:60:0x016b, B:61:0x017f), top: B:91:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0107 A[Catch: Exception -> 0x007b, c -> 0x007f, CancellationException -> 0x0083, TryCatch #6 {c -> 0x007f, CancellationException -> 0x0083, Exception -> 0x007b, blocks: (B:24:0x0077, B:37:0x00c4, B:38:0x00d3, B:40:0x00d9, B:42:0x00f3, B:45:0x00fd, B:46:0x0101, B:48:0x0107, B:54:0x0128, B:56:0x012c, B:60:0x016b, B:61:0x017f), top: B:91:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011e A[LOOP:1: B:46:0x0101->B:51:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x012c A[Catch: Exception -> 0x007b, c -> 0x007f, CancellationException -> 0x0083, TryCatch #6 {c -> 0x007f, CancellationException -> 0x0083, Exception -> 0x007b, blocks: (B:24:0x0077, B:37:0x00c4, B:38:0x00d3, B:40:0x00d9, B:42:0x00f3, B:45:0x00fd, B:46:0x0101, B:48:0x0107, B:54:0x0128, B:56:0x012c, B:60:0x016b, B:61:0x017f), top: B:91:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x016b A[Catch: Exception -> 0x007b, c -> 0x007f, CancellationException -> 0x0083, TryCatch #6 {c -> 0x007f, CancellationException -> 0x0083, Exception -> 0x007b, blocks: (B:24:0x0077, B:37:0x00c4, B:38:0x00d3, B:40:0x00d9, B:42:0x00f3, B:45:0x00fd, B:46:0x0101, B:48:0x0107, B:54:0x0128, B:56:0x012c, B:60:0x016b, B:61:0x017f), top: B:91:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x011d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(df0.q.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        dx.j<dx.b> jVar;
        df0.q.Params params2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        List list;
        Iterator it;
        List list2;
        Object next;
        DownloadTaskData downloadTaskData;
        Object objB2;
        Collection<AsyncDocumentToGenerate> collectionValues;
        Iterator it4;
        Iterator it5;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f135711s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f135711s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f135709q;
        ?? E = uq.b.e();
        int i26 = aVar.f135711s;
        try {
            try {
                if (i26 != 0) {
                    if (i26 == 1) {
                        i16 = aVar.f135708p;
                        i17 = aVar.f135707n;
                        i18 = aVar.f135706m;
                        i15 = aVar.f135705l;
                        i19 = aVar.f135704k;
                        aVar2 = (ex.b) aVar.f135702h;
                        bVar = (ex.b) aVar.f135701g;
                        bVar2 = (ex.b) aVar.f135700f;
                        jVar = (dx.j) aVar.f135699e;
                        params2 = (df0.q.Params) aVar.f135698d;
                        try {
                            u.b(objA);
                            list = (List) aVar2.a((dx.i) objA);
                            it = list.iterator();
                            loop0: while (true) {
                                if (it.hasNext()) {
                                    list2 = list;
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                collectionValues = ((DownloadTaskData) next).b().values();
                                list2 = list;
                                if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                                    it4 = collectionValues.iterator();
                                    while (it4.hasNext()) {
                                        it5 = it4;
                                        if (t.c(((AsyncDocumentToGenerate) it4.next()).getDocumentId(), params2.getDocumentId())) {
                                            break loop0;
                                        }
                                        it4 = it5;
                                    }
                                }
                                list = list2;
                            }
                            downloadTaskData = (DownloadTaskData) next;
                            if (downloadTaskData != null) {
                                bVar.b(new dx.b.Generic(new NoSuchElementException("There is no matching download task")));
                                throw new oq.g();
                            }
                            jf0.a aVar3 = this.documentDownloadRepository;
                            String taskId = downloadTaskData.getTaskId();
                            String documentId = params2.getDocumentId();
                            aVar.f135698d = vq.j.a(params2);
                            aVar.f135699e = jVar;
                            aVar.f135700f = vq.j.a(bVar2);
                            aVar.f135701g = vq.j.a(bVar);
                            aVar.f135702h = vq.j.a(list2);
                            aVar.f135703j = vq.j.a(downloadTaskData);
                            aVar.f135704k = i19;
                            aVar.f135705l = i15;
                            aVar.f135706m = i18;
                            aVar.f135707n = i17;
                            aVar.f135708p = i16;
                            aVar.f135711s = 2;
                            objB2 = aVar3.b(taskId, documentId, aVar);
                            if (objB2 == E) {
                                return objB2;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVar;
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
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            u.b(objA);
                            return objA;
                        } catch (ex.c e18) {
                            e = e18;
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Left((dx.b) ex.d.a(e));
                }
                u.b(objA);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    aVar2 = new ex.a();
                    mf0.a aVar4 = this.downloadTaskDataRepository;
                    aVar.f135698d = params;
                    aVar.f135699e = jVarA;
                    aVar.f135700f = vq.j.a(aVar2);
                    aVar.f135701g = aVar2;
                    aVar.f135702h = aVar2;
                    i15 = 0;
                    aVar.f135704k = 0;
                    aVar.f135705l = 0;
                    aVar.f135706m = 0;
                    aVar.f135707n = 0;
                    aVar.f135708p = 0;
                    aVar.f135711s = 1;
                    objA = aVar4.a(aVar);
                    if (objA != E) {
                        jVar = jVarA;
                        params2 = params;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        bVar = aVar2;
                        bVar2 = bVar;
                        list = (List) aVar2.a((dx.i) objA);
                        it = list.iterator();
                        loop0: while (true) {
                            if (it.hasNext()) {
                                list2 = list;
                                next = null;
                                break;
                            }
                            next = it.next();
                            collectionValues = ((DownloadTaskData) next).b().values();
                            list2 = list;
                            if (collectionValues instanceof Collection) {
                                it4 = collectionValues.iterator();
                                while (it4.hasNext()) {
                                    it5 = it4;
                                    if (t.c(((AsyncDocumentToGenerate) it4.next()).getDocumentId(), params2.getDocumentId())) {
                                        break loop0;
                                        break loop0;
                                    }
                                    it4 = it5;
                                }
                            } else {
                                it4 = collectionValues.iterator();
                                while (it4.hasNext()) {
                                    it5 = it4;
                                    if (t.c(((AsyncDocumentToGenerate) it4.next()).getDocumentId(), params2.getDocumentId())) {
                                        break loop0;
                                        break loop0;
                                    }
                                    it4 = it5;
                                }
                            }
                            list = list2;
                        }
                        downloadTaskData = (DownloadTaskData) next;
                        if (downloadTaskData != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("There is no matching download task")));
                            throw new oq.g();
                        }
                        jf0.a aVar5 = this.documentDownloadRepository;
                        String taskId2 = downloadTaskData.getTaskId();
                        String documentId2 = params2.getDocumentId();
                        aVar.f135698d = vq.j.a(params2);
                        aVar.f135699e = jVar;
                        aVar.f135700f = vq.j.a(bVar2);
                        aVar.f135701g = vq.j.a(bVar);
                        aVar.f135702h = vq.j.a(list2);
                        aVar.f135703j = vq.j.a(downloadTaskData);
                        aVar.f135704k = i19;
                        aVar.f135705l = i15;
                        aVar.f135706m = i18;
                        aVar.f135707n = i17;
                        aVar.f135708p = i16;
                        aVar.f135711s = 2;
                        objB2 = aVar5.b(taskId2, documentId2, aVar);
                        if (objB2 == E) {
                            return objB2;
                        }
                    }
                } catch (ex.c e25) {
                    e = e25;
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    E = jVarA;
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
                return E;
            } catch (Exception e28) {
                e = e28;
            }
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
