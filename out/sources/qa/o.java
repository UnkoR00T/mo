package qa;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\fJ\u0019\u0010\u001c\u001a\u00020\n2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b$\u0010 R\u0018\u0010(\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0010058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lqa/o;", "", "", "capacity", "Lkotlin/Function0;", "Lya/b;", "connectionFactory", "preparedStatementCacheSize", "<init>", "(ILer/a;I)V", "Loq/i0;", "f", "()V", "Lgu/b;", "timeout", "onTimeout", "Lqa/j;", "b", "(JLer/a;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "connection", "e", "(Lqa/j;)V", "c", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "d", "(Ljava/lang/StringBuilder;)V", "I", "getCapacity", "()I", "Ler/a;", "getConnectionFactory", "()Ler/a;", "getPreparedStatementCacheSize", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "size", "", "Z", "isClosed", "", "g", "[Lqa/j;", "connections", "Lsu/h;", "h", "Lsu/h;", "connectionPermits", "Lpq/m;", "i", "Lpq/m;", "availableConnections", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<ya.b> connectionFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int preparedStatementCacheSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j[] connections;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final su.h connectionPermits;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final pq.m<j> availableConnections;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f165509d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f165511f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165509d = obj;
            this.f165511f |= PKIFailureInfo.systemUnavail;
            return o.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f165512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f165514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f165515g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f165517j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165515g = obj;
            this.f165517j |= PKIFailureInfo.systemUnavail;
            return o.this.b(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f165519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.p0<j> f165520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o f165521h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fr.p0<j> p0Var, o oVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f165520g = p0Var;
            this.f165521h = oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr.p0<j> p0Var;
            T t15;
            Object objE = uq.b.e();
            int i15 = this.f165519f;
            if (i15 == 0) {
                u.b(obj);
                fr.p0<j> p0Var2 = this.f165520g;
                o oVar = this.f165521h;
                this.f165518e = p0Var2;
                this.f165519f = 1;
                Object objA = oVar.a(this);
                if (objA == objE) {
                    return objE;
                }
                p0Var = p0Var2;
                t15 = objA;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (fr.p0) this.f165518e;
                u.b(obj);
                t15 = obj;
            }
            p0Var.f66410a = t15;
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f165520g, this.f165521h, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(int i15, er.a<? extends ya.b> aVar, int i16) {
        this.capacity = i15;
        this.connectionFactory = aVar;
        this.preparedStatementCacheSize = i16;
        this.connections = new j[i15];
        this.connectionPermits = su.l.b(i15, 0, 2, null);
        this.availableConnections = new pq.m<>(i15);
    }

    private final void f() {
        if (this.size >= this.capacity) {
            return;
        }
        j jVar = new j(this.connectionFactory.a(), null, this.preparedStatementCacheSize, 2, null);
        j[] jVarArr = this.connections;
        int i15 = this.size;
        this.size = i15 + 1;
        jVarArr[i15] = jVar;
        this.availableConnections.addLast(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(tq.e<? super j> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f165511f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f165511f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f165509d;
        Object objE = uq.b.e();
        int i16 = aVar.f165511f;
        if (i16 == 0) {
            u.b(obj);
            su.h hVar = this.connectionPermits;
            aVar.f165511f = 1;
            if (hVar.c(aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        try {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.isClosed) {
                    ya.a.b(21, "Connection pool is closed");
                    throw new oq.g();
                }
                if (this.availableConnections.isEmpty()) {
                    f();
                }
                j jVarRemoveLast = this.availableConnections.removeLast();
                reentrantLock.unlock();
                return jVarRemoveLast;
            } catch (Throwable th4) {
                reentrantLock.unlock();
                throw th4;
            }
        } catch (Throwable th5) {
            this.connectionPermits.b();
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:28:0x006b, B:30:0x006f, B:34:0x0077, B:38:0x007e), top: B:45:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:28:0x006b, B:30:0x006f, B:34:0x0077, B:38:0x007e), top: B:45:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:28:0x006b, B:30:0x006f, B:34:0x0077, B:38:0x007e), top: B:45:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:24:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r8, er.a<oq.i0> r10, tq.e<? super qa.j> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof qa.o.b
            if (r0 == 0) goto L13
            r0 = r11
            qa.o$b r0 = (qa.o.b) r0
            int r1 = r0.f165517j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f165517j = r1
            goto L18
        L13:
            qa.o$b r0 = new qa.o$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f165515g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f165517j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r8 = r0.f165512d
            java.lang.Object r10 = r0.f165514f
            fr.p0 r10 = (fr.p0) r10
            java.lang.Object r2 = r0.f165513e
            er.a r2 = (er.a) r2
            oq.u.b(r11)     // Catch: java.lang.Throwable -> L34
            goto L5c
        L34:
            r11 = move-exception
            goto L66
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            oq.u.b(r11)
        L41:
            fr.p0 r11 = new fr.p0
            r11.<init>()
            qa.o$c r2 = new qa.o$c     // Catch: java.lang.Throwable -> L61
            r2.<init>(r11, r7, r4)     // Catch: java.lang.Throwable -> L61
            r0.f165513e = r10     // Catch: java.lang.Throwable -> L61
            r0.f165514f = r11     // Catch: java.lang.Throwable -> L61
            r0.f165512d = r8     // Catch: java.lang.Throwable -> L61
            r0.f165517j = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = ju.g3.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L61
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r2 = r10
            r10 = r11
        L5c:
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r4
            goto L6b
        L61:
            r2 = move-exception
            r6 = r2
            r2 = r10
            r10 = r11
            r11 = r6
        L66:
            r6 = r11
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r6
        L6b:
            boolean r5 = r0 instanceof ju.e3     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            r10.a()     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r8 = move-exception
            goto L7f
        L75:
            if (r0 != 0) goto L7e
            T r11 = r11.f66410a     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L7c
            return r11
        L7c:
            r0 = r2
            goto L41
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L7f:
            T r9 = r11.f66410a
            qa.j r9 = (qa.j) r9
            if (r9 == 0) goto L88
            r7.e(r9)
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.o.b(long, er.a, tq.e):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (j jVar : this.connections) {
                if (jVar != null) {
                    jVar.close();
                }
            }
            i0 i0Var = i0.f148189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder builder) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listC = v.c();
            int size = this.availableConnections.size();
            for (int i15 = 0; i15 < size; i15++) {
                listC.add(this.availableConnections.get(i15));
            }
            List listA = v.a(listC);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.a() + ", ");
            builder.append("queue=(size=" + listA.size() + ")[" + v.v0(listA, null, null, null, 0, null, null, 63, null) + ']');
            builder.append(")");
            builder.append('\n');
            j[] jVarArr = this.connections;
            int length = jVarArr.length;
            int i16 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                j jVar = jVarArr[i17];
                i16++;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("\t\t[");
                sb5.append(i16);
                sb5.append("] - ");
                sb5.append(jVar != null ? jVar.toString() : null);
                builder.append(sb5.toString());
                builder.append('\n');
                if (jVar != null) {
                    jVar.u(builder);
                }
            }
            i0 i0Var = i0.f148189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(j connection) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connection);
            i0 i0Var = i0.f148189a;
            reentrantLock.unlock();
            this.connectionPermits.b();
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }
}
