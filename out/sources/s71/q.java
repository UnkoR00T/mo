package s71;

import cl0.BEPassportChildApplicationCountryDictionary;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Ls71/q;", "Ll00/g;", "Ls71/c;", "Ls71/a;", "Ls71/d;", "", "Lyy/a;", "stateMachineFactory", "Lt71/a;", "mapper", "Lm61/a;", "checkForeignAddressValidUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Ls71/b;", "setupData", "<init>", "(Lyy/a;Lt71/a;Lm61/a;Lhb4/d;Lib4/c;Ls71/b;)V", "state", "Ls71/d$a;", "t9", "(Ls71/c;)Ls71/d$a;", "q9", "()Ls71/c;", "Ldx/b;", "domainError", "Lhb4/c;", "r9", "(Ldx/b;)Lhb4/c;", "b", "Lt71/a;", "c", "Lm61/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Ls71/b;", "g", "Ls71/c;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ls71/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<s71.c, s71.a> implements s71.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t71.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m61.a checkForeignAddressValidUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s71.c initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<s71.c, s71.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<s71.d.a> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s71.a.c> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<s71.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f178684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f178685b;

        /* JADX INFO: renamed from: s71.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4586a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f178686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f178687b;

            /* JADX INFO: renamed from: s71.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4587a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f178688d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f178689e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f178690f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f178692h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f178693j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f178694k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f178695l;

                public C4587a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f178688d = obj;
                    this.f178689e |= PKIFailureInfo.systemUnavail;
                    return C4586a.this.F(null, this);
                }
            }

            public C4586a(mu.h hVar, q qVar) {
                this.f178686a = hVar;
                this.f178687b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4587a c4587a;
                if (eVar instanceof C4587a) {
                    c4587a = (C4587a) eVar;
                    int i15 = c4587a.f178689e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4587a.f178689e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4587a = new C4587a(eVar);
                    }
                } else {
                    c4587a = new C4587a(eVar);
                }
                Object obj2 = c4587a.f178688d;
                Object objE = uq.b.e();
                int i16 = c4587a.f178689e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f178686a;
                    s71.d.a aVarT9 = this.f178687b.t9((s71.c) obj);
                    c4587a.f178690f = vq.j.a(obj);
                    c4587a.f178692h = vq.j.a(c4587a);
                    c4587a.f178693j = vq.j.a(obj);
                    c4587a.f178694k = vq.j.a(hVar);
                    c4587a.f178695l = 0;
                    c4587a.f178689e = 1;
                    if (hVar.F(aVarT9, c4587a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, q qVar) {
            this.f178684a = gVar;
            this.f178685b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s71.d.a> hVar, tq.e eVar) {
            Object objA = this.f178684a.a(new C4586a(hVar, this.f178685b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls71/a$c;", "action", "Ls71/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls71/a$c;Ls71/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<s71.a.c, s71.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178697f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s71.a.c cVar = (s71.a.c) this.f178697f;
            Object objE = uq.b.e();
            int i15 = this.f178696e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                this.f178697f = vq.j.a(cVar);
                this.f178696e = 1;
                if (qVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s71.a.c cVar, s71.c cVar2, tq.e<? super i0> eVar) {
            b bVar = q.this.new b(eVar);
            bVar.f178697f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls71/a$f;", "action", "Lk10/c0;", "Ls71/c$b;", "state", "Lk10/l;", "Ls71/c;", "<anonymous>", "(Ls71/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s71.a.UpdateAddress, c0<s71.c.Initialized>, tq.e<? super k10.l<? extends s71.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178701g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s71.c.Initialized O(s71.a.UpdateAddress updateAddress, s71.c.Initialized initialized) {
            return s71.c.Initialized.b(initialized, null, updateAddress.getAddress(), new t50.e.Default(null, 1, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s71.a.UpdateAddress updateAddress = (s71.a.UpdateAddress) this.f178700f;
            c0 c0Var = (c0) this.f178701g;
            uq.b.e();
            if (this.f178699e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s71.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(updateAddress, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s71.a.UpdateAddress updateAddress, c0<s71.c.Initialized> c0Var, tq.e<? super k10.l<? extends s71.c>> eVar) {
            c cVar = new c(eVar);
            cVar.f178700f = updateAddress;
            cVar.f178701g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls71/a$d;", "<unused var>", "Lk10/c0;", "Ls71/c$b;", "state", "Lk10/l;", "Ls71/c;", "<anonymous>", "(Ls71/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<s71.a.d, c0<s71.c.Initialized>, tq.e<? super k10.l<? extends s71.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f178703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f178705h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s71.c.Initialized V(hz.b bVar, s71.c.Initialized initialized) {
            return s71.c.Initialized.b(initialized, null, null, new t50.e.Error(((hz.b.Invalid) bVar).getMessage()), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s71.c.Initialized X(s71.c.Initialized initialized) {
            return s71.c.Initialized.b(initialized, null, null, new t50.e.Default(null, 1, null), 3, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        
            if (r2.F(r3, r8) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        
            if (r2.F(r4, r8) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s71.q.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(s71.a.d dVar, c0<s71.c.Initialized> c0Var, tq.e<? super k10.l<? extends s71.c>> eVar) {
            d dVar2 = q.this.new d(eVar);
            dVar2.f178705h = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls71/a$a;", "<unused var>", "Ls71/c$b;", "Loq/i0;", "<anonymous>", "(Ls71/a$a;Ls71/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<s71.a.C4582a, s71.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178707e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178707e;
            if (i15 == 0) {
                oq.u.b(obj);
                q.this.d9(s71.a.e.f178645a);
                q qVar = q.this;
                s71.a.c.C4583a c4583a = s71.a.c.C4583a.f178640a;
                this.f178707e = 1;
                if (qVar.F(c4583a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s71.a.C4582a c4582a, s71.c.Initialized initialized, tq.e<? super i0> eVar) {
            return q.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls71/a$e;", "<unused var>", "Ls71/c$b;", "state", "Loq/i0;", "<anonymous>", "(Ls71/a$e;Ls71/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<s71.a.e, s71.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178710f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s71.c.Initialized initialized = (s71.c.Initialized) this.f178710f;
            uq.b.e();
            if (this.f178709e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.setupData.getContract().r8(new i61.d.Foreign(initialized.getAddress()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s71.a.e eVar, s71.c.Initialized initialized, tq.e<? super i0> eVar2) {
            f fVar = q.this.new f(eVar2);
            fVar.f178710f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls71/a$b;", "<unused var>", "Ls71/c$b;", "Loq/i0;", "<anonymous>", "(Ls71/a$b;Ls71/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<s71.a.b, s71.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178712e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178712e;
            if (i15 == 0) {
                oq.u.b(obj);
                q.this.d9(s71.a.e.f178645a);
                q qVar = q.this;
                s71.a.c.b bVar = s71.a.c.b.f178641a;
                this.f178712e = 1;
                if (qVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s71.a.b bVar, s71.c.Initialized initialized, tq.e<? super i0> eVar) {
            return q.this.new g(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, t71.a aVar2, m61.a aVar3, hb4.d dVar, ib4.c cVar, SetupData setupData) {
        this.mapper = aVar2;
        this.checkForeignAddressValidUC = aVar3;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.setupData = setupData;
        s71.c cVarQ9 = q9();
        this.initialState = cVarQ9;
        this.stateMachine = aVar.a(cVarQ9, new er.l() { // from class: s71.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f178674a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(cVarQ9));
        this.navAction = new xw.b<>();
    }

    private final s71.c q9() {
        String address;
        if (this.setupData.getPassportOfficePlace() != null && this.setupData.getSelectedCountry() != null) {
            BEPassportChildApplicationCountryDictionary selectedCountry = this.setupData.getSelectedCountry();
            i61.d dVarY0 = this.setupData.getContract().y0();
            if ((dVarY0 instanceof i61.d.Domestic) || dVarY0 == null) {
                address = "";
            } else {
                if (!(dVarY0 instanceof i61.d.Foreign)) {
                    throw new oq.p();
                }
                address = ((i61.d.Foreign) dVarY0).getAddress();
            }
            return new s71.c.Initialized(selectedCountry, address, new t50.e.Default(null, 1, null));
        }
        return new s71.c.Error(r9(new dx.b.Generic(null, 1, null)));
    }

    private final hb4.c r9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: s71.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f178673a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            qVar.d9(s71.a.c.C4583a.f178640a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s71.d.a t9(s71.c state) {
        return this.mapper.b(new t71.a.Params(state, new er.l() { // from class: s71.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f178672a, (String) obj);
            }
        }, b9(s71.a.C4582a.f178638a), b9(s71.a.b.f178639a), b9(s71.a.d.f178644a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, String str) {
        qVar.d9(new s71.a.UpdateAddress(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(s71.c.class), new er.l() { // from class: s71.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f178670a, (z) obj);
            }
        });
        vVar.c(q0.c(s71.c.Initialized.class), new er.l() { // from class: s71.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f178671a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(s71.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(s71.a.UpdateAddress.class), oVar, cVar);
        zVar.v(q0.c(s71.a.d.class), oVar, qVar.new d(null));
        zVar.x(q0.c(s71.a.C4582a.class), oVar, qVar.new e(null));
        zVar.x(q0.c(s71.a.e.class), oVar, qVar.new f(null));
        zVar.x(q0.c(s71.a.b.class), oVar, qVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s71.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<s71.c, s71.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<s71.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(s71.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
