package qa;

import android.database.SQLException;
import ju.p0;
import oa.g0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0013\u001a\u00020\u00122\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\r0-j\b\u0012\u0004\u0012\u00020\r`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lqa/h;", "Lqa/c;", "Lya/c;", "driver", "", "fileName", "", "preparedStatementCacheSize", "<init>", "(Lya/c;Ljava/lang/String;I)V", "maxNumOfReaders", "maxNumOfWriters", "(Lya/c;Ljava/lang/String;III)V", "Lqa/p;", "connection", "Ltq/i;", "C", "(Lqa/p;)Ltq/i;", "", "isReadOnly", "Loq/i0;", "E", "(Z)V", "R", "Lkotlin/Function2;", "Loa/g0;", "Ltq/e;", "", "block", "u2", "(ZLer/p;Ltq/e;)Ljava/lang/Object;", "close", "()V", "a", "Lya/c;", "Lqa/o;", "b", "Lqa/o;", "readers", "c", "writers", "Lqa/b;", "d", "Lqa/b;", "connectionElementKey", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "e", "Ljava/lang/ThreadLocal;", "connectionThreadLocal", "f", "Z", "isClosed", "Lgu/b;", "g", "J", "getTimeout-UwyO8pc$room_runtime", "()J", "setTimeout-LRDsOJo$room_runtime", "(J)V", "timeout", "h", "I", "getOnTimeout$room_runtime", "()I", "setOnTimeout$room_runtime", "(I)V", "onTimeout", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements qa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ya.c driver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o readers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o writers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qa.b connectionElementKey = new qa.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<p> connectionThreadLocal = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isClosed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long timeout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int onTimeout;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f165432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f165434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f165435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f165436h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f165437j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f165438k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f165439l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f165441n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165439l = obj;
            this.f165441n |= PKIFailureInfo.systemUnavail;
            return h.this.u2(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.p<g0, tq.e<? super R>, Object> f165443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f165444g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar, p pVar2, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f165443f = pVar;
            this.f165444g = pVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f165442e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            er.p<g0, tq.e<? super R>, Object> pVar = this.f165443f;
            p pVar2 = this.f165444g;
            this.f165442e = 1;
            Object objB = pVar.B(pVar2, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f165443f, this.f165444g, eVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class c<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.p<g0, tq.e<? super R>, Object> f165446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.p0<p> f165447g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar, fr.p0<p> p0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f165446f = pVar;
            this.f165447g = p0Var;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to qa.h$c<R> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r3.f165445e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                oq.u.b(r4)
                er.p<oa.g0, tq.e<? super R>, java.lang.Object> r4 = r3.f165446f
                fr.p0<qa.p> r1 = r3.f165447g
                T r1 = r1.f66410a
                r3.f165445e = r2
                java.lang.Object r4 = r4.B(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: qa.h.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f165446f, this.f165447g, eVar);
        }
    }

    public h(final ya.c cVar, final String str, int i15) {
        gu.b.Companion companion = gu.b.INSTANCE;
        this.timeout = gu.d.q(30, gu.e.SECONDS);
        this.onTimeout = 2;
        this.driver = cVar;
        o oVar = new o(1, new er.a() { // from class: qa.g
            @Override // er.a
            public final Object a() {
                return h.r(cVar, str);
            }
        }, i15);
        this.readers = oVar;
        this.writers = oVar;
    }

    private final tq.i C(p connection) {
        return new qa.a(this.connectionElementKey, connection).n0(pa.d.a(this.connectionThreadLocal, connection));
    }

    private final void E(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Timed out attempting to acquire a " + str + " connection.");
        sb5.append('\n');
        sb5.append('\n');
        sb5.append("Writer pool:");
        sb5.append('\n');
        this.writers.d(sb5);
        sb5.append("Reader pool:");
        sb5.append('\n');
        this.readers.d(sb5);
        try {
            ya.a.b(5, sb5.toString());
            throw new oq.g();
        } catch (SQLException e15) {
            int i15 = this.onTimeout;
            if (i15 == 1) {
                throw e15;
            }
            if (i15 != 2) {
                return;
            }
            e15.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(h hVar, boolean z15) {
        hVar.E(z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b r(ya.c cVar, String str) {
        return cVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b u(ya.c cVar, String str) throws Exception {
        ya.b bVarA = cVar.a(str);
        ya.a.a(bVarA, "PRAGMA query_only = 1");
        return bVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b y(ya.c cVar, String str) {
        return cVar.a(str);
    }

    @Override // qa.c, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.readers.c();
        this.writers.c();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:64:0x0121, B:69:0x0131, B:71:0x013c, B:81:0x017a, B:82:0x0181), top: B:101:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #2 {all -> 0x0176, blocks: (B:64:0x0121, B:69:0x0131, B:71:0x013c, B:81:0x017a, B:82:0x0181), top: B:101:0x0121 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, qa.p] */
    @Override // qa.c
    public <R> Object u2(boolean z15, er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) throws Exception {
        a aVar;
        fr.p0 p0Var;
        Throwable th4;
        o oVar;
        tq.i context;
        er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar2;
        qa.b bVar;
        o oVar2;
        fr.p0 p0Var2;
        T t15;
        fr.p0 p0Var3;
        p pVar3;
        final boolean z16 = z15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f165441n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f165441n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objG = aVar.f165439l;
        Object objE = uq.b.e();
        int i16 = aVar.f165441n;
        boolean z17 = true;
        if (i16 != 0) {
            if (i16 == 1) {
                u.b(objG);
                return objG;
            }
            if (i16 == 2) {
                u.b(objG);
                return objG;
            }
            if (i16 == 3) {
                z16 = aVar.f165432d;
                bVar = (qa.b) aVar.f165438k;
                fr.p0 p0Var4 = (fr.p0) aVar.f165437j;
                tq.i iVar = (tq.i) aVar.f165436h;
                fr.p0 p0Var5 = (fr.p0) aVar.f165435g;
                oVar2 = (o) aVar.f165434f;
                pVar2 = (er.p) aVar.f165433e;
                try {
                    u.b(objG);
                    p0Var2 = p0Var4;
                    p0Var = p0Var5;
                    context = iVar;
                    try {
                        j jVarY = ((j) objG).y(context);
                        if (this.readers != this.writers || !z16) {
                            z17 = false;
                        }
                        p0Var2.f66410a = new p(bVar, jVarY, z17);
                        t15 = p0Var.f66410a;
                        if (t15 != 0) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        tq.i iVarC = C((p) t15);
                        c cVar = new c(pVar2, p0Var, null);
                        aVar.f165433e = oVar2;
                        aVar.f165434f = p0Var;
                        aVar.f165435g = null;
                        aVar.f165436h = null;
                        aVar.f165437j = null;
                        aVar.f165438k = null;
                        aVar.f165441n = 4;
                        objG = ju.i.g(iVarC, cVar, aVar);
                        if (objG != objE) {
                            p0Var3 = p0Var;
                            oVar = oVar2;
                        }
                        return objE;
                    } catch (Throwable th5) {
                        th4 = th5;
                        oVar = oVar2;
                        throw th4;
                    }
                } catch (Throwable th6) {
                    th4 = th6;
                    p0Var = p0Var5;
                    oVar = oVar2;
                    throw th4;
                }
            }
            if (i16 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var3 = (fr.p0) aVar.f165434f;
            oVar = (o) aVar.f165433e;
            try {
                u.b(objG);
            } catch (Throwable th7) {
                p0Var = p0Var3;
                th4 = th7;
            }
            pVar3 = (p) p0Var3.f66410a;
            if (pVar3 != null) {
                pVar3.n();
                pVar3.getDelegate().C();
                oVar.e(pVar3.getDelegate());
            }
            return objG;
        }
        u.b(objG);
        if (this.isClosed) {
            ya.a.b(21, "Connection pool is closed");
            throw new oq.g();
        }
        p connectionWrapper = this.connectionThreadLocal.get();
        if (connectionWrapper == null) {
            qa.a aVar2 = (qa.a) aVar.getContext().m(this.connectionElementKey);
            connectionWrapper = aVar2 != null ? aVar2.getConnectionWrapper() : null;
        }
        if (connectionWrapper == null) {
            o oVar3 = z16 ? this.readers : this.writers;
            p0Var = new fr.p0();
            try {
                context = aVar.getContext();
                qa.b bVar2 = this.connectionElementKey;
                long j15 = this.timeout;
                er.a<i0> aVar3 = new er.a() { // from class: qa.f
                    @Override // er.a
                    public final Object a() {
                        return h.H(this.f165420a, z16);
                    }
                };
                aVar.f165433e = pVar;
                aVar.f165434f = oVar3;
                aVar.f165435g = p0Var;
                aVar.f165436h = context;
                aVar.f165437j = p0Var;
                aVar.f165438k = bVar2;
                aVar.f165432d = z16;
                aVar.f165441n = 3;
                Object objB = oVar3.b(j15, aVar3, aVar);
                if (objB != objE) {
                    pVar2 = pVar;
                    bVar = bVar2;
                    oVar2 = oVar3;
                    objG = objB;
                    p0Var2 = p0Var;
                    j jVarY2 = ((j) objG).y(context);
                    if (this.readers != this.writers) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    p0Var2.f66410a = new p(bVar, jVarY2, z17);
                    t15 = p0Var.f66410a;
                    if (t15 != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    tq.i iVarC2 = C((p) t15);
                    c cVar2 = new c(pVar2, p0Var, null);
                    aVar.f165433e = oVar2;
                    aVar.f165434f = p0Var;
                    aVar.f165435g = null;
                    aVar.f165436h = null;
                    aVar.f165437j = null;
                    aVar.f165438k = null;
                    aVar.f165441n = 4;
                    objG = ju.i.g(iVarC2, cVar2, aVar);
                    if (objG != objE) {
                        p0Var3 = p0Var;
                        oVar = oVar2;
                        pVar3 = (p) p0Var3.f66410a;
                        if (pVar3 != null) {
                            pVar3.n();
                            pVar3.getDelegate().C();
                            oVar.e(pVar3.getDelegate());
                        }
                        return objG;
                    }
                }
            } catch (Throwable th8) {
                th4 = th8;
                oVar = oVar3;
            }
        } else {
            if (!z16 && connectionWrapper.getIsReadOnly()) {
                ya.a.b(1, "Cannot upgrade connection from reader to writer");
                throw new oq.g();
            }
            if (aVar.getContext().m(this.connectionElementKey) == null) {
                tq.i iVarC3 = C(connectionWrapper);
                b bVar3 = new b(pVar, connectionWrapper, null);
                aVar.f165441n = 1;
                Object objG2 = ju.i.g(iVarC3, bVar3, aVar);
                if (objG2 != objE) {
                    return objG2;
                }
            } else {
                aVar.f165441n = 2;
                Object objB2 = pVar.B(connectionWrapper, aVar);
                if (objB2 != objE) {
                    return objB2;
                }
            }
        }
        return objE;
        try {
            throw th4;
        } catch (Throwable th9) {
            try {
                p pVar4 = (p) p0Var.f66410a;
                if (pVar4 == null) {
                    throw th9;
                }
                pVar4.n();
                pVar4.getDelegate().C();
                oVar.e(pVar4.getDelegate());
                throw th9;
            } catch (Throwable th10) {
                oq.c.a(th4, th10);
                throw th9;
            }
        }
    }

    public h(final ya.c cVar, final String str, int i15, int i16, int i17) {
        gu.b.Companion companion = gu.b.INSTANCE;
        this.timeout = gu.d.q(30, gu.e.SECONDS);
        this.onTimeout = 2;
        if (i15 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i16 > 0) {
            this.driver = cVar;
            this.readers = new o(i15, new er.a() { // from class: qa.d
                @Override // er.a
                public final Object a() {
                    return h.u(cVar, str);
                }
            }, i17);
            this.writers = new o(i16, new er.a() { // from class: qa.e
                @Override // er.a
                public final Object a() {
                    return h.y(cVar, str);
                }
            }, i17);
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
