package s80;

import ge4.x;
import java.time.LocalDate;
import jt3.BehaviourDto;
import jt3.GradeDetailsDto;
import jt3.LessonDetailsDto;
import jt3.LessonsWeekDto;
import jt3.SemesterDetailsDto;
import jt3.SemestersDto;
import jt3.SubjectGradesDto;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import u80.BEBehaviourSemesters;
import u80.BEGradeDetails;
import u80.BELessonDetails;
import u80.BESemesterDetails;
import u80.BESemesters;
import u80.BESubjectGrades;
import u80.BETimetableWeek;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u001b\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001d\u0010\u0011J$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010\u001e\u001a\u00020\rH\u0096@¢\u0006\u0004\b \u0010\u0011J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0\bH\u0096@¢\u0006\u0004\b\"\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b+\u0010,R\u001b\u00101\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Ls80/f;", "Lv80/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lu80/b0;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "semesterId", "Lu80/y;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "subjectId", "Lu80/d0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "Lu80/l0;", "g", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "gradeId", "Lu80/n;", "a", "lessonId", "Lu80/r;", "b", "Lu80/m;", "f", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lit3/b;", "Loq/k;", "o", "()Lit3/b;", "behaviourApi", "Lit3/c;", "p", "()Lit3/c;", "gradesApi", "Lit3/d;", "q", "()Lit3/d;", "timetableApi", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements v80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k behaviourApi = oq.l.a(new er.a() { // from class: s80.c
        @Override // er.a
        public final Object a() {
            return f.n(this.f178924a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k gradesApi = oq.l.a(new er.a() { // from class: s80.d
        @Override // er.a
        public final Object a() {
            return f.r(this.f178925a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k timetableApi = oq.l.a(new er.a() { // from class: s80.e
        @Override // er.a
        public final Object a() {
            return f.s(this.f178926a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f178932d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f178934f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178932d = obj;
            this.f178934f |= PKIFailureInfo.systemUnavail;
            return f.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/g;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<BehaviourDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178935e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178935e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.b bVarO = f.this.o();
            this.f178935e = 1;
            Object objF = bVarO.f(this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<BehaviourDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178938e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178940g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178938e = obj;
            this.f178940g |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<GradeDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178941e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f178943g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f178943g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178941e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.c cVarP = f.this.p();
            String str = this.f178943g;
            this.f178941e = 1;
            Object objA = cVarP.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new d(this.f178943g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GradeDetailsDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178945e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178947g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178945e = obj;
            this.f178947g |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: s80.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/s;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C4594f extends vq.k implements er.l<tq.e<? super x<LessonDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178948e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f178950g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4594f(String str, tq.e<? super C4594f> eVar) {
            super(1, eVar);
            this.f178950g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178948e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.d dVarQ = f.this.q();
            String str = this.f178950g;
            this.f178948e = 1;
            Object objB = dVarQ.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new C4594f(this.f178950g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LessonDetailsDto>> eVar) {
            return ((C4594f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178952e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178954g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178952e = obj;
            this.f178954g |= PKIFailureInfo.systemUnavail;
            return f.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<SemesterDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178955e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f178957g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f178957g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178955e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.c cVarP = f.this.p();
            String str = this.f178957g;
            this.f178955e = 1;
            Object objE2 = cVarP.e(str, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new h(this.f178957g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SemesterDetailsDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f178958d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f178960f;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178958d = obj;
            this.f178960f |= PKIFailureInfo.systemUnavail;
            return f.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/h0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<SemestersDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178961e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178961e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.c cVarP = f.this.p();
            this.f178961e = 1;
            Object objC = cVarP.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SemestersDto>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178965f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f178967h;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178965f = obj;
            this.f178967h |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/j0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<SubjectGradesDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178968e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f178970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f178971h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f178970g = str;
            this.f178971h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178968e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.c cVarP = f.this.p();
            String str = this.f178970g;
            String str2 = this.f178971h;
            this.f178968e = 1;
            Object objD = cVarP.d(str, str2, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new l(this.f178970g, this.f178971h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SubjectGradesDto>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178973e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178975g;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178973e = obj;
            this.f178975g |= PKIFailureInfo.systemUnavail;
            return f.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/z;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<LessonsWeekDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178976e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalDate f178978g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(LocalDate localDate, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f178978g = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178976e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.d dVarQ = f.this.q();
            LocalDate localDate = this.f178978g;
            this.f178976e = 1;
            Object objC = dVarQ.c(localDate, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new n(this.f178978g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LessonsWeekDto>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    public f(w wVar, g0 g0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final it3.b n(f fVar) {
        return (it3.b) w.b(fVar.httpServiceFactory, null, it3.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it3.b o() {
        return (it3.b) this.behaviourApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it3.c p() {
        return (it3.c) this.gradesApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it3.d q() {
        return (it3.d) this.timetableApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final it3.c r(f fVar) {
        return (it3.c) w.b(fVar.httpServiceFactory, null, it3.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final it3.d s(f fVar) {
        return (it3.d) w.b(fVar.httpServiceFactory, null, it3.d.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.b
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, BEGradeDetails>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f178940g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f178940g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f178938e;
        Object objE = uq.b.e();
        int i16 = cVar.f178940g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f178937d = vq.j.a(str);
            cVar.f178940g = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(r80.a.n((GradeDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, BELessonDetails>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f178947g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f178947g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f178945e;
        Object objE = uq.b.e();
        int i16 = eVar2.f178947g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C4594f c4594f = new C4594f(str, null);
            eVar2.f178944d = vq.j.a(str);
            eVar2.f178947g = 1;
            objB = g0Var.b(c4594f, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(r80.a.r((LessonDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.b
    public Object c(tq.e<? super dx.i<? extends dx.b, BESemesters>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f178960f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f178960f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f178958d;
        Object objE = uq.b.e();
        int i16 = iVar.f178960f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(null);
            iVar.f178960f = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(r80.a.B((SemestersDto) ((dx.i.Right) iVar2).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.b
    public Object d(String str, String str2, tq.e<? super dx.i<? extends dx.b, BESubjectGrades>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f178967h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f178967h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f178965f;
        Object objE = uq.b.e();
        int i16 = kVar.f178967h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(str, str2, null);
            kVar.f178963d = vq.j.a(str);
            kVar.f178964e = vq.j.a(str2);
            kVar.f178967h = 1;
            objB = g0Var.b(lVar, kVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(r80.a.D((SubjectGradesDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.b
    public Object e(String str, tq.e<? super dx.i<? extends dx.b, BESemesterDetails>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f178954g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f178954g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f178952e;
        Object objE = uq.b.e();
        int i16 = gVar.f178954g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(str, null);
            gVar.f178951d = vq.j.a(str);
            gVar.f178954g = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(r80.a.y((SemesterDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.b
    public Object f(tq.e<? super dx.i<? extends dx.b, BEBehaviourSemesters>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178934f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178934f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f178932d;
        Object objE = uq.b.e();
        int i16 = aVar.f178934f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f178934f = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(r80.a.m((BehaviourDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.b
    public Object g(LocalDate localDate, tq.e<? super dx.i<? extends dx.b, BETimetableWeek>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f178975g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f178975g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f178973e;
        Object objE = uq.b.e();
        int i16 = mVar.f178975g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(localDate, null);
            mVar.f178972d = vq.j.a(localDate);
            mVar.f178975g = 1;
            objB = g0Var.b(nVar, mVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(r80.a.L((LessonsWeekDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
