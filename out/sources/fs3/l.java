package fs3;

import cj0.ZusEVisitCollectiveDepartments;
import cj0.ZusEVisitDepartment;
import er.q;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mx.Label;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import ps3.SetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lfs3/l;", "Lfs3/h;", "Lnr3/h;", "getCollectiveDepartmentsUseCase", "Lib4/c;", "errorMapper", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "<init>", "(Lnr3/h;Lib4/c;Lyy/a;Lmx/c;)V", "Lhs3/b;", "type", "Lkotlin/Function1;", "Lfs3/a$c;", "Loq/i0;", "emitNavAction", "Lfs3/a;", "dispatchAction", "Lk10/t;", "Lfs3/b;", "o6", "(Lhs3/b;Ler/l;Ler/l;)Lk10/t;", "a", "Lnr3/h;", "b", "Lib4/c;", "c", "Lyy/a;", "d", "Lmx/c;", "Lfs3/b$a;", "e", "Lfs3/b$a;", "j", "()Lfs3/b$a;", "initialState", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nr3.h getCollectiveDepartmentsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yy.a stateMachineFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fs3.b.a initialState = fs3.b.a.f66890a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfs3/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lfs3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<fs3.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<fs3.a, i0> f66922f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super fs3.a, i0> lVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f66922f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f66921e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f66922f.b(fs3.a.b.f66879a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(fs3.b.a aVar, tq.e<? super i0> eVar) {
            return ((a) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f66922f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfs3/a$b;", "<unused var>", "Lk10/c0;", "Lfs3/b$a;", "state", "Lk10/l;", "Lfs3/b;", "<anonymous>", "(Lfs3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<fs3.a.b, c0<fs3.b.a>, tq.e<? super k10.l<? extends fs3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66924f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<fs3.a.c, i0> f66926h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.l<fs3.a, i0> f66927j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.l<? super fs3.a.c, i0> lVar, er.l<? super fs3.a, i0> lVar2, tq.e<? super b> eVar) {
            super(3, eVar);
            this.f66926h = lVar;
            this.f66927j = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(er.l lVar, er.l lVar2, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                lVar.b(fs3.a.b.f66879a);
            } else if (bVar instanceof ib4.c.b.AbstractC2161b.a) {
                lVar2.b(fs3.a.c.C1494a.f66880a);
            }
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fs3.b.Initialized X(ZusEVisitCollectiveDepartments zusEVisitCollectiveDepartments, fs3.b.a aVar) {
            return new fs3.b.Initialized(zusEVisitCollectiveDepartments, null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f66924f;
            Object objE = uq.b.e();
            int i15 = this.f66923e;
            if (i15 == 0) {
                u.b(obj);
                nr3.h hVar = l.this.getCollectiveDepartmentsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f66924f = c0Var;
                this.f66923e = 1;
                obj = hVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final er.l<fs3.a.c, i0> lVar = this.f66926h;
            l lVar2 = l.this;
            final er.l<fs3.a, i0> lVar3 = this.f66927j;
            if (iVar instanceof dx.i.Left) {
                lVar.b(new fs3.a.c.Error(lVar2.errorMapper.b(new ib4.c.Params((dx.b) ((dx.i.Left) iVar).b(), false, new er.l() { // from class: fs3.m
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l.b.V(lVar3, lVar, (ib4.c.b) obj2);
                    }
                }, 2, null))));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final ZusEVisitCollectiveDepartments zusEVisitCollectiveDepartments = (ZusEVisitCollectiveDepartments) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: fs3.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.b.X(zusEVisitCollectiveDepartments, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(fs3.a.b bVar, c0<fs3.b.a> c0Var, tq.e<? super k10.l<? extends fs3.b>> eVar) {
            b bVar2 = l.this.new b(this.f66926h, this.f66927j, eVar);
            bVar2.f66924f = c0Var;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfs3/a$d;", "<unused var>", "Lfs3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lfs3/a$d;Lfs3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<fs3.a.d, fs3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ hs3.b f66930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<fs3.a.c, i0> f66931h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f66932a;

            static {
                int[] iArr = new int[hs3.a.values().length];
                try {
                    iArr[hs3.a.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f66932a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(hs3.b bVar, er.l<? super fs3.a.c, i0> lVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f66930g = bVar;
            this.f66931h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fs3.b.Initialized initialized = (fs3.b.Initialized) this.f66929f;
            uq.b.e();
            if (this.f66928e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (this.f66930g == hs3.b.POLAND && initialized.getSelectedRadio() == hs3.a.POSITIVE) {
                this.f66931h.b(fs3.a.c.C1495c.f66883a);
            } else {
                ZusEVisitDepartment selectedDepartment = initialized.getSelectedDepartment();
                if (selectedDepartment != null) {
                    er.l<fs3.a.c, i0> lVar = this.f66931h;
                    hs3.a selectedRadio = initialized.getSelectedRadio();
                    lVar.b(new fs3.a.c.EnterDate(selectedDepartment, (selectedRadio == null ? -1 : a.f66932a[selectedRadio.ordinal()]) != 1));
                }
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fs3.a.d dVar, fs3.b.Initialized initialized, tq.e<? super i0> eVar) {
            c cVar = new c(this.f66930g, this.f66931h, eVar);
            cVar.f66929f = initialized;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfs3/a$e;", "event", "Lk10/c0;", "Lfs3/b$b;", "state", "Lk10/l;", "Lfs3/b;", "<anonymous>", "(Lfs3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<fs3.a.SelectDepartment, c0<fs3.b.Initialized>, tq.e<? super k10.l<? extends fs3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66935g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fs3.b.Initialized O(fs3.a.SelectDepartment selectDepartment, fs3.b.Initialized initialized) {
            return fs3.b.Initialized.b(initialized, null, selectDepartment.getDepartment(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fs3.a.SelectDepartment selectDepartment = (fs3.a.SelectDepartment) this.f66934f;
            c0 c0Var = (c0) this.f66935g;
            uq.b.e();
            if (this.f66933e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: fs3.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.d.O(selectDepartment, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fs3.a.SelectDepartment selectDepartment, c0<fs3.b.Initialized> c0Var, tq.e<? super k10.l<? extends fs3.b>> eVar) {
            d dVar = new d(eVar);
            dVar.f66934f = selectDepartment;
            dVar.f66935g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfs3/a$f;", "event", "Lk10/c0;", "Lfs3/b$b;", "state", "Lk10/l;", "Lfs3/b;", "<anonymous>", "(Lfs3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<fs3.a.SelectRadio, c0<fs3.b.Initialized>, tq.e<? super k10.l<? extends fs3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<fs3.a.c, i0> f66939h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(er.l<? super fs3.a.c, i0> lVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f66939h = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fs3.b.Initialized O(fs3.a.SelectRadio selectRadio, fs3.b.Initialized initialized) {
            return fs3.b.Initialized.b(initialized, null, null, selectRadio.getRadioButtonId(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fs3.a.SelectRadio selectRadio = (fs3.a.SelectRadio) this.f66937f;
            c0 c0Var = (c0) this.f66938g;
            uq.b.e();
            if (this.f66936e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (((fs3.b.Initialized) c0Var.a()).getSelectedRadio() == selectRadio.getRadioButtonId()) {
                return c0Var.c();
            }
            this.f66939h.b(new fs3.a.c.SelectRadio(selectRadio.getRadioButtonId()));
            return c0Var.d(new er.l() { // from class: fs3.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.e.O(selectRadio, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fs3.a.SelectRadio selectRadio, c0<fs3.b.Initialized> c0Var, tq.e<? super k10.l<? extends fs3.b>> eVar) {
            e eVar2 = new e(this.f66939h, eVar);
            eVar2.f66937f = selectRadio;
            eVar2.f66938g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfs3/a$a;", "<unused var>", "Lfs3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lfs3/a$a;Lfs3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<fs3.a.C1493a, fs3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<fs3.a.c, i0> f66942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l f66943h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f66944a;

            static {
                int[] iArr = new int[hs3.a.values().length];
                try {
                    iArr[hs3.a.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hs3.a.NEGATIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f66944a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(er.l<? super fs3.a.c, i0> lVar, l lVar2, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f66942g = lVar;
            this.f66943h = lVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<ZusEVisitDepartment> listB;
            fs3.b.Initialized initialized = (fs3.b.Initialized) this.f66941f;
            uq.b.e();
            if (this.f66940e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            hs3.a selectedRadio = initialized.getSelectedRadio();
            if (selectedRadio != null) {
                er.l<fs3.a.c, i0> lVar = this.f66942g;
                Label labelC = this.f66943h.labelProvider.c(ir3.a.f96784g);
                int i15 = a.f66944a[selectedRadio.ordinal()];
                if (i15 == 1) {
                    listB = initialized.getDepartments().b();
                } else {
                    if (i15 != 2) {
                        throw new oq.p();
                    }
                    listB = initialized.getDepartments().a();
                }
                lVar.b(new fs3.a.c.EnterDepartmentSelect(new SetupData(labelC, listB, ps3.c.POP_DESTINATION)));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fs3.a.C1493a c1493a, fs3.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = new f(this.f66942g, this.f66943h, eVar);
            fVar.f66941f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    public l(nr3.h hVar, ib4.c cVar, yy.a aVar, mx.c cVar2) {
        this.getCollectiveDepartmentsUseCase = hVar;
        this.errorMapper = cVar;
        this.stateMachineFactory = aVar;
        this.labelProvider = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final er.l lVar, final l lVar2, final er.l lVar3, final hs3.b bVar, v vVar) {
        vVar.c(q0.c(fs3.b.a.class), new er.l() { // from class: fs3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.h(lVar, lVar2, lVar3, (z) obj);
            }
        });
        vVar.c(q0.c(fs3.b.Initialized.class), new er.l() { // from class: fs3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.i(bVar, lVar3, lVar2, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(er.l lVar, l lVar2, er.l lVar3, z zVar) {
        zVar.C(new a(lVar, null));
        b bVar = lVar2.new b(lVar3, lVar, null);
        zVar.v(q0.c(fs3.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(hs3.b bVar, er.l lVar, l lVar2, z zVar) {
        c cVar = new c(bVar, lVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fs3.a.d.class), oVar, cVar);
        zVar.v(q0.c(fs3.a.SelectDepartment.class), oVar, new d(null));
        zVar.v(q0.c(fs3.a.SelectRadio.class), oVar, new e(lVar, null));
        zVar.x(q0.c(fs3.a.C1493a.class), oVar, new f(lVar, lVar2, null));
        return i0.f148189a;
    }

    @Override // fs3.h
    /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public fs3.b.a J0() {
        return this.initialState;
    }

    @Override // fs3.h
    public t<fs3.b, fs3.a> o6(final hs3.b type, final er.l<? super fs3.a.c, i0> emitNavAction, final er.l<? super fs3.a, i0> dispatchAction) {
        return this.stateMachineFactory.a(J0(), new er.l() { // from class: fs3.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.g(dispatchAction, this, emitNavAction, type, (v) obj);
            }
        });
    }
}
