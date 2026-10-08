package bk3;

import b30.AccordionData;
import b30.AccordionElement;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.q;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import j30.ButtonTextData;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import uv0.VehicleHistory;
import uv0.v;
import x50.NavigationButtonData;
import xj3.State;
import xj3.d;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020%*\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b+\u0010'J\u0013\u0010,\u001a\u00020%*\u00020(H\u0002¢\u0006\u0004\b,\u0010*J\u0013\u0010-\u001a\u00020%*\u00020(H\u0002¢\u0006\u0004\b-\u0010*J\u0013\u0010.\u001a\u00020%*\u00020(H\u0002¢\u0006\u0004\b.\u0010*J\u0013\u0010/\u001a\u00020%*\u00020(H\u0002¢\u0006\u0004\b/\u0010*J\u0018\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lbk3/c;", "Lxw/f;", "Lbk3/c$a;", "Lxj3/d$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "Luv0/m;", "vehicleHistory", "", "Ln50/g;", "h", "(Luv0/m;)Ljava/util/List;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "info", "Ln50/x0$a;", "trailingButton", "i", "(Lmx/a;Lmx/a;Ln50/x0$a;)Ln50/g;", "Lkotlin/Function0;", "Loq/i0;", "onEuroNormInfoClick", "Ln30/b;", "m", "(Luv0/m;Ler/a;)Ln30/b;", "Luv0/m$d$a;", "Lxj3/a;", "resources", "u", "(Luv0/m$d$a;Lxj3/a;)Ljava/util/List;", "f", "(Luv0/m;)Ln30/b;", "", "", i.f37087n, "(I)Ljava/lang/String;", "Ljava/math/BigDecimal;", "z", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "x", "F", "E", "G", "v", "params", "q", "(Lbk3/c$a;)Lxj3/d$a;", "a", "Lmx/c;", "b", "Lez/c;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: bk3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R1\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R1\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001b\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b&\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\"\u0010!¨\u0006'"}, d2 = {"Lbk3/c$a;", "", "Lxj3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function3;", "Luv0/d;", "Luv0/v;", "Ljava/time/LocalDate;", "timelineAction", "abroadAction", "onMoreInfoClick", "onEuroNormInfoClick", "<init>", "(Lxj3/c;Ler/a;Ler/q;Ler/q;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxj3/c;", "e", "()Lxj3/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/q;", "f", "()Ler/q;", "d", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<uv0.d, v, LocalDate, i0> timelineAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<uv0.d, v, LocalDate, i0> abroadAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreInfoClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEuroNormInfoClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, q<? super uv0.d, ? super v, ? super LocalDate, i0> qVar, q<? super uv0.d, ? super v, ? super LocalDate, i0> qVar2, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.backAction = aVar;
            this.timelineAction = qVar;
            this.abroadAction = qVar2;
            this.onMoreInfoClick = aVar2;
            this.onEuroNormInfoClick = aVar3;
        }

        public final q<uv0.d, v, LocalDate, i0> a() {
            return this.abroadAction;
        }

        public final er.a<i0> b() {
            return this.backAction;
        }

        public final er.a<i0> c() {
            return this.onEuroNormInfoClick;
        }

        public final er.a<i0> d() {
            return this.onMoreInfoClick;
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.timelineAction, params.timelineAction) && t.c(this.abroadAction, params.abroadAction) && t.c(this.onMoreInfoClick, params.onMoreInfoClick) && t.c(this.onEuroNormInfoClick, params.onEuroNormInfoClick);
        }

        public final q<uv0.d, v, LocalDate, i0> f() {
            return this.timelineAction;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.timelineAction.hashCode()) * 31) + this.abroadAction.hashCode()) * 31) + this.onMoreInfoClick.hashCode()) * 31) + this.onEuroNormInfoClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", timelineAction=" + this.timelineAction + ", abroadAction=" + this.abroadAction + ", onMoreInfoClick=" + this.onMoreInfoClick + ", onEuroNormInfoClick=" + this.onEuroNormInfoClick + ')';
        }
    }

    public c(mx.c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    private final String E(BigDecimal bigDecimal) {
        return bigDecimal + " kW";
    }

    private final String F(BigDecimal bigDecimal) {
        return bigDecimal + " kN";
    }

    private final String G(BigDecimal bigDecimal) {
        return bigDecimal + " l";
    }

    private final String H(int i15) {
        return i15 + " kg";
    }

    private final CardListData f(VehicleHistory vehicleHistory) {
        DefaultSingleCardData defaultSingleCardDataL = l(this, mx.b.d(vehicleHistory.getDocumentData().getType(), "documentType"), this.labelProvider.c(yi3.a.f227266t0), null, 4, null);
        Label labelC = this.labelProvider.c(yi3.a.E0);
        LocalDate registrationDocumentDateOfIssue = vehicleHistory.getDocumentData().getRegistrationDocumentDateOfIssue();
        return new CardListData(pq.v.q(defaultSingleCardDataL, l(this, mx.b.d(registrationDocumentDateOfIssue != null ? this.dateConverter.a(registrationDocumentDateOfIssue) : null, "registrationDocumentDateOfIssue"), labelC, null, 4, null), l(this, mx.b.d(vehicleHistory.getDocumentData().getState(), "documentState"), this.labelProvider.c(yi3.a.f227264s0), null, 4, null), l(this, mx.b.d(vehicleHistory.getHomologationData().getCertificateNumber(), "homologationCertificateNumber"), this.labelProvider.c(yi3.a.f227243l0), null, 4, null), l(this, mx.b.d(vehicleHistory.getHomologationData().getCategory(), "homologationCategory"), this.labelProvider.c(yi3.a.f227240k0), null, 4, null), l(this, mx.b.d(vehicleHistory.getHomologationData().getVersion(), "homologationVersion"), this.labelProvider.c(yi3.a.f227252o0), null, 4, null), l(this, mx.b.d(vehicleHistory.getHomologationData().getVariant(), "homologationVariant"), this.labelProvider.c(yi3.a.f227249n0), null, 4, null), l(this, mx.b.d(vehicleHistory.getHomologationData().getType(), "homologationType"), this.labelProvider.c(yi3.a.f227246m0), null, 4, null)), null, false, null, null, 30, null);
    }

    private final List<DefaultSingleCardData> h(VehicleHistory vehicleHistory) {
        return pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227235i1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(vehicleHistory.getBasicData().getDescription(), "vehicleInfo"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227238j1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(vehicleHistory.getBasicData().getVin()), "vin"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.W0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(String.valueOf(vehicleHistory.getBasicData().getYearOfProduction()), "yearOfProduction"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.S0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(vehicleHistory.getBasicData().getOdometerState(), "odometerState"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.X0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(vehicleHistory.getBasicData().getRegistrationStatus(), "registrationStatus"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.G0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(vehicleHistory.getBasicData().getIsCivilLiabilityInsurance() ? this.labelProvider.c(yi3.a.H0) : this.labelProvider.c(yi3.a.F0), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227214b1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(vehicleHistory.getBasicData().getVehicleTechnicalInspection(), "vehicleTechnicalInspection"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final DefaultSingleCardData i(Label label, Label info, x0.Button trailingButton) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(info, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), null, 4, null), null, trailingButton, null, 2815, null);
    }

    static /* synthetic */ DefaultSingleCardData l(c cVar, Label label, Label label2, x0.Button button, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            button = null;
        }
        return cVar.i(label, label2, button);
    }

    private final CardListData m(VehicleHistory vehicleHistory, er.a<i0> onEuroNormInfoClick) {
        List<DefaultSingleCardData> listU;
        List<DefaultSingleCardData> listU2;
        VehicleHistory.TechnicalData technicalData = vehicleHistory.getTechnicalData();
        List listC = pq.v.c();
        Label labelC = this.labelProvider.c(yi3.a.f227270v0);
        BigDecimal enginePower = technicalData.getEnginePower();
        listC.add(l(this, mx.b.d(enginePower != null ? E(enginePower) : null, "enginePower"), labelC, null, 4, null));
        Label labelC2 = this.labelProvider.c(yi3.a.f227241k1);
        Integer curbWeight = technicalData.getCurbWeight();
        listC.add(l(this, mx.b.d(curbWeight != null ? H(curbWeight.intValue()) : null, "curbWeight"), labelC2, null, 4, null));
        Label labelC3 = this.labelProvider.c(yi3.a.V0);
        Integer permissibleGrossWeight = technicalData.getPermissibleGrossWeight();
        listC.add(l(this, mx.b.d(permissibleGrossWeight != null ? H(permissibleGrossWeight.intValue()) : null, "permissibleGrossWeight"), labelC3, null, 4, null));
        Label labelC4 = this.labelProvider.c(yi3.a.U0);
        Integer permissibleTotalPayload = technicalData.getPermissibleTotalPayload();
        listC.add(l(this, mx.b.d(permissibleTotalPayload != null ? H(permissibleTotalPayload.intValue()) : null, "permissibleTotalPayload"), labelC4, null, 4, null));
        Label labelC5 = this.labelProvider.c(yi3.a.J0);
        Integer maxTrailerWeightWithBrake = technicalData.getMaxTrailerWeightWithBrake();
        listC.add(l(this, mx.b.d(maxTrailerWeightWithBrake != null ? H(maxTrailerWeightWithBrake.intValue()) : null, "maxTrailerWeightWithBrake"), labelC5, null, 4, null));
        Label labelC6 = this.labelProvider.c(yi3.a.K0);
        Integer maxTrailerWeightNoBrake = technicalData.getMaxTrailerWeightNoBrake();
        listC.add(l(this, mx.b.d(maxTrailerWeightNoBrake != null ? H(maxTrailerWeightNoBrake.intValue()) : null, "maxTrailerWeightNoBrake"), labelC6, null, 4, null));
        Label labelC7 = this.labelProvider.c(yi3.a.f227258q0);
        Integer numberOfAxles = technicalData.getNumberOfAxles();
        listC.add(l(this, mx.b.d(numberOfAxles != null ? String.valueOf(numberOfAxles.intValue()) : null, "numberOfAxles"), labelC7, null, 4, null));
        Label labelC8 = this.labelProvider.c(yi3.a.I0);
        BigDecimal maxAxleLoad = technicalData.getMaxAxleLoad();
        listC.add(l(this, mx.b.d(maxAxleLoad != null ? F(maxAxleLoad) : null, "maxAxleLoad"), labelC8, null, 4, null));
        Label labelC9 = this.labelProvider.c(yi3.a.f227232h1);
        Integer totalNumberOfSeats = technicalData.getTotalNumberOfSeats();
        listC.add(l(this, mx.b.d(totalNumberOfSeats != null ? String.valueOf(totalNumberOfSeats.intValue()) : null, "totalNumberOfSeats"), labelC9, null, 4, null));
        Label labelC10 = this.labelProvider.c(yi3.a.Z0);
        Integer numberOfStandingPlaces = technicalData.getNumberOfStandingPlaces();
        listC.add(l(this, mx.b.d(numberOfStandingPlaces != null ? String.valueOf(numberOfStandingPlaces.intValue()) : null, "numberOfStandingPlaces"), labelC10, null, 4, null));
        Label labelC11 = this.labelProvider.c(yi3.a.Y0);
        Integer numberOfSeats = technicalData.getNumberOfSeats();
        listC.add(l(this, mx.b.d(numberOfSeats != null ? String.valueOf(numberOfSeats.intValue()) : null, "numberOfSeats"), labelC11, null, 4, null));
        Label labelC12 = this.labelProvider.c(yi3.a.f227247m1);
        BigDecimal wheelbase = technicalData.getWheelbase();
        listC.add(l(this, mx.b.d(wheelbase != null ? z(wheelbase) : null, "wheelbase"), labelC12, null, 4, null));
        Label labelC13 = this.labelProvider.c(yi3.a.f227244l1);
        Integer trackOfWheels = technicalData.getTrackOfWheels();
        listC.add(l(this, mx.b.d(trackOfWheels != null ? x(trackOfWheels.intValue()) : null, "trackOfWheels"), labelC13, null, 4, null));
        listC.add(l(this, mx.b.d(technicalData.getFuelType(), "fuelType"), this.labelProvider.c(yi3.a.D0), null, 4, null));
        Label labelC14 = this.labelProvider.c(yi3.a.f227255p0);
        BigDecimal averageFuelConsumption = technicalData.getAverageFuelConsumption();
        listC.add(l(this, mx.b.d(averageFuelConsumption != null ? G(averageFuelConsumption) : null, "averageFuelConsumption"), labelC14, null, 4, null));
        Label labelC15 = this.labelProvider.c(yi3.a.f227261r0);
        BigDecimal emissionLevelCO2 = technicalData.getEmissionLevelCO2();
        listC.add(l(this, mx.b.d(emissionLevelCO2 != null ? v(emissionLevelCO2) : null, "emissionLevelCO2"), labelC15, null, 4, null));
        VehicleHistory.TechnicalData.AlternativeFuel alternativeFuel = technicalData.getAlternativeFuel();
        if (alternativeFuel != null && (listU2 = u(alternativeFuel, xj3.a.First)) != null) {
            listC.addAll(listU2);
        }
        VehicleHistory.TechnicalData.AlternativeFuel alternativeFuel2 = technicalData.getAlternativeFuel2();
        if (alternativeFuel2 != null && (listU = u(alternativeFuel2, xj3.a.Second)) != null) {
            listC.addAll(listU);
        }
        listC.add(i(mx.b.d(technicalData.getEmissionLevelEuro(), "emissionLevelEuro"), this.labelProvider.c(yi3.a.f227274x0), (technicalData.getIsEuroNorm() ? technicalData : null) != null ? new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(yi3.a.f227221e), null, 2, null), k30.d.a.f107773a, null, onEuroNormInfoClick, 35, null)) : null));
        listC.add(l(this, mx.b.d(technicalData.getOdometerState(), "odometerState"), this.labelProvider.c(yi3.a.T0), null, 4, null));
        return new CardListData(pq.v.a(listC), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, State state) {
        params.f().w(uv0.d.b(state.getPlate()), v.b(state.getVin()), state.getFirstRegistrationDate());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, State state) {
        params.a().w(uv0.d.b(state.getPlate()), v.b(state.getVin()), state.getFirstRegistrationDate());
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> u(VehicleHistory.TechnicalData.AlternativeFuel alternativeFuel, xj3.a aVar) {
        DefaultSingleCardData defaultSingleCardDataL;
        DefaultSingleCardData defaultSingleCardDataL2 = null;
        DefaultSingleCardData defaultSingleCardDataL3 = l(this, mx.b.d(alternativeFuel.getType(), "alternativeFuelType_" + aVar.getIndex()), this.labelProvider.c(aVar.getInfoResId()), null, 4, null);
        BigDecimal averageFuelConsumption = alternativeFuel.getAverageFuelConsumption();
        if (averageFuelConsumption != null) {
            defaultSingleCardDataL = l(this, mx.b.d(G(averageFuelConsumption), "alternativeFuelConsumption_" + aVar.getIndex()), this.labelProvider.c(aVar.getFuelConsumptionResId()), null, 4, null);
        } else {
            defaultSingleCardDataL = null;
        }
        BigDecimal averageCO2Emission = alternativeFuel.getAverageCO2Emission();
        if (averageCO2Emission != null) {
            defaultSingleCardDataL2 = l(this, mx.b.d(v(averageCO2Emission), "alternativeCO2Consumption_" + aVar.getIndex()), this.labelProvider.c(aVar.getCo2EmissionResId()), null, 4, null);
        }
        return pq.v.s(defaultSingleCardDataL3, defaultSingleCardDataL, defaultSingleCardDataL2);
    }

    private final String v(BigDecimal bigDecimal) {
        return bigDecimal + " g/km";
    }

    private final String x(int i15) {
        return i15 + " mm";
    }

    private final String z(BigDecimal bigDecimal) {
        return bigDecimal + " mm";
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        final State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(yi3.a.f227229g1), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarB = params.b();
        c30.b.C0606b c0606b = state.getVehicleHistory().getBasicData().getIsLost() ? new c30.b.C0606b(null, null, this.labelProvider.c(yi3.a.f227210a0), this.labelProvider.c(yi3.a.Z), null, null, null, 115, null) : null;
        c30.b.C0606b c0606b2 = state.getVehicleHistory().getBasicData().getIsTemporarilyWithdrawnFromCirculation() ? new c30.b.C0606b(null, null, this.labelProvider.c(yi3.a.f227220d1), this.labelProvider.c(yi3.a.f227217c1), null, null, null, 115, null) : null;
        CardListData cardListData = new CardListData(h(state.getVehicleHistory()), null, false, null, null, 30, null);
        Label labelC = this.labelProvider.c(yi3.a.f227219d0);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106853r, null, null, null, null, 30, null), 3, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yi3.a.f227223e1), null, null, 0, 0, null, 62, null)), null, 5, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new d.Data(baseScaffoldData, aVarB, c0606b, c0606b2, cardListData, new AccordionData(pq.v.e(new AccordionElement(null, this.labelProvider.c(yi3.a.f227211a1), null, false, null, false, new yj3.b(m(state.getVehicleHistory(), params.c())), 29, null))), new AccordionData(pq.v.e(new AccordionElement(null, this.labelProvider.c(yi3.a.f227268u0), null, false, null, false, new yj3.b(f(state.getVehicleHistory())), 29, null))), labelC, new DefaultSingleCardData(null, new er.a() { // from class: bk3.a
            @Override // er.a
            public final Object a() {
                return c.r(params, state);
            }
        }, false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2301, null), new DefaultSingleCardData(null, new er.a() { // from class: bk3.b
            @Override // er.a
            public final Object a() {
                return c.s(params, state);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yi3.a.C0), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.Q0, null, null, null, null, 30, null), 3, null), companion.b(), null, 2301, null), new c30.b.c(null, null, null, this.labelProvider.c(yi3.a.f227212b), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(yi3.a.f227218d), null, null, params.d(), 13, null)), 55, null));
    }
}
