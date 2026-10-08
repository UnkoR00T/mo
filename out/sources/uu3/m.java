package uu3;

import fr.q0;
import iy.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ru3.ContactDetailsData;
import ru3.ContactDetailsFormData;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003088\u0014X\u0094\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010 \u001a\b\u0012\u0004\u0012\u00020!0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Luu3/m;", "Ll00/g;", "Luu3/b;", "Luu3/a;", "Luu3/c;", "Lru3/a;", "Lyy/a;", "stateMachineFactory", "Ltu3/a;", "getRdkUserDataWithLoaderUseCase", "Lc14/a;", "checkEmailCorrectUseCase", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lvu3/d;", "mapper", "Lmx/c;", "labelProvider", "Lru3/c;", "data", "<init>", "(Lyy/a;Ltu3/a;Lc14/a;Lj14/n;Lvu3/d;Lmx/c;Lru3/c;)V", "Lxw/h;", "phoneNumber", "Lhz/b;", "r9", "(Lxw/h;Ltq/e;)Ljava/lang/Object;", "q9", "Liy/b0;", "address", "p9", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "state", "Luu3/c$a;", "s9", "(Luu3/b;)Luu3/c$a;", "b", "Lc14/a;", "c", "Lj14/n;", "d", "Lvu3/d;", "e", "Lmx/c;", "f", "Lru3/c;", "g", "Luu3/b;", "initialState", "Lxw/b;", "Lru3/a$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "contactdetailsform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, uu3.a> implements uu3.c, ru3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c14.a checkEmailCorrectUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final vu3.d mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ContactDetailsFormData data;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ru3.a.AbstractC4497a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, uu3.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<uu3.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f201566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f201567e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f201569g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f201567e = obj;
            this.f201569g |= PKIFailureInfo.systemUnavail;
            return m.this.p9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f201570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f201571e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f201573g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f201571e = obj;
            this.f201573g |= PKIFailureInfo.systemUnavail;
            return m.this.q9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f201574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f201575e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f201577g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f201575e = obj;
            this.f201577g |= PKIFailureInfo.systemUnavail;
            return m.this.r9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<PhoneNumber.c, i0> {
        d() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(PhoneNumber.c cVar) {
            c(cVar.getValue());
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            m.this.d9(new uu3.a.OnPrefixChanged(b0Var, null));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<PhoneNumber.b, i0> {
        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(PhoneNumber.b bVar) {
            c(bVar.getValue());
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            m.this.d9(new uu3.a.OnPhoneNumberChanged(b0Var, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<uu3.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f201580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f201581b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f201582a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f201583b;

            /* JADX INFO: renamed from: uu3.m$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5235a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f201584d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f201585e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f201586f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f201588h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f201589j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f201590k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f201591l;

                public C5235a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f201584d = obj;
                    this.f201585e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f201582a = hVar;
                this.f201583b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5235a c5235a;
                if (eVar instanceof C5235a) {
                    c5235a = (C5235a) eVar;
                    int i15 = c5235a.f201585e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5235a.f201585e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5235a = new C5235a(eVar);
                    }
                } else {
                    c5235a = new C5235a(eVar);
                }
                Object obj2 = c5235a.f201584d;
                Object objE = uq.b.e();
                int i16 = c5235a.f201585e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f201582a;
                    uu3.c.Data aVarS9 = this.f201583b.s9((State) obj);
                    c5235a.f201586f = vq.j.a(obj);
                    c5235a.f201588h = vq.j.a(c5235a);
                    c5235a.f201589j = vq.j.a(obj);
                    c5235a.f201590k = vq.j.a(hVar);
                    c5235a.f201591l = 0;
                    c5235a.f201585e = 1;
                    if (hVar.F(aVarS9, c5235a) == objE) {
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

        public f(mu.g gVar, m mVar) {
            this.f201580a = gVar;
            this.f201581b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super uu3.c.Data> hVar, tq.e eVar) {
            Object objA = this.f201580a.a(new a(hVar, this.f201581b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Luu3/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201593f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ tu3.a f201595h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(tu3.a aVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f201595h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(PhoneNumber phoneNumber, b0 b0Var, State state) {
            return State.b(state, state.getData().a(phoneNumber, b0Var), null, null, null, null, false, false, 126, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarC;
            c0 c0Var = (c0) this.f201593f;
            Object objE = uq.b.e();
            int i15 = this.f201592e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (m.this.data.getDetailsData() != null && (lVarC = c0Var.c()) != null) {
                    return lVarC;
                }
                tu3.a aVar = this.f201595h;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f201593f = c0Var;
                this.f201592e = 1;
                obj = aVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            tu3.a.Result c5025a = (tu3.a.Result) ((dx.i.Right) iVar).b();
            final b0 b0VarA = c5025a.getEmail();
            if (b0VarA == null) {
                b0VarA = ((State) c0Var.a()).getData().getEmailAddress();
            }
            final PhoneNumber phoneNumberB = c5025a.getPhoneNumber();
            if (phoneNumberB == null) {
                phoneNumberB = ((State) c0Var.a()).getData().getPhoneNumber();
            }
            return c0Var.b(new er.l() { // from class: uu3.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.g.O(phoneNumberB, b0VarA, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = m.this.new g(this.f201595h, eVar);
            gVar.f201593f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luu3/a$a;", "<unused var>", "Luu3/b;", "state", "Loq/i0;", "<anonymous>", "(Luu3/a$a;Luu3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<uu3.a.C5234a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201597f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f201597f;
            Object objE = uq.b.e();
            int i15 = this.f201596e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ru3.a.AbstractC4497a> bVarY1 = m.this.Y1();
                ru3.a.AbstractC4497a.Back back = new ru3.a.AbstractC4497a.Back(state.getData());
                this.f201597f = vq.j.a(state);
                this.f201596e = 1;
                if (bVarY1.F(back, this) == objE) {
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
        public final Object w(uu3.a.C5234a c5234a, State state, tq.e<? super i0> eVar) {
            h hVar = m.this.new h(eVar);
            hVar.f201597f = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luu3/a$b;", "<unused var>", "Luu3/b;", "state", "Loq/i0;", "<anonymous>", "(Luu3/a$b;Luu3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<uu3.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201600f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f201600f;
            Object objE = uq.b.e();
            int i15 = this.f201599e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ru3.a.AbstractC4497a> bVarY1 = m.this.Y1();
                ru3.a.AbstractC4497a.Close close = new ru3.a.AbstractC4497a.Close(state.getData());
                this.f201600f = vq.j.a(state);
                this.f201599e = 1;
                if (bVarY1.F(close, this) == objE) {
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
        public final Object w(uu3.a.b bVar, State state, tq.e<? super i0> eVar) {
            i iVar = m.this.new i(eVar);
            iVar.f201600f = state;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luu3/a$f;", "action", "Lk10/c0;", "Luu3/b;", "state", "Lk10/l;", "<anonymous>", "(Luu3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<uu3.a.OnPrefixChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f201604g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(uu3.a.OnPrefixChanged onPrefixChanged, State state) {
            ContactDetailsData contactDetailsDataB = ContactDetailsData.b(state.getData(), PhoneNumber.e(state.getData().getPhoneNumber(), onPrefixChanged.getPrefix(), null, 2, null), null, 2, null);
            hz.b.d dVar = hz.b.d.f86848c;
            return State.b(state, contactDetailsDataB, null, dVar, dVar, null, false, false, 114, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final uu3.a.OnPrefixChanged onPrefixChanged = (uu3.a.OnPrefixChanged) this.f201603f;
            c0 c0Var = (c0) this.f201604g;
            uq.b.e();
            if (this.f201602e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uu3.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.j.O(onPrefixChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uu3.a.OnPrefixChanged onPrefixChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f201603f = onPrefixChanged;
            jVar.f201604g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luu3/a$e;", "action", "Lk10/c0;", "Luu3/b;", "state", "Lk10/l;", "<anonymous>", "(Luu3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<uu3.a.OnPhoneNumberChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f201607g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(uu3.a.OnPhoneNumberChanged onPhoneNumberChanged, State state) {
            ContactDetailsData contactDetailsDataB = ContactDetailsData.b(state.getData(), PhoneNumber.e(state.getData().getPhoneNumber(), null, onPhoneNumberChanged.getPhoneNumber(), 1, null), null, 2, null);
            hz.b.d dVar = hz.b.d.f86848c;
            return State.b(state, contactDetailsDataB, null, dVar, dVar, null, false, false, 114, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final uu3.a.OnPhoneNumberChanged onPhoneNumberChanged = (uu3.a.OnPhoneNumberChanged) this.f201606f;
            c0 c0Var = (c0) this.f201607g;
            uq.b.e();
            if (this.f201605e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uu3.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.k.O(onPhoneNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uu3.a.OnPhoneNumberChanged onPhoneNumberChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f201606f = onPhoneNumberChanged;
            kVar.f201607g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luu3/a$d;", "action", "Lk10/c0;", "Luu3/b;", "state", "Lk10/l;", "<anonymous>", "(Luu3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<uu3.a.OnEmailChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f201610g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(uu3.a.OnEmailChanged onEmailChanged, State state) {
            return State.b(state, ContactDetailsData.b(state.getData(), null, onEmailChanged.getEmailAddress(), 1, null), null, null, null, hz.b.d.f86848c, false, false, 110, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final uu3.a.OnEmailChanged onEmailChanged = (uu3.a.OnEmailChanged) this.f201609f;
            c0 c0Var = (c0) this.f201610g;
            uq.b.e();
            if (this.f201608e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uu3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.l.O(onEmailChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uu3.a.OnEmailChanged onEmailChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f201609f = onEmailChanged;
            lVar.f201610g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: uu3.m$m, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luu3/a$h;", "<unused var>", "Lk10/c0;", "Luu3/b;", "state", "Lk10/l;", "<anonymous>", "(Luu3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5236m extends vq.k implements er.q<uu3.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201612f;

        C5236m(tq.e<? super C5236m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, false, false, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f201612f;
            uq.b.e();
            if (this.f201611e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uu3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.C5236m.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uu3.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C5236m c5236m = new C5236m(eVar);
            c5236m.f201612f = c0Var;
            return c5236m.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luu3/a$g;", "<unused var>", "Lk10/c0;", "Luu3/b;", "state", "Lk10/l;", "<anonymous>", "(Luu3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<uu3.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201614f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, false, false, 63, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f201614f;
            uq.b.e();
            if (this.f201613e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uu3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.n.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uu3.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f201614f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luu3/a$c;", "<unused var>", "Lk10/c0;", "Luu3/b;", "state", "Lk10/l;", "<anonymous>", "(Luu3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<uu3.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f201615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f201616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f201617g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f201618h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f201619j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f201620k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f201621l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f201622m;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, hz.b bVar2, hz.b bVar3, boolean z15, State state) {
            return State.b(state, null, null, bVar, bVar2, bVar3, !z15, z15, 3, null);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:39:0x0103  */
        /* JADX WARN: Code duplicated, block: B:43:0x010c  */
        /* JADX WARN: Code duplicated, block: B:44:0x010e A[PHI: r2 r14
          0x010e: PHI (r2v13 hz.b) = (r2v9 hz.b), (r2v16 hz.b) binds: [B:35:0x00e7, B:43:0x010c] A[DONT_GENERATE, DONT_INLINE]
          0x010e: PHI (r14v21 hz.b) = (r14v10 hz.b), (r14v25 hz.b) binds: [B:35:0x00e7, B:43:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x0122  */
        /* JADX WARN: Code duplicated, block: B:50:0x012c  */
        /* JADX WARN: Code duplicated, block: B:53:0x0136  */
        /* JADX WARN: Code duplicated, block: B:57:0x0148  */
        /* JADX WARN: Code duplicated, block: B:60:0x014f  */
        /* JADX WARN: Code duplicated, block: B:66:0x01b5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:68:0x0142 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:0: B:51:0x0130->B:69:?, LOOP_END, SYNTHETIC] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            PhoneNumber phoneNumber;
            m mVar;
            int i15;
            Object obj2;
            oq.r rVarA;
            hz.b bVar;
            hz.b bVar2;
            b0 b0Var;
            Object objP9;
            final hz.b bVar3;
            final hz.b bVar4;
            final hz.b bVar5;
            List listQ;
            Iterator it;
            k10.l lVarC;
            xw.b<ru3.a.AbstractC4497a> bVarY1;
            ru3.a.AbstractC4497a.Next next;
            c0 c0Var = (c0) this.f201622m;
            Object objE = uq.b.e();
            int i16 = this.f201621l;
            if (i16 == 0) {
                oq.u.b(obj);
                PhoneNumber phoneNumber2 = ((State) c0Var.a()).getData().getPhoneNumber();
                phoneNumber = !fu.r.t0(iy.c0.e(phoneNumber2.g())) ? phoneNumber2 : null;
                if (phoneNumber != null) {
                    mVar = m.this;
                    this.f201622m = c0Var;
                    this.f201615e = mVar;
                    this.f201616f = phoneNumber;
                    this.f201620k = 0;
                    this.f201621l = 1;
                    obj = mVar.q9(phoneNumber, this);
                    if (obj != objE) {
                        i15 = 0;
                    }
                } else {
                    hz.b.d dVar = hz.b.d.f86848c;
                    rVarA = y.a(dVar, dVar);
                    bVar = (hz.b) rVarA.a();
                    bVar2 = (hz.b) rVarA.b();
                    b0 emailAddress = ((State) c0Var.a()).getData().getEmailAddress();
                    if (fu.r.t0(iy.c0.e(emailAddress))) {
                    }
                    if (b0Var != null) {
                        m mVar2 = m.this;
                        this.f201622m = c0Var;
                        this.f201615e = bVar;
                        this.f201616f = bVar2;
                        this.f201617g = vq.j.a(b0Var);
                        this.f201620k = 0;
                        this.f201621l = 3;
                        objP9 = mVar2.p9(b0Var, this);
                        if (objP9 != objE) {
                            bVar3 = bVar2;
                            obj = objP9;
                            bVar4 = bVar;
                            bVar5 = (hz.b) obj;
                            if (bVar5 == null) {
                                bVar2 = bVar3;
                                bVar = bVar4;
                                hz.b bVar6 = bVar;
                                bVar3 = bVar2;
                                bVar5 = hz.b.d.f86848c;
                                bVar4 = bVar6;
                            }
                            listQ = pq.v.q(bVar5, bVar3, bVar4);
                            if (listQ instanceof Collection) {
                                it = listQ.iterator();
                                while (it.hasNext()) {
                                    if (!((hz.b) it.next()).a()) {
                                        if (bVar3.a()) {
                                        }
                                        return c0Var.b(new er.l() { // from class: uu3.t
                                            @Override // er.l
                                            public final Object b(Object obj3) {
                                                return m.o.O(bVar3, bVar4, bVar5, z, (State) obj3);
                                            }
                                        });
                                    }
                                }
                            } else {
                                it = listQ.iterator();
                                while (it.hasNext()) {
                                    if (!((hz.b) it.next()).a()) {
                                        if (bVar3.a()) {
                                        }
                                        return c0Var.b(new er.l() { // from class: uu3.t
                                            @Override // er.l
                                            public final Object b(Object obj3) {
                                                return m.o.O(bVar3, bVar4, bVar5, z, (State) obj3);
                                            }
                                        });
                                    }
                                }
                            }
                            lVarC = c0Var.c();
                            bVarY1 = m.this.Y1();
                            next = new ru3.a.AbstractC4497a.Next(new ContactDetailsData(((State) c0Var.a()).getData().getPhoneNumber(), ((State) c0Var.a()).getData().getEmailAddress()));
                            this.f201622m = vq.j.a(c0Var);
                            this.f201615e = vq.j.a(bVar4);
                            this.f201616f = vq.j.a(bVar3);
                            this.f201617g = vq.j.a(bVar5);
                            this.f201618h = lVarC;
                            this.f201619j = vq.j.a(lVarC);
                            this.f201620k = 0;
                            this.f201621l = 4;
                            if (bVarY1.F(next, this) != objE) {
                                return lVarC;
                            }
                        }
                    } else {
                        hz.b bVar7 = bVar;
                        bVar3 = bVar2;
                        bVar5 = hz.b.d.f86848c;
                        bVar4 = bVar7;
                        listQ = pq.v.q(bVar5, bVar3, bVar4);
                        if (listQ instanceof Collection) {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (!((hz.b) it.next()).a()) {
                                    if (bVar3.a()) {
                                    }
                                    return c0Var.b(new er.l() { // from class: uu3.t
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return m.o.O(bVar3, bVar4, bVar5, z, (State) obj3);
                                        }
                                    });
                                }
                            }
                        } else {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (!((hz.b) it.next()).a()) {
                                    if (bVar3.a()) {
                                    }
                                    return c0Var.b(new er.l() { // from class: uu3.t
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return m.o.O(bVar3, bVar4, bVar5, z, (State) obj3);
                                        }
                                    });
                                }
                            }
                        }
                        lVarC = c0Var.c();
                        bVarY1 = m.this.Y1();
                        next = new ru3.a.AbstractC4497a.Next(new ContactDetailsData(((State) c0Var.a()).getData().getPhoneNumber(), ((State) c0Var.a()).getData().getEmailAddress()));
                        this.f201622m = vq.j.a(c0Var);
                        this.f201615e = vq.j.a(bVar4);
                        this.f201616f = vq.j.a(bVar3);
                        this.f201617g = vq.j.a(bVar5);
                        this.f201618h = lVarC;
                        this.f201619j = vq.j.a(lVarC);
                        this.f201620k = 0;
                        this.f201621l = 4;
                        if (bVarY1.F(next, this) != objE) {
                            return lVarC;
                        }
                    }
                }
                return objE;
            }
            if (i16 == 1) {
                i15 = this.f201620k;
                phoneNumber = (PhoneNumber) this.f201616f;
                mVar = (m) this.f201615e;
                oq.u.b(obj);
            } else {
                if (i16 == 2) {
                    obj2 = this.f201616f;
                    oq.u.b(obj);
                    rVarA = y.a(obj2, obj);
                    if (rVarA == null) {
                        hz.b.d dVar2 = hz.b.d.f86848c;
                        rVarA = y.a(dVar2, dVar2);
                    }
                    bVar = (hz.b) rVarA.a();
                    bVar2 = (hz.b) rVarA.b();
                    b0 emailAddress2 = ((State) c0Var.a()).getData().getEmailAddress();
                    b0Var = fu.r.t0(iy.c0.e(emailAddress2)) ? null : emailAddress2;
                    if (b0Var != null) {
                        m mVar3 = m.this;
                        this.f201622m = c0Var;
                        this.f201615e = bVar;
                        this.f201616f = bVar2;
                        this.f201617g = vq.j.a(b0Var);
                        this.f201620k = 0;
                        this.f201621l = 3;
                        objP9 = mVar3.p9(b0Var, this);
                        if (objP9 != objE) {
                            bVar3 = bVar2;
                            obj = objP9;
                            bVar4 = bVar;
                        }
                    } else {
                        hz.b bVar8 = bVar;
                        bVar3 = bVar2;
                        bVar5 = hz.b.d.f86848c;
                        bVar4 = bVar8;
                        listQ = pq.v.q(bVar5, bVar3, bVar4);
                        if ((listQ instanceof Collection) || !listQ.isEmpty()) {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (!((hz.b) it.next()).a()) {
                                    final boolean z15 = !bVar3.a() && bVar4.a();
                                    return c0Var.b(new er.l() { // from class: uu3.t
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return m.o.O(bVar3, bVar4, bVar5, z15, (State) obj3);
                                        }
                                    });
                                }
                            }
                        }
                        lVarC = c0Var.c();
                        bVarY1 = m.this.Y1();
                        next = new ru3.a.AbstractC4497a.Next(new ContactDetailsData(((State) c0Var.a()).getData().getPhoneNumber(), ((State) c0Var.a()).getData().getEmailAddress()));
                        this.f201622m = vq.j.a(c0Var);
                        this.f201615e = vq.j.a(bVar4);
                        this.f201616f = vq.j.a(bVar3);
                        this.f201617g = vq.j.a(bVar5);
                        this.f201618h = lVarC;
                        this.f201619j = vq.j.a(lVarC);
                        this.f201620k = 0;
                        this.f201621l = 4;
                        if (bVarY1.F(next, this) != objE) {
                            return lVarC;
                        }
                    }
                    return objE;
                }
                if (i16 != 3) {
                    if (i16 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f201618h;
                    oq.u.b(obj);
                    return lVar;
                }
                bVar3 = (hz.b) this.f201616f;
                bVar4 = (hz.b) this.f201615e;
                oq.u.b(obj);
            }
            bVar5 = (hz.b) obj;
            if (bVar5 == null) {
                bVar2 = bVar3;
                bVar = bVar4;
                hz.b bVar9 = bVar;
                bVar3 = bVar2;
                bVar5 = hz.b.d.f86848c;
                bVar4 = bVar9;
            }
            listQ = pq.v.q(bVar5, bVar3, bVar4);
            if (listQ instanceof Collection) {
                it = listQ.iterator();
                while (it.hasNext()) {
                    if (!((hz.b) it.next()).a()) {
                        if (bVar3.a()) {
                        }
                        return c0Var.b(new er.l() { // from class: uu3.t
                            @Override // er.l
                            public final Object b(Object obj3) {
                                return m.o.O(bVar3, bVar4, bVar5, z15, (State) obj3);
                            }
                        });
                    }
                }
            } else {
                it = listQ.iterator();
                while (it.hasNext()) {
                    if (!((hz.b) it.next()).a()) {
                        if (bVar3.a()) {
                        }
                        return c0Var.b(new er.l() { // from class: uu3.t
                            @Override // er.l
                            public final Object b(Object obj3) {
                                return m.o.O(bVar3, bVar4, bVar5, z15, (State) obj3);
                            }
                        });
                    }
                }
            }
            lVarC = c0Var.c();
            bVarY1 = m.this.Y1();
            next = new ru3.a.AbstractC4497a.Next(new ContactDetailsData(((State) c0Var.a()).getData().getPhoneNumber(), ((State) c0Var.a()).getData().getEmailAddress()));
            this.f201622m = vq.j.a(c0Var);
            this.f201615e = vq.j.a(bVar4);
            this.f201616f = vq.j.a(bVar3);
            this.f201617g = vq.j.a(bVar5);
            this.f201618h = lVarC;
            this.f201619j = vq.j.a(lVarC);
            this.f201620k = 0;
            this.f201621l = 4;
            if (bVarY1.F(next, this) != objE) {
                return objE;
            }
            return lVarC;
            this.f201622m = c0Var;
            this.f201615e = vq.j.a(phoneNumber);
            this.f201616f = obj;
            this.f201620k = i15;
            this.f201621l = 2;
            Object objR9 = mVar.r9(phoneNumber, this);
            if (objR9 != objE) {
                obj2 = obj;
                obj = objR9;
                rVarA = y.a(obj2, obj);
                if (rVarA == null) {
                    hz.b.d dVar3 = hz.b.d.f86848c;
                    rVarA = y.a(dVar3, dVar3);
                }
                bVar = (hz.b) rVarA.a();
                bVar2 = (hz.b) rVarA.b();
                b0 emailAddress3 = ((State) c0Var.a()).getData().getEmailAddress();
                if (fu.r.t0(iy.c0.e(emailAddress3))) {
                }
                if (b0Var != null) {
                    m mVar4 = m.this;
                    this.f201622m = c0Var;
                    this.f201615e = bVar;
                    this.f201616f = bVar2;
                    this.f201617g = vq.j.a(b0Var);
                    this.f201620k = 0;
                    this.f201621l = 3;
                    objP9 = mVar4.p9(b0Var, this);
                    if (objP9 != objE) {
                        bVar3 = bVar2;
                        obj = objP9;
                        bVar4 = bVar;
                        bVar5 = (hz.b) obj;
                        if (bVar5 == null) {
                            bVar2 = bVar3;
                            bVar = bVar4;
                            hz.b bVar10 = bVar;
                            bVar3 = bVar2;
                            bVar5 = hz.b.d.f86848c;
                            bVar4 = bVar10;
                        }
                        listQ = pq.v.q(bVar5, bVar3, bVar4);
                        if (listQ instanceof Collection) {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (!((hz.b) it.next()).a()) {
                                    if (bVar3.a()) {
                                    }
                                    return c0Var.b(new er.l() { // from class: uu3.t
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return m.o.O(bVar3, bVar4, bVar5, z15, (State) obj3);
                                        }
                                    });
                                }
                            }
                        } else {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (!((hz.b) it.next()).a()) {
                                    if (bVar3.a()) {
                                    }
                                    return c0Var.b(new er.l() { // from class: uu3.t
                                        @Override // er.l
                                        public final Object b(Object obj3) {
                                            return m.o.O(bVar3, bVar4, bVar5, z15, (State) obj3);
                                        }
                                    });
                                }
                            }
                        }
                        lVarC = c0Var.c();
                        bVarY1 = m.this.Y1();
                        next = new ru3.a.AbstractC4497a.Next(new ContactDetailsData(((State) c0Var.a()).getData().getPhoneNumber(), ((State) c0Var.a()).getData().getEmailAddress()));
                        this.f201622m = vq.j.a(c0Var);
                        this.f201615e = vq.j.a(bVar4);
                        this.f201616f = vq.j.a(bVar3);
                        this.f201617g = vq.j.a(bVar5);
                        this.f201618h = lVarC;
                        this.f201619j = vq.j.a(lVarC);
                        this.f201620k = 0;
                        this.f201621l = 4;
                        if (bVarY1.F(next, this) != objE) {
                            return lVarC;
                        }
                    }
                } else {
                    hz.b bVar11 = bVar;
                    bVar3 = bVar2;
                    bVar5 = hz.b.d.f86848c;
                    bVar4 = bVar11;
                    listQ = pq.v.q(bVar5, bVar3, bVar4);
                    if (listQ instanceof Collection) {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (!((hz.b) it.next()).a()) {
                                if (bVar3.a()) {
                                }
                                return c0Var.b(new er.l() { // from class: uu3.t
                                    @Override // er.l
                                    public final Object b(Object obj3) {
                                        return m.o.O(bVar3, bVar4, bVar5, z15, (State) obj3);
                                    }
                                });
                            }
                        }
                    } else {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (!((hz.b) it.next()).a()) {
                                if (bVar3.a()) {
                                }
                                return c0Var.b(new er.l() { // from class: uu3.t
                                    @Override // er.l
                                    public final Object b(Object obj3) {
                                        return m.o.O(bVar3, bVar4, bVar5, z15, (State) obj3);
                                    }
                                });
                            }
                        }
                    }
                    lVarC = c0Var.c();
                    bVarY1 = m.this.Y1();
                    next = new ru3.a.AbstractC4497a.Next(new ContactDetailsData(((State) c0Var.a()).getData().getPhoneNumber(), ((State) c0Var.a()).getData().getEmailAddress()));
                    this.f201622m = vq.j.a(c0Var);
                    this.f201615e = vq.j.a(bVar4);
                    this.f201616f = vq.j.a(bVar3);
                    this.f201617g = vq.j.a(bVar5);
                    this.f201618h = lVarC;
                    this.f201619j = vq.j.a(lVarC);
                    this.f201620k = 0;
                    this.f201621l = 4;
                    if (bVarY1.F(next, this) != objE) {
                        return lVarC;
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uu3.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = m.this.new o(eVar);
            oVar.f201622m = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, final tu3.a aVar2, c14.a aVar3, j14.n nVar, vu3.d dVar, mx.c cVar, ContactDetailsFormData contactDetailsFormData) {
        this.checkEmailCorrectUseCase = aVar3;
        this.checkPhoneNumberCorrectUC = nVar;
        this.mapper = dVar;
        this.labelProvider = cVar;
        this.data = contactDetailsFormData;
        ContactDetailsData detailsData = contactDetailsFormData.getDetailsData();
        State state = new State(detailsData == null ? new ContactDetailsData(PhoneNumber.INSTANCE.a(), b0.INSTANCE.a()) : detailsData, contactDetailsFormData.getTopMenuTitle(), null, null, null, false, false, 124, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: uu3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f201555a, aVar2, (k10.v) obj);
            }
        });
        this.state = a9(new f(e9().getState(), this), s9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p9(b0 b0Var, tq.e<? super hz.b> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f201569g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f201569g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f201567e;
        Object objE = uq.b.e();
        int i16 = aVar.f201569g;
        if (i16 == 0) {
            oq.u.b(objC);
            c14.a aVar2 = this.checkEmailCorrectUseCase;
            c14.a.Params params = new c14.a.Params(b0Var, true);
            aVar.f201566d = vq.j.a(b0Var);
            aVar.f201569g = 1;
            objC = aVar2.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        if (zBooleanValue) {
            return hz.b.d.f86848c;
        }
        if (zBooleanValue) {
            throw new oq.p();
        }
        return new hz.b.Invalid(this.labelProvider.c(qu3.a.f169016d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q9(PhoneNumber phoneNumber, tq.e<? super hz.b> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f201573g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f201573g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f201571e;
        Object objE = uq.b.e();
        int i16 = bVar.f201573g;
        if (i16 == 0) {
            oq.u.b(objC);
            j14.n nVar = this.checkPhoneNumberCorrectUC;
            j14.n.a.CheckNumber checkNumber = new j14.n.a.CheckNumber(phoneNumber, false);
            bVar.f201570d = vq.j.a(phoneNumber);
            bVar.f201573g = 1;
            objC = nVar.c(checkNumber, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        return hz.b.INSTANCE.a((hz.g) objC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r9(PhoneNumber phoneNumber, tq.e<? super hz.b> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f201577g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f201577g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f201575e;
        Object objE = uq.b.e();
        int i16 = cVar.f201577g;
        if (i16 == 0) {
            oq.u.b(objC);
            j14.n nVar = this.checkPhoneNumberCorrectUC;
            j14.n.a.CheckPrefix checkPrefix = new j14.n.a.CheckPrefix(phoneNumber, false);
            cVar.f201574d = vq.j.a(phoneNumber);
            cVar.f201577g = 1;
            objC = nVar.c(checkPrefix, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        return hz.b.INSTANCE.a((hz.g) objC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uu3.c.Data s9(State state) {
        return this.mapper.b(new vu3.d.Params(state, new d(), new e(), b9(uu3.a.h.f201520a), new er.l() { // from class: uu3.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(this.f201552a, (b0) obj);
            }
        }, b9(uu3.a.g.f201519a), b9(uu3.a.c.f201512a), b9(uu3.a.C5234a.f201510a), b9(uu3.a.b.f201511a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(m mVar, b0 b0Var) {
        mVar.d9(new uu3.a.OnEmailChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final m mVar, final tu3.a aVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: uu3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f201553a, aVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(m mVar, tu3.a aVar, z zVar) {
        zVar.A(mVar.new g(aVar, null));
        h hVar = mVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(uu3.a.C5234a.class), oVar, hVar);
        zVar.x(q0.c(uu3.a.b.class), oVar, mVar.new i(null));
        zVar.v(q0.c(uu3.a.OnPrefixChanged.class), oVar, new j(null));
        zVar.v(q0.c(uu3.a.OnPhoneNumberChanged.class), oVar, new k(null));
        zVar.v(q0.c(uu3.a.OnEmailChanged.class), oVar, new l(null));
        zVar.v(q0.c(uu3.a.h.class), oVar, new C5236m(null));
        zVar.v(q0.c(uu3.a.g.class), oVar, new n(null));
        zVar.v(q0.c(uu3.a.c.class), oVar, mVar.new o(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ru3.a.AbstractC4497a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, uu3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<uu3.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ContactDetailsFormData contactDetailsFormData) {
        super.P5(contactDetailsFormData);
    }
}
