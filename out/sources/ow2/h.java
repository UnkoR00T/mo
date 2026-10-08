package ow2;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mw2.j;
import mw2.k;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006#"}, d2 = {"Low2/h;", "Lxw/f;", "Low2/h$a;", "Lmw2/k$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lez/e;Lu04/a;)V", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "Lkotlin/Function0;", "onCloseAlertButtonClick", "Lc30/b$e;", "c", "(Ler/l;Ler/a;)Lc30/b$e;", "Lmw2/j$a;", "state", "Ln30/b;", "f", "(Lmw2/j$a;)Ln30/b;", "h", "params", "e", "(Low2/h$a;)Lmw2/k$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lu04/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: ow2.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0018\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Low2/h$a;", "", "Lmw2/j;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "Lkotlin/Function0;", "onCloseAlertButtonClick", "onNextButtonClick", "onBack", "onClose", "<init>", "(Lmw2/j;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmw2/j;", "f", "()Lmw2/j;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAlertButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j jVar, l<? super String, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = jVar;
            this.onUrlClick = lVar;
            this.onCloseAlertButtonClick = aVar;
            this.onNextButtonClick = aVar2;
            this.onBack = aVar3;
            this.onClose = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onCloseAlertButtonClick;
        }

        public final er.a<i0> d() {
            return this.onNextButtonClick;
        }

        public final l<String, i0> e() {
            return this.onUrlClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onCloseAlertButtonClick, params.onCloseAlertButtonClick) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final j getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onUrlClick.hashCode()) * 31) + this.onCloseAlertButtonClick.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUrlClick=" + this.onUrlClick + ", onCloseAlertButtonClick=" + this.onCloseAlertButtonClick + ", onNextButtonClick=" + this.onNextButtonClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public h(mx.c cVar, ez.e eVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.commonEndpoints = aVar;
    }

    private final c30.b.e c(l<? super String, i0> onUrlClick, er.a<i0> onCloseAlertButtonClick) {
        return new c30.b.e(null, null, null, this.labelProvider.c(gv2.a.f77323w0), onCloseAlertButtonClick, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(gv2.a.f77327x0), this.commonEndpoints.Z(), LinkData.EnumC5775a.WEBSITE, false, onUrlClick, 17, null)), 39, null);
    }

    private final CardListData f(j.Initialized state) {
        DefaultSingleCardData defaultSingleCardData;
        int i15;
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.F), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getFirstName(), "firstNameTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77226a0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getApplicantDataModel().getSecondName(), "secondNameTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.L), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getSurname(), "surnameTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77318v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getFamilyName(), "familyNameTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.T), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(zv2.a.a(state.getApplicantDataModel().getPesel(), "peselTitle"), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3839, null);
        mw2.l applicantDataRequester = state.getApplicantDataRequester();
        if (!(applicantDataRequester instanceof mw2.l.Child)) {
            applicantDataRequester = null;
        }
        if (applicantDataRequester != null) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77225a), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(String.valueOf(state.getAge()), "ageTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData = null;
        }
        mx.c cVar = this.labelProvider;
        String strName = state.getApplicantDataModel().getGender().name();
        if (t.c(strName, "MALE")) {
            i15 = gv2.a.M;
        } else {
            i15 = t.c(strName, "FEMALE") ? gv2.a.f77326x : gv2.a.f77279l0;
        }
        return new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.G), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(cVar.c(i15), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77245e), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getPlaceOfBirth(), "placeOfBirthTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77240d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(state.getApplicantDataModel().getDateOfBirth()), fz.c.DOTTED), "dateOfBirthFormattedTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77278l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getNationality(), "nationalityTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    private final CardListData h(j.Initialized state) {
        return new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77322w), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getFathersName(), "fathersNameTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.O), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getMothersName(), "mothersNameTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.N), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getApplicantDataModel().getMothersMaidenName(), "mothersMaidenNameTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k.a b(Params params) {
        int i15;
        int i16;
        int i17;
        j state = params.getState();
        if (state instanceof j.Loading) {
            return k.a.C3195a.f128839a;
        }
        if (!(state instanceof j.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gv2.a.f77331y0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        mw2.l applicantDataRequester = ((j.Initialized) params.getState()).getApplicantDataRequester();
        if (applicantDataRequester instanceof mw2.l.Child) {
            i15 = gv2.a.f77265i;
        } else {
            if (!(applicantDataRequester instanceof mw2.l.b)) {
                throw new p();
            }
            i15 = gv2.a.f77335z0;
        }
        Label labelC = cVar.c(i15);
        mx.c cVar2 = this.labelProvider;
        mw2.l applicantDataRequester2 = ((j.Initialized) params.getState()).getApplicantDataRequester();
        if (applicantDataRequester2 instanceof mw2.l.Child) {
            i16 = gv2.a.f77270j;
        } else {
            if (!(applicantDataRequester2 instanceof mw2.l.b)) {
                throw new p();
            }
            i16 = gv2.a.f77291o0;
        }
        Label labelC2 = cVar2.c(i16);
        boolean isAlertVisible = ((j.Initialized) params.getState()).getIsAlertVisible();
        Boolean boolValueOf = Boolean.valueOf(isAlertVisible);
        if (!isAlertVisible) {
            boolValueOf = null;
        }
        c30.b.e eVarC = boolValueOf != null ? c(params.e(), params.c()) : null;
        CardListData cardListDataF = f((j.Initialized) params.getState());
        mx.c cVar3 = this.labelProvider;
        mw2.l applicantDataRequester3 = ((j.Initialized) params.getState()).getApplicantDataRequester();
        if (applicantDataRequester3 instanceof mw2.l.Child) {
            i17 = gv2.a.B0;
        } else {
            if (!(applicantDataRequester3 instanceof mw2.l.b)) {
                throw new p();
            }
            i17 = gv2.a.S;
        }
        return new k.a.Initialized(baseScaffoldData, labelC, eVarC, labelC2, cardListDataF, cVar3.c(i17), h((j.Initialized) params.getState()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.P), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
