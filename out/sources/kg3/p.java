package kg3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import sv0.BEVehicleData;
import sv0.Insurance;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00130/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lkg3/p;", "Ll00/g;", "Lkg3/b;", "Lkg3/a;", "Lkg3/c;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lmg3/b;", "mapper", "Llg3/a;", "contract", "<init>", "(Lyy/a;Lmx/c;Lmg3/b;Llg3/a;)V", "Lcb4/d;", "p9", "()Lcb4/d;", "Lkg3/c$a;", "t9", "(Lkg3/b;)Lkg3/c$a;", "b", "Lmx/c;", "c", "Lmg3/b;", "d", "Llg3/a;", "getContract", "()Llg3/a;", "Lkg3/b$a;", "e", "Lkg3/b$a;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lkg3/a$d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<kg3.b, kg3.a> implements kg3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mg3.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lg3.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final kg3.b.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kg3.b, kg3.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kg3.a.d> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<kg3.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<kg3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f110889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f110890b;

        /* JADX INFO: renamed from: kg3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2667a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f110891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f110892b;

            /* JADX INFO: renamed from: kg3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2668a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f110893d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f110894e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f110895f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f110897h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f110898j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f110899k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f110900l;

                public C2668a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f110893d = obj;
                    this.f110894e |= PKIFailureInfo.systemUnavail;
                    return C2667a.this.F(null, this);
                }
            }

            public C2667a(mu.h hVar, p pVar) {
                this.f110891a = hVar;
                this.f110892b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2668a c2668a;
                if (eVar instanceof C2668a) {
                    c2668a = (C2668a) eVar;
                    int i15 = c2668a.f110894e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2668a.f110894e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2668a = new C2668a(eVar);
                    }
                } else {
                    c2668a = new C2668a(eVar);
                }
                Object obj2 = c2668a.f110893d;
                Object objE = uq.b.e();
                int i16 = c2668a.f110894e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f110891a;
                    kg3.c.a aVarT9 = this.f110892b.t9((kg3.b) obj);
                    c2668a.f110895f = vq.j.a(obj);
                    c2668a.f110897h = vq.j.a(c2668a);
                    c2668a.f110898j = vq.j.a(obj);
                    c2668a.f110899k = vq.j.a(hVar);
                    c2668a.f110900l = 0;
                    c2668a.f110894e = 1;
                    if (hVar.F(aVarT9, c2668a) == objE) {
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
            this.f110889a = gVar;
            this.f110890b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kg3.c.a> hVar, tq.e eVar) {
            Object objA = this.f110889a.a(new C2667a(hVar, this.f110890b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsv0/e;", "vehicle", "Lk10/c0;", "Lkg3/b;", "state", "Lk10/l;", "<anonymous>", "(Lsv0/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<BEVehicleData, c0<kg3.b>, tq.e<? super k10.l<? extends kg3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110902f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110903g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kg3.b.Initialized O(BEVehicleData bEVehicleData, kg3.b bVar) {
            List<Insurance> listN;
            if (bEVehicleData == null || (listN = bEVehicleData.e()) == null) {
                listN = v.n();
            }
            return new kg3.b.Initialized(listN);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final BEVehicleData bEVehicleData = (BEVehicleData) this.f110902f;
            c0 c0Var = (c0) this.f110903g;
            uq.b.e();
            if (this.f110901e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: kg3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.b.O(bEVehicleData, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(BEVehicleData bEVehicleData, c0<kg3.b> c0Var, tq.e<? super k10.l<? extends kg3.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f110902f = bEVehicleData;
            bVar.f110903g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkg3/a$d;", "action", "Lkg3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkg3/a$d;Lkg3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<kg3.a.d, kg3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110905f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kg3.a.d dVar = (kg3.a.d) this.f110905f;
            Object objE = uq.b.e();
            int i15 = this.f110904e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                this.f110905f = vq.j.a(dVar);
                this.f110904e = 1;
                if (pVar.F(dVar, this) == objE) {
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
        public final Object w(kg3.a.d dVar, kg3.b bVar, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f110905f = dVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkg3/a$e;", "<unused var>", "Lkg3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lkg3/a$e;Lkg3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kg3.a.e, kg3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110908f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kg3.b.Initialized initialized = (kg3.b.Initialized) this.f110908f;
            Object objE = uq.b.e();
            int i15 = this.f110907e;
            if (i15 == 0) {
                u.b(obj);
                if (initialized.a().isEmpty()) {
                    p pVar = p.this;
                    kg3.a.d.ShowDialog showDialog = new kg3.a.d.ShowDialog(p.this.p9());
                    this.f110908f = vq.j.a(initialized);
                    this.f110907e = 1;
                    if (pVar.F(showDialog, this) == objE) {
                        return objE;
                    }
                } else {
                    p.this.d9(kg3.a.c.f110853a);
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
        public final Object w(kg3.a.e eVar, kg3.b.Initialized initialized, tq.e<? super i0> eVar2) {
            d dVar = p.this.new d(eVar2);
            dVar.f110908f = initialized;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkg3/a$c;", "<unused var>", "Lkg3/b$b;", "Loq/i0;", "<anonymous>", "(Lkg3/a$c;Lkg3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kg3.a.c, kg3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110910e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110910e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                kg3.a.d.c cVar = kg3.a.d.c.f110856a;
                this.f110910e = 1;
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
        public final Object w(kg3.a.c cVar, kg3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkg3/a$a;", "<unused var>", "Lkg3/b$b;", "Loq/i0;", "<anonymous>", "(Lkg3/a$a;Lkg3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kg3.a.C2662a, kg3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110912e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110912e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                kg3.a.d.GoToWriteInsurance goToWriteInsurance = new kg3.a.d.GoToWriteInsurance(xi3.b.a.f219108a);
                this.f110912e = 1;
                if (pVar.F(goToWriteInsurance, this) == objE) {
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
        public final Object w(kg3.a.C2662a c2662a, kg3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return p.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkg3/a$b;", "action", "Lkg3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkg3/a$b;Lkg3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kg3.a.EditInsuranceClicked, kg3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110915f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kg3.a.EditInsuranceClicked editInsuranceClicked = (kg3.a.EditInsuranceClicked) this.f110915f;
            Object objE = uq.b.e();
            int i15 = this.f110914e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                kg3.a.d.GoToWriteInsurance goToWriteInsurance = new kg3.a.d.GoToWriteInsurance(new xi3.b.Edit(editInsuranceClicked.getInsurance()));
                this.f110915f = vq.j.a(editInsuranceClicked);
                this.f110914e = 1;
                if (pVar.F(goToWriteInsurance, this) == objE) {
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
        public final Object w(kg3.a.EditInsuranceClicked editInsuranceClicked, kg3.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f110915f = editInsuranceClicked;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, mx.c cVar, mg3.b bVar, lg3.a aVar2) {
        this.labelProvider = cVar;
        this.mapper = bVar;
        this.contract = aVar2;
        kg3.b.a aVar3 = kg3.b.a.f110860a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: kg3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f110881a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData p9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.T2), this.labelProvider.c(md3.b.S2), new DialogButtonTextData(this.labelProvider.c(md3.b.K), null, b9(kg3.a.c.f110853a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.T), null, new er.a() { // from class: kg3.m
            @Override // er.a
            public final Object a() {
                return p.q9();
            }
        }, 2, null), null, new er.a() { // from class: kg3.n
            @Override // er.a
            public final Object a() {
                return p.r9();
            }
        }, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kg3.c.a t9(kg3.b bVar) {
        mg3.b bVar2 = this.mapper;
        er.a<i0> aVarB9 = b9(kg3.a.e.f110859a);
        return bVar2.b(new mg3.b.Params(bVar, b9(kg3.a.C2662a.f110851a), new er.l() { // from class: kg3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f110880a, (Insurance) obj);
            }
        }, aVarB9, b9(kg3.a.d.C2663a.f110854a), b9(kg3.a.d.b.f110855a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, Insurance insurance) {
        pVar.d9(new kg3.a.EditInsuranceClicked(insurance));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(kg3.b.class), new er.l() { // from class: kg3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f110878a, (z) obj);
            }
        });
        vVar.c(q0.c(kg3.b.Initialized.class), new er.l() { // from class: kg3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f110879a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, z zVar) {
        k10.k.m(zVar, pVar.contract.C6(), null, new b(null), 2, null);
        c cVar = pVar.new c(null);
        zVar.x(q0.c(kg3.a.d.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, z zVar) {
        d dVar = pVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(kg3.a.e.class), oVar, dVar);
        zVar.x(q0.c(kg3.a.c.class), oVar, pVar.new e(null));
        zVar.x(q0.c(kg3.a.C2662a.class), oVar, pVar.new f(null));
        zVar.x(q0.c(kg3.a.EditInsuranceClicked.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<kg3.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<kg3.b, kg3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kg3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(kg3.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(lg3.a aVar) {
        super.P5(aVar);
    }
}
