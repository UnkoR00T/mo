package qa;

import oa.f0;
import oa.g0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\"\u001f!B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 JH\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010\"\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00107¨\u00069"}, d2 = {"Lqa/p;", "Loa/g0;", "Lqa/q;", "Lqa/b;", "connectionElementKey", "Lqa/j;", "delegate", "", "isReadOnly", "<init>", "(Lqa/b;Lqa/j;Z)V", "R", "Loa/g0$a;", "type", "Lkotlin/Function2;", "Loa/f0;", "Ltq/e;", "", "block", "o", "(Loa/g0$a;Ler/p;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "i", "(Loa/g0$a;Ltq/e;)Ljava/lang/Object;", "success", "j", "(ZLtq/e;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Lya/d;", "b", "(Ljava/lang/String;Ler/l;Ltq/e;)Ljava/lang/Object;", "a", "c", "(Ltq/e;)Ljava/lang/Object;", "n", "()V", "Lqa/b;", "k", "()Lqa/b;", "Lqa/j;", "l", "()Lqa/j;", "Z", "m", "()Z", "Lpq/m;", "Lqa/p$c;", "d", "Lpq/m;", "transactionStack", "e", "isRecycled", "Lya/b;", "()Lya/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p implements g0, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qa.b connectionElementKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isReadOnly;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pq.m<c> transactionStack = new pq.m<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isRecycled;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010(R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lqa/p$a;", "Lya/d;", "delegate", "<init>", "(Lqa/p;Lya/d;)V", "", "index", "", "value", "Loq/i0;", "g0", "(I[B)V", "", "Q", "(ID)V", "", "f0", "(IJ)V", "", "S0", "(ILjava/lang/String;)V", "i0", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "u3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "Y3", "()Z", "reset", "()V", "o0", "close", "a", "Lya/d;", "b", "J", "threadId", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements ya.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ya.d delegate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long threadId = pa.d.b();

        public a(ya.d dVar) {
            this.delegate = dVar;
        }

        @Override // ya.d
        public void Q(int index, double value) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.Q(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public void S0(int index, String value) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.S0(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public boolean Y3() {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.Y3();
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.close();
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public void f0(int index, long value) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.f0(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public void g0(int index, byte[] value) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.g0(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.getBlob(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }

        @Override // ya.d
        public int getColumnCount() {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.getColumnCount();
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }

        @Override // ya.d
        public String getColumnName(int index) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.getColumnName(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }

        @Override // ya.d
        public double getDouble(int index) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.getDouble(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }

        @Override // ya.d
        public long getLong(int index) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.getLong(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }

        @Override // ya.d
        public void i0(int index) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.i0(index);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public boolean isNull(int index) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.isNull(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }

        @Override // ya.d
        public void o0() {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.o0();
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public void reset() {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                this.delegate.reset();
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new oq.g();
            }
        }

        @Override // ya.d
        public String u3(int index) {
            if (p.this.isRecycled) {
                ya.a.b(21, "Statement is recycled");
                throw new oq.g();
            }
            if (this.threadId == pa.d.b()) {
                return this.delegate.u3(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqa/p$b;", "T", "Loa/f0;", "Lqa/q;", "<init>", "(Lqa/p;)V", "R", "", "sql", "Lkotlin/Function1;", "Lya/d;", "block", "b", "(Ljava/lang/String;Ler/l;Ltq/e;)Ljava/lang/Object;", "Lya/b;", "d", "()Lya/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b<T> implements f0<T>, q {
        public b() {
        }

        @Override // oa.m
        public <R> Object b(String str, er.l<? super ya.d, ? extends R> lVar, tq.e<? super R> eVar) {
            return p.this.b(str, lVar, eVar);
        }

        @Override // qa.q
        /* JADX INFO: renamed from: d */
        public ya.b getDelegate() {
            return p.this.getDelegate();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqa/p$c;", "", "", "id", "", "shouldRollback", "<init>", "(IZ)V", "a", "I", "()I", "b", "Z", "()Z", "setShouldRollback", "(Z)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldRollback;

        public c(int i15, boolean z15) {
            this.id = i15;
            this.shouldRollback = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165533a;

        static {
            int[] iArr = new int[g0.a.values().length];
            try {
                iArr[g0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f165533a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f165534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165536f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165538h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165536f = obj;
            this.f165538h |= PKIFailureInfo.systemUnavail;
            return p.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f165539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165541f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165543h;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165541f = obj;
            this.f165543h |= PKIFailureInfo.systemUnavail;
            return p.this.j(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f165544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f165546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f165547g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f165549j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165547g = obj;
            this.f165549j |= PKIFailureInfo.systemUnavail;
            return p.this.o(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f165550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f165552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f165553g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f165555j;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165553g = obj;
            this.f165555j |= PKIFailureInfo.systemUnavail;
            return p.this.b(null, null, this);
        }
    }

    public p(qa.b bVar, j jVar, boolean z15) {
        this.connectionElementKey = bVar;
        this.delegate = jVar;
        this.isReadOnly = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(g0.a aVar, tq.e<? super i0> eVar) throws Throwable {
        e eVar2;
        su.a aVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f165538h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f165538h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f165536f;
        Object objE = uq.b.e();
        int i16 = eVar2.f165538h;
        if (i16 == 0) {
            u.b(obj);
            aVar2 = this.delegate;
            eVar2.f165534d = aVar;
            eVar2.f165535e = aVar2;
            eVar2.f165538h = 1;
            if (aVar2.h(null, eVar2) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            su.a aVar3 = (su.a) eVar2.f165535e;
            g0.a aVar4 = (g0.a) eVar2.f165534d;
            u.b(obj);
            aVar2 = aVar3;
            aVar = aVar4;
        }
        try {
            int size = this.transactionStack.size();
            if (this.transactionStack.isEmpty()) {
                int i17 = d.f165533a[aVar.ordinal()];
                if (i17 == 1) {
                    ya.a.a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i17 == 2) {
                    ya.a.a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i17 != 3) {
                        throw new oq.p();
                    }
                    ya.a.a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                ya.a.a(this.delegate, "SAVEPOINT '" + size + '\'');
            }
            this.transactionStack.addLast(new c(size, false));
            i0 i0Var = i0.f148189a;
            aVar2.r(null);
            return i0Var;
        } catch (Throwable th4) {
            aVar2.r(null);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z15, tq.e<? super i0> eVar) throws Throwable {
        f fVar;
        su.a aVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f165543h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f165543h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f165541f;
        Object objE = uq.b.e();
        int i16 = fVar.f165543h;
        if (i16 == 0) {
            u.b(obj);
            j jVar = this.delegate;
            fVar.f165540e = jVar;
            fVar.f165539d = z15;
            fVar.f165543h = 1;
            if (jVar.h(null, fVar) == objE) {
                return objE;
            }
            aVar = jVar;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = fVar.f165539d;
            aVar = (su.a) fVar.f165540e;
            u.b(obj);
        }
        try {
            if (this.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar = (c) v.M(this.transactionStack);
            if (!z15 || cVar.getShouldRollback()) {
                if (this.transactionStack.isEmpty()) {
                    ya.a.a(this.delegate, "ROLLBACK TRANSACTION");
                } else {
                    ya.a.a(this.delegate, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.getId() + '\'');
                }
            } else if (this.transactionStack.isEmpty()) {
                ya.a.a(this.delegate, "END TRANSACTION");
            } else {
                ya.a.a(this.delegate, "RELEASE SAVEPOINT '" + cVar.getId() + '\'');
            }
            i0 i0Var = i0.f148189a;
            aVar.r(null);
            return i0Var;
        } catch (Throwable th4) {
            aVar.r(null);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (j(false, r0) == r1) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object o(oa.g0.a r11, er.p<? super oa.f0<R>, ? super tq.e<? super R>, ? extends java.lang.Object> r12, tq.e<? super R> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof qa.p.g
            if (r0 == 0) goto L13
            r0 = r13
            qa.p$g r0 = (qa.p.g) r0
            int r1 = r0.f165549j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f165549j = r1
            goto L18
        L13:
            qa.p$g r0 = new qa.p$g
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f165547g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f165549j
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L62
            if (r2 == r8) goto L59
            if (r2 == r6) goto L51
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            if (r2 == r3) goto L3b
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r0.f165545e
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.Object r12 = r0.f165544d
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            oq.u.b(r13)     // Catch: android.database.SQLException -> L48
            goto Lc6
        L48:
            r13 = move-exception
            goto Lc1
        L4b:
            java.lang.Object r11 = r0.f165544d
            oq.u.b(r13)
            return r11
        L51:
            int r11 = r0.f165546f
            oq.u.b(r13)     // Catch: java.lang.Throwable -> L57
            goto L87
        L57:
            r11 = move-exception
            goto L96
        L59:
            java.lang.Object r11 = r0.f165544d
            r12 = r11
            er.p r12 = (er.p) r12
            oq.u.b(r13)
            goto L74
        L62:
            oq.u.b(r13)
            if (r11 != 0) goto L69
            oa.g0$a r11 = oa.g0.a.DEFERRED
        L69:
            r0.f165544d = r12
            r0.f165549j = r8
            java.lang.Object r11 = r10.i(r11, r0)
            if (r11 != r1) goto L74
            goto Lbe
        L74:
            qa.p$b r11 = new qa.p$b     // Catch: java.lang.Throwable -> L57
            r11.<init>()     // Catch: java.lang.Throwable -> L57
            r0.f165544d = r9     // Catch: java.lang.Throwable -> L57
            r0.f165546f = r8     // Catch: java.lang.Throwable -> L57
            r0.f165549j = r6     // Catch: java.lang.Throwable -> L57
            java.lang.Object r13 = r12.B(r11, r0)     // Catch: java.lang.Throwable -> L57
            if (r13 != r1) goto L86
            goto Lbe
        L86:
            r11 = r8
        L87:
            if (r11 == 0) goto L8a
            r7 = r8
        L8a:
            r0.f165544d = r13
            r0.f165549j = r5
            java.lang.Object r11 = r10.j(r7, r0)
            if (r11 != r1) goto L95
            goto Lbe
        L95:
            return r13
        L96:
            boolean r12 = r11 instanceof qa.c.a     // Catch: java.lang.Throwable -> Lac
            if (r12 == 0) goto Lae
            qa.c$a r11 = (qa.c.a) r11     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r11 = r11.a()     // Catch: java.lang.Throwable -> Lac
            r0.f165544d = r11
            r0.f165549j = r4
            java.lang.Object r12 = r10.j(r7, r0)
            if (r12 != r1) goto Lab
            goto Lbe
        Lab:
            return r11
        Lac:
            r11 = move-exception
            goto Lb2
        Lae:
            throw r11     // Catch: java.lang.Throwable -> Laf
        Laf:
            r12 = move-exception
            r9 = r11
            r11 = r12
        Lb2:
            r0.f165544d = r9     // Catch: android.database.SQLException -> Lbf
            r0.f165545e = r11     // Catch: android.database.SQLException -> Lbf
            r0.f165549j = r3     // Catch: android.database.SQLException -> Lbf
            java.lang.Object r12 = r10.j(r7, r0)     // Catch: android.database.SQLException -> Lbf
            if (r12 != r1) goto Lc6
        Lbe:
            return r1
        Lbf:
            r13 = move-exception
            r12 = r9
        Lc1:
            if (r12 == 0) goto Lc7
            oq.c.a(r12, r13)
        Lc6:
            throw r11
        Lc7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.p.o(oa.g0$a, er.p, tq.e):java.lang.Object");
    }

    @Override // oa.g0
    public <R> Object a(g0.a aVar, er.p<? super f0<R>, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        if (this.isRecycled) {
            ya.a.b(21, "Connection is recycled");
            throw new oq.g();
        }
        qa.a aVar2 = (qa.a) eVar.getContext().m(getConnectionElementKey());
        if (aVar2 != null && aVar2.getConnectionWrapper() == this) {
            return o(aVar, pVar, eVar);
        }
        ya.a.b(21, "Attempted to use connection on a different coroutine");
        throw new oq.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oa.m
    public <R> Object b(String str, er.l<? super ya.d, ? extends R> lVar, tq.e<? super R> eVar) throws Throwable {
        h hVar;
        su.a aVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f165555j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f165555j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f165553g;
        Object objE = uq.b.e();
        int i16 = hVar.f165555j;
        if (i16 == 0) {
            u.b(obj);
            if (this.isRecycled) {
                ya.a.b(21, "Connection is recycled");
                throw new oq.g();
            }
            qa.a aVar2 = (qa.a) hVar.getContext().m(getConnectionElementKey());
            if (aVar2 == null || aVar2.getConnectionWrapper() != this) {
                ya.a.b(21, "Attempted to use connection on a different coroutine");
                throw new oq.g();
            }
            aVar = this.delegate;
            hVar.f165550d = str;
            hVar.f165551e = lVar;
            hVar.f165552f = aVar;
            hVar.f165555j = 1;
            if (aVar.h(null, hVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            su.a aVar3 = (su.a) hVar.f165552f;
            lVar = (er.l) hVar.f165551e;
            String str2 = (String) hVar.f165550d;
            u.b(obj);
            aVar = aVar3;
            str = str2;
        }
        try {
            a aVar4 = new a(this.delegate.e4(str));
            try {
                R rB = lVar.b(aVar4);
                cr.a.a(aVar4, null);
                aVar.r(null);
                return rB;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(aVar4, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            aVar.r(null);
            throw th6;
        }
    }

    @Override // oa.g0
    public Object c(tq.e<? super Boolean> eVar) {
        if (this.isRecycled) {
            ya.a.b(21, "Connection is recycled");
            throw new oq.g();
        }
        qa.a aVar = (qa.a) eVar.getContext().m(getConnectionElementKey());
        if (aVar != null && aVar.getConnectionWrapper() == this) {
            return vq.b.a(!this.transactionStack.isEmpty() || this.delegate.l0());
        }
        ya.a.b(21, "Attempted to use connection on a different coroutine");
        throw new oq.g();
    }

    @Override // qa.q
    /* JADX INFO: renamed from: d */
    public ya.b getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final qa.b getConnectionElementKey() {
        return this.connectionElementKey;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final j getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void n() throws Exception {
        if (this.isRecycled) {
            return;
        }
        this.isRecycled = true;
        if (this.delegate.l0()) {
            ya.a.a(this.delegate, "ROLLBACK TRANSACTION");
        }
    }
}
