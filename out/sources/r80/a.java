package r80;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fz.c;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jt3.AttendanceDto;
import jt3.AttendanceStatusDetailsDto;
import jt3.AttendanceStatusSummaryDto;
import jt3.AttendanceSummaryDto;
import jt3.AttendancesDayDto;
import jt3.BehaviourDto;
import jt3.BehaviourGradeDto;
import jt3.BehaviourSemesterDto;
import jt3.BehaviourSemesterGradeDto;
import jt3.BehaviourSemesterGradeInfoDto;
import jt3.GradeDetailsDto;
import jt3.GradeIconDto;
import jt3.GradePreviewDto;
import jt3.LessonDetailsDto;
import jt3.LessonInfoDto;
import jt3.LessonPreviewDto;
import jt3.LessonsDayDto;
import jt3.LessonsWeekDto;
import jt3.PresenceSummaryDto;
import jt3.PreviousGradeEntryDto;
import jt3.SchoolFamilyMessageDto;
import jt3.SemesterAttendanceSummaryDto;
import jt3.SemesterDetailsDto;
import jt3.SemesterGradeDto;
import jt3.SemesterPreviewDto;
import jt3.SemestersDto;
import jt3.SubjectEntryDto;
import jt3.SubjectGradesDto;
import jt3.SubjectPresenceSummaryDto;
import jt3.b;
import jt3.j;
import jt3.k0;
import jt3.p;
import jt3.r;
import jt3.u;
import jt3.w;
import jt3.x;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import pq.v;
import u80.BEAttendance;
import u80.BEAttendanceStatusDetails;
import u80.BEAttendanceStatusSummary;
import u80.BEAttendanceSummary;
import u80.BEAttendancesDay;
import u80.BEBehaviourFinalGrade;
import u80.BEBehaviourGradeInfo;
import u80.BEBehaviourPartialGrade;
import u80.BEBehaviourSemesterDetails;
import u80.BEBehaviourSemesters;
import u80.BEGradeDetails;
import u80.BEGradeIcon;
import u80.BEGradePreview;
import u80.BELessonDetails;
import u80.BELessonInfo;
import u80.BEPresenceSummary;
import u80.BEPreviousGrade;
import u80.BESchoolFamilyMessage;
import u80.BESemesterAttendanceSummary;
import u80.BESemesterDetails;
import u80.BESemesterGrade;
import u80.BESemesterPreview;
import u80.BESemesters;
import u80.BESubjectEntry;
import u80.BESubjectGrades;
import u80.BESubjectPresenceSummary;
import u80.BETimetableDay;
import u80.BETimetableSlot;
import u80.BETimetableWeek;
import u80.e0;
import u80.g0;
import u80.h;
import u80.j0;
import u80.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ö\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010F\u001a\u00020E*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010J\u001a\u00020I*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010R\u001a\u00020Q*\u00020P¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010V\u001a\u00020U*\u00020T¢\u0006\u0004\bV\u0010W\u001a\u0011\u0010Z\u001a\u00020Y*\u00020X¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010^\u001a\u00020]*\u00020\\¢\u0006\u0004\b^\u0010_\u001a\u0011\u0010b\u001a\u00020a*\u00020`¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010f\u001a\u00020e*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010j\u001a\u00020i*\u00020h¢\u0006\u0004\bj\u0010k\u001a\u0011\u0010n\u001a\u00020m*\u00020l¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010r\u001a\u00020q*\u00020p¢\u0006\u0004\br\u0010s\u001a\u0011\u0010v\u001a\u00020u*\u00020t¢\u0006\u0004\bv\u0010w\u001a\u0011\u0010z\u001a\u00020y*\u00020x¢\u0006\u0004\bz\u0010{\u001a\u0011\u0010~\u001a\u00020}*\u00020|¢\u0006\u0004\b~\u0010\u007f\u001a \u0010\u0084\u0001\u001a\u00030\u0083\u0001*\u00030\u0080\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0016\u0010\u0088\u0001\u001a\u00030\u0087\u0001*\u00030\u0086\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0016\u0010\u008c\u0001\u001a\u00030\u008b\u0001*\u00030\u008a\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0016\u0010\u0090\u0001\u001a\u00030\u008f\u0001*\u00030\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a \u0010\u0094\u0001\u001a\u00030\u0093\u0001*\u00030\u0092\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0016\u0010\u0098\u0001\u001a\u00030\u0097\u0001*\u00030\u0096\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0014\u0010\u009a\u0001\u001a\u00020x*\u00020y¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0017\u0010\u009e\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bf\u0010\u009d\u0001¨\u0006\u009f\u0001"}, d2 = {"Ljt3/h0;", "Lu80/b0;", "B", "(Ljt3/h0;)Lu80/b0;", "Ljt3/e0;", "Lu80/y;", "y", "(Ljt3/e0;)Lu80/y;", "Ljt3/g0;", "Lu80/a0;", "A", "(Ljt3/g0;)Lu80/a0;", "Ljt3/c0;", "Lu80/w;", "w", "(Ljt3/c0;)Lu80/w;", "Ljt3/i0;", "Lu80/c0;", "C", "(Ljt3/i0;)Lu80/c0;", "Ljt3/k0;", "Lu80/e0;", "E", "(Ljt3/k0;)Lu80/e0;", "Ljt3/j0;", "Lu80/d0;", ip.a.f96138c, "(Ljt3/j0;)Lu80/d0;", "Ljt3/q;", "Lu80/q;", "q", "(Ljt3/q;)Lu80/q;", "Ljt3/f0;", "Lu80/z;", "z", "(Ljt3/f0;)Lu80/z;", "Ljt3/o;", "Lu80/o;", "o", "(Ljt3/o;)Lu80/o;", "Ljt3/p;", "Lu80/p;", "p", "(Ljt3/p;)Lu80/p;", "Ljt3/z;", "Lu80/l0;", i.f37094u, "(Ljt3/z;)Lu80/l0;", "Ljt3/y;", "Lu80/h0;", i.f37087n, "(Ljt3/y;)Lu80/h0;", "Ljt3/v;", "Lu80/i0;", "I", "(Ljt3/v;)Lu80/i0;", "Ljt3/w;", "Lu80/k0;", "K", "(Ljt3/w;)Lu80/k0;", "Ljt3/x;", "Lu80/j0;", "J", "(Ljt3/x;)Lu80/j0;", "Ljt3/n;", "Lu80/n;", "n", "(Ljt3/n;)Lu80/n;", "Ljt3/s;", "Lu80/r;", "r", "(Ljt3/s;)Lu80/r;", "Ljt3/r;", "Lu80/g0;", "G", "(Ljt3/r;)Lu80/g0;", "Ljt3/t;", "Lu80/s;", "s", "(Ljt3/t;)Lu80/s;", "Ljt3/u;", "Lu80/t;", "t", "(Ljt3/u;)Lu80/t;", "Ljt3/b0;", "Lu80/v;", "v", "(Ljt3/b0;)Lu80/v;", "Ljt3/e;", "Lu80/e;", "e", "(Ljt3/e;)Lu80/e;", "Ljt3/c;", "Lu80/c;", "c", "(Ljt3/c;)Lu80/c;", "Ljt3/f;", "Lu80/f;", "f", "(Ljt3/f;)Lu80/f;", "Ljt3/a;", "Lu80/a;", "a", "(Ljt3/a;)Lu80/a;", "Ljt3/d0;", "Lu80/x;", "x", "(Ljt3/d0;)Lu80/x;", "Ljt3/a0;", "Lu80/u;", "u", "(Ljt3/a0;)Lu80/u;", "Ljt3/d;", "Lu80/d;", "d", "(Ljt3/d;)Lu80/d;", "Ljt3/l0;", "Lu80/f0;", "F", "(Ljt3/l0;)Lu80/f0;", "Ljt3/b;", "Lu80/b;", "b", "(Ljt3/b;)Lu80/b;", "Ljt3/g;", "Lu80/m;", "m", "(Ljt3/g;)Lu80/m;", "Ljt3/k;", "", "id", "Lu80/l;", "l", "(Ljt3/k;Ljava/lang/String;)Lu80/l;", "Ljt3/m;", "Lu80/i;", "i", "(Ljt3/m;)Lu80/i;", "Ljt3/l;", "Lu80/g;", "g", "(Ljt3/l;)Lu80/g;", "Ljt3/i;", "Lu80/h;", "h", "(Ljt3/i;)Lu80/h;", "Ljt3/h;", "Lu80/k;", "k", "(Ljt3/h;Ljava/lang/String;)Lu80/k;", "Ljt3/j;", "Lu80/j;", "j", "(Ljt3/j;)Lu80/j;", "M", "(Lu80/b;)Ljt3/b;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "DAY_FORMATTER", "educationservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateTimeFormatter f172325a = DateTimeFormatter.ofPattern(c.DOTTED.getFormat());

    /* JADX INFO: renamed from: r80.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4393a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f172327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f172328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f172329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f172330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f172331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f172332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f172333h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f172334i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f172335j;

        static {
            int[] iArr = new int[k0.values().length];
            try {
                iArr[k0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[k0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[k0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[k0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[k0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[k0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[k0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[k0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[k0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[k0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[k0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[k0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[k0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[k0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[k0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[k0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[k0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[k0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[k0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[k0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f172326a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[p.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[p.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[p.VALUES.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[p.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            f172327b = iArr2;
            int[] iArr3 = new int[w.values().length];
            try {
                iArr3[w.LESSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[w.FREE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            f172328c = iArr3;
            int[] iArr4 = new int[x.values().length];
            try {
                iArr4[x.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[x.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[x.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            f172329d = iArr4;
            int[] iArr5 = new int[r.values().length];
            try {
                iArr5[r.PRESENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[r.ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[r.FUTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr5[r.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr5[r.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused47) {
            }
            f172330e = iArr5;
            int[] iArr6 = new int[u.values().length];
            try {
                iArr6[u.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[u.ATTENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[u.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            f172331f = iArr6;
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
            f172332g = iArr7;
            int[] iArr8 = new int[jt3.i.values().length];
            try {
                iArr8[jt3.i.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr8[jt3.i.VERY_GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr8[jt3.i.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr8[jt3.i.SATISFACTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr8[jt3.i.POOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr8[jt3.i.UNSATISFACTORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr8[jt3.i.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused63) {
            }
            f172333h = iArr8;
            int[] iArr9 = new int[j.values().length];
            try {
                iArr9[j.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr9[j.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr9[j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused66) {
            }
            f172334i = iArr9;
            int[] iArr10 = new int[u80.b.values().length];
            try {
                iArr10[u80.b.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr10[u80.b.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr10[u80.b.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr10[u80.b.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr10[u80.b.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr10[u80.b.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused72) {
            }
            f172335j = iArr10;
        }
    }

    public static final BESemesterPreview A(SemesterPreviewDto semesterPreviewDto) {
        return new BESemesterPreview(semesterPreviewDto.getId(), semesterPreviewDto.getTitle());
    }

    public static final BESemesters B(SemestersDto semestersDto) {
        ArrayList arrayList;
        SemesterDetailsDto currentSemester = semestersDto.getCurrentSemester();
        BESemesterDetails bESemesterDetailsY = currentSemester != null ? y(currentSemester) : null;
        List<SemesterPreviewDto> listC = semestersDto.c();
        if (listC != null) {
            List<SemesterPreviewDto> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(A((SemesterPreviewDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        SchoolFamilyMessageDto message = semestersDto.getMessage();
        return new BESemesters(bESemesterDetailsY, arrayList, message != null ? w(message) : null);
    }

    public static final BESubjectEntry C(SubjectEntryDto subjectEntryDto) {
        return new BESubjectEntry(subjectEntryDto.getId(), subjectEntryDto.getTitle(), E(subjectEntryDto.getIconType()), subjectEntryDto.getNewGrades());
    }

    public static final BESubjectGrades D(SubjectGradesDto subjectGradesDto) {
        List<GradePreviewDto> listA = subjectGradesDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(q((GradePreviewDto) it.next()));
        }
        SemesterGradeDto semesterGrade = subjectGradesDto.getSemesterGrade();
        return new BESubjectGrades(arrayList, semesterGrade != null ? z(semesterGrade) : null);
    }

    public static final e0 E(k0 k0Var) {
        switch (C4393a.f172326a[k0Var.ordinal()]) {
            case 1:
                return e0.APPLE;
            case 2:
                return e0.ATOM;
            case 3:
                return e0.BACTERIA;
            case 4:
                return e0.BALANCE;
            case 5:
                return e0.BALL;
            case 6:
                return e0.BELL;
            case 7:
                return e0.BLOCKS;
            case 8:
                return e0.BRIEFCASE;
            case 9:
                return e0.BUILDING;
            case 10:
                return e0.CHART;
            case 11:
                return e0.COLUMN;
            case 12:
                return e0.COMPUTER;
            case 13:
                return e0.FOLDER;
            case 14:
                return e0.GLASSES;
            case 15:
                return e0.GLOBE;
            case 16:
                return e0.GROUP;
            case 17:
                return e0.HAND_GESTURE;
            case 18:
                return e0.HOURGLASS;
            case 19:
                return e0.LANGUAGE;
            case 20:
                return e0.LEAF;
            case 21:
                return e0.MAGNET;
            case 22:
                return e0.MUSIC_NOTE;
            case 23:
                return e0.NOTEBOOK;
            case 24:
                return e0.PALETTE;
            case 25:
                return e0.PEN;
            case 26:
                return e0.POOL;
            case 27:
                return e0.PUZZLE;
            case 28:
                return e0.RULER;
            case 29:
                return e0.SCISSORS;
            case 30:
                return e0.SECURITY;
            case BERTags.DATE /* 31 */:
                return e0.SUPPORT;
            case 32:
                return e0.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final BESubjectPresenceSummary F(SubjectPresenceSummaryDto subjectPresenceSummaryDto) {
        return new BESubjectPresenceSummary(subjectPresenceSummaryDto.getAttendancePercentage(), E(subjectPresenceSummaryDto.getSubjectIcon()), subjectPresenceSummaryDto.getSubjectName());
    }

    public static final g0 G(r rVar) {
        int i15 = C4393a.f172330e[rVar.ordinal()];
        if (i15 == 1) {
            return g0.PRESENCE;
        }
        if (i15 == 2) {
            return g0.ABSENCE;
        }
        if (i15 == 3) {
            return g0.FUTURE;
        }
        if (i15 == 4) {
            return g0.CANCELLED;
        }
        if (i15 == 5) {
            return g0.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final BETimetableDay H(LessonsDayDto lessonsDayDto) {
        LocalDate localDate = LocalDate.parse(lessonsDayDto.getDate(), f172325a);
        int numberOfLessons = lessonsDayDto.getNumberOfLessons();
        List<LessonPreviewDto> listC = lessonsDayDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(I((LessonPreviewDto) it.next()));
        }
        return new BETimetableDay(localDate, numberOfLessons, arrayList);
    }

    public static final BETimetableSlot I(LessonPreviewDto lessonPreviewDto) {
        return new BETimetableSlot(lessonPreviewDto.getFromTime(), lessonPreviewDto.getToTime(), lessonPreviewDto.getNumber(), lessonPreviewDto.getTitle(), K(lessonPreviewDto.getType()), J(lessonPreviewDto.getState()), E(lessonPreviewDto.getIconType()), lessonPreviewDto.getClassNumber(), lessonPreviewDto.getLessonId());
    }

    public static final j0 J(x xVar) {
        int i15 = C4393a.f172329d[xVar.ordinal()];
        if (i15 == 1) {
            return j0.CURRENT;
        }
        if (i15 != 2) {
            return i15 != 3 ? j0.UNKNOWN : j0.CANCELLED;
        }
        return j0.UPDATED;
    }

    public static final u80.k0 K(w wVar) {
        int i15 = C4393a.f172328c[wVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? u80.k0.UNKNOWN : u80.k0.FREE_TIME;
        }
        return u80.k0.LESSON;
    }

    public static final BETimetableWeek L(LessonsWeekDto lessonsWeekDto) {
        ArrayList arrayList;
        List<LessonsDayDto> listA = lessonsWeekDto.a();
        if (listA != null) {
            List<LessonsDayDto> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((LessonsDayDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        LocalDate localDate = lessonsWeekDto.getMinSelectionDate().toLocalDate();
        LocalDate localDate2 = lessonsWeekDto.getMaxSelectionDate().toLocalDate();
        SchoolFamilyMessageDto message = lessonsWeekDto.getMessage();
        return new BETimetableWeek(arrayList, localDate, localDate2, message != null ? w(message) : null);
    }

    public static final b M(u80.b bVar) {
        switch (C4393a.f172335j[bVar.ordinal()]) {
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
                throw new oq.p();
        }
    }

    public static final BEAttendance a(AttendanceDto attendanceDto) {
        return new BEAttendance(attendanceDto.getFromTime(), attendanceDto.getTitle(), attendanceDto.getToTime());
    }

    public static final u80.b b(b bVar) {
        switch (C4393a.f172332g[bVar.ordinal()]) {
            case 1:
                return u80.b.ABSENCE;
            case 2:
                return u80.b.SCHOOL_REASONS_ABSENCE;
            case 3:
                return u80.b.LATENESS;
            case 4:
                return u80.b.EXCUSE;
            case 5:
                return u80.b.JUSTIFICATION;
            case 6:
                return u80.b.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final BEAttendanceStatusDetails c(AttendanceStatusDetailsDto attendanceStatusDetailsDto) {
        List<AttendancesDayDto> listA = attendanceStatusDetailsDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
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
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x((SemesterAttendanceSummaryDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        SchoolFamilyMessageDto message = attendanceSummaryDto.getMessage();
        return new BEAttendanceSummary(arrayList, message != null ? w(message) : null);
    }

    public static final BEAttendancesDay f(AttendancesDayDto attendancesDayDto) {
        List<AttendanceDto> listA = attendancesDayDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
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
        jt3.i iconType = behaviourSemesterGradeDto.getIconType();
        return new BEBehaviourFinalGrade(date, description, title, descriptive, iconType != null ? h(iconType) : null);
    }

    public static final h h(jt3.i iVar) {
        switch (C4393a.f172333h[iVar.ordinal()]) {
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
                throw new oq.p();
        }
    }

    public static final BEBehaviourGradeInfo i(BehaviourSemesterGradeInfoDto behaviourSemesterGradeInfoDto) {
        return new BEBehaviourGradeInfo(behaviourSemesterGradeInfoDto.getTitle(), behaviourSemesterGradeInfoDto.getMessage());
    }

    public static final u80.j j(j jVar) {
        int i15 = C4393a.f172334i[jVar.ordinal()];
        if (i15 == 1) {
            return u80.j.POSITIVE;
        }
        if (i15 == 2) {
            return u80.j.NEGATIVE;
        }
        if (i15 == 3) {
            return u80.j.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final BEBehaviourPartialGrade k(BehaviourGradeDto behaviourGradeDto, String str) {
        return new BEBehaviourPartialGrade(str, j(behaviourGradeDto.getType()), behaviourGradeDto.getDate(), behaviourGradeDto.getAuthor(), behaviourGradeDto.getComment());
    }

    public static final BEBehaviourSemesterDetails l(BehaviourSemesterDto behaviourSemesterDto, String str) {
        String title = behaviourSemesterDto.getTitle();
        BehaviourSemesterGradeDto semesterGrade = behaviourSemesterDto.getSemesterGrade();
        BEBehaviourFinalGrade bEBehaviourFinalGradeG = semesterGrade != null ? g(semesterGrade) : null;
        List<BehaviourGradeDto> listB = behaviourSemesterDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
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
            arrayList = new ArrayList(v.y(list, 10));
            for (BehaviourSemesterDto behaviourSemesterDto : list) {
                arrayList.add(l(behaviourSemesterDto, behaviourSemesterDto.getTitle()));
            }
        } else {
            arrayList = null;
        }
        BEBehaviourSemesterDetails bEBehaviourSemesterDetails = arrayList != null ? (BEBehaviourSemesterDetails) v.l0(arrayList) : null;
        List listF0 = arrayList != null ? v.f0(arrayList, 1) : null;
        SchoolFamilyMessageDto message = behaviourDto.getMessage();
        return new BEBehaviourSemesters(bEBehaviourSemesterDetails, listF0, message != null ? w(message) : null);
    }

    public static final BEGradeDetails n(GradeDetailsDto gradeDetailsDto) {
        String id5 = gradeDetailsDto.getId();
        String grade = gradeDetailsDto.getGrade();
        String category = gradeDetailsDto.getCategory();
        OffsetDateTime createdAt = gradeDetailsDto.getCreatedAt();
        String teacher = gradeDetailsDto.getTeacher();
        BEGradeIcon bEGradeIconO = o(gradeDetailsDto.getIcon());
        boolean descriptive = gradeDetailsDto.getDescriptive();
        String comment = gradeDetailsDto.getComment();
        String subjectName = gradeDetailsDto.getSubjectName();
        PreviousGradeEntryDto previousGrade = gradeDetailsDto.getPreviousGrade();
        return new BEGradeDetails(id5, grade, category, createdAt, teacher, bEGradeIconO, descriptive, comment, subjectName, previousGrade != null ? v(previousGrade) : null);
    }

    public static final BEGradeIcon o(GradeIconDto gradeIconDto) {
        return new BEGradeIcon(p(gradeIconDto.getType()), gradeIconDto.getValue());
    }

    public static final u80.p p(p pVar) {
        int i15 = C4393a.f172327b[pVar.ordinal()];
        if (i15 == 1) {
            return u80.p.POINTS;
        }
        if (i15 == 2) {
            return u80.p.TEXT;
        }
        if (i15 == 3) {
            return u80.p.PERCENTAGE;
        }
        if (i15 == 4) {
            return u80.p.VALUES;
        }
        if (i15 == 5) {
            return u80.p.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final BEGradePreview q(GradePreviewDto gradePreviewDto) {
        return new BEGradePreview(gradePreviewDto.getId(), gradePreviewDto.getCategory(), gradePreviewDto.getCreatedAt(), gradePreviewDto.getGrade(), o(gradePreviewDto.getIcon()), gradePreviewDto.getNewGrade());
    }

    public static final BELessonDetails r(LessonDetailsDto lessonDetailsDto) {
        String title = lessonDetailsDto.getTitle();
        int number = lessonDetailsDto.getNumber();
        String attendanceDescription = lessonDetailsDto.getAttendanceDescription();
        g0 g0VarG = G(lessonDetailsDto.getAttendanceStatus());
        LocalDate date = lessonDetailsDto.getDate();
        String duration = lessonDetailsDto.getDuration();
        String teacher = lessonDetailsDto.getTeacher();
        String classNumber = lessonDetailsDto.getClassNumber();
        String topic = lessonDetailsDto.getTopic();
        LessonInfoDto info = lessonDetailsDto.getInfo();
        return new BELessonDetails(title, number, attendanceDescription, g0VarG, date, duration, teacher, classNumber, topic, info != null ? s(info) : null, lessonDetailsDto.getPreviousTeacher());
    }

    public static final BELessonInfo s(LessonInfoDto lessonInfoDto) {
        return new BELessonInfo(lessonInfoDto.getDescription(), lessonInfoDto.getTitle(), t(lessonInfoDto.getType()));
    }

    public static final t t(u uVar) {
        int i15 = C4393a.f172331f[uVar.ordinal()];
        if (i15 == 1) {
            return t.INFO;
        }
        if (i15 == 2) {
            return t.ATTENTION;
        }
        if (i15 == 3) {
            return t.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final BEPresenceSummary u(PresenceSummaryDto presenceSummaryDto) {
        int schoolYearAttendancePercentage = presenceSummaryDto.getSchoolYearAttendancePercentage();
        int semesterAttendancePercentage = presenceSummaryDto.getSemesterAttendancePercentage();
        List<SubjectPresenceSummaryDto> listC = presenceSummaryDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(F((SubjectPresenceSummaryDto) it.next()));
        }
        return new BEPresenceSummary(schoolYearAttendancePercentage, semesterAttendancePercentage, arrayList, presenceSummaryDto.getTitle());
    }

    public static final BEPreviousGrade v(PreviousGradeEntryDto previousGradeEntryDto) {
        return new BEPreviousGrade(previousGradeEntryDto.getGrade(), previousGradeEntryDto.getCreatedAt(), previousGradeEntryDto.getDescriptive());
    }

    public static final BESchoolFamilyMessage w(SchoolFamilyMessageDto schoolFamilyMessageDto) {
        return new BESchoolFamilyMessage(schoolFamilyMessageDto.getTitle(), schoolFamilyMessageDto.getMessage());
    }

    public static final BESemesterAttendanceSummary x(SemesterAttendanceSummaryDto semesterAttendanceSummaryDto) {
        boolean current = semesterAttendanceSummaryDto.getCurrent();
        BEPresenceSummary bEPresenceSummaryU = u(semesterAttendanceSummaryDto.getPresenceSummary());
        String semesterId = semesterAttendanceSummaryDto.getSemesterId();
        List<AttendanceStatusSummaryDto> listD = semesterAttendanceSummaryDto.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(d((AttendanceStatusSummaryDto) it.next()));
        }
        return new BESemesterAttendanceSummary(current, bEPresenceSummaryU, semesterId, arrayList, semesterAttendanceSummaryDto.getTitle());
    }

    public static final BESemesterDetails y(SemesterDetailsDto semesterDetailsDto) {
        String id5 = semesterDetailsDto.getId();
        String title = semesterDetailsDto.getTitle();
        List<SubjectEntryDto> listC = semesterDetailsDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(C((SubjectEntryDto) it.next()));
        }
        SchoolFamilyMessageDto message = semesterDetailsDto.getMessage();
        return new BESemesterDetails(id5, title, arrayList, message != null ? w(message) : null);
    }

    public static final BESemesterGrade z(SemesterGradeDto semesterGradeDto) {
        return new BESemesterGrade(semesterGradeDto.getCategory(), semesterGradeDto.getCreatedAt(), semesterGradeDto.getDescriptive(), semesterGradeDto.getGrade(), o(semesterGradeDto.getIcon()), semesterGradeDto.getNewGrade(), semesterGradeDto.getTeacher(), semesterGradeDto.getComment());
    }
}
