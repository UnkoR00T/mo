package wh3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xw.PhoneNumber;
import zh3.CompanyFieldsData;
import zh3.CompanyOwner;
import zh3.PersonFieldsData;
import zh3.PhysicalOwner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u0002*\u00020\u0002H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u0017*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\"H\u0082@¢\u0006\u0004\b%\u0010$J,\u0010+\u001a\u00020\"2\u0006\u0010'\u001a\u00020&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(H\u0082@¢\u0006\u0004\b+\u0010,J$\u0010.\u001a\u00020\"2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0(H\u0082@¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u000200*\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030@8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010R\u001a\b\u0012\u0004\u0012\u0002000M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lwh3/q0;", "Ll00/g;", "Lwh3/p;", "", "Lwh3/q;", "Lyy/a;", "stateMachineFactory", "Lyh3/j;", "mapper", "Lae3/e0;", "validVehicleOwnershipDataUC", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/a;", "checkEmailCorrectUC", "Lxh3/a;", "contract", "<init>", "(Lyy/a;Lyh3/j;Lae3/e0;Lj14/n;Lj14/a;Lxh3/a;)V", "validatedState", "Ld60/j;", "I9", "(Lwh3/p;)Ld60/j;", "", "M9", "(Lwh3/p;)Z", "K9", "(Lwh3/p;)Lwh3/p;", "ha", "(Lwh3/p;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "other", "L9", "(Liy/b0;Liy/b0;)Z", "Loq/i0;", "G9", "(Ltq/e;)Ljava/lang/Object;", "Y9", "Ltv0/l$c$c;", "physicalOwnerType", "Lkotlin/Function1;", "Ltv0/l$c$b;", "update", "fa", "(Ltv0/l$c$c;Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltv0/l$b;", "da", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Lwh3/q$a;", "N9", "(Lwh3/p;)Lwh3/q$a;", "b", "Lyh3/j;", "c", "Lae3/e0;", "d", "Lj14/n;", "e", "Lj14/a;", "f", "Lxh3/a;", "g", "Lwh3/p;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwh3/c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 extends l00.g<State, Object> implements wh3.q, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yh3.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae3.e0 validVehicleOwnershipDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xh3.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wh3.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<wh3.q.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<wh3.q.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f213466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q0 f213467b;

        /* JADX INFO: renamed from: wh3.q0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5639a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f213468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q0 f213469b;

            /* JADX INFO: renamed from: wh3.q0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5640a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f213470d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f213471e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f213472f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f213474h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f213475j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f213476k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f213477l;

                public C5640a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f213470d = obj;
                    this.f213471e |= PKIFailureInfo.systemUnavail;
                    return C5639a.this.F(null, this);
                }
            }

            public C5639a(mu.h hVar, q0 q0Var) {
                this.f213468a = hVar;
                this.f213469b = q0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5640a c5640a;
                if (eVar instanceof C5640a) {
                    c5640a = (C5640a) eVar;
                    int i15 = c5640a.f213471e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5640a.f213471e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5640a = new C5640a(eVar);
                    }
                } else {
                    c5640a = new C5640a(eVar);
                }
                Object obj2 = c5640a.f213470d;
                Object objE = uq.b.e();
                int i16 = c5640a.f213471e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f213468a;
                    wh3.q.Data dataN9 = this.f213469b.N9((State) obj);
                    c5640a.f213472f = vq.j.a(obj);
                    c5640a.f213474h = vq.j.a(c5640a);
                    c5640a.f213475j = vq.j.a(obj);
                    c5640a.f213476k = vq.j.a(hVar);
                    c5640a.f213477l = 0;
                    c5640a.f213471e = 1;
                    if (hVar.F(dataN9, c5640a) == objE) {
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

        public a(mu.g gVar, q0 q0Var) {
            this.f213466a = gVar;
            this.f213467b = q0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super wh3.q.Data> hVar, tq.e eVar) {
            Object objA = this.f213466a.a(new C5639a(hVar, this.f213467b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/l;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<OnPhysicalOwnerPhoneNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213480g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.PhysicalOwner.PersonData V(OnPhysicalOwnerPhoneNumberChanged onPhysicalOwnerPhoneNumberChanged, tv0.l.PhysicalOwner.PersonData personData) {
            return tv0.l.PhysicalOwner.PersonData.b(personData, null, null, PhoneNumber.e(personData.getPhoneNumber(), null, PhoneNumber.b.c(onPhysicalOwnerPhoneNumberChanged.getNumber()), 1, null), null, 11, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(OnPhysicalOwnerPhoneNumberChanged onPhysicalOwnerPhoneNumberChanged, State state) {
            Map mapW = pq.v0.w(state.d());
            PersonFieldsData personFieldsData = (PersonFieldsData) mapW.get(onPhysicalOwnerPhoneNumberChanged.getPhysicalOwnerType());
            if (personFieldsData != null) {
                mapW.put(onPhysicalOwnerPhoneNumberChanged.getPhysicalOwnerType(), PersonFieldsData.b(personFieldsData, null, null, null, PersonFieldsData.Data.b(personFieldsData.getPhoneNumberField(), hz.b.C2039b.f86846c, null, 2, null), null, 23, null));
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return State.b(state, null, mapW, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhysicalOwnerPhoneNumberChanged onPhysicalOwnerPhoneNumberChanged = (OnPhysicalOwnerPhoneNumberChanged) this.f213479f;
            k10.c0 c0Var = (k10.c0) this.f213480g;
            Object objE = uq.b.e();
            int i15 = this.f213478e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                tv0.l.PhysicalOwner.EnumC5029c physicalOwnerType = onPhysicalOwnerPhoneNumberChanged.getPhysicalOwnerType();
                er.l lVar = new er.l() { // from class: wh3.r0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.b.V(onPhysicalOwnerPhoneNumberChanged, (tv0.l.PhysicalOwner.PersonData) obj2);
                    }
                };
                this.f213479f = onPhysicalOwnerPhoneNumberChanged;
                this.f213480g = c0Var;
                this.f213478e = 1;
                if (q0Var.fa(physicalOwnerType, lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.b.X(onPhysicalOwnerPhoneNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhysicalOwnerPhoneNumberChanged onPhysicalOwnerPhoneNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = q0.this.new b(eVar);
            bVar.f213479f = onPhysicalOwnerPhoneNumberChanged;
            bVar.f213480g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/j;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnPhysicalOwnerEmailChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213484g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.PhysicalOwner.PersonData V(OnPhysicalOwnerEmailChanged onPhysicalOwnerEmailChanged, tv0.l.PhysicalOwner.PersonData personData) {
            return tv0.l.PhysicalOwner.PersonData.b(personData, null, null, null, onPhysicalOwnerEmailChanged.getEmail(), 7, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(OnPhysicalOwnerEmailChanged onPhysicalOwnerEmailChanged, State state) {
            Map mapW = pq.v0.w(state.d());
            PersonFieldsData personFieldsData = (PersonFieldsData) mapW.get(onPhysicalOwnerEmailChanged.getPhysicalOwnerType());
            if (personFieldsData != null) {
                mapW.put(onPhysicalOwnerEmailChanged.getPhysicalOwnerType(), PersonFieldsData.b(personFieldsData, null, null, null, null, PersonFieldsData.Data.b(personFieldsData.getEmailField(), hz.b.C2039b.f86846c, null, 2, null), 15, null));
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return State.b(state, null, mapW, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhysicalOwnerEmailChanged onPhysicalOwnerEmailChanged = (OnPhysicalOwnerEmailChanged) this.f213483f;
            k10.c0 c0Var = (k10.c0) this.f213484g;
            Object objE = uq.b.e();
            int i15 = this.f213482e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                tv0.l.PhysicalOwner.EnumC5029c physicalOwnerType = onPhysicalOwnerEmailChanged.getPhysicalOwnerType();
                er.l lVar = new er.l() { // from class: wh3.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.c.V(onPhysicalOwnerEmailChanged, (tv0.l.PhysicalOwner.PersonData) obj2);
                    }
                };
                this.f213483f = onPhysicalOwnerEmailChanged;
                this.f213484g = c0Var;
                this.f213482e = 1;
                if (q0Var.fa(physicalOwnerType, lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.c.X(onPhysicalOwnerEmailChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhysicalOwnerEmailChanged onPhysicalOwnerEmailChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = q0.this.new c(eVar);
            cVar.f213483f = onPhysicalOwnerEmailChanged;
            cVar.f213484g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/e;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnCompanyNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213488g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.CompanyOwner V(OnCompanyNameChanged onCompanyNameChanged, tv0.l.CompanyOwner companyOwner) {
            return tv0.l.CompanyOwner.b(companyOwner, onCompanyNameChanged.getName(), null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, CompanyFieldsData.b(state.getCompanyOwnerFieldsData(), CompanyFieldsData.Data.b(state.getCompanyOwnerFieldsData().getNameField(), hz.b.C2039b.f86846c, null, 2, null), null, null, null, 14, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyNameChanged onCompanyNameChanged = (OnCompanyNameChanged) this.f213487f;
            k10.c0 c0Var = (k10.c0) this.f213488g;
            Object objE = uq.b.e();
            int i15 = this.f213486e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                er.l lVar = new er.l() { // from class: wh3.v0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.d.V(onCompanyNameChanged, (tv0.l.CompanyOwner) obj2);
                    }
                };
                this.f213487f = vq.j.a(onCompanyNameChanged);
                this.f213488g = c0Var;
                this.f213486e = 1;
                if (q0Var.da(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.d.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyNameChanged onCompanyNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = q0.this.new d(eVar);
            dVar.f213487f = onCompanyNameChanged;
            dVar.f213488g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/g;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnCompanyPhonePrefixChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213492g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.CompanyOwner V(OnCompanyPhonePrefixChanged onCompanyPhonePrefixChanged, tv0.l.CompanyOwner companyOwner) {
            return tv0.l.CompanyOwner.b(companyOwner, null, PhoneNumber.e(companyOwner.getPhoneNumber(), PhoneNumber.c.c(onCompanyPhonePrefixChanged.getPrefix()), null, 2, null), null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, CompanyFieldsData.b(state.getCompanyOwnerFieldsData(), null, CompanyFieldsData.Data.b(state.getCompanyOwnerFieldsData().getPhonePrefixField(), hz.b.C2039b.f86846c, null, 2, null), null, null, 13, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyPhonePrefixChanged onCompanyPhonePrefixChanged = (OnCompanyPhonePrefixChanged) this.f213491f;
            k10.c0 c0Var = (k10.c0) this.f213492g;
            Object objE = uq.b.e();
            int i15 = this.f213490e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                er.l lVar = new er.l() { // from class: wh3.x0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.e.V(onCompanyPhonePrefixChanged, (tv0.l.CompanyOwner) obj2);
                    }
                };
                this.f213491f = vq.j.a(onCompanyPhonePrefixChanged);
                this.f213492g = c0Var;
                this.f213490e = 1;
                if (q0Var.da(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.e.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyPhonePrefixChanged onCompanyPhonePrefixChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = q0.this.new e(eVar);
            eVar2.f213491f = onCompanyPhonePrefixChanged;
            eVar2.f213492g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/f;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnCompanyPhoneNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213496g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.CompanyOwner V(OnCompanyPhoneNumberChanged onCompanyPhoneNumberChanged, tv0.l.CompanyOwner companyOwner) {
            return tv0.l.CompanyOwner.b(companyOwner, null, PhoneNumber.e(companyOwner.getPhoneNumber(), null, PhoneNumber.b.c(onCompanyPhoneNumberChanged.getNumber()), 1, null), null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, CompanyFieldsData.b(state.getCompanyOwnerFieldsData(), null, null, CompanyFieldsData.Data.b(state.getCompanyOwnerFieldsData().getPhoneNumberField(), hz.b.C2039b.f86846c, null, 2, null), null, 11, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyPhoneNumberChanged onCompanyPhoneNumberChanged = (OnCompanyPhoneNumberChanged) this.f213495f;
            k10.c0 c0Var = (k10.c0) this.f213496g;
            Object objE = uq.b.e();
            int i15 = this.f213494e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                er.l lVar = new er.l() { // from class: wh3.z0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.f.V(onCompanyPhoneNumberChanged, (tv0.l.CompanyOwner) obj2);
                    }
                };
                this.f213495f = vq.j.a(onCompanyPhoneNumberChanged);
                this.f213496g = c0Var;
                this.f213494e = 1;
                if (q0Var.da(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.f.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyPhoneNumberChanged onCompanyPhoneNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = q0.this.new f(eVar);
            fVar.f213495f = onCompanyPhoneNumberChanged;
            fVar.f213496g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/d;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnCompanyEmailChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213500g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.CompanyOwner V(OnCompanyEmailChanged onCompanyEmailChanged, tv0.l.CompanyOwner companyOwner) {
            return tv0.l.CompanyOwner.b(companyOwner, null, null, onCompanyEmailChanged.getEmail(), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, CompanyFieldsData.b(state.getCompanyOwnerFieldsData(), null, null, null, CompanyFieldsData.Data.b(state.getCompanyOwnerFieldsData().getEmailField(), hz.b.C2039b.f86846c, null, 2, null), 7, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyEmailChanged onCompanyEmailChanged = (OnCompanyEmailChanged) this.f213499f;
            k10.c0 c0Var = (k10.c0) this.f213500g;
            Object objE = uq.b.e();
            int i15 = this.f213498e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                er.l lVar = new er.l() { // from class: wh3.b1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.g.V(onCompanyEmailChanged, (tv0.l.CompanyOwner) obj2);
                    }
                };
                this.f213499f = vq.j.a(onCompanyEmailChanged);
                this.f213500g = c0Var;
                this.f213498e = 1;
                if (q0Var.da(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.g.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyEmailChanged onCompanyEmailChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = q0.this.new g(eVar);
            gVar.f213499f = onCompanyEmailChanged;
            gVar.f213500g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/i;", "<unused var>", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<wh3.i, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213504g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, q0 q0Var, State state2) {
            return State.b(state, null, null, null, q0Var.I9(state), 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        
            if (r2.F(r4, r5) == r1) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f213504g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f213503f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r5.f213502e
                wh3.p r1 = (wh3.State) r1
                oq.u.b(r6)
                goto L6b
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L3c
            L26:
                oq.u.b(r6)
                wh3.q0 r6 = wh3.q0.this
                java.lang.Object r2 = r0.a()
                wh3.p r2 = (wh3.State) r2
                r5.f213504g = r0
                r5.f213503f = r4
                java.lang.Object r6 = wh3.q0.F9(r6, r2, r5)
                if (r6 != r1) goto L3c
                goto L6a
            L3c:
                wh3.p r6 = (wh3.State) r6
                wh3.q0 r2 = wh3.q0.this
                boolean r2 = wh3.q0.A9(r2, r6)
                if (r2 != 0) goto L52
                wh3.q0 r1 = wh3.q0.this
                wh3.d1 r2 = new wh3.d1
                r2.<init>()
                k10.l r6 = r0.b(r2)
                return r6
            L52:
                wh3.q0 r2 = wh3.q0.this
                xw.b r2 = r2.Y1()
                wh3.c$c r4 = wh3.c.C5638c.f213393a
                r5.f213504g = r0
                java.lang.Object r6 = vq.j.a(r6)
                r5.f213502e = r6
                r5.f213503f = r3
                java.lang.Object r6 = r2.F(r4, r5)
                if (r6 != r1) goto L6b
            L6a:
                return r1
            L6b:
                k10.l r6 = r0.c()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wh3.q0.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wh3.i iVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = q0.this.new h(eVar);
            hVar.f213504g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwh3/c;", "action", "Lwh3/p;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwh3/c;Lwh3/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<wh3.c, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213507f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wh3.c cVar = (wh3.c) this.f213507f;
            Object objE = uq.b.e();
            int i15 = this.f213506e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                this.f213507f = vq.j.a(cVar);
                this.f213506e = 1;
                if (q0Var.F(cVar, this) == objE) {
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
        public final Object w(wh3.c cVar, State state, tq.e<? super oq.i0> eVar) {
            i iVar = q0.this.new i(eVar);
            iVar.f213507f = cVar;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv0/l;", "vehicleOwnerDetails", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Ltv0/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<tv0.l, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213511g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(q0 q0Var, tv0.l lVar, State state) {
            if (lVar == null) {
                lVar = new tv0.l.PhysicalOwner(null, 1, null);
            }
            return q0Var.K9(State.b(state, lVar, null, null, null, 6, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final tv0.l lVar = (tv0.l) this.f213510f;
            k10.c0 c0Var = (k10.c0) this.f213511g;
            uq.b.e();
            if (this.f213509e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q0 q0Var = q0.this;
            return c0Var.b(new er.l() { // from class: wh3.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.j.O(q0Var, lVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(tv0.l lVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = q0.this.new j(eVar);
            jVar.f213510f = lVar;
            jVar.f213511g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwh3/b;", "<unused var>", "Lwh3/p;", "Loq/i0;", "<anonymous>", "(Lwh3/b;Lwh3/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<wh3.b, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213513e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f213513e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wh3.c> bVarY1 = q0.this.Y1();
                wh3.c.a aVar = wh3.c.a.f213391a;
                this.f213513e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(wh3.b bVar, State state, tq.e<? super oq.i0> eVar) {
            return q0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwh3/a;", "<unused var>", "Lwh3/p;", "Loq/i0;", "<anonymous>", "(Lwh3/a;Lwh3/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<wh3.a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213515e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f213515e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                this.f213515e = 1;
                if (q0Var.G9(this) == objE) {
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
        public final Object w(wh3.a aVar, State state, tq.e<? super oq.i0> eVar) {
            return q0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwh3/o;", "<unused var>", "Lwh3/p;", "Loq/i0;", "<anonymous>", "(Lwh3/o;Lwh3/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<wh3.o, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213517e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f213517e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                this.f213517e = 1;
                if (q0Var.Y9(this) == objE) {
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
        public final Object w(wh3.o oVar, State state, tq.e<? super oq.i0> eVar) {
            return q0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwh3/h;", "action", "Lwh3/p;", "state", "Loq/i0;", "<anonymous>", "(Lwh3/h;Lwh3/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<OnControllersSwitchChanged, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f213522h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f213524a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f213524a = iArr;
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tv0.l physicalOwner;
            OnControllersSwitchChanged onControllersSwitchChanged = (OnControllersSwitchChanged) this.f213521g;
            State state = (State) this.f213522h;
            Object objE = uq.b.e();
            int i15 = this.f213520f;
            if (i15 == 0) {
                oq.u.b(obj);
                int i16 = a.f213524a[onControllersSwitchChanged.getSwitchType().ordinal()];
                if (i16 == 1) {
                    physicalOwner = new tv0.l.PhysicalOwner(null, 1, null);
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    physicalOwner = new tv0.l.CompanyOwner(null, null, null, 7, null);
                }
                if (state.getVehicleOwnerDetails().getClass() == physicalOwner.getClass()) {
                    return oq.i0.f148189a;
                }
                xh3.a aVar = q0.this.contract;
                this.f213521g = vq.j.a(onControllersSwitchChanged);
                this.f213522h = vq.j.a(state);
                this.f213519e = vq.j.a(physicalOwner);
                this.f213520f = 1;
                if (aVar.e8(physicalOwner, this) == objE) {
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
        public final Object w(OnControllersSwitchChanged onControllersSwitchChanged, State state, tq.e<? super oq.i0> eVar) {
            n nVar = q0.this.new n(eVar);
            nVar.f213521g = onControllersSwitchChanged;
            nVar.f213522h = state;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/k;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<OnPhysicalOwnerNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213527g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.PhysicalOwner.PersonData V(OnPhysicalOwnerNameChanged onPhysicalOwnerNameChanged, tv0.l.PhysicalOwner.PersonData personData) {
            return tv0.l.PhysicalOwner.PersonData.b(personData, onPhysicalOwnerNameChanged.getName(), null, null, null, 14, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(OnPhysicalOwnerNameChanged onPhysicalOwnerNameChanged, State state) {
            Map mapW = pq.v0.w(state.d());
            PersonFieldsData personFieldsData = (PersonFieldsData) mapW.get(onPhysicalOwnerNameChanged.getPhysicalOwnerType());
            if (personFieldsData != null) {
                mapW.put(onPhysicalOwnerNameChanged.getPhysicalOwnerType(), PersonFieldsData.b(personFieldsData, PersonFieldsData.Data.b(personFieldsData.getNameField(), hz.b.C2039b.f86846c, null, 2, null), null, null, null, null, 30, null));
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return State.b(state, null, mapW, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhysicalOwnerNameChanged onPhysicalOwnerNameChanged = (OnPhysicalOwnerNameChanged) this.f213526f;
            k10.c0 c0Var = (k10.c0) this.f213527g;
            Object objE = uq.b.e();
            int i15 = this.f213525e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                tv0.l.PhysicalOwner.EnumC5029c physicalOwnerType = onPhysicalOwnerNameChanged.getPhysicalOwnerType();
                er.l lVar = new er.l() { // from class: wh3.f1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.o.V(onPhysicalOwnerNameChanged, (tv0.l.PhysicalOwner.PersonData) obj2);
                    }
                };
                this.f213526f = onPhysicalOwnerNameChanged;
                this.f213527g = c0Var;
                this.f213525e = 1;
                if (q0Var.fa(physicalOwnerType, lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.o.X(onPhysicalOwnerNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhysicalOwnerNameChanged onPhysicalOwnerNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = q0.this.new o(eVar);
            oVar.f213526f = onPhysicalOwnerNameChanged;
            oVar.f213527g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/n;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<OnPhysicalOwnerSurnameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213531g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.PhysicalOwner.PersonData V(OnPhysicalOwnerSurnameChanged onPhysicalOwnerSurnameChanged, tv0.l.PhysicalOwner.PersonData personData) {
            return tv0.l.PhysicalOwner.PersonData.b(personData, null, onPhysicalOwnerSurnameChanged.getSurname(), null, null, 13, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(OnPhysicalOwnerSurnameChanged onPhysicalOwnerSurnameChanged, State state) {
            Map mapW = pq.v0.w(state.d());
            PersonFieldsData personFieldsData = (PersonFieldsData) mapW.get(onPhysicalOwnerSurnameChanged.getPhysicalOwnerType());
            if (personFieldsData != null) {
                mapW.put(onPhysicalOwnerSurnameChanged.getPhysicalOwnerType(), PersonFieldsData.b(personFieldsData, null, PersonFieldsData.Data.b(personFieldsData.getSurnameField(), hz.b.C2039b.f86846c, null, 2, null), null, null, null, 29, null));
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return State.b(state, null, mapW, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhysicalOwnerSurnameChanged onPhysicalOwnerSurnameChanged = (OnPhysicalOwnerSurnameChanged) this.f213530f;
            k10.c0 c0Var = (k10.c0) this.f213531g;
            Object objE = uq.b.e();
            int i15 = this.f213529e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                tv0.l.PhysicalOwner.EnumC5029c physicalOwnerType = onPhysicalOwnerSurnameChanged.getPhysicalOwnerType();
                er.l lVar = new er.l() { // from class: wh3.h1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.p.V(onPhysicalOwnerSurnameChanged, (tv0.l.PhysicalOwner.PersonData) obj2);
                    }
                };
                this.f213530f = onPhysicalOwnerSurnameChanged;
                this.f213531g = c0Var;
                this.f213529e = 1;
                if (q0Var.fa(physicalOwnerType, lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.p.X(onPhysicalOwnerSurnameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhysicalOwnerSurnameChanged onPhysicalOwnerSurnameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = q0.this.new p(eVar);
            pVar.f213530f = onPhysicalOwnerSurnameChanged;
            pVar.f213531g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwh3/m;", "action", "Lk10/c0;", "Lwh3/p;", "state", "Lk10/l;", "<anonymous>", "(Lwh3/m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<OnPhysicalOwnerPhonePrefixChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213535g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tv0.l.PhysicalOwner.PersonData V(OnPhysicalOwnerPhonePrefixChanged onPhysicalOwnerPhonePrefixChanged, tv0.l.PhysicalOwner.PersonData personData) {
            return tv0.l.PhysicalOwner.PersonData.b(personData, null, null, PhoneNumber.e(personData.getPhoneNumber(), PhoneNumber.c.c(onPhysicalOwnerPhonePrefixChanged.getPrefix()), null, 2, null), null, 11, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(OnPhysicalOwnerPhonePrefixChanged onPhysicalOwnerPhonePrefixChanged, State state) {
            Map mapW = pq.v0.w(state.d());
            PersonFieldsData personFieldsData = (PersonFieldsData) mapW.get(onPhysicalOwnerPhonePrefixChanged.getPhysicalOwnerType());
            if (personFieldsData != null) {
                mapW.put(onPhysicalOwnerPhonePrefixChanged.getPhysicalOwnerType(), PersonFieldsData.b(personFieldsData, null, null, PersonFieldsData.Data.b(personFieldsData.getPhonePrefixField(), hz.b.C2039b.f86846c, null, 2, null), null, null, 27, null));
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return State.b(state, null, mapW, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhysicalOwnerPhonePrefixChanged onPhysicalOwnerPhonePrefixChanged = (OnPhysicalOwnerPhonePrefixChanged) this.f213534f;
            k10.c0 c0Var = (k10.c0) this.f213535g;
            Object objE = uq.b.e();
            int i15 = this.f213533e;
            if (i15 == 0) {
                oq.u.b(obj);
                q0 q0Var = q0.this;
                tv0.l.PhysicalOwner.EnumC5029c physicalOwnerType = onPhysicalOwnerPhonePrefixChanged.getPhysicalOwnerType();
                er.l lVar = new er.l() { // from class: wh3.j1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q0.q.V(onPhysicalOwnerPhonePrefixChanged, (tv0.l.PhysicalOwner.PersonData) obj2);
                    }
                };
                this.f213534f = onPhysicalOwnerPhonePrefixChanged;
                this.f213535g = c0Var;
                this.f213533e = 1;
                if (q0Var.fa(physicalOwnerType, lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: wh3.k1
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.q.X(onPhysicalOwnerPhonePrefixChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhysicalOwnerPhonePrefixChanged onPhysicalOwnerPhonePrefixChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            q qVar = q0.this.new q(eVar);
            qVar.f213534f = onPhysicalOwnerPhonePrefixChanged;
            qVar.f213535g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {
        Object A;
        int B;
        int C;
        int D;
        int E;
        int F;
        boolean G;
        boolean H;
        /* synthetic */ Object I;
        int L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213541h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213542j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213543k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f213544l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f213545m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f213546n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f213547p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f213548q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f213549r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f213550s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f213551t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f213552v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f213553w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f213554x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f213555y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        Object f213556z;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.I = obj;
            this.L |= PKIFailureInfo.systemUnavail;
            return q0.this.ha(null, this);
        }
    }

    public q0(yy.a aVar, yh3.j jVar, ae3.e0 e0Var, j14.n nVar, j14.a aVar2, xh3.a aVar3) {
        this.mapper = jVar;
        this.validVehicleOwnershipDataUC = e0Var;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkEmailCorrectUC = aVar2;
        this.contract = aVar3;
        tv0.l lVarR5 = aVar3.R5();
        State stateK9 = K9(new State(lVarR5 == null ? new tv0.l.PhysicalOwner(null, 1, null) : lVarR5, null, null, null, 14, null));
        this.initialState = stateK9;
        this.stateMachine = aVar.a(stateK9, new er.l() { // from class: wh3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.ba(this.f213410a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), N9(stateK9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G9(tq.e<? super oq.i0> eVar) {
        Object objJ2 = this.contract.j2(new er.l() { // from class: wh3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.H9((tv0.l) obj);
            }
        }, eVar);
        return objJ2 == uq.b.e() ? objJ2 : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tv0.l H9(tv0.l lVar) {
        tv0.l.PhysicalOwner physicalOwnerB = tv0.l.INSTANCE.b(lVar);
        Map mapW = pq.v0.w(physicalOwnerB.c());
        mapW.put(tv0.l.PhysicalOwner.EnumC5029c.CO_OWNER, new tv0.l.PhysicalOwner.PersonData(null, null, null, null, 15, null));
        return physicalOwnerB.b(pq.v0.u(mapW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d60.j<Object> I9(State validatedState) {
        tv0.l vehicleOwnerDetails = validatedState.getVehicleOwnerDetails();
        if (!(vehicleOwnerDetails instanceof tv0.l.PhysicalOwner)) {
            if (!(vehicleOwnerDetails instanceof tv0.l.CompanyOwner)) {
                throw new oq.p();
            }
            CompanyFieldsData.EnumC6346b enumC6346bE = validatedState.getCompanyOwnerFieldsData().e();
            if (enumC6346bE != null) {
                return new d60.j<>(new CompanyOwner(enumC6346bE));
            }
            return null;
        }
        for (Map.Entry<tv0.l.PhysicalOwner.EnumC5029c, PersonFieldsData> entry : validatedState.d().entrySet()) {
            tv0.l.PhysicalOwner.EnumC5029c key = entry.getKey();
            PersonFieldsData.b bVarE = entry.getValue().e();
            if (bVarE != null) {
                return new d60.j<>(new PhysicalOwner(key, bVarE));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State K9(State state) {
        Map<tv0.l.PhysicalOwner.EnumC5029c, tv0.l.PhysicalOwner.PersonData> mapC;
        tv0.l vehicleOwnerDetails = state.getVehicleOwnerDetails();
        tv0.l.PhysicalOwner physicalOwner = vehicleOwnerDetails instanceof tv0.l.PhysicalOwner ? (tv0.l.PhysicalOwner) vehicleOwnerDetails : null;
        if (physicalOwner == null || (mapC = physicalOwner.c()) == null) {
            return state;
        }
        Map mapW = pq.v0.w(state.d());
        for (tv0.l.PhysicalOwner.EnumC5029c enumC5029c : mapC.keySet()) {
            if (!mapW.containsKey(enumC5029c)) {
                mapW.put(enumC5029c, new PersonFieldsData(null, null, null, null, null, 31, null));
            }
        }
        oq.i0 i0Var = oq.i0.f148189a;
        return State.b(state, null, mapW, null, null, 13, null);
    }

    private final boolean L9(iy.b0 b0Var, iy.b0 b0Var2) {
        return iy.c0.e(b0Var).length() == 0 && iy.c0.e(b0Var2).length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M9(State state) {
        if (!state.getCompanyOwnerFieldsData().i()) {
            return false;
        }
        Collection<PersonFieldsData> collectionValues = state.d().values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!((PersonFieldsData) it.next()).j()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wh3.q.Data N9(State state) {
        return this.mapper.b(new yh3.j.Params(state, new er.l() { // from class: wh3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.O9(this.f213387a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, b9(wh3.b.f213388a), b9(wh3.a.f213386a), b9(wh3.o.f213442a), new er.p() { // from class: wh3.h0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q0.P9(this.f213413a, (tv0.l.PhysicalOwner.EnumC5029c) obj, (iy.b0) obj2);
            }
        }, new er.p() { // from class: wh3.i0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q0.Q9(this.f213416a, (tv0.l.PhysicalOwner.EnumC5029c) obj, (iy.b0) obj2);
            }
        }, new er.p() { // from class: wh3.j0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q0.R9(this.f213421a, (tv0.l.PhysicalOwner.EnumC5029c) obj, (iy.b0) obj2);
            }
        }, new er.p() { // from class: wh3.k0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q0.S9(this.f213426a, (tv0.l.PhysicalOwner.EnumC5029c) obj, (iy.b0) obj2);
            }
        }, new er.p() { // from class: wh3.l0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q0.T9(this.f213431a, (tv0.l.PhysicalOwner.EnumC5029c) obj, (iy.b0) obj2);
            }
        }, new er.l() { // from class: wh3.m0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.U9(this.f213435a, (iy.b0) obj);
            }
        }, new er.l() { // from class: wh3.n0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.V9(this.f213440a, (iy.b0) obj);
            }
        }, new er.l() { // from class: wh3.o0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.W9(this.f213443a, (iy.b0) obj);
            }
        }, new er.l() { // from class: wh3.p0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.X9(this.f213448a, (iy.b0) obj);
            }
        }, b9(wh3.i.f213415a), b9(wh3.c.a.f213391a), b9(wh3.c.b.f213392a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(q0 q0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        q0Var.d9(new OnControllersSwitchChanged(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(q0 q0Var, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, iy.b0 b0Var) {
        q0Var.d9(new OnPhysicalOwnerNameChanged(enumC5029c, b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(q0 q0Var, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, iy.b0 b0Var) {
        q0Var.d9(new OnPhysicalOwnerSurnameChanged(enumC5029c, b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(q0 q0Var, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, iy.b0 b0Var) {
        q0Var.d9(new OnPhysicalOwnerPhonePrefixChanged(enumC5029c, b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(q0 q0Var, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, iy.b0 b0Var) {
        q0Var.d9(new OnPhysicalOwnerPhoneNumberChanged(enumC5029c, b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(q0 q0Var, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, iy.b0 b0Var) {
        q0Var.d9(new OnPhysicalOwnerEmailChanged(enumC5029c, b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(q0 q0Var, iy.b0 b0Var) {
        q0Var.d9(new OnCompanyNameChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(q0 q0Var, iy.b0 b0Var) {
        q0Var.d9(new OnCompanyPhonePrefixChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(q0 q0Var, iy.b0 b0Var) {
        q0Var.d9(new OnCompanyPhoneNumberChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(q0 q0Var, iy.b0 b0Var) {
        q0Var.d9(new OnCompanyEmailChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y9(tq.e<? super oq.i0> eVar) {
        Object objJ2 = this.contract.j2(new er.l() { // from class: wh3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.Z9((tv0.l) obj);
            }
        }, eVar);
        return objJ2 == uq.b.e() ? objJ2 : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tv0.l Z9(tv0.l lVar) {
        tv0.l.PhysicalOwner physicalOwnerB = tv0.l.INSTANCE.b(lVar);
        Map mapW = pq.v0.w(physicalOwnerB.c());
        mapW.remove(tv0.l.PhysicalOwner.EnumC5029c.CO_OWNER);
        return physicalOwnerB.b(pq.v0.u(mapW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(final q0 q0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: wh3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.ca(this.f213389a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(q0 q0Var, k10.z zVar) {
        i iVar = q0Var.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(wh3.c.class), oVar, iVar);
        k10.k.m(zVar, q0Var.contract.z5(), null, q0Var.new j(null), 2, null);
        zVar.x(fr.q0.c(wh3.b.class), oVar, q0Var.new k(null));
        zVar.x(fr.q0.c(wh3.a.class), oVar, q0Var.new l(null));
        zVar.x(fr.q0.c(wh3.o.class), oVar, q0Var.new m(null));
        zVar.x(fr.q0.c(OnControllersSwitchChanged.class), oVar, q0Var.new n(null));
        zVar.v(fr.q0.c(OnPhysicalOwnerNameChanged.class), oVar, q0Var.new o(null));
        zVar.v(fr.q0.c(OnPhysicalOwnerSurnameChanged.class), oVar, q0Var.new p(null));
        zVar.v(fr.q0.c(OnPhysicalOwnerPhonePrefixChanged.class), oVar, q0Var.new q(null));
        zVar.v(fr.q0.c(OnPhysicalOwnerPhoneNumberChanged.class), oVar, q0Var.new b(null));
        zVar.v(fr.q0.c(OnPhysicalOwnerEmailChanged.class), oVar, q0Var.new c(null));
        zVar.v(fr.q0.c(OnCompanyNameChanged.class), oVar, q0Var.new d(null));
        zVar.v(fr.q0.c(OnCompanyPhonePrefixChanged.class), oVar, q0Var.new e(null));
        zVar.v(fr.q0.c(OnCompanyPhoneNumberChanged.class), oVar, q0Var.new f(null));
        zVar.v(fr.q0.c(OnCompanyEmailChanged.class), oVar, q0Var.new g(null));
        zVar.v(fr.q0.c(wh3.i.class), oVar, q0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object da(final er.l<? super tv0.l.CompanyOwner, tv0.l.CompanyOwner> lVar, tq.e<? super oq.i0> eVar) {
        Object objJ2 = this.contract.j2(new er.l() { // from class: wh3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.ea(lVar, (tv0.l) obj);
            }
        }, eVar);
        return objJ2 == uq.b.e() ? objJ2 : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tv0.l ea(er.l lVar, tv0.l lVar2) {
        return (tv0.l) lVar.b(tv0.l.INSTANCE.a(lVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fa(final tv0.l.PhysicalOwner.EnumC5029c enumC5029c, final er.l<? super tv0.l.PhysicalOwner.PersonData, tv0.l.PhysicalOwner.PersonData> lVar, tq.e<? super oq.i0> eVar) {
        Object objJ2 = this.contract.j2(new er.l() { // from class: wh3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.ga(enumC5029c, lVar, (tv0.l) obj);
            }
        }, eVar);
        return objJ2 == uq.b.e() ? objJ2 : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tv0.l ga(tv0.l.PhysicalOwner.EnumC5029c enumC5029c, er.l lVar, tv0.l lVar2) {
        tv0.l.PhysicalOwner physicalOwnerB = tv0.l.INSTANCE.b(lVar2);
        Map mapW = pq.v0.w(physicalOwnerB.c());
        tv0.l.PhysicalOwner.PersonData personData = (tv0.l.PhysicalOwner.PersonData) mapW.get(enumC5029c);
        if (personData == null) {
            personData = new tv0.l.PhysicalOwner.PersonData(null, null, null, null, 15, null);
        }
        mapW.put(enumC5029c, lVar.b(personData));
        return physicalOwnerB.b(pq.v0.u(mapW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0463  */
    /* JADX WARN: Code duplicated, block: B:39:0x054c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0551  */
    /* JADX WARN: Code duplicated, block: B:44:0x0614  */
    /* JADX WARN: Code duplicated, block: B:47:0x0659  */
    /* JADX WARN: Code duplicated, block: B:48:0x0676 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0678  */
    /* JADX WARN: Code duplicated, block: B:51:0x070b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0710  */
    /* JADX WARN: Code duplicated, block: B:57:0x0791 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0793  */
    /* JADX WARN: Code duplicated, block: B:61:0x082c  */
    /* JADX WARN: Code duplicated, block: B:66:0x08a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x0945  */
    /* JADX WARN: Code duplicated, block: B:71:0x094a  */
    /* JADX WARN: Code duplicated, block: B:78:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0893 -> B:73:0x0971). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x094a -> B:72:0x095e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ha(wh3.State r43, tq.e<? super wh3.State> r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.q0.ha(wh3.p, tq.e):java.lang.Object");
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(wh3.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    public xw.b<wh3.c> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: aa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(xh3.a aVar) {
        super.P5(aVar);
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<wh3.q.Data> getState() {
        return this.state;
    }
}
