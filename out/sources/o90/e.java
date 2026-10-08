package o90;

import cf0.DownloadTaskData;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lo90/e;", "", "<init>", "()V", "Ldf0/a;", "cancelAllDownloadTaskWorkUC", "Ldf0/b;", "clearAllDownloadTaskDataUC", "Ldf0/e;", "getPreviousDocumentActiveTaskDataUC", "Luf0/a;", "b", "(Ldf0/a;Ldf0/b;Ldf0/e;)Luf0/a;", "La84/b;", "clearNotificationsDeviceTokenUseCase", "Lkg0/a;", "a", "(La84/b;)Lkg0/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f143393a = new e();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"o90/e$a", "Lkg0/a;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements kg0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a84.b f143394a;

        a(a84.b bVar) {
            this.f143394a = bVar;
        }

        @Override // kg0.a
        public Object a(tq.e<? super oq.i0> eVar) throws Throwable {
            Object objA = this.f143394a.a(gz.b.a.C1792a.f78542a, eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"o90/e$b", "Luf0/a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "previousDocumentId", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements uf0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ df0.a f143395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ df0.b f143396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ df0.e f143397c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143398d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f143399e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f143401g;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143399e = obj;
                this.f143401g |= PKIFailureInfo.systemUnavail;
                return b.this.a(null, this);
            }
        }

        /* JADX INFO: renamed from: o90.e$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3554b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143402d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143403e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f143404f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f143405g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143406h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f143407j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f143408k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f143409l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f143410m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f143411n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f143413q;

            C3554b(tq.e<? super C3554b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143411n = obj;
                this.f143413q |= PKIFailureInfo.systemUnavail;
                return b.this.b(this);
            }
        }

        b(df0.a aVar, df0.b bVar, df0.e eVar) {
            this.f143395a = aVar;
            this.f143396b = bVar;
            this.f143397c = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // uf0.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f143401g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f143401g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objC = aVar.f143399e;
            Object objE = uq.b.e();
            int i16 = aVar.f143401g;
            if (i16 == 0) {
                oq.u.b(objC);
                df0.e eVar2 = this.f143397c;
                df0.e.Params params = new df0.e.Params(str);
                aVar.f143398d = vq.j.a(str);
                aVar.f143401g = 1;
                objC = eVar2.c(params, aVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(((DownloadTaskData) ((dx.i.Right) iVar).b()).getTaskId());
            }
            throw new oq.p();
        }

        /* JADX WARN: Code duplicated, block: B:55:0x0103  */
        /* JADX WARN: Code duplicated, block: B:58:0x0114  */
        /* JADX WARN: Code duplicated, block: B:59:0x0122  */
        /* JADX WARN: Code duplicated, block: B:61:0x0126  */
        /* JADX WARN: Code duplicated, block: B:64:0x0132  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2, types: [o90.e$b$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // uf0.a
        public Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? c3554b;
            String message;
            dx.i iVarA;
            Object objB;
            df0.b bVar;
            dx.j<dx.b> jVarA;
            ex.b aVar;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            ex.b bVar2;
            if (eVar instanceof C3554b) {
                C3554b c3554b2 = (C3554b) eVar;
                int i25 = c3554b2.f143413q;
                if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                    c3554b2.f143413q = i25 - PKIFailureInfo.systemUnavail;
                    c3554b = c3554b2;
                } else {
                    c3554b = new C3554b(eVar);
                }
            } else {
                c3554b = new C3554b(eVar);
            }
            Object obj = c3554b.f143411n;
            Object objE = uq.b.e();
            int i26 = c3554b.f143413q;
            try {
                try {
                    if (i26 == 0) {
                        oq.u.b(obj);
                        df0.a aVar2 = this.f143395a;
                        bVar = this.f143396b;
                        jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                            c3554b.f143402d = bVar;
                            c3554b.f143403e = jVarA;
                            c3554b.f143404f = vq.j.a(aVar);
                            c3554b.f143405g = vq.j.a(aVar);
                            i15 = 0;
                            c3554b.f143406h = 0;
                            c3554b.f143407j = 0;
                            c3554b.f143408k = 0;
                            c3554b.f143409l = 0;
                            c3554b.f143410m = 0;
                            c3554b.f143413q = 1;
                            if (aVar2.c(c1792a, c3554b) != objE) {
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                bVar2 = aVar;
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            c3554b = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(c3554b));
                            iVarA = c3554b.a(e);
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
                            oq.u.b(obj);
                            return new dx.i.Right(oq.i0.f148189a);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    int i27 = c3554b.f143410m;
                    i17 = c3554b.f143409l;
                    i18 = c3554b.f143408k;
                    int i28 = c3554b.f143407j;
                    i19 = c3554b.f143406h;
                    aVar = (ex.b) c3554b.f143405g;
                    bVar2 = (ex.b) c3554b.f143404f;
                    dx.j<dx.b> jVar = (dx.j) c3554b.f143403e;
                    bVar = (df0.b) c3554b.f143402d;
                    try {
                        oq.u.b(obj);
                        i16 = i28;
                        i15 = i27;
                        jVarA = jVar;
                    } catch (ex.c e25) {
                        e = e25;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e26) {
                        throw e26;
                    } catch (Exception e27) {
                        e = e27;
                        c3554b = jVar;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(c3554b));
                        iVarA = c3554b.a(e);
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
                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                    c3554b.f143402d = jVarA;
                    c3554b.f143403e = vq.j.a(bVar2);
                    c3554b.f143404f = vq.j.a(aVar);
                    c3554b.f143405g = null;
                    c3554b.f143406h = i19;
                    c3554b.f143407j = i16;
                    c3554b.f143408k = i18;
                    c3554b.f143409l = i17;
                    c3554b.f143410m = i15;
                    c3554b.f143413q = 2;
                    if (bVar.c(c1792a2, c3554b) != objE) {
                        return new dx.i.Right(oq.i0.f148189a);
                    }
                    return objE;
                } catch (Exception e28) {
                    e = e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        }
    }

    private e() {
    }

    public final kg0.a a(a84.b clearNotificationsDeviceTokenUseCase) {
        return new a(clearNotificationsDeviceTokenUseCase);
    }

    public final uf0.a b(df0.a cancelAllDownloadTaskWorkUC, df0.b clearAllDownloadTaskDataUC, df0.e getPreviousDocumentActiveTaskDataUC) {
        return new b(cancelAllDownloadTaskWorkUC, clearAllDownloadTaskDataUC, getPreviousDocumentActiveTaskDataUC);
    }
}
