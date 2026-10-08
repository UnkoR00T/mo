package fa2;

import ca2.InstitutionHistoryEntity;
import ca2.VerificationHistoryEntity;
import dx.i;
import dx.j;
import ia2.InstitutionHistoryType;
import ia2.VerificationHistoryType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p10.e;
import pl.gov.coi.mobywatel.feature.history.data.database.HistoryDatabase;
import pq.v;
import px.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\nH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lfa2/a;", "Lja2/a;", "Lp10/e;", "dbProvider", "Lq10/a;", "databaseRegistry", "Lpx/d;", "remoteLogger", "<init>", "(Lp10/e;Lq10/a;Lpx/d;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mobywatel/feature/history/data/database/HistoryDatabase;", "d", "()Ldx/i;", "", "Lia2/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lia2/d;", "c", "Ly92/a;", "historyEntry", "Loq/i0;", "b", "(Ly92/a;Ltq/e;)Ljava/lang/Object;", "Lp10/e;", "Lq10/a;", "Lpx/d;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ja2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dbProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: fa2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1364a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f60434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f60436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60437g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60438h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f60439j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f60440k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f60441l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f60442m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f60444p;

        C1364a(tq.e<? super C1364a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60442m = obj;
            this.f60444p |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f60445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f60447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60449h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f60450j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f60451k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f60452l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f60453m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f60455p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60453m = obj;
            this.f60455p |= PKIFailureInfo.systemUnavail;
            return a.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f60456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f60457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f60458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f60459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60460h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f60461j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f60462k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f60463l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f60464m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f60465n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f60467q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60465n = obj;
            this.f60467q |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    public a(e eVar, q10.a aVar, px.d dVar) {
        this.dbProvider = eVar;
        this.databaseRegistry = aVar;
        this.remoteLogger = dVar;
    }

    private final i<dx.b, HistoryDatabase> d() {
        e eVar = this.dbProvider;
        List<? extends Object> listN = v.n();
        List<? extends ra.b> listN2 = v.n();
        HistoryDatabase.Companion aVar = HistoryDatabase.INSTANCE;
        i<dx.b, HistoryDatabase> iVarB = eVar.b(HistoryDatabase.class, listN, listN2, aVar.a());
        if (iVarB instanceof i.Right) {
            if (!this.databaseRegistry.d().contains(aVar.a())) {
                this.databaseRegistry.c(aVar.a());
                this.remoteLogger.F8("Database added to tracking register: " + aVar.a(), px.d.a.GENERAL);
            }
        }
        return iVarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fa2.a$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [ba2.c] */
    @Override // ja2.a
    public Object a(tq.e<? super i<? extends dx.b, ? extends List<InstitutionHistoryType>>> eVar) throws Throwable {
        ?? c1364a;
        Object objB;
        ex.c e15;
        if (eVar instanceof C1364a) {
            C1364a c1364a2 = (C1364a) eVar;
            int i15 = c1364a2.f60444p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1364a2.f60444p = i15 - PKIFailureInfo.systemUnavail;
                c1364a = c1364a2;
            } else {
                c1364a = new C1364a(eVar);
            }
        } else {
            c1364a = new C1364a(eVar);
        }
        Object obj = c1364a.f60442m;
        Object objE = uq.b.e();
        int i16 = c1364a.f60444p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? A0 = ((HistoryDatabase) aVar.a(d())).a0();
                        c1364a.f60439j = jVarA;
                        c1364a.f60440k = vq.j.a(aVar);
                        c1364a.f60441l = vq.j.a(aVar);
                        c1364a.f60434d = 0;
                        c1364a.f60435e = 0;
                        c1364a.f60436f = 0;
                        c1364a.f60437g = 0;
                        c1364a.f60438h = 0;
                        c1364a.f60444p = 1;
                        Object objB2 = A0.b(c1364a);
                        if (objB2 == objE) {
                            return objE;
                        }
                        obj = objB2;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        c1364a = jVarA;
                        e = e18;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(c1364a));
                        i iVarA = c1364a.a(e);
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
                ArrayList arrayList = new ArrayList();
                for (InstitutionHistoryEntity institutionHistoryEntity : (Iterable) obj) {
                    rq0.b bVarA = rq0.b.INSTANCE.a(institutionHistoryEntity.getDocumentType());
                    InstitutionHistoryType institutionHistoryType = bVarA == null ? null : new InstitutionHistoryType(institutionHistoryEntity.getTimestamp(), bVarA, institutionHistoryEntity.getInstitutionName());
                    if (institutionHistoryType != null) {
                        arrayList.add(institutionHistoryType);
                    }
                }
                return new i.Right(arrayList);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016b, code lost:
    
        if (r7.a(r10, r2) == r4) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // ja2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(y92.a r27, tq.e<? super dx.i<? extends dx.b, oq.i0>> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa2.a.b(y92.a, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // ja2.a
    public Object c(tq.e<? super i<? extends dx.b, ? extends List<VerificationHistoryType>>> eVar) throws Throwable {
        b bVar;
        Object objB;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f60455p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f60455p = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f60453m;
        ?? E = uq.b.e();
        int i16 = bVar.f60455p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ba2.f fVarB0 = ((HistoryDatabase) aVar.a(d())).b0();
                        bVar.f60450j = jVarA;
                        bVar.f60451k = vq.j.a(aVar);
                        bVar.f60452l = vq.j.a(aVar);
                        bVar.f60445d = 0;
                        bVar.f60446e = 0;
                        bVar.f60447f = 0;
                        bVar.f60448g = 0;
                        bVar.f60449h = 0;
                        bVar.f60455p = 1;
                        Object objB2 = fVarB0.b(bVar);
                        if (objB2 == E) {
                            return E;
                        }
                        obj = objB2;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        e = e16;
                        throw e;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        Exception exc = e;
                        f fVar = f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(E));
                        i iVarA = E.a(exc);
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
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        e = e19;
                        throw e;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (VerificationHistoryEntity verificationHistoryEntity : (Iterable) obj) {
                    rq0.b bVarA = rq0.b.INSTANCE.a(verificationHistoryEntity.getDocumentType());
                    VerificationHistoryType verificationHistoryType = bVarA == null ? null : new VerificationHistoryType(verificationHistoryEntity.getTimestamp(), bVarA, verificationHistoryEntity.getIsAccepted(), verificationHistoryEntity.getConnectionError());
                    if (verificationHistoryType != null) {
                        arrayList.add(verificationHistoryType);
                    }
                }
                return new i.Right(arrayList);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
