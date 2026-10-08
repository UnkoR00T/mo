package r23;

import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.Arrays;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import tt0.BEInterventionHistoryActionDetail;
import tt0.BEReportedAddress;
import tt0.BEReportedInterventionApplicant;
import tt0.BEReportedObjectInterventionDetails;
import tt0.BEReportedOtherIntervention;
import tt0.BEReportedProductInterventionBusiness;
import tt0.BEReportedProductInterventionProductData;
import tt0.d;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001BB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J%\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\r2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u001e2\b\b\u0001\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u001e2\b\b\u0001\u00107\u001a\u0002062\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0:\"\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0018\u0010@\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lr23/b;", "Lxw/f;", "Lr23/b$a;", "Lq23/f$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ltt0/l;", "details", "Lkotlin/Function1;", "", "Ltt0/c;", "Loq/i0;", "openHistory", "Ln30/b;", "h", "(Ltt0/l;Ler/l;)Ln30/b;", "", "u", "(Ltt0/l;)Ljava/lang/String;", "Ltt0/r;", "productData", "s", "(Ltt0/r;)Ln30/b;", "productUrl", "r", "(Ljava/lang/String;)Ln30/b;", "Lmx/a;", "nameTitle", "Ltt0/q;", "data", "f", "(Lmx/a;Ltt0/q;)Ln30/b;", "Ltt0/o;", "objectDetails", "q", "(Ltt0/o;)Ln30/b;", "testTag", "Ltt0/i;", "address", "Ln50/g;", "e", "(Ljava/lang/String;Ltt0/i;)Ljava/util/List;", "Ltt0/p;", "report", "l", "(Ltt0/p;)Ln30/b;", "Ltt0/k;", "applicant", "m", "(Ltt0/k;)Ln30/b;", "", "stringId", "x", "(I)Lmx/a;", "", "", "arg", "z", "(I[Ljava/lang/Object;)Lmx/a;", "params", "v", "(Lr23/b$a;)Lq23/f$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, q23.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: r23.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR)\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f¨\u0006 "}, d2 = {"Lr23/b$a;", "", "Lq23/e;", "state", "Lkotlin/Function1;", "", "Ltt0/c;", "Loq/i0;", "openHistory", "Lkotlin/Function0;", "onBack", "<init>", "(Lq23/e;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq23/e;", "c", "()Lq23/e;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q23.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<List<BEInterventionHistoryActionDetail>, i0> openHistory;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(q23.e eVar, l<? super List<BEInterventionHistoryActionDetail>, i0> lVar, er.a<i0> aVar) {
            this.state = eVar;
            this.openHistory = lVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<List<BEInterventionHistoryActionDetail>, i0> b() {
            return this.openHistory;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final q23.e getState() {
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
            return t.c(this.state, params.state) && t.c(this.openHistory, params.openHistory) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.openHistory.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", openHistory=" + this.openHistory + ", onBack=" + this.onBack + ')';
        }
    }

    /* JADX INFO: renamed from: r23.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4341b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171241a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.SUBMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f171241a = iArr;
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<DefaultSingleCardData> e(String testTag, BEReportedAddress address) {
        return v.q(new DefaultSingleCardData(testTag + "_province", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.N), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getProvince(), "province"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_county", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80163o), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getDistrict(), "county"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_community", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80151k), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getCommunity(), "community"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_city", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80145i), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getCity(), "city"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_postcode", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.M), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getPostalCode(), "postcode"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_street", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.W), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getStreet(), "street"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_building_number", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80130d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getBuildingNumber(), "building_number"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_apartment_number", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80124b), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address.getLocalNumber(), "apartment_number"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
    }

    private final CardListData f(Label nameTitle, BEReportedProductInterventionBusiness data) {
        return new CardListData(v.L0(v.e(new DefaultSingleCardData("card" + nameTitle.getTag(), null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(nameTitle, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(data.getName(), "name"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), e(nameTitle.getTag(), data.getAddress())), null, false, null, null, 30, null);
    }

    private final CardListData h(final tt0.l details, final l<? super List<BEInterventionHistoryActionDetail>, i0> openHistory) {
        Label labelX;
        g gVar;
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(h23.b.V), null, null, 0, 0, null, 62, null);
        d processingStatus = details.getProcessingStatus();
        int[] iArr = C4341b.f171241a;
        int i15 = iArr[processingStatus.ordinal()];
        if (i15 == 1) {
            labelX = x(h23.b.S1);
        } else if (i15 == 2) {
            labelX = x(h23.b.R1);
        } else {
            if (i15 != 3) {
                throw new p();
            }
            labelX = x(h23.b.Q1);
        }
        Label label = labelX;
        int i16 = iArr[details.getProcessingStatus().ordinal()];
        if (i16 == 1) {
            gVar = g.INFORMATIVE;
        } else if (i16 == 2) {
            gVar = g.NOTICE;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            gVar = g.POSITIVE;
        }
        return new CardListData(v.q(new DefaultSingleCardData("status", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.StatusBadge(new r50.a.WithIcon(null, label, null, 0, false, gVar, 13, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(h23.b.C), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: r23.a
            @Override // er.a
            public final Object a() {
                return b.i(openHistory, details);
            }
        }, 35, null)), null, 2814, null), new DefaultSingleCardData("type", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80168p1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(details.getInterventionTypeName(), "type"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("interventionCategory", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80162n1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(details.getInterventionCategoryName(), "interventionCategory"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("description", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80159m1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(details.getDescription(), "description"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("date", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80169q), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(u(details), "date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("attachments", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80127c), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(details.getAttachments().getTotalNumber() == 0 ? mx.b.b("-", "attachments") : mx.b.b(String.valueOf(details.getAttachments().getTotalNumber()), "attachments"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, tt0.l lVar2) {
        lVar.b(lVar2.d());
        return i0.f148189a;
    }

    private final CardListData l(BEReportedOtherIntervention report) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("institution_name", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80186v1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(report.getReportedAuthority(), "institution_name"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("report_number", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80189w1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(report.getRelatedCaseNumber(), "report_number"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(h23.b.f80183u1), null, null, 0, 0, null, 62, null);
        fz.b.LocalDate reportedToAuthorityDate = report.getReportedToAuthorityDate();
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData("report_date", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(reportedToAuthorityDate != null ? this.dateFormatter.d(reportedToAuthorityDate, fz.c.DOTTED) : null, "report_date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    private final CardListData m(BEReportedInterventionApplicant applicant) {
        List listQ;
        if (applicant.getFirstName().length() == 0 || applicant.getLastName().length() == 0) {
            return null;
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("firstname", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.A), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(applicant.getFirstName(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("lastname", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.F), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(applicant.getLastName(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        String eDeliveryAddress = applicant.getEDeliveryAddress();
        List listS = v.s(defaultSingleCardData, defaultSingleCardData2, eDeliveryAddress != null ? new DefaultSingleCardData("edorAddress", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80175s), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(eDeliveryAddress, ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null) : null);
        if (applicant.getPhoneNumber() == null && applicant.getEmail() == null) {
            listQ = v.n();
        } else {
            SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(h23.b.J), null, null, 0, 0, null, 62, null);
            PhoneNumber phoneNumber = applicant.getPhoneNumber();
            listQ = v.q(new DefaultSingleCardData("phoneNumber", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(phoneNumber != null ? phoneNumber.f() : null, ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("emailAddress", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80181u), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(applicant.getEmail(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
        }
        return new CardListData(v.A(v.q(listS, listQ)), null, false, null, null, 30, null);
    }

    private final CardListData q(BEReportedObjectInterventionDetails objectDetails) {
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(objectDetails.getCarrierName() != null ? h23.b.f80177s1 : h23.b.f80180t1), null, null, 0, 0, null, 62, null);
        String facilityName = objectDetails.getFacilityName();
        if (facilityName == null) {
            facilityName = objectDetails.getCarrierName();
        }
        return new CardListData(v.L0(v.r(new DefaultSingleCardData("location_description", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(facilityName, "location_description"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), e("location", objectDetails.getAddress())), null, false, null, null, 30, null);
    }

    private final CardListData r(String productUrl) {
        return new CardListData(v.e(new DefaultSingleCardData("webside", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80198z1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(productUrl, "productName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    private final CardListData s(BEReportedProductInterventionProductData productData) {
        return new CardListData(v.q(new DefaultSingleCardData("productName", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.C1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(productData.getTradeName(), "productName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("batchNumber", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.A1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(productData.getBatchNumber(), "batchNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("expiryDate", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.B1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(productData.getExpiryDateDescription(), "expiryDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    private final String u(tt0.l lVar) {
        fz.b.OffsetDateTime occurrenceDateTime = lVar.getOccurrenceDateTime();
        if (occurrenceDateTime != null) {
            return this.dateFormatter.d(occurrenceDateTime, fz.c.DOTTED_PLUS_HOUR);
        }
        return null;
    }

    private final Label x(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final Label z(int stringId, Object... arg) {
        return this.labelProvider.e(stringId, Arrays.copyOf(arg, arg.length));
    }

    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public q23.f.a b(Params params) {
        BEReportedObjectInterventionDetails objectDetails;
        BEReportedProductInterventionBusiness manufacturerData;
        BEReportedProductInterventionBusiness sellerData;
        String productUrl;
        q23.e state = params.getState();
        if (state instanceof q23.e.a) {
            return new q23.f.a.Loading(params.a());
        }
        if (state instanceof q23.e.LoadingError) {
            return new q23.f.a.Error(params.a(), ((q23.e.LoadingError) state).getErrorVMSAdapter());
        }
        if (!(state instanceof q23.e.Screen)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), x(h23.b.f80185v0), null, null, null, 28, null), null, null, null, null, 61, null);
        q23.e.Screen screen = (q23.e.Screen) state;
        Label labelZ = z(h23.b.f80179t0, mx.b.b(screen.getDetails().getInitiativeNumber(), "number").getText());
        Label labelX = x(h23.b.f80165o1);
        CardListData cardListDataH = h(screen.getDetails(), params.b());
        Label labelX2 = x(h23.b.D1);
        tt0.l details = screen.getDetails();
        tt0.l.Product product = details instanceof tt0.l.Product ? (tt0.l.Product) details : null;
        CardListData cardListDataS = product != null ? s(product.getProductData()) : null;
        Label labelX3 = x(h23.b.f80195y1);
        tt0.l details2 = screen.getDetails();
        tt0.l.Product product2 = details2 instanceof tt0.l.Product ? (tt0.l.Product) details2 : null;
        CardListData cardListDataR = (product2 == null || (productUrl = product2.getProductUrl()) == null) ? null : r(productUrl);
        Label labelX4 = x(h23.b.f80155l0);
        tt0.l details3 = screen.getDetails();
        tt0.l.Product product3 = details3 instanceof tt0.l.Product ? (tt0.l.Product) details3 : null;
        CardListData cardListDataF = (product3 == null || (sellerData = product3.getSellerData()) == null) ? null : f(x(h23.b.f80182u0), sellerData);
        Label labelX5 = x(h23.b.J1);
        tt0.l details4 = screen.getDetails();
        tt0.l.Product product4 = details4 instanceof tt0.l.Product ? (tt0.l.Product) details4 : null;
        CardListData cardListDataF2 = (product4 == null || (manufacturerData = product4.getManufacturerData()) == null) ? null : f(x(h23.b.f80161n0), manufacturerData);
        Label labelX6 = x(h23.b.L);
        tt0.l details5 = screen.getDetails();
        tt0.l.Location location = details5 instanceof tt0.l.Location ? (tt0.l.Location) details5 : null;
        CardListData cardListDataQ = (location == null || (objectDetails = location.getObjectDetails()) == null) ? null : q(objectDetails);
        Label labelX7 = x(h23.b.f80192x1);
        BEReportedOtherIntervention otherIntervention = screen.getDetails().getOtherIntervention();
        return new q23.f.a.Screen(params.a(), baseScaffoldData, labelZ, labelX, cardListDataH, labelX6, cardListDataQ, labelX7, otherIntervention != null ? l(otherIntervention) : null, labelX2, cardListDataS, labelX3, cardListDataR, labelX4, cardListDataF, labelX5, cardListDataF2, x(h23.b.L1), m(screen.getDetails().getApplicant()));
    }
}
