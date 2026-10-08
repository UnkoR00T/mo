package dz1;

import androidx.compose.ui.graphics.Color;
import az1.ElectoralPersonalModel;
import az1.State;
import az1.v;
import b30.AccordionData;
import b30.AccordionElement;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yi0.Citizen;
import yi0.CitizenAddress;
import yi0.District;
import yi0.RegisteredArea;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002%#B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ldz1/a;", "Lxw/f;", "Ldz1/a$b;", "Laz1/v$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Ldz/c;", "postCodeFormatter", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lez/c;Ldz/c;Lu04/a;)V", "", "Lyi0/d;", "districts", "Ln30/b;", "f", "(Ljava/util/List;)Ln30/b;", "Lyi0/a;", "e", "(Lyi0/a;)Ln30/b;", "Lyi0/f;", "registeredArea", "", "electionsAreaNumber", "citizen", "c", "(Lyi0/f;Ljava/lang/String;Lyi0/a;)Ln30/b;", "h", "(Lyi0/f;Ljava/lang/String;)Ln30/b;", "params", "i", "(Ldz1/a$b;)Laz1/v$a;", "a", "Lmx/c;", "b", "Lez/c;", "Ldz/c;", "d", "Lu04/a;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, v.Data> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45612f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.c postCodeFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: dz1.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001e¨\u0006\""}, d2 = {"Ldz1/a$b;", "", "Laz1/u;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "", "onUrlClick", "hideSnackBar", "goToInformationPage", "<init>", "(Laz1/u;Ler/a;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laz1/u;", "e", "()Laz1/u;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "d", "()Ler/l;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBar;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToInformationPage;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super String, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onBackClick = aVar;
            this.onUrlClick = lVar;
            this.hideSnackBar = aVar2;
            this.goToInformationPage = aVar3;
        }

        public final er.a<i0> a() {
            return this.goToInformationPage;
        }

        public final er.a<i0> b() {
            return this.hideSnackBar;
        }

        public final er.a<i0> c() {
            return this.onBackClick;
        }

        public final l<String, i0> d() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.hideSnackBar, params.hideSnackBar) && t.c(this.goToInformationPage, params.goToInformationPage);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.hideSnackBar.hashCode()) * 31) + this.goToInformationPage.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onUrlClick=" + this.onUrlClick + ", hideSnackBar=" + this.hideSnackBar + ", goToInformationPage=" + this.goToInformationPage + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f45622a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(789542285);
            if (p076m2.t.k()) {
                p076m2.t.o(789542285, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.personaldata.mapper.ElectoralPersonalDataMapper.invoke.<anonymous>.<anonymous> (ElectoralPersonalDataMapper.kt:118)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar, ez.c cVar2, dz.c cVar3, u04.a aVar) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.postCodeFormatter = cVar3;
        this.commonEndpoints = aVar;
    }

    private final CardListData c(RegisteredArea registeredArea, String electionsAreaNumber, Citizen citizen) {
        CardListData cardListDataH;
        return (registeredArea == null || (cardListDataH = h(registeredArea, electionsAreaNumber)) == null) ? e(citizen) : cardListDataH;
    }

    private final CardListData e(Citizen citizen) {
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(qy1.a.N), null, null, 3, null);
        String strE = c0.e(citizen.getFirstName());
        b0 secondName = citizen.getSecondName();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new b.Title(n50.l.b(mx.b.b(pq.v.v0(pq.v.s(strE, secondName != null ? c0.e(secondName) : null), " ", null, null, 0, null, null, 62, null), "name"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.S), null, null, 3, null), new b.Title(n50.l.b(mx.b.b(c0.e(citizen.getLastName()), "lastName"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.J), null, null, 3, null), new b.Title(n50.l.b(mx.b.d(citizen.getCitizenshipDescription(), "citizenshipDescription"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        if (!t.c(citizen.getRegisterCode(), "OSOBA_WYBORCA_B")) {
            defaultSingleCardData5 = null;
        }
        SingleCardLabel singleCardLabelB2 = n50.l.b(this.labelProvider.c(qy1.a.K), null, null, 3, null);
        b0 documentNumber = citizen.getDocumentNumber();
        DefaultSingleCardData defaultSingleCardData6 = t.c(citizen.getRegisterCode(), "OSOBA_WYBORCA_B") ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new b.Title(n50.l.b(mx.b.d(documentNumber != null ? c0.e(documentNumber) : null, "documentNumber"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.P), null, null, 3, null), new b.Title(n50.l.b(mx.b.b(c0.e(citizen.getPesel()), "pesel"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData8 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.I), null, null, 3, null), new b.Title(n50.l.b(mx.b.b(this.dateConverter.a(citizen.getBirthDate()), "birthDate"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        CitizenAddress registeredAddress = citizen.getRegisteredAddress();
        if (registeredAddress != null) {
            SingleCardLabel singleCardLabelB3 = n50.l.b(this.labelProvider.c(qy1.a.Q), null, null, 3, null);
            String postalCode = registeredAddress.getPostalCode();
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB3, new b.Title(n50.l.b(ez1.a.a(postalCode != null ? this.postCodeFormatter.a(postalCode) : null, registeredAddress.getCity(), registeredAddress.getStreet(), registeredAddress.getBuildingNumber(), registeredAddress.getApartmentNumber()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData = null;
        }
        CitizenAddress address = citizen.getAddress();
        if (address != null) {
            SingleCardLabel singleCardLabelB4 = n50.l.b(this.labelProvider.c(qy1.a.R), null, null, 3, null);
            String postalCode2 = address.getPostalCode();
            defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB4, new b.Title(n50.l.b(ez1.a.a(postalCode2 != null ? this.postCodeFormatter.a(postalCode2) : null, address.getCity(), address.getStreet(), address.getBuildingNumber(), address.getApartmentNumber()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData2 = null;
        }
        return new CardListData(pq.v.s(defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData7, defaultSingleCardData8, defaultSingleCardData, defaultSingleCardData2), null, false, null, null, 30, null);
    }

    private final CardListData f(List<District> districts) {
        List listN;
        if (districts != null) {
            List<District> list = districts;
            listN = new ArrayList(pq.v.y(list, 10));
            for (District district : list) {
                listN.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.b(district.getElectionsType(), "electionsType"), null, null, 3, null), new b.Title(n50.l.b(mx.b.b(this.labelProvider.c(qy1.a.U).getText() + ' ' + district.getDistrictNumber(), "districtNumber"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null));
            }
        } else {
            listN = pq.v.n();
        }
        return new CardListData(listN, null, false, null, null, 30, null);
    }

    private final CardListData h(RegisteredArea registeredArea, String electionsAreaNumber) {
        SingleCardLabel singleCardLabelB;
        Label labelB;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169515m), null, null, 3, null), new b.Title(n50.l.b(mx.b.b(registeredArea.getOkwName(), "okwName"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        CitizenAddress okwAddress = registeredArea.getOkwAddress();
        SingleCardLabel singleCardLabelB2 = n50.l.b(this.labelProvider.c(qy1.a.f169510i), null, null, 3, null);
        String postalCode = okwAddress.getPostalCode();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new b.Title(n50.l.b(ez1.a.a(postalCode != null ? this.postCodeFormatter.a(postalCode) : null, okwAddress.getCity(), okwAddress.getStreet(), okwAddress.getBuildingNumber(), okwAddress.getApartmentNumber()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB3 = n50.l.b(this.labelProvider.c(qy1.a.f169516n), null, null, 3, null);
        if (electionsAreaNumber == null || (labelB = mx.b.b(electionsAreaNumber, "electionsAreaNumber")) == null || (singleCardLabelB = n50.l.b(labelB, null, null, 3, null)) == null) {
            singleCardLabelB = n50.l.b(mx.b.b(registeredArea.getNumber(), "number"), null, null, 3, null);
        }
        return new CardListData(pq.v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB3, new b.Title(singleCardLabelB), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public v.Data b(Params params) {
        ElectoralPersonalModel electoralPersonalModel = params.getState().getElectoralPersonalModel();
        Label labelC = electoralPersonalModel.getRegisteredArea() != null ? this.labelProvider.c(qy1.a.X) : this.labelProvider.c(qy1.a.L);
        CardListData cardListDataC = c(electoralPersonalModel.getRegisteredArea(), electoralPersonalModel.getElectionsAreaNumber(), electoralPersonalModel.getCitizen());
        CardListData cardListDataF = f(electoralPersonalModel.b());
        c30.b.c cVar = null;
        if (cardListDataF.d().isEmpty()) {
            cardListDataF = null;
        }
        AccordionData accordionData = cardListDataF != null ? new AccordionData(pq.v.e(new AccordionElement(null, this.labelProvider.c(qy1.a.V), null, false, null, false, new bz1.b(cardListDataF), 29, null))) : null;
        CardListData cardListDataE = e(electoralPersonalModel.getCitizen());
        if (electoralPersonalModel.getRegisteredArea() == null) {
            cardListDataE = null;
        }
        AccordionData accordionData2 = cardListDataE != null ? new AccordionData(pq.v.e(new AccordionElement(null, this.labelProvider.c(qy1.a.L), null, false, null, false, new bz1.b(cardListDataE), 29, null))) : null;
        c30.b.c cVar2 = new c30.b.c(null, null, null, this.labelProvider.c(qy1.a.f169517o), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(qy1.a.f169513k), this.commonEndpoints.a(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), 55, null);
        if (electoralPersonalModel.getRegisteredArea() == null && !electoralPersonalModel.getHasInactiveVoteRights()) {
            cVar = cVar2;
        }
        return new v.Data(labelC, cardListDataC, cVar, params.b(), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(qy1.a.H), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, c.f45622a, null, params.a(), 4, null)), null, 20, null), null, null, null, null, 61, null), accordionData, accordionData2);
    }
}
