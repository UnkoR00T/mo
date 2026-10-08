package qa;

import java.util.Iterator;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r0.c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096A¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00107\u001a\b\u0018\u000104R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u0010 ¨\u0006:"}, d2 = {"Lqa/j;", "Lya/b;", "Lsu/a;", "delegate", "lock", "", "preparedStatementCacheSize", "<init>", "(Lya/b;Lsu/a;I)V", "", "sql", "Lya/d;", "e4", "(Ljava/lang/String;)Lya/d;", "Loq/i0;", "close", "()V", "Ltq/i;", "context", "y", "(Ltq/i;)Lqa/j;", "C", "()Lqa/j;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "u", "(Ljava/lang/StringBuilder;)V", "toString", "()Ljava/lang/String;", "", "l0", "()Z", "", "owner", "h", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "m", "(Ljava/lang/Object;)Z", "r", "(Ljava/lang/Object;)V", "a", "Lya/b;", "b", "Lsu/a;", "c", "Ltq/i;", "acquireCoroutineContext", "", "d", "Ljava/lang/Throwable;", "acquireThrowable", "Lqa/j$b;", "e", "Lqa/j$b;", "preparedStatementCache", "p", "isLocked", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j implements ya.b, su.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ya.b delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final su.a lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private tq.i acquireCoroutineContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Throwable acquireThrowable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b preparedStatementCache;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00142\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u001f2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\u00142\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b*\u0010\u0007J\u0010\u0010+\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b+\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lqa/j$a;", "Lya/d;", "delegate", "<init>", "(Lya/d;)V", "Loq/i0;", "close", "()V", "", "index", "", "value", "g0", "(I[B)V", "", "Q", "(ID)V", "", "f0", "(IJ)V", "", "S0", "(ILjava/lang/String;)V", "i0", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "", "M2", "(I)Z", "u3", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "Y3", "()Z", "reset", "o0", "a", "Lya/d;", "getDelegate", "()Lya/d;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements ya.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ya.d delegate;

        public a(ya.d dVar) {
            this.delegate = dVar;
        }

        @Override // ya.d
        public boolean M2(int index) {
            return this.delegate.M2(index);
        }

        @Override // ya.d
        public void Q(int index, double value) {
            this.delegate.Q(index, value);
        }

        @Override // ya.d
        public void S0(int index, String value) {
            this.delegate.S0(index, value);
        }

        @Override // ya.d
        public boolean Y3() {
            return this.delegate.Y3();
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() {
            this.delegate.reset();
            this.delegate.o0();
        }

        @Override // ya.d
        public void f0(int index, long value) {
            this.delegate.f0(index, value);
        }

        @Override // ya.d
        public void g0(int index, byte[] value) {
            this.delegate.g0(index, value);
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // ya.d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // ya.d
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // ya.d
        public double getDouble(int index) {
            return this.delegate.getDouble(index);
        }

        @Override // ya.d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // ya.d
        public void i0(int index) {
            this.delegate.i0(index);
        }

        @Override // ya.d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // ya.d
        public void o0() {
            this.delegate.o0();
        }

        @Override // ya.d
        public void reset() {
            this.delegate.reset();
        }

        @Override // ya.d
        public String u3(int index) {
            return this.delegate.u3(index);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqa/j$b;", "Lr0/c0;", "", "Lya/d;", "", "maxSize", "<init>", "(Lqa/j;I)V", "key", "k", "(Ljava/lang/String;)Lya/d;", "", "evicted", "oldValue", "newValue", "Loq/i0;", "l", "(ZLjava/lang/String;Lya/d;Lya/d;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends c0<String, ya.d> {
        public b(int i15) {
            super(i15);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r0.c0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ya.d a(String key) {
            return j.this.delegate.e4(key);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r0.c0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void b(boolean evicted, String key, ya.d oldValue, ya.d newValue) {
            oldValue.close();
            super.b(evicted, key, oldValue, newValue);
        }
    }

    public j(ya.b bVar, su.a aVar, int i15) {
        this.delegate = bVar;
        this.lock = aVar;
        this.preparedStatementCache = i15 > 0 ? new b(i15) : null;
    }

    public final j C() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // ya.b, java.lang.AutoCloseable
    public void close() {
        b bVar = this.preparedStatementCache;
        if (bVar != null) {
            bVar.c();
        }
        this.delegate.close();
    }

    @Override // ya.b
    public ya.d e4(String sql) {
        b bVar = this.preparedStatementCache;
        return bVar != null ? new a(bVar.d(sql)) : this.delegate.e4(sql);
    }

    @Override // su.a
    public Object h(Object obj, tq.e<? super i0> eVar) {
        return this.lock.h(obj, eVar);
    }

    @Override // ya.b
    public boolean l0() {
        return this.delegate.l0();
    }

    @Override // su.a
    public boolean m(Object owner) {
        return this.lock.m(owner);
    }

    @Override // su.a
    public boolean p() {
        return this.lock.p();
    }

    @Override // su.a
    public void r(Object owner) {
        this.lock.r(owner);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public final void u(StringBuilder builder) {
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
        } else {
            builder.append("\t\tStatus: Acquired connection");
            builder.append('\n');
            tq.i iVar = this.acquireCoroutineContext;
            if (iVar != null) {
                builder.append("\t\tCoroutine: " + iVar);
                builder.append('\n');
            }
            Throwable th4 = this.acquireThrowable;
            if (th4 != null) {
                builder.append("\t\tAcquired:");
                builder.append('\n');
                Iterator it = v.f0(fu.r.A0(oq.c.c(th4)), 1).iterator();
                while (it.hasNext()) {
                    builder.append("\t\t" + ((String) it.next()));
                    builder.append('\n');
                }
            }
        }
        if (this.preparedStatementCache != null) {
            builder.append("\t\tPrepared Statement Cache Size: " + this.preparedStatementCache.h());
            builder.append('\n');
        }
    }

    public final j y(tq.i context) {
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    public /* synthetic */ j(ya.b bVar, su.a aVar, int i15, int i16, fr.k kVar) {
        this(bVar, (i16 & 2) != 0 ? su.g.b(false, 1, null) : aVar, i15);
    }
}
