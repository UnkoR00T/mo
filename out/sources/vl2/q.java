package vl2;

import fr.q0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl2.EntryDetailsData;
import sq0.BENationalCourtRegister;
import sq0.BENationalCourtRegisterEntry;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u001d0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lvl2/q;", "Ll00/g;", "Lvl2/b;", "Lvl2/a;", "Lvl2/c;", "", "Lyy/a;", "stateMachineFactory", "Luq0/d;", "bEGetNationalCourtRegisterEntriesUC", "Lwl2/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lac4/a;", "loaderUseCase", "Lml2/c;", "monitorSubscriptionUC", "<init>", "(Lyy/a;Luq0/d;Lwl2/b;Lhb4/d;Lib4/c;Lac4/a;Lml2/c;)V", "", "Lsq0/h;", "newEntry", "B9", "(Ljava/util/List;Lsq0/h;)Ljava/util/List;", "w9", "(Ljava/util/List;)Ljava/util/List;", "Lvl2/c$a;", "t9", "(Lvl2/b;)Lvl2/c$a;", "b", "Luq0/d;", "c", "Lwl2/b;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lml2/c;", "Lvl2/b$c;", "h", "Lvl2/b$c;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lvl2/a$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<vl2.b, vl2.a> implements vl2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uq0.d bEGetNationalCourtRegisterEntriesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wl2.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ml2.c monitorSubscriptionUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final vl2.b.c initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<vl2.b, vl2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vl2.a.InterfaceC5428a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<vl2.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((BENationalCourtRegisterEntry) t15).getNumber(), ((BENationalCourtRegisterEntry) t16).getNumber());
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<vl2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f207302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f207303b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f207304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f207305b;

            /* JADX INFO: renamed from: vl2.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5435a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f207306d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f207307e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f207308f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f207310h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f207311j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f207312k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f207313l;

                public C5435a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f207306d = obj;
                    this.f207307e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f207304a = hVar;
                this.f207305b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5435a c5435a;
                if (eVar instanceof C5435a) {
                    c5435a = (C5435a) eVar;
                    int i15 = c5435a.f207307e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5435a.f207307e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5435a = new C5435a(eVar);
                    }
                } else {
                    c5435a = new C5435a(eVar);
                }
                Object obj2 = c5435a.f207306d;
                Object objE = uq.b.e();
                int i16 = c5435a.f207307e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f207304a;
                    vl2.c.a aVarT9 = this.f207305b.t9((vl2.b) obj);
                    c5435a.f207308f = vq.j.a(obj);
                    c5435a.f207310h = vq.j.a(c5435a);
                    c5435a.f207311j = vq.j.a(obj);
                    c5435a.f207312k = vq.j.a(hVar);
                    c5435a.f207313l = 0;
                    c5435a.f207307e = 1;
                    if (hVar.F(aVarT9, c5435a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f207302a = gVar;
            this.f207303b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super vl2.c.a> hVar, tq.e eVar) {
            Object objA = this.f207302a.a(new a(hVar, this.f207303b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvl2/a$c;", "<unused var>", "Lk10/c0;", "Lvl2/b;", "state", "Lk10/l;", "<anonymous>", "(Lvl2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<vl2.a.c, c0<vl2.b>, tq.e<? super k10.l<? extends vl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207315f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lvl2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends vl2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f207317e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f207318f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<vl2.b> f207319g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<vl2.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f207318f = qVar;
                this.f207319g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vl2.b Y(final q qVar, dx.b bVar, vl2.b bVar2) {
                return new vl2.b.Error(qVar.errorVMSFactory.a(qVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: vl2.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.c.a.Z(qVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(q qVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    qVar.d9(vl2.a.c.f207259a);
                } else {
                    qVar.d9(vl2.a.InterfaceC5428a.C5429a.f207256a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vl2.b.Content a0(BENationalCourtRegister bENationalCourtRegister, q qVar, vl2.b bVar) {
                return new vl2.b.Content(BENationalCourtRegister.e(bENationalCourtRegister, qVar.w9(bENationalCourtRegister.h()), 0, 0, 6, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f207317e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    uq0.d dVar = this.f207318f.bEGetNationalCourtRegisterEntriesUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f207317e = 1;
                    obj = dVar.c(c1792a, this);
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
                c0<vl2.b> c0Var = this.f207319g;
                final q qVar = this.f207318f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.b(new er.l() { // from class: vl2.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.c.a.Y(qVar, bVar, (b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BENationalCourtRegister bENationalCourtRegister = (BENationalCourtRegister) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: vl2.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.a.a0(bENationalCourtRegister, qVar, (b) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f207318f, this.f207319g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends vl2.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f207315f;
            Object objE = uq.b.e();
            int i15 = this.f207314e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.loaderUseCase;
            a aVar2 = new a(q.this, c0Var, null);
            this.f207315f = vq.j.a(c0Var);
            this.f207314e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vl2.a.c cVar, c0<vl2.b> c0Var, tq.e<? super k10.l<? extends vl2.b>> eVar) {
            c cVar2 = q.this.new c(eVar);
            cVar2.f207315f = c0Var;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvl2/a$a;", "action", "Lvl2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvl2/a$a;Lvl2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<vl2.a.InterfaceC5428a, vl2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207321f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vl2.a.InterfaceC5428a interfaceC5428a = (vl2.a.InterfaceC5428a) this.f207321f;
            Object objE = uq.b.e();
            int i15 = this.f207320e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<vl2.a.InterfaceC5428a> bVarY1 = q.this.Y1();
                this.f207321f = vq.j.a(interfaceC5428a);
                this.f207320e = 1;
                if (bVarY1.F(interfaceC5428a, this) == objE) {
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
        public final Object w(vl2.a.InterfaceC5428a interfaceC5428a, vl2.b bVar, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f207321f = interfaceC5428a;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvl2/a$b;", "action", "Lvl2/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lvl2/a$b;Lvl2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<vl2.a.OnClickedEntry, vl2.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207325g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vl2.a.OnClickedEntry onClickedEntry = (vl2.a.OnClickedEntry) this.f207324f;
            vl2.b.Content content = (vl2.b.Content) this.f207325g;
            uq.b.e();
            if (this.f207323e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new vl2.a.InterfaceC5428a.ToEntryDetails(new EntryDetailsData(onClickedEntry.getItem(), content.getNationalCourtRegister().getMaxNumberOfSubscriptionPerPesel(), content.getNationalCourtRegister().getMaxNumberOfDaysForSubscription(), content.getNationalCourtRegister().c())));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vl2.a.OnClickedEntry onClickedEntry, vl2.b.Content content, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f207324f = onClickedEntry;
            eVar2.f207325g = content;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsq0/h;", "entry", "Lvl2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsq0/h;Lvl2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<BENationalCourtRegisterEntry, vl2.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207328f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BENationalCourtRegisterEntry bENationalCourtRegisterEntry = (BENationalCourtRegisterEntry) this.f207328f;
            uq.b.e();
            if (this.f207327e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new vl2.a.UpdateEntry(bENationalCourtRegisterEntry));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(BENationalCourtRegisterEntry bENationalCourtRegisterEntry, vl2.b.Content content, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f207328f = bENationalCourtRegisterEntry;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvl2/a$d;", "action", "Lk10/c0;", "Lvl2/b$a;", "state", "Lk10/l;", "Lvl2/b;", "<anonymous>", "(Lvl2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<vl2.a.UpdateEntry, c0<vl2.b.Content>, tq.e<? super k10.l<? extends vl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207332g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vl2.b.Content O(q qVar, vl2.a.UpdateEntry updateEntry, vl2.b.Content content) {
            return content.a(BENationalCourtRegister.e(content.getNationalCourtRegister(), qVar.w9(qVar.B9(content.getNationalCourtRegister().h(), updateEntry.getEntry())), 0, 0, 6, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vl2.a.UpdateEntry updateEntry = (vl2.a.UpdateEntry) this.f207331f;
            c0 c0Var = (c0) this.f207332g;
            uq.b.e();
            if (this.f207330e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: vl2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O(qVar, updateEntry, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vl2.a.UpdateEntry updateEntry, c0<vl2.b.Content> c0Var, tq.e<? super k10.l<? extends vl2.b>> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f207331f = updateEntry;
            gVar.f207332g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvl2/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvl2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<vl2.b.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207334e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f207334e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(vl2.a.c.f207259a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(vl2.b.c cVar, tq.e<? super i0> eVar) {
            return ((h) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return q.this.new h(eVar);
        }
    }

    public q(yy.a aVar, uq0.d dVar, wl2.b bVar, hb4.d dVar2, ib4.c cVar, ac4.a aVar2, ml2.c cVar2) {
        this.bEGetNationalCourtRegisterEntriesUC = dVar;
        this.mapper = bVar;
        this.errorVMSFactory = dVar2;
        this.errorMapper = cVar;
        this.loaderUseCase = aVar2;
        this.monitorSubscriptionUC = cVar2;
        vl2.b.c cVar3 = vl2.b.c.f207263a;
        this.initialState = cVar3;
        this.stateMachine = aVar.a(cVar3, new er.l() { // from class: vl2.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f207287a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), t9(cVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(q qVar, z zVar) {
        zVar.C(qVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BENationalCourtRegisterEntry> B9(List<BENationalCourtRegisterEntry> list, BENationalCourtRegisterEntry bENationalCourtRegisterEntry) {
        Iterator<BENationalCourtRegisterEntry> it = list.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            if (sq0.d.b(it.next().getIdKrs(), bENationalCourtRegisterEntry.getIdKrs())) {
                break;
            }
            i15++;
        }
        if (i15 == -1) {
            return list;
        }
        List<BENationalCourtRegisterEntry> listI1 = pq.v.i1(list);
        listI1.set(i15, bENationalCourtRegisterEntry);
        return listI1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vl2.c.a t9(vl2.b bVar) {
        return this.mapper.b(new wl2.b.Params(bVar, b9(vl2.a.InterfaceC5428a.C5429a.f207256a), new er.l() { // from class: vl2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f207291a, (BENationalCourtRegisterEntry) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, BENationalCourtRegisterEntry bENationalCourtRegisterEntry) {
        qVar.d9(new vl2.a.OnClickedEntry(bENationalCourtRegisterEntry));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BENationalCourtRegisterEntry> w9(List<BENationalCourtRegisterEntry> list) {
        return pq.v.U0(list, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(vl2.b.class), new er.l() { // from class: vl2.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f207288a, (z) obj);
            }
        });
        vVar.c(q0.c(vl2.b.Content.class), new er.l() { // from class: vl2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f207289a, (z) obj);
            }
        });
        vVar.c(q0.c(vl2.b.c.class), new er.l() { // from class: vl2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.A9(this.f207290a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(vl2.a.c.class), oVar, cVar);
        zVar.x(q0.c(vl2.a.InterfaceC5428a.class), oVar, qVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, z zVar) {
        e eVar = qVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(vl2.a.OnClickedEntry.class), oVar, eVar);
        k10.k.s(zVar, qVar.monitorSubscriptionUC.b(gz.b.a.C1792a.f78542a), null, qVar.new f(null), 2, null);
        zVar.v(q0.c(vl2.a.UpdateEntry.class), oVar, qVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<vl2.a.InterfaceC5428a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<vl2.b, vl2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<vl2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
