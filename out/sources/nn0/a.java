package nn0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on0.AttendanceDto;
import on0.AttendanceStatusDetailsDto;
import on0.AttendanceStatusSummaryDto;
import on0.AttendanceSummaryDto;
import on0.AttendancesDayDto;
import on0.BehaviourDto;
import on0.BehaviourGradeDto;
import on0.BehaviourSemesterDto;
import on0.BehaviourSemesterGradeDto;
import on0.BehaviourSemesterGradeInfoDto;
import on0.ChildrenStudentDto;
import on0.GradeDetailsDto;
import on0.GradeIconDto;
import on0.GradePreviewDto;
import on0.LatestAbsenceDto;
import on0.LatestGradeDto;
import on0.LessonDetailsDto;
import on0.LessonInfoDto;
import on0.LessonPreviewDto;
import on0.LessonsDayDto;
import on0.LessonsWeekDto;
import on0.NextLessonDto;
import on0.PresenceSummaryDto;
import on0.PreviousGradeEntryDto;
import on0.SchoolFamilyMessageDto;
import on0.SemesterAttendanceSummaryDto;
import on0.SemesterDetailsDto;
import on0.SemesterGradeDto;
import on0.SemesterPreviewDto;
import on0.SemestersDto;
import on0.SubjectEntryDto;
import on0.SubjectGradesDto;
import on0.SubjectPresenceSummaryDto;
import on0.a0;
import on0.b;
import on0.b0;
import on0.j;
import on0.p0;
import on0.r;
import on0.v;
import on0.y;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import rn0.BEAttendance;
import rn0.BEAttendanceStatusDetails;
import rn0.BEAttendanceStatusSummary;
import rn0.BEAttendanceSummary;
import rn0.BEAttendancesDay;
import rn0.BEBehaviourFinalGrade;
import rn0.BEBehaviourGradeInfo;
import rn0.BEBehaviourPartialGrade;
import rn0.BEBehaviourSemesterDetails;
import rn0.BEBehaviourSemesters;
import rn0.BEChildStudent;
import rn0.BEGradeDetails;
import rn0.BEGradeIcon;
import rn0.BEGradePreview;
import rn0.BELatestAbsence;
import rn0.BELatestGrade;
import rn0.BELessonDetails;
import rn0.BELessonInfo;
import rn0.BENextLesson;
import rn0.BEPresenceSummary;
import rn0.BEPreviousGrade;
import rn0.BESchoolFamilyMessage;
import rn0.BESemesterAttendanceSummary;
import rn0.BESemesterDetails;
import rn0.BESemesterGrade;
import rn0.BESemesterPreview;
import rn0.BESemesters;
import rn0.BESubjectEntry;
import rn0.BESubjectGrades;
import rn0.BESubjectPresenceSummary;
import rn0.BETimetableDay;
import rn0.BETimetableSlot;
import rn0.BETimetableWeek;
import rn0.h;
import rn0.i0;
import rn0.k0;
import rn0.n0;
import rn0.o0;
import rn0.q;
import rn0.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0086\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010F\u001a\u00020E*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010J\u001a\u00020I*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010R\u001a\u00020Q*\u00020P¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010V\u001a\u00020U*\u00020T¢\u0006\u0004\bV\u0010W\u001a\u0011\u0010Z\u001a\u00020Y*\u00020X¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010^\u001a\u00020]*\u00020\\¢\u0006\u0004\b^\u0010_\u001a\u0011\u0010b\u001a\u00020a*\u00020`¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010f\u001a\u00020e*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010j\u001a\u00020i*\u00020h¢\u0006\u0004\bj\u0010k\u001a\u0011\u0010n\u001a\u00020m*\u00020l¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010r\u001a\u00020q*\u00020p¢\u0006\u0004\br\u0010s\u001a\u0011\u0010v\u001a\u00020u*\u00020t¢\u0006\u0004\bv\u0010w\u001a\u0011\u0010z\u001a\u00020y*\u00020x¢\u0006\u0004\bz\u0010{\u001a\u0011\u0010~\u001a\u00020}*\u00020|¢\u0006\u0004\b~\u0010\u007f\u001a\u0016\u0010\u0082\u0001\u001a\u00030\u0081\u0001*\u00030\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0016\u0010\u0086\u0001\u001a\u00030\u0085\u0001*\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0016\u0010\u008a\u0001\u001a\u00030\u0089\u0001*\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0016\u0010\u008c\u0001\u001a\u00030\u0088\u0001*\u00030\u0089\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0016\u0010\u0090\u0001\u001a\u00030\u008f\u0001*\u00030\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a \u0010\u0096\u0001\u001a\u00030\u0095\u0001*\u00030\u0092\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0016\u0010\u009a\u0001\u001a\u00030\u0099\u0001*\u00030\u0098\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0016\u0010\u009e\u0001\u001a\u00030\u009d\u0001*\u00030\u009c\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0016\u0010¢\u0001\u001a\u00030¡\u0001*\u00030 \u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a \u0010¦\u0001\u001a\u00030¥\u0001*\u00030¤\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a\u0016\u0010ª\u0001\u001a\u00030©\u0001*\u00030¨\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001\"\u0017\u0010®\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010\u00ad\u0001¨\u0006¯\u0001"}, d2 = {"Lon0/n;", "Lrn0/n;", "n", "(Lon0/n;)Lrn0/n;", "Lon0/u;", "Lrn0/t;", "t", "(Lon0/u;)Lrn0/t;", "Lon0/t;", "Lrn0/s;", "s", "(Lon0/t;)Lrn0/s;", "Lon0/e0;", "Lrn0/x;", "x", "(Lon0/e0;)Lrn0/x;", "Lon0/q;", "Lrn0/p;", "p", "(Lon0/q;)Lrn0/p;", "Lon0/r;", "Lrn0/q;", "q", "(Lon0/r;)Lrn0/q;", "Lon0/m0;", "Lrn0/f0;", "F", "(Lon0/m0;)Lrn0/f0;", "Lon0/j0;", "Lrn0/c0;", "C", "(Lon0/j0;)Lrn0/c0;", "Lon0/l0;", "Lrn0/e0;", "E", "(Lon0/l0;)Lrn0/e0;", "Lon0/h0;", "Lrn0/a0;", "A", "(Lon0/h0;)Lrn0/a0;", "Lon0/n0;", "Lrn0/g0;", "G", "(Lon0/n0;)Lrn0/g0;", "Lon0/p0;", "Lrn0/i0;", "I", "(Lon0/p0;)Lrn0/i0;", "Lon0/o0;", "Lrn0/h0;", i.f37087n, "(Lon0/o0;)Lrn0/h0;", "Lon0/s;", "Lrn0/r;", "r", "(Lon0/s;)Lrn0/r;", "Lon0/k0;", "Lrn0/d0;", ip.a.f96138c, "(Lon0/k0;)Lrn0/d0;", "Lon0/d0;", "Lrn0/p0;", i.f37086m, "(Lon0/d0;)Lrn0/p0;", "Lon0/c0;", "Lrn0/l0;", i.f37094u, "(Lon0/c0;)Lrn0/l0;", "Lon0/z;", "Lrn0/m0;", "M", "(Lon0/z;)Lrn0/m0;", "Lon0/a0;", "Lrn0/o0;", "O", "(Lon0/a0;)Lrn0/o0;", "Lon0/b0;", "Lrn0/n0;", "N", "(Lon0/b0;)Lrn0/n0;", "Lon0/p;", "Lrn0/o;", "o", "(Lon0/p;)Lrn0/o;", "Lon0/g0;", "Lrn0/z;", "z", "(Lon0/g0;)Lrn0/z;", "Lon0/w;", "Lrn0/u;", "u", "(Lon0/w;)Lrn0/u;", "Lon0/v;", "Lrn0/k0;", "K", "(Lon0/v;)Lrn0/k0;", "Lon0/x;", "Lrn0/v;", "v", "(Lon0/x;)Lrn0/v;", "Lon0/y;", "Lrn0/w;", "w", "(Lon0/y;)Lrn0/w;", "Lon0/e;", "Lrn0/e;", "e", "(Lon0/e;)Lrn0/e;", "Lon0/c;", "Lrn0/c;", "c", "(Lon0/c;)Lrn0/c;", "Lon0/f;", "Lrn0/f;", "f", "(Lon0/f;)Lrn0/f;", "Lon0/a;", "Lrn0/a;", "a", "(Lon0/a;)Lrn0/a;", "Lon0/i0;", "Lrn0/b0;", "B", "(Lon0/i0;)Lrn0/b0;", "Lon0/f0;", "Lrn0/y;", "y", "(Lon0/f0;)Lrn0/y;", "Lon0/d;", "Lrn0/d;", "d", "(Lon0/d;)Lrn0/d;", "Lon0/q0;", "Lrn0/j0;", "J", "(Lon0/q0;)Lrn0/j0;", "Lon0/b;", "Lrn0/b;", "b", "(Lon0/b;)Lrn0/b;", "Q", "(Lrn0/b;)Lon0/b;", "Lon0/g;", "Lrn0/m;", "m", "(Lon0/g;)Lrn0/m;", "Lon0/k;", "", "id", "Lrn0/l;", "l", "(Lon0/k;Ljava/lang/String;)Lrn0/l;", "Lon0/m;", "Lrn0/i;", "i", "(Lon0/m;)Lrn0/i;", "Lon0/l;", "Lrn0/g;", "g", "(Lon0/l;)Lrn0/g;", "Lon0/i;", "Lrn0/h;", "h", "(Lon0/i;)Lrn0/h;", "Lon0/h;", "Lrn0/k;", "k", "(Lon0/h;Ljava/lang/String;)Lrn0/k;", "Lon0/j;", "Lrn0/j;", "j", "(Lon0/j;)Lrn0/j;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "DAY_FORMATTER", "educationservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateTimeFormatter f137307a = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /* JADX INFO: renamed from: nn0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3385a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f137309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f137310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f137311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f137312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f137313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f137314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f137315h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f137316i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f137317j;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.VALUES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f137308a = iArr;
            int[] iArr2 = new int[p0.values().length];
            try {
                iArr2[p0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[p0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[p0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[p0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[p0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[p0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[p0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[p0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[p0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[p0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[p0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[p0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[p0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[p0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[p0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[p0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[p0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[p0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[p0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[p0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[p0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[p0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[p0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[p0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[p0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[p0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[p0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[p0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[p0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[p0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[p0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[p0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused37) {
            }
            f137309b = iArr2;
            int[] iArr3 = new int[a0.values().length];
            try {
                iArr3[a0.LESSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[a0.FREE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            f137310c = iArr3;
            int[] iArr4 = new int[b0.values().length];
            try {
                iArr4[b0.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[b0.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[b0.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            f137311d = iArr4;
            int[] iArr5 = new int[v.values().length];
            try {
                iArr5[v.PRESENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[v.ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[v.FUTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr5[v.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr5[v.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused47) {
            }
            f137312e = iArr5;
            int[] iArr6 = new int[y.values().length];
            try {
                iArr6[y.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[y.ATTENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[y.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            f137313f = iArr6;
            int[] iArr7 = new int[b.values().length];
            try {
                iArr7[b.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[b.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[b.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[b.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[b.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr7[b.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused56) {
            }
            f137314g = iArr7;
            int[] iArr8 = new int[rn0.b.values().length];
            try {
                iArr8[rn0.b.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr8[rn0.b.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr8[rn0.b.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr8[rn0.b.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr8[rn0.b.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr8[rn0.b.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused62) {
            }
            f137315h = iArr8;
            int[] iArr9 = new int[on0.i.values().length];
            try {
                iArr9[on0.i.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr9[on0.i.VERY_GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr9[on0.i.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr9[on0.i.SATISFACTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr9[on0.i.POOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr9[on0.i.UNSATISFACTORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr9[on0.i.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused69) {
            }
            f137316i = iArr9;
            int[] iArr10 = new int[j.values().length];
            try {
                iArr10[j.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr10[j.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr10[j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused72) {
            }
            f137317j = iArr10;
        }
    }

    public static final BESchoolFamilyMessage A(SchoolFamilyMessageDto schoolFamilyMessageDto) {
        return new BESchoolFamilyMessage(schoolFamilyMessageDto.getTitle(), schoolFamilyMessageDto.getMessage());
    }

    public static final BESemesterAttendanceSummary B(SemesterAttendanceSummaryDto semesterAttendanceSummaryDto) {
        boolean current = semesterAttendanceSummaryDto.getCurrent();
        BEPresenceSummary bEPresenceSummaryY = y(semesterAttendanceSummaryDto.getPresenceSummary());
        String semesterId = semesterAttendanceSummaryDto.getSemesterId();
        List<AttendanceStatusSummaryDto> listD = semesterAttendanceSummaryDto.d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(d((AttendanceStatusSummaryDto) it.next()));
        }
        return new BESemesterAttendanceSummary(current, bEPresenceSummaryY, semesterId, arrayList, semesterAttendanceSummaryDto.getTitle());
    }

    public static final BESemesterDetails C(SemesterDetailsDto semesterDetailsDto) {
        String id5 = semesterDetailsDto.getId();
        String title = semesterDetailsDto.getTitle();
        List<SubjectEntryDto> listC = semesterDetailsDto.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(G((SubjectEntryDto) it.next()));
        }
        SchoolFamilyMessageDto message = semesterDetailsDto.getMessage();
        return new BESemesterDetails(id5, title, arrayList, message != null ? A(message) : null);
    }

    public static final BESemesterGrade D(SemesterGradeDto semesterGradeDto) {
        return new BESemesterGrade(semesterGradeDto.getCategory(), semesterGradeDto.getCreatedAt(), semesterGradeDto.getDescriptive(), semesterGradeDto.getGrade(), p(semesterGradeDto.getIcon()), semesterGradeDto.getNewGrade(), semesterGradeDto.getTeacher(), semesterGradeDto.getComment());
    }

    public static final BESemesterPreview E(SemesterPreviewDto semesterPreviewDto) {
        return new BESemesterPreview(semesterPreviewDto.getId(), semesterPreviewDto.getTitle());
    }

    public static final BESemesters F(SemestersDto semestersDto) {
        ArrayList arrayList;
        SemesterDetailsDto currentSemester = semestersDto.getCurrentSemester();
        BESemesterDetails bESemesterDetailsC = currentSemester != null ? C(currentSemester) : null;
        List<SemesterPreviewDto> listC = semestersDto.c();
        if (listC != null) {
            List<SemesterPreviewDto> list = listC;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(E((SemesterPreviewDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        SchoolFamilyMessageDto message = semestersDto.getMessage();
        return new BESemesters(bESemesterDetailsC, arrayList, message != null ? A(message) : null);
    }

    public static final BESubjectEntry G(SubjectEntryDto subjectEntryDto) {
        return new BESubjectEntry(subjectEntryDto.getId(), subjectEntryDto.getTitle(), I(subjectEntryDto.getIconType()), subjectEntryDto.getNewGrades());
    }

    public static final BESubjectGrades H(SubjectGradesDto subjectGradesDto) {
        List<GradePreviewDto> listA = subjectGradesDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(r((GradePreviewDto) it.next()));
        }
        SemesterGradeDto semesterGrade = subjectGradesDto.getSemesterGrade();
        return new BESubjectGrades(arrayList, semesterGrade != null ? D(semesterGrade) : null);
    }

    public static final i0 I(p0 p0Var) {
        switch (C3385a.f137309b[p0Var.ordinal()]) {
            case 1:
                return i0.APPLE;
            case 2:
                return i0.ATOM;
            case 3:
                return i0.BACTERIA;
            case 4:
                return i0.BALANCE;
            case 5:
                return i0.BALL;
            case 6:
                return i0.BELL;
            case 7:
                return i0.BLOCKS;
            case 8:
                return i0.BRIEFCASE;
            case 9:
                return i0.BUILDING;
            case 10:
                return i0.CHART;
            case 11:
                return i0.COLUMN;
            case 12:
                return i0.COMPUTER;
            case 13:
                return i0.FOLDER;
            case 14:
                return i0.GLASSES;
            case 15:
                return i0.GLOBE;
            case 16:
                return i0.GROUP;
            case 17:
                return i0.HAND_GESTURE;
            case 18:
                return i0.HOURGLASS;
            case 19:
                return i0.LANGUAGE;
            case 20:
                return i0.LEAF;
            case 21:
                return i0.MAGNET;
            case 22:
                return i0.MUSIC_NOTE;
            case 23:
                return i0.NOTEBOOK;
            case 24:
                return i0.PALETTE;
            case 25:
                return i0.PEN;
            case 26:
                return i0.POOL;
            case 27:
                return i0.PUZZLE;
            case 28:
                return i0.RULER;
            case 29:
                return i0.SCISSORS;
            case 30:
                return i0.SECURITY;
            case BERTags.DATE /* 31 */:
                return i0.SUPPORT;
            case 32:
                return i0.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BESubjectPresenceSummary J(SubjectPresenceSummaryDto subjectPresenceSummaryDto) {
        return new BESubjectPresenceSummary(subjectPresenceSummaryDto.getAttendancePercentage(), I(subjectPresenceSummaryDto.getSubjectIcon()), subjectPresenceSummaryDto.getSubjectName());
    }

    public static final k0 K(v vVar) {
        int i15 = C3385a.f137312e[vVar.ordinal()];
        if (i15 == 1) {
            return k0.PRESENCE;
        }
        if (i15 == 2) {
            return k0.ABSENCE;
        }
        if (i15 == 3) {
            return k0.FUTURE;
        }
        if (i15 == 4) {
            return k0.CANCELLED;
        }
        if (i15 == 5) {
            return k0.UNKNOWN;
        }
        throw new p();
    }

    public static final BETimetableDay L(LessonsDayDto lessonsDayDto) {
        LocalDate localDate = LocalDate.parse(lessonsDayDto.getDate(), f137307a);
        int numberOfLessons = lessonsDayDto.getNumberOfLessons();
        List<LessonPreviewDto> listC = lessonsDayDto.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(M((LessonPreviewDto) it.next()));
        }
        return new BETimetableDay(localDate, numberOfLessons, arrayList);
    }

    public static final BETimetableSlot M(LessonPreviewDto lessonPreviewDto) {
        return new BETimetableSlot(lessonPreviewDto.getFromTime(), lessonPreviewDto.getToTime(), lessonPreviewDto.getNumber(), lessonPreviewDto.getTitle(), O(lessonPreviewDto.getType()), N(lessonPreviewDto.getState()), I(lessonPreviewDto.getIconType()), lessonPreviewDto.getClassNumber(), lessonPreviewDto.getLessonId());
    }

    public static final n0 N(b0 b0Var) {
        int i15 = C3385a.f137311d[b0Var.ordinal()];
        if (i15 == 1) {
            return n0.CURRENT;
        }
        if (i15 != 2) {
            return i15 != 3 ? n0.UNKNOWN : n0.CANCELLED;
        }
        return n0.UPDATED;
    }

    public static final o0 O(a0 a0Var) {
        int i15 = C3385a.f137310c[a0Var.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? o0.UNKNOWN : o0.FREE_TIME;
        }
        return o0.LESSON;
    }

    public static final BETimetableWeek P(LessonsWeekDto lessonsWeekDto) {
        ArrayList arrayList;
        List<LessonsDayDto> listA = lessonsWeekDto.a();
        if (listA != null) {
            List<LessonsDayDto> list = listA;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(L((LessonsDayDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        LocalDate localDate = lessonsWeekDto.getMinSelectionDate().toLocalDate();
        LocalDate localDate2 = lessonsWeekDto.getMaxSelectionDate().toLocalDate();
        SchoolFamilyMessageDto message = lessonsWeekDto.getMessage();
        return new BETimetableWeek(arrayList, localDate, localDate2, message != null ? A(message) : null);
    }

    public static final b Q(rn0.b bVar) {
        switch (C3385a.f137315h[bVar.ordinal()]) {
            case 1:
                return b.ABSENCE;
            case 2:
                return b.SCHOOL_REASONS_ABSENCE;
            case 3:
                return b.LATENESS;
            case 4:
                return b.EXCUSE;
            case 5:
                return b.JUSTIFICATION;
            case 6:
                return b.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BEAttendance a(AttendanceDto attendanceDto) {
        return new BEAttendance(attendanceDto.getFromTime(), attendanceDto.getTitle(), attendanceDto.getToTime());
    }

    public static final rn0.b b(b bVar) {
        switch (C3385a.f137314g[bVar.ordinal()]) {
            case 1:
                return rn0.b.ABSENCE;
            case 2:
                return rn0.b.SCHOOL_REASONS_ABSENCE;
            case 3:
                return rn0.b.LATENESS;
            case 4:
                return rn0.b.EXCUSE;
            case 5:
                return rn0.b.JUSTIFICATION;
            case 6:
                return rn0.b.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BEAttendanceStatusDetails c(AttendanceStatusDetailsDto attendanceStatusDetailsDto) {
        List<AttendancesDayDto> listA = attendanceStatusDetailsDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((AttendancesDayDto) it.next()));
        }
        return new BEAttendanceStatusDetails(arrayList);
    }

    public static final BEAttendanceStatusSummary d(AttendanceStatusSummaryDto attendanceStatusSummaryDto) {
        return new BEAttendanceStatusSummary(attendanceStatusSummaryDto.getCount(), b(attendanceStatusSummaryDto.getStatus()), attendanceStatusSummaryDto.getTitle());
    }

    public static final BEAttendanceSummary e(AttendanceSummaryDto attendanceSummaryDto) {
        ArrayList arrayList;
        List<SemesterAttendanceSummaryDto> listB = attendanceSummaryDto.b();
        if (listB != null) {
            List<SemesterAttendanceSummaryDto> list = listB;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(B((SemesterAttendanceSummaryDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        SchoolFamilyMessageDto message = attendanceSummaryDto.getMessage();
        return new BEAttendanceSummary(arrayList, message != null ? A(message) : null);
    }

    public static final BEAttendancesDay f(AttendancesDayDto attendancesDayDto) {
        List<AttendanceDto> listA = attendancesDayDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(a((AttendanceDto) it.next()));
        }
        return new BEAttendancesDay(arrayList, attendancesDayDto.getDate());
    }

    public static final BEBehaviourFinalGrade g(BehaviourSemesterGradeDto behaviourSemesterGradeDto) {
        OffsetDateTime date = behaviourSemesterGradeDto.getDate();
        String description = behaviourSemesterGradeDto.getDescription();
        String title = behaviourSemesterGradeDto.getTitle();
        boolean descriptive = behaviourSemesterGradeDto.getDescriptive();
        on0.i iconType = behaviourSemesterGradeDto.getIconType();
        return new BEBehaviourFinalGrade(date, description, title, descriptive, iconType != null ? h(iconType) : null);
    }

    public static final h h(on0.i iVar) {
        switch (C3385a.f137316i[iVar.ordinal()]) {
            case 1:
                return h.EXCELLENT;
            case 2:
                return h.VERY_GOOD;
            case 3:
                return h.GOOD;
            case 4:
                return h.SATISFACTORY;
            case 5:
                return h.POOR;
            case 6:
                return h.UNSATISFACTORY;
            case 7:
                return h.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BEBehaviourGradeInfo i(BehaviourSemesterGradeInfoDto behaviourSemesterGradeInfoDto) {
        return new BEBehaviourGradeInfo(behaviourSemesterGradeInfoDto.getTitle(), behaviourSemesterGradeInfoDto.getMessage());
    }

    public static final rn0.j j(j jVar) {
        int i15 = C3385a.f137317j[jVar.ordinal()];
        if (i15 == 1) {
            return rn0.j.POSITIVE;
        }
        if (i15 == 2) {
            return rn0.j.NEGATIVE;
        }
        if (i15 == 3) {
            return rn0.j.UNKNOWN;
        }
        throw new p();
    }

    public static final BEBehaviourPartialGrade k(BehaviourGradeDto behaviourGradeDto, String str) {
        return new BEBehaviourPartialGrade(str, j(behaviourGradeDto.getType()), behaviourGradeDto.getDate(), behaviourGradeDto.getAuthor(), behaviourGradeDto.getComment());
    }

    public static final BEBehaviourSemesterDetails l(BehaviourSemesterDto behaviourSemesterDto, String str) {
        String title = behaviourSemesterDto.getTitle();
        BehaviourSemesterGradeDto semesterGrade = behaviourSemesterDto.getSemesterGrade();
        BEBehaviourFinalGrade bEBehaviourFinalGradeG = semesterGrade != null ? g(semesterGrade) : null;
        List<BehaviourGradeDto> listB = behaviourSemesterDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            arrayList.add(k((BehaviourGradeDto) obj, "partial_" + behaviourSemesterDto.getTitle() + '_' + i15));
            i15 = i16;
        }
        BehaviourSemesterGradeInfoDto gradeInfo = behaviourSemesterDto.getGradeInfo();
        return new BEBehaviourSemesterDetails(str, title, bEBehaviourFinalGradeG, arrayList, gradeInfo != null ? i(gradeInfo) : null);
    }

    public static final BEBehaviourSemesters m(BehaviourDto behaviourDto) {
        ArrayList arrayList;
        List<BehaviourSemesterDto> listB = behaviourDto.b();
        if (listB != null) {
            List<BehaviourSemesterDto> list = listB;
            arrayList = new ArrayList(pq.v.y(list, 10));
            for (BehaviourSemesterDto behaviourSemesterDto : list) {
                arrayList.add(l(behaviourSemesterDto, behaviourSemesterDto.getTitle()));
            }
        } else {
            arrayList = null;
        }
        BEBehaviourSemesterDetails bEBehaviourSemesterDetails = arrayList != null ? (BEBehaviourSemesterDetails) pq.v.l0(arrayList) : null;
        List listF0 = arrayList != null ? pq.v.f0(arrayList, 1) : null;
        SchoolFamilyMessageDto message = behaviourDto.getMessage();
        return new BEBehaviourSemesters(bEBehaviourSemesterDetails, listF0, message != null ? A(message) : null);
    }

    public static final BEChildStudent n(ChildrenStudentDto childrenStudentDto) {
        String id5 = childrenStudentDto.getId();
        String name = childrenStudentDto.getName();
        String schoolName = childrenStudentDto.getSchoolName();
        String schoolClass = childrenStudentDto.getSchoolClass();
        String picture = childrenStudentDto.getPicture();
        LatestGradeDto latestGrade = childrenStudentDto.getLatestGrade();
        BELatestGrade bELatestGradeT = latestGrade != null ? t(latestGrade) : null;
        LatestAbsenceDto latestAbsence = childrenStudentDto.getLatestAbsence();
        BELatestAbsence bELatestAbsenceS = latestAbsence != null ? s(latestAbsence) : null;
        NextLessonDto nextLesson = childrenStudentDto.getNextLesson();
        return new BEChildStudent(id5, name, schoolName, schoolClass, picture, bELatestGradeT, bELatestAbsenceS, nextLesson != null ? x(nextLesson) : null);
    }

    public static final BEGradeDetails o(GradeDetailsDto gradeDetailsDto) {
        String id5 = gradeDetailsDto.getId();
        String grade = gradeDetailsDto.getGrade();
        String category = gradeDetailsDto.getCategory();
        OffsetDateTime createdAt = gradeDetailsDto.getCreatedAt();
        String teacher = gradeDetailsDto.getTeacher();
        BEGradeIcon bEGradeIconP = p(gradeDetailsDto.getIcon());
        boolean descriptive = gradeDetailsDto.getDescriptive();
        String comment = gradeDetailsDto.getComment();
        String subjectName = gradeDetailsDto.getSubjectName();
        PreviousGradeEntryDto previousGrade = gradeDetailsDto.getPreviousGrade();
        return new BEGradeDetails(id5, grade, category, createdAt, teacher, bEGradeIconP, descriptive, comment, subjectName, previousGrade != null ? z(previousGrade) : null);
    }

    public static final BEGradeIcon p(GradeIconDto gradeIconDto) {
        return new BEGradeIcon(q(gradeIconDto.getType()), gradeIconDto.getValue());
    }

    public static final q q(r rVar) {
        int i15 = C3385a.f137308a[rVar.ordinal()];
        if (i15 == 1) {
            return q.POINTS;
        }
        if (i15 == 2) {
            return q.TEXT;
        }
        if (i15 == 3) {
            return q.PERCENTAGE;
        }
        if (i15 == 4) {
            return q.VALUES;
        }
        if (i15 == 5) {
            return q.UNKNOWN;
        }
        throw new p();
    }

    public static final BEGradePreview r(GradePreviewDto gradePreviewDto) {
        return new BEGradePreview(gradePreviewDto.getId(), gradePreviewDto.getCategory(), gradePreviewDto.getCreatedAt(), gradePreviewDto.getGrade(), p(gradePreviewDto.getIcon()), gradePreviewDto.getNewGrade());
    }

    public static final BELatestAbsence s(LatestAbsenceDto latestAbsenceDto) {
        return new BELatestAbsence(latestAbsenceDto.getTitle(), latestAbsenceDto.getSubject(), latestAbsenceDto.getFromTime(), latestAbsenceDto.getToTime(), latestAbsenceDto.getSemesterId(), b(latestAbsenceDto.getStatus()));
    }

    public static final BELatestGrade t(LatestGradeDto latestGradeDto) {
        return new BELatestGrade(latestGradeDto.getId(), latestGradeDto.getGrade(), latestGradeDto.getSubject(), latestGradeDto.getCreatedAt(), p(latestGradeDto.getIcon()));
    }

    public static final BELessonDetails u(LessonDetailsDto lessonDetailsDto) {
        String title = lessonDetailsDto.getTitle();
        int number = lessonDetailsDto.getNumber();
        String attendanceDescription = lessonDetailsDto.getAttendanceDescription();
        k0 k0VarK = K(lessonDetailsDto.getAttendanceStatus());
        LocalDate date = lessonDetailsDto.getDate();
        String duration = lessonDetailsDto.getDuration();
        String teacher = lessonDetailsDto.getTeacher();
        String classNumber = lessonDetailsDto.getClassNumber();
        String topic = lessonDetailsDto.getTopic();
        LessonInfoDto info = lessonDetailsDto.getInfo();
        return new BELessonDetails(title, number, attendanceDescription, k0VarK, date, duration, teacher, classNumber, topic, info != null ? v(info) : null, lessonDetailsDto.getPreviousTeacher());
    }

    public static final BELessonInfo v(LessonInfoDto lessonInfoDto) {
        return new BELessonInfo(lessonInfoDto.getDescription(), lessonInfoDto.getTitle(), w(lessonInfoDto.getType()));
    }

    public static final w w(y yVar) {
        int i15 = C3385a.f137313f[yVar.ordinal()];
        if (i15 == 1) {
            return w.INFO;
        }
        if (i15 == 2) {
            return w.ATTENTION;
        }
        if (i15 == 3) {
            return w.UNKNOWN;
        }
        throw new p();
    }

    public static final BENextLesson x(NextLessonDto nextLessonDto) {
        return new BENextLesson(nextLessonDto.getLessonId(), nextLessonDto.getTitle(), nextLessonDto.getDescription(), I(nextLessonDto.getIconType()), nextLessonDto.getFromTime(), nextLessonDto.getToTime());
    }

    public static final BEPresenceSummary y(PresenceSummaryDto presenceSummaryDto) {
        int schoolYearAttendancePercentage = presenceSummaryDto.getSchoolYearAttendancePercentage();
        int semesterAttendancePercentage = presenceSummaryDto.getSemesterAttendancePercentage();
        List<SubjectPresenceSummaryDto> listC = presenceSummaryDto.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(J((SubjectPresenceSummaryDto) it.next()));
        }
        return new BEPresenceSummary(schoolYearAttendancePercentage, semesterAttendancePercentage, arrayList, presenceSummaryDto.getTitle());
    }

    public static final BEPreviousGrade z(PreviousGradeEntryDto previousGradeEntryDto) {
        return new BEPreviousGrade(previousGradeEntryDto.getGrade(), previousGradeEntryDto.getCreatedAt(), previousGradeEntryDto.getDescriptive());
    }
}
