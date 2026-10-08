package le2;

import fr.q0;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mu.p0;
import mx.Label;
import n70.TimeResult;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;
import ww.NavigationTimePickerDialogData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030C8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lle2/r;", "Ll00/g;", "Lle2/d;", "Lle2/b;", "Lle2/e;", "", "Lyy/a;", "stateMachineFactory", "Lme2/d;", "mapper", "Lqe2/a;", "closeProcessDialogMapper", "Lcb4/j;", "dialogVMSFactory", "Lae2/l;", "validDescriptionUC", "Lez/a;", "currentTimeProvider", "Lmx/c;", "labelProvider", "Lle2/f;", "setupContract", "<init>", "(Lyy/a;Lme2/d;Lqe2/a;Lcb4/j;Lae2/l;Lez/a;Lmx/c;Lle2/f;)V", "state", "Lle2/e$a;", "x9", "(Lle2/d;)Lle2/e$a;", "Lvy/c;", "location", "Lhz/b;", "F9", "(Lvy/c;)Lhz/b;", "Lfz/b$d;", "incidentDate", "maxDate", "E9", "(Lfz/b$d;Lfz/b$d;)Lhz/b;", "data", "Loq/i0;", "z9", "(Lle2/f;)V", "b", "Lme2/d;", "c", "Lqe2/a;", "d", "Lcb4/j;", "e", "Lae2/l;", "f", "Lez/a;", "g", "Lmx/c;", "h", "Lle2/f;", "Lxw/b;", "Lle2/b$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lle2/d$a;", "k", "Lle2/d$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<le2.d, le2.b> implements le2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final me2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qe2.a closeProcessDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ae2.l validDescriptionUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final le2.f setupContract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<le2.b.InterfaceC2864b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final le2.d.Details initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<le2.d, le2.b> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<le2.e.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118085e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f118085e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(new le2.b.OnLocationChanged(r.this.setupContract.S0()));
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<le2.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f118087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f118088b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f118089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f118090b;

            /* JADX INFO: renamed from: le2.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2866a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f118091d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f118092e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f118093f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f118095h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f118096j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f118097k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f118098l;

                public C2866a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f118091d = obj;
                    this.f118092e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f118089a = hVar;
                this.f118090b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2866a c2866a;
                if (eVar instanceof C2866a) {
                    c2866a = (C2866a) eVar;
                    int i15 = c2866a.f118092e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2866a.f118092e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2866a = new C2866a(eVar);
                    }
                } else {
                    c2866a = new C2866a(eVar);
                }
                Object obj2 = c2866a.f118091d;
                Object objE = uq.b.e();
                int i16 = c2866a.f118092e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f118089a;
                    le2.e.Data dataX9 = this.f118090b.x9((le2.d) obj);
                    c2866a.f118093f = vq.j.a(obj);
                    c2866a.f118095h = vq.j.a(c2866a);
                    c2866a.f118096j = vq.j.a(obj);
                    c2866a.f118097k = vq.j.a(hVar);
                    c2866a.f118098l = 0;
                    c2866a.f118092e = 1;
                    if (hVar.F(dataX9, c2866a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f118087a = gVar;
            this.f118088b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super le2.e.Data> hVar, tq.e eVar) {
            Object objA = this.f118087a.a(new a(hVar, this.f118088b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lle2/b$c;", "<unused var>", "Lle2/d;", "Loq/i0;", "<anonymous>", "(Lle2/b$c;Lle2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<le2.b.c, le2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118099e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118099e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                le2.b.InterfaceC2864b.a aVar = le2.b.InterfaceC2864b.a.f118000a;
                this.f118099e = 1;
                if (rVar.F(aVar, this) == objE) {
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
        public final Object w(le2.b.c cVar, le2.d dVar, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lle2/b$m;", "<unused var>", "Lle2/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lle2/b$m;Lle2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<le2.b.m, le2.d.Details, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118102f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, TimeResult timeResult) {
            rVar.d9(new le2.b.OnTimeChanged(timeResult.a()));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            le2.d.Details details = (le2.d.Details) this.f118102f;
            Object objE = uq.b.e();
            int i15 = this.f118101e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                Label labelC = r.this.labelProvider.c(ud2.a.f197763u);
                int hour = details.getInitializedStateData().getIncidentDateTime().getDate().getHour();
                int minute = details.getInitializedStateData().getIncidentDateTime().getDate().getMinute();
                Label labelC2 = r.this.labelProvider.c(ud2.a.f197737h);
                Label labelC3 = r.this.labelProvider.c(ud2.a.f197725b);
                final r rVar2 = r.this;
                le2.b.InterfaceC2864b.ShowTimePicker showTimePicker = new le2.b.InterfaceC2864b.ShowTimePicker(new NavigationTimePickerDialogData(labelC, hour, minute, labelC2, labelC3, new er.l() { // from class: le2.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.O(rVar2, (TimeResult) obj2);
                    }
                }));
                this.f118102f = vq.j.a(details);
                this.f118101e = 1;
                if (rVar.F(showTimePicker, this) == objE) {
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
        public final Object w(le2.b.m mVar, le2.d.Details details, tq.e<? super i0> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f118102f = details;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$k;", "<unused var>", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<le2.b.k, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118105f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, le2.d.Details details) {
            return details.b(InitializedStateData.b(((le2.d.Details) c0Var.a()).getInitializedStateData(), null, null, null, null, null, null, null, 63, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f118105f;
            uq.b.e();
            if (this.f118104e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: le2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(c0Var, (d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.k kVar, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f118105f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$n;", "<unused var>", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<le2.b.n, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118107f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Dialog O(k10.c0 c0Var, r rVar, le2.d.Details details) {
            return new le2.d.Dialog(((le2.d.Details) c0Var.a()).getInitializedStateData(), rVar.dialogVMSFactory.a(rVar.closeProcessDialogMapper.b(new qe2.a.Params(rVar.b9(le2.b.e.f118009a), rVar.b9(le2.b.a.f117999a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f118107f;
            uq.b.e();
            if (this.f118106e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: le2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O(c0Var, rVar, (d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.n nVar, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f118107f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$i;", "<unused var>", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<le2.b.i, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f118109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f118110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f118111g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f118112h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f118113j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f118114k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f118115l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f118116m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f118117n;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, List list, hz.b bVar, hz.b bVar2, hz.b bVar3, le2.d.Details details) {
            Object next;
            InitializedStateData initializedStateData = ((le2.d.Details) c0Var.a()).getInitializedStateData();
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((oq.r) next).d() instanceof hz.b.Invalid));
            oq.r rVar = (oq.r) next;
            return details.b(InitializedStateData.b(initializedStateData, null, bVar, null, bVar2, null, bVar3, rVar != null ? (le2.a) rVar.c() : null, 21, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f118117n;
            Object objE = uq.b.e();
            int i15 = this.f118116m;
            if (i15 == 0) {
                oq.u.b(obj);
                fz.b.LocalDateTime incidentDateTime = ((le2.d.Details) c0Var.a()).getInitializedStateData().getIncidentDateTime();
                Coordinates location = ((le2.d.Details) c0Var.a()).getInitializedStateData().getLocation();
                iy.b0 description = ((le2.d.Details) c0Var.a()).getInitializedStateData().getDescription();
                final hz.b bVarE9 = r.this.E9(incidentDateTime, new fz.b.LocalDateTime(r.this.currentTimeProvider.i()));
                final hz.b bVarA = hz.b.INSTANCE.a(r.this.validDescriptionUC.b(new ae2.l.Param(description)));
                final hz.b bVarF9 = r.this.F9(location);
                r.this.setupContract.x2(description);
                r.this.setupContract.A1(incidentDateTime);
                final List listQ = pq.v.q(oq.y.a(le2.a.TIME_PICKER, bVarE9), oq.y.a(le2.a.DESCRIPTION, bVarA), oq.y.a(le2.a.LOCATION, bVarF9));
                List list = listQ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((hz.b) ((oq.r) it.next()).d()).a()) {
                            return c0Var.b(new er.l() { // from class: le2.v
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return r.g.O(c0Var, listQ, bVarA, bVarE9, bVarF9, (d.Details) obj2);
                                }
                            });
                        }
                    }
                }
                r rVar = r.this;
                le2.b.InterfaceC2864b.c cVar = le2.b.InterfaceC2864b.c.f118002a;
                this.f118117n = c0Var;
                this.f118109e = vq.j.a(incidentDateTime);
                this.f118110f = vq.j.a(location);
                this.f118111g = vq.j.a(description);
                this.f118112h = vq.j.a(bVarE9);
                this.f118113j = vq.j.a(bVarA);
                this.f118114k = vq.j.a(bVarF9);
                this.f118115l = vq.j.a(listQ);
                this.f118116m = 1;
                if (rVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.i iVar, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f118117n = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$j;", "action", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<le2.b.OnLocationChanged, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118121g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, le2.b.OnLocationChanged onLocationChanged, le2.d.Details details) {
            return details.b(InitializedStateData.b(((le2.d.Details) c0Var.a()).getInitializedStateData(), null, null, null, null, onLocationChanged.getNewLocation(), hz.b.C2039b.f86846c, null, 79, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final le2.b.OnLocationChanged onLocationChanged = (le2.b.OnLocationChanged) this.f118120f;
            final k10.c0 c0Var = (k10.c0) this.f118121g;
            uq.b.e();
            if (this.f118119e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: le2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.h.O(c0Var, onLocationChanged, (d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.OnLocationChanged onLocationChanged, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            h hVar = new h(eVar);
            hVar.f118120f = onLocationChanged;
            hVar.f118121g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$d;", "<unused var>", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<le2.b.d, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118123f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, le2.d.Details details) {
            return details.b(InitializedStateData.b(((le2.d.Details) c0Var.a()).getInitializedStateData(), null, null, null, null, null, hz.b.C2039b.f86846c, null, 95, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f118123f;
            Object objE = uq.b.e();
            int i15 = this.f118122e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                le2.b.InterfaceC2864b.d dVar = le2.b.InterfaceC2864b.d.f118003a;
                this.f118123f = c0Var;
                this.f118122e = 1;
                if (rVar.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: le2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.i.O(c0Var, (d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.d dVar, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f118123f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$g;", "action", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<le2.b.OnDayChanged, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118127g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, fz.b.LocalDateTime localDateTime, le2.d.Details details) {
            return details.b(InitializedStateData.b(((le2.d.Details) c0Var.a()).getInitializedStateData(), null, null, localDateTime, hz.b.C2039b.f86846c, null, null, null, 115, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            le2.b.OnDayChanged onDayChanged = (le2.b.OnDayChanged) this.f118126f;
            final k10.c0 c0Var = (k10.c0) this.f118127g;
            uq.b.e();
            if (this.f118125e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            LocalDateTime date = ((le2.d.Details) c0Var.a()).getInitializedStateData().getIncidentDateTime().getDate();
            final fz.b.LocalDateTime localDateTime = new fz.b.LocalDateTime(onDayChanged.getIncidentDate().getDate().withSecond(date.getSecond()).withMinute(date.getMinute()).withHour(date.getHour()));
            r.this.setupContract.A1(localDateTime);
            return c0Var.b(new er.l() { // from class: le2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.j.O(c0Var, localDateTime, (d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.OnDayChanged onDayChanged, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f118126f = onDayChanged;
            jVar.f118127g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$l;", "action", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<le2.b.OnTimeChanged, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118131g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, fz.b.LocalDateTime localDateTime, le2.d.Details details) {
            return details.b(InitializedStateData.b(((le2.d.Details) c0Var.a()).getInitializedStateData(), null, null, localDateTime, hz.b.C2039b.f86846c, null, null, null, 115, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            le2.b.OnTimeChanged onTimeChanged = (le2.b.OnTimeChanged) this.f118130f;
            final k10.c0 c0Var = (k10.c0) this.f118131g;
            uq.b.e();
            if (this.f118129e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final fz.b.LocalDateTime localDateTime = new fz.b.LocalDateTime(((le2.d.Details) c0Var.a()).getInitializedStateData().getIncidentDateTime().getDate().withSecond(onTimeChanged.getIncidentTime().getDate().getSecond()).withMinute(onTimeChanged.getIncidentTime().getDate().getMinute()).withHour(onTimeChanged.getIncidentTime().getDate().getHour()));
            r.this.setupContract.A1(localDateTime);
            return c0Var.b(new er.l() { // from class: le2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.k.O(c0Var, localDateTime, (d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.OnTimeChanged onTimeChanged, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f118130f = onTimeChanged;
            kVar.f118131g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$h;", "action", "Lk10/c0;", "Lle2/d$a;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<le2.b.OnDescriptionChanged, k10.c0<le2.d.Details>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118135g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, le2.b.OnDescriptionChanged onDescriptionChanged, le2.d.Details details) {
            return details.b(InitializedStateData.b(((le2.d.Details) c0Var.a()).getInitializedStateData(), onDescriptionChanged.getDescription(), hz.b.C2039b.f86846c, null, null, null, null, null, 124, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final le2.b.OnDescriptionChanged onDescriptionChanged = (le2.b.OnDescriptionChanged) this.f118134f;
            final k10.c0 c0Var = (k10.c0) this.f118135g;
            uq.b.e();
            if (this.f118133e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.setupContract.x2(onDescriptionChanged.getDescription());
            return c0Var.b(new er.l() { // from class: le2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.l.O(c0Var, onDescriptionChanged, (d.Details) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.OnDescriptionChanged onDescriptionChanged, k10.c0<le2.d.Details> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            l lVar = r.this.new l(eVar);
            lVar.f118134f = onDescriptionChanged;
            lVar.f118135g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lle2/b$f;", "<unused var>", "Lle2/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lle2/b$f;Lle2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<le2.b.f, le2.d.Details, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f118137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f118138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118139g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, LocalDate localDate) {
            rVar.d9(new le2.b.OnDayChanged(new fz.b.LocalDateTime(LocalDateTime.of(localDate, LocalTime.NOON))));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            le2.d.Details details = (le2.d.Details) this.f118139g;
            Object objE = uq.b.e();
            int i15 = this.f118138f;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDateTime localDateTimeI = r.this.currentTimeProvider.i();
                r rVar = r.this;
                LocalDate localDate = details.getInitializedStateData().getIncidentDateTime().getDate().toLocalDate();
                final r rVar2 = r.this;
                le2.b.InterfaceC2864b.ShowDatePicker showDatePicker = new le2.b.InterfaceC2864b.ShowDatePicker(new uw.j.Single(null, localDate, new er.l() { // from class: le2.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.m.O(rVar2, (LocalDate) obj2);
                    }
                }, null, ez.d.h(new fz.b.LocalDateTime(localDateTimeI)).getDate(), 9, null));
                this.f118139g = vq.j.a(details);
                this.f118137e = vq.j.a(localDateTimeI);
                this.f118138f = 1;
                if (rVar.F(showDatePicker, this) == objE) {
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
        public final Object w(le2.b.f fVar, le2.d.Details details, tq.e<? super i0> eVar) {
            m mVar = r.this.new m(eVar);
            mVar.f118139g = details;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lle2/b$e;", "<unused var>", "Lle2/d$b;", "Loq/i0;", "<anonymous>", "(Lle2/b$e;Lle2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<le2.b.e, le2.d.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118141e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118141e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                le2.b.InterfaceC2864b.C2865b c2865b = le2.b.InterfaceC2864b.C2865b.f118001a;
                this.f118141e = 1;
                if (rVar.F(c2865b, this) == objE) {
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
        public final Object w(le2.b.e eVar, le2.d.Dialog dialog, tq.e<? super i0> eVar2) {
            return r.this.new n(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lle2/b$a;", "<unused var>", "Lk10/c0;", "Lle2/d$b;", "state", "Lk10/l;", "Lle2/d;", "<anonymous>", "(Lle2/b$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<le2.b.a, k10.c0<le2.d.Dialog>, tq.e<? super k10.l<? extends le2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118144f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final le2.d.Details O(k10.c0 c0Var, le2.d.Dialog dialog) {
            return new le2.d.Details(((le2.d.Dialog) c0Var.a()).getInitializedStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f118144f;
            uq.b.e();
            if (this.f118143e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: le2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.o.O(c0Var, (d.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(le2.b.a aVar, k10.c0<le2.d.Dialog> c0Var, tq.e<? super k10.l<? extends le2.d>> eVar) {
            o oVar = new o(eVar);
            oVar.f118144f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, me2.d dVar, qe2.a aVar2, cb4.j jVar, ae2.l lVar, ez.a aVar3, mx.c cVar, le2.f fVar) {
        this.mapper = dVar;
        this.closeProcessDialogMapper = aVar2;
        this.dialogVMSFactory = jVar;
        this.validDescriptionUC = lVar;
        this.currentTimeProvider = aVar3;
        this.labelProvider = cVar;
        this.setupContract = fVar;
        iy.b0 b0VarD1 = fVar.D1();
        le2.d.Details details = new le2.d.Details(new InitializedStateData(b0VarD1 == null ? iy.b0.INSTANCE.a() : b0VarD1, null, fVar.e2(), null, fVar.S0(), null, null, 106, null));
        this.initialState = details;
        this.stateMachine = aVar.a(details, new er.l() { // from class: le2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f118073a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), x9(details));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(le2.d.class), new er.l() { // from class: le2.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f118069a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(le2.d.Details.class), new er.l() { // from class: le2.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f118070a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(le2.d.Dialog.class), new er.l() { // from class: le2.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f118071a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, k10.z zVar) {
        c cVar = rVar.new c(null);
        zVar.x(q0.c(le2.b.c.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(le2.b.k.class), oVar, eVar);
        zVar.v(q0.c(le2.b.n.class), oVar, rVar.new f(null));
        zVar.v(q0.c(le2.b.i.class), oVar, rVar.new g(null));
        zVar.v(q0.c(le2.b.OnLocationChanged.class), oVar, new h(null));
        zVar.v(q0.c(le2.b.d.class), oVar, rVar.new i(null));
        zVar.v(q0.c(le2.b.OnDayChanged.class), oVar, rVar.new j(null));
        zVar.v(q0.c(le2.b.OnTimeChanged.class), oVar, rVar.new k(null));
        zVar.v(q0.c(le2.b.OnDescriptionChanged.class), oVar, rVar.new l(null));
        zVar.x(q0.c(le2.b.f.class), oVar, rVar.new m(null));
        zVar.x(q0.c(le2.b.m.class), oVar, rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, k10.z zVar) {
        n nVar = rVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(le2.b.e.class), oVar, nVar);
        zVar.v(q0.c(le2.b.a.class), oVar, new o(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b E9(fz.b.LocalDateTime incidentDate, fz.b.LocalDateTime maxDate) {
        boolean z15 = incidentDate.getDate().compareTo((ChronoLocalDateTime<?>) maxDate.getDate()) < 0;
        if (z15) {
            return hz.b.d.f86848c;
        }
        if (z15) {
            throw new oq.p();
        }
        return new hz.b.Invalid(this.labelProvider.c(ud2.a.M));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b F9(Coordinates location) {
        boolean z15 = location == null;
        if (z15) {
            return new hz.b.Invalid(this.labelProvider.c(ud2.a.S));
        }
        if (z15) {
            throw new oq.p();
        }
        return hz.b.d.f86848c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final le2.e.Data x9(le2.d state) {
        return this.mapper.b(new me2.d.Params(state, b9(le2.b.c.f118007a), b9(le2.b.n.f118022a), b9(le2.b.i.f118015a), b9(le2.b.d.f118008a), b9(le2.b.f.f118010a), b9(le2.b.m.f118021a), new er.l() { // from class: le2.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f118072a, (iy.b0) obj);
            }
        }, b9(le2.b.k.f118018a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, iy.b0 b0Var) {
        rVar.d9(new le2.b.OnDescriptionChanged(b0Var));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<le2.b.InterfaceC2864b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<le2.d, le2.b> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<le2.e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(le2.b.InterfaceC2864b interfaceC2864b, tq.e<? super i0> eVar) {
        return super.F(interfaceC2864b, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public void P5(le2.f data) {
        i00.a.a(this, new a(null));
    }
}
