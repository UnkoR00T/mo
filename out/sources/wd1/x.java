package wd1;

import f00.j0;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rd1.EdorAddressData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005:\u0001:B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lwd1/x;", "Ll00/g;", "Lwd1/h;", "", "Lwd1/i;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lxd1/c;", "mapper", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Lod1/a;", "contract", "<init>", "(Lyy/a;Lxd1/c;La14/w;Li70/e;Lod1/a;)V", "state", "Lwd1/i$a;", "o9", "(Lwd1/h;)Lwd1/i$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lxd1/c;", "c", "La14/w;", "d", "Li70/e;", "e", "Lod1/a;", "Lwd1/h$b;", "f", "Lwd1/h$b;", "initialState", "Lxw/b;", "Lwd1/d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<wd1.h, Object> implements wd1.i, zx.b, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xd1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final od1.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wd1.h.Initialized initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wd1.d> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<wd1.h, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<wd1.i.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwd1/x$a;", "Lf00/j0;", "Lod1/a;", "Lwd1/x;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<od1.a, x> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<wd1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f212436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f212437b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f212438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f212439b;

            /* JADX INFO: renamed from: wd1.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5599a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f212440d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f212441e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f212442f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f212444h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f212445j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f212446k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f212447l;

                public C5599a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f212440d = obj;
                    this.f212441e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f212438a = hVar;
                this.f212439b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5599a c5599a;
                if (eVar instanceof C5599a) {
                    c5599a = (C5599a) eVar;
                    int i15 = c5599a.f212441e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5599a.f212441e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5599a = new C5599a(eVar);
                    }
                } else {
                    c5599a = new C5599a(eVar);
                }
                Object obj2 = c5599a.f212440d;
                Object objE = uq.b.e();
                int i16 = c5599a.f212441e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f212438a;
                    wd1.i.a aVarO9 = this.f212439b.o9((wd1.h) obj);
                    c5599a.f212442f = vq.j.a(obj);
                    c5599a.f212444h = vq.j.a(c5599a);
                    c5599a.f212445j = vq.j.a(obj);
                    c5599a.f212446k = vq.j.a(hVar);
                    c5599a.f212447l = 0;
                    c5599a.f212441e = 1;
                    if (hVar.F(aVarO9, c5599a) == objE) {
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

        public b(mu.g gVar, x xVar) {
            this.f212436a = gVar;
            this.f212437b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wd1.i.a> hVar, tq.e eVar) {
            Object objA = this.f212436a.a(new a(hVar, this.f212437b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwd1/a;", "<unused var>", "Lwd1/h$b;", "Loq/i0;", "<anonymous>", "(Lwd1/a;Lwd1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<wd1.a, wd1.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212448e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212448e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wd1.d> bVarY1 = x.this.Y1();
                wd1.d.a aVar = wd1.d.a.f212377a;
                this.f212448e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(wd1.a aVar, wd1.h.Initialized initialized, tq.e<? super i0> eVar) {
            return x.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwd1/b;", "<unused var>", "Lwd1/h$b;", "Loq/i0;", "<anonymous>", "(Lwd1/b;Lwd1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wd1.b, wd1.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212450e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212450e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wd1.d> bVarY1 = x.this.Y1();
                wd1.d.b bVar = wd1.d.b.f212378a;
                this.f212450e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(wd1.b bVar, wd1.h.Initialized initialized, tq.e<? super i0> eVar) {
            return x.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwd1/h$b;", "it", "Lk10/l;", "Lwd1/h;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<wd1.h.Initialized>, tq.e<? super k10.l<? extends wd1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212453f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd1.h.Initialized O(x xVar, wd1.h.Initialized initialized) {
            EdorAddressData edorAddressDataE1 = xVar.contract.E1();
            return wd1.h.Initialized.b(initialized, edorAddressDataE1 != null ? edorAddressDataE1.getSelection() : null, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f212453f;
            uq.b.e();
            if (this.f212452e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x xVar = x.this;
            return c0Var.b(new er.l() { // from class: wd1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(xVar, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<wd1.h.Initialized> c0Var, tq.e<? super k10.l<? extends wd1.h>> eVar) {
            return ((e) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f212453f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd1/g;", "action", "Lk10/c0;", "Lwd1/h$b;", "state", "Lk10/l;", "Lwd1/h;", "<anonymous>", "(Lwd1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<Select, k10.c0<wd1.h.Initialized>, tq.e<? super k10.l<? extends wd1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f212457g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd1.h.Initialized O(Select select, wd1.h.Initialized initialized) {
            return wd1.h.Initialized.b(initialized, select.getAnswer(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Select select = (Select) this.f212456f;
            k10.c0 c0Var = (k10.c0) this.f212457g;
            uq.b.e();
            if (this.f212455e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wd1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.O(select, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Select select, k10.c0<wd1.h.Initialized> c0Var, tq.e<? super k10.l<? extends wd1.h>> eVar) {
            f fVar = new f(eVar);
            fVar.f212456f = select;
            fVar.f212457g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd1/c;", "<unused var>", "Lk10/c0;", "Lwd1/h$b;", "state", "Lk10/l;", "Lwd1/h;", "<anonymous>", "(Lwd1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<wd1.c, k10.c0<wd1.h.Initialized>, tq.e<? super k10.l<? extends wd1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212459f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd1.h.InfoPage O(k10.c0 c0Var, wd1.h.Initialized initialized) {
            return new wd1.h.InfoPage(((wd1.h.Initialized) c0Var.a()).getAnswer());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212459f;
            uq.b.e();
            if (this.f212458e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: wd1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.O(c0Var, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wd1.c cVar, k10.c0<wd1.h.Initialized> c0Var, tq.e<? super k10.l<? extends wd1.h>> eVar) {
            g gVar = new g(eVar);
            gVar.f212459f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd1/e;", "<unused var>", "Lk10/c0;", "Lwd1/h$b;", "state", "Lk10/l;", "Lwd1/h;", "<anonymous>", "(Lwd1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<wd1.e, k10.c0<wd1.h.Initialized>, tq.e<? super k10.l<? extends wd1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212461f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f212463a;

            static {
                int[] iArr = new int[rd1.c.values().length];
                try {
                    iArr[rd1.c.CREATE_NEW_ADDRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[rd1.c.OWN_NOT_PUBLIC_ADDRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f212463a = iArr;
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd1.h.Initialized O(wd1.h.Initialized initialized) {
            return wd1.h.Initialized.b(initialized, rd1.c.NONE, null, 2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r6.F(r2, r5) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        
            if (r6.F(r2, r5) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f212461f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f212460e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L67
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                goto L8a
            L22:
                oq.u.b(r6)
                java.lang.Object r6 = r0.a()
                wd1.h$b r6 = (wd1.h.Initialized) r6
                rd1.c r6 = r6.getAnswer()
                if (r6 != 0) goto L33
                r6 = -1
                goto L3b
            L33:
                int[] r2 = wd1.x.h.a.f212463a
                int r6 = r6.ordinal()
                r6 = r2[r6]
            L3b:
                if (r6 == r4) goto L6c
                if (r6 == r3) goto L49
                wd1.b0 r6 = new wd1.b0
                r6.<init>()
                k10.l r6 = r0.b(r6)
                return r6
            L49:
                wd1.x r6 = wd1.x.this
                od1.a r6 = wd1.x.l9(r6)
                rd1.c r2 = rd1.c.OWN_NOT_PUBLIC_ADDRESS
                r6.y4(r2)
                wd1.x r6 = wd1.x.this
                xw.b r6 = r6.Y1()
                wd1.d$d r2 = wd1.d.C5597d.f212380a
                r5.f212461f = r0
                r5.f212460e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L67
                goto L89
            L67:
                k10.l r6 = r0.c()
                return r6
            L6c:
                wd1.x r6 = wd1.x.this
                od1.a r6 = wd1.x.l9(r6)
                rd1.c r2 = rd1.c.CREATE_NEW_ADDRESS
                r6.y4(r2)
                wd1.x r6 = wd1.x.this
                xw.b r6 = r6.Y1()
                wd1.d$c r2 = wd1.d.c.f212379a
                r5.f212461f = r0
                r5.f212460e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L8a
            L89:
                return r1
            L8a:
                k10.l r6 = r0.c()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wd1.x.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wd1.e eVar, k10.c0<wd1.h.Initialized> c0Var, tq.e<? super k10.l<? extends wd1.h>> eVar2) {
            h hVar = x.this.new h(eVar2);
            hVar.f212461f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd1/a;", "<unused var>", "Lk10/c0;", "Lwd1/h$a;", "state", "Lk10/l;", "Lwd1/h;", "<anonymous>", "(Lwd1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<wd1.a, k10.c0<wd1.h.InfoPage>, tq.e<? super k10.l<? extends wd1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212465f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd1.h.Initialized O(k10.c0 c0Var, x xVar, wd1.h.InfoPage infoPage) {
            return new wd1.h.Initialized(((wd1.h.InfoPage) c0Var.a()).getAnswer(), xVar.contract.H());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212465f;
            uq.b.e();
            if (this.f212464e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x xVar = x.this;
            return c0Var.d(new er.l() { // from class: wd1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.O(c0Var, xVar, (h.InfoPage) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wd1.a aVar, k10.c0<wd1.h.InfoPage> c0Var, tq.e<? super k10.l<? extends wd1.h>> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f212465f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwd1/f;", "action", "Lwd1/h$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwd1/f;Lwd1/h$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<OpenUrl, wd1.h.InfoPage, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212468f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f212468f;
            Object objE = uq.b.e();
            int i15 = this.f212467e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = x.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f212468f = vq.j.a(openUrl);
                this.f212467e = 1;
                obj = wVar.c(params, this);
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
            x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                xVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, wd1.h.InfoPage infoPage, tq.e<? super i0> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f212468f = openUrl;
            return jVar.J(i0.f148189a);
        }
    }

    public x(yy.a aVar, xd1.c cVar, a14.w wVar, i70.e eVar, od1.a aVar2) {
        this.mapper = cVar;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.contract = aVar2;
        wd1.h.Initialized initialized = new wd1.h.Initialized(null, aVar2.H());
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: wd1.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.s9(this.f212427a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), o9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wd1.i.a o9(wd1.h state) {
        return this.mapper.b(new xd1.c.Params(state, new er.l() { // from class: wd1.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.p9(this.f212425a, (rd1.c) obj);
            }
        }, new er.l() { // from class: wd1.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.q9(this.f212426a, (String) obj);
            }
        }, b9(wd1.c.f212374a), b9(wd1.e.f212381a), b9(wd1.a.f212371a), b9(wd1.b.f212373a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(x xVar, rd1.c cVar) {
        xVar.d9(new Select(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(x xVar, String str) {
        xVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(wd1.h.Initialized.class), new er.l() { // from class: wd1.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.t9(this.f212423a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(wd1.h.InfoPage.class), new er.l() { // from class: wd1.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.u9(this.f212424a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(x xVar, k10.z zVar) {
        c cVar = xVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wd1.a.class), oVar, cVar);
        zVar.x(q0.c(wd1.b.class), oVar, xVar.new d(null));
        zVar.A(xVar.new e(null));
        zVar.v(q0.c(Select.class), oVar, new f(null));
        zVar.v(q0.c(wd1.c.class), oVar, new g(null));
        zVar.v(q0.c(wd1.e.class), oVar, xVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(x xVar, k10.z zVar) {
        i iVar = xVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(wd1.a.class), oVar, iVar);
        zVar.x(q0.c(OpenUrl.class), oVar, xVar.new j(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<wd1.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<wd1.h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wd1.i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
