package b94;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import pq.v;
import s84.SemesterAttendanceSummary;
import s84.SubjectPresenceSummary;
import s84.l;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import z84.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb94/a;", "Lxw/f;", "Lb94/a$a;", "Lz84/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lz84/b$a;", "state", "params", "Lz84/c$a$a;", "e", "(Lz84/b$a;Lb94/a$a;)Lz84/c$a$a;", "Ls84/l;", "", "f", "(Ls84/l;)Ljava/lang/Integer;", "c", "(Lb94/a$a;)Lz84/c$a;", "a", "Lmx/c;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b94.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb94/a$a;", "", "Lz84/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lz84/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz84/b;", "b", "()Lz84/b;", "Ler/a;", "()Ler/a;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z84.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(z84.b bVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final z84.b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17719a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.PEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.LANGUAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.RULER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.MAGNET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.COLUMN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.BACTERIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.ATOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[l.BALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[l.PALETTE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[l.COMPUTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[l.MUSIC_NOTE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[l.BELL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[l.HOURGLASS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[l.PUZZLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[l.BLOCKS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[l.GLOBE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[l.BUILDING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[l.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[l.GLASSES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[l.SUPPORT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[l.LEAF.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[l.APPLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[l.HAND_GESTURE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[l.POOL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[l.BRIEFCASE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[l.BALANCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[l.SCISSORS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[l.SECURITY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[l.FOLDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[l.NOTEBOOK.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[l.CHART.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[l.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f17719a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final c.a.Displaying e(z84.b.Displaying state, Params params) {
        DefaultSingleCardData defaultSingleCardData;
        List<SemesterAttendanceSummary> listA;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(o84.a.f143356n), null, null, false, null, 60, null), null, null, null, null, 60, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(mx.b.b(state.getSelectedSemester().getPresenceSummary().getTitle(), "SemesterAttendancePercentage_label"), null, null, 0, 0, null, 62, null);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(state.getSelectedSemester().getPresenceSummary().getSemesterAttendancePercentage());
        sb5.append('%');
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(sb5.toString(), "SemesterAttendancePercentage_value"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        s84.f.AttendanceSemesters attendanceSummary = state.getAttendanceSummary();
        if (attendanceSummary == null || (listA = attendanceSummary.a()) == null || listA.size() <= 1) {
            defaultSingleCardData = null;
        } else {
            SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(o84.a.f143355m), null, null, 0, 0, null, 62, null);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(state.getSelectedSemester().getPresenceSummary().getSchoolYearAttendancePercentage());
            sb6.append('%');
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.b(sb6.toString(), "schoolYearAttendancePercentage_value"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        }
        CardListData cardListData = new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData), null, false, null, null, 30, null);
        Label labelE = this.labelProvider.e(o84.a.f143346d, state.getSelectedSemester().getTitle());
        List<SubjectPresenceSummary> listC = state.getSelectedSemester().getPresenceSummary().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        for (SubjectPresenceSummary subjectPresenceSummary : listC) {
            SingleCardLabel singleCardLabel3 = new SingleCardLabel(mx.b.b(subjectPresenceSummary.getSubjectName(), "subjectName_" + subjectPresenceSummary.getSubjectName() + "_Tag"), null, null, 0, 0, null, 62, null);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(subjectPresenceSummary.getAttendancePercentage());
            sb7.append('%');
            BodySection bodySection = new BodySection(singleCardLabel3, new n50.b.Title(new SingleCardLabel(mx.b.b(sb7.toString(), "_subjectValue_" + subjectPresenceSummary.getAttendancePercentage() + "_Tag"), null, null, 0, 0, null, 62, null)), null, 4, null);
            Integer numF = f(subjectPresenceSummary.getSubjectIcon());
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, numF != null ? new LeadingSection(false, null, new n50.i.Icon(numF.intValue(), null, null, null, null, 30, null), 3, null) : null, null, null, 3327, null));
        }
        return new c.a.Displaying(baseScaffoldData, cardListData, labelE, new CardListData(arrayList, null, false, null, null, 30, null));
    }

    private final Integer f(l lVar) {
        switch (b.f17719a[lVar.ordinal()]) {
            case 1:
                return Integer.valueOf(jz.a.C5);
            case 2:
                return Integer.valueOf(jz.a.D5);
            case 3:
                return Integer.valueOf(jz.a.E5);
            case 4:
                return Integer.valueOf(jz.a.F5);
            case 5:
                return Integer.valueOf(jz.a.G5);
            case 6:
                return Integer.valueOf(jz.a.H5);
            case 7:
                return Integer.valueOf(jz.a.I5);
            case 8:
                return Integer.valueOf(jz.a.J5);
            case 9:
                return Integer.valueOf(jz.a.K5);
            case 10:
                return Integer.valueOf(jz.a.L5);
            case 11:
                return Integer.valueOf(jz.a.M5);
            case 12:
                return Integer.valueOf(jz.a.N5);
            case 13:
                return Integer.valueOf(jz.a.O5);
            case 14:
                return Integer.valueOf(jz.a.P5);
            case 15:
                return Integer.valueOf(jz.a.Q5);
            case 16:
                return Integer.valueOf(jz.a.R5);
            case 17:
                return Integer.valueOf(jz.a.S5);
            case 18:
                return Integer.valueOf(jz.a.T5);
            case 19:
                return Integer.valueOf(jz.a.U5);
            case 20:
                return Integer.valueOf(jz.a.V5);
            case 21:
                return Integer.valueOf(jz.a.W5);
            case 22:
                return Integer.valueOf(jz.a.X5);
            case 23:
                return Integer.valueOf(jz.a.Y5);
            case 24:
                return Integer.valueOf(jz.a.Z5);
            case 25:
                return Integer.valueOf(jz.a.f106734a6);
            case 26:
                return Integer.valueOf(jz.a.f106742b6);
            case 27:
                return Integer.valueOf(jz.a.f106750c6);
            case 28:
                return Integer.valueOf(jz.a.f106758d6);
            case 29:
                return Integer.valueOf(jz.a.f106766e6);
            case 30:
                return Integer.valueOf(jz.a.f106774f6);
            case BERTags.DATE /* 31 */:
                return Integer.valueOf(jz.a.f106782g6);
            case 32:
                return null;
            default:
                throw new p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        z84.b state = params.getState();
        if (state instanceof z84.b.c) {
            return c.a.C6284c.f233393a;
        }
        if (state instanceof z84.b.Displaying) {
            return e((z84.b.Displaying) state, params);
        }
        if (state instanceof z84.b.Error) {
            return new c.a.Error(((z84.b.Error) state).getErrorVMS());
        }
        throw new p();
    }
}
