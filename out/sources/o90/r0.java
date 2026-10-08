package o90;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import u80.BEGradeDetails;
import u80.BEGradeIcon;
import u80.BEGradePreview;
import u80.BEPreviousGrade;
import u80.BESchoolFamilyMessage;
import u80.BESemesterDetails;
import u80.BESemesterGrade;
import u80.BESemesterPreview;
import u80.BESemesters;
import u80.BESubjectEntry;
import u80.BESubjectGrades;
import w94.GradeDetails;
import w94.GradeIcon;
import w94.GradePreview;
import w94.PreviousGrade;
import w94.SchoolGradesMessage;
import w94.SemesterDetails;
import w94.SemesterGrade;
import w94.SemesterPreview;
import w94.Subject;
import w94.SubjectGrades;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lu80/b0;", "Lw94/e;", "e", "(Lu80/b0;)Lw94/e;", "Lu80/w;", "Lw94/g;", "h", "(Lu80/w;)Lw94/g;", "Lu80/y;", "Lw94/h;", "i", "(Lu80/y;)Lw94/h;", "Lu80/a0;", "Lw94/j;", "k", "(Lu80/a0;)Lw94/j;", "Lu80/c0;", "Lw94/k;", "l", "(Lu80/c0;)Lw94/k;", "Lu80/e0;", "Lw94/m;", "f", "(Lu80/e0;)Lw94/m;", "Lu80/d0;", "Lw94/l;", "m", "(Lu80/d0;)Lw94/l;", "Lu80/q;", "Lw94/d;", "d", "(Lu80/q;)Lw94/d;", "Lu80/z;", "Lw94/i;", "j", "(Lu80/z;)Lw94/i;", "Lu80/o;", "Lw94/b;", "b", "(Lu80/o;)Lw94/b;", "Lu80/p;", "Lw94/c;", "c", "(Lu80/p;)Lw94/c;", "Lu80/n;", "Lw94/a;", "a", "(Lu80/n;)Lw94/a;", "Lu80/v;", "Lw94/f;", "g", "(Lu80/v;)Lw94/f;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f143465b;

        static {
            int[] iArr = new int[u80.e0.values().length];
            try {
                iArr[u80.e0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u80.e0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u80.e0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u80.e0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u80.e0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u80.e0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u80.e0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u80.e0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u80.e0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u80.e0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u80.e0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[u80.e0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[u80.e0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[u80.e0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[u80.e0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[u80.e0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[u80.e0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[u80.e0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[u80.e0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[u80.e0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[u80.e0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[u80.e0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[u80.e0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[u80.e0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[u80.e0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[u80.e0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[u80.e0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[u80.e0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[u80.e0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[u80.e0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[u80.e0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[u80.e0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f143464a = iArr;
            int[] iArr2 = new int[u80.p.values().length];
            try {
                iArr2[u80.p.POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[u80.p.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[u80.p.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[u80.p.VALUES.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[u80.p.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            f143465b = iArr2;
        }
    }

    public static final GradeDetails a(BEGradeDetails bEGradeDetails) {
        String id5 = bEGradeDetails.getId();
        String grade = bEGradeDetails.getGrade();
        String category = bEGradeDetails.getCategory();
        OffsetDateTime createdAt = bEGradeDetails.getCreatedAt();
        String teacher = bEGradeDetails.getTeacher();
        GradeIcon gradeIconB = b(bEGradeDetails.getIcon());
        boolean descriptive = bEGradeDetails.getDescriptive();
        String comment = bEGradeDetails.getComment();
        String subjectName = bEGradeDetails.getSubjectName();
        BEPreviousGrade previousGrade = bEGradeDetails.getPreviousGrade();
        return new GradeDetails(id5, grade, category, createdAt, teacher, gradeIconB, descriptive, comment, subjectName, previousGrade != null ? g(previousGrade) : null);
    }

    public static final GradeIcon b(BEGradeIcon bEGradeIcon) {
        return new GradeIcon(c(bEGradeIcon.getType()), bEGradeIcon.getValue());
    }

    public static final w94.c c(u80.p pVar) {
        int i15 = a.f143465b[pVar.ordinal()];
        if (i15 == 1) {
            return w94.c.POINTS;
        }
        if (i15 == 2) {
            return w94.c.TEXT;
        }
        if (i15 == 3) {
            return w94.c.PERCENTAGE;
        }
        if (i15 == 4) {
            return w94.c.VALUES;
        }
        if (i15 == 5) {
            return w94.c.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final GradePreview d(BEGradePreview bEGradePreview) {
        return new GradePreview(bEGradePreview.getId(), bEGradePreview.getCategory(), bEGradePreview.getCreatedAt(), bEGradePreview.getGrade(), b(bEGradePreview.getIcon()), bEGradePreview.getNewGrade());
    }

    public static final w94.e e(BESemesters bESemesters) {
        List listN;
        BESemesterDetails currentSemester = bESemesters.getCurrentSemester();
        List<BESemesterPreview> listC = bESemesters.c();
        BESchoolFamilyMessage message = bESemesters.getMessage();
        if (message != null) {
            return new w94.e.EmptyState(h(message));
        }
        if (currentSemester == null) {
            return w94.e.b.f211486a;
        }
        SemesterDetails semesterDetailsI = i(currentSemester);
        if (listC != null) {
            List<BESemesterPreview> list = listC;
            listN = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(k((BESemesterPreview) it.next()));
            }
        } else {
            listN = pq.v.n();
        }
        return new w94.e.Semesters(semesterDetailsI, listN);
    }

    public static final w94.m f(u80.e0 e0Var) {
        switch (a.f143464a[e0Var.ordinal()]) {
            case 1:
                return w94.m.APPLE;
            case 2:
                return w94.m.ATOM;
            case 3:
                return w94.m.BACTERIA;
            case 4:
                return w94.m.BALANCE;
            case 5:
                return w94.m.BALL;
            case 6:
                return w94.m.BELL;
            case 7:
                return w94.m.BLOCKS;
            case 8:
                return w94.m.BRIEFCASE;
            case 9:
                return w94.m.BUILDING;
            case 10:
                return w94.m.CHART;
            case 11:
                return w94.m.COLUMN;
            case 12:
                return w94.m.COMPUTER;
            case 13:
                return w94.m.FOLDER;
            case 14:
                return w94.m.GLASSES;
            case 15:
                return w94.m.GLOBE;
            case 16:
                return w94.m.GROUP;
            case 17:
                return w94.m.HAND_GESTURE;
            case 18:
                return w94.m.HOURGLASS;
            case 19:
                return w94.m.LANGUAGE;
            case 20:
                return w94.m.LEAF;
            case 21:
                return w94.m.MAGNET;
            case 22:
                return w94.m.MUSIC_NOTE;
            case 23:
                return w94.m.NOTEBOOK;
            case 24:
                return w94.m.PALETTE;
            case 25:
                return w94.m.PEN;
            case 26:
                return w94.m.POOL;
            case 27:
                return w94.m.PUZZLE;
            case 28:
                return w94.m.RULER;
            case 29:
                return w94.m.SCISSORS;
            case 30:
                return w94.m.SECURITY;
            case BERTags.DATE /* 31 */:
                return w94.m.SUPPORT;
            case 32:
                return w94.m.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final PreviousGrade g(BEPreviousGrade bEPreviousGrade) {
        return new PreviousGrade(bEPreviousGrade.getGrade(), bEPreviousGrade.getCreatedAt(), bEPreviousGrade.getDescriptive());
    }

    public static final SchoolGradesMessage h(BESchoolFamilyMessage bESchoolFamilyMessage) {
        return new SchoolGradesMessage(bESchoolFamilyMessage.getTitle(), bESchoolFamilyMessage.getMessage());
    }

    public static final SemesterDetails i(BESemesterDetails bESemesterDetails) {
        String id5 = bESemesterDetails.getId();
        String title = bESemesterDetails.getTitle();
        List<BESubjectEntry> listC = bESemesterDetails.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(l((BESubjectEntry) it.next()));
        }
        BESchoolFamilyMessage message = bESemesterDetails.getMessage();
        return new SemesterDetails(id5, title, arrayList, message != null ? h(message) : null);
    }

    public static final SemesterGrade j(BESemesterGrade bESemesterGrade) {
        return new SemesterGrade(bESemesterGrade.getCategory(), bESemesterGrade.getCreatedAt(), bESemesterGrade.getDescriptive(), bESemesterGrade.getGrade(), b(bESemesterGrade.getIcon()), bESemesterGrade.getNewGrade(), bESemesterGrade.getTeacher(), bESemesterGrade.getComment());
    }

    public static final SemesterPreview k(BESemesterPreview bESemesterPreview) {
        return new SemesterPreview(bESemesterPreview.getId(), bESemesterPreview.getTitle());
    }

    public static final Subject l(BESubjectEntry bESubjectEntry) {
        return new Subject(bESubjectEntry.getId(), bESubjectEntry.getTitle(), f(bESubjectEntry.getIconType()), bESubjectEntry.getNewGrades());
    }

    public static final SubjectGrades m(BESubjectGrades bESubjectGrades) {
        List<BEGradePreview> listA = bESubjectGrades.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(d((BEGradePreview) it.next()));
        }
        BESemesterGrade semesterGrade = bESubjectGrades.getSemesterGrade();
        return new SubjectGrades(arrayList, semesterGrade != null ? j(semesterGrade) : null);
    }
}
