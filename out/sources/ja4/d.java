package ja4;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import er.q;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import ha4.SemesterSheetItemData;
import ha4.SubjectListData;
import ha4.e;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import w94.SchoolGradesMessage;
import w94.SemesterDetails;
import w94.SemesterPreview;
import w94.Subject;
import w94.m;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lja4/d;", "Lxw/f;", "Lja4/d$a;", "Lha4/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lha4/c$a;", "state", "params", "Lha4/e$a$a;", "q", "(Lha4/c$a;Lja4/d$a;)Lha4/e$a$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "h", "(Ler/a;)Li50/a;", "", "Lw94/k;", "subjects", "", "semesterId", "Lkotlin/Function3;", "onSubjectClicked", "Ln30/b;", "i", "(Ljava/util/List;Ljava/lang/String;Ler/q;)Ln30/b;", "Lw94/m;", "", "u", "(Lw94/m;)Ljava/lang/Integer;", "m", "(Lja4/d$a;)Lha4/e$a;", "a", "Lmx/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ja4.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R/\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, d2 = {"Lja4/d$a;", "", "Lha4/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onChangeSemester", "onDismissChangeSemester", "Lkotlin/Function1;", "", "onSemesterSelected", "Lkotlin/Function3;", "onSubjectClicked", "<init>", "(Lha4/c;Ler/a;Ler/a;Ler/a;Ler/l;Ler/q;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lha4/c;", "f", "()Lha4/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "Ler/q;", "()Ler/q;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ha4.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeSemester;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDismissChangeSemester;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSemesterSelected;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<String, String, String, i0> onSubjectClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ha4.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, q<? super String, ? super String, ? super String, i0> qVar) {
            this.state = cVar;
            this.onBack = aVar;
            this.onChangeSemester = aVar2;
            this.onDismissChangeSemester = aVar3;
            this.onSemesterSelected = lVar;
            this.onSubjectClicked = qVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onChangeSemester;
        }

        public final er.a<i0> c() {
            return this.onDismissChangeSemester;
        }

        public final l<String, i0> d() {
            return this.onSemesterSelected;
        }

        public final q<String, String, String, i0> e() {
            return this.onSubjectClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onChangeSemester, params.onChangeSemester) && t.c(this.onDismissChangeSemester, params.onDismissChangeSemester) && t.c(this.onSemesterSelected, params.onSemesterSelected) && t.c(this.onSubjectClicked, params.onSubjectClicked);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ha4.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onChangeSemester.hashCode()) * 31) + this.onDismissChangeSemester.hashCode()) * 31) + this.onSemesterSelected.hashCode()) * 31) + this.onSubjectClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onChangeSemester=" + this.onChangeSemester + ", onDismissChangeSemester=" + this.onDismissChangeSemester + ", onSemesterSelected=" + this.onSemesterSelected + ", onSubjectClicked=" + this.onSubjectClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101264a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.LANGUAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.RULER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.MAGNET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.COLUMN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.BACTERIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.ATOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m.BALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m.PALETTE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m.COMPUTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[m.MUSIC_NOTE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[m.BELL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[m.HOURGLASS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[m.PUZZLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[m.BLOCKS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[m.GLOBE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[m.BUILDING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[m.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[m.GLASSES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[m.SUPPORT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[m.LEAF.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[m.APPLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[m.HAND_GESTURE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[m.POOL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[m.BRIEFCASE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[m.BALANCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[m.SCISSORS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[m.SECURITY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[m.FOLDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[m.NOTEBOOK.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[m.CHART.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[m.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f101264a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f101265a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1536003150);
            if (p076m2.t.k()) {
                p076m2.t.o(-1536003150, i15, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.mapper.SubjectListMapper.buildSubjectListData.<anonymous>.<anonymous>.<anonymous> (SubjectListMapper.kt:151)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData h(er.a<i0> onBack) {
        return new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(s94.a.f179497e), null, null, false, null, 60, null), null, null, null, null, 60, null);
    }

    private final CardListData i(List<Subject> subjects, final String semesterId, final q<? super String, ? super String, ? super String, i0> onSubjectClicked) {
        n50.b title;
        List<Subject> list = subjects;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (final Subject subject : list) {
            String str = "subjectItem_" + subject.getId();
            Integer numU = u(subject.getIconType());
            LeadingSection leadingSection = numU != null ? new LeadingSection(false, null, new n50.i.Icon(numU.intValue(), null, c.f101265a, null, null, 26, null), 3, null) : null;
            boolean newGrades = subject.getNewGrades();
            if (newGrades) {
                title = new n50.b.StatusBadge(new r50.a.WithDot("subjectItem_" + subject.getId() + "_title", mx.b.b(subject.getTitle(), "subject_" + subject.getId()), null, 0, r50.f.INFORMATIVE, 12, null));
            } else {
                if (newGrades) {
                    throw new oq.p();
                }
                title = new n50.b.Title(new SingleCardLabel(mx.b.b(subject.getTitle(), "subject_" + subject.getId()), null, null, 0, 0, null, 62, null));
            }
            arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: ja4.a
                @Override // er.a
                public final Object a() {
                    return d.l(onSubjectClicked, subject, semesterId);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, null, 5, null), leadingSection, x0.Icon.INSTANCE.b(), null, 2300, null));
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(q qVar, Subject subject, String str) {
        qVar.w(subject.getId(), subject.getTitle(), str);
        return i0.f148189a;
    }

    private final e.a.DisplayingSubjectList q(ha4.c.DisplayingSubjectList state, final Params params) {
        EmptyStateData emptyStateData;
        SemesterDetails semesterDetailsD = state.getData().d();
        List<SemesterPreview> listC = state.getData().c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (!t.c(((SemesterPreview) obj).getId(), state.getData().getSelectedSemesterId())) {
                arrayList.add(obj);
            }
        }
        SubjectListData data = state.getData();
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldDataH = h(params.a());
        CardListData cardListDataI = i(semesterDetailsD.e(), state.getData().getSelectedSemesterId(), params.e());
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(s94.a.f179493a), null, this.labelProvider.c(s94.a.f179496d), params.b(), 5, null);
        if (arrayList.isEmpty()) {
            buttonTextData = null;
        }
        SchoolGradesMessage message = semesterDetailsD.getMessage();
        if (message != null) {
            String title = message.getTitle();
            emptyStateData = new EmptyStateData(title != null ? mx.b.b(title, "subjectList_emptyStateTitle") : null, mx.b.b(message.getMessage(), "subjectList_emptyStateBody"), null, 4, null);
        } else {
            emptyStateData = new EmptyStateData(null, this.labelProvider.c(s94.a.f179508p), null, 4, null);
        }
        if (!semesterDetailsD.e().isEmpty()) {
            emptyStateData = null;
        }
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(state.getIsBottomSheetVisible() ? g30.v.EXPANDED : g30.v.HIDDEN, false, new l() { // from class: ja4.b
            @Override // er.l
            public final Object b(Object obj2) {
                return d.r(params, (g30.v) obj2);
            }
        }, 2, null), null, params.c(), null, 10, null);
        List<SemesterPreview> listC2 = state.getData().c();
        ArrayList arrayList2 = new ArrayList(v.y(listC2, 10));
        for (final SemesterPreview semesterPreview : listC2) {
            arrayList2.add(new SemesterSheetItemData(semesterPreview.getId(), mx.b.b(semesterPreview.getTitle(), "semesterSheet_" + semesterPreview.getId()), new er.a() { // from class: ja4.c
                @Override // er.a
                public final Object a() {
                    return d.s(params, semesterPreview);
                }
            }));
        }
        return new e.a.DisplayingSubjectList(data, aVarA, baseScaffoldDataH, cardListDataI, buttonTextData, emptyStateData, modalBottomSheetData, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, g30.v vVar) {
        if (vVar == g30.v.HIDDEN) {
            params.c().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, SemesterPreview semesterPreview) {
        params.d().b(semesterPreview.getId());
        return i0.f148189a;
    }

    private final Integer u(m mVar) {
        switch (b.f101264a[mVar.ordinal()]) {
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
                throw new oq.p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        ha4.c state = params.getState();
        if (state instanceof ha4.c.f) {
            return e.a.d.f82632a;
        }
        if (state instanceof ha4.c.EmptyStateSubjectList) {
            BaseScaffoldData baseScaffoldDataH = h(params.a());
            ha4.c.EmptyStateSubjectList emptyStateSubjectList = (ha4.c.EmptyStateSubjectList) state;
            String title = emptyStateSubjectList.getMessage().getTitle();
            return new e.a.SubjectListEmptyState(baseScaffoldDataH, new EmptyStateData(title != null ? mx.b.b(title, "subjectList_emptyStateTitle") : null, mx.b.b(emptyStateSubjectList.getMessage().getMessage(), "subjectList_emptyStateBody"), null, 4, null));
        }
        if (state instanceof ha4.c.DisplayingSubjectList) {
            return q((ha4.c.DisplayingSubjectList) state, params);
        }
        if (state instanceof ha4.c.LoadingSemesterDetails) {
            return e.a.d.f82632a;
        }
        if (state instanceof ha4.c.ErrorLoadingInitialData) {
            return new e.a.ErrorLoadingInitialData(((ha4.c.ErrorLoadingInitialData) state).getErrorVMS());
        }
        if (!(state instanceof ha4.c.ErrorLoadingSemesterDetails)) {
            throw new oq.p();
        }
        ha4.c.ErrorLoadingSemesterDetails errorLoadingSemesterDetails = (ha4.c.ErrorLoadingSemesterDetails) state;
        return new e.a.ErrorLoadingSemesterDetails(errorLoadingSemesterDetails.getData(), errorLoadingSemesterDetails.getErrorVMS());
    }
}
