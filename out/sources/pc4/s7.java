package pc4;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import rn0.BEGradeDetails;
import rn0.BEGradeIcon;
import rn0.BEGradePreview;
import rn0.BEPreviousGrade;
import rn0.BESchoolFamilyMessage;
import rn0.BESemesterDetails;
import rn0.BESemesterGrade;
import rn0.BESemesterPreview;
import rn0.BESemesters;
import rn0.BESubjectEntry;
import rn0.BESubjectGrades;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#J\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'J\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+J\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/J\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103J\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Lpc4/s7;", "", "<init>", "()V", "Lrn0/f0;", "Lw94/e;", "e", "(Lrn0/f0;)Lw94/e;", "Lrn0/c0;", "Lw94/h;", "h", "(Lrn0/c0;)Lw94/h;", "Lrn0/e0;", "Lw94/j;", "j", "(Lrn0/e0;)Lw94/j;", "Lrn0/a0;", "Lw94/g;", "g", "(Lrn0/a0;)Lw94/g;", "Lrn0/g0;", "Lw94/k;", "k", "(Lrn0/g0;)Lw94/k;", "Lrn0/i0;", "Lw94/m;", "m", "(Lrn0/i0;)Lw94/m;", "Lrn0/h0;", "Lw94/l;", "l", "(Lrn0/h0;)Lw94/l;", "Lrn0/r;", "Lw94/d;", "d", "(Lrn0/r;)Lw94/d;", "Lrn0/d0;", "Lw94/i;", "i", "(Lrn0/d0;)Lw94/i;", "Lrn0/p;", "Lw94/b;", "b", "(Lrn0/p;)Lw94/b;", "Lrn0/q;", "Lw94/c;", "c", "(Lrn0/q;)Lw94/c;", "Lrn0/o;", "Lw94/a;", "a", "(Lrn0/o;)Lw94/a;", "Lrn0/z;", "Lw94/f;", "f", "(Lrn0/z;)Lw94/f;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7 f156199a = new s7();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f156201b;

        static {
            int[] iArr = new int[rn0.i0.values().length];
            try {
                iArr[rn0.i0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rn0.i0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rn0.i0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rn0.i0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rn0.i0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rn0.i0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rn0.i0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rn0.i0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rn0.i0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[rn0.i0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[rn0.i0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[rn0.i0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[rn0.i0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[rn0.i0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[rn0.i0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[rn0.i0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[rn0.i0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[rn0.i0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[rn0.i0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[rn0.i0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[rn0.i0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[rn0.i0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[rn0.i0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[rn0.i0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[rn0.i0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[rn0.i0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[rn0.i0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[rn0.i0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[rn0.i0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[rn0.i0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[rn0.i0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[rn0.i0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f156200a = iArr;
            int[] iArr2 = new int[rn0.q.values().length];
            try {
                iArr2[rn0.q.POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[rn0.q.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[rn0.q.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[rn0.q.VALUES.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[rn0.q.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            f156201b = iArr2;
        }
    }

    private s7() {
    }

    public final GradeDetails a(BEGradeDetails bEGradeDetails) {
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
        return new GradeDetails(id5, grade, category, createdAt, teacher, gradeIconB, descriptive, comment, subjectName, previousGrade != null ? f(previousGrade) : null);
    }

    public final GradeIcon b(BEGradeIcon bEGradeIcon) {
        return new GradeIcon(c(bEGradeIcon.getType()), bEGradeIcon.getValue());
    }

    public final w94.c c(rn0.q qVar) {
        int i15 = a.f156201b[qVar.ordinal()];
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

    public final GradePreview d(BEGradePreview bEGradePreview) {
        return new GradePreview(bEGradePreview.getId(), bEGradePreview.getCategory(), bEGradePreview.getCreatedAt(), bEGradePreview.getGrade(), b(bEGradePreview.getIcon()), bEGradePreview.getNewGrade());
    }

    public final w94.e e(BESemesters bESemesters) {
        List listN;
        BESemesterDetails currentSemester = bESemesters.getCurrentSemester();
        List<BESemesterPreview> listC = bESemesters.c();
        BESchoolFamilyMessage message = bESemesters.getMessage();
        if (message != null) {
            return new w94.e.EmptyState(g(message));
        }
        if (currentSemester == null) {
            return w94.e.b.f211486a;
        }
        SemesterDetails semesterDetailsH = h(currentSemester);
        if (listC != null) {
            List<BESemesterPreview> list = listC;
            listN = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(f156199a.j((BESemesterPreview) it.next()));
            }
        } else {
            listN = pq.v.n();
        }
        return new w94.e.Semesters(semesterDetailsH, listN);
    }

    public final PreviousGrade f(BEPreviousGrade bEPreviousGrade) {
        return new PreviousGrade(bEPreviousGrade.getGrade(), bEPreviousGrade.getCreatedAt(), bEPreviousGrade.getDescriptive());
    }

    public final SchoolGradesMessage g(BESchoolFamilyMessage bESchoolFamilyMessage) {
        return new SchoolGradesMessage(bESchoolFamilyMessage.getTitle(), bESchoolFamilyMessage.getMessage());
    }

    public final SemesterDetails h(BESemesterDetails bESemesterDetails) {
        String id5 = bESemesterDetails.getId();
        String title = bESemesterDetails.getTitle();
        List<BESubjectEntry> listC = bESemesterDetails.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(f156199a.k((BESubjectEntry) it.next()));
        }
        BESchoolFamilyMessage message = bESemesterDetails.getMessage();
        return new SemesterDetails(id5, title, arrayList, message != null ? g(message) : null);
    }

    public final SemesterGrade i(BESemesterGrade bESemesterGrade) {
        return new SemesterGrade(bESemesterGrade.getCategory(), bESemesterGrade.getCreatedAt(), bESemesterGrade.getDescriptive(), bESemesterGrade.getGrade(), b(bESemesterGrade.getIcon()), bESemesterGrade.getNewGrade(), bESemesterGrade.getTeacher(), bESemesterGrade.getComment());
    }

    public final SemesterPreview j(BESemesterPreview bESemesterPreview) {
        return new SemesterPreview(bESemesterPreview.getId(), bESemesterPreview.getTitle());
    }

    public final Subject k(BESubjectEntry bESubjectEntry) {
        return new Subject(bESubjectEntry.getId(), bESubjectEntry.getTitle(), m(bESubjectEntry.getIconType()), bESubjectEntry.getNewGrades());
    }

    public final SubjectGrades l(BESubjectGrades bESubjectGrades) {
        List<BEGradePreview> listA = bESubjectGrades.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f156199a.d((BEGradePreview) it.next()));
        }
        BESemesterGrade semesterGrade = bESubjectGrades.getSemesterGrade();
        return new SubjectGrades(arrayList, semesterGrade != null ? i(semesterGrade) : null);
    }

    public final w94.m m(rn0.i0 i0Var) {
        switch (a.f156200a[i0Var.ordinal()]) {
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
}
