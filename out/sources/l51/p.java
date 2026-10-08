package l51;

import fr.q0;
import g51.ReceiveDocumentAddressData;
import k10.c0;
import k10.z;
import mu.p0;
import o51.ReceiveDocumentSpecifiedAddressFields;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0014\u0010$\u001a\u00020\u001e*\u00020\u001eH\u0082@¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010L\u001a\b\u0012\u0004\u0012\u00020&0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Ll51/p;", "Ll00/g;", "Ll51/b;", "Ll51/a;", "Ll51/c;", "", "Lyy/a;", "stateMachineFactory", "Lst3/h;", "addressFormVMSFactory", "Ln51/c;", "mapper", "Lq31/c;", "exitDialogMapper", "Lcx/a;", "eventThrottler", "Lo31/g;", "validateNameUC", "Lo31/h;", "validateSurnameUC", "Lm51/a;", "contract", "<init>", "(Lyy/a;Lst3/h;Ln51/c;Lq31/c;Lcx/a;Lo31/g;Lo31/h;Lm51/a;)V", "u9", "()Ll51/b;", "Lg51/a;", "data", "x9", "(Lg51/a;)Ll51/b;", "Lo51/a;", "fields", "Lst3/b;", "address", "s9", "(Lo51/a;Lst3/b;)Lg51/a;", "C9", "(Lo51/a;Ltq/e;)Ljava/lang/Object;", "Ll51/c$a;", "v9", "(Ll51/b;)Ll51/c$a;", "b", "Lst3/h;", "c", "Ln51/c;", "d", "Lq31/c;", "e", "Lcx/a;", "f", "Lo31/g;", "g", "Lo31/h;", "h", "Lm51/a;", "j", "Ll51/b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ll51/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, l51.a> implements l51.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final st3.h addressFormVMSFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n51.c mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cx.a eventThrottler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o31.g validateNameUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o31.h validateSurnameUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m51.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, l51.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l51.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<l51.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<l51.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f116127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f116128b;

        /* JADX INFO: renamed from: l51.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2806a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f116129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f116130b;

            /* JADX INFO: renamed from: l51.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2807a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f116131d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f116132e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f116133f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f116135h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f116136j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f116137k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f116138l;

                public C2807a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f116131d = obj;
                    this.f116132e |= PKIFailureInfo.systemUnavail;
                    return C2806a.this.F(null, this);
                }
            }

            public C2806a(mu.h hVar, p pVar) {
                this.f116129a = hVar;
                this.f116130b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2807a c2807a;
                if (eVar instanceof C2807a) {
                    c2807a = (C2807a) eVar;
                    int i15 = c2807a.f116132e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2807a.f116132e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2807a = new C2807a(eVar);
                    }
                } else {
                    c2807a = new C2807a(eVar);
                }
                Object obj2 = c2807a.f116131d;
                Object objE = uq.b.e();
                int i16 = c2807a.f116132e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f116129a;
                    l51.c.Data dataV9 = this.f116130b.v9((State) obj);
                    c2807a.f116133f = vq.j.a(obj);
                    c2807a.f116135h = vq.j.a(c2807a);
                    c2807a.f116136j = vq.j.a(obj);
                    c2807a.f116137k = vq.j.a(hVar);
                    c2807a.f116138l = 0;
                    c2807a.f116132e = 1;
                    if (hVar.F(dataV9, c2807a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f116127a = gVar;
            this.f116128b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l51.c.Data> hVar, tq.e eVar) {
            Object objA = this.f116127a.a(new C2806a(hVar, this.f116128b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll51/a$b;", "action", "Ll51/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ll51/a$b;Ll51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<l51.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116140f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f116142e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f116143f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l51.a.b f116144g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, l51.a.b bVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f116143f = pVar;
                this.f116144g = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f116142e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p pVar = this.f116143f;
                    l51.a.b bVar = this.f116144g;
                    this.f116142e = 1;
                    if (pVar.F(bVar, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f116143f, this.f116144g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l51.a.b bVar = (l51.a.b) this.f116140f;
            Object objE = uq.b.e();
            int i15 = this.f116139e;
            if (i15 == 0) {
                oq.u.b(obj);
                cx.a aVar = p.this.eventThrottler;
                a aVar2 = new a(p.this, bVar, null);
                this.f116140f = vq.j.a(bVar);
                this.f116139e = 1;
                if (cx.a.d(aVar, 0L, aVar2, this, 1, null) == objE) {
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
        public final Object w(l51.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = p.this.new b(eVar);
            bVar2.f116140f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll51/a$e;", "<unused var>", "Ll51/b;", "Loq/i0;", "<anonymous>", "(Ll51/a$e;Ll51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<l51.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116145e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f116145e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(new l51.a.b.ShowDialog(p.this.exitDialogMapper.b(new q31.c.Params(p.this.b9(l51.a.b.C2805b.f116087a)))));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l51.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return p.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll51/a$d;", "action", "Lk10/c0;", "Ll51/b;", "state", "Lk10/l;", "<anonymous>", "(Ll51/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<l51.a.OnValidated, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f116150h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f116151j;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields, ReceiveDocumentSpecifiedAddressFields.b bVar, State state) {
            return State.b(state, null, receiveDocumentSpecifiedAddressFields, (bVar instanceof ReceiveDocumentSpecifiedAddressFields.b.EnumC3526a ? (ReceiveDocumentSpecifiedAddressFields.b.EnumC3526a) bVar : null) != null ? new d60.j(bVar) : null, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields, State state) {
            return State.b(state, null, receiveDocumentSpecifiedAddressFields, null, 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
        
            if (r5.F(r6, r7) == r2) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f116150h
                l51.a$d r0 = (l51.a.OnValidated) r0
                java.lang.Object r1 = r7.f116151j
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f116149g
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2f
                if (r3 == r5) goto L2b
                if (r3 != r4) goto L23
                java.lang.Object r0 = r7.f116148f
                st3.k r0 = (st3.k) r0
                java.lang.Object r0 = r7.f116147e
                o51.a r0 = (o51.ReceiveDocumentSpecifiedAddressFields) r0
                oq.u.b(r8)
                goto Lbc
            L23:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2b:
                oq.u.b(r8)
                goto L4b
            L2f:
                oq.u.b(r8)
                l51.p r8 = l51.p.this
                java.lang.Object r3 = r1.a()
                l51.b r3 = (l51.State) r3
                o51.a r3 = r3.getFields()
                r7.f116150h = r0
                r7.f116151j = r1
                r7.f116149g = r5
                java.lang.Object r8 = l51.p.r9(r8, r3, r7)
                if (r8 != r2) goto L4b
                goto Lbb
            L4b:
                o51.a r8 = (o51.ReceiveDocumentSpecifiedAddressFields) r8
                boolean r3 = r8.g()
                if (r3 != 0) goto L61
                o51.a$b r0 = r8.d()
                l51.q r2 = new l51.q
                r2.<init>()
                k10.l r8 = r1.b(r2)
                return r8
            L61:
                st3.k r3 = r0.getAddressResult()
                boolean r5 = r3 instanceof st3.k.ValidWithResult
                if (r5 == 0) goto L8f
                l51.p r0 = l51.p.this
                m51.a r0 = l51.p.n9(r0)
                l51.p r2 = l51.p.this
                st3.k$b r3 = (st3.k.ValidWithResult) r3
                st3.b r3 = r3.getAddressData()
                g51.a r2 = l51.p.k9(r2, r8, r3)
                r0.F0(r2)
                l51.p r0 = l51.p.this
                l51.a$b$c r2 = l51.a.b.c.f116088a
                l51.p.m9(r0, r2)
                l51.r r0 = new l51.r
                r0.<init>()
                k10.l r8 = r1.b(r0)
                return r8
            L8f:
                java.lang.Object r5 = r1.a()
                l51.b r5 = (l51.State) r5
                st3.g r5 = r5.getAddressFormVMS()
                xw.b r5 = r5.e()
                st3.g$a$b r6 = st3.g.a.b.f184305a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f116150h = r0
                r7.f116151j = r1
                java.lang.Object r8 = vq.j.a(r8)
                r7.f116147e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f116148f = r8
                r7.f116149g = r4
                java.lang.Object r8 = r5.F(r6, r7)
                if (r8 != r2) goto Lbc
            Lbb:
                return r2
            Lbc:
                k10.l r8 = r1.c()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: l51.p.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(l51.a.OnValidated onValidated, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f116150h = onValidated;
            dVar.f116151j = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll51/a$c;", "<unused var>", "Ll51/b;", "state", "Loq/i0;", "<anonymous>", "(Ll51/a$c;Ll51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<l51.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116154f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f116154f;
            Object objE = uq.b.e();
            int i15 = this.f116153e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = state.getAddressFormVMS().e();
                st3.g.a.c cVar = st3.g.a.c.f184306a;
                this.f116154f = vq.j.a(state);
                this.f116153e = 1;
                if (bVarE.F(cVar, this) == objE) {
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
        public final Object w(l51.a.c cVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f116154f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst3/g$b;", "event", "Ll51/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst3/g$b;Ll51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<st3.g.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116156f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            st3.g.b bVar = (st3.g.b) this.f116156f;
            uq.b.e();
            if (this.f116155e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(bVar, st3.g.b.a.f184307a)) {
                p.this.d9(l51.a.b.C2804a.f116086a);
            } else if (bVar instanceof st3.g.b.GoToError) {
                p.this.d9(new l51.a.b.ShowError(((st3.g.b.GoToError) bVar).getErrorData()));
            } else if (bVar instanceof st3.g.b.GoToSearch) {
                p.this.d9(new l51.a.b.ShowSearch(((st3.g.b.GoToSearch) bVar).getModel()));
            } else {
                if (!(bVar instanceof st3.g.b.Validated)) {
                    throw new oq.p();
                }
                p.this.d9(new l51.a.OnValidated(((st3.g.b.Validated) bVar).getAddressResult()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.b bVar, State state, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f116156f = bVar;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll51/a$a;", "action", "Lk10/c0;", "Ll51/b;", "state", "Lk10/l;", "<anonymous>", "(Ll51/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<l51.a.EditFieldsData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116160g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(l51.a.EditFieldsData editFieldsData, State state) {
            ReceiveDocumentSpecifiedAddressFields fields = editFieldsData.getFields();
            ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput nameFieldData = editFieldsData.getFields().getNameFieldData();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return State.b(state, null, fields.a(ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(nameFieldData, c2039b, null, null, 6, null), ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(editFieldsData.getFields().getSurnameFieldData(), c2039b, null, null, 6, null)), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l51.a.EditFieldsData editFieldsData = (l51.a.EditFieldsData) this.f116159f;
            c0 c0Var = (c0) this.f116160g;
            Object objE = uq.b.e();
            int i15 = this.f116158e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = ((State) c0Var.a()).getAddressFormVMS().e();
                st3.g.a.C4759a c4759a = st3.g.a.C4759a.f184304a;
                this.f116159f = editFieldsData;
                this.f116160g = c0Var;
                this.f116158e = 1;
                if (bVarE.F(c4759a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: l51.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O(editFieldsData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l51.a.EditFieldsData editFieldsData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f116159f = editFieldsData;
            gVar.f116160g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116165h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f116166j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f116168l;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116166j = obj;
            this.f116168l |= PKIFailureInfo.systemUnavail;
            return p.this.C9(null, this);
        }
    }

    public p(yy.a aVar, st3.h hVar, n51.c cVar, q31.c cVar2, cx.a aVar2, o31.g gVar, o31.h hVar2, m51.a aVar3) {
        this.addressFormVMSFactory = hVar;
        this.mapper = cVar;
        this.exitDialogMapper = cVar2;
        this.eventThrottler = aVar2;
        this.validateNameUC = gVar;
        this.validateSurnameUC = hVar2;
        this.contract = aVar3;
        State stateU9 = u9();
        this.initialState = stateU9;
        this.stateMachine = aVar.a(stateU9, new er.l() { // from class: l51.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f116115a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), v9(stateU9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(l51.a.b.class), oVar, bVar);
        zVar.x(q0.c(l51.a.e.class), oVar, pVar.new c(null));
        zVar.v(q0.c(l51.a.OnValidated.class), oVar, pVar.new d(null));
        zVar.x(q0.c(l51.a.c.class), oVar, new e(null));
        k10.k.r(zVar, new er.l() { // from class: l51.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9((State) obj);
            }
        }, null, pVar.new f(null), 2, null);
        zVar.v(q0.c(l51.a.EditFieldsData.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g B9(State state) {
        return state.getAddressFormVMS().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C9(ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields, tq.e<? super ReceiveDocumentSpecifiedAddressFields> eVar) throws Throwable {
        h hVar;
        ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput nameFieldData;
        hz.b.Companion companion;
        Object objE;
        ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields2;
        ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput textInputC;
        ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput textInput;
        ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields3;
        hz.b.Companion companion2;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f116168l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f116168l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f116166j;
        Object objE2 = uq.b.e();
        int i16 = hVar.f116168l;
        if (i16 == 0) {
            oq.u.b(obj);
            nameFieldData = receiveDocumentSpecifiedAddressFields.getNameFieldData();
            companion = hz.b.INSTANCE;
            o31.g gVar = this.validateNameUC;
            o31.g.Params params = new o31.g.Params(receiveDocumentSpecifiedAddressFields.getNameFieldData().getValue(), false, null, 6, null);
            hVar.f116161d = receiveDocumentSpecifiedAddressFields;
            hVar.f116162e = receiveDocumentSpecifiedAddressFields;
            hVar.f116163f = nameFieldData;
            hVar.f116164g = companion;
            hVar.f116168l = 1;
            objE = gVar.e(params, hVar);
            if (objE != objE2) {
                receiveDocumentSpecifiedAddressFields2 = receiveDocumentSpecifiedAddressFields;
            }
            return objE2;
        }
        if (i16 == 1) {
            hz.b.Companion companion3 = (hz.b.Companion) hVar.f116164g;
            nameFieldData = (ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput) hVar.f116163f;
            ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields4 = (ReceiveDocumentSpecifiedAddressFields) hVar.f116162e;
            receiveDocumentSpecifiedAddressFields2 = (ReceiveDocumentSpecifiedAddressFields) hVar.f116161d;
            oq.u.b(obj);
            companion = companion3;
            receiveDocumentSpecifiedAddressFields = receiveDocumentSpecifiedAddressFields4;
            objE = obj;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion2 = (hz.b.Companion) hVar.f116165h;
            ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput textInput2 = (ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput) hVar.f116164g;
            textInputC = (ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput) hVar.f116163f;
            ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields5 = (ReceiveDocumentSpecifiedAddressFields) hVar.f116162e;
            oq.u.b(obj);
            textInput = textInput2;
            receiveDocumentSpecifiedAddressFields3 = receiveDocumentSpecifiedAddressFields5;
        }
        return receiveDocumentSpecifiedAddressFields3.a(textInputC, ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(textInput, companion2.a((hz.g) obj), null, null, 6, null));
        textInputC = ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(nameFieldData, companion.a((hz.g) objE), null, null, 6, null);
        ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput surnameFieldData = receiveDocumentSpecifiedAddressFields2.getSurnameFieldData();
        hz.b.Companion companion4 = hz.b.INSTANCE;
        o31.h hVar2 = this.validateSurnameUC;
        o31.h.Params params2 = new o31.h.Params(receiveDocumentSpecifiedAddressFields2.getSurnameFieldData().getValue());
        hVar.f116161d = vq.j.a(receiveDocumentSpecifiedAddressFields2);
        hVar.f116162e = receiveDocumentSpecifiedAddressFields;
        hVar.f116163f = textInputC;
        hVar.f116164g = surnameFieldData;
        hVar.f116165h = companion4;
        hVar.f116168l = 2;
        Object objD = hVar2.d(params2, hVar);
        if (objD != objE2) {
            textInput = surnameFieldData;
            obj = objD;
            receiveDocumentSpecifiedAddressFields3 = receiveDocumentSpecifiedAddressFields;
            companion2 = companion4;
            return receiveDocumentSpecifiedAddressFields3.a(textInputC, ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(textInput, companion2.a((hz.g) obj), null, null, 6, null));
        }
        return objE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveDocumentAddressData s9(ReceiveDocumentSpecifiedAddressFields fields, AddressData address) {
        return new ReceiveDocumentAddressData(fields.getNameFieldData().getValue(), fields.getSurnameFieldData().getValue(), address);
    }

    private final State u9() {
        State stateX9;
        ReceiveDocumentAddressData receiveDocumentAddressDataQ = this.contract.Q();
        return (receiveDocumentAddressDataQ == null || (stateX9 = x9(receiveDocumentAddressDataQ)) == null) ? new State(this.addressFormVMSFactory.a(new AddressFormVMSSetupData(AddressFormVMSSetupData.b.C4761b.f184325a, false, null, 2, null)), new ReceiveDocumentSpecifiedAddressFields(null, null, 3, null), null, 4, null) : stateX9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l51.c.Data v9(State state) {
        return this.mapper.b(new n51.c.Params(state, new er.l() { // from class: l51.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f116114a, (ReceiveDocumentSpecifiedAddressFields) obj);
            }
        }, b9(l51.a.c.f116092a), b9(l51.a.e.f116094a), b9(l51.a.b.C2804a.f116086a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields) {
        pVar.d9(new l51.a.EditFieldsData(receiveDocumentSpecifiedAddressFields));
        return i0.f148189a;
    }

    private final State x9(ReceiveDocumentAddressData data) {
        st3.g gVarA = this.addressFormVMSFactory.a(new AddressFormVMSSetupData(AddressFormVMSSetupData.b.C4761b.f184325a, false, st3.j.a(data.getAddress()), 2, null));
        ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields = new ReceiveDocumentSpecifiedAddressFields(null, null, 3, null);
        return new State(gVarA, receiveDocumentSpecifiedAddressFields.a(ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(receiveDocumentSpecifiedAddressFields.getNameFieldData(), null, data.getName(), null, 5, null), ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(receiveDocumentSpecifiedAddressFields.getSurnameFieldData(), null, data.getSurname(), null, 5, null)), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: l51.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f116113a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<l51.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, l51.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l51.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(l51.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m51.a aVar) {
        super.P5(aVar);
    }
}
