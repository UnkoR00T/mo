package pn0;

import ge4.x;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on0.AttendanceStatusDetailsDto;
import on0.AttendanceSummaryDto;
import on0.BehaviourDto;
import on0.ChildrenStudentDto;
import on0.ChildrenStudentsDto;
import on0.GradeDetailsDto;
import on0.LessonDetailsDto;
import on0.LessonsWeekDto;
import on0.SemesterDetailsDto;
import on0.SemestersDto;
import on0.SubjectGradesDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import rn0.BEAttendanceStatusDetails;
import rn0.BEAttendanceSummary;
import rn0.BEBehaviourSemesters;
import rn0.BEChildStudent;
import rn0.BEGradeDetails;
import rn0.BELessonDetails;
import rn0.BESemesterDetails;
import rn0.BESemesters;
import rn0.BESubjectGrades;
import rn0.BETimetableWeek;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\"\u0010\u0016J,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020$0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b%\u0010\u0016J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020&0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b'\u0010\u0012J4\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020*0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b+\u0010,J$\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020-0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b.\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b2\u00103R\u001b\u00108\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b>\u0010?R\u001b\u0010D\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lpn0/f;", "Lsn0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Lrn0/n;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "studentId", "Lrn0/f0;", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Lrn0/c0;", "f", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "subjectId", "Lrn0/h0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "Lrn0/p0;", "i", "(Ljava/lang/String;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "gradeId", "Lrn0/o;", "e", "lessonId", "Lrn0/u;", "h", "Lrn0/e;", "d", "Lrn0/b;", "attendanceStatus", "Lrn0/c;", "j", "(Ljava/lang/String;Lrn0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lrn0/m;", "b", "Lpl/gov/coi/common/network/g0;", "Lmn0/b;", "Loq/k;", "y", "()Lmn0/b;", "behaviourApi", "Lmn0/a;", "x", "()Lmn0/a;", "attendanceApi", "Lmn0/c;", "z", "()Lmn0/c;", "childrenStudentsApi", "Lmn0/d;", "A", "()Lmn0/d;", "gradesApi", "Lmn0/e;", "B", "()Lmn0/e;", "timetableApi", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements sn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k behaviourApi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k attendanceApi;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k childrenStudentsApi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k gradesApi;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k timetableApi;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f161148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f161149g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f161151j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161149g = obj;
            this.f161151j |= PKIFailureInfo.systemUnavail;
            return f.this.j(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<AttendanceStatusDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161152e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161154g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ rn0.b f161155h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f161156j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, rn0.b bVar, String str2, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f161154g = str;
            this.f161155h = bVar;
            this.f161156j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161152e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.a aVarX = f.this.x();
            String str = this.f161154g;
            on0.b bVarQ = nn0.a.Q(this.f161155h);
            String str2 = this.f161156j;
            this.f161152e = 1;
            Object objE2 = aVarX.e(str, bVarQ, str2, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(this.f161154g, this.f161155h, this.f161156j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AttendanceStatusDetailsDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f161158e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f161160g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161158e = obj;
            this.f161160g |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<AttendanceSummaryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161161e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161163g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f161163g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161161e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.a aVarX = f.this.x();
            String str = this.f161163g;
            this.f161161e = 1;
            Object objD = aVarX.d(str, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new d(this.f161163g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AttendanceSummaryDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f161165e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f161167g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161165e = obj;
            this.f161167g |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: pn0.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/g;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3965f extends vq.k implements er.l<tq.e<? super x<BehaviourDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161168e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161170g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3965f(String str, tq.e<? super C3965f> eVar) {
            super(1, eVar);
            this.f161170g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161168e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.b bVarY = f.this.y();
            String str = this.f161170g;
            this.f161168e = 1;
            Object objB = bVarY.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new C3965f(this.f161170g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<BehaviourDto>> eVar) {
            return ((C3965f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f161171d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f161173f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161171d = obj;
            this.f161173f |= PKIFailureInfo.systemUnavail;
            return f.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/o;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<ChildrenStudentsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161174e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161174e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.c cVarZ = f.this.z();
            this.f161174e = 1;
            Object objA = cVarZ.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ChildrenStudentsDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161178f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161180h;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161178f = obj;
            this.f161180h |= PKIFailureInfo.systemUnavail;
            return f.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/p;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<GradeDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161181e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161183g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f161184h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f161183g = str;
            this.f161184h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161181e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.d dVarA = f.this.A();
            String str = this.f161183g;
            String str2 = this.f161184h;
            this.f161181e = 1;
            Object objE2 = dVarA.e(str, str2, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new j(this.f161183g, this.f161184h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GradeDetailsDto>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161187f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161189h;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161187f = obj;
            this.f161189h |= PKIFailureInfo.systemUnavail;
            return f.this.h(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/w;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<LessonDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161190e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f161193h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f161192g = str;
            this.f161193h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161190e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.e eVarB = f.this.B();
            String str = this.f161192g;
            String str2 = this.f161193h;
            this.f161190e = 1;
            Object objB = eVarB.b(str, str2, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new l(this.f161192g, this.f161193h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LessonDetailsDto>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161196f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161198h;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161196f = obj;
            this.f161198h |= PKIFailureInfo.systemUnavail;
            return f.this.f(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/j0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<SemesterDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161199e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161201g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f161202h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, String str2, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f161201g = str;
            this.f161202h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161199e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.d dVarA = f.this.A();
            String str = this.f161201g;
            String str2 = this.f161202h;
            this.f161199e = 1;
            Object objF = dVarA.f(str, str2, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new n(this.f161201g, this.f161202h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SemesterDetailsDto>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f161204e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f161206g;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161204e = obj;
            this.f161206g |= PKIFailureInfo.systemUnavail;
            return f.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/m0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.l<tq.e<? super x<SemestersDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161207e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161209g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, tq.e<? super p> eVar) {
            super(1, eVar);
            this.f161209g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161207e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.d dVarA = f.this.A();
            String str = this.f161209g;
            this.f161207e = 1;
            Object objG = dVarA.g(str, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new p(this.f161209g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SemestersDto>> eVar) {
            return ((p) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f161212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f161213g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f161215j;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161213g = obj;
            this.f161215j |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/o0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.l<tq.e<? super x<SubjectGradesDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161216e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f161218g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f161219h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f161220j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, String str2, String str3, tq.e<? super r> eVar) {
            super(1, eVar);
            this.f161218g = str;
            this.f161219h = str2;
            this.f161220j = str3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161216e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.d dVarA = f.this.A();
            String str = this.f161218g;
            String str2 = this.f161219h;
            String str3 = this.f161220j;
            this.f161216e = 1;
            Object objC = dVarA.c(str, str2, str3, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new r(this.f161218g, this.f161219h, this.f161220j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SubjectGradesDto>> eVar) {
            return ((r) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161223f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161225h;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161223f = obj;
            this.f161225h |= PKIFailureInfo.systemUnavail;
            return f.this.i(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lon0/d0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.l<tq.e<? super x<LessonsWeekDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161226e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalDate f161228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f161229h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(LocalDate localDate, String str, tq.e<? super t> eVar) {
            super(1, eVar);
            this.f161228g = localDate;
            this.f161229h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161226e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mn0.e eVarB = f.this.B();
            LocalDate localDate = this.f161228g;
            String str = this.f161229h;
            this.f161226e = 1;
            Object objA = eVarB.a(localDate, str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new t(this.f161228g, this.f161229h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LessonsWeekDto>> eVar) {
            return ((t) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.behaviourApi = oq.l.a(new er.a() { // from class: pn0.a
            @Override // er.a
            public final Object a() {
                return f.v(wVar);
            }
        });
        this.attendanceApi = oq.l.a(new er.a() { // from class: pn0.b
            @Override // er.a
            public final Object a() {
                return f.u(wVar);
            }
        });
        this.childrenStudentsApi = oq.l.a(new er.a() { // from class: pn0.c
            @Override // er.a
            public final Object a() {
                return f.w(wVar);
            }
        });
        this.gradesApi = oq.l.a(new er.a() { // from class: pn0.d
            @Override // er.a
            public final Object a() {
                return f.C(wVar);
            }
        });
        this.timetableApi = oq.l.a(new er.a() { // from class: pn0.e
            @Override // er.a
            public final Object a() {
                return f.D(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mn0.d A() {
        return (mn0.d) this.gradesApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mn0.e B() {
        return (mn0.e) this.timetableApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn0.d C(w wVar) {
        return (mn0.d) w.b(wVar, null, mn0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn0.e D(w wVar) {
        return (mn0.e) w.b(wVar, null, mn0.e.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn0.a u(w wVar) {
        return (mn0.a) w.b(wVar, null, mn0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn0.b v(w wVar) {
        return (mn0.b) w.b(wVar, null, mn0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn0.c w(w wVar) {
        return (mn0.c) w.b(wVar, null, mn0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mn0.a x() {
        return (mn0.a) this.attendanceApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mn0.b y() {
        return (mn0.b) this.behaviourApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mn0.c z() {
        return (mn0.c) this.childrenStudentsApi.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<BEChildStudent>>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f161173f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f161173f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f161171d;
        Object objE = uq.b.e();
        int i16 = gVar.f161173f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            gVar.f161173f = 1;
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List<ChildrenStudentDto> listA = ((ChildrenStudentsDto) ((dx.i.Right) iVar).b()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(nn0.a.n((ChildrenStudentDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, BEBehaviourSemesters>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f161167g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f161167g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f161165e;
        Object objE = uq.b.e();
        int i16 = eVar2.f161167g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3965f c3965f = new C3965f(str, null);
            eVar2.f161164d = vq.j.a(str);
            eVar2.f161167g = 1;
            objB = g0Var.b(c3965f, eVar2);
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
            return new dx.i.Right(nn0.a.m((BehaviourDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object c(String str, String str2, String str3, tq.e<? super dx.i<? extends dx.b, BESubjectGrades>> eVar) throws Throwable {
        q qVar;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i15 = qVar.f161215j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f161215j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object objB = qVar.f161213g;
        Object objE = uq.b.e();
        int i16 = qVar.f161215j;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            r rVar = new r(str, str2, str3, null);
            qVar.f161210d = vq.j.a(str);
            qVar.f161211e = vq.j.a(str2);
            qVar.f161212f = vq.j.a(str3);
            qVar.f161215j = 1;
            objB = g0Var.b(rVar, qVar);
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
            return new dx.i.Right(nn0.a.H((SubjectGradesDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object d(String str, tq.e<? super dx.i<? extends dx.b, BEAttendanceSummary>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f161160g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f161160g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f161158e;
        Object objE = uq.b.e();
        int i16 = cVar.f161160g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f161157d = vq.j.a(str);
            cVar.f161160g = 1;
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
            return new dx.i.Right(nn0.a.e((AttendanceSummaryDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object e(String str, String str2, tq.e<? super dx.i<? extends dx.b, BEGradeDetails>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f161180h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f161180h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f161178f;
        Object objE = uq.b.e();
        int i16 = iVar.f161180h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(str, str2, null);
            iVar.f161176d = vq.j.a(str);
            iVar.f161177e = vq.j.a(str2);
            iVar.f161180h = 1;
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
            return new dx.i.Right(nn0.a.o((GradeDetailsDto) ((dx.i.Right) iVar2).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object f(String str, String str2, tq.e<? super dx.i<? extends dx.b, BESemesterDetails>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f161198h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f161198h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f161196f;
        Object objE = uq.b.e();
        int i16 = mVar.f161198h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(str, str2, null);
            mVar.f161194d = vq.j.a(str);
            mVar.f161195e = vq.j.a(str2);
            mVar.f161198h = 1;
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
            return new dx.i.Right(nn0.a.C((SemesterDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object g(String str, tq.e<? super dx.i<? extends dx.b, BESemesters>> eVar) throws Throwable {
        o oVar;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i15 = oVar.f161206g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f161206g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object objB = oVar.f161204e;
        Object objE = uq.b.e();
        int i16 = oVar.f161206g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            p pVar = new p(str, null);
            oVar.f161203d = vq.j.a(str);
            oVar.f161206g = 1;
            objB = g0Var.b(pVar, oVar);
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
            return new dx.i.Right(nn0.a.F((SemestersDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object h(String str, String str2, tq.e<? super dx.i<? extends dx.b, BELessonDetails>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f161189h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f161189h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f161187f;
        Object objE = uq.b.e();
        int i16 = kVar.f161189h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(str, str2, null);
            kVar.f161185d = vq.j.a(str);
            kVar.f161186e = vq.j.a(str2);
            kVar.f161189h = 1;
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
            return new dx.i.Right(nn0.a.u((LessonDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object i(String str, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, BETimetableWeek>> eVar) throws Throwable {
        s sVar;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f161225h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f161225h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object objB = sVar.f161223f;
        Object objE = uq.b.e();
        int i16 = sVar.f161225h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            t tVar = new t(localDate, str, null);
            sVar.f161221d = vq.j.a(str);
            sVar.f161222e = vq.j.a(localDate);
            sVar.f161225h = 1;
            objB = g0Var.b(tVar, sVar);
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
            return new dx.i.Right(nn0.a.P((LessonsWeekDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn0.a
    public Object j(String str, rn0.b bVar, String str2, tq.e<? super dx.i<? extends dx.b, BEAttendanceStatusDetails>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f161151j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f161151j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f161149g;
        Object objE = uq.b.e();
        int i16 = aVar.f161151j;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar2 = new b(str, bVar, str2, null);
            aVar.f161146d = vq.j.a(str);
            aVar.f161147e = vq.j.a(bVar);
            aVar.f161148f = vq.j.a(str2);
            aVar.f161151j = 1;
            objB = g0Var.b(bVar2, aVar);
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
            return new dx.i.Right(nn0.a.c((AttendanceStatusDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
