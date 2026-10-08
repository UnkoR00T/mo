package u6;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.d2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00025-Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\n\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u0012J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u001f\u0010\u0012J<\u0010#\u001a\u00028\u00002\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010%\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b'\u0010\u0018JI\u0010+\u001a\u00028\u0001\"\u0004\b\u0001\u0010(2\u0006\u0010%\u001a\u00020\u00142\u001c\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020)H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b+\u0010,J4\u0010-\u001a\u00028\u00002\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@¢\u0006\u0004\b-\u0010.J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0014H\u0080@¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010P\u001a\f0MR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010YR \u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R!\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000R8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b_\u0010`*\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lu6/o;", "T", "", "Lu6/q0;", "storage", "", "Lkotlin/Function2;", "Lu6/c0;", "Ltq/e;", "Loq/i0;", "initTasksList", "Lu6/e;", "corruptionHandler", "Lju/p0;", "scope", "<init>", "(Lu6/q0;Ljava/util/List;Lu6/e;Lju/p0;)V", "y", "(Ltq/e;)Ljava/lang/Object;", "t", "", "requireLock", "Lu6/p0;", ip.a.f96138c, "(ZLtq/e;)Ljava/lang/Object;", "Lu6/g0$a;", "update", "x", "(Lu6/g0$a;Ltq/e;)Ljava/lang/Object;", "z", "A", "B", "transform", "Ltq/i;", "callerContext", "F", "(Ler/p;Ltq/i;Ltq/e;)Ljava/lang/Object;", "hasWriteFileLock", "Lu6/f;", "C", "R", "Lkotlin/Function1;", "block", "u", "(ZLer/l;Ltq/e;)Ljava/lang/Object;", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "newData", "updateCache", "", "I", "(Ljava/lang/Object;ZLtq/e;)Ljava/lang/Object;", "Lu6/q0;", "b", "Lu6/e;", "c", "Lju/p0;", "Lmu/g;", "d", "Lmu/g;", "getData", "()Lmu/g;", "data", "Lsu/a;", "e", "Lsu/a;", "collectorMutex", "f", "collectorCounter", "Lju/d2;", "g", "Lju/d2;", "collectorJob", "Lu6/p;", "h", "Lu6/p;", "inMemoryCache", "Lu6/o$b;", "i", "Lu6/o$b;", "readAndInit", "Loq/k;", "Lu6/r0;", "j", "Loq/k;", "storageConnectionDelegate", "Lu6/d0;", "k", "v", "()Lu6/d0;", "coordinator", "Lu6/n0;", "l", "Lu6/n0;", "writeActor", "w", "()Lu6/r0;", "getStorageConnection$datastore_core$delegate", "(Lu6/o;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o<T> implements u6.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q0<T> storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u6.e<T> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int collectorCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d2 collectorJob;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final o<T>.b readAndInit;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final n0<g0.a<T>> writeActor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<T> data = mu.i.I(new c(this, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final su.a collectorMutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u6.p<T> inMemoryCache = new u6.p<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k<r0<T>> storageConnectionDelegate = oq.l.a(new er.a() { // from class: u6.k
        @Override // er.a
        public final Object a() {
            return o.E(this.f195556a);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k coordinator = oq.l.a(new er.a() { // from class: u6.l
        @Override // er.a
        public final Object a() {
            return o.s(this.f195563a);
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lu6/o$b;", "Lu6/k0;", "", "Lkotlin/Function2;", "Lu6/c0;", "Ltq/e;", "Loq/i0;", "", "initTasksList", "<init>", "(Lu6/o;Ljava/util/List;)V", "b", "(Ltq/e;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b extends k0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private List<? extends er.p<? super c0<T>, ? super tq.e<? super oq.i0>, ? extends Object>> initTasks;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f195590d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ o<T>.b f195591e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f195592f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o<T>.b bVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f195591e = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f195590d = obj;
                this.f195592f |= PKIFailureInfo.systemUnavail;
                return this.f195591e.b(this);
            }
        }

        /* JADX INFO: renamed from: u6.o$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu6/f;", "<anonymous>", "()Lu6/f;"}, k = 3, mv = {2, 0, 0})
        static final class C5092b extends vq.k implements er.l<tq.e<? super u6.f<T>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f195593e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f195594f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f195595g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f195596h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f195597j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f195598k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f195599l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ o<T> f195600m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ o<T>.b f195601n;

            /* JADX INFO: renamed from: u6.o$b$b$a */
            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"u6/o$b$b$a", "Lu6/c0;", "Lkotlin/Function2;", "Ltq/e;", "", "transform", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class a implements c0<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ su.a f195602a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ fr.l0 f195603b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ fr.p0<T> f195604c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ o<T> f195605d;

                /* JADX INFO: renamed from: u6.o$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                static final class C5093a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f195606d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f195607e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f195608f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    Object f195609g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f195610h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    /* synthetic */ Object f195611j;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    int f195613l;

                    C5093a(tq.e<? super C5093a> eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f195611j = obj;
                        this.f195613l |= PKIFailureInfo.systemUnavail;
                        return a.this.a(null, this);
                    }
                }

                a(su.a aVar, fr.l0 l0Var, fr.p0<T> p0Var, o<T> oVar) {
                    this.f195602a = aVar;
                    this.f195603b = l0Var;
                    this.f195604c = p0Var;
                    this.f195605d = oVar;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // u6.c0
                public Object a(er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
                    C5093a c5093a;
                    su.a aVar;
                    o oVar;
                    fr.l0 l0Var;
                    fr.p0<T> p0Var;
                    su.a aVar2;
                    su.a aVar3;
                    o oVar2;
                    T t15;
                    fr.p0<T> p0Var2;
                    if (eVar instanceof C5093a) {
                        c5093a = (C5093a) eVar;
                        int i15 = c5093a.f195613l;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c5093a.f195613l = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c5093a = new C5093a(eVar);
                        }
                    } else {
                        c5093a = new C5093a(eVar);
                    }
                    Object obj = c5093a.f195611j;
                    Object objE = uq.b.e();
                    int i16 = c5093a.f195613l;
                    try {
                        if (i16 == 0) {
                            oq.u.b(obj);
                            aVar = this.f195602a;
                            fr.l0 l0Var2 = this.f195603b;
                            fr.p0<T> p0Var3 = this.f195604c;
                            oVar = this.f195605d;
                            c5093a.f195606d = pVar;
                            c5093a.f195607e = aVar;
                            c5093a.f195608f = l0Var2;
                            c5093a.f195609g = p0Var3;
                            c5093a.f195610h = oVar;
                            c5093a.f195613l = 1;
                            if (aVar.h(null, c5093a) != objE) {
                                l0Var = l0Var2;
                                p0Var = p0Var3;
                            }
                            return objE;
                        }
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t15 = (T) c5093a.f195608f;
                                p0Var2 = (fr.p0) c5093a.f195607e;
                                aVar2 = (su.a) c5093a.f195606d;
                                try {
                                    oq.u.b(obj);
                                    p0Var2.f66410a = t15;
                                    p0Var = p0Var2;
                                    T t16 = p0Var.f66410a;
                                    aVar2.r(null);
                                    return t16;
                                } catch (Throwable th4) {
                                    th = th4;
                                    aVar2.r(null);
                                    throw th;
                                }
                            }
                            o oVar3 = (o) c5093a.f195608f;
                            p0Var = (fr.p0) c5093a.f195607e;
                            aVar3 = (su.a) c5093a.f195606d;
                            try {
                                oq.u.b(obj);
                                oVar2 = oVar3;
                                if (!fr.t.c(obj, p0Var.f66410a)) {
                                    c5093a.f195606d = aVar3;
                                    c5093a.f195607e = p0Var;
                                    c5093a.f195608f = obj;
                                    c5093a.f195613l = 3;
                                    if (oVar2.I(obj, false, c5093a) != objE) {
                                        t15 = (T) obj;
                                        p0Var2 = p0Var;
                                        aVar2 = aVar3;
                                        p0Var2.f66410a = t15;
                                        p0Var = p0Var2;
                                    }
                                    return objE;
                                }
                                aVar2 = aVar3;
                                T t17 = p0Var.f66410a;
                                aVar2.r(null);
                                return t17;
                            } catch (Throwable th5) {
                                th = th5;
                                aVar2 = aVar3;
                                aVar2.r(null);
                                throw th;
                            }
                        }
                        o oVar4 = (o) c5093a.f195610h;
                        p0Var = (fr.p0) c5093a.f195609g;
                        l0Var = (fr.l0) c5093a.f195608f;
                        su.a aVar4 = (su.a) c5093a.f195607e;
                        er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar2 = (er.p) c5093a.f195606d;
                        oq.u.b(obj);
                        oVar = oVar4;
                        pVar = pVar2;
                        aVar = aVar4;
                        if (l0Var.f66404a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        T t18 = p0Var.f66410a;
                        c5093a.f195606d = aVar;
                        c5093a.f195607e = p0Var;
                        c5093a.f195608f = oVar;
                        c5093a.f195609g = null;
                        c5093a.f195610h = null;
                        c5093a.f195613l = 2;
                        Object objB = pVar.B(t18, c5093a);
                        if (objB != objE) {
                            aVar3 = aVar;
                            obj = objB;
                            oVar2 = oVar;
                            if (!fr.t.c(obj, p0Var.f66410a)) {
                                c5093a.f195606d = aVar3;
                                c5093a.f195607e = p0Var;
                                c5093a.f195608f = obj;
                                c5093a.f195613l = 3;
                                if (oVar2.I(obj, false, c5093a) != objE) {
                                    t15 = (T) obj;
                                    p0Var2 = p0Var;
                                    aVar2 = aVar3;
                                    p0Var2.f66410a = t15;
                                    p0Var = p0Var2;
                                }
                            } else {
                                aVar2 = aVar3;
                            }
                            T t19 = p0Var.f66410a;
                            aVar2.r(null);
                            return t19;
                        }
                        return objE;
                    } catch (Throwable th6) {
                        th = th6;
                        aVar2 = aVar;
                        aVar2.r(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5092b(o<T> oVar, o<T>.b bVar, tq.e<? super C5092b> eVar) {
                super(1, eVar);
                this.f195600m = oVar;
                this.f195601n = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                su.a aVarB;
                fr.l0 l0Var;
                fr.p0 p0Var;
                fr.p0 p0Var2;
                fr.l0 l0Var2;
                su.a aVar;
                Iterator<T> it;
                su.a aVar2;
                fr.l0 l0Var3;
                fr.p0 p0Var3;
                a aVar3;
                fr.p0 p0Var4;
                er.p pVar;
                Object obj2;
                int iHashCode;
                int i15;
                Object objE = uq.b.e();
                int i16 = this.f195599l;
                if (i16 == 0) {
                    oq.u.b(obj);
                    aVarB = su.g.b(false, 1, null);
                    l0Var = new fr.l0();
                    p0Var = new fr.p0();
                    o<T> oVar = this.f195600m;
                    this.f195593e = aVarB;
                    this.f195594f = l0Var;
                    this.f195595g = p0Var;
                    this.f195596h = p0Var;
                    this.f195599l = 1;
                    obj = oVar.C(true, this);
                    if (obj != objE) {
                        p0Var2 = p0Var;
                    }
                    return objE;
                }
                if (i16 == 1) {
                    p0Var = (fr.p0) this.f195596h;
                    p0Var2 = (fr.p0) this.f195595g;
                    l0Var = (fr.l0) this.f195594f;
                    aVarB = (su.a) this.f195593e;
                    oq.u.b(obj);
                } else {
                    if (i16 == 2) {
                        it = (Iterator) this.f195597j;
                        aVar3 = (a) this.f195596h;
                        p0Var3 = (fr.p0) this.f195595g;
                        l0Var3 = (fr.l0) this.f195594f;
                        aVar2 = (su.a) this.f195593e;
                        oq.u.b(obj);
                        while (it.hasNext()) {
                            pVar = (er.p) it.next();
                            this.f195593e = aVar2;
                            this.f195594f = l0Var3;
                            this.f195595g = p0Var3;
                            this.f195596h = aVar3;
                            this.f195597j = it;
                            this.f195599l = 2;
                            if (pVar.B(aVar3, this) == objE) {
                                return objE;
                            }
                        }
                        p0Var2 = p0Var3;
                        l0Var2 = l0Var3;
                        aVar = aVar2;
                        ((b) this.f195601n).initTasks = null;
                        this.f195593e = l0Var2;
                        this.f195594f = p0Var2;
                        this.f195595g = aVar;
                        this.f195596h = null;
                        this.f195597j = null;
                        this.f195599l = 3;
                        if (aVar.h(null, this) != objE) {
                            p0Var4 = p0Var2;
                            l0Var2.f66404a = true;
                            oq.i0 i0Var = oq.i0.f148189a;
                            aVar.r(null);
                            obj2 = p0Var4.f66410a;
                            if (obj2 != null) {
                            }
                            d0 d0VarV = this.f195600m.v();
                            this.f195593e = obj2;
                            this.f195594f = null;
                            this.f195595g = null;
                            this.f195598k = iHashCode;
                            this.f195599l = 4;
                            obj = d0VarV.a(this);
                            if (obj != objE) {
                                i15 = iHashCode;
                            }
                        }
                        return objE;
                    }
                    if (i16 == 3) {
                        aVar = (su.a) this.f195595g;
                        p0Var4 = (fr.p0) this.f195594f;
                        l0Var2 = (fr.l0) this.f195593e;
                        oq.u.b(obj);
                        try {
                            l0Var2.f66404a = true;
                            oq.i0 i0Var2 = oq.i0.f148189a;
                            aVar.r(null);
                            obj2 = p0Var4.f66410a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            d0 d0VarV2 = this.f195600m.v();
                            this.f195593e = obj2;
                            this.f195594f = null;
                            this.f195595g = null;
                            this.f195598k = iHashCode;
                            this.f195599l = 4;
                            obj = d0VarV2.a(this);
                            if (obj != objE) {
                                i15 = iHashCode;
                            }
                            return objE;
                        } catch (Throwable th4) {
                            aVar.r(null);
                            throw th4;
                        }
                    }
                    if (i16 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i15 = this.f195598k;
                    obj2 = this.f195593e;
                    oq.u.b(obj);
                }
                return new u6.f(obj2, i15, ((Number) obj).intValue());
                p0Var.f66410a = (T) ((u6.f) obj).c();
                a aVar4 = new a(aVarB, l0Var, p0Var2, this.f195600m);
                List list = ((b) this.f195601n).initTasks;
                if (list != null) {
                    it = list.iterator();
                    aVar2 = aVarB;
                    l0Var3 = l0Var;
                    p0Var3 = p0Var2;
                    aVar3 = aVar4;
                    while (it.hasNext()) {
                        pVar = (er.p) it.next();
                        this.f195593e = aVar2;
                        this.f195594f = l0Var3;
                        this.f195595g = p0Var3;
                        this.f195596h = aVar3;
                        this.f195597j = it;
                        this.f195599l = 2;
                        if (pVar.B(aVar3, this) == objE) {
                            return objE;
                        }
                    }
                    p0Var2 = p0Var3;
                    l0Var2 = l0Var3;
                    aVar = aVar2;
                } else {
                    l0Var2 = l0Var;
                    aVar = aVarB;
                }
                ((b) this.f195601n).initTasks = null;
                this.f195593e = l0Var2;
                this.f195594f = p0Var2;
                this.f195595g = aVar;
                this.f195596h = null;
                this.f195597j = null;
                this.f195599l = 3;
                if (aVar.h(null, this) != objE) {
                    p0Var4 = p0Var2;
                    l0Var2.f66404a = true;
                    oq.i0 i0Var3 = oq.i0.f148189a;
                    aVar.r(null);
                    obj2 = p0Var4.f66410a;
                    if (obj2 != null) {
                    }
                    d0 d0VarV3 = this.f195600m.v();
                    this.f195593e = obj2;
                    this.f195594f = null;
                    this.f195595g = null;
                    this.f195598k = iHashCode;
                    this.f195599l = 4;
                    obj = d0VarV3.a(this);
                    if (obj != objE) {
                        i15 = iHashCode;
                        return new u6.f(obj2, i15, ((Number) obj).intValue());
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new C5092b(this.f195600m, this.f195601n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super u6.f<T>> eVar) {
                return ((C5092b) M(eVar)).J(oq.i0.f148189a);
            }
        }

        public b(List<? extends er.p<? super c0<T>, ? super tq.e<? super oq.i0>, ? extends Object>> list) {
            this.initTasks = pq.v.f1(list);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        
            if (r7 == r1) goto L27;
         */
        @Override // u6.k0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object b(tq.e<? super oq.i0> r7) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r7 instanceof u6.o.b.a
                if (r0 == 0) goto L13
                r0 = r7
                u6.o$b$a r0 = (u6.o.b.a) r0
                int r1 = r0.f195592f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f195592f = r1
                goto L18
            L13:
                u6.o$b$a r0 = new u6.o$b$a
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.f195590d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f195592f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r7)
                goto L5d
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L34:
                oq.u.b(r7)
                goto L6c
            L38:
                oq.u.b(r7)
                java.util.List<? extends er.p<? super u6.c0<T>, ? super tq.e<? super oq.i0>, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L60
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L46
                goto L60
            L46:
                u6.o<T> r7 = u6.o.this
                u6.d0 r7 = u6.o.g(r7)
                u6.o$b$b r2 = new u6.o$b$b
                u6.o<T> r4 = u6.o.this
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f195592f = r3
                java.lang.Object r7 = r7.e(r2, r0)
                if (r7 != r1) goto L5d
                goto L6b
            L5d:
                u6.f r7 = (u6.f) r7
                goto L6e
            L60:
                u6.o<T> r7 = u6.o.this
                r0.f195592f = r4
                r2 = 0
                java.lang.Object r7 = u6.o.p(r7, r2, r0)
                if (r7 != r1) goto L6c
            L6b:
                return r1
            L6c:
                u6.f r7 = (u6.f) r7
            L6e:
                u6.o<T> r0 = u6.o.this
                u6.p r0 = u6.o.h(r0)
                r0.c(r7)
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.o.b.b(tq.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmu/h;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends vq.k implements er.p<mu.h<? super T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f195616g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o<T> f195617h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lmu/h;", "Lu6/p0;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends vq.k implements er.p<mu.h<? super p0<T>>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f195618e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o<T> f195619f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o<T> oVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f195619f = oVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f195618e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    o<T> oVar = this.f195619f;
                    this.f195618e = 1;
                    if (oVar.y(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(mu.h<? super p0<T>> hVar, tq.e<? super oq.i0> eVar) {
                return ((a) v(hVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f195619f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/p0;", "it", "", "<anonymous>", "(Lu6/p0;)Z"}, k = 3, mv = {2, 0, 0})
        static final class b extends vq.k implements er.p<p0<T>, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f195620e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f195621f;

            b(tq.e<? super b> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f195620e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return vq.b.a(!(((p0) this.f195621f) instanceof b0));
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0<T> p0Var, tq.e<? super Boolean> eVar) {
                return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                b bVar = new b(eVar);
                bVar.f195621f = obj;
                return bVar;
            }
        }

        /* JADX INFO: renamed from: u6.o$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/p0;", "it", "", "<anonymous>", "(Lu6/p0;)Z"}, k = 3, mv = {2, 0, 0})
        static final class C5094c extends vq.k implements er.p<p0<T>, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f195622e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f195623f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p0<T> f195624g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5094c(p0<T> p0Var, tq.e<? super C5094c> eVar) {
                super(2, eVar);
                this.f195624g = p0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f195622e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                p0 p0Var = (p0) this.f195623f;
                return vq.b.a((p0Var instanceof u6.f) && ((u6.f) p0Var).getVersion() <= ((u6.f) this.f195624g).getVersion());
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0<T> p0Var, tq.e<? super Boolean> eVar) {
                return ((C5094c) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C5094c c5094c = new C5094c(this.f195624g, eVar);
                c5094c.f195623f = obj;
                return c5094c;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lmu/h;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        static final class d extends vq.k implements er.q<mu.h<? super T>, Throwable, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f195625e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o<T> f195626f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(o<T> oVar, tq.e<? super d> eVar) {
                super(3, eVar);
                this.f195626f = oVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f195625e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    o<T> oVar = this.f195626f;
                    this.f195625e = 1;
                    if (oVar.t(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.q
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object w(mu.h<? super T> hVar, Throwable th4, tq.e<? super oq.i0> eVar) {
                return new d(this.f195626f, eVar).J(oq.i0.f148189a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e implements mu.g<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f195627a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ mu.h f195628a;

                /* JADX INFO: renamed from: u6.o$c$e$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class C5095a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f195629d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f195630e;

                    public C5095a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f195629d = obj;
                        this.f195630e |= PKIFailureInfo.systemUnavail;
                        return a.this.F(null, this);
                    }
                }

                public a(mu.h hVar) {
                    this.f195628a = hVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // mu.h
                public final Object F(Object obj, tq.e eVar) throws Throwable {
                    C5095a c5095a;
                    if (eVar instanceof C5095a) {
                        c5095a = (C5095a) eVar;
                        int i15 = c5095a.f195630e;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c5095a.f195630e = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c5095a = new C5095a(eVar);
                        }
                    } else {
                        c5095a = new C5095a(eVar);
                    }
                    Object obj2 = c5095a.f195629d;
                    Object objE = uq.b.e();
                    int i16 = c5095a.f195630e;
                    if (i16 == 0) {
                        oq.u.b(obj2);
                        mu.h hVar = this.f195628a;
                        p0 p0Var = (p0) obj;
                        if (p0Var instanceof i0) {
                            throw ((i0) p0Var).getReadException();
                        }
                        if (!(p0Var instanceof u6.f)) {
                            if ((p0Var instanceof b0) || (p0Var instanceof t0) || (p0Var instanceof h0)) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new oq.p();
                        }
                        Object objC = ((u6.f) p0Var).c();
                        c5095a.f195630e = 1;
                        if (hVar.F(objC, c5095a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj2);
                    }
                    return oq.i0.f148189a;
                }
            }

            public e(mu.g gVar) {
                this.f195627a = gVar;
            }

            @Override // mu.g
            public Object a(mu.h hVar, tq.e eVar) {
                Object objA = this.f195627a.a(new a(hVar), eVar);
                return objA == uq.b.e() ? objA : oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o<T> oVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f195617h = oVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        
            if (mu.i.u(r3, r9, r8) == r0) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mu.h] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [mu.h] */
        /* JADX WARN: Type inference failed for: r3v6 */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.o.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super T> hVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f195617h, eVar);
            cVar.f195616g = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195634f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195635g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o<T> oVar, tq.e<? super d> eVar) {
            super(eVar);
            this.f195634f = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195633e = obj;
            this.f195635g |= PKIFailureInfo.systemUnavail;
            return this.f195634f.t(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e<R> extends vq.k implements er.l<tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super R>, Object> f195637f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f195637f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195636e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            er.l<tq.e<? super R>, Object> lVar = this.f195637f;
            this.f195636e = 1;
            Object objB = lVar.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new e(this.f195637f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super R> eVar) {
            return ((e) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195641g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o<T> oVar, tq.e<? super f> eVar) {
            super(eVar);
            this.f195640f = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195639e = obj;
            this.f195641g |= PKIFailureInfo.systemUnavail;
            return this.f195640f.x(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    static final class g extends vq.k implements er.p<ju.p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0.a<T> f195644g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(o<T> oVar, g0.a<T> aVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f195643f = oVar;
            this.f195644g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195642e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0<T> p0VarA = ((o) this.f195643f).inMemoryCache.a();
                if (p0VarA instanceof u6.f) {
                    o<T> oVar = this.f195643f;
                    er.p<T, tq.e<? super T>, Object> pVarD = this.f195644g.d();
                    tq.i callerContext = this.f195644g.getCallerContext();
                    this.f195642e = 1;
                    Object objF = oVar.F(pVarD, callerContext, this);
                    if (objF != objE) {
                        return objF;
                    }
                } else {
                    if (!(p0VarA instanceof i0) && !(p0VarA instanceof t0)) {
                        if (p0VarA instanceof b0) {
                            throw ((b0) p0VarA).getFinalException();
                        }
                        if (p0VarA instanceof h0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new oq.p();
                    }
                    if (p0VarA != this.f195644g.c()) {
                        throw ((i0) p0VarA).getReadException();
                    }
                    o<T> oVar2 = this.f195643f;
                    this.f195642e = 2;
                    if (oVar2.z(this) != objE) {
                    }
                }
            }
            if (i15 == 1) {
                oq.u.b(obj);
                return obj;
            }
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            o<T> oVar3 = this.f195643f;
            er.p<T, tq.e<? super T>, Object> pVarD2 = this.f195644g.d();
            tq.i callerContext2 = this.f195644g.getCallerContext();
            this.f195642e = 3;
            Object objF2 = oVar3.F(pVarD2, callerContext2, this);
            return objF2 == objE ? objE : objF2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super T> eVar) {
            return ((g) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new g(this.f195643f, this.f195644g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195648g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o<T> oVar, tq.e<? super h> eVar) {
            super(eVar);
            this.f195647f = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195646e = obj;
            this.f195648g |= PKIFailureInfo.systemUnavail;
            return this.f195647f.y(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class i extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195650f;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o<T> f195651a;

            a(o<T> oVar) {
                this.f195651a = oVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(oq.i0 i0Var, tq.e<? super oq.i0> eVar) {
                Object objA;
                return ((((o) this.f195651a).inMemoryCache.a() instanceof b0) || (objA = this.f195651a.A(true, eVar)) != uq.b.e()) ? oq.i0.f148189a : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(o<T> oVar, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f195650f = oVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.a(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f195649e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L30
            L1e:
                oq.u.b(r5)
                u6.o<T> r5 = r4.f195650f
                u6.o$b r5 = u6.o.i(r5)
                r4.f195649e = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                u6.o<T> r5 = r4.f195650f
                u6.d0 r5 = u6.o.g(r5)
                mu.g r5 = r5.d()
                mu.g r5 = mu.i.m(r5)
                u6.o$i$a r1 = new u6.o$i$a
                u6.o<T> r3 = r4.f195650f
                r1.<init>(r3)
                r4.f195649e = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.o.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((i) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f195650f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f195652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195655g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(o<T> oVar, tq.e<? super j> eVar) {
            super(eVar);
            this.f195654f = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195653e = obj;
            this.f195655g |= PKIFailureInfo.systemUnavail;
            return this.f195654f.z(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f195656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f195658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o<T> f195659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195660h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(o<T> oVar, tq.e<? super k> eVar) {
            super(eVar);
            this.f195659g = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195658f = obj;
            this.f195660h |= PKIFailureInfo.systemUnavail;
            return this.f195659g.A(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Loq/r;", "Lu6/p0;", "", "<anonymous>", "()Loq/r;"}, k = 3, mv = {2, 0, 0})
    static final class l extends vq.k implements er.l<tq.e<? super oq.r<? extends p0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o<T> f195663g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(o<T> oVar, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f195663g = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Throwable th4;
            p0 i0Var;
            Object objE = uq.b.e();
            int i15 = this.f195662f;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    o<T> oVar = this.f195663g;
                    this.f195662f = 1;
                    obj = oVar.C(true, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th4 = (Throwable) this.f195661e;
                        oq.u.b(obj);
                        i0Var = new i0(th4, ((Number) obj).intValue());
                        return oq.y.a(i0Var, vq.b.a(true));
                    }
                    oq.u.b(obj);
                }
                i0Var = (p0) obj;
            } catch (Throwable th5) {
                d0 d0VarV = this.f195663g.v();
                this.f195661e = th5;
                this.f195662f = 2;
                Object objA = d0VarV.a(this);
                if (objA != objE) {
                    th4 = th5;
                    obj = objA;
                }
                return objE;
            }
            return oq.y.a(i0Var, vq.b.a(true));
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new l(this.f195663g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.r<? extends p0<T>, Boolean>> eVar) {
            return ((l) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Loq/r;", "Lu6/p0;", "<anonymous>", "(Z)Loq/r;"}, k = 3, mv = {2, 0, 0})
    static final class m extends vq.k implements er.p<Boolean, tq.e<? super oq.r<? extends p0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ boolean f195666g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o<T> f195667h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f195668j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(o<T> oVar, int i15, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f195667h = oVar;
            this.f195668j = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Boolean bool, Object obj) {
            return M(bool.booleanValue(), (tq.e) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Throwable th4;
            int iIntValue;
            ?? r15;
            ?? r16;
            p0 p0Var;
            ?? r17;
            Object objE = uq.b.e();
            ?? r18 = this.f195665f;
            try {
                if (r18 == 0) {
                    oq.u.b(obj);
                    boolean z15 = this.f195666g;
                    o<T> oVar = this.f195667h;
                    this.f195666g = z15;
                    this.f195665f = 1;
                    obj = oVar.C(z15, this);
                    r18 = z15;
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (r18 != 1) {
                        if (r18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z16 = this.f195666g;
                        th4 = (Throwable) this.f195664e;
                        oq.u.b(obj);
                        r16 = z16;
                        iIntValue = ((Number) obj).intValue();
                        r15 = r16;
                        i0 i0Var = new i0(th4, iIntValue);
                        r17 = r15;
                        p0Var = i0Var;
                        return oq.y.a(p0Var, vq.b.a(r17));
                    }
                    boolean z17 = this.f195666g;
                    oq.u.b(obj);
                    r18 = z17;
                }
                p0Var = (p0) obj;
                r17 = r18;
            } catch (Throwable th5) {
                if (r18 != 0) {
                    d0 d0VarV = this.f195667h.v();
                    this.f195664e = th5;
                    this.f195666g = r18;
                    this.f195665f = 2;
                    Object objA = d0VarV.a(this);
                    if (objA != objE) {
                        r16 = r18;
                        th4 = th5;
                        obj = objA;
                    }
                    return objE;
                }
                ?? r19 = r18;
                th4 = th5;
                iIntValue = this.f195668j;
                r15 = r19 == true ? 1 : 0;
            }
            return oq.y.a(p0Var, vq.b.a(r17));
        }

        public final Object M(boolean z15, tq.e<? super oq.r<? extends p0<T>, Boolean>> eVar) {
            return ((m) v(Boolean.valueOf(z15), eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            m mVar = new m(this.f195667h, this.f195668j, eVar);
            mVar.f195666g = ((Boolean) obj).booleanValue();
            return mVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f195669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195672g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195673h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f195674j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ o<T> f195675k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f195676l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(o<T> oVar, tq.e<? super n> eVar) {
            super(eVar);
            this.f195675k = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195674j = obj;
            this.f195676l |= PKIFailureInfo.systemUnavail;
            return this.f195675k.C(false, this);
        }
    }

    /* JADX INFO: renamed from: u6.o$o, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lu6/f;", "<anonymous>", "(Z)Lu6/f;"}, k = 3, mv = {2, 0, 0})
    static final class C5096o extends vq.k implements er.p<Boolean, tq.e<? super u6.f<T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ boolean f195679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o<T> f195680h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f195681j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5096o(o<T> oVar, int i15, tq.e<? super C5096o> eVar) {
            super(2, eVar);
            this.f195680h = oVar;
            this.f195681j = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Boolean bool, Object obj) {
            return M(bool.booleanValue(), (tq.e) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objE = uq.b.e();
            int i15 = this.f195678f;
            if (i15 == 0) {
                oq.u.b(obj);
                z15 = this.f195679g;
                o<T> oVar = this.f195680h;
                this.f195679g = z15;
                this.f195678f = 1;
                obj = oVar.B(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                z15 = this.f195679g;
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f195677e;
                oq.u.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new u6.f(obj2, iHashCode, iIntValue);
            if (z15) {
                d0 d0VarV = this.f195680h.v();
                this.f195677e = obj;
                this.f195678f = 2;
                Object objA = d0VarV.a(this);
                if (objA != objE) {
                    obj2 = obj;
                    obj = objA;
                    iIntValue = ((Number) obj).intValue();
                }
                return objE;
            }
            obj2 = obj;
            iIntValue = this.f195681j;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new u6.f(obj2, iHashCode, iIntValue);
        }

        public final Object M(boolean z15, tq.e<? super u6.f<T>> eVar) {
            return ((C5096o) v(Boolean.valueOf(z15), eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            C5096o c5096o = new C5096o(this.f195680h, this.f195681j, eVar);
            c5096o.f195679g = ((Boolean) obj).booleanValue();
            return c5096o;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    static final class p extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.p0<T> f195684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o<T> f195685h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ fr.n0 f195686j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(fr.p0<T> p0Var, o<T> oVar, fr.n0 n0Var, tq.e<? super p> eVar) {
            super(1, eVar);
            this.f195684g = p0Var;
            this.f195685h = oVar;
            this.f195686j = n0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr.n0 n0Var;
            fr.p0<T> p0Var;
            fr.n0 n0Var2;
            Object objE = uq.b.e();
            int i15 = this.f195683f;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    p0Var = this.f195684g;
                    o<T> oVar = this.f195685h;
                    this.f195682e = p0Var;
                    this.f195683f = 1;
                    obj = (T) oVar.B(this);
                    if (obj == objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    p0Var = (fr.p0) this.f195682e;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n0Var = (fr.n0) this.f195682e;
                        oq.u.b(obj);
                        n0Var.f66407a = ((Number) obj).intValue();
                        return oq.i0.f148189a;
                    }
                    n0Var2 = (fr.n0) this.f195682e;
                    oq.u.b(obj);
                }
                n0Var2.f66407a = ((Number) obj).intValue();
                return oq.i0.f148189a;
                p0Var.f66410a = (T) obj;
                n0Var2 = this.f195686j;
                d0 d0VarV = this.f195685h.v();
                this.f195682e = n0Var2;
                this.f195683f = 2;
                obj = (T) d0VarV.a(this);
                if (obj == objE) {
                    return objE;
                }
                n0Var2.f66407a = ((Number) obj).intValue();
            } catch (u6.d unused) {
                fr.n0 n0Var3 = this.f195686j;
                o<T> oVar2 = this.f195685h;
                T t15 = this.f195684g.f66410a;
                this.f195682e = n0Var3;
                this.f195683f = 3;
                Object objI = oVar2.I(t15, true, this);
                if (objI != objE) {
                    n0Var = n0Var3;
                    obj = (T) objI;
                }
                return objE;
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new p(this.f195684g, this.f195685h, this.f195686j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((p) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lju/p0;", "Lu6/p0;", "<anonymous>", "(Lju/p0;)Lu6/p0;"}, k = 3, mv = {2, 0, 0})
    static final class q extends vq.k implements er.p<ju.p0, tq.e<? super p0<T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f195689g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(o<T> oVar, boolean z15, tq.e<? super q> eVar) {
            super(2, eVar);
            this.f195688f = oVar;
            this.f195689g = z15;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f195687e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                oq.u.b(r5)
                u6.o<T> r5 = r4.f195688f
                u6.p r5 = u6.o.h(r5)
                u6.p0 r5 = r5.a()
                boolean r5 = r5 instanceof u6.b0
                if (r5 == 0) goto L3c
                u6.o<T> r5 = r4.f195688f
                u6.p r5 = u6.o.h(r5)
                u6.p0 r5 = r5.a()
                return r5
            L3c:
                u6.o<T> r5 = r4.f195688f     // Catch: java.lang.Throwable -> L1e
                r4.f195687e = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = u6.o.m(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                u6.o<T> r5 = r4.f195688f
                boolean r1 = r4.f195689g
                r4.f195687e = r2
                java.lang.Object r5 = u6.o.n(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                u6.p0 r5 = (u6.p0) r5
                return r5
            L57:
                u6.i0 r0 = new u6.i0
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.o.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super p0<T>> eVar) {
            return ((q) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new q(this.f195688f, this.f195689g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class r extends vq.k implements er.l<tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o<T> f195692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ tq.i f195693h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.p<T, tq.e<? super T>, Object> f195694j;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super T>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f195695e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ er.p<T, tq.e<? super T>, Object> f195696f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u6.f<T> f195697g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar, u6.f<T> fVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f195696f = pVar;
                this.f195697g = fVar;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to u6.o$r$a for r3v1 'this'  java.lang.Object
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
                    int r1 = r3.f195695e
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
                    er.p<T, tq.e<? super T>, java.lang.Object> r4 = r3.f195696f
                    u6.f<T> r1 = r3.f195697g
                    java.lang.Object r1 = r1.c()
                    r3.f195695e = r2
                    java.lang.Object r4 = r4.B(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.o.r.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super T> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f195696f, this.f195697g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(o<T> oVar, tq.i iVar, er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super r> eVar) {
            super(1, eVar);
            this.f195692g = oVar;
            this.f195693h = iVar;
            this.f195694j = pVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to u6.o$r for r8v1 'this'  tq.e
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r8.f195691f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f195690e
                oq.u.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f195690e
                u6.f r1 = (u6.f) r1
                oq.u.b(r9)
                goto L51
            L27:
                oq.u.b(r9)
                goto L39
            L2b:
                oq.u.b(r9)
                u6.o<T> r9 = r8.f195692g
                r8.f195691f = r4
                java.lang.Object r9 = u6.o.p(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                u6.f r1 = (u6.f) r1
                tq.i r9 = r8.f195693h
                u6.o$r$a r5 = new u6.o$r$a
                er.p<T, tq.e<? super T>, java.lang.Object> r6 = r8.f195694j
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f195690e = r1
                r8.f195691f = r3
                java.lang.Object r9 = ju.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = fr.t.c(r1, r9)
                if (r1 != 0) goto L6b
                u6.o<T> r1 = r8.f195692g
                r8.f195690e = r9
                r8.f195691f = r2
                java.lang.Object r1 = r1.I(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.o.r.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new r(this.f195692g, this.f195693h, this.f195694j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super T> eVar) {
            return ((r) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    static final class s extends vq.k implements er.p<ju.p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f195699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o<T> f195700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.p<T, tq.e<? super T>, Object> f195701h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(o<T> oVar, er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super s> eVar) {
            super(2, eVar);
            this.f195700g = oVar;
            this.f195701h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195698e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.p0 p0Var = (ju.p0) this.f195699f;
            ju.x xVarC = ju.z.c(null, 1, null);
            p0<T> p0VarA = ((o) this.f195700g).inMemoryCache.a();
            if (p0VarA instanceof u6.f) {
                p0VarA = new h0(((u6.f) p0VarA).getVersion());
            }
            ((o) this.f195700g).writeActor.g(new g0.a(this.f195701h, xVarC, p0VarA, p0Var.getCoroutineContext()));
            this.f195698e = 1;
            Object objI = xVarC.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super T> eVar) {
            return ((s) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            s sVar = new s(this.f195700g, this.f195701h, eVar);
            sVar.f195699f = obj;
            return sVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/g0$a;", "msg", "Loq/i0;", "<anonymous>", "(Lu6/g0$a;)V"}, k = 3, mv = {2, 0, 0})
    static final class t extends vq.k implements er.p<g0.a<T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f195703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o<T> f195704g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(o<T> oVar, tq.e<? super t> eVar) {
            super(2, eVar);
            this.f195704g = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195702e;
            if (i15 == 0) {
                oq.u.b(obj);
                g0.a aVar = (g0.a) this.f195703f;
                o<T> oVar = this.f195704g;
                this.f195702e = 1;
                if (oVar.x(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(g0.a<T> aVar, tq.e<? super oq.i0> eVar) {
            return ((t) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            t tVar = new t(this.f195704g, eVar);
            tVar.f195703f = obj;
            return tVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o<T> f195707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195708g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(o<T> oVar, tq.e<? super u> eVar) {
            super(eVar);
            this.f195707f = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195706e = obj;
            this.f195708g |= PKIFailureInfo.systemUnavail;
            return this.f195707f.I(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lu6/w0;", "Loq/i0;", "<anonymous>", "(Lu6/w0;)V"}, k = 3, mv = {2, 0, 0})
    static final class v extends vq.k implements er.p<w0<T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f195711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ fr.n0 f195712h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ o<T> f195713j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ T f195714k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f195715l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(fr.n0 n0Var, o<T> oVar, T t15, boolean z15, tq.e<? super v> eVar) {
            super(2, eVar);
            this.f195712h = n0Var;
            this.f195713j = oVar;
            this.f195714k = t15;
            this.f195715l = z15;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.e(r7, r6) == r0) goto L16;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f195710f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f195709e
                fr.n0 r1 = (fr.n0) r1
                java.lang.Object r3 = r6.f195711g
                u6.w0 r3 = (u6.w0) r3
                oq.u.b(r7)
                goto L45
            L26:
                oq.u.b(r7)
                java.lang.Object r7 = r6.f195711g
                u6.w0 r7 = (u6.w0) r7
                fr.n0 r1 = r6.f195712h
                u6.o<T> r4 = r6.f195713j
                u6.d0 r4 = u6.o.g(r4)
                r6.f195711g = r7
                r6.f195709e = r1
                r6.f195710f = r3
                java.lang.Object r3 = r4.c(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f66407a = r7
                T r7 = r6.f195714k
                r1 = 0
                r6.f195711g = r1
                r6.f195709e = r1
                r6.f195710f = r2
                java.lang.Object r7 = r3.e(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f195715l
                if (r7 == 0) goto L7d
                u6.o<T> r7 = r6.f195713j
                u6.p r7 = u6.o.h(r7)
                u6.f r0 = new u6.f
                T r1 = r6.f195714k
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                fr.n0 r3 = r6.f195712h
                int r3 = r3.f66407a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.o.v.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(w0<T> w0Var, tq.e<? super oq.i0> eVar) {
            return ((v) v(w0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            v vVar = new v(this.f195712h, this.f195713j, this.f195714k, this.f195715l, eVar);
            vVar.f195711g = obj;
            return vVar;
        }
    }

    public o(q0<T> q0Var, List<? extends er.p<? super c0<T>, ? super tq.e<? super oq.i0>, ? extends Object>> list, u6.e<T> eVar, ju.p0 p0Var) {
        this.storage = q0Var;
        this.corruptionHandler = eVar;
        this.scope = p0Var;
        this.readAndInit = new b(list);
        this.writeActor = new n0<>(p0Var, new er.l() { // from class: u6.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.G(this.f195564a, (Throwable) obj);
            }
        }, new er.p() { // from class: u6.n
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return o.H((g0.a) obj, (Throwable) obj2);
            }
        }, new t(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r9 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(boolean r8, tq.e<? super u6.p0<T>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.o.A(boolean, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(tq.e<? super T> eVar) {
        return s0.a(w(), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[Catch: d -> 0x005e, TryCatch #0 {d -> 0x005e, blocks: (B:19:0x0059, B:54:0x00e8, B:24:0x0063, B:51:0x00cd, B:32:0x0078, B:40:0x0090, B:42:0x0096, B:36:0x0081, B:48:0x00bd), top: B:74:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(boolean z15, tq.e<? super u6.f<T>> eVar) throws Throwable {
        n nVar;
        fr.p0 p0Var;
        u6.d dVar;
        fr.p0 p0Var2;
        fr.n0 n0Var;
        u6.d dVar2;
        p pVar;
        fr.n0 n0Var2;
        fr.p0 p0Var3;
        int iHashCode;
        Object objA;
        boolean z16;
        int i15;
        Object obj;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i16 = nVar.f195676l;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f195676l = i16 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(this, eVar);
            }
        } else {
            nVar = new n(this, eVar);
        }
        Object obj2 = (T) nVar.f195674j;
        Object objE = uq.b.e();
        try {
            switch (nVar.f195676l) {
                case 0:
                    oq.u.b(obj2);
                    if (z15) {
                        nVar.f195669d = z15;
                        nVar.f195676l = 1;
                        obj2 = (T) B(nVar);
                        if (obj2 != objE) {
                            if (obj2 != null) {
                                iHashCode = obj2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            d0 d0VarV = v();
                            nVar.f195670e = obj2;
                            nVar.f195669d = z15;
                            nVar.f195673h = iHashCode;
                            nVar.f195676l = 2;
                            objA = d0VarV.a(nVar);
                            if (objA != objE) {
                                int i17 = iHashCode;
                                z16 = z15;
                                i15 = i17;
                                obj = obj2;
                                obj2 = (T) objA;
                                return new u6.f(obj, i15, ((Number) obj2).intValue());
                            }
                        }
                    } else {
                        d0 d0VarV2 = v();
                        nVar.f195669d = z15;
                        nVar.f195676l = 3;
                        obj2 = (T) d0VarV2.a(nVar);
                        if (obj2 != objE) {
                            int iIntValue = ((Number) obj2).intValue();
                            d0 d0VarV3 = v();
                            C5096o c5096o = new C5096o(this, iIntValue, null);
                            nVar.f195669d = z15;
                            nVar.f195676l = 4;
                            obj2 = (T) d0VarV3.b(c5096o, nVar);
                            if (obj2 == objE) {
                            }
                            return (u6.f) obj2;
                        }
                    }
                    return objE;
                case 1:
                    z15 = nVar.f195669d;
                    oq.u.b(obj2);
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    d0 d0VarV4 = v();
                    nVar.f195670e = obj2;
                    nVar.f195669d = z15;
                    nVar.f195673h = iHashCode;
                    nVar.f195676l = 2;
                    objA = d0VarV4.a(nVar);
                    if (objA != objE) {
                        int i18 = iHashCode;
                        z16 = z15;
                        i15 = i18;
                        obj = obj2;
                        obj2 = (T) objA;
                        return new u6.f(obj, i15, ((Number) obj2).intValue());
                    }
                    return objE;
                case 2:
                    i15 = nVar.f195673h;
                    z16 = nVar.f195669d;
                    obj = nVar.f195670e;
                    try {
                        oq.u.b(obj2);
                        return new u6.f(obj, i15, ((Number) obj2).intValue());
                    } catch (u6.d e15) {
                        e = e15;
                        z15 = z16;
                        p0Var = new fr.p0();
                        u6.e<T> eVar2 = this.corruptionHandler;
                        nVar.f195670e = e;
                        nVar.f195671f = p0Var;
                        nVar.f195672g = p0Var;
                        nVar.f195669d = z15;
                        nVar.f195676l = 5;
                        Object objA2 = eVar2.a(e, nVar);
                        if (objA2 != objE) {
                            dVar = e;
                            obj2 = (T) objA2;
                            p0Var2 = p0Var;
                            p0Var2.f66410a = (T) obj2;
                            n0Var = new fr.n0();
                            try {
                                pVar = new p(p0Var, this, n0Var, null);
                                nVar.f195670e = dVar;
                                nVar.f195671f = p0Var;
                                nVar.f195672g = n0Var;
                                nVar.f195676l = 6;
                                if (u(z15, pVar, nVar) != objE) {
                                    n0Var2 = n0Var;
                                    p0Var3 = p0Var;
                                    T t15 = p0Var3.f66410a;
                                    return new u6.f(t15, t15 != null ? t15.hashCode() : 0, n0Var2.f66407a);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                dVar2 = dVar;
                                oq.c.a(dVar2, th);
                                throw dVar2;
                            }
                        }
                        return objE;
                    }
                case 3:
                    z15 = nVar.f195669d;
                    oq.u.b(obj2);
                    int iIntValue2 = ((Number) obj2).intValue();
                    d0 d0VarV5 = v();
                    C5096o c5096o2 = new C5096o(this, iIntValue2, null);
                    nVar.f195669d = z15;
                    nVar.f195676l = 4;
                    obj2 = (T) d0VarV5.b(c5096o2, nVar);
                    if (obj2 == objE) {
                        return objE;
                    }
                    return (u6.f) obj2;
                case 4:
                    boolean z17 = nVar.f195669d;
                    oq.u.b(obj2);
                    return (u6.f) obj2;
                case 5:
                    z15 = nVar.f195669d;
                    fr.p0 p0Var4 = (fr.p0) nVar.f195672g;
                    fr.p0 p0Var5 = (fr.p0) nVar.f195671f;
                    dVar = (u6.d) nVar.f195670e;
                    oq.u.b(obj2);
                    p0Var2 = p0Var4;
                    p0Var = p0Var5;
                    p0Var2.f66410a = (T) obj2;
                    n0Var = new fr.n0();
                    pVar = new p(p0Var, this, n0Var, null);
                    nVar.f195670e = dVar;
                    nVar.f195671f = p0Var;
                    nVar.f195672g = n0Var;
                    nVar.f195676l = 6;
                    if (u(z15, pVar, nVar) != objE) {
                        n0Var2 = n0Var;
                        p0Var3 = p0Var;
                        T t16 = p0Var3.f66410a;
                        return new u6.f(t16, t16 != null ? t16.hashCode() : 0, n0Var2.f66407a);
                    }
                    return objE;
                case 6:
                    n0Var2 = (fr.n0) nVar.f195672g;
                    p0Var3 = (fr.p0) nVar.f195671f;
                    dVar2 = (u6.d) nVar.f195670e;
                    try {
                        oq.u.b(obj2);
                        T t17 = p0Var3.f66410a;
                        return new u6.f(t17, t17 != null ? t17.hashCode() : 0, n0Var2.f66407a);
                    } catch (Throwable th5) {
                        th = th5;
                        oq.c.a(dVar2, th);
                        throw dVar2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (u6.d e16) {
            e = e16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(boolean z15, tq.e<? super p0<T>> eVar) {
        return ju.i.g(this.scope.getCoroutineContext(), new q(this, z15, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 E(o oVar) {
        return oVar.storage.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar, tq.i iVar, tq.e<? super T> eVar) {
        return v().e(new r(this, iVar, pVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(o oVar, Throwable th4) {
        if (th4 != null) {
            oVar.inMemoryCache.c(new b0(th4));
        }
        if (oVar.storageConnectionDelegate.c()) {
            oVar.w().close();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(g0.a aVar, Throwable th4) {
        ju.x<T> xVarA = aVar.a();
        if (th4 == null) {
            th4 = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        xVarA.p(th4);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 s(o oVar) {
        return oVar.w().getCoordinator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(tq.e<? super oq.i0> eVar) throws Throwable {
        d dVar;
        su.a aVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f195635g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f195635g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(this, eVar);
            }
        } else {
            dVar = new d(this, eVar);
        }
        Object obj = dVar.f195633e;
        Object objE = uq.b.e();
        int i16 = dVar.f195635g;
        if (i16 == 0) {
            oq.u.b(obj);
            su.a aVar2 = this.collectorMutex;
            dVar.f195632d = aVar2;
            dVar.f195635g = 1;
            if (aVar2.h(null, dVar) == objE) {
                return objE;
            }
            aVar = aVar2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (su.a) dVar.f195632d;
            oq.u.b(obj);
        }
        try {
            int i17 = this.collectorCounter - 1;
            this.collectorCounter = i17;
            if (i17 == 0) {
                d2 d2Var = this.collectorJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                this.collectorJob = null;
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return oq.i0.f148189a;
        } finally {
            aVar.r(null);
        }
    }

    private final <R> Object u(boolean z15, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super R> eVar) {
        return z15 ? lVar.b(eVar) : v().e(new e(lVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 v() {
        return (d0) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(g0.a<T> aVar, tq.e<? super oq.i0> eVar) throws Throwable {
        f fVar;
        Throwable th4;
        ju.x<T> xVar;
        Object objB;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f195641g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f195641g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(this, eVar);
            }
        } else {
            fVar = new f(this, eVar);
        }
        Object obj = fVar.f195639e;
        Object objE = uq.b.e();
        int i16 = fVar.f195641g;
        if (i16 == 0) {
            oq.u.b(obj);
            ju.x<T> xVarA = aVar.a();
            try {
                oq.t.Companion companion = oq.t.INSTANCE;
                tq.i iVarN0 = aVar.getCallerContext().n0(fVar.getContext());
                g gVar = new g(this, aVar, null);
                fVar.f195638d = xVarA;
                fVar.f195641g = 1;
                Object objG = ju.i.g(iVarN0, gVar, fVar);
                if (objG == objE) {
                    return objE;
                }
                obj = objG;
                xVar = xVarA;
            } catch (Throwable th5) {
                th4 = th5;
                xVar = xVarA;
                oq.t.Companion companion2 = oq.t.INSTANCE;
                objB = oq.t.b(oq.u.a(th4));
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (ju.x) fVar.f195638d;
            try {
                oq.u.b(obj);
            } catch (Throwable th6) {
                th4 = th6;
                oq.t.Companion companion3 = oq.t.INSTANCE;
                objB = oq.t.b(oq.u.a(th4));
            }
        }
        objB = oq.t.b(obj);
        ju.z.d(xVar, objB);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(tq.e<? super oq.i0> eVar) throws Throwable {
        h hVar;
        su.a aVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f195648g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f195648g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(this, eVar);
            }
        } else {
            hVar = new h(this, eVar);
        }
        Object obj = hVar.f195646e;
        Object objE = uq.b.e();
        int i16 = hVar.f195648g;
        if (i16 == 0) {
            oq.u.b(obj);
            aVar = this.collectorMutex;
            hVar.f195645d = aVar;
            hVar.f195648g = 1;
            if (aVar.h(null, hVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            su.a aVar2 = (su.a) hVar.f195645d;
            oq.u.b(obj);
            aVar = aVar2;
        }
        try {
            int i17 = this.collectorCounter + 1;
            this.collectorCounter = i17;
            if (i17 == 1) {
                this.collectorJob = ju.k.d(this.scope, null, null, new i(this, null), 3, null);
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return oq.i0.f148189a;
        } finally {
            aVar.r(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r2.c(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof u6.o.j
            if (r0 == 0) goto L13
            r0 = r7
            u6.o$j r0 = (u6.o.j) r0
            int r1 = r0.f195655g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195655g = r1
            goto L18
        L13:
            u6.o$j r0 = new u6.o$j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f195653e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f195655g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r0 = r0.f195652d
            oq.u.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L5f
        L2e:
            r7 = move-exception
            goto L66
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            oq.u.b(r7)
            goto L4c
        L3c:
            oq.u.b(r7)
            u6.d0 r7 = r6.v()
            r0.f195655g = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4c
            goto L5e
        L4c:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            u6.o<T>$b r2 = r6.readAndInit     // Catch: java.lang.Throwable -> L62
            r0.f195652d = r7     // Catch: java.lang.Throwable -> L62
            r0.f195655g = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r2.c(r0)     // Catch: java.lang.Throwable -> L62
            if (r7 != r1) goto L5f
        L5e:
            return r1
        L5f:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        L62:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L66:
            u6.p<T> r1 = r6.inMemoryCache
            u6.i0 r2 = new u6.i0
            r2.<init>(r7, r0)
            r1.c(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.o.z(tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(T t15, boolean z15, tq.e<? super Integer> eVar) throws Throwable {
        u uVar;
        fr.n0 n0Var;
        if (eVar instanceof u) {
            uVar = (u) eVar;
            int i15 = uVar.f195708g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                uVar.f195708g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                uVar = new u(this, eVar);
            }
        } else {
            uVar = new u(this, eVar);
        }
        Object obj = uVar.f195706e;
        Object objE = uq.b.e();
        int i16 = uVar.f195708g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.n0 n0Var2 = new fr.n0();
            r0<T> r0VarW = w();
            v vVar = new v(n0Var2, this, t15, z15, null);
            uVar.f195705d = n0Var2;
            uVar.f195708g = 1;
            if (r0VarW.b(vVar, uVar) == objE) {
                return objE;
            }
            n0Var = n0Var2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (fr.n0) uVar.f195705d;
            oq.u.b(obj);
        }
        return vq.b.e(n0Var.f66407a);
    }

    @Override // u6.i
    public Object a(er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        v0 v0Var = (v0) eVar.getContext().m(v0.Companion.C5097a.f195749a);
        if (v0Var != null) {
            v0Var.a(this);
        }
        return ju.i.g(new v0(v0Var, this), new s(this, pVar, null), eVar);
    }

    @Override // u6.i
    public mu.g<T> getData() {
        return this.data;
    }

    public final r0<T> w() {
        return this.storageConnectionDelegate.getValue();
    }
}
