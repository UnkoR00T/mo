package f51;

import bl0.BEChildBirthRegistrationApplicantAddress;
import fr.q0;
import g51.ReceiveDocumentAddressData;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u001f0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lf51/q;", "Ll00/g;", "Lf51/b;", "Lf51/a;", "Lf51/c;", "", "Lyy/a;", "stateMachineFactory", "Lst3/h;", "addressFormVMSFactory", "Lh51/a;", "mapper", "Lq31/c;", "exitDialogMapper", "Lcx/a;", "eventThrottler", "Lg51/b;", "contract", "<init>", "(Lyy/a;Lst3/h;Lh51/a;Lq31/c;Lcx/a;Lg51/b;)V", "y9", "()Lf51/b;", "Lg51/a;", "data", "Lf51/b$b;", "w9", "(Lg51/a;)Lf51/b$b;", "Lst3/k$b;", "result", "t9", "(Lst3/k$b;)Lg51/a;", "Lf51/c$a;", "v9", "(Lf51/b;)Lf51/c$a;", "b", "Lst3/h;", "c", "Lh51/a;", "d", "Lq31/c;", "e", "Lcx/a;", "f", "Lg51/b;", "g", "Lf51/b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lf51/a$a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<f51.b, f51.a> implements f51.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final st3.h addressFormVMSFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h51.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cx.a eventThrottler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g51.b contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f51.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<f51.b, f51.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f51.a.InterfaceC1326a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<f51.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f51.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f59311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f59312b;

        /* JADX INFO: renamed from: f51.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1330a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f59313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f59314b;

            /* JADX INFO: renamed from: f51.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1331a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f59315d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f59316e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f59317f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f59319h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f59320j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f59321k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f59322l;

                public C1331a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f59315d = obj;
                    this.f59316e |= PKIFailureInfo.systemUnavail;
                    return C1330a.this.F(null, this);
                }
            }

            public C1330a(mu.h hVar, q qVar) {
                this.f59313a = hVar;
                this.f59314b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1331a c1331a;
                if (eVar instanceof C1331a) {
                    c1331a = (C1331a) eVar;
                    int i15 = c1331a.f59316e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1331a.f59316e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1331a = new C1331a(eVar);
                    }
                } else {
                    c1331a = new C1331a(eVar);
                }
                Object obj2 = c1331a.f59315d;
                Object objE = uq.b.e();
                int i16 = c1331a.f59316e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f59313a;
                    f51.c.a aVarV9 = this.f59314b.v9((f51.b) obj);
                    c1331a.f59317f = vq.j.a(obj);
                    c1331a.f59319h = vq.j.a(c1331a);
                    c1331a.f59320j = vq.j.a(obj);
                    c1331a.f59321k = vq.j.a(hVar);
                    c1331a.f59322l = 0;
                    c1331a.f59316e = 1;
                    if (hVar.F(aVarV9, c1331a) == objE) {
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
            this.f59311a = gVar;
            this.f59312b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f51.c.a> hVar, tq.e eVar) {
            Object objA = this.f59311a.a(new C1330a(hVar, this.f59312b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf51/a$a;", "action", "Lf51/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf51/a$a;Lf51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f51.a.InterfaceC1326a, f51.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59324f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f59326e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f59327f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ f51.a.InterfaceC1326a f59328g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, f51.a.InterfaceC1326a interfaceC1326a, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f59327f = qVar;
                this.f59328g = interfaceC1326a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f59326e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    q qVar = this.f59327f;
                    f51.a.InterfaceC1326a interfaceC1326a = this.f59328g;
                    this.f59326e = 1;
                    if (qVar.F(interfaceC1326a, this) == objE) {
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
                return new a(this.f59327f, this.f59328g, eVar);
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
            f51.a.InterfaceC1326a interfaceC1326a = (f51.a.InterfaceC1326a) this.f59324f;
            Object objE = uq.b.e();
            int i15 = this.f59323e;
            if (i15 == 0) {
                oq.u.b(obj);
                cx.a aVar = q.this.eventThrottler;
                a aVar2 = new a(q.this, interfaceC1326a, null);
                this.f59324f = vq.j.a(interfaceC1326a);
                this.f59323e = 1;
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
        public final Object w(f51.a.InterfaceC1326a interfaceC1326a, f51.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = q.this.new b(eVar);
            bVar2.f59324f = interfaceC1326a;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf51/a$d;", "<unused var>", "Lf51/b;", "Loq/i0;", "<anonymous>", "(Lf51/a$d;Lf51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<f51.a.d, f51.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59329e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f59329e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new f51.a.InterfaceC1326a.ShowDialog(q.this.exitDialogMapper.b(new q31.c.Params(q.this.b9(f51.a.InterfaceC1326a.b.f59274a)))));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f51.a.d dVar, f51.b bVar, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lf51/b$a;", "state", "Lk10/l;", "Lf51/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<f51.b.a>, tq.e<? super k10.l<? extends f51.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59332f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f51.b O(f51.b bVar, f51.b.a aVar) {
            return bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f59332f;
            uq.b.e();
            if (this.f59331e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final f51.b bVarY9 = q.this.y9();
            return c0Var.d(new er.l() { // from class: f51.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(bVarY9, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<f51.b.a> c0Var, tq.e<? super k10.l<? extends f51.b>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f59332f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf51/a$b;", "<unused var>", "Lf51/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lf51/a$b;Lf51/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<f51.a.b, f51.b.Teryt, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59335f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f51.b.Teryt teryt = (f51.b.Teryt) this.f59335f;
            Object objE = uq.b.e();
            int i15 = this.f59334e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = teryt.getAddressFormVMS().e();
                st3.g.a.c cVar = st3.g.a.c.f184306a;
                this.f59335f = vq.j.a(teryt);
                this.f59334e = 1;
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
        public final Object w(f51.a.b bVar, f51.b.Teryt teryt, tq.e<? super i0> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f59335f = teryt;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf51/a$c;", "action", "Lf51/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lf51/a$c;Lf51/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<f51.a.OnValidated, f51.b.Teryt, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59338g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f51.a.OnValidated onValidated = (f51.a.OnValidated) this.f59337f;
            f51.b.Teryt teryt = (f51.b.Teryt) this.f59338g;
            Object objE = uq.b.e();
            int i15 = this.f59336e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (onValidated.getAddressResult() instanceof st3.k.ValidWithResult) {
                    q.this.contract.F0(q.this.t9((st3.k.ValidWithResult) onValidated.getAddressResult()));
                    q.this.d9(f51.a.InterfaceC1326a.c.f59275a);
                } else {
                    xw.b<st3.g.a> bVarE = teryt.getAddressFormVMS().e();
                    st3.g.a.b bVar = st3.g.a.b.f184305a;
                    this.f59337f = vq.j.a(onValidated);
                    this.f59338g = vq.j.a(teryt);
                    this.f59336e = 1;
                    if (bVarE.F(bVar, this) == objE) {
                        return objE;
                    }
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
        public final Object w(f51.a.OnValidated onValidated, f51.b.Teryt teryt, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f59337f = onValidated;
            fVar.f59338g = teryt;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst3/g$b;", "event", "Lf51/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst3/g$b;Lf51/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<st3.g.b, f51.b.Teryt, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59341f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            st3.g.b bVar = (st3.g.b) this.f59341f;
            uq.b.e();
            if (this.f59340e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(bVar, st3.g.b.a.f184307a)) {
                q.this.d9(f51.a.InterfaceC1326a.C1327a.f59273a);
            } else if (bVar instanceof st3.g.b.GoToError) {
                q.this.d9(new f51.a.InterfaceC1326a.ShowError(((st3.g.b.GoToError) bVar).getErrorData()));
            } else if (bVar instanceof st3.g.b.GoToSearch) {
                q.this.d9(new f51.a.InterfaceC1326a.ShowSearch(((st3.g.b.GoToSearch) bVar).getModel()));
            } else {
                if (!(bVar instanceof st3.g.b.Validated)) {
                    throw new oq.p();
                }
                q.this.d9(new f51.a.OnValidated(((st3.g.b.Validated) bVar).getAddressResult()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.b bVar, f51.b.Teryt teryt, tq.e<? super i0> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f59341f = bVar;
            return gVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, st3.h hVar, h51.a aVar2, q31.c cVar, cx.a aVar3, g51.b bVar) {
        this.addressFormVMSFactory = hVar;
        this.mapper = aVar2;
        this.exitDialogMapper = cVar;
        this.eventThrottler = aVar3;
        this.contract = bVar;
        f51.b.a aVar4 = f51.b.a.f59282a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: f51.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f59301a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), v9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(f51.a.InterfaceC1326a.class), oVar, bVar);
        zVar.x(q0.c(f51.a.d.class), oVar, qVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(q qVar, z zVar) {
        zVar.A(qVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(q qVar, z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(f51.a.b.class), oVar, eVar);
        zVar.x(q0.c(f51.a.OnValidated.class), oVar, qVar.new f(null));
        k10.k.r(zVar, new er.l() { // from class: f51.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9((b.Teryt) obj);
            }
        }, null, qVar.new g(null), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g D9(f51.b.Teryt teryt) {
        return teryt.getAddressFormVMS().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveDocumentAddressData t9(st3.k.ValidWithResult result) {
        return new ReceiveDocumentAddressData(this.contract.i().getFirstName(), this.contract.i().getSurname(), result.getAddressData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f51.c.a v9(f51.b bVar) {
        return this.mapper.b(new h51.a.Params(bVar, b9(f51.a.b.f59279a), b9(f51.a.d.f59281a), b9(f51.a.InterfaceC1326a.C1327a.f59273a)));
    }

    private final f51.b.Teryt w9(ReceiveDocumentAddressData data) {
        return new f51.b.Teryt(this.addressFormVMSFactory.a(new AddressFormVMSSetupData(AddressFormVMSSetupData.b.C4761b.f184325a, false, st3.j.a(data.getAddress()), 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f51.b y9() {
        ReceiveDocumentAddressData receiveDocumentAddressDataQ = this.contract.Q();
        if (receiveDocumentAddressDataQ != null) {
            return w9(receiveDocumentAddressDataQ);
        }
        BEChildBirthRegistrationApplicantAddress permanentAddress = this.contract.i().getPermanentAddress();
        return new f51.b.Teryt(this.addressFormVMSFactory.a(new AddressFormVMSSetupData(AddressFormVMSSetupData.b.C4761b.f184325a, false, permanentAddress != null ? q31.d.f(permanentAddress) : null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final q qVar, v vVar) {
        vVar.c(q0.c(f51.b.class), new er.l() { // from class: f51.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.A9(this.f59298a, (z) obj);
            }
        });
        vVar.c(q0.c(f51.b.a.class), new er.l() { // from class: f51.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f59299a, (z) obj);
            }
        });
        vVar.c(q0.c(f51.b.Teryt.class), new er.l() { // from class: f51.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9(this.f59300a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<f51.a.InterfaceC1326a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<f51.b, f51.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f51.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(f51.a.InterfaceC1326a interfaceC1326a, tq.e<? super i0> eVar) {
        return super.F(interfaceC1326a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(g51.b bVar) {
        super.P5(bVar);
    }
}
