package yl1;

import al0.BEGenerateXmlResponse;
import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019JN\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"\"\b\b\u0000\u0010\u001a*\u00020\u0002*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0082@¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010%\u001a\b\u0012\u0004\u0012\u00020&0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00020N*\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lyl1/a0;", "Ll00/g;", "Lyl1/d;", "Lyl1/c;", "Lyl1/i;", "", "Lyy/a;", "stateMachineFactory", "Lam1/h;", "mapper", "Lac4/a;", "callActionWithLoaderUC", "Lwk1/a;", "generateXmlUC", "Lwz3/j;", "signBase64XmlUC", "Lwk1/b;", "submitXmlUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lzl1/a;", "contract", "<init>", "(Lyy/a;Lam1/h;Lac4/a;Lwk1/a;Lwz3/j;Lwk1/b;Lhb4/d;Lib4/c;Lzl1/a;)V", "T", "Lk10/c0;", "Lk44/a;", "error", "Lkotlin/Function2;", "Lhb4/c;", "Lyl1/d$a;", "errorStateProvider", "Lk10/l;", "C9", "(Lk10/c0;Lk44/a;Ler/p;Ltq/e;)Ljava/lang/Object;", "state", "Lyl1/i$a;", "A9", "(Lyl1/d;)Lyl1/i$a;", "b", "Lam1/h;", "c", "Lac4/a;", "d", "Lwk1/a;", "e", "Lwz3/j;", "f", "Lwk1/b;", "g", "Lhb4/d;", "h", "Lib4/c;", "Lyl1/d$b;", "j", "Lyl1/d$b;", "initialState", "Lxw/b;", "Lyl1/c$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Ljb4/b;", "z9", "(Ldx/b;)Ljb4/b;", "errorData", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<yl1.d, yl1.c> implements yl1.i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final am1.h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wk1.a generateXmlUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wz3.j signBase64XmlUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wk1.b submitXmlUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final yl1.d.Initialized initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yl1.c.a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yl1.d, yl1.c> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<yl1.i.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a<T extends yl1.d> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f227647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f227648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f227649g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f227650h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f227651j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f227652k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f227654m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227652k = obj;
            this.f227654m |= PKIFailureInfo.systemUnavail;
            return a0.this.C9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<yl1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f227655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f227656b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f227657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f227658b;

            /* JADX INFO: renamed from: yl1.a0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6107a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f227659d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f227660e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f227661f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f227663h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f227664j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f227665k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f227666l;

                public C6107a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f227659d = obj;
                    this.f227660e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a0 a0Var) {
                this.f227657a = hVar;
                this.f227658b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6107a c6107a;
                if (eVar instanceof C6107a) {
                    c6107a = (C6107a) eVar;
                    int i15 = c6107a.f227660e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6107a.f227660e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6107a = new C6107a(eVar);
                    }
                } else {
                    c6107a = new C6107a(eVar);
                }
                Object obj2 = c6107a.f227659d;
                Object objE = uq.b.e();
                int i16 = c6107a.f227660e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f227657a;
                    yl1.i.a aVarA9 = this.f227658b.A9((yl1.d) obj);
                    c6107a.f227661f = vq.j.a(obj);
                    c6107a.f227663h = vq.j.a(c6107a);
                    c6107a.f227664j = vq.j.a(obj);
                    c6107a.f227665k = vq.j.a(hVar);
                    c6107a.f227666l = 0;
                    c6107a.f227660e = 1;
                    if (hVar.F(aVarA9, c6107a) == objE) {
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

        public b(mu.g gVar, a0 a0Var) {
            this.f227655a = gVar;
            this.f227656b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super yl1.i.a> hVar, tq.e eVar) {
            Object objA = this.f227655a.a(new a(hVar, this.f227656b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/c$h;", "action", "Lk10/c0;", "Lyl1/d$b;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yl1.c.OnStatementChecked, k10.c0<yl1.d.Initialized>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f227669g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yl1.d.Initialized O(yl1.c.OnStatementChecked onStatementChecked, yl1.d.Initialized initialized) {
            return yl1.d.Initialized.e(initialized, null, null, yl1.d.StatementData.b(initialized.getStatementData(), onStatementChecked.getChecked(), false, false, 4, null), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yl1.c.OnStatementChecked onStatementChecked = (yl1.c.OnStatementChecked) this.f227668f;
            k10.c0 c0Var = (k10.c0) this.f227669g;
            uq.b.e();
            if (this.f227667e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yl1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.c.O(onStatementChecked, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.c.OnStatementChecked onStatementChecked, k10.c0<yl1.d.Initialized> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            c cVar = new c(eVar);
            cVar.f227668f = onStatementChecked;
            cVar.f227669g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/c$g;", "<unused var>", "Lk10/c0;", "Lyl1/d$b;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yl1.c.g, k10.c0<yl1.d.Initialized>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227671f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yl1.d.Initialized O(yl1.d.Initialized initialized) {
            return yl1.d.Initialized.e(initialized, null, null, yl1.d.StatementData.b(initialized.getStatementData(), false, false, false, 3, null), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227671f;
            uq.b.e();
            if (this.f227670e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yl1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.d.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.c.g gVar, k10.c0<yl1.d.Initialized> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            d dVar = new d(eVar);
            dVar.f227671f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyl1/c$b;", "<unused var>", "Lyl1/d$b;", "Loq/i0;", "<anonymous>", "(Lyl1/c$b;Lyl1/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yl1.c.b, yl1.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227672e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227672e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                yl1.c.a.C6108a c6108a = yl1.c.a.C6108a.f227719a;
                this.f227672e = 1;
                if (a0Var.F(c6108a, this) == objE) {
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
        public final Object w(yl1.c.b bVar, yl1.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyl1/c$c;", "<unused var>", "Lyl1/d$b;", "Loq/i0;", "<anonymous>", "(Lyl1/c$c;Lyl1/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yl1.c.C6110c, yl1.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227674e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227674e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                yl1.c.a.b bVar = yl1.c.a.b.f227720a;
                this.f227674e = 1;
                if (a0Var.F(bVar, this) == objE) {
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
        public final Object w(yl1.c.C6110c c6110c, yl1.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/c$e;", "<unused var>", "Lk10/c0;", "Lyl1/d$b;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yl1.c.e, k10.c0<yl1.d.Initialized>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227677f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yl1.d.Initialized V(yl1.d.Initialized initialized) {
            return yl1.d.Initialized.e(initialized, null, null, yl1.d.StatementData.b(initialized.getStatementData(), false, true, true, 1, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Generating X(yl1.d.Initialized initialized) {
            return new Generating(initialized.getType(), initialized.getModel(), initialized.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227677f;
            uq.b.e();
            if (this.f227676e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean isChecked = ((yl1.d.Initialized) c0Var.a()).getStatementData().getIsChecked();
            if (!isChecked) {
                return c0Var.b(new er.l() { // from class: yl1.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.g.V((d.Initialized) obj2);
                    }
                });
            }
            if (isChecked) {
                return c0Var.d(new er.l() { // from class: yl1.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.g.X((d.Initialized) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.c.e eVar, k10.c0<yl1.d.Initialized> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f227677f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyl1/f;", "it", "Loq/i0;", "<anonymous>", "(Lyl1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<Generating, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227678e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f227678e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(yl1.c.d.f227725a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Generating generating, tq.e<? super oq.i0> eVar) {
            return ((h) v(generating, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/c$d;", "<unused var>", "Lk10/c0;", "Lyl1/f;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yl1.c.d, k10.c0<Generating>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227681f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyl1/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yl1.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f227683e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f227684f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f227685g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f227686h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f227687j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ a0 f227688k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<Generating> f227689l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, k10.c0<Generating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f227688k = a0Var;
                this.f227689l = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yl1.d.a X(Generating generating, hb4.c cVar) {
                return new Error(cVar, generating.getType(), generating.getModel(), generating.getStatementData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Submitting Y(BEGenerateXmlResponse bEGenerateXmlResponse, Generating generating) {
                return new Submitting(generating.getType(), generating.getModel(), generating.getStatementData(), bEGenerateXmlResponse);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
            
                if (r7 == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f227687j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r6.f227684f
                    k44.a r0 = (k44.a) r0
                    java.lang.Object r0 = r6.f227683e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r7)
                    goto L7b
                L1a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L22:
                    oq.u.b(r7)
                    goto L49
                L26:
                    oq.u.b(r7)
                    yl1.a0 r7 = r6.f227688k
                    wk1.a r7 = yl1.a0.t9(r7)
                    wk1.a$a r1 = new wk1.a$a
                    k10.c0<yl1.f> r4 = r6.f227689l
                    java.lang.Object r4 = r4.a()
                    yl1.f r4 = (yl1.Generating) r4
                    nk1.a r4 = r4.getModel()
                    r1.<init>(r4)
                    r6.f227687j = r3
                    java.lang.Object r7 = r7.e(r1, r6)
                    if (r7 != r0) goto L49
                    goto L7a
                L49:
                    dx.i r7 = (dx.i) r7
                    yl1.a0 r1 = r6.f227688k
                    k10.c0<yl1.f> r3 = r6.f227689l
                    boolean r4 = r7 instanceof dx.i.Left
                    if (r4 == 0) goto L7e
                    r4 = r7
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    k44.a r4 = (k44.a) r4
                    yl1.f0 r5 = new yl1.f0
                    r5.<init>()
                    java.lang.Object r7 = vq.j.a(r7)
                    r6.f227683e = r7
                    java.lang.Object r7 = vq.j.a(r4)
                    r6.f227684f = r7
                    r7 = 0
                    r6.f227685g = r7
                    r6.f227686h = r7
                    r6.f227687j = r2
                    java.lang.Object r7 = yl1.a0.x9(r1, r3, r4, r5, r6)
                    if (r7 != r0) goto L7b
                L7a:
                    return r0
                L7b:
                    k10.l r7 = (k10.l) r7
                    return r7
                L7e:
                    boolean r0 = r7 instanceof dx.i.Right
                    if (r0 == 0) goto L94
                    dx.i$c r7 = (dx.i.Right) r7
                    java.lang.Object r7 = r7.b()
                    al0.m r7 = (al0.BEGenerateXmlResponse) r7
                    yl1.g0 r0 = new yl1.g0
                    r0.<init>()
                    k10.l r7 = r3.d(r0)
                    return r7
                L94:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: yl1.a0.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f227688k, this.f227689l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends yl1.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227681f;
            Object objE = uq.b.e();
            int i15 = this.f227680e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUC;
            a aVar2 = new a(a0.this, c0Var, null);
            this.f227681f = vq.j.a(c0Var);
            this.f227680e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.c.d dVar, k10.c0<Generating> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            i iVar = a0.this.new i(eVar);
            iVar.f227681f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyl1/c$f;", "<unused var>", "Lyl1/f;", "Loq/i0;", "<anonymous>", "(Lyl1/c$f;Lyl1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<yl1.c.f, Generating, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227690e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f227690e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(yl1.c.d.f227725a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.c.f fVar, Generating generating, tq.e<? super oq.i0> eVar) {
            return a0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/b;", "<unused var>", "Lk10/c0;", "Lyl1/e;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<yl1.b, k10.c0<Error>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227693f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Generating O(Error error) {
            return new Generating(error.getType(), error.getModel(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227693f;
            uq.b.e();
            if (this.f227692e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yl1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.k.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f227693f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/a;", "<unused var>", "Lk10/c0;", "Lyl1/e;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<yl1.a, k10.c0<Error>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227695f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yl1.d.Initialized O(Error error) {
            return new yl1.d.Initialized(error.getType(), error.getModel(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227695f;
            uq.b.e();
            if (this.f227694e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yl1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.l.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f227695f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyl1/h;", "it", "Loq/i0;", "<anonymous>", "(Lyl1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<Submitting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227696e;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f227696e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(yl1.c.i.f227730a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Submitting submitting, tq.e<? super oq.i0> eVar) {
            return ((m) v(submitting, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new m(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/c$i;", "<unused var>", "Lk10/c0;", "Lyl1/h;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<yl1.c.i, k10.c0<Submitting>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227699f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyl1/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yl1.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f227701e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f227702f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f227703g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f227704h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f227705j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f227706k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f227707l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f227708m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ a0 f227709n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<Submitting> f227710p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, k10.c0<Submitting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f227709n = a0Var;
                this.f227710p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yl1.d.a V(Submitting submitting, hb4.c cVar) {
                return new Error(cVar, submitting.getType(), submitting.getModel(), submitting.getStatementData(), submitting.getResponse());
            }

            /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
            /* JADX WARN: Code duplicated, block: B:39:0x011d  */
            /* JADX WARN: Code duplicated, block: B:41:0x0121  */
            /* JADX WARN: Code duplicated, block: B:44:0x0153 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:45:0x0154  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
            
                if (r12 == r0) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
            
                if (r12 == r0) goto L43;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 358
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yl1.a0.n.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f227709n, this.f227710p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends yl1.d>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227699f;
            Object objE = uq.b.e();
            int i15 = this.f227698e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUC;
            a aVar2 = new a(a0.this, c0Var, null);
            this.f227699f = vq.j.a(c0Var);
            this.f227698e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.c.i iVar, k10.c0<Submitting> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            n nVar = a0.this.new n(eVar);
            nVar.f227699f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyl1/c$f;", "<unused var>", "Lyl1/h;", "Loq/i0;", "<anonymous>", "(Lyl1/c$f;Lyl1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<yl1.c.f, Submitting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227711e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f227711e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(yl1.c.i.f227730a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.c.f fVar, Submitting submitting, tq.e<? super oq.i0> eVar) {
            return a0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/b;", "<unused var>", "Lk10/c0;", "Lyl1/g;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<yl1.b, k10.c0<Error>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227714f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Submitting O(Error error) {
            return new Submitting(error.getType(), error.getModel(), error.getStatementData(), error.getResponse());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227714f;
            uq.b.e();
            if (this.f227713e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yl1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.p.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            p pVar = new p(eVar);
            pVar.f227714f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl1/a;", "<unused var>", "Lk10/c0;", "Lyl1/g;", "state", "Lk10/l;", "Lyl1/d;", "<anonymous>", "(Lyl1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<yl1.a, k10.c0<Error>, tq.e<? super k10.l<? extends yl1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227716f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yl1.d.Initialized O(Error error) {
            return new yl1.d.Initialized(error.getType(), error.getModel(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f227716f;
            uq.b.e();
            if (this.f227715e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yl1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.q.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yl1.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends yl1.d>> eVar) {
            q qVar = new q(eVar);
            qVar.f227716f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public a0(yy.a aVar, am1.h hVar, ac4.a aVar2, wk1.a aVar3, wz3.j jVar, wk1.b bVar, hb4.d dVar, ib4.c cVar, zl1.a aVar4) {
        this.mapper = hVar;
        this.callActionWithLoaderUC = aVar2;
        this.generateXmlUC = aVar3;
        this.signBase64XmlUC = jVar;
        this.submitXmlUC = bVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        yl1.d.Initialized initialized = new yl1.d.Initialized(aVar4.getType(), aVar4.b(), new yl1.d.StatementData(false, false, false, 4, null));
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: yl1.z
            @Override // er.l
            public final Object b(Object obj) {
                return a0.G9(this.f227797a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), A9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yl1.i.a A9(yl1.d state) {
        return this.mapper.b(new am1.h.Params(state, new er.l() { // from class: yl1.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.B9(this.f227791a, ((Boolean) obj).booleanValue());
            }
        }, b9(yl1.c.g.f227728a), b9(yl1.c.b.f227723a), b9(yl1.c.C6110c.f227724a), b9(yl1.c.e.f227726a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(a0 a0Var, boolean z15) {
        a0Var.d9(new yl1.c.OnStatementChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T extends yl1.d> Object C9(k10.c0<? extends T> c0Var, final k44.a aVar, final er.p<? super T, ? super hb4.c, ? extends yl1.d.a> pVar, tq.e<? super k10.l<? extends yl1.d>> eVar) throws Throwable {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f227654m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f227654m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object obj = aVar2.f227652k;
        Object objE = uq.b.e();
        int i16 = aVar2.f227654m;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar = (k10.l) aVar2.f227649g;
            oq.u.b(obj);
            return lVar;
        }
        oq.u.b(obj);
        if (aVar instanceof k44.a.Domain) {
            return c0Var.d(new er.l() { // from class: yl1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.D9(pVar, this, aVar, (d) obj2);
                }
            });
        }
        if (!fr.t.c(aVar, k44.a.b.f108417a)) {
            throw new oq.p();
        }
        Object objC = c0Var.c();
        Object edorAuth = new yl1.c.a.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: yl1.x
            @Override // er.l
            public final Object b(Object obj2) {
                return a0.E9(this.f227795a, (iy.b0) obj2);
            }
        }, null, 2, null));
        aVar2.f227646d = vq.j.a(c0Var);
        aVar2.f227647e = vq.j.a(aVar);
        aVar2.f227648f = vq.j.a(pVar);
        aVar2.f227649g = objC;
        aVar2.f227650h = vq.j.a(objC);
        aVar2.f227651j = 0;
        aVar2.f227654m = 1;
        return F(edorAuth, aVar2) == objE ? objE : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yl1.d.a D9(er.p pVar, a0 a0Var, k44.a aVar, yl1.d dVar) {
        return (yl1.d.a) pVar.B(dVar, a0Var.errorVMSFactory.a(a0Var.z9(((k44.a.Domain) aVar).getDomain())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(a0 a0Var, iy.b0 b0Var) {
        a0Var.d9(yl1.c.f.f227727a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final a0 a0Var, k10.v vVar) {
        vVar.c(q0.c(yl1.d.Initialized.class), new er.l() { // from class: yl1.q
            @Override // er.l
            public final Object b(Object obj) {
                return a0.H9(this.f227788a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Generating.class), new er.l() { // from class: yl1.r
            @Override // er.l
            public final Object b(Object obj) {
                return a0.I9(this.f227789a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: yl1.s
            @Override // er.l
            public final Object b(Object obj) {
                return a0.J9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Submitting.class), new er.l() { // from class: yl1.t
            @Override // er.l
            public final Object b(Object obj) {
                return a0.K9(this.f227790a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: yl1.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.L9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(a0 a0Var, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yl1.c.OnStatementChecked.class), oVar, cVar);
        zVar.v(q0.c(yl1.c.g.class), oVar, new d(null));
        zVar.x(q0.c(yl1.c.b.class), oVar, a0Var.new e(null));
        zVar.x(q0.c(yl1.c.C6110c.class), oVar, a0Var.new f(null));
        zVar.v(q0.c(yl1.c.e.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(a0 a0Var, k10.z zVar) {
        zVar.C(a0Var.new h(null));
        i iVar = a0Var.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yl1.c.d.class), oVar, iVar);
        zVar.x(q0.c(yl1.c.f.class), oVar, a0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yl1.b.class), oVar, kVar);
        zVar.v(q0.c(yl1.a.class), oVar, new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(a0 a0Var, k10.z zVar) {
        zVar.C(a0Var.new m(null));
        n nVar = a0Var.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yl1.c.i.class), oVar, nVar);
        zVar.x(q0.c(yl1.c.f.class), oVar, a0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(k10.z zVar) {
        p pVar = new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yl1.b.class), oVar, pVar);
        zVar.v(q0.c(yl1.a.class), oVar, new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q9(a0 a0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            a0Var.d9(yl1.a.f227634a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            a0Var.d9(yl1.b.f227717a);
        }
        return oq.i0.f148189a;
    }

    private final jb4.b z9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: yl1.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.q9(this.f227796a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(zl1.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<yl1.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yl1.d, yl1.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yl1.i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yl1.c.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }
}
