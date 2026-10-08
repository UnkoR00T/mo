package ch1;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lch1/e0;", "Lch1/d0;", "Lyg1/a;", "dashboardContainersInteractor", "Lez/b;", "dateCalculator", "<init>", "(Lyg1/a;Lez/b;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lah1/i;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lyg1/a;", "b", "Lez/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f26813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f26814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f26815h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f26817k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f26818l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f26819m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f26820n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f26821p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f26822q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f26824s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26822q = obj;
            this.f26824s |= PKIFailureInfo.systemUnavail;
            return e0.this.c(null, this);
        }
    }

    public e0(yg1.a aVar, ez.b bVar) {
        this.dashboardContainersInteractor = aVar;
        this.dateCalculator = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5 A[Catch: Exception -> 0x0079, c -> 0x007d, CancellationException -> 0x0081, TRY_LEAVE, TryCatch #9 {c -> 0x007d, CancellationException -> 0x0081, Exception -> 0x0079, blocks: (B:24:0x0070, B:37:0x00c7, B:39:0x00d5, B:53:0x0138), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x011f A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #9 {Exception -> 0x0041, blocks: (B:13:0x003c, B:43:0x0103, B:45:0x011f, B:55:0x013b, B:50:0x012e, B:51:0x0135, B:63:0x014a, B:66:0x0158), top: B:81:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TRY_LEAVE, TryCatch #9 {Exception -> 0x0041, blocks: (B:13:0x003c, B:43:0x0103, B:45:0x011f, B:55:0x013b, B:50:0x012e, B:51:0x0135, B:63:0x014a, B:66:0x0158), top: B:81:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0138 A[Catch: Exception -> 0x0079, c -> 0x007d, CancellationException -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #9 {c -> 0x007d, CancellationException -> 0x0081, Exception -> 0x0079, blocks: (B:24:0x0070, B:37:0x00c7, B:39:0x00d5, B:53:0x0138), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends ah1.i>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        gz.b.a.C1792a c1792a2;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i19;
        boolean zBooleanValue;
        Object in4;
        long jE;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f26824s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f26824s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objJ = aVar.f26822q;
        ?? E = uq.b.e();
        int i26 = aVar.f26824s;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objJ);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        yg1.a aVar3 = this.dashboardContainersInteractor;
                        rq0.b.d dVar = rq0.b.d.STUDENT_CARD;
                        aVar.f26811d = vq.j.a(c1792a);
                        aVar.f26812e = jVarA;
                        aVar.f26813f = vq.j.a(aVar2);
                        aVar.f26814g = aVar2;
                        aVar.f26815h = aVar2;
                        i15 = 0;
                        aVar.f26816j = 0;
                        aVar.f26817k = 0;
                        aVar.f26818l = 0;
                        aVar.f26819m = 0;
                        aVar.f26820n = 0;
                        aVar.f26824s = 1;
                        Object objK = aVar3.k(dVar, aVar);
                        if (objK != E) {
                            c1792a2 = c1792a;
                            jVar = jVarA;
                            objJ = objK;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                            bVar3 = bVar2;
                            i19 = 0;
                            zBooleanValue = ((Boolean) bVar2.a((dx.i) objJ)).booleanValue();
                            if (zBooleanValue) {
                                yg1.a aVar4 = this.dashboardContainersInteractor;
                                aVar.f26811d = vq.j.a(c1792a2);
                                aVar.f26812e = jVar;
                                aVar.f26813f = vq.j.a(bVar3);
                                aVar.f26814g = vq.j.a(bVar);
                                aVar.f26815h = bVar;
                                aVar.f26816j = i19;
                                aVar.f26817k = i18;
                                aVar.f26818l = i17;
                                aVar.f26819m = i16;
                                aVar.f26820n = i15;
                                aVar.f26821p = zBooleanValue;
                                aVar.f26824s = 2;
                                objJ = aVar4.j(aVar);
                                if (objJ != E) {
                                    jE = this.dateCalculator.e(((CertKeyPair) bVar.a((dx.i) objJ)).getCertificate().getNotAfter());
                                    if (jE == 1) {
                                        in4 = ah1.i.b.C0132b.f6360a;
                                    } else if (2 <= jE) {
                                        in4 = ah1.i.a.f6358a;
                                    } else {
                                        in4 = ah1.i.a.f6358a;
                                    }
                                }
                            } else {
                                in4 = ah1.i.a.f6358a;
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
                    int i27 = aVar.f26820n;
                    i16 = aVar.f26819m;
                    i17 = aVar.f26818l;
                    i18 = aVar.f26817k;
                    int i28 = aVar.f26816j;
                    ex.b bVar4 = (ex.b) aVar.f26815h;
                    ex.b bVar5 = (ex.b) aVar.f26814g;
                    bVar3 = (ex.b) aVar.f26813f;
                    jVar = (dx.j) aVar.f26812e;
                    c1792a2 = (gz.b.a.C1792a) aVar.f26811d;
                    try {
                        oq.u.b(objJ);
                        i15 = i27;
                        bVar = bVar5;
                        bVar2 = bVar4;
                        i19 = i28;
                        zBooleanValue = ((Boolean) bVar2.a((dx.i) objJ)).booleanValue();
                        if (zBooleanValue) {
                            yg1.a aVar5 = this.dashboardContainersInteractor;
                            aVar.f26811d = vq.j.a(c1792a2);
                            aVar.f26812e = jVar;
                            aVar.f26813f = vq.j.a(bVar3);
                            aVar.f26814g = vq.j.a(bVar);
                            aVar.f26815h = bVar;
                            aVar.f26816j = i19;
                            aVar.f26817k = i18;
                            aVar.f26818l = i17;
                            aVar.f26819m = i16;
                            aVar.f26820n = i15;
                            aVar.f26821p = zBooleanValue;
                            aVar.f26824s = 2;
                            objJ = aVar5.j(aVar);
                            if (objJ != E) {
                                jE = this.dateCalculator.e(((CertKeyPair) bVar.a((dx.i) objJ)).getCertificate().getNotAfter());
                                if (jE == 1) {
                                    in4 = ah1.i.b.C0132b.f6360a;
                                } else if (2 <= jE) {
                                    in4 = ah1.i.a.f6358a;
                                } else {
                                    in4 = ah1.i.a.f6358a;
                                }
                            }
                            return E;
                        }
                        in4 = ah1.i.a.f6358a;
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
                    bVar = (ex.b) aVar.f26815h;
                    try {
                        oq.u.b(objJ);
                        jE = this.dateCalculator.e(((CertKeyPair) bVar.a((dx.i) objJ)).getCertificate().getNotAfter());
                        if (jE == 1) {
                            in4 = ah1.i.b.C0132b.f6360a;
                        } else if (2 <= jE || jE >= 31) {
                            in4 = ah1.i.a.f6358a;
                        } else {
                            in4 = new ah1.i.b.In(jE);
                        }
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                }
                return new dx.i.Right(in4);
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }
}
