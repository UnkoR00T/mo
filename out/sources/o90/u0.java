package o90;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oa4.LessonDetails;
import oa4.LessonInfo;
import oa4.SchoolTimetableMessage;
import oa4.TimetableDay;
import oa4.TimetableSlot;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import u80.BELessonDetails;
import u80.BELessonInfo;
import u80.BESchoolFamilyMessage;
import u80.BETimetableDay;
import u80.BETimetableSlot;
import u80.BETimetableWeek;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#J\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'J\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+J\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lo90/u0;", "", "<init>", "()V", "Lu80/l0;", "Loa4/k;", "k", "(Lu80/l0;)Loa4/k;", "Lu80/h0;", "Loa4/f;", "f", "(Lu80/h0;)Loa4/f;", "Lu80/w;", "Loa4/e;", "e", "(Lu80/w;)Loa4/e;", "Lu80/i0;", "Loa4/g;", "g", "(Lu80/i0;)Loa4/g;", "Lu80/r;", "Loa4/b;", "b", "(Lu80/r;)Loa4/b;", "Lu80/g0;", "Loa4/a;", "a", "(Lu80/g0;)Loa4/a;", "Lu80/s;", "Loa4/c;", "c", "(Lu80/s;)Loa4/c;", "Lu80/t;", "Loa4/d;", "d", "(Lu80/t;)Loa4/d;", "Lu80/k0;", "Loa4/j;", "j", "(Lu80/k0;)Loa4/j;", "Lu80/j0;", "Loa4/i;", "i", "(Lu80/j0;)Loa4/i;", "Lu80/e0;", "Loa4/h;", "h", "(Lu80/e0;)Loa4/h;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f143492a = new u0();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f143494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f143495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f143496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f143497e;

        static {
            int[] iArr = new int[u80.g0.values().length];
            try {
                iArr[u80.g0.PRESENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u80.g0.ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u80.g0.FUTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u80.g0.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u80.g0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f143493a = iArr;
            int[] iArr2 = new int[u80.t.values().length];
            try {
                iArr2[u80.t.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[u80.t.ATTENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[u80.t.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f143494b = iArr2;
            int[] iArr3 = new int[u80.k0.values().length];
            try {
                iArr3[u80.k0.LESSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[u80.k0.FREE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[u80.k0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f143495c = iArr3;
            int[] iArr4 = new int[u80.j0.values().length];
            try {
                iArr4[u80.j0.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[u80.j0.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[u80.j0.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[u80.j0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            f143496d = iArr4;
            int[] iArr5 = new int[u80.e0.values().length];
            try {
                iArr5[u80.e0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[u80.e0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[u80.e0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[u80.e0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[u80.e0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[u80.e0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[u80.e0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[u80.e0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[u80.e0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[u80.e0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[u80.e0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[u80.e0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[u80.e0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[u80.e0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[u80.e0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[u80.e0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[u80.e0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[u80.e0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[u80.e0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[u80.e0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[u80.e0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[u80.e0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[u80.e0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[u80.e0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[u80.e0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[u80.e0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[u80.e0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[u80.e0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[u80.e0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[u80.e0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr5[u80.e0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr5[u80.e0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused47) {
            }
            f143497e = iArr5;
        }
    }

    private u0() {
    }

    public final oa4.a a(u80.g0 g0Var) {
        int i15 = a.f143493a[g0Var.ordinal()];
        if (i15 == 1) {
            return oa4.a.PRESENCE;
        }
        if (i15 == 2) {
            return oa4.a.ABSENCE;
        }
        if (i15 == 3) {
            return oa4.a.FUTURE;
        }
        if (i15 == 4) {
            return oa4.a.CANCELLED;
        }
        if (i15 == 5) {
            return oa4.a.UNKNOWN;
        }
        throw new oq.p();
    }

    public final LessonDetails b(BELessonDetails bELessonDetails) {
        String title = bELessonDetails.getTitle();
        int number = bELessonDetails.getNumber();
        String attendanceDescription = bELessonDetails.getAttendanceDescription();
        oa4.a aVarA = a(bELessonDetails.getAttendanceStatus());
        LocalDate date = bELessonDetails.getDate();
        String duration = bELessonDetails.getDuration();
        String teacher = bELessonDetails.getTeacher();
        String classNumber = bELessonDetails.getClassNumber();
        String topic = bELessonDetails.getTopic();
        BELessonInfo info = bELessonDetails.getInfo();
        return new LessonDetails(title, number, attendanceDescription, aVarA, date, duration, teacher, classNumber, topic, info != null ? c(info) : null, bELessonDetails.getPreviousTeacher());
    }

    public final LessonInfo c(BELessonInfo bELessonInfo) {
        return new LessonInfo(bELessonInfo.getDescription(), bELessonInfo.getTitle(), d(bELessonInfo.getType()));
    }

    public final oa4.d d(u80.t tVar) {
        int i15 = a.f143494b[tVar.ordinal()];
        if (i15 == 1) {
            return oa4.d.INFO;
        }
        if (i15 == 2) {
            return oa4.d.ATTENTION;
        }
        if (i15 == 3) {
            return oa4.d.UNKNOWN;
        }
        throw new oq.p();
    }

    public final SchoolTimetableMessage e(BESchoolFamilyMessage bESchoolFamilyMessage) {
        return new SchoolTimetableMessage(bESchoolFamilyMessage.getTitle(), bESchoolFamilyMessage.getMessage());
    }

    public final TimetableDay f(BETimetableDay bETimetableDay) {
        LocalDate date = bETimetableDay.getDate();
        int numberOfLessons = bETimetableDay.getNumberOfLessons();
        List<BETimetableSlot> listC = bETimetableDay.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(f143492a.g((BETimetableSlot) it.next()));
        }
        return new TimetableDay(date, numberOfLessons, arrayList);
    }

    public final TimetableSlot g(BETimetableSlot bETimetableSlot) {
        return new TimetableSlot(bETimetableSlot.getFromTime(), bETimetableSlot.getToTime(), bETimetableSlot.getNumber(), bETimetableSlot.getTitle(), j(bETimetableSlot.getType()), i(bETimetableSlot.getState()), h(bETimetableSlot.getIconType()), bETimetableSlot.getClassNumber(), bETimetableSlot.getLessonId());
    }

    public final oa4.h h(u80.e0 e0Var) {
        switch (a.f143497e[e0Var.ordinal()]) {
            case 1:
                return oa4.h.APPLE;
            case 2:
                return oa4.h.ATOM;
            case 3:
                return oa4.h.BACTERIA;
            case 4:
                return oa4.h.BALANCE;
            case 5:
                return oa4.h.BALL;
            case 6:
                return oa4.h.BELL;
            case 7:
                return oa4.h.BLOCKS;
            case 8:
                return oa4.h.BRIEFCASE;
            case 9:
                return oa4.h.BUILDING;
            case 10:
                return oa4.h.CHART;
            case 11:
                return oa4.h.COLUMN;
            case 12:
                return oa4.h.COMPUTER;
            case 13:
                return oa4.h.FOLDER;
            case 14:
                return oa4.h.GLASSES;
            case 15:
                return oa4.h.GLOBE;
            case 16:
                return oa4.h.GROUP;
            case 17:
                return oa4.h.HAND_GESTURE;
            case 18:
                return oa4.h.HOURGLASS;
            case 19:
                return oa4.h.LANGUAGE;
            case 20:
                return oa4.h.LEAF;
            case 21:
                return oa4.h.MAGNET;
            case 22:
                return oa4.h.MUSIC_NOTE;
            case 23:
                return oa4.h.NOTEBOOK;
            case 24:
                return oa4.h.PALETTE;
            case 25:
                return oa4.h.PEN;
            case 26:
                return oa4.h.POOL;
            case 27:
                return oa4.h.PUZZLE;
            case 28:
                return oa4.h.RULER;
            case 29:
                return oa4.h.SCISSORS;
            case 30:
                return oa4.h.SECURITY;
            case BERTags.DATE /* 31 */:
                return oa4.h.SUPPORT;
            case 32:
                return oa4.h.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public final oa4.i i(u80.j0 j0Var) {
        int i15 = a.f143496d[j0Var.ordinal()];
        if (i15 == 1) {
            return oa4.i.CURRENT;
        }
        if (i15 == 2) {
            return oa4.i.UPDATED;
        }
        if (i15 == 3) {
            return oa4.i.CANCELLED;
        }
        if (i15 == 4) {
            return oa4.i.UNKNOWN;
        }
        throw new oq.p();
    }

    public final oa4.j j(u80.k0 k0Var) {
        int i15 = a.f143495c[k0Var.ordinal()];
        if (i15 == 1) {
            return oa4.j.LESSON;
        }
        if (i15 == 2) {
            return oa4.j.FREE_TIME;
        }
        if (i15 == 3) {
            return oa4.j.UNKNOWN;
        }
        throw new oq.p();
    }

    public final oa4.k k(BETimetableWeek bETimetableWeek) {
        List<BETimetableDay> listA = bETimetableWeek.a();
        BESchoolFamilyMessage message = bETimetableWeek.getMessage();
        if (message != null) {
            return new oa4.k.EmptyState(e(message));
        }
        if (listA == null) {
            return oa4.k.b.f144145a;
        }
        List<BETimetableDay> list = listA;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f143492a.f((BETimetableDay) it.next()));
        }
        return new oa4.k.Timetable(arrayList, bETimetableWeek.getMinSelectionDate(), bETimetableWeek.getMaxSelectionDate());
    }
}
