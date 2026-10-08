package tz3;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import lz3.DownloadTaskData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltz3/e0;", "Ltz3/d0;", "Lmz3/m;", "getAllDownloadTaskDataUC", "Lqz3/a;", "asyncDocumentUpdateInteractor", "<init>", "(Lmz3/m;Lqz3/a;)V", "Ltz3/d0$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Ltz3/d0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/m;", "b", "Lqz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.m getAllDownloadTaskDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qz3.a asyncDocumentUpdateInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193053f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193054g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f193055h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193056j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f193057k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f193058l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f193059m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f193060n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f193061p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f193063r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193061p = obj;
            this.f193063r |= PKIFailureInfo.systemUnavail;
            return e0.this.c(null, this);
        }
    }

    public e0(mz3.m mVar, qz3.a aVar) {
        this.getAllDownloadTaskDataUC = mVar;
        this.asyncDocumentUpdateInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e3 A[Catch: Exception -> 0x0082, c -> 0x0086, CancellationException -> 0x008a, TryCatch #7 {c -> 0x0086, CancellationException -> 0x008a, Exception -> 0x0082, blocks: (B:24:0x0075, B:37:0x00db, B:39:0x00e3, B:43:0x00fa, B:45:0x0102, B:58:0x015d, B:59:0x0165, B:40:0x00f0, B:42:0x00f4, B:60:0x0166, B:61:0x016b), top: B:88:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0 A[Catch: Exception -> 0x0082, c -> 0x0086, CancellationException -> 0x008a, TryCatch #7 {c -> 0x0086, CancellationException -> 0x008a, Exception -> 0x0082, blocks: (B:24:0x0075, B:37:0x00db, B:39:0x00e3, B:43:0x00fa, B:45:0x0102, B:58:0x015d, B:59:0x0165, B:40:0x00f0, B:42:0x00f4, B:60:0x0166, B:61:0x016b), top: B:88:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[Catch: Exception -> 0x0082, c -> 0x0086, CancellationException -> 0x008a, TryCatch #7 {c -> 0x0086, CancellationException -> 0x008a, Exception -> 0x0082, blocks: (B:24:0x0075, B:37:0x00db, B:39:0x00e3, B:43:0x00fa, B:45:0x0102, B:58:0x015d, B:59:0x0165, B:40:0x00f0, B:42:0x00f4, B:60:0x0166, B:61:0x016b), top: B:88:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0102 A[Catch: Exception -> 0x0082, c -> 0x0086, CancellationException -> 0x008a, TRY_LEAVE, TryCatch #7 {c -> 0x0086, CancellationException -> 0x008a, Exception -> 0x0082, blocks: (B:24:0x0075, B:37:0x00db, B:39:0x00e3, B:43:0x00fa, B:45:0x0102, B:58:0x015d, B:59:0x0165, B:40:0x00f0, B:42:0x00f4, B:60:0x0166, B:61:0x016b), top: B:88:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136 A[Catch: Exception -> 0x0046, c -> 0x0049, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0046, blocks: (B:13:0x0041, B:49:0x012a, B:50:0x0130, B:52:0x0136, B:54:0x014a, B:56:0x0154, B:57:0x015c, B:68:0x0175, B:71:0x0183), top: B:86:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x015d A[Catch: Exception -> 0x0082, c -> 0x0086, CancellationException -> 0x008a, TRY_ENTER, TryCatch #7 {c -> 0x0086, CancellationException -> 0x008a, Exception -> 0x0082, blocks: (B:24:0x0075, B:37:0x00db, B:39:0x00e3, B:43:0x00fa, B:45:0x0102, B:58:0x015d, B:59:0x0165, B:40:0x00f0, B:42:0x00f4, B:60:0x0166, B:61:0x016b), top: B:88:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166 A[Catch: Exception -> 0x0082, c -> 0x0086, CancellationException -> 0x008a, TryCatch #7 {c -> 0x0086, CancellationException -> 0x008a, Exception -> 0x0082, blocks: (B:24:0x0075, B:37:0x00db, B:39:0x00e3, B:43:0x00fa, B:45:0x0102, B:58:0x015d, B:59:0x0165, B:40:0x00f0, B:42:0x00f4, B:60:0x0166, B:61:0x016b), top: B:88:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:92:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[LOOP:0: B:50:0x0130->B:93:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(d0.Params params, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        dx.b.Generic generic;
        dx.j<dx.b> jVar;
        int i15;
        int i16;
        int i17;
        int i18;
        d0.Params params2;
        ex.b bVar;
        int i19;
        dx.i iVar;
        Object objB2;
        dx.b.Generic generic2;
        d0.Params params3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f193063r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f193063r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f193061p;
        Object objE = uq.b.e();
        int i26 = aVar.f193063r;
        ?? r15 = 2;
        try {
            try {
                if (i26 != 0) {
                    if (i26 == 1) {
                        int i27 = aVar.f193060n;
                        int i28 = aVar.f193059m;
                        int i29 = aVar.f193058l;
                        int i35 = aVar.f193057k;
                        int i36 = aVar.f193056j;
                        generic = (dx.b.Generic) aVar.f193055h;
                        ex.b bVar2 = (ex.b) aVar.f193054g;
                        aVar2 = (ex.b) aVar.f193053f;
                        jVar = (dx.j) aVar.f193052e;
                        params2 = (d0.Params) aVar.f193051d;
                        try {
                            oq.u.b(objC);
                            i15 = i27;
                            bVar = bVar2;
                            i18 = i36;
                            i19 = i35;
                            i17 = i29;
                            i16 = i28;
                            iVar = (dx.i) objC;
                            if (iVar instanceof dx.i.Left) {
                                objB2 = vq.b.a(false);
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB2 = ((dx.i.Right) iVar).b();
                            }
                            if (!((Boolean) objB2).booleanValue()) {
                                bVar.b(generic);
                                throw new oq.g();
                            }
                            mz3.m mVar = this.getAllDownloadTaskDataUC;
                            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                            aVar.f193051d = params2;
                            aVar.f193052e = jVar;
                            aVar.f193053f = vq.j.a(aVar2);
                            aVar.f193054g = bVar;
                            aVar.f193055h = generic;
                            aVar.f193056j = i18;
                            aVar.f193057k = i19;
                            aVar.f193058l = i17;
                            aVar.f193059m = i16;
                            aVar.f193060n = i15;
                            aVar.f193063r = 2;
                            objC = mVar.c(c1792a, aVar);
                            if (objC != objE) {
                                generic2 = generic;
                                params3 = params2;
                                for (DownloadTaskData downloadTaskData : (Iterable) objC) {
                                    if (downloadTaskData.d().containsKey(params3.getDocumentType())) {
                                        return new dx.i.Right(downloadTaskData.getTaskId());
                                    }
                                }
                                bVar.b(generic2);
                                throw new oq.g();
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
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
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        generic2 = (dx.b.Generic) aVar.f193055h;
                        bVar = (ex.b) aVar.f193054g;
                        params3 = (d0.Params) aVar.f193051d;
                        try {
                            oq.u.b(objC);
                            while (r0.hasNext()) {
                                if (downloadTaskData.d().containsKey(params3.getDocumentType())) {
                                    return new dx.i.Right(downloadTaskData.getTaskId());
                                }
                            }
                            bVar.b(generic2);
                            throw new oq.g();
                        } catch (ex.c e18) {
                            e = e18;
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Left((dx.b) ex.d.a(e));
                }
                oq.u.b(objC);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    aVar2 = new ex.a();
                    dx.b.Generic generic3 = new dx.b.Generic(new NoSuchElementException("There is no matching download task"));
                    qz3.a aVar3 = this.asyncDocumentUpdateInteractor;
                    rq0.b documentType = params.getDocumentType();
                    aVar.f193051d = params;
                    aVar.f193052e = jVarA;
                    aVar.f193053f = vq.j.a(aVar2);
                    aVar.f193054g = aVar2;
                    aVar.f193055h = generic3;
                    aVar.f193056j = 0;
                    aVar.f193057k = 0;
                    aVar.f193058l = 0;
                    aVar.f193059m = 0;
                    aVar.f193060n = 0;
                    aVar.f193063r = 1;
                    Object objE2 = aVar3.e(documentType, aVar);
                    if (objE2 != objE) {
                        generic = generic3;
                        jVar = jVarA;
                        objC = objE2;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        params2 = params;
                        bVar = aVar2;
                        i19 = 0;
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            objB2 = vq.b.a(false);
                        } else {
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB2 = ((dx.i.Right) iVar).b();
                        }
                        if (!((Boolean) objB2).booleanValue()) {
                            bVar.b(generic);
                            throw new oq.g();
                        }
                        mz3.m mVar2 = this.getAllDownloadTaskDataUC;
                        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                        aVar.f193051d = params2;
                        aVar.f193052e = jVar;
                        aVar.f193053f = vq.j.a(aVar2);
                        aVar.f193054g = bVar;
                        aVar.f193055h = generic;
                        aVar.f193056j = i18;
                        aVar.f193057k = i19;
                        aVar.f193058l = i17;
                        aVar.f193059m = i16;
                        aVar.f193060n = i15;
                        aVar.f193063r = 2;
                        objC = mVar2.c(c1792a2, aVar);
                        if (objC != objE) {
                            generic2 = generic;
                            params3 = params2;
                            while (r0.hasNext()) {
                                if (downloadTaskData.d().containsKey(params3.getDocumentType())) {
                                    return new dx.i.Right(downloadTaskData.getTaskId());
                                }
                            }
                            bVar.b(generic2);
                            throw new oq.g();
                        }
                    }
                    return objE;
                } catch (ex.c e25) {
                    e = e25;
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
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
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }
}
