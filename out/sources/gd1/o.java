package gd1;

import androidx.compose.ui.graphics.Color;
import fr.t;
import h30.ButtonData;
import hb1.PostOfficeBoxData;
import i50.BaseScaffoldData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ld1.CompanyPkdCode;
import ld1.s;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oc1.CorrespondencePostOfficeBoxContractData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import zb1.BusinessAddressSelectionContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lgd1/o;", "Lxw/f;", "Lgd1/o$a;", "Lfd1/c$a;", "Lmx/c;", "labelProvider", "Lgd1/h;", "socialInsuranceMapper", "Lgd1/a;", "accountingRecordsCardListMapper", "Lgd1/e;", "contactDataCardListMapper", "Lgd1/d;", "companyDetailsCardListMapper", "Lgd1/f;", "electronicDeliveryCardListMapper", "Lgd1/g;", "pkdMapper", "Lgd1/q;", "yourDataMapper", "<init>", "(Lmx/c;Lgd1/h;Lgd1/a;Lgd1/e;Lgd1/d;Lgd1/f;Lgd1/g;Lgd1/q;)V", "params", "c", "(Lgd1/o$a;)Lfd1/c$a;", "a", "Lmx/c;", "b", "Lgd1/h;", "Lgd1/a;", "d", "Lgd1/e;", "e", "Lgd1/d;", "f", "Lgd1/f;", "g", "Lgd1/g;", "h", "Lgd1/q;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements xw.f<Params, fd1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h socialInsuranceMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a accountingRecordsCardListMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e contactDataCardListMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d companyDetailsCardListMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f electronicDeliveryCardListMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g pkdMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q yourDataMapper;

    /* JADX INFO: renamed from: gd1.o$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006#"}, d2 = {"Lgd1/o$a;", "", "Lfd1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onPreviewFileAction", "onYourDataAction", "onPkdAction", "onNextAction", "onBackAction", "onCloseAction", "<init>", "(Lfd1/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfd1/b;", "g", "()Lfd1/b;", "b", "Ler/a;", "e", "()Ler/a;", "c", "f", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fd1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPreviewFileAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onYourDataAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPkdAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(fd1.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = bVar;
            this.onPreviewFileAction = aVar;
            this.onYourDataAction = aVar2;
            this.onPkdAction = aVar3;
            this.onNextAction = aVar4;
            this.onBackAction = aVar5;
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
            return this.onPkdAction;
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
            return t.c(this.state, params.state) && t.c(this.onPreviewFileAction, params.onPreviewFileAction) && t.c(this.onYourDataAction, params.onYourDataAction) && t.c(this.onPkdAction, params.onPkdAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final er.a<i0> f() {
            return this.onYourDataAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final fd1.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onPreviewFileAction.hashCode()) * 31) + this.onYourDataAction.hashCode()) * 31) + this.onPkdAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPreviewFileAction=" + this.onPreviewFileAction + ", onYourDataAction=" + this.onYourDataAction + ", onPkdAction=" + this.onPkdAction + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f71989a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(2006291568);
            if (p076m2.t.k()) {
                p076m2.t.o(2006291568, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.mapper.SummaryMapper.invoke.<anonymous> (SummaryMapper.kt:67)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public o(mx.c cVar, h hVar, a aVar, e eVar, d dVar, f fVar, g gVar, q qVar) {
        this.labelProvider = cVar;
        this.socialInsuranceMapper = hVar;
        this.accountingRecordsCardListMapper = aVar;
        this.contactDataCardListMapper = eVar;
        this.companyDetailsCardListMapper = dVar;
        this.electronicDeliveryCardListMapper = fVar;
        this.pkdMapper = gVar;
        this.yourDataMapper = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0264  */
    /* JADX WARN: Code duplicated, block: B:39:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x030d  */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fd1.c.a b(Params params) {
        boolean z15;
        DefaultSingleCardData defaultSingleCardDataC;
        CorrespondencePostOfficeBoxContractData postOfficeBoxContractData;
        String strA;
        DefaultSingleCardData defaultSingleCardDataC2;
        PostOfficeBoxData postOfficeBoxData;
        hb1.c businessAddress;
        fd1.b state = params.getState();
        if (!(state instanceof fd1.b.Initialized)) {
            if (state instanceof fd1.b.YourData) {
                return this.yourDataMapper.b(new q.Params(((fd1.b.YourData) state).getSummaryData(), params.a()));
            }
            if (state instanceof fd1.b.Pkd) {
                return this.pkdMapper.b(new g.Params(((fd1.b.Pkd) state).getSummaryData(), params.a()));
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82370c), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f71989a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelN = this.labelProvider.c(ha1.a.f82411h0).n("summary_title");
        Label labelN2 = this.labelProvider.c(ha1.a.L3).n("summary_description");
        Label labelN3 = this.labelProvider.c(ha1.a.f82515v0).n("your_data_title");
        fd1.b.Initialized initialized = (fd1.b.Initialized) state;
        Label labelB = mx.b.b(p.d(initialized.getSummaryData().getKnownUserData().getCitizenData()), "applicant_name_value");
        Label labelN4 = this.labelProvider.c(ha1.a.B).n("applicant_name_label");
        k30.a.b bVar = k30.a.b.f107765a;
        k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(ha1.a.M).n("your_data_more_btn"), null, 2, null);
        k30.d.a aVar = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardDataC3 = p.c(labelB, labelN4, null, new ButtonData(null, null, bVar, withText, aVar, null, params.f(), 35, null), null, 20, null);
        Label labelN5 = this.labelProvider.c(ha1.a.f82465o).n("accommodation_title");
        hb1.c homeAddress = initialized.getSummaryData().getHomeAddressContractData().getHomeAddress();
        if (!(homeAddress != null ? hb1.d.b(homeAddress) : false)) {
            labelN5 = null;
        }
        DefaultSingleCardData defaultSingleCardDataC4 = p.c(mx.b.b(String.valueOf(initialized.getSummaryData().getHomeAddressContractData().getHomeAddress()), "accommodation_address_value"), this.labelProvider.c(ha1.a.f82362b).n("accommodation_address_label"), null, null, null, 28, null);
        Label labelN6 = this.labelProvider.c(ha1.a.I).n("company_details");
        CardListData cardListDataB = this.companyDetailsCardListMapper.b(new d.Params(initialized.getSummaryData()));
        Label labelN7 = this.labelProvider.c(ha1.a.f82396f1).n("contact_details");
        CardListData cardListDataB2 = this.contactDataCardListMapper.b(new e.Params(initialized.getSummaryData()));
        Label labelN8 = this.labelProvider.c(ha1.a.f82525w3).n("pkdCodesSectionTitle");
        Label labelB2 = mx.b.b(initialized.getSummaryData().getPkdCodeMainSelectionContractData().getSelectedPkdCode().getCode(), "pkd_main_category_title_value");
        j70.a aVar2 = j70.a.LETTER_BY_LETTER;
        Label labelB3 = mx.b.b(initialized.getSummaryData().getPkdCodeMainSelectionContractData().getSelectedPkdCode().getName(), "pkd_main_category_description_value");
        ButtonData buttonData = new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(ha1.a.M).n("pkd_more_btn"), null, 2, null), aVar, null, params.d(), 35, null);
        List<CompanyPkdCode> listA = initialized.getSummaryData().getPkdCodeContractData().a();
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                }
                if (!t.c((CompanyPkdCode) it.next(), initialized.getSummaryData().getPkdCodeMainSelectionContractData().getSelectedPkdCode())) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        DefaultSingleCardData defaultSingleCardDataC5 = p.c(labelB2, null, labelB3, z15 ? buttonData : null, aVar2, 2, null);
        Label labelN9 = this.labelProvider.c(ha1.a.U4).n("permanent_business_place_title");
        BusinessAddressSelectionContractData businessAddressSelectionContractData = initialized.getSummaryData().getBusinessAddressSelectionContractData();
        if (businessAddressSelectionContractData == null || (businessAddress = businessAddressSelectionContractData.getBusinessAddress()) == null) {
            defaultSingleCardDataC = p.c(this.labelProvider.c(ha1.a.f82503t2).n("permanent_business_place_address_value"), this.labelProvider.c(ha1.a.f82362b).n("permanent_business_place_address_label"), null, null, null, 28, null);
        } else {
            defaultSingleCardDataC = p.c(mx.b.d(businessAddress.toString(), "permanent_business_place_address_value"), this.labelProvider.c(ha1.a.f82362b).n("permanent_business_place_address_label"), null, null, null, 28, null);
            if (defaultSingleCardDataC == null) {
                defaultSingleCardDataC = p.c(this.labelProvider.c(ha1.a.f82503t2).n("permanent_business_place_address_value"), this.labelProvider.c(ha1.a.f82362b).n("permanent_business_place_address_label"), null, null, null, 28, null);
            }
        }
        DefaultSingleCardData defaultSingleCardData = defaultSingleCardDataC;
        Label labelN10 = this.labelProvider.c(ha1.a.T4).n("correspondence_address_title");
        hb1.c correspondenceAddress = initialized.getSummaryData().getCorrespondenceAddressSelectionContractData().getCorrespondenceAddress();
        if (correspondenceAddress != null) {
            defaultSingleCardDataC2 = p.c(mx.b.d(correspondenceAddress.toString(), "correspondence_address_value"), this.labelProvider.c(ha1.a.f82362b).n("correspondence_address_label"), null, null, null, 28, null);
            if (defaultSingleCardDataC2 == null) {
                Label labelN11 = this.labelProvider.c(ha1.a.f82362b).n("correspondence_address_label");
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.labelProvider.c(ha1.a.E2).getText());
                sb5.append(' ');
                postOfficeBoxContractData = initialized.getSummaryData().getPostOfficeBoxContractData();
                if (postOfficeBoxContractData != null || (postOfficeBoxData = postOfficeBoxContractData.getPostOfficeBoxData()) == null) {
                    strA = null;
                } else {
                    strA = hb1.g.a(postOfficeBoxData);
                }
                sb5.append(strA);
                defaultSingleCardDataC2 = p.c(mx.b.d(sb5.toString(), "correspondence_address_value"), labelN11, null, null, null, 28, null);
            }
        } else {
            Label labelN12 = this.labelProvider.c(ha1.a.f82362b).n("correspondence_address_label");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.labelProvider.c(ha1.a.E2).getText());
            sb6.append(' ');
            postOfficeBoxContractData = initialized.getSummaryData().getPostOfficeBoxContractData();
            if (postOfficeBoxContractData != null) {
                strA = null;
            } else {
                strA = null;
            }
            sb6.append(strA);
            defaultSingleCardDataC2 = p.c(mx.b.d(sb6.toString(), "correspondence_address_value"), labelN12, null, null, null, 28, null);
        }
        return new fd1.c.a.Initialized(baseScaffoldData, labelN, labelN2, labelN3, defaultSingleCardDataC3, labelN5, defaultSingleCardDataC4, labelN6, cardListDataB, labelN7, cardListDataB2, labelN8, defaultSingleCardDataC5, labelN9, defaultSingleCardData, labelN10, defaultSingleCardDataC2, this.labelProvider.c(ha1.a.D4).n("electronic_delivery_address_title"), this.electronicDeliveryCardListMapper.b(new f.Params(initialized.getSummaryData())), this.labelProvider.c(ha1.a.f82546z3).n("place_payment_insurance_title"), this.socialInsuranceMapper.b(new h.Params(initialized.getSummaryData(), params.e())), this.labelProvider.c(ha1.a.O3).n("tax_office_title"), p.c(mx.b.b(initialized.getSummaryData().getTaxOfficeContractData().getOffice().getName(), "tax_office_name_value"), null, mx.b.b(s.a(initialized.getSummaryData().getTaxOfficeContractData().getOffice()), "tax_office_address_value"), null, null, 26, null), this.labelProvider.c(ha1.a.f82462n3).n("documentation_and_tax_title"), this.accountingRecordsCardListMapper.b(new a.Params(initialized.getSummaryData())), new c30.b.c(null, null, null, this.labelProvider.c(ha1.a.f82490r3).n("alert_body"), null, null, null, 119, null), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.f82379d0).n("sign_and_send_btn"), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
