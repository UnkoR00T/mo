package pc4;

import f43.ChildStudent;
import f43.GradeIcon;
import f43.LatestAbsence;
import f43.LatestGrade;
import f43.NextLesson;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import rn0.BEChildStudent;
import rn0.BEGradeIcon;
import rn0.BELatestAbsence;
import rn0.BELatestGrade;
import rn0.BENextLesson;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrn0/n;", "Lf43/a;", "a", "(Lrn0/n;)Lf43/a;", "Lrn0/t;", "Lf43/f;", "e", "(Lrn0/t;)Lf43/f;", "Lrn0/s;", "Lf43/d;", "d", "(Lrn0/s;)Lf43/d;", "Lrn0/b;", "Lf43/e;", "h", "(Lrn0/b;)Lf43/e;", "Lrn0/x;", "Lf43/g;", "f", "(Lrn0/x;)Lf43/g;", "Lrn0/p;", "Lf43/b;", "b", "(Lrn0/p;)Lf43/b;", "Lrn0/q;", "Lf43/c;", "c", "(Lrn0/q;)Lf43/c;", "Lrn0/i0;", "Lf43/h;", "g", "(Lrn0/i0;)Lf43/h;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p7 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f155473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f155474c;

        static {
            int[] iArr = new int[rn0.b.values().length];
            try {
                iArr[rn0.b.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rn0.b.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rn0.b.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rn0.b.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rn0.b.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rn0.b.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f155472a = iArr;
            int[] iArr2 = new int[rn0.q.values().length];
            try {
                iArr2[rn0.q.POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[rn0.q.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[rn0.q.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[rn0.q.VALUES.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[rn0.q.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f155473b = iArr2;
            int[] iArr3 = new int[rn0.i0.values().length];
            try {
                iArr3[rn0.i0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[rn0.i0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[rn0.i0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[rn0.i0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[rn0.i0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[rn0.i0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[rn0.i0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[rn0.i0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[rn0.i0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[rn0.i0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[rn0.i0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[rn0.i0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[rn0.i0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[rn0.i0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[rn0.i0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[rn0.i0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[rn0.i0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[rn0.i0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[rn0.i0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[rn0.i0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[rn0.i0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[rn0.i0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[rn0.i0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[rn0.i0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[rn0.i0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[rn0.i0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[rn0.i0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[rn0.i0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[rn0.i0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[rn0.i0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[rn0.i0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[rn0.i0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused43) {
            }
            f155474c = iArr3;
        }
    }

    public static final ChildStudent a(BEChildStudent bEChildStudent) {
        String id5 = bEChildStudent.getId();
        String name = bEChildStudent.getName();
        String schoolName = bEChildStudent.getSchoolName();
        String schoolClass = bEChildStudent.getSchoolClass();
        String picture = bEChildStudent.getPicture();
        BELatestGrade latestGrade = bEChildStudent.getLatestGrade();
        LatestGrade latestGradeE = latestGrade != null ? e(latestGrade) : null;
        BELatestAbsence latestAbsence = bEChildStudent.getLatestAbsence();
        LatestAbsence latestAbsenceD = latestAbsence != null ? d(latestAbsence) : null;
        BENextLesson nextLesson = bEChildStudent.getNextLesson();
        return new ChildStudent(id5, name, schoolName, schoolClass, picture, latestGradeE, latestAbsenceD, nextLesson != null ? f(nextLesson) : null);
    }

    public static final GradeIcon b(BEGradeIcon bEGradeIcon) {
        return new GradeIcon(c(bEGradeIcon.getType()), bEGradeIcon.getValue());
    }

    public static final f43.c c(rn0.q qVar) {
        int i15 = a.f155473b[qVar.ordinal()];
        if (i15 == 1) {
            return f43.c.POINTS;
        }
        if (i15 == 2) {
            return f43.c.TEXT;
        }
        if (i15 == 3) {
            return f43.c.PERCENTAGE;
        }
        if (i15 == 4) {
            return f43.c.VALUES;
        }
        if (i15 == 5) {
            return f43.c.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final LatestAbsence d(BELatestAbsence bELatestAbsence) {
        return new LatestAbsence(bELatestAbsence.getTitle(), bELatestAbsence.getSubject(), bELatestAbsence.getFromTime(), bELatestAbsence.getToTime(), bELatestAbsence.getSemesterId(), h(bELatestAbsence.getAttendanceStatus()));
    }

    public static final LatestGrade e(BELatestGrade bELatestGrade) {
        return new LatestGrade(bELatestGrade.getId(), bELatestGrade.getGrade(), bELatestGrade.getSubject(), bELatestGrade.getCreatedAt(), b(bELatestGrade.getIcon()));
    }

    public static final NextLesson f(BENextLesson bENextLesson) {
        return new NextLesson(bENextLesson.getLessonId(), bENextLesson.getTitle(), bENextLesson.getDescription(), g(bENextLesson.getIconType()), bENextLesson.getFromTime(), bENextLesson.getToTime());
    }

    public static final f43.h g(rn0.i0 i0Var) {
        switch (a.f155474c[i0Var.ordinal()]) {
            case 1:
                return f43.h.APPLE;
            case 2:
                return f43.h.ATOM;
            case 3:
                return f43.h.BACTERIA;
            case 4:
                return f43.h.BALANCE;
            case 5:
                return f43.h.BALL;
            case 6:
                return f43.h.BELL;
            case 7:
                return f43.h.BLOCKS;
            case 8:
                return f43.h.BRIEFCASE;
            case 9:
                return f43.h.BUILDING;
            case 10:
                return f43.h.CHART;
            case 11:
                return f43.h.COLUMN;
            case 12:
                return f43.h.COMPUTER;
            case 13:
                return f43.h.FOLDER;
            case 14:
                return f43.h.GLASSES;
            case 15:
                return f43.h.GLOBE;
            case 16:
                return f43.h.GROUP;
            case 17:
                return f43.h.HAND_GESTURE;
            case 18:
                return f43.h.HOURGLASS;
            case 19:
                return f43.h.LANGUAGE;
            case 20:
                return f43.h.LEAF;
            case 21:
                return f43.h.MAGNET;
            case 22:
                return f43.h.MUSIC_NOTE;
            case 23:
                return f43.h.NOTEBOOK;
            case 24:
                return f43.h.PALETTE;
            case 25:
                return f43.h.PEN;
            case 26:
                return f43.h.POOL;
            case 27:
                return f43.h.PUZZLE;
            case 28:
                return f43.h.RULER;
            case 29:
                return f43.h.SCISSORS;
            case 30:
                return f43.h.SECURITY;
            case BERTags.DATE /* 31 */:
                return f43.h.SUPPORT;
            case 32:
                return f43.h.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final f43.e h(rn0.b bVar) {
        switch (a.f155472a[bVar.ordinal()]) {
            case 1:
                return f43.e.ABSENCE;
            case 2:
                return f43.e.SCHOOL_REASONS_ABSENCE;
            case 3:
                return f43.e.LATENESS;
            case 4:
                return f43.e.EXCUSE;
            case 5:
                return f43.e.JUSTIFICATION;
            case 6:
                return f43.e.UNKNOWN;
            default:
                throw new oq.p();
        }
    }
}
