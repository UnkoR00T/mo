package af3;

import df3.VehicleDetailsData;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.List;
import java.util.Locale;
import ki3.ShowLocalizationModel;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import se3.InsuranceDetailsData;
import sv0.StatementVehicleDetails;
import sv0.s0;
import sv0.v0;
import ve3.PersonalDetailsData;
import x50.NavigationButtonData;
import ze3.Created;
import ze3.ReportedToUFG;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\"*\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Laf3/l;", "Lxw/f;", "Laf3/l$a;", "Lze3/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lje3/b;", "localizationFormatter", "Lje3/c;", "vehicleCollisionStatementFormatter", "<init>", "(Lmx/c;Lez/e;Lje3/b;Lje3/c;)V", "Lze3/c$a;", "state", "params", "Ln30/b;", "x", "(Lze3/c$a;Laf3/l$a;)Ln30/b;", "G", "O", "Ln50/g;", "F", "(Laf3/l$a;)Ln50/g;", "Lk30/d;", "buttonVariant", "Lh30/a;", "E", "(Laf3/l$a;Lk30/d;)Lh30/a;", "N", "(Laf3/l$a;)Lh30/a;", "", "Lsv0/v0;", "", "T", "(Ljava/util/List;)Ljava/lang/String;", "Lsv0/c0$b$c;", "statementDetails", "v", "(Laf3/l$a;Lsv0/c0$b$c;)Ln30/b;", "phoneNumber", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/lang/String;Laf3/l$a;)Ln50/g;", "V", "(Laf3/l$a;)Lze3/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lje3/b;", "d", "Lje3/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, ze3.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final je3.b localizationFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final je3.c vehicleCollisionStatementFormatter;

    /* JADX INFO: renamed from: af3.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b+\u0010*R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b,\u0010*R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b'\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b#\u00100R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b1\u00100R)\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b3\u0010*R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b-\u0010*R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b2\u00100¨\u00064"}, d2 = {"Laf3/l$a;", "", "Lze3/c;", "state", "Lkotlin/Function1;", "Lse3/a;", "Loq/i0;", "goToInsuranceDetails", "Ldf3/a;", "goToVehicleDetails", "Lve3/a;", "goToPersonalDetails", "Lki3/a;", "goMapDetails", "Lkotlin/Function0;", "onGoToReport", "goBack", "onDownloadPdfs", "", "Lsv0/j0$a;", "onPhotosClicked", "", "onCall", "onFillDataClicked", "<init>", "(Lze3/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lze3/c;", "k", "()Lze3/c;", "b", "Ler/l;", "c", "()Ler/l;", "e", "d", "f", "Ler/a;", "i", "()Ler/a;", "g", "h", "j", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ze3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<InsuranceDetailsData, i0> goToInsuranceDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<VehicleDetailsData, i0> goToVehicleDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<PersonalDetailsData, i0> goToPersonalDetails;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ShowLocalizationModel, i0> goMapDetails;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToReport;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadPdfs;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<List<StatementVehicleDetails.Image>, i0> onPhotosClicked;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onCall;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFillDataClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ze3.c cVar, er.l<? super InsuranceDetailsData, i0> lVar, er.l<? super VehicleDetailsData, i0> lVar2, er.l<? super PersonalDetailsData, i0> lVar3, er.l<? super ShowLocalizationModel, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.l<? super List<StatementVehicleDetails.Image>, i0> lVar5, er.l<? super String, i0> lVar6, er.a<i0> aVar4) {
            this.state = cVar;
            this.goToInsuranceDetails = lVar;
            this.goToVehicleDetails = lVar2;
            this.goToPersonalDetails = lVar3;
            this.goMapDetails = lVar4;
            this.onGoToReport = aVar;
            this.goBack = aVar2;
            this.onDownloadPdfs = aVar3;
            this.onPhotosClicked = lVar5;
            this.onCall = lVar6;
            this.onFillDataClicked = aVar4;
        }

        public final er.a<i0> a() {
            return this.goBack;
        }

        public final er.l<ShowLocalizationModel, i0> b() {
            return this.goMapDetails;
        }

        public final er.l<InsuranceDetailsData, i0> c() {
            return this.goToInsuranceDetails;
        }

        public final er.l<PersonalDetailsData, i0> d() {
            return this.goToPersonalDetails;
        }

        public final er.l<VehicleDetailsData, i0> e() {
            return this.goToVehicleDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.goToInsuranceDetails, params.goToInsuranceDetails) && t.c(this.goToVehicleDetails, params.goToVehicleDetails) && t.c(this.goToPersonalDetails, params.goToPersonalDetails) && t.c(this.goMapDetails, params.goMapDetails) && t.c(this.onGoToReport, params.onGoToReport) && t.c(this.goBack, params.goBack) && t.c(this.onDownloadPdfs, params.onDownloadPdfs) && t.c(this.onPhotosClicked, params.onPhotosClicked) && t.c(this.onCall, params.onCall) && t.c(this.onFillDataClicked, params.onFillDataClicked);
        }

        public final er.l<String, i0> f() {
            return this.onCall;
        }

        public final er.a<i0> g() {
            return this.onDownloadPdfs;
        }

        public final er.a<i0> h() {
            return this.onFillDataClicked;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.goToInsuranceDetails.hashCode()) * 31) + this.goToVehicleDetails.hashCode()) * 31) + this.goToPersonalDetails.hashCode()) * 31) + this.goMapDetails.hashCode()) * 31) + this.onGoToReport.hashCode()) * 31) + this.goBack.hashCode()) * 31) + this.onDownloadPdfs.hashCode()) * 31) + this.onPhotosClicked.hashCode()) * 31) + this.onCall.hashCode()) * 31) + this.onFillDataClicked.hashCode();
        }

        public final er.a<i0> i() {
            return this.onGoToReport;
        }

        public final er.l<List<StatementVehicleDetails.Image>, i0> j() {
            return this.onPhotosClicked;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ze3.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", goToInsuranceDetails=" + this.goToInsuranceDetails + ", goToVehicleDetails=" + this.goToVehicleDetails + ", goToPersonalDetails=" + this.goToPersonalDetails + ", goMapDetails=" + this.goMapDetails + ", onGoToReport=" + this.onGoToReport + ", goBack=" + this.goBack + ", onDownloadPdfs=" + this.onDownloadPdfs + ", onPhotosClicked=" + this.onPhotosClicked + ", onCall=" + this.onCall + ", onFillDataClicked=" + this.onFillDataClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6213b;

        static {
            int[] iArr = new int[sv0.l.values().length];
            try {
                iArr[sv0.l.PERPETRATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sv0.l.VICTIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6212a = iArr;
            int[] iArr2 = new int[s0.values().length];
            try {
                iArr2[s0.ReportedToUfgToFillForm.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[s0.ReportedToUfgFormFilled.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s0.ReportedToUfg.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f6213b = iArr2;
        }
    }

    public l(mx.c cVar, ez.e eVar, je3.b bVar, je3.c cVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.localizationFormatter = bVar;
        this.vehicleCollisionStatementFormatter = cVar2;
    }

    private final ButtonData E(Params params, k30.d buttonVariant) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.f125824s4), null, 2, null), buttonVariant, null, params.g(), 35, null);
    }

    private final DefaultSingleCardData F(Params params) {
        return new DefaultSingleCardData(null, params.g(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(md3.b.f125824s4), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106751d, null, null, null, null, 30, null), 3, null), null, null, 3325, null);
    }

    private final CardListData G(final ze3.c.Initialized state, final Params params) {
        final mx.c cVar = this.labelProvider;
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.Q4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getStatementDetails().getPerpetrator().getPersonalData().a()), "perpetratorFormattedNames"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), cVar.c(md3.b.L0)), aVar, null, new er.a() { // from class: af3.c
            @Override // er.a
            public final Object a() {
                return l.H(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.X5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getStatementDetails().getPerpetrator().getVehicleData().e()), "perpetratorVehicleData"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), cVar.c(md3.b.K0)), aVar, null, new er.a() { // from class: af3.d
            @Override // er.a
            public final Object a() {
                return l.I(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.M2), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(ie3.a.b(state.getStatementDetails().getPerpetrator().c(), "perpetratorInsurance"), null, null, 0, 0, null, 62, null)), null, 4, null), null, !state.getStatementDetails().getPerpetrator().c().isEmpty() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), cVar.c(md3.b.M0)), aVar, null, new er.a() { // from class: af3.e
            @Override // er.a
            public final Object a() {
                return l.J(params, cVar, state);
            }
        }, 35, null)) : null, null, 2815, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125697c5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(T(state.getStatementDetails().getPerpetrator().getVehicleData().d()), "perpetratorDamagesTitles"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(md3.b.U4), null, null, 0, 0, null, 62, null);
        List<StatementVehicleDetails.Image> listF = state.getStatementDetails().getPerpetrator().getVehicleData().f();
        BodySection bodySection2 = new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(listF != null ? String.valueOf(listF.size()) : null, "perpetrator_number_of_images"), null, null, 0, 0, null, 62, null)), null, 4, null);
        x0.Button button = new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), this.labelProvider.c(md3.b.N0)), aVar, null, new er.a() { // from class: af3.f
            @Override // er.a
            public final Object a() {
                return l.K(state, params);
            }
        }, 35, null));
        List<StatementVehicleDetails.Image> listF2 = state.getStatementDetails().getPerpetrator().getVehicleData().f();
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection2, null, (listF2 == null || !(listF2.isEmpty() ^ true)) ? null : button, null, 2815, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params, ze3.c.Initialized initialized) {
        params.d().b(new PersonalDetailsData(sv0.l.PERPETRATOR, initialized.getStatementDetails().getPerpetrator().getPersonalData()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params params, ze3.c.Initialized initialized) {
        params.e().b(new VehicleDetailsData(sv0.l.PERPETRATOR, initialized.getStatementDetails().getPerpetrator().getVehicleData(), true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params params, mx.c cVar, ze3.c.Initialized initialized) {
        params.c().b(new InsuranceDetailsData(cVar.c(md3.b.M2), initialized.getStatementDetails().getPerpetrator().c(), true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(ze3.c.Initialized initialized, Params params) {
        List<StatementVehicleDetails.Image> listF = initialized.getStatementDetails().getPerpetrator().getVehicleData().f();
        if (listF != null) {
            params.j().b(listF);
        }
        return i0.f148189a;
    }

    private final DefaultSingleCardData L(final String phoneNumber, final Params params) {
        mx.c cVar = this.labelProvider;
        if (phoneNumber == null) {
            return null;
        }
        return new DefaultSingleCardData("InsurerContactPhoneCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.X4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(phoneNumber, ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(cVar.c(md3.b.f125882z6), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: af3.k
            @Override // er.a
            public final Object a() {
                return l.M(params, phoneNumber);
            }
        }, 35, null)), null, 2814, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params, String str) {
        params.f().b(str);
        return i0.f148189a;
    }

    private final ButtonData N(Params params) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.f125791o3), null, 2, null), k30.d.a.f107773a, null, params.i(), 35, null);
    }

    private final CardListData O(final ze3.c.Initialized state, final Params params) {
        final mx.c cVar = this.labelProvider;
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.Q4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getStatementDetails().getVictim().getPersonalData().a()), "victimPersonalData"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: af3.g
            @Override // er.a
            public final Object a() {
                return l.P(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.Z5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getStatementDetails().getVictim().getVehicleData().e()), "victimVehicleData"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: af3.h
            @Override // er.a
            public final Object a() {
                return l.Q(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.N2), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(ie3.a.b(state.getStatementDetails().getVictim().c(), "victimInsurance"), null, null, 0, 0, null, 62, null)), null, 4, null), null, !state.getStatementDetails().getVictim().getVehicleData().g().isEmpty() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: af3.i
            @Override // er.a
            public final Object a() {
                return l.R(params, cVar, state);
            }
        }, 35, null)) : null, null, 2815, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125697c5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(T(state.getStatementDetails().getVictim().getVehicleData().d()), "victimVehicleDataDamages"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(md3.b.U4), null, null, 0, 0, null, 62, null);
        List<StatementVehicleDetails.Image> listF = state.getStatementDetails().getVictim().getVehicleData().f();
        BodySection bodySection2 = new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(listF != null ? String.valueOf(listF.size()) : null, "victim_number_of_images"), null, null, 0, 0, null, 62, null)), null, 4, null);
        x0.Button button = new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: af3.j
            @Override // er.a
            public final Object a() {
                return l.S(state, params);
            }
        }, 35, null));
        List<StatementVehicleDetails.Image> listF2 = state.getStatementDetails().getVictim().getVehicleData().f();
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection2, null, (listF2 == null || !(listF2.isEmpty() ^ true)) ? null : button, null, 2815, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(Params params, ze3.c.Initialized initialized) {
        params.d().b(new PersonalDetailsData(sv0.l.VICTIM, initialized.getStatementDetails().getVictim().getPersonalData()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(Params params, ze3.c.Initialized initialized) {
        params.e().b(new VehicleDetailsData(sv0.l.VICTIM, initialized.getStatementDetails().getVictim().getVehicleData(), true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(Params params, mx.c cVar, ze3.c.Initialized initialized) {
        params.c().b(new InsuranceDetailsData(cVar.c(md3.b.N2), initialized.getStatementDetails().getVictim().c(), true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(ze3.c.Initialized initialized, Params params) {
        List<StatementVehicleDetails.Image> listF = initialized.getStatementDetails().getVictim().getVehicleData().f();
        if (listF != null) {
            params.j().b(listF);
        }
        return i0.f148189a;
    }

    private final String T(List<? extends v0> list) {
        return dz.e.b(v.v0(list, ", ", null, null, 0, null, new er.l() { // from class: af3.a
            @Override // er.l
            public final Object b(Object obj) {
                return l.U(this.f6174a, (v0) obj);
            }
        }, 30, null).toLowerCase(Locale.ROOT), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence U(l lVar, v0 v0Var) {
        return lVar.labelProvider.c(ie3.a.e(v0Var)).getText();
    }

    private final CardListData v(Params params, sv0.c0.b.ReportedToUfo statementDetails) {
        r50.a.WithIcon withIcon;
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(md3.b.Z), null, null, 0, 0, null, 62, null);
        int i15 = b.f6213b[statementDetails.getStatus().ordinal()];
        if (i15 != 1) {
            withIcon = (i15 == 2 || i15 != 3) ? new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125776m4), null, 0, false, r50.g.POSITIVE, 13, null) : new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125776m4), null, 0, false, r50.g.POSITIVE, 13, null);
        } else {
            withIcon = new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125784n4), null, 0, false, r50.g.INFORMATIVE, 13, null);
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.StatusBadge(withIcon), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125763l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(ie3.a.a(this.dateFormatter, statementDetails.getReportedStatement().getReportAcceptanceDate()), "date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.Y4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(statementDetails.getReportedStatement().getInsurerName()), "insurerName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        b0 phoneNumber = statementDetails.getReportedStatement().getPhoneNumber();
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, L(phoneNumber != null ? c0.e(phoneNumber) : null, params)), null, false, null, null, 30, null);
    }

    private final CardListData x(final ze3.c.Initialized state, final Params params) {
        mx.c cVar = this.labelProvider;
        return new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125763l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(ie3.a.a(this.dateFormatter, state.getStatementDetails().getCollisionCircumstances().getDate()), "statementDetailsDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.V4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.localizationFormatter.a(state.getStatementDetails().getCollisionCircumstances().getLocalizationDescription(), state.getStatementDetails().getCollisionCircumstances().getCoordinates()), "localization"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(cVar.c(md3.b.I), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: af3.b
            @Override // er.a
            public final Object a() {
                return l.z(params, state);
            }
        }, 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125779n), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getStatementDetails().getCollisionCircumstances().getCollisionDescription()), "collisionDescription"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, ze3.c.Initialized initialized) {
        params.b().b(new ShowLocalizationModel(initialized.getStatementDetails().getCollisionCircumstances().getCoordinates(), initialized.getStatementDetails().getCollisionCircumstances().getLocalizationDescription()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public ze3.d.a b(Params params) {
        ButtonData buttonDataE;
        ButtonData buttonData;
        mx.c cVar = this.labelProvider;
        ze3.c state = params.getState();
        if (state instanceof ze3.c.b) {
            return ze3.d.a.C6329a.f234820a;
        }
        if (!(state instanceof ze3.c.Initialized)) {
            throw new p();
        }
        ze3.c.Initialized initialized = (ze3.c.Initialized) state;
        sv0.c0.b statementDetails = initialized.getStatementDetails();
        ButtonData buttonDataE2 = null;
        if (statementDetails instanceof sv0.c0.b.ReportedToUfo) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(md3.b.f125760k4), null, null, null, 28, null), null, null, null, null, 61, null);
            Label labelB = this.vehicleCollisionStatementFormatter.b("StatementTitle", ((sv0.c0.b.ReportedToUfo) initialized.getStatementDetails()).getStatementNumber());
            Label labelC = cVar.c(md3.b.Z4);
            sv0.c0.b.ReportedToUfo reportedToUfo = (sv0.c0.b.ReportedToUfo) statementDetails;
            CardListData cardListDataV = v(params, reportedToUfo);
            Label labelC2 = cVar.c(md3.b.G4);
            CardListData cardListDataX = x(initialized, params);
            Label labelC3 = cVar.c(md3.b.N4);
            CardListData cardListDataG = G(initialized, params);
            Label labelC4 = cVar.c(md3.b.f125841u5);
            CardListData cardListDataO = O(initialized, params);
            Label labelC5 = cVar.c(md3.b.f125689b5);
            DefaultSingleCardData defaultSingleCardDataF = F(params);
            if (reportedToUfo.getReportedStatement().getFillFormClaimUrl() != null) {
                buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.W4), null, 2, null), k30.d.a.f107773a, null, params.h(), 35, null);
            } else {
                buttonData = null;
            }
            return new ReportedToUFG(baseScaffoldData, labelB, labelC, cardListDataV, labelC2, cardListDataX, labelC3, cardListDataG, labelC4, cardListDataO, labelC5, defaultSingleCardDataF, buttonData);
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(md3.b.f125760k4), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelB2 = this.vehicleCollisionStatementFormatter.b("StatementTitle", initialized.getStatementDetails().getStatementNumber());
        Label labelC6 = cVar.c(md3.b.G4);
        CardListData cardListDataX2 = x(initialized, params);
        Label labelC7 = cVar.c(md3.b.N4);
        CardListData cardListDataG2 = G(initialized, params);
        Label labelC8 = cVar.c(md3.b.f125841u5);
        CardListData cardListDataO2 = O(initialized, params);
        Label labelC9 = cVar.c(md3.b.f125689b5);
        sv0.l collisionRole = initialized.getStatementDetails().getCollisionRole();
        int[] iArr = b.f6212a;
        int i15 = iArr[collisionRole.ordinal()];
        if (i15 == 1) {
            buttonDataE = E(params, k30.d.a.f107773a);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            buttonDataE = N(params);
        }
        ButtonData buttonData2 = buttonDataE;
        int i16 = iArr[initialized.getStatementDetails().getCollisionRole().ordinal()];
        if (i16 != 1) {
            if (i16 != 2) {
                throw new p();
            }
            buttonDataE2 = E(params, new k30.d.Secondary(null, 1, null));
        }
        return new Created(baseScaffoldData2, labelB2, labelC6, cardListDataX2, labelC7, cardListDataG2, labelC8, cardListDataO2, labelC9, buttonData2, buttonDataE2);
    }
}
