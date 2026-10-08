package sg3;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import og3.x;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lsg3/p;", "Ll00/g;", "Lsg3/b;", "Lsg3/a;", "Lsg3/c;", "", "Lyy/a;", "stateMachineFactory", "Ltg3/a;", "mapper", "Lib4/c;", "domainErrorMapper", "Lee3/a;", "getAwaitReadyToSignUC", "Lee3/c;", "startAwaitReadyToSignUC", "Lde3/d;", "isWrongStateErrorUC", "Log3/x;", "contract", "<init>", "(Lyy/a;Ltg3/a;Lib4/c;Lee3/a;Lee3/c;Lde3/d;Log3/x;)V", "Ldx/b;", "domainError", "retryAction", "Loq/i0;", "s9", "(Ldx/b;Lsg3/a;Ltq/e;)Ljava/lang/Object;", "Lsg3/c$a;", "u9", "(Lsg3/b;)Lsg3/c$a;", "b", "Ltg3/a;", "c", "Lib4/c;", "d", "Lee3/a;", "e", "Lee3/c;", "f", "Lde3/d;", "g", "Log3/x;", "r9", "()Log3/x;", "Lsg3/b$a;", "h", "Lsg3/b$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsg3/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<sg3.b, sg3.a> implements sg3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tg3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ee3.a getAwaitReadyToSignUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ee3.c startAwaitReadyToSignUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final sg3.b.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sg3.b, sg3.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sg3.a.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<sg3.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<sg3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f181595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f181596b;

        /* JADX INFO: renamed from: sg3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4672a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f181597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f181598b;

            /* JADX INFO: renamed from: sg3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4673a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f181599d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f181600e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f181601f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f181603h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f181604j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f181605k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f181606l;

                public C4673a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f181599d = obj;
                    this.f181600e |= PKIFailureInfo.systemUnavail;
                    return C4672a.this.F(null, this);
                }
            }

            public C4672a(mu.h hVar, p pVar) {
                this.f181597a = hVar;
                this.f181598b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4673a c4673a;
                if (eVar instanceof C4673a) {
                    c4673a = (C4673a) eVar;
                    int i15 = c4673a.f181600e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4673a.f181600e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4673a = new C4673a(eVar);
                    }
                } else {
                    c4673a = new C4673a(eVar);
                }
                Object obj2 = c4673a.f181599d;
                Object objE = uq.b.e();
                int i16 = c4673a.f181600e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f181597a;
                    sg3.c.a aVarU9 = this.f181598b.u9((sg3.b) obj);
                    c4673a.f181601f = vq.j.a(obj);
                    c4673a.f181603h = vq.j.a(c4673a);
                    c4673a.f181604j = vq.j.a(obj);
                    c4673a.f181605k = vq.j.a(hVar);
                    c4673a.f181606l = 0;
                    c4673a.f181600e = 1;
                    if (hVar.F(aVarU9, c4673a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, p pVar) {
            this.f181595a = gVar;
            this.f181596b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sg3.c.a> hVar, tq.e eVar) {
            Object objA = this.f181595a.a(new C4672a(hVar, this.f181596b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsg3/a$a;", "<unused var>", "Lsg3/b;", "Loq/i0;", "<anonymous>", "(Lsg3/a$a;Lsg3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<sg3.a.C4667a, sg3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181607e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181607e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                sg3.a.d.C4668a c4668a = sg3.a.d.C4668a.f181551a;
                this.f181607e = 1;
                if (pVar.F(c4668a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sg3.a.C4667a c4667a, sg3.b bVar, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsg3/a$c;", "<unused var>", "Lsg3/b;", "Loq/i0;", "<anonymous>", "(Lsg3/a$c;Lsg3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sg3.a.c, sg3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181609e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181609e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                sg3.a.d.c cVar = sg3.a.d.c.f181553a;
                this.f181609e = 1;
                if (pVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sg3.a.c cVar, sg3.b bVar, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsg3/a$b;", "<unused var>", "Lsg3/b;", "Loq/i0;", "<anonymous>", "(Lsg3/a$b;Lsg3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sg3.a.b, sg3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181611e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181611e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                sg3.a.d.b bVar = sg3.a.d.b.f181552a;
                this.f181611e = 1;
                if (pVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sg3.a.b bVar, sg3.b bVar2, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsg3/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lsg3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<sg3.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181613e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f181613e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            p.this.d9(sg3.a.e.f181557a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sg3.b.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsg3/a$e;", "action", "Lk10/c0;", "Lsg3/b$a;", "state", "Lk10/l;", "Lsg3/b;", "<anonymous>", "(Lsg3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sg3.a.e, c0<sg3.b.a>, tq.e<? super k10.l<? extends sg3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181617g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f181618h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f181619j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f181620k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f181621l;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sg3.b.Initialized O(ProcessId processId, sg3.b.a aVar) {
            return new sg3.b.Initialized(processId);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sg3.a.e eVar = (sg3.a.e) this.f181620k;
            c0 c0Var = (c0) this.f181621l;
            Object objE = uq.b.e();
            int i15 = this.f181619j;
            if (i15 == 0) {
                u.b(obj);
                dx.i<dx.b, ProcessId> iVarE = p.this.getContract().e();
                p pVar = p.this;
                if (!(iVarE instanceof dx.i.Left)) {
                    if (!(iVarE instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final ProcessId processId = (ProcessId) ((dx.i.Right) iVarE).b();
                    return c0Var.d(new er.l() { // from class: sg3.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.f.O(processId, (b.a) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVarE).b();
                this.f181620k = vq.j.a(eVar);
                this.f181621l = c0Var;
                this.f181615e = vq.j.a(iVarE);
                this.f181616f = vq.j.a(bVar);
                this.f181617g = 0;
                this.f181618h = 0;
                this.f181619j = 1;
                if (pVar.s9(bVar, eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sg3.a.e eVar, c0<sg3.b.a> c0Var, tq.e<? super k10.l<? extends sg3.b>> eVar2) {
            f fVar = p.this.new f(eVar2);
            fVar.f181620k = eVar;
            fVar.f181621l = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "Lee3/a$b;", "result", "Lsg3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;Lsg3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dx.i<? extends dx.b, ? extends ee3.a.Result>, sg3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f181626h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f181627j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f181628k;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (r8.s9(r2, r3, r7) == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
        
            if (r8.F(r4, r7) == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f181628k
                dx.i r0 = (dx.i) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f181627j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                java.lang.Object r0 = r7.f181624f
                ee3.a$b r0 = (ee3.a.Result) r0
                goto L23
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r0 = r7.f181624f
                dx.b r0 = (dx.b) r0
            L23:
                java.lang.Object r0 = r7.f181623e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto L9b
            L2b:
                oq.u.b(r8)
                sg3.p r8 = sg3.p.this
                boolean r2 = r0 instanceof dx.i.Left
                r5 = 0
                if (r2 == 0) goto L5f
                r2 = r0
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                dx.b r2 = (dx.b) r2
                sg3.a$g r3 = sg3.a.g.f181559a
                java.lang.Object r6 = vq.j.a(r0)
                r7.f181628k = r6
                java.lang.Object r0 = vq.j.a(r0)
                r7.f181623e = r0
                java.lang.Object r0 = vq.j.a(r2)
                r7.f181624f = r0
                r7.f181625g = r5
                r7.f181626h = r5
                r7.f181627j = r4
                java.lang.Object r8 = sg3.p.o9(r8, r2, r3, r7)
                if (r8 != r1) goto L9b
                goto L9a
            L5f:
                boolean r2 = r0 instanceof dx.i.Right
                if (r2 == 0) goto L9e
                r2 = r0
                dx.i$c r2 = (dx.i.Right) r2
                java.lang.Object r2 = r2.b()
                ee3.a$b r2 = (ee3.a.Result) r2
                og3.x r4 = r8.getContract()
                r4.m8()
                sg3.a$d$d r4 = new sg3.a$d$d
                sv0.c0 r6 = r2.getStatementDetailsData()
                r4.<init>(r6)
                java.lang.Object r6 = vq.j.a(r0)
                r7.f181628k = r6
                java.lang.Object r0 = vq.j.a(r0)
                r7.f181623e = r0
                java.lang.Object r0 = vq.j.a(r2)
                r7.f181624f = r0
                r7.f181625g = r5
                r7.f181626h = r5
                r7.f181627j = r3
                java.lang.Object r8 = r8.F(r4, r7)
                if (r8 != r1) goto L9b
            L9a:
                return r1
            L9b:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L9e:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sg3.p.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, ee3.a.Result> iVar, sg3.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f181628k = iVar;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsg3/a$g;", "<unused var>", "Lsg3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lsg3/a$g;Lsg3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sg3.a.g, sg3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181631f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sg3.b.Initialized initialized = (sg3.b.Initialized) this.f181631f;
            Object objE = uq.b.e();
            int i15 = this.f181630e;
            if (i15 == 0) {
                u.b(obj);
                ee3.c cVar = p.this.startAwaitReadyToSignUC;
                ee3.c.Params params = new ee3.c.Params(initialized.getProcessId());
                this.f181631f = vq.j.a(initialized);
                this.f181630e = 1;
                if (cVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sg3.a.g gVar, sg3.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f181631f = initialized;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsg3/a$f;", "<unused var>", "Lsg3/b$b;", "Loq/i0;", "<anonymous>", "(Lsg3/a$f;Lsg3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sg3.a.f, sg3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181633e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181633e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                sg3.a.d.f fVar = sg3.a.d.f.f181556a;
                this.f181633e = 1;
                if (pVar.F(fVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sg3.a.f fVar, sg3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return p.this.new i(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, tg3.a aVar2, ib4.c cVar, ee3.a aVar3, ee3.c cVar2, de3.d dVar, x xVar) {
        this.mapper = aVar2;
        this.domainErrorMapper = cVar;
        this.getAwaitReadyToSignUC = aVar3;
        this.startAwaitReadyToSignUC = cVar2;
        this.isWrongStateErrorUC = dVar;
        this.contract = xVar;
        sg3.b.a aVar4 = sg3.b.a.f181560a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: sg3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f181584a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g A9(p pVar, sg3.b.Initialized initialized) {
        return pVar.getAwaitReadyToSignUC.a(new ee3.a.Params(initialized.getProcessId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s9(final dx.b bVar, final sg3.a aVar, tq.e<? super i0> eVar) {
        Object objF = F(new sg3.a.d.ShowError(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: sg3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f181581a, bVar, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, dx.b bVar, sg3.a aVar, ib4.c.b bVar2) {
        if (pVar.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue()) {
            pVar.d9(sg3.a.b.f181549a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            pVar.d9(aVar);
        } else {
            if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close)) {
                throw new oq.p();
            }
            pVar.d9(sg3.a.c.f181550a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sg3.c.a u9(sg3.b bVar) {
        return this.mapper.b(new tg3.a.Params(bVar, b9(sg3.a.C4667a.f181548a), b9(sg3.a.f.f181558a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final p pVar, v vVar) {
        vVar.c(q0.c(sg3.b.class), new er.l() { // from class: sg3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f181577a, (z) obj);
            }
        });
        vVar.c(q0.c(sg3.b.a.class), new er.l() { // from class: sg3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f181578a, (z) obj);
            }
        });
        vVar.c(q0.c(sg3.b.Initialized.class), new er.l() { // from class: sg3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f181579a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sg3.a.C4667a.class), oVar, bVar);
        zVar.x(q0.c(sg3.a.c.class), oVar, pVar.new c(null));
        zVar.x(q0.c(sg3.a.b.class), oVar, pVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, z zVar) {
        zVar.C(pVar.new e(null));
        f fVar = pVar.new f(null);
        zVar.v(q0.c(sg3.a.e.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, z zVar) {
        k10.k.r(zVar, new er.l() { // from class: sg3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f181580a, (b.Initialized) obj);
            }
        }, null, pVar.new g(null), 2, null);
        h hVar = pVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sg3.a.g.class), oVar, hVar);
        zVar.x(q0.c(sg3.a.f.class), oVar, pVar.new i(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sg3.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sg3.b, sg3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sg3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sg3.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    /* JADX INFO: renamed from: r9, reason: from getter */
    public final x getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(x xVar) {
        super.P5(xVar);
    }
}
