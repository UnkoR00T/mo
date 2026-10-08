package gg1;

import af1.PkdCodeMainSelectionContractData;
import androidx.compose.ui.graphics.Color;
import bg1.CompanyShortNameContractData;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import java.time.LocalDate;
import java.util.List;
import ld1.CompanyPkdCode;
import ma1.CompanyCategory;
import ma1.CompanyData;
import ma1.s;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import qg1.CompanySuspensionWizardData;
import rd1.EdorAddressData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lgg1/l;", "Lxw/f;", "Lgg1/l$a;", "Lfg1/n$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lgg1/b;", "electronicDeliveryCardListMapper", "Lgg1/e;", "socialInsuranceMapper", "Lgg1/n;", "userDataMapper", "Lgg1/d;", "pkdCodesMapper", "<init>", "(Lmx/c;Lez/e;Lgg1/b;Lgg1/e;Lgg1/n;Lgg1/d;)V", "Lfg1/m$a;", "params", "Lfg1/n$a$a;", "c", "(Lfg1/m$a;Lgg1/l$a;)Lfg1/n$a$a;", "e", "(Lgg1/l$a;)Lfg1/n$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lgg1/b;", "d", "Lgg1/e;", "Lgg1/n;", "f", "Lgg1/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, fg1.n.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gg1.b electronicDeliveryCardListMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e socialInsuranceMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n userDataMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d pkdCodesMapper;

    /* JADX INFO: renamed from: gg1.l$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006#"}, d2 = {"Lgg1/l$a;", "", "Lfg1/m;", "state", "Lkotlin/Function0;", "Loq/i0;", "onPreviewFileAction", "onUserDataAction", "onPkdCodesAction", "onBackAction", "onNextAction", "onCloseAction", "<init>", "(Lfg1/m;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfg1/m;", "g", "()Lfg1/m;", "b", "Ler/a;", "e", "()Ler/a;", "c", "f", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fg1.m state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPreviewFileAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUserDataAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPkdCodesAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(fg1.m mVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = mVar;
            this.onPreviewFileAction = aVar;
            this.onUserDataAction = aVar2;
            this.onPkdCodesAction = aVar3;
            this.onBackAction = aVar4;
            this.onNextAction = aVar5;
            this.onCloseAction = aVar6;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        public final er.a<i0> d() {
            return this.onPkdCodesAction;
        }

        public final er.a<i0> e() {
            return this.onPreviewFileAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPreviewFileAction, params.onPreviewFileAction) && t.c(this.onUserDataAction, params.onUserDataAction) && t.c(this.onPkdCodesAction, params.onPkdCodesAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final er.a<i0> f() {
            return this.onUserDataAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final fg1.m getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onPreviewFileAction.hashCode()) * 31) + this.onUserDataAction.hashCode()) * 31) + this.onPkdCodesAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPreviewFileAction=" + this.onPreviewFileAction + ", onUserDataAction=" + this.onUserDataAction + ", onPkdCodesAction=" + this.onPkdCodesAction + ", onBackAction=" + this.onBackAction + ", onNextAction=" + this.onNextAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f72903a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-199636168);
            if (p076m2.t.k()) {
                p076m2.t.o(-199636168, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.mapper.SummaryMapper.createSummaryScreen.<anonymous>.<anonymous>.<anonymous> (SummaryMapper.kt:95)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public l(mx.c cVar, ez.e eVar, gg1.b bVar, e eVar2, n nVar, d dVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.electronicDeliveryCardListMapper = bVar;
        this.socialInsuranceMapper = eVar2;
        this.userDataMapper = nVar;
        this.pkdCodesMapper = dVar;
    }

    private final fg1.n.a.Initialized c(fg1.m.Initialized initialized, Params params) {
        LocalDate startResumptionDate;
        int i15;
        int i16;
        Label labelC;
        fg1.n.a.SummarySectionData summarySectionData;
        oq.r rVarA;
        CompanyCategory mainCategory;
        DefaultSingleCardData defaultSingleCardDataC;
        String shortName;
        fg1.n.a.SummarySectionData summarySectionData2;
        Label labelC2;
        Label label;
        Label labelC3;
        List<CompanyCategory> listL;
        CompanyPkdCode selectedPkdCode;
        CompanySuspensionWizardData data = initialized.getData();
        mx.c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(ha1.a.f82370c), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f72903a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC4 = cVar.c(ha1.a.f82411h0);
        Label labelC5 = cVar.c(ha1.a.L3);
        Label labelC6 = cVar.c(ha1.a.f82515v0);
        Label labelC7 = cVar.c(ha1.a.B);
        Label labelB = mx.b.b(ld1.f.a(data.getSuspensionPeriod().getKnownUserDataModel().getCitizenData()), "user-full_filename");
        k30.a.b bVar = k30.a.b.f107765a;
        k30.c.WithText withText = new k30.c.WithText(cVar.c(ha1.a.M).n("user_info_more_btn"), null, 2, null);
        k30.d.a aVar = k30.d.a.f107773a;
        fg1.n.a.SummarySectionData summarySectionData3 = new fg1.n.a.SummarySectionData(labelC6, new CardListData(v.e(gd1.p.c(labelB, labelC7, null, new ButtonData(null, null, bVar, withText, aVar, null, params.f(), 35, null), null, 20, null)), null, false, null, null, 30, null));
        jg1.d suspensionPeriod = data.getSuspensionPeriod();
        if (suspensionPeriod instanceof jg1.d.Suspension) {
            startResumptionDate = ((jg1.d.Suspension) data.getSuspensionPeriod()).getSuspensionPeriod().getFrom();
        } else {
            if (!(suspensionPeriod instanceof jg1.d.Resumption)) {
                throw new oq.p();
            }
            startResumptionDate = ((jg1.d.Resumption) data.getSuspensionPeriod()).getResumptionDate().getStartResumptionDate();
        }
        jg1.d suspensionPeriod2 = data.getSuspensionPeriod();
        if (suspensionPeriod2 instanceof jg1.d.Resumption) {
            i15 = ha1.a.f82376c5;
        } else {
            if (!(suspensionPeriod2 instanceof jg1.d.Suspension)) {
                throw new oq.p();
            }
            i15 = ha1.a.G5;
        }
        Label labelC8 = cVar.c(i15);
        jg1.d suspensionPeriod3 = data.getSuspensionPeriod();
        if (suspensionPeriod3 instanceof jg1.d.Resumption) {
            i16 = ha1.a.A5;
        } else {
            if (!(suspensionPeriod3 instanceof jg1.d.Suspension)) {
                throw new oq.p();
            }
            i16 = ha1.a.F5;
        }
        Label labelC9 = cVar.c(i16);
        ez.e eVar = this.dateFormatter;
        fz.b.LocalDate localDate = new fz.b.LocalDate(startResumptionDate);
        fz.c cVar2 = fz.c.DOTTED;
        fg1.n.a.SummarySectionData summarySectionData4 = new fg1.n.a.SummarySectionData(labelC8, new CardListData(v.e(gd1.p.c(mx.b.d(eVar.d(localDate, cVar2), "start_suspension_date"), labelC9, null, null, null, 28, null)), null, false, null, null, 30, null));
        jg1.d suspensionPeriod4 = data.getSuspensionPeriod();
        if (suspensionPeriod4 instanceof jg1.d.Resumption) {
            summarySectionData = null;
        } else {
            if (!(suspensionPeriod4 instanceof jg1.d.Suspension)) {
                throw new oq.p();
            }
            LocalDate to4 = ((jg1.d.Suspension) data.getSuspensionPeriod()).getSuspensionPeriod().getTo();
            if (to4 == null || (labelC = mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(to4), cVar2), "end_suspension_date")) == null) {
                labelC = cVar.c(ha1.a.B5);
            }
            summarySectionData = new fg1.n.a.SummarySectionData(cVar.c(ha1.a.D5), new CardListData(v.e(gd1.p.c(labelC, cVar.c(ha1.a.M3), null, null, null, 28, null)), null, false, null, null, 30, null));
        }
        Label labelC10 = cVar.c(ha1.a.f82525w3);
        PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData = initialized.getData().getPkdCodeMainSelectionContractData();
        if (pkdCodeMainSelectionContractData == null || (selectedPkdCode = pkdCodeMainSelectionContractData.getSelectedPkdCode()) == null || (rVarA = y.a(selectedPkdCode.getCode(), selectedPkdCode.getName())) == null) {
            CompanyData companyData = initialized.getData().getCompanyDetailsContractData().getCompanyData();
            rVarA = (companyData == null || (mainCategory = companyData.getMainCategory()) == null) ? null : y.a(mainCategory.getCode(), mainCategory.getName());
        }
        if (rVarA != null) {
            String str = (String) rVarA.a();
            String str2 = (String) rVarA.b();
            Label labelB2 = mx.b.b(str, "pkd_main_category_title_value");
            j70.a aVar2 = j70.a.LETTER_BY_LETTER;
            Label labelB3 = mx.b.b(str2, "pkd_main_category_description_value");
            ButtonData buttonData = new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(ha1.a.M).n("pkd_more_btn"), null, 2, null), aVar, null, params.d(), 35, null);
            CompanyData companyData2 = initialized.getData().getCompanyDetailsContractData().getCompanyData();
            defaultSingleCardDataC = gd1.p.c(labelB2, null, labelB3, (companyData2 == null || (listL = companyData2.l()) == null) ? false : listL.isEmpty() ^ true ? buttonData : null, aVar2, 2, null);
        } else {
            defaultSingleCardDataC = null;
        }
        fg1.n.a.SummarySectionData summarySectionData5 = new fg1.n.a.SummarySectionData(labelC10, new CardListData(v.r(defaultSingleCardDataC), null, false, null, null, 30, null));
        CompanyData companyData3 = initialized.getData().getCompanyDetailsContractData().getCompanyData();
        if (!s.a(companyData3 != null ? companyData3.getCategoryEdition() : null)) {
            summarySectionData5 = null;
        }
        fg1.n.a.SummarySectionData summarySectionData6 = new fg1.n.a.SummarySectionData(cVar.c(ha1.a.f82465o), new CardListData(v.e(gd1.p.c(mx.b.b(String.valueOf(data.getHomeAddressContractData().getHomeAddress()), "home_address_section_title"), cVar.c(ha1.a.f82362b), null, null, null, 28, null)), null, false, null, null, 30, null));
        EdorAddressData edorAddressData = data.getEdorAddressData();
        fg1.n.a.SummarySectionData summarySectionData7 = edorAddressData != null ? new fg1.n.a.SummarySectionData(cVar.c(ha1.a.D4), this.electronicDeliveryCardListMapper.b(new gg1.b.Params(edorAddressData))) : null;
        fg1.n.a.SummarySectionData summarySectionData8 = new fg1.n.a.SummarySectionData(cVar.c(ha1.a.J3), this.socialInsuranceMapper.b(new e.Params(data.getSocialInsuranceSelectionContractData(), data.getKrusData(), params.e())));
        fg1.n.a.SummarySectionData summarySectionData9 = summarySectionData5;
        fg1.n.a.SummarySectionData summarySectionData10 = new fg1.n.a.SummarySectionData(cVar.c(ha1.a.O3), new CardListData(v.e(gd1.p.c(mx.b.b(data.getTaxOfficeContractData().getOffice().getName(), "tax_office_name_value"), null, mx.b.b(ld1.s.a(data.getTaxOfficeContractData().getOffice()), "tax_office_address_value"), null, null, 26, null)), null, false, null, null, 30, null));
        Label labelC11 = cVar.c(ha1.a.Q0);
        CompanyData companyData4 = data.getCompanyDetailsContractData().getCompanyData();
        if (companyData4 == null || (shortName = companyData4.getCompanyAbbreviatedName()) == null) {
            CompanyShortNameContractData companyShortNameContractData = data.getCompanyShortNameContractData();
            shortName = companyShortNameContractData != null ? companyShortNameContractData.getShortName() : null;
        }
        fg1.n.a.SummarySectionData summarySectionData11 = new fg1.n.a.SummarySectionData(labelC11, new CardListData(v.r(shortName != null ? gd1.p.c(mx.b.b(shortName, "company_short_name_value"), null, null, null, null, 30, null) : null), null, false, null, null, 30, null));
        tf1.b contactInfoContractData = data.getContactInfoContractData();
        if (contactInfoContractData != null) {
            Label labelC12 = cVar.c(ha1.a.f82396f1);
            Label labelC13 = cVar.c(ha1.a.f82486r);
            boolean z15 = contactInfoContractData instanceof tf1.b.a;
            if (z15) {
                labelC2 = mx.b.b(c0.e(((tf1.b.a) contactInfoContractData).getEmail()), "contact_info_email_value");
            } else {
                if (!(contactInfoContractData instanceof tf1.b.C4950b)) {
                    throw new oq.p();
                }
                labelC2 = cVar.c(ha1.a.W5);
            }
            Label label2 = labelC2;
            tf1.b.a aVar3 = z15 ? (tf1.b.a) contactInfoContractData : null;
            Boolean boolValueOf = aVar3 != null ? Boolean.valueOf(aVar3.getCeidgConsent()) : null;
            if (t.c(boolValueOf, Boolean.TRUE)) {
                labelC3 = cVar.c(ha1.a.f82364b1);
            } else {
                if (t.c(boolValueOf, Boolean.FALSE)) {
                    labelC3 = cVar.c(ha1.a.B3);
                } else {
                    label = null;
                }
                summarySectionData2 = new fg1.n.a.SummarySectionData(labelC12, new CardListData(v.e(gd1.p.c(label2, labelC13, label, null, null, 24, null)), null, false, null, null, 30, null));
            }
            label = labelC3;
            summarySectionData2 = new fg1.n.a.SummarySectionData(labelC12, new CardListData(v.e(gd1.p.c(label2, labelC13, label, null, null, 24, null)), null, false, null, null, 30, null));
        } else {
            labelC5 = labelC5;
            summarySectionData2 = null;
        }
        CompanyData companyData5 = data.getCompanyDetailsContractData().getCompanyData();
        return new fg1.n.a.Initialized(baseScaffoldData, labelC4, labelC5, summarySectionData3, summarySectionData4, summarySectionData, summarySectionData9, summarySectionData6, summarySectionData7, summarySectionData8, summarySectionData10, summarySectionData11, companyData5 != null ? companyData5.getHasNoEmail() : false ? summarySectionData2 : null, new c30.b.c(null, null, null, this.labelProvider.c(ha1.a.f82490r3).n("alert_body"), null, null, null, 119, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.f82379d0).n("sign_and_send_btn"), null, 2, null), aVar, null, params.c(), 35, null), params.a());
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public fg1.n.a b(Params params) {
        fg1.m state = params.getState();
        if (state instanceof fg1.m.Initialized) {
            return c((fg1.m.Initialized) state, params);
        }
        if (state instanceof fg1.m.Pkd) {
            return this.pkdCodesMapper.b(new d.Params(((fg1.m.Pkd) state).a(), params.a()));
        }
        if (!(state instanceof fg1.m.UserData)) {
            throw new oq.p();
        }
        fg1.m.UserData userData = (fg1.m.UserData) state;
        return this.userDataMapper.b(new n.Params(userData.getCitizenData(), userData.getMIdCardNumber(), params.a()));
    }
}
