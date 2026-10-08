package qt2;

import fr.q0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import k10.c0;
import mu.p0;
import mx.Label;
import n70.TimeResult;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt2.PeselUnrestrictNavParam;
import ww.NavigationTimePickerDialogData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BQ\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b!\u0010\u001eJ\u0018\u0010\"\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010$\u001a\u00020 *\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010&\u001a\b\u0012\u0004\u0012\u00020'0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lqt2/q;", "Ll00/g;", "Lqt2/b;", "Lqt2/a;", "Lqt2/c;", "", "Lyy/a;", "stateMachineFactory", "Lws2/h;", "getUnrestrictStartDate", "Lws2/g;", "getUnrestrictInitialRoundedDate", "Lws2/j;", "validateUnrestrictTimeUseCase", "Lws2/i;", "validateUnrestrictDateUseCase", "Lws2/c;", "disablePeselRestrictionUseCase", "Lst2/c;", "mapper", "Lib4/c;", "genericDomainErrorHandler", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Lws2/h;Lws2/g;Lws2/j;Lws2/i;Lws2/c;Lst2/c;Lib4/c;Lmx/c;)V", "Ljava/time/OffsetDateTime;", "dateTime", "Loq/i0;", "A9", "(Ljava/time/OffsetDateTime;Ltq/e;)Ljava/lang/Object;", "pickedDateTime", "Lhz/b;", "w9", "v9", "Lhz/g;", "z9", "(Lhz/g;)Lhz/b;", "state", "Lqt2/c$a;", "x9", "(Lqt2/b;)Lqt2/c$a;", "b", "Lws2/h;", "c", "Lws2/g;", "d", "Lws2/j;", "e", "Lws2/i;", "f", "Lws2/c;", "g", "Lst2/c;", "h", "Lib4/c;", "j", "Lmx/c;", "Lqt2/b$a;", "k", "Lqt2/b$a;", "initialState", "Lxw/b;", "Lqt2/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<qt2.b, qt2.a> implements qt2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ws2.h getUnrestrictStartDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ws2.g getUnrestrictInitialRoundedDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ws2.j validateUnrestrictTimeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ws2.i validateUnrestrictDateUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ws2.c disablePeselRestrictionUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final st2.c mapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final qt2.b.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qt2.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qt2.b, qt2.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<qt2.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f168584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f168585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168586f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f168588h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f168586f = obj;
            this.f168588h |= PKIFailureInfo.systemUnavail;
            return q.this.v9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f168589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f168590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168591f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f168593h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f168591f = obj;
            this.f168593h |= PKIFailureInfo.systemUnavail;
            return q.this.w9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f168594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f168595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f168596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f168597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f168598h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f168599j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f168601l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f168599j = obj;
            this.f168601l |= PKIFailureInfo.systemUnavail;
            return q.this.A9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<qt2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f168602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f168603b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f168604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f168605b;

            /* JADX INFO: renamed from: qt2.q$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4266a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f168606d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f168607e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f168608f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f168610h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f168611j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f168612k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f168613l;

                public C4266a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f168606d = obj;
                    this.f168607e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f168604a = hVar;
                this.f168605b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4266a c4266a;
                if (eVar instanceof C4266a) {
                    c4266a = (C4266a) eVar;
                    int i15 = c4266a.f168607e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4266a.f168607e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4266a = new C4266a(eVar);
                    }
                } else {
                    c4266a = new C4266a(eVar);
                }
                Object obj2 = c4266a.f168606d;
                Object objE = uq.b.e();
                int i16 = c4266a.f168607e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f168604a;
                    qt2.c.a aVarX9 = this.f168605b.x9((qt2.b) obj);
                    c4266a.f168608f = vq.j.a(obj);
                    c4266a.f168610h = vq.j.a(c4266a);
                    c4266a.f168611j = vq.j.a(obj);
                    c4266a.f168612k = vq.j.a(hVar);
                    c4266a.f168613l = 0;
                    c4266a.f168607e = 1;
                    if (hVar.F(aVarX9, c4266a) == objE) {
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

        public d(mu.g gVar, q qVar) {
            this.f168602a = gVar;
            this.f168603b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qt2.c.a> hVar, tq.e eVar) {
            Object objA = this.f168602a.a(new a(hVar, this.f168603b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqt2/a$a;", "<unused var>", "Lqt2/b;", "Loq/i0;", "<anonymous>", "(Lqt2/a$a;Lqt2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qt2.a.C4261a, qt2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168614e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f168614e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qt2.a.b> bVarY1 = q.this.Y1();
                qt2.a.b.C4262a c4262a = qt2.a.b.C4262a.f168526a;
                this.f168614e = 1;
                if (bVarY1.F(c4262a, this) == objE) {
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
        public final Object w(qt2.a.C4261a c4261a, qt2.b bVar, tq.e<? super i0> eVar) {
            return q.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqt2/b$a;", "state", "Lk10/l;", "Lqt2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<qt2.b.a>, tq.e<? super k10.l<? extends qt2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168617f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qt2.b.Initialized O(OffsetDateTime offsetDateTime, qt2.b.a aVar) {
            tt2.b.a aVar2 = tt2.b.a.f192302a;
            LocalDate localDate = offsetDateTime.toLocalDate();
            OffsetTime offsetTime = offsetDateTime.toOffsetTime();
            hz.b.d dVar = hz.b.d.f86848c;
            return new qt2.b.Initialized(aVar2, localDate, offsetTime, dVar, dVar, offsetDateTime);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f168617f;
            Object objE = uq.b.e();
            int i15 = this.f168616e;
            if (i15 == 0) {
                oq.u.b(obj);
                ws2.g gVar = q.this.getUnrestrictInitialRoundedDate;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f168617f = c0Var;
                this.f168616e = 1;
                obj = gVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return c0Var.d(new er.l() { // from class: qt2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(offsetDateTime, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<qt2.b.a> c0Var, tq.e<? super k10.l<? extends qt2.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f168617f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqt2/a$h;", "<unused var>", "Lk10/c0;", "Lqt2/b$b;", "state", "Lk10/l;", "Lqt2/b;", "<anonymous>", "(Lqt2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qt2.a.h, c0<qt2.b.Initialized>, tq.e<? super k10.l<? extends qt2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f168619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f168620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f168621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f168622h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f168623j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qt2.b.Initialized O(hz.b bVar, hz.b bVar2, qt2.b.Initialized initialized) {
            return qt2.b.Initialized.b(initialized, null, null, null, bVar, bVar2, null, 39, null);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x009d A[PHI: r2 r3 r8
          0x009d: PHI (r2v12 hz.b) = (r2v11 hz.b), (r2v17 hz.b) binds: [B:21:0x009a, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]
          0x009d: PHI (r3v3 java.time.OffsetDateTime) = (r3v2 java.time.OffsetDateTime), (r3v6 java.time.OffsetDateTime) binds: [B:21:0x009a, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]
          0x009d: PHI (r8v16 java.lang.Object) = (r8v15 java.lang.Object), (r8v0 java.lang.Object) binds: [B:21:0x009a, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
        
            if (r5.A9(r3, r7) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
        
            if (r8.A9(null, r7) == r1) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qt2.q.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qt2.a.h hVar, c0<qt2.b.Initialized> c0Var, tq.e<? super k10.l<? extends qt2.b>> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f168623j = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqt2/a$e;", "<destruct>", "Lk10/c0;", "Lqt2/b$b;", "state", "Lk10/l;", "Lqt2/b;", "<anonymous>", "(Lqt2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<qt2.a.SelectedRadioButton, c0<qt2.b.Initialized>, tq.e<? super k10.l<? extends qt2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168626f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f168627g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qt2.b.Initialized O(tt2.b bVar, qt2.b.Initialized initialized) {
            return qt2.b.Initialized.b(initialized, bVar, null, null, null, null, null, 62, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qt2.a.SelectedRadioButton selectedRadioButton = (qt2.a.SelectedRadioButton) this.f168626f;
            c0 c0Var = (c0) this.f168627g;
            uq.b.e();
            if (this.f168625e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final tt2.b id5 = selectedRadioButton.getId();
            return c0Var.b(new er.l() { // from class: qt2.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.h.O(id5, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qt2.a.SelectedRadioButton selectedRadioButton, c0<qt2.b.Initialized> c0Var, tq.e<? super k10.l<? extends qt2.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f168626f = selectedRadioButton;
            hVar.f168627g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqt2/a$c;", "<unused var>", "Lqt2/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lqt2/a$c;Lqt2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qt2.a.c, qt2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f168628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f168629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f168630g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(q qVar, LocalDate localDate) {
            qVar.d9(new qt2.a.SetDateForField(localDate));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qt2.b.Initialized initialized = (qt2.b.Initialized) this.f168630g;
            Object objE = uq.b.e();
            int i15 = this.f168629f;
            if (i15 == 0) {
                oq.u.b(obj);
                OffsetDateTime nextAvailableDateTime = q.this.getUnrestrictStartDate.b(gz.b.a.C1792a.f78542a).getNextAvailableDateTime();
                xw.b<qt2.a.b> bVarY1 = q.this.Y1();
                LocalDate selectedDate = initialized.getSelectedDate();
                LocalDate localDate = nextAvailableDateTime.toLocalDate();
                final q qVar = q.this;
                qt2.a.b.OpenDatePicker openDatePicker = new qt2.a.b.OpenDatePicker(selectedDate, localDate, new er.l() { // from class: qt2.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.i.O(qVar, (LocalDate) obj2);
                    }
                });
                this.f168630g = vq.j.a(initialized);
                this.f168628e = vq.j.a(nextAvailableDateTime);
                this.f168629f = 1;
                if (bVarY1.F(openDatePicker, this) == objE) {
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
        public final Object w(qt2.a.c cVar, qt2.b.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f168630g = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqt2/a$d;", "<unused var>", "Lqt2/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lqt2/a$d;Lqt2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<qt2.a.d, qt2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168633f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(q qVar, TimeResult timeResult) {
            qVar.d9(new qt2.a.SetTimeForField(timeResult.a().getDate()));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qt2.b.Initialized initialized = (qt2.b.Initialized) this.f168633f;
            Object objE = uq.b.e();
            int i15 = this.f168632e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                Label labelC = q.this.labelProvider.c(rs2.a.f175900h);
                int hour = initialized.getSelectedTime().getHour();
                int minute = initialized.getSelectedTime().getMinute();
                Label labelC2 = q.this.labelProvider.c(rs2.a.f175892d);
                Label labelC3 = q.this.labelProvider.c(rs2.a.f175888b);
                final q qVar2 = q.this;
                qt2.a.b.OpenTimePicker openTimePicker = new qt2.a.b.OpenTimePicker(new NavigationTimePickerDialogData(labelC, hour, minute, labelC2, labelC3, new er.l() { // from class: qt2.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.j.O(qVar2, (TimeResult) obj2);
                    }
                }));
                this.f168633f = vq.j.a(initialized);
                this.f168632e = 1;
                if (qVar.F(openTimePicker, this) == objE) {
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
        public final Object w(qt2.a.d dVar, qt2.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = q.this.new j(eVar);
            jVar.f168633f = initialized;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqt2/a$f;", "<destruct>", "Lk10/c0;", "Lqt2/b$b;", "state", "Lk10/l;", "Lqt2/b;", "<anonymous>", "(Lqt2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<qt2.a.SetDateForField, c0<qt2.b.Initialized>, tq.e<? super k10.l<? extends qt2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f168635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f168636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f168637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f168638h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f168639j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f168640k;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qt2.b.Initialized O(LocalDate localDate, hz.b bVar, hz.b bVar2, qt2.b.Initialized initialized) {
            return qt2.b.Initialized.b(initialized, null, localDate, null, bVar, bVar2, null, 37, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OffsetDateTime offsetDateTimeAtTime;
            LocalDate localDate;
            final hz.b bVar;
            final LocalDate localDate2;
            qt2.a.SetDateForField setDateForField = (qt2.a.SetDateForField) this.f168639j;
            c0 c0Var = (c0) this.f168640k;
            Object objE = uq.b.e();
            int i15 = this.f168638h;
            if (i15 != 0) {
                if (i15 == 1) {
                    offsetDateTimeAtTime = (OffsetDateTime) this.f168636f;
                    localDate = (LocalDate) this.f168635e;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (hz.b) this.f168637g;
                    localDate2 = (LocalDate) this.f168635e;
                    oq.u.b(obj);
                }
                final hz.b bVar2 = (hz.b) obj;
                return c0Var.b(new er.l() { // from class: qt2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.k.O(localDate2, bVar2, bVar, (b.Initialized) obj2);
                    }
                });
            }
            oq.u.b(obj);
            LocalDate date = setDateForField.getDate();
            offsetDateTimeAtTime = date.atTime(((qt2.b.Initialized) c0Var.a()).getSelectedTime());
            q qVar = q.this;
            this.f168639j = vq.j.a(setDateForField);
            this.f168640k = c0Var;
            this.f168635e = date;
            this.f168636f = offsetDateTimeAtTime;
            this.f168638h = 1;
            Object objW9 = qVar.w9(offsetDateTimeAtTime, this);
            if (objW9 != objE) {
                localDate = date;
                obj = objW9;
            }
            return objE;
            hz.b bVar3 = (hz.b) obj;
            q qVar2 = q.this;
            this.f168639j = vq.j.a(setDateForField);
            this.f168640k = c0Var;
            this.f168635e = localDate;
            this.f168636f = vq.j.a(offsetDateTimeAtTime);
            this.f168637g = bVar3;
            this.f168638h = 2;
            Object objV9 = qVar2.v9(offsetDateTimeAtTime, this);
            if (objV9 != objE) {
                bVar = bVar3;
                obj = objV9;
                localDate2 = localDate;
                final hz.b bVar4 = (hz.b) obj;
                return c0Var.b(new er.l() { // from class: qt2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.k.O(localDate2, bVar4, bVar, (b.Initialized) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qt2.a.SetDateForField setDateForField, c0<qt2.b.Initialized> c0Var, tq.e<? super k10.l<? extends qt2.b>> eVar) {
            k kVar = q.this.new k(eVar);
            kVar.f168639j = setDateForField;
            kVar.f168640k = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqt2/a$g;", "<destruct>", "Lk10/c0;", "Lqt2/b$b;", "state", "Lk10/l;", "Lqt2/b;", "<anonymous>", "(Lqt2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<qt2.a.SetTimeForField, c0<qt2.b.Initialized>, tq.e<? super k10.l<? extends qt2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f168642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f168643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f168644g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f168645h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f168646j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f168647k;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qt2.b.Initialized O(OffsetTime offsetTime, hz.b bVar, hz.b bVar2, qt2.b.Initialized initialized) {
            return qt2.b.Initialized.b(initialized, null, null, offsetTime, bVar, bVar2, null, 35, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OffsetDateTime offsetDateTimeAtTime;
            OffsetTime offsetTime;
            final hz.b bVar;
            final OffsetTime offsetTime2;
            qt2.a.SetTimeForField setTimeForField = (qt2.a.SetTimeForField) this.f168646j;
            c0 c0Var = (c0) this.f168647k;
            Object objE = uq.b.e();
            int i15 = this.f168645h;
            if (i15 != 0) {
                if (i15 == 1) {
                    offsetDateTimeAtTime = (OffsetDateTime) this.f168643f;
                    offsetTime = (OffsetTime) this.f168642e;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (hz.b) this.f168644g;
                    offsetTime2 = (OffsetTime) this.f168642e;
                    oq.u.b(obj);
                }
                final hz.b bVar2 = (hz.b) obj;
                return c0Var.b(new er.l() { // from class: qt2.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.l.O(offsetTime2, bVar2, bVar, (b.Initialized) obj2);
                    }
                });
            }
            oq.u.b(obj);
            OffsetTime time = setTimeForField.getTime();
            offsetDateTimeAtTime = ((qt2.b.Initialized) c0Var.a()).getSelectedDate().atTime(time);
            q qVar = q.this;
            this.f168646j = vq.j.a(setTimeForField);
            this.f168647k = c0Var;
            this.f168642e = time;
            this.f168643f = offsetDateTimeAtTime;
            this.f168645h = 1;
            Object objW9 = qVar.w9(offsetDateTimeAtTime, this);
            if (objW9 != objE) {
                offsetTime = time;
                obj = objW9;
            }
            return objE;
            hz.b bVar3 = (hz.b) obj;
            q qVar2 = q.this;
            this.f168646j = vq.j.a(setTimeForField);
            this.f168647k = c0Var;
            this.f168642e = offsetTime;
            this.f168643f = vq.j.a(offsetDateTimeAtTime);
            this.f168644g = bVar3;
            this.f168645h = 2;
            Object objV9 = qVar2.v9(offsetDateTimeAtTime, this);
            if (objV9 != objE) {
                bVar = bVar3;
                obj = objV9;
                offsetTime2 = offsetTime;
                final hz.b bVar4 = (hz.b) obj;
                return c0Var.b(new er.l() { // from class: qt2.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.l.O(offsetTime2, bVar4, bVar, (b.Initialized) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qt2.a.SetTimeForField setTimeForField, c0<qt2.b.Initialized> c0Var, tq.e<? super k10.l<? extends qt2.b>> eVar) {
            l lVar = q.this.new l(eVar);
            lVar.f168646j = setTimeForField;
            lVar.f168647k = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, ws2.h hVar, ws2.g gVar, ws2.j jVar, ws2.i iVar, ws2.c cVar, st2.c cVar2, ib4.c cVar3, mx.c cVar4) {
        this.getUnrestrictStartDate = hVar;
        this.getUnrestrictInitialRoundedDate = gVar;
        this.validateUnrestrictTimeUseCase = jVar;
        this.validateUnrestrictDateUseCase = iVar;
        this.disablePeselRestrictionUseCase = cVar;
        this.mapper = cVar2;
        this.genericDomainErrorHandler = cVar3;
        this.labelProvider = cVar4;
        qt2.b.a aVar2 = qt2.b.a.f168541a;
        this.initialState = aVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: qt2.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f168566a, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), x9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r2.F(r3, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        if (r4.F(r7, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A9(java.time.OffsetDateTime r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qt2.q.A9(java.time.OffsetDateTime, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(q qVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close)) {
            new qt2.a.b.GoBackToPreviousScreen(new PeselUnrestrictNavParam(true, true));
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            qVar.d9(qt2.a.h.f168539a);
            i0 i0Var = i0.f148189a;
        } else {
            i0 i0Var2 = i0.f148189a;
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(qt2.b.class), new er.l() { // from class: qt2.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.E9(this.f168568a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qt2.b.a.class), new er.l() { // from class: qt2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.F9(this.f168569a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qt2.b.Initialized.class), new er.l() { // from class: qt2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.G9(this.f168570a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(q qVar, k10.z zVar) {
        e eVar = qVar.new e(null);
        zVar.x(q0.c(qt2.a.C4261a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(q qVar, k10.z zVar) {
        zVar.A(qVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(q qVar, k10.z zVar) {
        g gVar = qVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(qt2.a.h.class), oVar, gVar);
        zVar.v(q0.c(qt2.a.SelectedRadioButton.class), oVar, new h(null));
        zVar.x(q0.c(qt2.a.c.class), oVar, qVar.new i(null));
        zVar.x(q0.c(qt2.a.d.class), oVar, qVar.new j(null));
        zVar.v(q0.c(qt2.a.SetDateForField.class), oVar, qVar.new k(null));
        zVar.v(q0.c(qt2.a.SetTimeForField.class), oVar, qVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v9(OffsetDateTime offsetDateTime, tq.e<? super hz.b> eVar) throws Throwable {
        a aVar;
        q qVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f168588h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f168588h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f168586f;
        Object objE = uq.b.e();
        int i16 = aVar.f168588h;
        if (i16 == 0) {
            oq.u.b(objD);
            ws2.i iVar = this.validateUnrestrictDateUseCase;
            ws2.i.Params params = new ws2.i.Params(offsetDateTime);
            aVar.f168584d = vq.j.a(offsetDateTime);
            aVar.f168585e = this;
            aVar.f168588h = 1;
            objD = iVar.d(params, aVar);
            if (objD == objE) {
                return objE;
            }
            qVar = this;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) aVar.f168585e;
            oq.u.b(objD);
        }
        return qVar.z9((hz.g) objD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w9(OffsetDateTime offsetDateTime, tq.e<? super hz.b> eVar) throws Throwable {
        b bVar;
        q qVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f168593h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f168593h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f168591f;
        Object objE = uq.b.e();
        int i16 = bVar.f168593h;
        if (i16 == 0) {
            oq.u.b(objD);
            ws2.j jVar = this.validateUnrestrictTimeUseCase;
            ws2.j.Params params = new ws2.j.Params(offsetDateTime);
            bVar.f168589d = vq.j.a(offsetDateTime);
            bVar.f168590e = this;
            bVar.f168593h = 1;
            objD = jVar.d(params, bVar);
            if (objD == objE) {
                return objE;
            }
            qVar = this;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) bVar.f168590e;
            oq.u.b(objD);
        }
        return qVar.z9((hz.g) objD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qt2.c.a x9(qt2.b state) {
        st2.c cVar = this.mapper;
        er.a<i0> aVarB9 = b9(qt2.a.h.f168539a);
        er.a<i0> aVarB10 = b9(qt2.a.C4261a.f168525a);
        return cVar.b(new st2.c.Params(state, new er.l() { // from class: qt2.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f168567a, (tt2.b) obj);
            }
        }, b9(qt2.a.c.f168534a), b9(qt2.a.d.f168535a), aVarB9, aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, tt2.b bVar) {
        qVar.d9(new qt2.a.SelectedRadioButton(bVar));
        return i0.f148189a;
    }

    private final hz.b z9(hz.g gVar) {
        if (gVar instanceof hz.g.Invalid) {
            return new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage());
        }
        if (fr.t.c(gVar, hz.g.b.f86853b)) {
            return hz.b.d.f86848c;
        }
        if (gVar == null) {
            return hz.b.C2039b.f86846c;
        }
        throw new oq.p();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<qt2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<qt2.b, qt2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qt2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(qt2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
