package p71;

import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.g0;
import fr.q0;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v91.DropDownState;
import x71.ChildPassportApplicationCorrespondenceCountryData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lp71/p;", "Ll00/g;", "Lp71/b;", "Lp71/a;", "Lp71/c;", "", "Lyy/a;", "stateMachineFactory", "Lq71/b;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lol0/j;", "getCountriesDictionaryUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lr71/a;", "contract", "<init>", "(Lyy/a;Lq71/b;Lib4/c;Lol0/j;Lac4/a;Lhb4/d;Lr71/a;)V", "state", "Lp71/c$a;", "v9", "(Lp71/b;)Lp71/c$a;", "Ldx/b;", "domainError", "Lhb4/c;", "t9", "(Ldx/b;)Lhb4/c;", "b", "Lq71/b;", "c", "Lib4/c;", "d", "Lol0/j;", "e", "Lac4/a;", "f", "Lhb4/d;", "g", "Lr71/a;", "Lp71/b$b;", "h", "Lp71/b$b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lp71/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<p71.b, p71.a> implements p71.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q71.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ol0.j getCountriesDictionaryUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r71.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p71.b.C3776b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<p71.b, p71.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<p71.c.a> state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p71.a.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<p71.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f153342b;

        /* JADX INFO: renamed from: p71.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3779a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f153344b;

            /* JADX INFO: renamed from: p71.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3780a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153345d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153346e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153347f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153349h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153350j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153351k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153352l;

                public C3780a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153345d = obj;
                    this.f153346e |= PKIFailureInfo.systemUnavail;
                    return C3779a.this.F(null, this);
                }
            }

            public C3779a(mu.h hVar, p pVar) {
                this.f153343a = hVar;
                this.f153344b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3780a c3780a;
                if (eVar instanceof C3780a) {
                    c3780a = (C3780a) eVar;
                    int i15 = c3780a.f153346e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3780a.f153346e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3780a = new C3780a(eVar);
                    }
                } else {
                    c3780a = new C3780a(eVar);
                }
                Object obj2 = c3780a.f153345d;
                Object objE = uq.b.e();
                int i16 = c3780a.f153346e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f153343a;
                    p71.c.a aVarV9 = this.f153344b.v9((p71.b) obj);
                    c3780a.f153347f = vq.j.a(obj);
                    c3780a.f153349h = vq.j.a(c3780a);
                    c3780a.f153350j = vq.j.a(obj);
                    c3780a.f153351k = vq.j.a(hVar);
                    c3780a.f153352l = 0;
                    c3780a.f153346e = 1;
                    if (hVar.F(aVarV9, c3780a) == objE) {
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
            this.f153341a = gVar;
            this.f153342b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p71.c.a> hVar, tq.e eVar) {
            Object objA = this.f153341a.a(new C3779a(hVar, this.f153342b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp71/a$b;", "action", "Lp71/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp71/a$b;Lp71/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<p71.a.b, p71.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153354f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p71.a.b bVar = (p71.a.b) this.f153354f;
            Object objE = uq.b.e();
            int i15 = this.f153353e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f153354f = vq.j.a(bVar);
                this.f153353e = 1;
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p71.a.b bVar, p71.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = p.this.new b(eVar);
            bVar3.f153354f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lp71/b$b;", "state", "Lk10/l;", "Lp71/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<p71.b.C3776b>, tq.e<? super k10.l<? extends p71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153357f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lp71/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends p71.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f153359e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f153360f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<p71.b.C3776b> f153361g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<p71.b.C3776b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f153360f = pVar;
                this.f153361g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p71.b.Error X(p pVar, dx.b bVar, p71.b.C3776b c3776b) {
                return new p71.b.Error(pVar.t9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p71.b Y(p pVar, List list, p71.b.C3776b c3776b) {
                Integer numValueOf;
                BEPassportChildApplicationCountryDictionary country;
                g0 passportOfficePlace = pVar.contract.I0().getPassportOfficePlace();
                if (passportOfficePlace == null) {
                    return new p71.b.Error(pVar.t9(new dx.b.Generic(null, 1, null)));
                }
                ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryDataT1 = pVar.contract.t1();
                if (childPassportApplicationCorrespondenceCountryDataT1 == null || (country = childPassportApplicationCorrespondenceCountryDataT1.getCountry()) == null) {
                    numValueOf = null;
                } else {
                    Iterator it = list.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i15 = -1;
                            break;
                        }
                        if (fr.t.c(((BEPassportChildApplicationCountryDictionary) it.next()).getIsoCode(), country.getIsoCode())) {
                            break;
                        }
                        i15++;
                    }
                    numValueOf = Integer.valueOf(i15);
                }
                DropDownState dropDownState = new DropDownState(numValueOf, null, 2, null);
                ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryDataT2 = pVar.contract.t1();
                return new p71.b.Initialized(list, dropDownState, childPassportApplicationCorrespondenceCountryDataT2 != null ? childPassportApplicationCorrespondenceCountryDataT2.getCountry() : null, passportOfficePlace);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f153359e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ol0.j jVar = this.f153360f.getCountriesDictionaryUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f153359e = 1;
                    obj = jVar.c(c1792a, this);
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
                c0<p71.b.C3776b> c0Var = this.f153361g;
                final p pVar = this.f153360f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: p71.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.c.a.X(pVar, bVar, (b.C3776b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: p71.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.c.a.Y(pVar, list, (b.C3776b) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f153360f, this.f153361g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends p71.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f153357f;
            Object objE = uq.b.e();
            int i15 = this.f153356e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p.this, c0Var, null);
            this.f153357f = vq.j.a(c0Var);
            this.f153356e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<p71.b.C3776b> c0Var, tq.e<? super k10.l<? extends p71.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f153357f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp71/a$d;", "<unused var>", "Lk10/c0;", "Lp71/b$a;", "state", "Lk10/l;", "Lp71/b;", "<anonymous>", "(Lp71/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<p71.a.d, c0<p71.b.Error>, tq.e<? super k10.l<? extends p71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153363f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p71.b.C3776b O(p71.b.Error error) {
            return p71.b.C3776b.f153302a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f153363f;
            uq.b.e();
            if (this.f153362e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: p71.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p71.a.d dVar, c0<p71.b.Error> c0Var, tq.e<? super k10.l<? extends p71.b>> eVar) {
            d dVar2 = new d(eVar);
            dVar2.f153363f = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp71/a$a;", "<unused var>", "Lp71/b$a;", "Loq/i0;", "<anonymous>", "(Lp71/a$a;Lp71/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<p71.a.C3773a, p71.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153364e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f153364e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(p71.a.b.C3774a.f153293a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p71.a.C3773a c3773a, p71.b.Error error, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp71/a$e;", "<unused var>", "Lp71/b$c;", "state", "Loq/i0;", "<anonymous>", "(Lp71/a$e;Lp71/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<p71.a.e, p71.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153367f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p71.b.Initialized initialized = (p71.b.Initialized) this.f153367f;
            uq.b.e();
            if (this.f153366e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(new p71.a.b.ToCorrespondencePicker(initialized.c()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p71.a.e eVar, p71.b.Initialized initialized, tq.e<? super i0> eVar2) {
            f fVar = p.this.new f(eVar2);
            fVar.f153367f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp71/a$c;", "<unused var>", "Lk10/c0;", "Lp71/b$c;", "state", "Lk10/l;", "Lp71/b;", "<anonymous>", "(Lp71/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<p71.a.c, c0<p71.b.Initialized>, tq.e<? super k10.l<? extends p71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153370f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p71.b.Initialized O(p71.b.Initialized initialized) {
            return p71.b.Initialized.b(initialized, null, new DropDownState(null, new hz.b.Invalid(null, 1, null), 1, null), null, null, 13, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r6.F(r2, r5) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        
            if (r6.F(r2, r5) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f153370f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f153369e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L66
            L1f:
                oq.u.b(r6)
                java.lang.Object r6 = r0.a()
                p71.b$c r6 = (p71.b.Initialized) r6
                cl0.o r6 = r6.getSelectedCountry()
                if (r6 == 0) goto L6b
                java.lang.Object r6 = r0.a()
                p71.b$c r6 = (p71.b.Initialized) r6
                cl0.o r6 = r6.getSelectedCountry()
                if (r6 == 0) goto L3f
                java.lang.String r6 = r6.getIsoCode()
                goto L40
            L3f:
                r6 = 0
            L40:
                java.lang.String r2 = "616"
                boolean r6 = fr.t.c(r6, r2)
                if (r6 == 0) goto L57
                p71.p r6 = p71.p.this
                p71.a$b$e r2 = p71.a.b.e.f153297a
                r5.f153370f = r0
                r5.f153369e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L66
                goto L65
            L57:
                p71.p r6 = p71.p.this
                p71.a$b$d r2 = p71.a.b.d.f153296a
                r5.f153370f = r0
                r5.f153369e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L66
            L65:
                return r1
            L66:
                k10.l r6 = r0.c()
                return r6
            L6b:
                p71.t r6 = new p71.t
                r6.<init>()
                k10.l r6 = r0.b(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p71.p.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p71.a.c cVar, c0<p71.b.Initialized> c0Var, tq.e<? super k10.l<? extends p71.b>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f153370f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, q71.b bVar, ib4.c cVar, ol0.j jVar, ac4.a aVar2, hb4.d dVar, r71.a aVar3) {
        this.mapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.getCountriesDictionaryUC = jVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.errorVMSFactory = dVar;
        this.contract = aVar3;
        p71.b.C3776b c3776b = p71.b.C3776b.f153302a;
        this.initialState = c3776b;
        this.stateMachine = aVar.a(c3776b, new er.l() { // from class: p71.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f153330a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), v9(c3776b));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(p71.a.d.class), oVar, dVar);
        zVar.x(q0.c(p71.a.C3773a.class), oVar, pVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(p pVar, z zVar) {
        f fVar = pVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p71.a.e.class), oVar, fVar);
        zVar.v(q0.c(p71.a.c.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c t9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: p71.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f153329a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            pVar.d9(p71.a.b.C3774a.f153293a);
        } else {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            pVar.d9(p71.a.d.f153299a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p71.c.a v9(p71.b state) {
        return this.mapper.b(new q71.b.Params(state, b9(p71.a.b.C3774a.f153293a), b9(p71.a.b.C3775b.f153294a), b9(p71.a.c.f153298a), b9(p71.a.e.f153300a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(p71.b.class), new er.l() { // from class: p71.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f153325a, (z) obj);
            }
        });
        vVar.c(q0.c(p71.b.C3776b.class), new er.l() { // from class: p71.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f153326a, (z) obj);
            }
        });
        vVar.c(q0.c(p71.b.Error.class), new er.l() { // from class: p71.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f153327a, (z) obj);
            }
        });
        vVar.c(q0.c(p71.b.Initialized.class), new er.l() { // from class: p71.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f153328a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(p71.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(p pVar, z zVar) {
        zVar.A(pVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p71.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<p71.b, p71.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p71.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p71.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(r71.a aVar) {
        super.P5(aVar);
    }
}
