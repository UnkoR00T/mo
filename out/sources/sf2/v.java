package sf2;

import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uf2.OperatorItem;
import zi0.InternetAddressPoint;
import zi0.InternetAvailableOperators;
import zi0.InternetOperator;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001<BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lsf2/v;", "Ll00/g;", "Lsf2/d;", "Lsf2/c;", "Lsf2/e;", "", "Lyy/a;", "stateMachineFactory", "Ltf2/b;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lhj0/c;", "getAvailableOperatorsUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lsf2/f;", "setupContract", "<init>", "(Lyy/a;Ltf2/b;Lac4/a;Lhj0/c;Lib4/c;Lhb4/d;Lsf2/f;)V", "state", "Lsf2/e$a;", "t9", "(Lsf2/d;)Lsf2/e$a;", "b", "Ltf2/b;", "c", "Lac4/a;", "d", "Lhj0/c;", "e", "Lib4/c;", "f", "Lhb4/d;", "g", "Lsf2/f;", "Lxw/b;", "Lsf2/c$f;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lsf2/d$c;", "j", "Lsf2/d$c;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<sf2.d, sf2.c> implements sf2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tf2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hj0.c getAvailableOperatorsUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final sf2.f setupContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sf2.c.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final sf2.d.c initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sf2.d, sf2.c> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<sf2.e.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsf2/v$a;", "Lf00/j0;", "Lsf2/f;", "Lsf2/v;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<sf2.f, v> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<sf2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f181286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f181287b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f181288a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f181289b;

            /* JADX INFO: renamed from: sf2.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4661a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f181290d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f181291e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f181292f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f181294h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f181295j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f181296k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f181297l;

                public C4661a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f181290d = obj;
                    this.f181291e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f181288a = hVar;
                this.f181289b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4661a c4661a;
                if (eVar instanceof C4661a) {
                    c4661a = (C4661a) eVar;
                    int i15 = c4661a.f181291e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4661a.f181291e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4661a = new C4661a(eVar);
                    }
                } else {
                    c4661a = new C4661a(eVar);
                }
                Object obj2 = c4661a.f181290d;
                Object objE = uq.b.e();
                int i16 = c4661a.f181291e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f181288a;
                    sf2.e.a aVarT9 = this.f181289b.t9((sf2.d) obj);
                    c4661a.f181292f = vq.j.a(obj);
                    c4661a.f181294h = vq.j.a(c4661a);
                    c4661a.f181295j = vq.j.a(obj);
                    c4661a.f181296k = vq.j.a(hVar);
                    c4661a.f181297l = 0;
                    c4661a.f181291e = 1;
                    if (hVar.F(aVarT9, c4661a) == objE) {
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

        public b(mu.g gVar, v vVar) {
            this.f181286a = gVar;
            this.f181287b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sf2.e.a> hVar, tq.e eVar) {
            Object objA = this.f181286a.a(new a(hVar, this.f181287b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsf2/d$c;", "state", "Lk10/l;", "Lsf2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<sf2.d.c>, tq.e<? super k10.l<? extends sf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181299f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sf2.d.a V(sf2.d.c cVar) {
            return sf2.d.a.f181237a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sf2.d.Initialized X(List list, sf2.d.c cVar) {
            List list2 = list;
            boolean z15 = true;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!((OperatorItem) it.next()).getIsSelected()) {
                        z15 = false;
                        break;
                    }
                }
            }
            return new sf2.d.Initialized(list, z15, false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f181299f;
            uq.b.e();
            if (this.f181298e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final List<OperatorItem> listU7 = v.this.setupContract.u7();
            Boolean boolA = listU7 != null ? vq.b.a(listU7.isEmpty()) : null;
            if (fr.t.c(boolA, vq.b.a(true))) {
                return c0Var.d(new er.l() { // from class: sf2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.c.V((d.c) obj2);
                    }
                });
            }
            if (fr.t.c(boolA, vq.b.a(false))) {
                return c0Var.d(new er.l() { // from class: sf2.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.c.X(listU7, (d.c) obj2);
                    }
                });
            }
            if (boolA != null) {
                throw new oq.p();
            }
            v.this.d9(sf2.c.e.f181228a);
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sf2.d.c> c0Var, tq.e<? super k10.l<? extends sf2.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = v.this.new c(eVar);
            cVar.f181299f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf2/c$e;", "<unused var>", "Lk10/c0;", "Lsf2/d$c;", "state", "Lk10/l;", "Lsf2/d;", "<anonymous>", "(Lsf2/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sf2.c.e, k10.c0<sf2.d.c>, tq.e<? super k10.l<? extends sf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181302f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lsf2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends sf2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f181304e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f181305f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f181306g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f181307h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f181308j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ v f181309k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<sf2.d.c> f181310l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<sf2.d.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f181309k = vVar;
                this.f181310l = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sf2.d.Error a0(final v vVar, dx.b bVar, sf2.d.c cVar) {
                return new sf2.d.Error(vVar.errorVMSFactory.a(vVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: sf2.c0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.d.a.b0(vVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 b0(v vVar, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    vVar.d9(sf2.c.h.f181234a);
                } else {
                    vVar.d9(sf2.c.C4657c.f181226a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sf2.d c0(InternetAvailableOperators internetAvailableOperators, sf2.d.c cVar) {
                boolean zIsEmpty = internetAvailableOperators.a().isEmpty();
                if (zIsEmpty) {
                    return sf2.d.a.f181237a;
                }
                if (zIsEmpty) {
                    throw new oq.p();
                }
                List<InternetOperator> listA = internetAvailableOperators.a();
                ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(new OperatorItem(false, (InternetOperator) it.next(), 1, null));
                }
                return new sf2.d.Initialized(arrayList, false, false, 6, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sf2.d.Error d0(final v vVar, sf2.d.c cVar) {
                return new sf2.d.Error(vVar.errorVMSFactory.a(vVar.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: sf2.b0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.d.a.e0(vVar, (ib4.c.b) obj);
                    }
                }))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 e0(v vVar, ib4.c.b bVar) {
                vVar.d9(sf2.c.C4657c.f181226a);
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final v vVar;
                k10.c0<sf2.d.c> c0Var;
                Object objD;
                Object objE = uq.b.e();
                int i15 = this.f181308j;
                if (i15 == 0) {
                    oq.u.b(obj);
                    InternetAddressPoint internetAddressPointR0 = this.f181309k.setupContract.R0();
                    if (internetAddressPointR0 != null) {
                        vVar = this.f181309k;
                        k10.c0<sf2.d.c> c0Var2 = this.f181310l;
                        hj0.c cVar = vVar.getAvailableOperatorsUseCase;
                        hj0.c.Params params = new hj0.c.Params(internetAddressPointR0.getId(), internetAddressPointR0.getCommunityId());
                        this.f181304e = vVar;
                        this.f181305f = c0Var2;
                        this.f181306g = vq.j.a(internetAddressPointR0);
                        this.f181307h = 0;
                        this.f181308j = 1;
                        obj = cVar.c(params, this);
                        if (obj == objE) {
                            return objE;
                        }
                        c0Var = c0Var2;
                    }
                    k10.c0<sf2.d.c> c0Var3 = this.f181310l;
                    final v vVar2 = this.f181309k;
                    return c0Var3.d(new er.l() { // from class: sf2.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.d.a.d0(vVar2, (d.c) obj2);
                        }
                    });
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (k10.c0) this.f181305f;
                vVar = (v) this.f181304e;
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    objD = c0Var.d(new er.l() { // from class: sf2.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.d.a.a0(vVar, bVar, (d.c) obj2);
                        }
                    });
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final InternetAvailableOperators internetAvailableOperators = (InternetAvailableOperators) ((dx.i.Right) iVar).b();
                    objD = c0Var.d(new er.l() { // from class: sf2.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.d.a.c0(internetAvailableOperators, (d.c) obj2);
                        }
                    });
                }
                if (objD != null) {
                    return objD;
                }
                k10.c0<sf2.d.c> c0Var4 = this.f181310l;
                final v vVar3 = this.f181309k;
                return c0Var4.d(new er.l() { // from class: sf2.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.d.a.d0(vVar3, (d.c) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> Y(tq.e<?> eVar) {
                return new a(this.f181309k, this.f181310l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends sf2.d>> eVar) {
                return ((a) Y(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f181302f;
            Object objE = uq.b.e();
            int i15 = this.f181301e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, c0Var, null);
            this.f181302f = vq.j.a(c0Var);
            this.f181301e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sf2.c.e eVar, k10.c0<sf2.d.c> c0Var, tq.e<? super k10.l<? extends sf2.d>> eVar2) {
            d dVar = v.this.new d(eVar2);
            dVar.f181302f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf2/c$d;", "<unused var>", "Lsf2/d$d;", "Loq/i0;", "<anonymous>", "(Lsf2/c$d;Lsf2/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sf2.c.d, sf2.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181311e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181311e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sf2.c.f> bVarY1 = v.this.Y1();
                sf2.c.f.C4658c c4658c = sf2.c.f.C4658c.f181231a;
                this.f181311e = 1;
                if (bVarY1.F(c4658c, this) == objE) {
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
        public final Object w(sf2.c.d dVar, sf2.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return v.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf2/c$a;", "<unused var>", "Lsf2/d$d;", "Loq/i0;", "<anonymous>", "(Lsf2/c$a;Lsf2/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sf2.c.a, sf2.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181313e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181313e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sf2.c.f> bVarY1 = v.this.Y1();
                sf2.c.f.a aVar = sf2.c.f.a.f181229a;
                this.f181313e = 1;
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
        public final Object w(sf2.c.a aVar, sf2.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return v.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf2/c$i;", "action", "Lk10/c0;", "Lsf2/d$d;", "state", "Lk10/l;", "Lsf2/d;", "<anonymous>", "(Lsf2/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sf2.c.SelectedOperatorChange, k10.c0<sf2.d.Initialized>, tq.e<? super k10.l<? extends sf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181316f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181317g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sf2.d.Initialized O(List list, sf2.d.Initialized initialized) {
            boolean z15;
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z15 = true;
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!((OperatorItem) it.next()).getIsSelected()) {
                        z15 = false;
                    }
                }
                z15 = true;
            }
            return initialized.a(list, z15, true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sf2.c.SelectedOperatorChange selectedOperatorChange = (sf2.c.SelectedOperatorChange) this.f181316f;
            k10.c0 c0Var = (k10.c0) this.f181317g;
            uq.b.e();
            if (this.f181315e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List<OperatorItem> listC = ((sf2.d.Initialized) c0Var.a()).c();
            final ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
            for (OperatorItem operatorItemB : listC) {
                if (operatorItemB.getOperator().getId() == selectedOperatorChange.getOperatorItem().getOperator().getId()) {
                    operatorItemB = OperatorItem.b(operatorItemB, !operatorItemB.getIsSelected(), null, 2, null);
                }
                arrayList.add(operatorItemB);
            }
            return c0Var.b(new er.l() { // from class: sf2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.g.O(arrayList, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sf2.c.SelectedOperatorChange selectedOperatorChange, k10.c0<sf2.d.Initialized> c0Var, tq.e<? super k10.l<? extends sf2.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f181316f = selectedOperatorChange;
            gVar.f181317g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf2/c$b;", "<unused var>", "Lk10/c0;", "Lsf2/d$d;", "state", "Lk10/l;", "Lsf2/d;", "<anonymous>", "(Lsf2/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sf2.c.b, k10.c0<sf2.d.Initialized>, tq.e<? super k10.l<? extends sf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181319f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sf2.d.Initialized O(k10.c0 c0Var, sf2.d.Initialized initialized) {
            boolean z15 = !((sf2.d.Initialized) c0Var.a()).getSelectedAll();
            List<OperatorItem> listC = initialized.c();
            ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(OperatorItem.b((OperatorItem) it.next(), !((sf2.d.Initialized) c0Var.a()).getSelectedAll(), null, 2, null));
            }
            return initialized.a(arrayList, z15, true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f181319f;
            uq.b.e();
            if (this.f181318e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sf2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.h.O(c0Var, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sf2.c.b bVar, k10.c0<sf2.d.Initialized> c0Var, tq.e<? super k10.l<? extends sf2.d>> eVar) {
            h hVar = new h(eVar);
            hVar.f181319f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf2/c$g;", "<unused var>", "Lk10/c0;", "Lsf2/d$d;", "state", "Lk10/l;", "Lsf2/d;", "<anonymous>", "(Lsf2/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sf2.c.g, k10.c0<sf2.d.Initialized>, tq.e<? super k10.l<? extends sf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f181321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181322g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sf2.d.Initialized O(List list, sf2.d.Initialized initialized) {
            return sf2.d.Initialized.b(initialized, null, false, !list.isEmpty(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List arrayList;
            List list;
            k10.c0 c0Var = (k10.c0) this.f181322g;
            Object objE = uq.b.e();
            int i15 = this.f181321f;
            if (i15 == 0) {
                oq.u.b(obj);
                List<OperatorItem> listC = ((sf2.d.Initialized) c0Var.a()).c();
                arrayList = new ArrayList();
                for (OperatorItem operatorItem : listC) {
                    if (!operatorItem.getIsSelected()) {
                        operatorItem = null;
                    }
                    if (operatorItem != null) {
                        arrayList.add(operatorItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    v.this.setupContract.R4(((sf2.d.Initialized) c0Var.a()).c());
                    xw.b<sf2.c.f> bVarY1 = v.this.Y1();
                    sf2.c.f.d dVar = sf2.c.f.d.f181232a;
                    this.f181322g = c0Var;
                    this.f181320e = arrayList;
                    this.f181321f = 1;
                    if (bVarY1.F(dVar, this) == objE) {
                        return objE;
                    }
                    list = arrayList;
                }
                return c0Var.b(new er.l() { // from class: sf2.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.i.O(arrayList, (d.Initialized) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.f181320e;
            oq.u.b(obj);
            arrayList = list;
            return c0Var.b(new er.l() { // from class: sf2.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.i.O(arrayList, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sf2.c.g gVar, k10.c0<sf2.d.Initialized> c0Var, tq.e<? super k10.l<? extends sf2.d>> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f181322g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf2/c$c;", "<unused var>", "Lsf2/d$a;", "Loq/i0;", "<anonymous>", "(Lsf2/c$c;Lsf2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sf2.c.C4657c, sf2.d.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181324e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181324e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sf2.c.f> bVarY1 = v.this.Y1();
                sf2.c.f.b bVar = sf2.c.f.b.f181230a;
                this.f181324e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(sf2.c.C4657c c4657c, sf2.d.a aVar, tq.e<? super oq.i0> eVar) {
            return v.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf2/c$g;", "<unused var>", "Lsf2/d$a;", "Loq/i0;", "<anonymous>", "(Lsf2/c$g;Lsf2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sf2.c.g, sf2.d.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181326e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181326e;
            if (i15 == 0) {
                oq.u.b(obj);
                v.this.setupContract.R4(pq.v.n());
                xw.b<sf2.c.f> bVarY1 = v.this.Y1();
                sf2.c.f.d dVar = sf2.c.f.d.f181232a;
                this.f181326e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(sf2.c.g gVar, sf2.d.a aVar, tq.e<? super oq.i0> eVar) {
            return v.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf2/c$c;", "<unused var>", "Lsf2/d$b;", "Loq/i0;", "<anonymous>", "(Lsf2/c$c;Lsf2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<sf2.c.C4657c, sf2.d.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181328e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181328e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sf2.c.f> bVarY1 = v.this.Y1();
                sf2.c.f.b bVar = sf2.c.f.b.f181230a;
                this.f181328e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(sf2.c.C4657c c4657c, sf2.d.Error error, tq.e<? super oq.i0> eVar) {
            return v.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf2/c$h;", "<unused var>", "Lk10/c0;", "Lsf2/d$b;", "state", "Lk10/l;", "Lsf2/d;", "<anonymous>", "(Lsf2/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sf2.c.h, k10.c0<sf2.d.Error>, tq.e<? super k10.l<? extends sf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181331f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sf2.d.c O(sf2.d.Error error) {
            return sf2.d.c.f181239a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f181331f;
            uq.b.e();
            if (this.f181330e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sf2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.m.O((d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sf2.c.h hVar, k10.c0<sf2.d.Error> c0Var, tq.e<? super k10.l<? extends sf2.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f181331f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    public v(yy.a aVar, tf2.b bVar, ac4.a aVar2, hj0.c cVar, ib4.c cVar2, hb4.d dVar, sf2.f fVar) {
        this.mapper = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getAvailableOperatorsUseCase = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.setupContract = fVar;
        sf2.d.c cVar3 = sf2.d.c.f181239a;
        this.initialState = cVar3;
        this.stateMachine = aVar.a(cVar3, new er.l() { // from class: sf2.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.w9(this.f181275a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), t9(cVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(v vVar, k10.z zVar) {
        l lVar = vVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sf2.c.C4657c.class), oVar, lVar);
        zVar.v(q0.c(sf2.c.h.class), oVar, new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sf2.e.a t9(sf2.d state) {
        tf2.b bVar = this.mapper;
        er.a<oq.i0> aVarB9 = b9(sf2.c.a.f181224a);
        return bVar.b(new tf2.b.Params(state, b9(sf2.c.C4657c.f181226a), b9(sf2.c.d.f181227a), b9(sf2.c.g.f181233a), aVarB9, new er.l() { // from class: sf2.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.u9(this.f181274a, (OperatorItem) obj);
            }
        }, b9(sf2.c.b.f181225a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(v vVar, OperatorItem operatorItem) {
        vVar.d9(new sf2.c.SelectedOperatorChange(operatorItem));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(sf2.d.c.class), new er.l() { // from class: sf2.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.x9(this.f181270a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(sf2.d.Initialized.class), new er.l() { // from class: sf2.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.y9(this.f181271a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(sf2.d.a.class), new er.l() { // from class: sf2.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.z9(this.f181272a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(sf2.d.Error.class), new er.l() { // from class: sf2.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.A9(this.f181273a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(v vVar, k10.z zVar) {
        zVar.A(vVar.new c(null));
        d dVar = vVar.new d(null);
        zVar.v(q0.c(sf2.c.e.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(v vVar, k10.z zVar) {
        e eVar = vVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sf2.c.d.class), oVar, eVar);
        zVar.x(q0.c(sf2.c.a.class), oVar, vVar.new f(null));
        zVar.v(q0.c(sf2.c.SelectedOperatorChange.class), oVar, new g(null));
        zVar.v(q0.c(sf2.c.b.class), oVar, new h(null));
        zVar.v(q0.c(sf2.c.g.class), oVar, vVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(v vVar, k10.z zVar) {
        j jVar = vVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sf2.c.C4657c.class), oVar, jVar);
        zVar.x(q0.c(sf2.c.g.class), oVar, vVar.new k(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sf2.c.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sf2.d, sf2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sf2.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(sf2.e.a aVar) {
        super.P5(aVar);
    }
}
