package o90;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import s84.AttendanceDay;
import s84.AttendanceEntry;
import s84.AttendanceStatusDetails;
import s84.AttendanceStatusSummary;
import s84.PresenceSummary;
import s84.SchoolAttendanceMessage;
import s84.SemesterAttendanceSummary;
import s84.SubjectPresenceSummary;
import u80.BEAttendance;
import u80.BEAttendanceStatusDetails;
import u80.BEAttendanceStatusSummary;
import u80.BEAttendanceSummary;
import u80.BEAttendancesDay;
import u80.BEPresenceSummary;
import u80.BESchoolFamilyMessage;
import u80.BESemesterAttendanceSummary;
import u80.BESubjectPresenceSummary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010,\u001a\u00020\u0018*\u00020\u0019¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lu80/e;", "Ls84/f;", "f", "(Lu80/e;)Ls84/f;", "Lu80/x;", "Ls84/k;", "j", "(Lu80/x;)Ls84/k;", "Lu80/w;", "Ls84/j;", "i", "(Lu80/w;)Ls84/j;", "Lu80/u;", "Ls84/i;", "h", "(Lu80/u;)Ls84/i;", "Lu80/d;", "Ls84/e;", "e", "(Lu80/d;)Ls84/e;", "Lu80/f0;", "Ls84/m;", "l", "(Lu80/f0;)Ls84/m;", "Lu80/b;", "Ls84/c;", "c", "(Lu80/b;)Ls84/c;", "Lu80/e0;", "Ls84/l;", "k", "(Lu80/e0;)Ls84/l;", "Lu80/c;", "Ls84/d;", "d", "(Lu80/c;)Ls84/d;", "Lu80/f;", "Ls84/a;", "a", "(Lu80/f;)Ls84/a;", "Lu80/a;", "Ls84/b;", "b", "(Lu80/a;)Ls84/b;", "g", "(Ls84/c;)Lu80/b;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f143439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f143440c;

        static {
            int[] iArr = new int[u80.b.values().length];
            try {
                iArr[u80.b.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u80.b.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u80.b.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u80.b.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u80.b.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u80.b.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f143438a = iArr;
            int[] iArr2 = new int[u80.e0.values().length];
            try {
                iArr2[u80.e0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[u80.e0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[u80.e0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[u80.e0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[u80.e0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[u80.e0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[u80.e0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[u80.e0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[u80.e0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[u80.e0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[u80.e0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[u80.e0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[u80.e0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[u80.e0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[u80.e0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[u80.e0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[u80.e0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[u80.e0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[u80.e0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[u80.e0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[u80.e0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[u80.e0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[u80.e0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[u80.e0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[u80.e0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[u80.e0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[u80.e0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[u80.e0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[u80.e0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[u80.e0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[u80.e0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[u80.e0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused38) {
            }
            f143439b = iArr2;
            int[] iArr3 = new int[s84.c.values().length];
            try {
                iArr3[s84.c.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[s84.c.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[s84.c.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[s84.c.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[s84.c.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[s84.c.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused44) {
            }
            f143440c = iArr3;
        }
    }

    public static final AttendanceDay a(BEAttendancesDay bEAttendancesDay) {
        List<BEAttendance> listA = bEAttendancesDay.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((BEAttendance) it.next()));
        }
        return new AttendanceDay(arrayList, bEAttendancesDay.getDate());
    }

    public static final AttendanceEntry b(BEAttendance bEAttendance) {
        return new AttendanceEntry(bEAttendance.getFromTime(), bEAttendance.getTitle(), bEAttendance.getToTime());
    }

    public static final s84.c c(u80.b bVar) {
        switch (a.f143438a[bVar.ordinal()]) {
            case 1:
                return s84.c.ABSENCE;
            case 2:
                return s84.c.SCHOOL_REASONS_ABSENCE;
            case 3:
                return s84.c.LATENESS;
            case 4:
                return s84.c.EXCUSE;
            case 5:
                return s84.c.JUSTIFICATION;
            case 6:
                return s84.c.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final AttendanceStatusDetails d(BEAttendanceStatusDetails bEAttendanceStatusDetails) {
        List<BEAttendancesDay> listA = bEAttendanceStatusDetails.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(a((BEAttendancesDay) it.next()));
        }
        return new AttendanceStatusDetails(arrayList);
    }

    public static final AttendanceStatusSummary e(BEAttendanceStatusSummary bEAttendanceStatusSummary) {
        return new AttendanceStatusSummary(bEAttendanceStatusSummary.getCount(), c(bEAttendanceStatusSummary.getStatus()), bEAttendanceStatusSummary.getTitle());
    }

    public static final s84.f f(BEAttendanceSummary bEAttendanceSummary) {
        List<BESemesterAttendanceSummary> listB = bEAttendanceSummary.b();
        BESchoolFamilyMessage message = bEAttendanceSummary.getMessage();
        if (message != null) {
            return new s84.f.EmptyState(i(message));
        }
        if (listB == null) {
            return s84.f.c.f179316a;
        }
        List<BESemesterAttendanceSummary> list = listB;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((BESemesterAttendanceSummary) it.next()));
        }
        return new s84.f.AttendanceSemesters(arrayList);
    }

    public static final u80.b g(s84.c cVar) {
        switch (a.f143440c[cVar.ordinal()]) {
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

    public static final PresenceSummary h(BEPresenceSummary bEPresenceSummary) {
        int schoolYearAttendancePercentage = bEPresenceSummary.getSchoolYearAttendancePercentage();
        int semesterAttendancePercentage = bEPresenceSummary.getSemesterAttendancePercentage();
        List<BESubjectPresenceSummary> listC = bEPresenceSummary.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(l((BESubjectPresenceSummary) it.next()));
        }
        return new PresenceSummary(schoolYearAttendancePercentage, semesterAttendancePercentage, arrayList, bEPresenceSummary.getTitle());
    }

    public static final SchoolAttendanceMessage i(BESchoolFamilyMessage bESchoolFamilyMessage) {
        return new SchoolAttendanceMessage(bESchoolFamilyMessage.getTitle(), bESchoolFamilyMessage.getMessage());
    }

    public static final SemesterAttendanceSummary j(BESemesterAttendanceSummary bESemesterAttendanceSummary) {
        boolean current = bESemesterAttendanceSummary.getCurrent();
        PresenceSummary presenceSummaryH = h(bESemesterAttendanceSummary.getPresenceSummary());
        String semesterId = bESemesterAttendanceSummary.getSemesterId();
        List<BEAttendanceStatusSummary> listD = bESemesterAttendanceSummary.d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(e((BEAttendanceStatusSummary) it.next()));
        }
        return new SemesterAttendanceSummary(current, presenceSummaryH, semesterId, arrayList, bESemesterAttendanceSummary.getTitle());
    }

    public static final s84.l k(u80.e0 e0Var) {
        switch (a.f143439b[e0Var.ordinal()]) {
            case 1:
                return s84.l.APPLE;
            case 2:
                return s84.l.ATOM;
            case 3:
                return s84.l.BACTERIA;
            case 4:
                return s84.l.BALANCE;
            case 5:
                return s84.l.BALL;
            case 6:
                return s84.l.BELL;
            case 7:
                return s84.l.BLOCKS;
            case 8:
                return s84.l.BRIEFCASE;
            case 9:
                return s84.l.BUILDING;
            case 10:
                return s84.l.CHART;
            case 11:
                return s84.l.COLUMN;
            case 12:
                return s84.l.COMPUTER;
            case 13:
                return s84.l.FOLDER;
            case 14:
                return s84.l.GLASSES;
            case 15:
                return s84.l.GLOBE;
            case 16:
                return s84.l.GROUP;
            case 17:
                return s84.l.HAND_GESTURE;
            case 18:
                return s84.l.HOURGLASS;
            case 19:
                return s84.l.LANGUAGE;
            case 20:
                return s84.l.LEAF;
            case 21:
                return s84.l.MAGNET;
            case 22:
                return s84.l.MUSIC_NOTE;
            case 23:
                return s84.l.NOTEBOOK;
            case 24:
                return s84.l.PALETTE;
            case 25:
                return s84.l.PEN;
            case 26:
                return s84.l.POOL;
            case 27:
                return s84.l.PUZZLE;
            case 28:
                return s84.l.RULER;
            case 29:
                return s84.l.SCISSORS;
            case 30:
                return s84.l.SECURITY;
            case BERTags.DATE /* 31 */:
                return s84.l.SUPPORT;
            case 32:
                return s84.l.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final SubjectPresenceSummary l(BESubjectPresenceSummary bESubjectPresenceSummary) {
        return new SubjectPresenceSummary(bESubjectPresenceSummary.getAttendancePercentage(), k(bESubjectPresenceSummary.getSubjectIcon()), bESubjectPresenceSummary.getSubjectName());
    }
}
