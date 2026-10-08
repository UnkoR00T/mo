package pc4;

import j94.BehaviorSemesterDetails;
import j94.BehaviourGradeInfo;
import j94.FinalBehaviourGrade;
import j94.PartialBehaviourGrade;
import j94.SchoolBehaviorMessage;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import rn0.BEBehaviourFinalGrade;
import rn0.BEBehaviourGradeInfo;
import rn0.BEBehaviourPartialGrade;
import rn0.BEBehaviourSemesterDetails;
import rn0.BEBehaviourSemesters;
import rn0.BESchoolFamilyMessage;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrn0/m;", "Lj94/b;", "b", "(Lrn0/m;)Lj94/b;", "Lrn0/l;", "Lj94/a;", "a", "(Lrn0/l;)Lj94/a;", "Lrn0/a0;", "Lj94/h;", "h", "(Lrn0/a0;)Lj94/h;", "Lrn0/i;", "Lj94/c;", "c", "(Lrn0/i;)Lj94/c;", "Lrn0/g;", "Lj94/d;", "d", "(Lrn0/g;)Lj94/d;", "Lrn0/h;", "Lj94/e;", "e", "(Lrn0/h;)Lj94/e;", "Lrn0/k;", "Lj94/f;", "f", "(Lrn0/k;)Lj94/f;", "Lrn0/j;", "Lj94/g;", "g", "(Lrn0/j;)Lj94/g;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m7 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f155289b;

        static {
            int[] iArr = new int[rn0.h.values().length];
            try {
                iArr[rn0.h.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rn0.h.VERY_GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rn0.h.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rn0.h.SATISFACTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rn0.h.POOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rn0.h.UNSATISFACTORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rn0.h.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f155288a = iArr;
            int[] iArr2 = new int[rn0.j.values().length];
            try {
                iArr2[rn0.j.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[rn0.j.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[rn0.j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f155289b = iArr2;
        }
    }

    public static final BehaviorSemesterDetails a(BEBehaviourSemesterDetails bEBehaviourSemesterDetails) {
        String id5 = bEBehaviourSemesterDetails.getId();
        String title = bEBehaviourSemesterDetails.getTitle();
        BEBehaviourFinalGrade finalGrade = bEBehaviourSemesterDetails.getFinalGrade();
        FinalBehaviourGrade finalBehaviourGradeD = finalGrade != null ? d(finalGrade) : null;
        List<BEBehaviourPartialGrade> listD = bEBehaviourSemesterDetails.d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(f((BEBehaviourPartialGrade) it.next()));
        }
        BEBehaviourGradeInfo gradeInfo = bEBehaviourSemesterDetails.getGradeInfo();
        return new BehaviorSemesterDetails(id5, title, finalBehaviourGradeD, arrayList, gradeInfo != null ? c(gradeInfo) : null);
    }

    public static final j94.b b(BEBehaviourSemesters bEBehaviourSemesters) {
        List listN;
        BEBehaviourSemesterDetails currentSemester = bEBehaviourSemesters.getCurrentSemester();
        List<BEBehaviourSemesterDetails> listC = bEBehaviourSemesters.c();
        BESchoolFamilyMessage message = bEBehaviourSemesters.getMessage();
        if (message != null) {
            return new j94.b.EmptyState(h(message));
        }
        if (currentSemester == null) {
            return j94.b.C2363b.f100529a;
        }
        BehaviorSemesterDetails behaviorSemesterDetailsA = a(currentSemester);
        if (listC != null) {
            List<BEBehaviourSemesterDetails> list = listC;
            listN = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(a((BEBehaviourSemesterDetails) it.next()));
            }
        } else {
            listN = pq.v.n();
        }
        return new j94.b.Semesters(behaviorSemesterDetailsA, listN);
    }

    public static final BehaviourGradeInfo c(BEBehaviourGradeInfo bEBehaviourGradeInfo) {
        return new BehaviourGradeInfo(bEBehaviourGradeInfo.getTitle(), bEBehaviourGradeInfo.getMessage());
    }

    public static final FinalBehaviourGrade d(BEBehaviourFinalGrade bEBehaviourFinalGrade) {
        j94.e eVarE;
        OffsetDateTime date = bEBehaviourFinalGrade.getDate();
        String description = bEBehaviourFinalGrade.getDescription();
        String title = bEBehaviourFinalGrade.getTitle();
        boolean descriptive = bEBehaviourFinalGrade.getDescriptive();
        rn0.h iconType = bEBehaviourFinalGrade.getIconType();
        if (iconType == null || (eVarE = e(iconType)) == null) {
            eVarE = j94.e.UNKNOWN;
        }
        return new FinalBehaviourGrade(date, description, title, descriptive, eVarE);
    }

    public static final j94.e e(rn0.h hVar) {
        switch (a.f155288a[hVar.ordinal()]) {
            case 1:
                return j94.e.EXCELLENT;
            case 2:
                return j94.e.VERY_GOOD;
            case 3:
                return j94.e.GOOD;
            case 4:
                return j94.e.SATISFACTORY;
            case 5:
                return j94.e.POOR;
            case 6:
                return j94.e.UNSATISFACTORY;
            case 7:
                return j94.e.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final PartialBehaviourGrade f(BEBehaviourPartialGrade bEBehaviourPartialGrade) {
        return new PartialBehaviourGrade(bEBehaviourPartialGrade.getId(), g(bEBehaviourPartialGrade.getType()), bEBehaviourPartialGrade.getDate(), bEBehaviourPartialGrade.getAuthor(), bEBehaviourPartialGrade.getComment());
    }

    public static final j94.g g(rn0.j jVar) {
        int i15 = a.f155289b[jVar.ordinal()];
        if (i15 == 1) {
            return j94.g.POSITIVE;
        }
        if (i15 == 2) {
            return j94.g.NEGATIVE;
        }
        if (i15 == 3) {
            return j94.g.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final SchoolBehaviorMessage h(BESchoolFamilyMessage bESchoolFamilyMessage) {
        return new SchoolBehaviorMessage(bESchoolFamilyMessage.getTitle(), bESchoolFamilyMessage.getMessage());
    }
}
