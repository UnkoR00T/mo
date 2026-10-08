package qa;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
import oa.f0;
import oa.g0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019BQ\u0012@\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0096@¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cRQ\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00060#j\u0002`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"¨\u0006+"}, d2 = {"Lqa/l;", "Loa/g0;", "Lqa/q;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Ltq/e;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "Lya/b;", "delegate", "<init>", "(Ler/p;Lya/b;)V", "R", "Loa/g0$a;", "type", "Loa/f0;", "block", "g", "(Loa/g0$a;Ler/p;Ltq/e;)Ljava/lang/Object;", "", "sql", "Lya/d;", "b", "(Ljava/lang/String;Ler/l;Ltq/e;)Ljava/lang/Object;", "a", "", "c", "(Ltq/e;)Ljava/lang/Object;", "Ler/p;", "getTransactionWrapper", "()Ler/p;", "Lya/b;", "f", "()Lya/b;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nestedTransactionCount", "d", "Loa/g0$a;", "currentTransactionType", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l implements g0, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.p<er.l<? super tq.e<Object>, ? extends Object>, tq.e<Object>, Object> transactionWrapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ya.b delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AtomicInteger nestedTransactionCount = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private g0.a currentTransactionType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqa/l$a;", "T", "Loa/f0;", "Lqa/q;", "<init>", "(Lqa/l;)V", "R", "", "sql", "Lkotlin/Function1;", "Lya/d;", "block", "b", "(Ljava/lang/String;Ler/l;Ltq/e;)Ljava/lang/Object;", "Lya/b;", "d", "()Lya/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a<T> implements f0<T>, q {
        public a() {
        }

        @Override // oa.m
        public <R> Object b(String str, er.l<? super ya.d, ? extends R> lVar, tq.e<? super R> eVar) {
            return l.this.b(str, lVar, eVar);
        }

        @Override // qa.q
        /* JADX INFO: renamed from: d */
        public ya.b getDelegate() {
            return l.this.getDelegate();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165472a;

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
            f165472a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f165473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f165474e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f165476g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165474e = obj;
            this.f165476g |= PKIFailureInfo.systemUnavail;
            return l.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f165477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165479f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165481h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165479f = obj;
            this.f165481h |= PKIFailureInfo.systemUnavail;
            return l.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.k implements er.l<tq.e<? super Object>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165482e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f165484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<ya.d, R> f165485h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, er.l<? super ya.d, ? extends R> lVar, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f165484g = str;
            this.f165485h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            uq.b.e();
            if (this.f165482e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            ya.d dVarE4 = l.this.f().e4(this.f165484g);
            try {
                Object objB = this.f165485h.b(dVarE4);
                cr.a.a(dVarE4, null);
                return objB;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(dVarE4, th4);
                    throw th5;
                }
            }
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new e(this.f165484g, this.f165485h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<Object> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.k implements er.l<tq.e<? super Object>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165486e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0.a f165488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.p<f0<R>, tq.e<? super R>, Object> f165489h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(g0.a aVar, er.p<? super f0<R>, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f165488g = aVar;
            this.f165489h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            Object objE = uq.b.e();
            int i15 = this.f165486e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            l lVar = l.this;
            g0.a aVar = this.f165488g;
            er.p<f0<R>, tq.e<? super R>, Object> pVar = this.f165489h;
            this.f165486e = 1;
            Object objG = lVar.g(aVar, pVar, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new f(this.f165488g, this.f165489h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<Object> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(er.p<? super er.l<? super tq.e<Object>, ? extends Object>, ? super tq.e<Object>, ? extends Object> pVar, ya.b bVar) {
        this.transactionWrapper = pVar;
        this.delegate = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6 A[Catch: SQLException -> 0x00c9, TryCatch #0 {SQLException -> 0x00c9, blocks: (B:56:0x00be, B:58:0x00c6, B:61:0x00cb), top: B:67:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <R> Object g(g0.a aVar, er.p<? super f0<R>, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) throws Exception {
        c cVar;
        qa.c.a aVar2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f165476g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f165476g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f165474e;
        Object objE = uq.b.e();
        int i16 = cVar.f165476g;
        int i17 = 1;
        try {
            if (i16 == 0) {
                u.b(objB);
                int i18 = b.f165472a[aVar.ordinal()];
                if (i18 == 1) {
                    ya.a.a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i18 == 2) {
                    ya.a.a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i18 != 3) {
                        throw new oq.p();
                    }
                    ya.a.a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (this.nestedTransactionCount.incrementAndGet() > 0) {
                    this.currentTransactionType = aVar;
                }
                a aVar3 = new a();
                cVar.f165473d = 1;
                cVar.f165476g = 1;
                objB = pVar.B(aVar3, cVar);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i17 = cVar.f165473d;
                u.b(objB);
            }
            if (this.nestedTransactionCount.decrementAndGet() == 0) {
                this.currentTransactionType = null;
            }
            if (i17 != 0) {
                ya.a.a(this.delegate, "END TRANSACTION");
                return objB;
            }
            ya.a.a(this.delegate, "ROLLBACK TRANSACTION");
            return objB;
        } catch (Throwable th4) {
            try {
                if (th4 instanceof qa.c.a) {
                    Object objA = th4.a();
                    if (this.nestedTransactionCount.decrementAndGet() == 0) {
                        this.currentTransactionType = null;
                    }
                    ya.a.a(this.delegate, "ROLLBACK TRANSACTION");
                    return objA;
                }
                try {
                    throw th4;
                } catch (Throwable th5) {
                    aVar2 = th4;
                    th = th5;
                    if (this.nestedTransactionCount.decrementAndGet() == 0) {
                        this.currentTransactionType = null;
                    }
                    ya.a.a(this.delegate, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                aVar2 = null;
            }
            try {
                if (this.nestedTransactionCount.decrementAndGet() == 0) {
                    this.currentTransactionType = null;
                }
                ya.a.a(this.delegate, "ROLLBACK TRANSACTION");
                throw th;
            } catch (SQLException e15) {
                if (aVar2 == null) {
                    throw e15;
                }
                oq.c.a(aVar2, e15);
                throw th;
            }
        }
    }

    @Override // oa.g0
    public <R> Object a(g0.a aVar, er.p<? super f0<R>, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        er.p<er.l<? super tq.e<Object>, ? extends Object>, tq.e<Object>, Object> pVar2 = this.transactionWrapper;
        if (pVar2 == null) {
            return g(aVar, pVar, eVar);
        }
        Object objB = pVar2.B(new f(aVar, pVar, null), eVar);
        uq.b.e();
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oa.m
    public <R> Object b(String str, er.l<? super ya.d, ? extends R> lVar, tq.e<? super R> eVar) throws Exception {
        d dVar;
        er.p<er.l<? super tq.e<Object>, ? extends Object>, tq.e<Object>, Object> pVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f165481h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f165481h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f165479f;
        Object objE = uq.b.e();
        int i16 = dVar.f165481h;
        if (i16 == 0) {
            u.b(objC);
            dVar.f165477d = str;
            dVar.f165478e = lVar;
            dVar.f165481h = 1;
            objC = c(dVar);
            if (objC != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
            return objC;
        }
        lVar = (er.l) dVar.f165478e;
        str = (String) dVar.f165477d;
        u.b(objC);
        if (((Boolean) objC).booleanValue() && (pVar = this.transactionWrapper) != null) {
            e eVar2 = new e(str, lVar, null);
            dVar.f165477d = null;
            dVar.f165478e = null;
            dVar.f165481h = 2;
            Object objB = pVar.B(eVar2, dVar);
            return objB == objE ? objE : objB;
        }
        ya.d dVarE4 = this.delegate.e4(str);
        try {
            R rB = lVar.b(dVarE4);
            cr.a.a(dVarE4, null);
            return rB;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    @Override // oa.g0
    public Object c(tq.e<? super Boolean> eVar) {
        return vq.b.a(this.currentTransactionType != null || this.delegate.l0());
    }

    @Override // qa.q
    /* JADX INFO: renamed from: d, reason: from getter */
    public ya.b getDelegate() {
        return this.delegate;
    }

    public final ya.b f() {
        return this.delegate;
    }
}
