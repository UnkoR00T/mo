package oa;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002DEBW\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\rBc\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0007\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0010¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u0013J\r\u0010$\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010@\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"Loa/p;", "Loa/a;", "Loa/c;", "config", "Loa/a0;", "openDelegate", "Lkotlin/Function2;", "Lkotlin/Function1;", "Ltq/e;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Loa/c;Loa/a0;Ler/p;)V", "Lza/d;", "supportOpenHelperFactory", "(Loa/c;Ler/l;Ler/p;)V", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()V", "Lza/c;", "onOpen", "I", "(Loa/c;Ler/l;)Loa/c;", "R", "", "isReadOnly", "Loa/g0;", "block", "K", "(ZLer/p;Ltq/e;)Ljava/lang/Object;", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "F", "J", "()Z", "d", "Loa/c;", "o", "()Loa/c;", "configuration", "e", "Loa/a0;", "r", "()Loa/a0;", "", "Loa/u$b;", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "callbacks", "Lqa/c;", "g", "Lqa/c;", "getConnectionPool$room_runtime", "()Lqa/c;", "connectionPool", "h", "Lza/d;", "G", "()Lza/d;", "supportOpenHelper", "i", "Lza/c;", "supportDatabase", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends oa.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oa.c configuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a0 openDelegate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<u.b> callbacks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qa.c connectionPool;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final za.d supportOpenHelper;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private za.c supportDatabase;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Loa/p$a;", "Loa/a0;", "<init>", "()V", "Lya/b;", "connection", "Loq/i0;", "f", "(Lya/b;)V", "i", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "h", "g", "a", "b", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends a0 {
        public a() {
            super(-1, "", "");
        }

        @Override // oa.a0
        public void a(ya.b connection) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // oa.a0
        public void b(ya.b connection) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // oa.a0
        public void f(ya.b connection) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // oa.a0
        public void g(ya.b connection) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // oa.a0
        public void h(ya.b connection) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // oa.a0
        public void i(ya.b connection) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // oa.a0
        public a0.a j(ya.b connection) {
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Loa/p$b;", "Lza/d$a;", "", "version", "<init>", "(Loa/p;I)V", "Lza/c;", "db", "Loq/i0;", "d", "(Lza/c;)V", "oldVersion", "newVersion", "g", "(Lza/c;II)V", "e", "f", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends za.d.a {
        public b(int i15) {
            super(i15);
        }

        @Override // za.d.a
        public void d(za.c db5) {
            p.this.x(new bb.a(db5));
        }

        @Override // za.d.a
        public void e(za.c db5, int oldVersion, int newVersion) {
            g(db5, oldVersion, newVersion);
        }

        @Override // za.d.a
        public void f(za.c db5) {
            p.this.z(new bb.a(db5));
            p.this.supportDatabase = db5;
        }

        @Override // za.d.a
        public void g(za.c db5, int oldVersion, int newVersion) {
            p.this.y(new bb.a(db5), oldVersion, newVersion);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"oa/p$c", "Loa/u$b;", "Lza/c;", "db", "Loq/i0;", "f", "(Lza/c;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<za.c, oq.i0> f143760a;

        /* JADX WARN: Multi-variable type inference failed */
        c(er.l<? super za.c, oq.i0> lVar) {
            this.f143760a = lVar;
        }

        @Override // oa.u.b
        public void f(za.c db5) {
            this.f143760a.b(db5);
        }
    }

    public p(oa.c cVar, a0 a0Var, er.p<? super er.l<? super tq.e<Object>, ? extends Object>, ? super tq.e<Object>, ? extends Object> pVar) {
        qa.c cVarB;
        this.configuration = cVar;
        this.openDelegate = a0Var;
        List<u.b> list = cVar.callbacks;
        this.callbacks = list == null ? pq.v.n() : list;
        ya.c cVar2 = cVar.sqliteDriver;
        if (cVar2 != null) {
            this.supportOpenHelper = null;
            if (cVar2.b()) {
                oa.a.b bVar = new oa.a.b(cVar.sqliteDriver);
                String str = cVar.name;
                cVarB = new qa.n(bVar, str != null ? str : ":memory:", pVar);
            } else {
                cVarB = cVar.name == null ? qa.i.b(new oa.a.b(cVar.sqliteDriver), ":memory:", cVar.getPreparedStatementCacheSize()) : qa.i.a(new oa.a.b(cVar.sqliteDriver), cVar.name, p(cVar.journalMode), q(cVar.journalMode), cVar.getPreparedStatementCacheSize());
            }
            this.connectionPool = cVarB;
        } else {
            if (cVar.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            za.d dVarA = cVar.sqliteOpenHelperFactory.a(za.d.b.INSTANCE.a(cVar.context).d(cVar.name).c(new b(a0Var.getVersion())).b());
            this.supportOpenHelper = dVarA;
            bb.b bVar2 = new bb.b(dVarA);
            String str2 = cVar.name;
            this.connectionPool = new qa.n(bVar2, str2 != null ? str2 : ":memory:", pVar);
        }
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(p pVar, za.c cVar) {
        pVar.supportDatabase = cVar;
        return oq.i0.f148189a;
    }

    private final void H() {
        boolean z15 = getConfiguration().journalMode == u.d.WRITE_AHEAD_LOGGING;
        za.d dVar = this.supportOpenHelper;
        if (dVar != null) {
            dVar.setWriteAheadLoggingEnabled(z15);
        }
    }

    private final oa.c I(oa.c cVar, er.l<? super za.c, oq.i0> lVar) {
        List<u.b> listN = cVar.callbacks;
        if (listN == null) {
            listN = pq.v.n();
        }
        return oa.c.b(cVar, null, null, null, null, pq.v.M0(listN, new c(lVar)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    @Override // oa.a
    public String A(String fileName) {
        return !fr.t.c(fileName, ":memory:") ? getConfiguration().context.getDatabasePath(fileName).getAbsolutePath() : fileName;
    }

    public final void F() {
        this.connectionPool.close();
        za.d dVar = this.supportOpenHelper;
        if (dVar != null) {
            dVar.close();
        }
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final za.d getSupportOpenHelper() {
        return this.supportOpenHelper;
    }

    public final boolean J() {
        za.c cVar = this.supportDatabase;
        if (cVar != null) {
            return cVar.isOpen();
        }
        return false;
    }

    public <R> Object K(boolean z15, er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        return this.connectionPool.u2(z15, pVar, eVar);
    }

    @Override // oa.a
    protected List<u.b> n() {
        return this.callbacks;
    }

    @Override // oa.a
    /* JADX INFO: renamed from: o, reason: from getter */
    protected oa.c getConfiguration() {
        return this.configuration;
    }

    @Override // oa.a
    /* JADX INFO: renamed from: r, reason: from getter */
    protected a0 getOpenDelegate() {
        return this.openDelegate;
    }

    public p(oa.c cVar, er.l<? super oa.c, ? extends za.d> lVar, er.p<? super er.l<? super tq.e<Object>, ? extends Object>, ? super tq.e<Object>, ? extends Object> pVar) {
        this.configuration = cVar;
        this.openDelegate = new a();
        List<u.b> list = cVar.callbacks;
        this.callbacks = list == null ? pq.v.n() : list;
        za.d dVarB = lVar.b(I(cVar, new er.l() { // from class: oa.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.D(this.f143752a, (za.c) obj);
            }
        }));
        this.supportOpenHelper = dVarB;
        bb.b bVar = new bb.b(dVarB);
        String str = cVar.name;
        this.connectionPool = new qa.n(bVar, str == null ? ":memory:" : str, pVar);
        H();
    }
}
