package ua4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import oa4.TimetableDay;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001^B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010(J%\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010R\u001a\b\u0012\u0004\u0012\u00020M0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR&\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030S8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lua4/f0;", "Ll00/g;", "Lua4/d;", "Lua4/c;", "Lua4/g;", "", "Lyy/a;", "stateMachineFactory", "Lwa4/b;", "mapper", "Lla4/a;", "interactorFactory", "Lac4/d;", "getCurrentServerTimeUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lez/b;", "dateCalculator", "Lez/h;", "timeProvider", "Lva4/a;", "contract", "<init>", "(Lyy/a;Lwa4/b;Lla4/a;Lac4/d;Lac4/a;Lhb4/d;Lib4/c;Lez/b;Lez/h;Lva4/a;)V", "state", "Lua4/g$a;", "K9", "(Lua4/d;)Lua4/g$a;", "Lfz/b$c;", "date", "H9", "(Lfz/b$c;)Lfz/b$c;", "start", "end", "", "W9", "(Lfz/b$c;Lfz/b$c;)I", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "Lhb4/c;", "E9", "(Ldx/b;Ler/a;)Lhb4/c;", "b", "Lwa4/b;", "c", "Lla4/a;", "d", "Lac4/d;", "e", "Lac4/a;", "f", "Lhb4/d;", "g", "Lib4/c;", "h", "Lez/b;", "j", "Lez/h;", "k", "Lva4/a;", "Lna4/a;", "l", "Loq/k;", "I9", "()Lna4/a;", "interactor", "m", "Lua4/d;", "initialState", "Lxw/b;", "Lua4/c$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends l00.g<ua4.d, ua4.c> implements ua4.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wa4.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final la4.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ez.h timeProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final va4.a contract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor = oq.l.a(new er.a() { // from class: ua4.u
        @Override // er.a
        public final Object a() {
            return f0.J9(this.f197052a);
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ua4.d initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ua4.c.a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ua4.d, ua4.c> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ua4.g.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lua4/f0$a;", "", "Lva4/a;", "Lua4/f0;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0 {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ua4.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f196933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f196934b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f196935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0 f196936b;

            /* JADX INFO: renamed from: ua4.f0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5126a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f196937d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f196938e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f196939f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f196941h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f196942j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f196943k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f196944l;

                public C5126a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f196937d = obj;
                    this.f196938e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, f0 f0Var) {
                this.f196935a = hVar;
                this.f196936b = f0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5126a c5126a;
                if (eVar instanceof C5126a) {
                    c5126a = (C5126a) eVar;
                    int i15 = c5126a.f196938e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5126a.f196938e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5126a = new C5126a(eVar);
                    }
                } else {
                    c5126a = new C5126a(eVar);
                }
                Object obj2 = c5126a.f196937d;
                Object objE = uq.b.e();
                int i16 = c5126a.f196938e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f196935a;
                    ua4.g.a aVarK9 = this.f196936b.K9((ua4.d) obj);
                    c5126a.f196939f = vq.j.a(obj);
                    c5126a.f196941h = vq.j.a(c5126a);
                    c5126a.f196942j = vq.j.a(obj);
                    c5126a.f196943k = vq.j.a(hVar);
                    c5126a.f196944l = 0;
                    c5126a.f196938e = 1;
                    if (hVar.F(aVarK9, c5126a) == objE) {
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

        public b(mu.g gVar, f0 f0Var) {
            this.f196933a = gVar;
            this.f196934b = f0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ua4.g.a> hVar, tq.e eVar) {
            Object objA = this.f196933a.a(new a(hVar, this.f196934b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lua4/d$e;", "state", "Lk10/l;", "Lua4/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<ua4.d.e>, tq.e<? super k10.l<? extends ua4.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196946f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lua4/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ua4.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f196948e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f196949f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f196950g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ f0 f196951h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<ua4.d.e> f196952j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, k10.c0<ua4.d.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f196951h = f0Var;
                this.f196952j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ua4.d.ErrorLoadingTimetable X(f0 f0Var, dx.b bVar, ua4.d.e eVar) {
                return new ua4.d.ErrorLoadingTimetable(f0Var.E9(bVar, f0Var.b9(ua4.c.e.f196891a)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ua4.d Y(oa4.k kVar, LocalDate localDate, f0 f0Var, OffsetDateTime offsetDateTime, ua4.d.e eVar) {
                if (kVar instanceof oa4.k.Timetable) {
                    fz.b.LocalDate localDate2 = new fz.b.LocalDate(localDate);
                    fz.b.LocalDate localDateH9 = f0Var.H9(localDate2);
                    return new ua4.d.DisplayingTimetable(new TimetableContext(((oa4.k.Timetable) kVar).a(), offsetDateTime, localDateH9, f0Var.dateCalculator.c(localDateH9), e1.d(localDateH9.getDate())), localDate2, null, 4, null);
                }
                if (kVar instanceof oa4.k.EmptyState) {
                    return new ua4.d.TimetableEmptyState(((oa4.k.EmptyState) kVar).getMessage());
                }
                if (fr.t.c(kVar, oa4.k.b.f144145a)) {
                    return new ua4.d.ErrorLoadingTimetable(f0Var.E9(new dx.b.Generic(null, 1, null), f0Var.b9(ua4.c.e.f196891a)));
                }
                throw new oq.p();
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final OffsetDateTime offsetDateTimeA;
                final LocalDate localDate;
                Object objE = uq.b.e();
                int i15 = this.f196950g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    offsetDateTimeA = this.f196951h.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                    LocalDate localDate2 = this.f196951h.timeProvider.b(offsetDateTimeA, fz.f.POLISH).toLocalDate();
                    na4.a aVarI9 = this.f196951h.I9();
                    String strF = this.f196951h.contract.f();
                    this.f196948e = offsetDateTimeA;
                    this.f196949f = localDate2;
                    this.f196950g = 1;
                    Object objA = aVarI9.a(localDate2, strF, this);
                    if (objA == objE) {
                        return objE;
                    }
                    localDate = localDate2;
                    obj = objA;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    localDate = (LocalDate) this.f196949f;
                    offsetDateTimeA = (OffsetDateTime) this.f196948e;
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<ua4.d.e> c0Var = this.f196952j;
                final f0 f0Var = this.f196951h;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ua4.g0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.c.a.X(f0Var, bVar, (d.e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final oa4.k kVar = (oa4.k) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ua4.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.c.a.Y(kVar, localDate, f0Var, offsetDateTimeA, (d.e) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f196951h, this.f196952j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ua4.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f196946f;
            Object objE = uq.b.e();
            int i15 = this.f196945e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = f0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(f0.this, c0Var, null);
            this.f196946f = vq.j.a(c0Var);
            this.f196945e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ua4.d.e> c0Var, tq.e<? super k10.l<? extends ua4.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = f0.this.new c(eVar);
            cVar.f196946f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua4/c$b;", "<unused var>", "Lua4/d$e;", "Loq/i0;", "<anonymous>", "(Lua4/c$b;Lua4/d$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ua4.c.b, ua4.d.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196953e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196953e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                ua4.c.a.C5122a c5122a = ua4.c.a.C5122a.f196885a;
                this.f196953e = 1;
                if (f0Var.F(c5122a, this) == objE) {
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
        public final Object w(ua4.c.b bVar, ua4.d.e eVar, tq.e<? super oq.i0> eVar2) {
            return f0.this.new d(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua4/c$b;", "<unused var>", "Lua4/d$f;", "Loq/i0;", "<anonymous>", "(Lua4/c$b;Lua4/d$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ua4.c.b, ua4.d.TimetableEmptyState, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196955e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196955e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                ua4.c.a.C5122a c5122a = ua4.c.a.C5122a.f196885a;
                this.f196955e = 1;
                if (f0Var.F(c5122a, this) == objE) {
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
        public final Object w(ua4.c.b bVar, ua4.d.TimetableEmptyState timetableEmptyState, tq.e<? super oq.i0> eVar) {
            return f0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lua4/c$a;", "action", "Lua4/d$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lua4/c$a;Lua4/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ua4.c.a, ua4.d.DisplayingTimetable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196958f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ua4.c.a aVar = (ua4.c.a) this.f196958f;
            Object objE = uq.b.e();
            int i15 = this.f196957e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ua4.c.a> bVarY1 = f0.this.Y1();
                this.f196958f = vq.j.a(aVar);
                this.f196957e = 1;
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
        public final Object w(ua4.c.a aVar, ua4.d.DisplayingTimetable displayingTimetable, tq.e<? super oq.i0> eVar) {
            f fVar = f0.this.new f(eVar);
            fVar.f196958f = aVar;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua4/c$b;", "<unused var>", "Lua4/d$a;", "Loq/i0;", "<anonymous>", "(Lua4/c$b;Lua4/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ua4.c.b, ua4.d.DisplayingTimetable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196960e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196960e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                ua4.c.a.C5122a c5122a = ua4.c.a.C5122a.f196885a;
                this.f196960e = 1;
                if (f0Var.F(c5122a, this) == objE) {
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
        public final Object w(ua4.c.b bVar, ua4.d.DisplayingTimetable displayingTimetable, tq.e<? super oq.i0> eVar) {
            return f0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lua4/c$f;", "action", "Lk10/c0;", "Lua4/d$a;", "state", "Lk10/l;", "Lua4/d;", "<anonymous>", "(Lua4/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ua4.c.SelectDate, k10.c0<ua4.d.DisplayingTimetable>, tq.e<? super k10.l<? extends ua4.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196963f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f196964g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ua4.d.DisplayingTimetable V(TimetableContext timetableContext, ua4.c.SelectDate selectDate, int i15, ua4.d.DisplayingTimetable displayingTimetable) {
            return displayingTimetable.a(timetableContext, selectDate.getDate(), new l30.w(i15));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ua4.d.LoadingMoreTimetable X(TimetableContext timetableContext, ua4.c.SelectDate selectDate, ua4.d.DisplayingTimetable displayingTimetable) {
            return new ua4.d.LoadingMoreTimetable(timetableContext, selectDate.getDate());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ua4.c.SelectDate selectDate = (ua4.c.SelectDate) this.f196963f;
            k10.c0 c0Var = (k10.c0) this.f196964g;
            uq.b.e();
            if (this.f196962e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            TimetableContext context = ((ua4.d.DisplayingTimetable) c0Var.a()).getContext();
            fz.b.LocalDate localDateH9 = f0.this.H9(selectDate.getDate());
            final int iW9 = f0.this.W9(context.getCalendarAnchorDate(), localDateH9);
            final TimetableContext timetableContextB = TimetableContext.b(context, null, null, null, f0.this.dateCalculator.c(localDateH9), null, 23, null);
            return context.d().contains(localDateH9.getDate()) ? c0Var.b(new er.l() { // from class: ua4.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.h.V(timetableContextB, selectDate, iW9, (d.DisplayingTimetable) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: ua4.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.h.X(timetableContextB, selectDate, (d.DisplayingTimetable) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ua4.c.SelectDate selectDate, k10.c0<ua4.d.DisplayingTimetable> c0Var, tq.e<? super k10.l<? extends ua4.d>> eVar) {
            h hVar = f0.this.new h(eVar);
            hVar.f196963f = selectDate;
            hVar.f196964g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lua4/c$g;", "action", "Lk10/c0;", "Lua4/d$a;", "state", "Lk10/l;", "Lua4/d;", "<anonymous>", "(Lua4/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ua4.c.UpdateDominantYearMonth, k10.c0<ua4.d.DisplayingTimetable>, tq.e<? super k10.l<? extends ua4.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f196968g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ua4.d.DisplayingTimetable O(f0 f0Var, ua4.c.UpdateDominantYearMonth updateDominantYearMonth, ua4.d.DisplayingTimetable displayingTimetable) {
            return ua4.d.DisplayingTimetable.b(displayingTimetable, TimetableContext.b(displayingTimetable.getContext(), null, null, null, f0Var.dateCalculator.c(updateDominantYearMonth.getFirstDayInWeekDate()), null, 23, null), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ua4.c.UpdateDominantYearMonth updateDominantYearMonth = (ua4.c.UpdateDominantYearMonth) this.f196967f;
            k10.c0 c0Var = (k10.c0) this.f196968g;
            uq.b.e();
            if (this.f196966e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final f0 f0Var = f0.this;
            return c0Var.b(new er.l() { // from class: ua4.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.i.O(f0Var, updateDominantYearMonth, (d.DisplayingTimetable) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ua4.c.UpdateDominantYearMonth updateDominantYearMonth, k10.c0<ua4.d.DisplayingTimetable> c0Var, tq.e<? super k10.l<? extends ua4.d>> eVar) {
            i iVar = f0.this.new i(eVar);
            iVar.f196967f = updateDominantYearMonth;
            iVar.f196968g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lua4/c$d;", "<unused var>", "Lua4/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lua4/c$d;Lua4/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ua4.c.d, ua4.d.DisplayingTimetable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196971f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(f0 f0Var, LocalDate localDate) {
            f0Var.d9(new ua4.c.SelectDate(new fz.b.LocalDate(localDate)));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ua4.d.DisplayingTimetable displayingTimetable = (ua4.d.DisplayingTimetable) this.f196971f;
            uq.b.e();
            if (this.f196970e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f0 f0Var = f0.this;
            LocalDate date = displayingTimetable.getSelectedDate().getDate();
            final f0 f0Var2 = f0.this;
            f0Var.d9(new ua4.c.a.GoToDatePicker(new uw.j.Single(null, date, new er.l() { // from class: ua4.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.j.O(f0Var2, (LocalDate) obj2);
                }
            }, null, null, 25, null)));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ua4.c.d dVar, ua4.d.DisplayingTimetable displayingTimetable, tq.e<? super oq.i0> eVar) {
            j jVar = f0.this.new j(eVar);
            jVar.f196971f = displayingTimetable;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lua4/c$c;", "action", "Lua4/d$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lua4/c$c;Lua4/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ua4.c.OnLessonClick, ua4.d.DisplayingTimetable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196974f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ua4.c.OnLessonClick onLessonClick = (ua4.c.OnLessonClick) this.f196974f;
            Object objE = uq.b.e();
            int i15 = this.f196973e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0.this.contract.c7(onLessonClick.getLessonId());
                f0 f0Var = f0.this;
                ua4.c.a.GoToLessonDetails goToLessonDetails = new ua4.c.a.GoToLessonDetails(onLessonClick.getLessonId());
                this.f196974f = vq.j.a(onLessonClick);
                this.f196973e = 1;
                if (f0Var.F(goToLessonDetails, this) == objE) {
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
        public final Object w(ua4.c.OnLessonClick onLessonClick, ua4.d.DisplayingTimetable displayingTimetable, tq.e<? super oq.i0> eVar) {
            k kVar = f0.this.new k(eVar);
            kVar.f196974f = onLessonClick;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua4/c$b;", "<unused var>", "Lua4/d$d;", "Loq/i0;", "<anonymous>", "(Lua4/c$b;Lua4/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ua4.c.b, ua4.d.LoadingMoreTimetable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196976e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196976e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                ua4.c.a.C5122a c5122a = ua4.c.a.C5122a.f196885a;
                this.f196976e = 1;
                if (f0Var.F(c5122a, this) == objE) {
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
        public final Object w(ua4.c.b bVar, ua4.d.LoadingMoreTimetable loadingMoreTimetable, tq.e<? super oq.i0> eVar) {
            return f0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lua4/d$d;", "state", "Lk10/l;", "Lua4/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<k10.c0<ua4.d.LoadingMoreTimetable>, tq.e<? super k10.l<? extends ua4.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196979f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lua4/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ua4.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f196981e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f196982f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f196983g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<ua4.d.LoadingMoreTimetable> f196984h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ f0 f196985j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<ua4.d.LoadingMoreTimetable> c0Var, f0 f0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f196984h = c0Var;
                this.f196985j = f0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ua4.d.ErrorLoadingMoreTimetable X(TimetableContext timetableContext, fz.b.LocalDate localDate, f0 f0Var, dx.b bVar, ua4.d.LoadingMoreTimetable loadingMoreTimetable) {
                return new ua4.d.ErrorLoadingMoreTimetable(timetableContext, localDate, f0Var.E9(bVar, f0Var.b9(ua4.c.e.f196891a)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ua4.d Y(oa4.k kVar, f0 f0Var, fz.b.LocalDate localDate, TimetableContext timetableContext, ua4.d.LoadingMoreTimetable loadingMoreTimetable) {
                if (!(kVar instanceof oa4.k.Timetable)) {
                    if (kVar instanceof oa4.k.EmptyState) {
                        return new ua4.d.TimetableEmptyState(((oa4.k.EmptyState) kVar).getMessage());
                    }
                    if (fr.t.c(kVar, oa4.k.b.f144145a)) {
                        return new ua4.d.ErrorLoadingTimetable(f0Var.E9(new dx.b.Generic(null, 1, null), f0Var.b9(ua4.c.e.f196891a)));
                    }
                    throw new oq.p();
                }
                fz.b.LocalDate localDateH9 = f0Var.H9(localDate);
                List listL0 = pq.v.L0(timetableContext.c(), ((oa4.k.Timetable) kVar).a());
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listL0) {
                    if (hashSet.add(((TimetableDay) obj).getDate())) {
                        arrayList.add(obj);
                    }
                }
                return new ua4.d.DisplayingTimetable(TimetableContext.b(timetableContext, arrayList, null, localDateH9, null, e1.m(timetableContext.d(), localDateH9.getDate()), 10, null), localDate, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final TimetableContext context;
                final fz.b.LocalDate localDate;
                Object objE = uq.b.e();
                int i15 = this.f196983g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    context = this.f196984h.a().getContext();
                    fz.b.LocalDate pendingSelectedDate = this.f196984h.a().getPendingSelectedDate();
                    na4.a aVarI9 = this.f196985j.I9();
                    LocalDate date = pendingSelectedDate.getDate();
                    String strF = this.f196985j.contract.f();
                    this.f196981e = context;
                    this.f196982f = pendingSelectedDate;
                    this.f196983g = 1;
                    Object objA = aVarI9.a(date, strF, this);
                    if (objA == objE) {
                        return objE;
                    }
                    localDate = pendingSelectedDate;
                    obj = objA;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    localDate = (fz.b.LocalDate) this.f196982f;
                    context = (TimetableContext) this.f196981e;
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<ua4.d.LoadingMoreTimetable> c0Var = this.f196984h;
                final f0 f0Var = this.f196985j;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ua4.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.m.a.X(context, localDate, f0Var, bVar, (d.LoadingMoreTimetable) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final oa4.k kVar = (oa4.k) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ua4.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.m.a.Y(kVar, f0Var, localDate, context, (d.LoadingMoreTimetable) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f196984h, this.f196985j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ua4.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f196979f;
            Object objE = uq.b.e();
            int i15 = this.f196978e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = f0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, f0.this, null);
            this.f196979f = vq.j.a(c0Var);
            this.f196978e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ua4.d.LoadingMoreTimetable> c0Var, tq.e<? super k10.l<? extends ua4.d>> eVar) {
            return ((m) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            m mVar = f0.this.new m(eVar);
            mVar.f196979f = obj;
            return mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua4/c$b;", "<unused var>", "Lua4/d$b;", "Loq/i0;", "<anonymous>", "(Lua4/c$b;Lua4/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ua4.c.b, ua4.d.ErrorLoadingMoreTimetable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196986e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196986e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                ua4.c.a.C5122a c5122a = ua4.c.a.C5122a.f196885a;
                this.f196986e = 1;
                if (f0Var.F(c5122a, this) == objE) {
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
        public final Object w(ua4.c.b bVar, ua4.d.ErrorLoadingMoreTimetable errorLoadingMoreTimetable, tq.e<? super oq.i0> eVar) {
            return f0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lua4/c$e;", "<unused var>", "Lk10/c0;", "Lua4/d$b;", "state", "Lk10/l;", "Lua4/d;", "<anonymous>", "(Lua4/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ua4.c.e, k10.c0<ua4.d.ErrorLoadingMoreTimetable>, tq.e<? super k10.l<? extends ua4.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196989f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ua4.d.LoadingMoreTimetable O(k10.c0 c0Var, ua4.d.ErrorLoadingMoreTimetable errorLoadingMoreTimetable) {
            return new ua4.d.LoadingMoreTimetable(((ua4.d.ErrorLoadingMoreTimetable) c0Var.a()).getContext(), ((ua4.d.ErrorLoadingMoreTimetable) c0Var.a()).getPendingSelectedDate());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f196989f;
            uq.b.e();
            if (this.f196988e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ua4.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.o.O(c0Var, (d.ErrorLoadingMoreTimetable) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ua4.c.e eVar, k10.c0<ua4.d.ErrorLoadingMoreTimetable> c0Var, tq.e<? super k10.l<? extends ua4.d>> eVar2) {
            o oVar = new o(eVar2);
            oVar.f196989f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua4/c$b;", "<unused var>", "Lua4/d$c;", "Loq/i0;", "<anonymous>", "(Lua4/c$b;Lua4/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ua4.c.b, ua4.d.ErrorLoadingTimetable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196990e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196990e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                ua4.c.a.C5122a c5122a = ua4.c.a.C5122a.f196885a;
                this.f196990e = 1;
                if (f0Var.F(c5122a, this) == objE) {
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
        public final Object w(ua4.c.b bVar, ua4.d.ErrorLoadingTimetable errorLoadingTimetable, tq.e<? super oq.i0> eVar) {
            return f0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lua4/c$e;", "<unused var>", "Lk10/c0;", "Lua4/d$c;", "state", "Lk10/l;", "Lua4/d;", "<anonymous>", "(Lua4/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ua4.c.e, k10.c0<ua4.d.ErrorLoadingTimetable>, tq.e<? super k10.l<? extends ua4.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196993f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ua4.d.e O(ua4.d.ErrorLoadingTimetable errorLoadingTimetable) {
            return ua4.d.e.f196906a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f196993f;
            uq.b.e();
            if (this.f196992e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ua4.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.q.O((d.ErrorLoadingTimetable) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ua4.c.e eVar, k10.c0<ua4.d.ErrorLoadingTimetable> c0Var, tq.e<? super k10.l<? extends ua4.d>> eVar2) {
            q qVar = new q(eVar2);
            qVar.f196993f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public f0(yy.a aVar, wa4.b bVar, la4.a aVar2, ac4.d dVar, ac4.a aVar3, hb4.d dVar2, ib4.c cVar, ez.b bVar2, ez.h hVar, va4.a aVar4) {
        this.mapper = bVar;
        this.interactorFactory = aVar2;
        this.getCurrentServerTimeUseCase = dVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar;
        this.dateCalculator = bVar2;
        this.timeProvider = hVar;
        this.contract = aVar4;
        ua4.d.e eVar = ua4.d.e.f196906a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: ua4.v
            @Override // er.l
            public final Object b(Object obj) {
                return f0.P9(this.f197053a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), K9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c E9(dx.b domainError, final er.a<oq.i0> onRetry) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ua4.e0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.F9(this.f196914a, onRetry, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(f0 f0Var, er.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            f0Var.d9(ua4.c.b.f196888a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fz.b.LocalDate H9(fz.b.LocalDate date) {
        return this.dateCalculator.f(DayOfWeek.MONDAY, date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final na4.a I9() {
        return (na4.a) this.interactor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final na4.a J9(f0 f0Var) {
        return f0Var.interactorFactory.a(f0Var.contract.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ua4.g.a K9(ua4.d state) {
        return this.mapper.b(new wa4.b.Params(state, b9(ua4.c.b.f196888a), new er.l() { // from class: ua4.b0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.L9(this.f196884a, (fz.b.LocalDate) obj);
            }
        }, new er.l() { // from class: ua4.c0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.M9(this.f196896a, (fz.b.LocalDate) obj);
            }
        }, b9(ua4.c.d.f196890a), new er.l() { // from class: ua4.d0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.N9(this.f196908a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(f0 f0Var, fz.b.LocalDate localDate) {
        f0Var.d9(new ua4.c.SelectDate(localDate));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(f0 f0Var, fz.b.LocalDate localDate) {
        f0Var.d9(new ua4.c.UpdateDominantYearMonth(localDate));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(f0 f0Var, String str) {
        f0Var.d9(new ua4.c.OnLessonClick(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(final f0 f0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ua4.d.e.class), new er.l() { // from class: ua4.t
            @Override // er.l
            public final Object b(Object obj) {
                return f0.Q9(this.f197051a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ua4.d.TimetableEmptyState.class), new er.l() { // from class: ua4.w
            @Override // er.l
            public final Object b(Object obj) {
                return f0.R9(this.f197054a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ua4.d.DisplayingTimetable.class), new er.l() { // from class: ua4.x
            @Override // er.l
            public final Object b(Object obj) {
                return f0.S9(this.f197055a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ua4.d.LoadingMoreTimetable.class), new er.l() { // from class: ua4.y
            @Override // er.l
            public final Object b(Object obj) {
                return f0.T9(this.f197056a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ua4.d.ErrorLoadingMoreTimetable.class), new er.l() { // from class: ua4.z
            @Override // er.l
            public final Object b(Object obj) {
                return f0.U9(this.f197057a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ua4.d.ErrorLoadingTimetable.class), new er.l() { // from class: ua4.a0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.V9(this.f196881a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(f0 f0Var, k10.z zVar) {
        zVar.A(f0Var.new c(null));
        d dVar = f0Var.new d(null);
        zVar.x(fr.q0.c(ua4.c.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(f0 f0Var, k10.z zVar) {
        e eVar = f0Var.new e(null);
        zVar.x(fr.q0.c(ua4.c.b.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(f0 f0Var, k10.z zVar) {
        f fVar = f0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ua4.c.a.class), oVar, fVar);
        zVar.x(fr.q0.c(ua4.c.b.class), oVar, f0Var.new g(null));
        zVar.v(fr.q0.c(ua4.c.SelectDate.class), oVar, f0Var.new h(null));
        zVar.v(fr.q0.c(ua4.c.UpdateDominantYearMonth.class), oVar, f0Var.new i(null));
        zVar.x(fr.q0.c(ua4.c.d.class), oVar, f0Var.new j(null));
        zVar.x(fr.q0.c(ua4.c.OnLessonClick.class), oVar, f0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(f0 f0Var, k10.z zVar) {
        l lVar = f0Var.new l(null);
        zVar.x(fr.q0.c(ua4.c.b.class), k10.o.CANCEL_PREVIOUS, lVar);
        zVar.A(f0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(f0 f0Var, k10.z zVar) {
        n nVar = f0Var.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ua4.c.b.class), oVar, nVar);
        zVar.v(fr.q0.c(ua4.c.e.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(f0 f0Var, k10.z zVar) {
        p pVar = f0Var.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ua4.c.b.class), oVar, pVar);
        zVar.v(fr.q0.c(ua4.c.e.class), oVar, new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W9(fz.b.LocalDate start, fz.b.LocalDate end) {
        return this.dateCalculator.a(start, end);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ua4.c.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: O9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(va4.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<ua4.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ua4.d, ua4.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ua4.g.a> getState() {
        return this.state;
    }
}
