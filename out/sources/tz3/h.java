package tz3;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltz3/h;", "Lmz3/f;", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lmz3/g;", "cleanupDocumentDownloadDataUC", "Lmz3/o;", "getDocumentAsyncDownloadErrorUC", "Lmz3/v;", "removeDocumentDownloadStatusUseCase", "<init>", "(Lmz3/q;Lmz3/g;Lmz3/o;Lmz3/v;)V", "Lmz3/f$a;", "params", "Ldx/b;", "f", "(Lmz3/f$a;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Lmz3/f$b;", "e", "a", "Lmz3/q;", "b", "Lmz3/g;", "c", "Lmz3/o;", "d", "Lmz3/v;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements mz3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.g cleanupDocumentDownloadDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz3.o getDocumentAsyncDownloadErrorUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.v removeDocumentDownloadStatusUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193116a;

        static {
            int[] iArr = new int[lz3.h.values().length];
            try {
                iArr[lz3.h.ALREADY_DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz3.h.TAKES_TOO_LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz3.h.CREATING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f193116a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193120g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f193121h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f193122j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f193123k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f193124l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f193125m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f193126n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f193127p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f193128q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f193129r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f193131t;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193129r = obj;
            this.f193131t |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f193136h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f193138k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193136h = obj;
            this.f193138k |= PKIFailureInfo.systemUnavail;
            return h.this.f(null, this);
        }
    }

    public h(mz3.q qVar, mz3.g gVar, mz3.o oVar, mz3.v vVar) {
        this.getDocumentDownloadStatusUseCase = qVar;
        this.cleanupDocumentDownloadDataUC = gVar;
        this.getDocumentAsyncDownloadErrorUC = oVar;
        this.removeDocumentDownloadStatusUseCase = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(mz3.f.Params params, tq.e<? super dx.b> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f193138k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f193138k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f193136h;
        Object objE = uq.b.e();
        int i16 = cVar.f193138k;
        if (i16 == 0) {
            oq.u.b(objC);
            mz3.o oVar = this.getDocumentAsyncDownloadErrorUC;
            mz3.o.Params params2 = new mz3.o.Params(params.getDocumentType());
            cVar.f193132d = params;
            cVar.f193138k = 1;
            objC = oVar.c(params2, cVar);
            if (objC != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = cVar.f193133e;
            oq.u.b(objC);
            return obj;
        }
        params = (mz3.f.Params) cVar.f193132d;
        oq.u.b(objC);
        mz3.g gVar = this.cleanupDocumentDownloadDataUC;
        mz3.g.Params params3 = new mz3.g.Params(params.getDocumentType(), params.getDocumentIID(), false);
        cVar.f193132d = vq.j.a(params);
        cVar.f193133e = objC;
        cVar.f193134f = vq.j.a((dx.b.Business) objC);
        cVar.f193135g = 0;
        cVar.f193138k = 2;
        return gVar.c(params3, cVar) == objE ? objE : objC;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0299  */
    /* JADX WARN: Code duplicated, block: B:109:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:92:0x0236  */
    /* JADX WARN: Code duplicated, block: B:93:0x0237  */
    /* JADX WARN: Code duplicated, block: B:97:0x0278  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [tz3.h] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.f.Params params, tq.e<? super dx.i<? extends dx.b, ? extends mz3.f.b>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        int i16;
        int i17;
        int i18;
        mz3.f.Params params2;
        int i19;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        ex.b aVar;
        int i25;
        int i26;
        int i27;
        int i28;
        lz3.h hVar;
        DocumentDownloadStatus documentDownloadStatus;
        ex.b bVar3;
        mz3.f.Params params3;
        ex.b bVar4;
        Object obj;
        List<DocumentDownloadSingleStatus> listB;
        Object next;
        DocumentDownloadSingleStatus documentDownloadSingleStatus;
        ex.b bVar5;
        mz3.v vVar;
        mz3.v.Params params4;
        List<DocumentDownloadSingleStatus> listB2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i29 = bVar.f193131t;
            if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f193131t = i29 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF = bVar.f193129r;
        Object objE = uq.b.e();
        ?? r15 = bVar.f193131t;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objF);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    mz3.q qVar = this.getDocumentDownloadStatusUseCase;
                    mz3.q.Params params5 = new mz3.q.Params(params.getDocumentType());
                    params2 = params;
                    bVar.f193117d = params2;
                    bVar.f193118e = jVarA;
                    bVar.f193119f = vq.j.a(aVar);
                    bVar.f193120g = aVar;
                    bVar.f193124l = 0;
                    bVar.f193125m = 0;
                    bVar.f193126n = 0;
                    bVar.f193127p = 0;
                    bVar.f193128q = 0;
                    bVar.f193131t = 1;
                    objF = qVar.c(params5, bVar);
                    if (objF != objE) {
                        i19 = 0;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        bVar2 = aVar;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            oq.u.b(objF);
                            obj = mz3.f.b.a.f129689a;
                            return new dx.i.Right(obj);
                        }
                        if (r15 == 3) {
                            int i35 = bVar.f193128q;
                            i25 = bVar.f193127p;
                            i26 = bVar.f193126n;
                            i27 = bVar.f193125m;
                            i28 = bVar.f193124l;
                            hVar = (lz3.h) bVar.f193122j;
                            documentDownloadStatus = (DocumentDownloadStatus) bVar.f193121h;
                            ex.b bVar6 = (ex.b) bVar.f193120g;
                            bVar3 = (ex.b) bVar.f193119f;
                            dx.j<dx.b> jVar = (dx.j) bVar.f193118e;
                            mz3.f.Params params6 = (mz3.f.Params) bVar.f193117d;
                            try {
                                oq.u.b(objF);
                                i19 = i35;
                                jVarA = jVar;
                                params3 = params6;
                                bVar2 = bVar6;
                                bVar.f193117d = vq.j.a(params3);
                                bVar.f193118e = jVarA;
                                bVar.f193119f = vq.j.a(bVar3);
                                bVar.f193120g = vq.j.a(bVar2);
                                bVar.f193121h = vq.j.a(documentDownloadStatus);
                                bVar.f193122j = vq.j.a(hVar);
                                bVar.f193123k = bVar2;
                                bVar.f193124l = i28;
                                bVar.f193125m = i27;
                                bVar.f193126n = i26;
                                bVar.f193127p = i25;
                                bVar.f193128q = i19;
                                bVar.f193131t = 4;
                                objF = f(params3, bVar);
                                if (objF != objE) {
                                    bVar4 = bVar2;
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
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
                        if (r15 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) bVar.f193123k;
                        oq.u.b(objF);
                        bVar4.b(objF);
                        throw new oq.g();
                    }
                    int i36 = bVar.f193128q;
                    i15 = bVar.f193127p;
                    i16 = bVar.f193126n;
                    i17 = bVar.f193125m;
                    i18 = bVar.f193124l;
                    ex.b bVar7 = (ex.b) bVar.f193120g;
                    ex.b bVar8 = (ex.b) bVar.f193119f;
                    dx.j<dx.b> jVar2 = (dx.j) bVar.f193118e;
                    params2 = (mz3.f.Params) bVar.f193117d;
                    try {
                        oq.u.b(objF);
                        i19 = i36;
                        jVarA = jVar2;
                        bVar2 = bVar7;
                        aVar = bVar8;
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar2;
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
                } catch (CancellationException e26) {
                    throw e26;
                }
                DocumentDownloadStatus documentDownloadStatus2 = (DocumentDownloadStatus) objF;
                if (params2.getDocumentIID() == null) {
                    if (documentDownloadStatus2 == null || (listB2 = documentDownloadStatus2.b()) == null) {
                        documentDownloadSingleStatus = null;
                    } else {
                        documentDownloadSingleStatus = (DocumentDownloadSingleStatus) pq.v.n0(listB2);
                    }
                } else if (documentDownloadStatus2 == null || (listB = documentDownloadStatus2.b()) == null) {
                    documentDownloadSingleStatus = null;
                } else {
                    Iterator it = listB.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!fr.t.c(((DocumentDownloadSingleStatus) next).getDocumentIID(), params2.getDocumentIID()));
                    documentDownloadSingleStatus = (DocumentDownloadSingleStatus) next;
                }
                lz3.h status = documentDownloadSingleStatus != null ? documentDownloadSingleStatus.getStatus() : null;
                int i37 = status == null ? -1 : a.f193116a[status.ordinal()];
                if (i37 != -1) {
                    if (i37 == 1) {
                        mz3.v vVar2 = this.removeDocumentDownloadStatusUseCase;
                        mz3.v.Params params7 = new mz3.v.Params(params2.getDocumentType(), false, params2.getDocumentIID());
                        bVar.f193117d = vq.j.a(params2);
                        bVar.f193118e = jVarA;
                        bVar.f193119f = vq.j.a(aVar);
                        bVar.f193120g = vq.j.a(bVar2);
                        bVar.f193121h = vq.j.a(documentDownloadStatus2);
                        bVar.f193122j = vq.j.a(status);
                        bVar.f193124l = i18;
                        bVar.f193125m = i17;
                        bVar.f193126n = i16;
                        bVar.f193127p = i15;
                        bVar.f193128q = i19;
                        bVar.f193131t = 2;
                        if (vVar2.c(params7, bVar) == objE) {
                        }
                        obj = mz3.f.b.a.f129689a;
                        return new dx.i.Right(obj);
                    }
                    if (i37 != 2) {
                        if (i37 != 3) {
                            obj = mz3.f.b.C3229b.f129690a;
                        }
                        bVar5 = aVar;
                        vVar = this.removeDocumentDownloadStatusUseCase;
                        params4 = new mz3.v.Params(params2.getDocumentType(), false, params2.getDocumentIID());
                        bVar.f193117d = params2;
                        bVar.f193118e = jVarA;
                        bVar.f193119f = vq.j.a(bVar5);
                        bVar.f193120g = bVar2;
                        bVar.f193121h = vq.j.a(documentDownloadStatus2);
                        bVar.f193122j = vq.j.a(status);
                        bVar.f193124l = i18;
                        bVar.f193125m = i17;
                        bVar.f193126n = i16;
                        bVar.f193127p = i15;
                        bVar.f193128q = i19;
                        bVar.f193131t = 3;
                        if (vVar.c(params4, bVar) == objE) {
                            params3 = params2;
                            i25 = i15;
                            i26 = i16;
                            i27 = i17;
                            i28 = i18;
                            bVar3 = bVar5;
                            hVar = status;
                            documentDownloadStatus = documentDownloadStatus2;
                            bVar.f193117d = vq.j.a(params3);
                            bVar.f193118e = jVarA;
                            bVar.f193119f = vq.j.a(bVar3);
                            bVar.f193120g = vq.j.a(bVar2);
                            bVar.f193121h = vq.j.a(documentDownloadStatus);
                            bVar.f193122j = vq.j.a(hVar);
                            bVar.f193123k = bVar2;
                            bVar.f193124l = i28;
                            bVar.f193125m = i27;
                            bVar.f193126n = i26;
                            bVar.f193127p = i25;
                            bVar.f193128q = i19;
                            bVar.f193131t = 4;
                            objF = f(params3, bVar);
                            if (objF != objE) {
                                bVar4 = bVar2;
                                bVar4.b(objF);
                                throw new oq.g();
                            }
                        }
                    } else {
                        obj = mz3.f.b.c.f129691a;
                    }
                    return new dx.i.Right(obj);
                }
                bVar5 = aVar;
                vVar = this.removeDocumentDownloadStatusUseCase;
                params4 = new mz3.v.Params(params2.getDocumentType(), false, params2.getDocumentIID());
                bVar.f193117d = params2;
                bVar.f193118e = jVarA;
                bVar.f193119f = vq.j.a(bVar5);
                bVar.f193120g = bVar2;
                bVar.f193121h = vq.j.a(documentDownloadStatus2);
                bVar.f193122j = vq.j.a(status);
                bVar.f193124l = i18;
                bVar.f193125m = i17;
                bVar.f193126n = i16;
                bVar.f193127p = i15;
                bVar.f193128q = i19;
                bVar.f193131t = 3;
                if (vVar.c(params4, bVar) == objE) {
                    params3 = params2;
                    i25 = i15;
                    i26 = i16;
                    i27 = i17;
                    i28 = i18;
                    bVar3 = bVar5;
                    hVar = status;
                    documentDownloadStatus = documentDownloadStatus2;
                    bVar.f193117d = vq.j.a(params3);
                    bVar.f193118e = jVarA;
                    bVar.f193119f = vq.j.a(bVar3);
                    bVar.f193120g = vq.j.a(bVar2);
                    bVar.f193121h = vq.j.a(documentDownloadStatus);
                    bVar.f193122j = vq.j.a(hVar);
                    bVar.f193123k = bVar2;
                    bVar.f193124l = i28;
                    bVar.f193125m = i27;
                    bVar.f193126n = i26;
                    bVar.f193127p = i25;
                    bVar.f193128q = i19;
                    bVar.f193131t = 4;
                    objF = f(params3, bVar);
                    if (objF != objE) {
                        bVar4 = bVar2;
                        bVar4.b(objF);
                        throw new oq.g();
                    }
                }
                return objE;
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
