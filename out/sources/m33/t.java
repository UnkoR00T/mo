package m33;

import fr.q0;
import java.time.LocalDate;
import k23.OtherReportData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0016048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lm33/t;", "Ll00/g;", "Lm33/d;", "Lm33/a;", "Lm33/e;", "", "Lyy/a;", "stateMachineFactory", "Ln33/b;", "mapper", "Lez/a;", "currentTimeProvider", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Lm23/f;", "validateOtherReportDetailsUC", "Lm33/f;", "contract", "<init>", "(Lyy/a;Ln33/b;Lez/a;Lcb4/j;Lp23/b;Lm23/f;Lm33/f;)V", "Lm33/e$a;", "u9", "(Lm33/d;)Lm33/e$a;", "b", "Ln33/b;", "c", "Lez/a;", "d", "Lcb4/j;", "e", "Lp23/b;", "f", "Lm23/f;", "Lm33/d$b;", "g", "Lm33/d$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lm33/a$d;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<m33.d, m33.a> implements m33.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n33.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m23.f validateOtherReportDetailsUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m33.d.Screen initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<m33.d, m33.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m33.a.d> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<m33.e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<m33.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f123615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f123616b;

        /* JADX INFO: renamed from: m33.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3023a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f123617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f123618b;

            /* JADX INFO: renamed from: m33.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3024a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f123619d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f123620e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f123621f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f123623h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f123624j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f123625k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f123626l;

                public C3024a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f123619d = obj;
                    this.f123620e |= PKIFailureInfo.systemUnavail;
                    return C3023a.this.F(null, this);
                }
            }

            public C3023a(mu.h hVar, t tVar) {
                this.f123617a = hVar;
                this.f123618b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3024a c3024a;
                if (eVar instanceof C3024a) {
                    c3024a = (C3024a) eVar;
                    int i15 = c3024a.f123620e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3024a.f123620e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3024a = new C3024a(eVar);
                    }
                } else {
                    c3024a = new C3024a(eVar);
                }
                Object obj2 = c3024a.f123619d;
                Object objE = uq.b.e();
                int i16 = c3024a.f123620e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f123617a;
                    m33.e.Data dataU9 = this.f123618b.u9((m33.d) obj);
                    c3024a.f123621f = vq.j.a(obj);
                    c3024a.f123623h = vq.j.a(c3024a);
                    c3024a.f123624j = vq.j.a(obj);
                    c3024a.f123625k = vq.j.a(hVar);
                    c3024a.f123626l = 0;
                    c3024a.f123620e = 1;
                    if (hVar.F(dataU9, c3024a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f123615a = gVar;
            this.f123616b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m33.e.Data> hVar, tq.e eVar) {
            Object objA = this.f123615a.a(new C3023a(hVar, this.f123616b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm33/a$d;", "action", "Lm33/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm33/a$d;Lm33/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<m33.a.d, m33.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123628f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m33.a.d dVar = (m33.a.d) this.f123628f;
            Object objE = uq.b.e();
            int i15 = this.f123627e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m33.a.d> bVarY1 = t.this.Y1();
                this.f123628f = vq.j.a(dVar);
                this.f123627e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(m33.a.d dVar, m33.d dVar2, tq.e<? super i0> eVar) {
            b bVar = t.this.new b(eVar);
            bVar.f123628f = dVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm33/a$b;", "<unused var>", "Lm33/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lm33/a$b;Lm33/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<m33.a.b, m33.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f123631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f123632g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f123633h;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(t tVar, LocalDate localDate) {
            tVar.d9(new m33.a.OnChangeReportDate(new fz.b.LocalDate(localDate)));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            LocalDate date;
            m33.d.Screen screen = (m33.d.Screen) this.f123633h;
            Object objE = uq.b.e();
            int i15 = this.f123632g;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDate localDateC = t.this.currentTimeProvider.c();
                fz.b.LocalDate reportDate = screen.getForm().getReportDate();
                LocalDate localDate = (reportDate == null || (date = reportDate.getDate()) == null) ? localDateC : date;
                t tVar = t.this;
                final t tVar2 = t.this;
                m33.a.d.GoToDatePicker goToDatePicker = new m33.a.d.GoToDatePicker(new uw.j.Single(null, localDate, new er.l() { // from class: m33.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.O(tVar2, (LocalDate) obj2);
                    }
                }, null, localDateC, 9, null));
                this.f123633h = vq.j.a(screen);
                this.f123630e = vq.j.a(localDateC);
                this.f123631f = vq.j.a(localDate);
                this.f123632g = 1;
                if (tVar.F(goToDatePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m33.a.b bVar, m33.d.Screen screen, tq.e<? super i0> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f123633h = screen;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm33/a$f;", "action", "Lk10/c0;", "Lm33/d$b;", "state", "Lk10/l;", "Lm33/d;", "<anonymous>", "(Lm33/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<m33.a.OnChangeReportDate, k10.c0<m33.d.Screen>, tq.e<? super k10.l<? extends m33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f123637g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m33.d.Screen O(m33.a.OnChangeReportDate onChangeReportDate, m33.d.Screen screen) {
            return m33.d.Screen.c(screen, Form.b(screen.getForm(), null, null, null, null, onChangeReportDate.getDate(), 15, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m33.a.OnChangeReportDate onChangeReportDate = (m33.a.OnChangeReportDate) this.f123636f;
            k10.c0 c0Var = (k10.c0) this.f123637g;
            uq.b.e();
            if (this.f123635e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: m33.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(onChangeReportDate, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m33.a.OnChangeReportDate onChangeReportDate, k10.c0<m33.d.Screen> c0Var, tq.e<? super k10.l<? extends m33.d>> eVar) {
            d dVar = new d(eVar);
            dVar.f123636f = onChangeReportDate;
            dVar.f123637g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm33/a$e;", "action", "Lk10/c0;", "Lm33/d$b;", "state", "Lk10/l;", "Lm33/d;", "<anonymous>", "(Lm33/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<m33.a.OnChangeInstitutionName, k10.c0<m33.d.Screen>, tq.e<? super k10.l<? extends m33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f123640g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m33.d.Screen O(m33.a.OnChangeInstitutionName onChangeInstitutionName, m33.d.Screen screen) {
            return m33.d.Screen.c(screen, Form.b(screen.getForm(), onChangeInstitutionName.getName(), hz.b.C2039b.f86846c, null, null, null, 28, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m33.a.OnChangeInstitutionName onChangeInstitutionName = (m33.a.OnChangeInstitutionName) this.f123639f;
            k10.c0 c0Var = (k10.c0) this.f123640g;
            uq.b.e();
            if (this.f123638e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: m33.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(onChangeInstitutionName, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m33.a.OnChangeInstitutionName onChangeInstitutionName, k10.c0<m33.d.Screen> c0Var, tq.e<? super k10.l<? extends m33.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f123639f = onChangeInstitutionName;
            eVar2.f123640g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm33/a$g;", "action", "Lk10/c0;", "Lm33/d$b;", "state", "Lk10/l;", "Lm33/d;", "<anonymous>", "(Lm33/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<m33.a.OnChangeReportNumber, k10.c0<m33.d.Screen>, tq.e<? super k10.l<? extends m33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f123643g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m33.d.Screen O(m33.a.OnChangeReportNumber onChangeReportNumber, m33.d.Screen screen) {
            return m33.d.Screen.c(screen, Form.b(screen.getForm(), null, null, onChangeReportNumber.getNumber(), hz.b.C2039b.f86846c, null, 19, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m33.a.OnChangeReportNumber onChangeReportNumber = (m33.a.OnChangeReportNumber) this.f123642f;
            k10.c0 c0Var = (k10.c0) this.f123643g;
            uq.b.e();
            if (this.f123641e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: m33.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(onChangeReportNumber, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m33.a.OnChangeReportNumber onChangeReportNumber, k10.c0<m33.d.Screen> c0Var, tq.e<? super k10.l<? extends m33.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f123642f = onChangeReportNumber;
            fVar.f123643g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm33/a$a;", "<unused var>", "Lk10/c0;", "Lm33/d$b;", "state", "Lk10/l;", "Lm33/d;", "<anonymous>", "(Lm33/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<m33.a.C3020a, k10.c0<m33.d.Screen>, tq.e<? super k10.l<? extends m33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f123645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f123646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f123647h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f123648j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f123649k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m33.f f123651m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m33.f fVar, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f123651m = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m33.d.Screen V(m33.b bVar, Form form, hz.b bVar2, hz.b bVar3, m33.d.Screen screen) {
            return screen.b(Form.b(form, null, bVar2, null, bVar3, null, 21, null), new d60.j<>(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m33.d.Screen X(Form form, String str, String str2, m33.d.Screen screen) {
            return screen.b(Form.b(form, str, null, str2, null, null, 26, null), null);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String strE;
            final Form form;
            final hz.b bVar;
            final String str;
            final String str2;
            final hz.b bVarA;
            final m33.b bVar2;
            k10.c0 c0Var = (k10.c0) this.f123649k;
            Object objE = uq.b.e();
            int i15 = this.f123648j;
            if (i15 == 0) {
                oq.u.b(obj);
                Form form2 = ((m33.d.Screen) c0Var.a()).getForm();
                strE = dz.e.e(form2.getInstitutionName());
                m23.f fVar = t.this.validateOtherReportDetailsUC;
                m23.f.b.InstitutionName institutionName = new m23.f.b.InstitutionName(strE);
                this.f123649k = c0Var;
                this.f123644e = form2;
                this.f123645f = strE;
                this.f123648j = 1;
                Object objE2 = fVar.e(institutionName, this);
                if (objE2 != objE) {
                    form = form2;
                    obj = objE2;
                }
                return objE;
            }
            if (i15 == 1) {
                strE = (String) this.f123645f;
                form = (Form) this.f123644e;
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.f123647h;
                bVar = (hz.b) this.f123646g;
                str = (String) this.f123645f;
                form = (Form) this.f123644e;
                oq.u.b(obj);
            }
            bVarA = ((hz.g) obj).a();
            if (!bVar.a()) {
                bVar2 = m33.b.INSTITUTION_NAME;
            } else if (bVarA.a()) {
                bVar2 = null;
            } else {
                bVar2 = m33.b.REPORT_NUMBER;
            }
            if (bVar2 != null) {
                return c0Var.b(new er.l() { // from class: m33.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.g.V(bVar2, form, bVar, bVarA, (d.Screen) obj2);
                    }
                });
            }
            this.f123651m.s5(new OtherReportData(str, fu.r.t0(str2) ? null : str2, form.getReportDate()));
            t.this.d9(m33.a.d.C3022d.f123559a);
            return c0Var.b(new er.l() { // from class: m33.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.X(form, str, str2, (d.Screen) obj2);
                }
            });
            hz.b bVarA2 = ((hz.g) obj).a();
            String strE2 = dz.e.e(form.getReportNumber());
            m23.f fVar2 = t.this.validateOtherReportDetailsUC;
            m23.f.b.ReportNumberOptional reportNumberOptional = new m23.f.b.ReportNumberOptional(strE2);
            this.f123649k = c0Var;
            this.f123644e = form;
            this.f123645f = strE;
            this.f123646g = bVarA2;
            this.f123647h = strE2;
            this.f123648j = 2;
            Object objE3 = fVar2.e(reportNumberOptional, this);
            if (objE3 != objE) {
                String str3 = strE;
                bVar = bVarA2;
                obj = objE3;
                str = str3;
                str2 = strE2;
                bVarA = ((hz.g) obj).a();
                if (!bVar.a()) {
                    bVar2 = m33.b.INSTITUTION_NAME;
                } else if (bVarA.a()) {
                    bVar2 = m33.b.REPORT_NUMBER;
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    return c0Var.b(new er.l() { // from class: m33.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.g.V(bVar2, form, bVar, bVarA, (d.Screen) obj2);
                        }
                    });
                }
                this.f123651m.s5(new OtherReportData(str, fu.r.t0(str2) ? null : str2, form.getReportDate()));
                t.this.d9(m33.a.d.C3022d.f123559a);
                return c0Var.b(new er.l() { // from class: m33.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.g.X(form, str, str2, (d.Screen) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(m33.a.C3020a c3020a, k10.c0<m33.d.Screen> c0Var, tq.e<? super k10.l<? extends m33.d>> eVar) {
            g gVar = t.this.new g(this.f123651m, eVar);
            gVar.f123649k = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm33/a$h;", "<unused var>", "Lk10/c0;", "Lm33/d$b;", "state", "Lk10/l;", "Lm33/d;", "<anonymous>", "(Lm33/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<m33.a.h, k10.c0<m33.d.Screen>, tq.e<? super k10.l<? extends m33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123653f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m33.d.Dialog O(t tVar, m33.d.Screen screen) {
            return new m33.d.Dialog(Form.b(screen.getForm(), null, null, null, null, null, 31, null), tVar.dialogVMSFactory.a(tVar.newReportExitDialogMapper.b(new p23.b.Params(tVar.b9(m33.a.d.b.f123557a), tVar.b9(m33.a.c.f123555a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f123653f;
            uq.b.e();
            if (this.f123652e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            return c0Var.d(new er.l() { // from class: m33.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O(tVar, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m33.a.h hVar, k10.c0<m33.d.Screen> c0Var, tq.e<? super k10.l<? extends m33.d>> eVar) {
            h hVar2 = t.this.new h(eVar);
            hVar2.f123653f = c0Var;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm33/a$c;", "<unused var>", "Lk10/c0;", "Lm33/d$a;", "state", "Lk10/l;", "Lm33/d;", "<anonymous>", "(Lm33/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<m33.a.c, k10.c0<m33.d.Dialog>, tq.e<? super k10.l<? extends m33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123656f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m33.d.Screen O(m33.d.Dialog dialog) {
            return new m33.d.Screen(dialog.getForm(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f123656f;
            uq.b.e();
            if (this.f123655e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m33.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.i.O((d.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m33.a.c cVar, k10.c0<m33.d.Dialog> c0Var, tq.e<? super k10.l<? extends m33.d>> eVar) {
            i iVar = new i(eVar);
            iVar.f123656f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, n33.b bVar, ez.a aVar2, cb4.j jVar, p23.b bVar2, m23.f fVar, final m33.f fVar2) {
        String reportNumber;
        String institutionName;
        this.mapper = bVar;
        this.currentTimeProvider = aVar2;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar2;
        this.validateOtherReportDetailsUC = fVar;
        OtherReportData otherReportDataP0 = fVar2.P0();
        m33.d.Screen screen = new m33.d.Screen(new Form((otherReportDataP0 == null || (institutionName = otherReportDataP0.getInstitutionName()) == null) ? "" : institutionName, null, (otherReportDataP0 == null || (reportNumber = otherReportDataP0.getReportNumber()) == null) ? "" : reportNumber, null, otherReportDataP0 != null ? otherReportDataP0.getReportDate() : null, 10, null), null, 2, null);
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: m33.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9(this.f123604a, fVar2, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(t tVar, m33.f fVar, k10.z zVar) {
        c cVar = tVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(m33.a.b.class), oVar, cVar);
        zVar.v(q0.c(m33.a.OnChangeReportDate.class), oVar, new d(null));
        zVar.v(q0.c(m33.a.OnChangeInstitutionName.class), oVar, new e(null));
        zVar.v(q0.c(m33.a.OnChangeReportNumber.class), oVar, new f(null));
        zVar.v(q0.c(m33.a.C3020a.class), oVar, tVar.new g(fVar, null));
        zVar.v(q0.c(m33.a.h.class), oVar, tVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(k10.z zVar) {
        i iVar = new i(null);
        zVar.v(q0.c(m33.a.c.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m33.e.Data u9(m33.d dVar) {
        return this.mapper.b(new n33.b.Params(dVar, b9(m33.a.C3020a.f123553a), b9(m33.a.d.C3021a.f123556a), b9(m33.a.h.f123564a), new er.l() { // from class: m33.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.v9(this.f123599a, (String) obj);
            }
        }, new er.l() { // from class: m33.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f123600a, (String) obj);
            }
        }, b9(m33.a.b.f123554a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(t tVar, String str) {
        tVar.d9(new m33.a.OnChangeReportNumber(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(t tVar, String str) {
        tVar.d9(new m33.a.OnChangeInstitutionName(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final t tVar, final m33.f fVar, k10.v vVar) {
        vVar.c(q0.c(m33.d.class), new er.l() { // from class: m33.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f123601a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m33.d.Screen.class), new er.l() { // from class: m33.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f123602a, fVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m33.d.Dialog.class), new er.l() { // from class: m33.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        zVar.x(q0.c(m33.a.d.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<m33.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<m33.d, m33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m33.e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(m33.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m33.f fVar) {
        super.P5(fVar);
    }
}
