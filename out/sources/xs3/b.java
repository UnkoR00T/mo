package xs3;

import cj0.ZusEVisitDepartment;
import cj0.ZusEVisitHours;
import cj0.ZusEVisitPersonalData;
import cj0.ZusEVisitTerm;
import cj0.ZusEVisitTopic;
import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import java.time.LocalDate;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import r30.d;
import w30.CheckBoxSingleData;
import ws3.h;
import ws3.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxs3/b;", "Lxw/f;", "Lxs3/b$b;", "Lws3/i$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lws3/h$b;", "state", "Ln30/b;", "h", "(Lws3/h$b;)Ln30/b;", "i", "m", "l", "params", "e", "(Lxs3/b$b;)Lws3/i$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, i.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f220859d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: xs3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lxs3/b$b;", "", "Lws3/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBookVisit", "onMoreClick", "Lkotlin/Function1;", "", "onCheckBoxChange", "onResetScrollRequests", "<init>", "(Lws3/h;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lws3/h;", "e", "()Lws3/h;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBookVisit;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onCheckBoxChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResetScrollRequests;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super Boolean, i0> lVar, er.a<i0> aVar3) {
            this.state = hVar;
            this.onBookVisit = aVar;
            this.onMoreClick = aVar2;
            this.onCheckBoxChange = lVar;
            this.onResetScrollRequests = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBookVisit;
        }

        public final l<Boolean, i0> b() {
            return this.onCheckBoxChange;
        }

        public final er.a<i0> c() {
            return this.onMoreClick;
        }

        public final er.a<i0> d() {
            return this.onResetScrollRequests;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final h getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBookVisit, params.onBookVisit) && t.c(this.onMoreClick, params.onMoreClick) && t.c(this.onCheckBoxChange, params.onCheckBoxChange) && t.c(this.onResetScrollRequests, params.onResetScrollRequests);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBookVisit.hashCode()) * 31) + this.onMoreClick.hashCode()) * 31) + this.onCheckBoxChange.hashCode()) * 31) + this.onResetScrollRequests.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBookVisit=" + this.onBookVisit + ", onMoreClick=" + this.onMoreClick + ", onCheckBoxChange=" + this.onCheckBoxChange + ", onResetScrollRequests=" + this.onResetScrollRequests + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220867a;

        static {
            int[] iArr = new int[ss3.a.values().length];
            try {
                iArr[ss3.a.NEW_VISIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ss3.a.INITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ss3.a.REDO_VISIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f220867a = iArr;
        }
    }

    public b(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, boolean z15) {
        params.b().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    private final CardListData h(h.Initialized state) {
        List listN;
        b0 caregiverSurname;
        b0 caregiverName;
        b0 caregiverName2;
        ZusEVisitPersonalData personalData = state.getSummaryData().getPersonalData();
        String strE = null;
        String strE2 = (personalData == null || (caregiverName2 = personalData.getCaregiverName()) == null) ? null : c0.e(caregiverName2);
        if (strE2 == null || strE2.length() == 0) {
            listN = v.n();
        } else {
            SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ir3.a.f96817r), null, null, 0, 0, null, 62, null);
            ZusEVisitPersonalData personalData2 = state.getSummaryData().getPersonalData();
            DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d((personalData2 == null || (caregiverName = personalData2.getCaregiverName()) == null) ? null : c0.e(caregiverName), "caregiverNameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(ir3.a.f96835x), null, null, 0, 0, null, 62, null);
            ZusEVisitPersonalData personalData3 = state.getSummaryData().getPersonalData();
            if (personalData3 != null && (caregiverSurname = personalData3.getCaregiverSurname()) != null) {
                strE = c0.e(caregiverSurname);
            }
            listN = v.q(defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(strE, "caregiverLastnameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        return new CardListData(listN, null, false, null, null, 30, null);
    }

    private final CardListData i(h.Initialized state) {
        List listN;
        b0 translatorSurname;
        b0 translatorName;
        b0 translatorName2;
        ZusEVisitPersonalData personalData = state.getSummaryData().getPersonalData();
        String strE = null;
        String strE2 = (personalData == null || (translatorName2 = personalData.getTranslatorName()) == null) ? null : c0.e(translatorName2);
        if (strE2 == null || strE2.length() == 0) {
            listN = v.n();
        } else {
            SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ir3.a.f96817r), null, null, 0, 0, null, 62, null);
            ZusEVisitPersonalData personalData2 = state.getSummaryData().getPersonalData();
            DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d((personalData2 == null || (translatorName = personalData2.getTranslatorName()) == null) ? null : c0.e(translatorName), "translatorNameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(ir3.a.f96835x), null, null, 0, 0, null, 62, null);
            ZusEVisitPersonalData personalData3 = state.getSummaryData().getPersonalData();
            if (personalData3 != null && (translatorSurname = personalData3.getTranslatorSurname()) != null) {
                strE = c0.e(translatorSurname);
            }
            listN = v.q(defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(strE, "translatorLastnameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        return new CardListData(listN, null, false, null, null, 30, null);
    }

    private final CardListData l(h.Initialized state) {
        String name;
        List<ZusEVisitHours> listA;
        ZusEVisitHours zusEVisitHours;
        LocalDate visitDate;
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ir3.a.J1), null, null, 0, 0, null, 62, null);
        ZusEVisitTopic topic = state.getSummaryData().getTopic();
        String str = null;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(topic != null ? topic.getTitle() : null, "topicValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(ir3.a.f96790i), null, null, 0, 0, null, 62, null);
        ZusEVisitTerm term = state.getSummaryData().getTerm();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d((term == null || (visitDate = term.getVisitDate()) == null) ? null : this.dateFormatter.d(new fz.b.LocalDate(visitDate), fz.c.DOTTED), "dateValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel3 = new SingleCardLabel(this.labelProvider.c(ir3.a.f96823t), null, null, 0, 0, null, 62, null);
        int termHourIndex = state.getSummaryData().getTermHourIndex();
        ZusEVisitTerm term2 = state.getSummaryData().getTerm();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel3, new n50.b.Title(new SingleCardLabel(mx.b.d((term2 == null || (listA = term2.a()) == null || (zusEVisitHours = listA.get(termHourIndex)) == null) ? null : zusEVisitHours.getTimeFrom(), "timeValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel4 = new SingleCardLabel(this.labelProvider.c(ir3.a.f96831v1), null, null, 0, 0, null, 62, null);
        ZusEVisitDepartment department = state.getSummaryData().getDepartment();
        if (department != null) {
            int i15 = c.f220867a[state.getSummaryData().getNewVisitState().ordinal()];
            if (i15 == 1 || i15 == 2) {
                name = department.getName() + '\n' + department.getPostcode() + ' ' + department.getCity() + ", " + department.getStreet() + ' ' + department.getBuildingNumber();
            } else {
                if (i15 != 3) {
                    throw new p();
                }
                name = department.getName();
            }
            str = name;
        }
        return new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel4, new n50.b.Title(new SingleCardLabel(mx.b.d(str, "departmentValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    private final CardListData m(h.Initialized state) {
        b0 phoneNumber;
        b0 email;
        List listC = v.c();
        listC.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96817r), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getUserData().getFirstName(), "nameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        String strE = null;
        listC.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96835x), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getUserData().getSurname(), "lastnameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        ZusEVisitPersonalData personalData = state.getSummaryData().getPersonalData();
        if (personalData != null && personalData.getSharePesel()) {
            SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ir3.a.P), null, null, 0, 0, null, 62, null);
            b0 pesel = state.getSummaryData().getPersonalData().getPesel();
            listC.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(pesel != null ? c0.e(pesel) : null, "phoneValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(ir3.a.f96799l), null, null, 0, 0, null, 62, null);
        ZusEVisitPersonalData personalData2 = state.getSummaryData().getPersonalData();
        listC.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d((personalData2 == null || (email = personalData2.getEmail()) == null) ? null : c0.e(email), "emailValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        SingleCardLabel singleCardLabel3 = new SingleCardLabel(this.labelProvider.c(ir3.a.f96800l0), null, null, 0, 0, null, 62, null);
        ZusEVisitPersonalData personalData3 = state.getSummaryData().getPersonalData();
        if (personalData3 != null && (phoneNumber = personalData3.getPhoneNumber()) != null) {
            strE = c0.e(phoneNumber);
        }
        listC.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel3, new n50.b.Title(new SingleCardLabel(mx.b.d(strE, "phoneValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        return new CardListData(v.a(listC), null, false, null, null, 30, null);
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [fr.k, mx.a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i.a b(final Params params) {
        int i15;
        r30.b error;
        ?? r15;
        h state = params.getState();
        if (t.c(state, h.a.f214931a)) {
            return i.a.b.f214955a;
        }
        if (!(state instanceof h.Initialized)) {
            throw new p();
        }
        mx.c cVar = this.labelProvider;
        Label labelC = cVar.c(ir3.a.I1);
        Label labelC2 = cVar.c(ir3.a.f96834w1);
        h.Initialized initialized = (h.Initialized) state;
        CardListData cardListDataL = l(initialized);
        Label labelC3 = cVar.c(ir3.a.f96843z1);
        CardListData cardListDataM = m(initialized);
        Label labelC4 = cVar.c(ir3.a.H1);
        CardListData cardListDataH = h(initialized);
        Label labelC5 = cVar.c(ir3.a.f96837x1);
        CardListData cardListDataI = i(initialized);
        Label labelB = mx.b.b(initialized.getUserData().getFirstName(), "nameValue");
        Label labelB2 = mx.b.b(initialized.getUserData().getSurname(), "lastnameValue");
        Label labelC6 = cVar.c(ir3.a.G1);
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, initialized.getIsStatementAccepted(), new l() { // from class: xs3.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, ((Boolean) obj).booleanValue());
            }
        }, cVar.c(ir3.a.f96825t1), null, null, new d.Button(new ButtonTextData(null, cVar.c(ir3.a.f96840y1), null, null, params.c(), 13, null)), null, 177, null);
        boolean z15 = initialized.getIsAcceptStatementError() && initialized.getShowValidation();
        if (z15) {
            i15 = 1;
            if (!z15) {
                throw new p();
            }
            r15 = 0;
            error = new r30.b.Error(null, cVar.c(ir3.a.E), 1, null);
        } else {
            error = r30.b.a.f171263a;
            i15 = 1;
            r15 = 0;
        }
        return new i.a.DisplayedScreenData(labelC, labelC2, cardListDataL, labelC3, cardListDataM, labelC4, cardListDataH, labelC5, cardListDataI, labelB, labelB2, labelC6, new CheckBoxSingleData(checkBoxRowData, error, null, false, null, 28, null), initialized.getShouldScrollToStatementSection(), new ButtonData(null, null, new k30.a.Large(false, i15, r15), new k30.c.WithText(cVar.c(ir3.a.f96828u1), r15, 2, r15), k30.d.a.f107773a, null, params.a(), 35, null), params.d());
    }
}
