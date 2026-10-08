package e13;

import b30.AccordionData;
import b30.AccordionElement;
import c13.State;
import c13.g;
import fr.k;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import iy.c0;
import j30.ButtonTextData;
import java.time.LocalDate;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.l;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002+)B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u001e*\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Le13/a;", "Lxw/f;", "Le13/a$b;", "Lc13/g$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "Lrv0/c;", "vehicle", "Lkotlin/Function0;", "Loq/i0;", "moreButtonAction", "Lc13/g$a$a;", "s", "(Lrv0/c;Ler/a;)Lc13/g$a$a;", "", "Ln50/g;", "f", "(Lrv0/c;)Ljava/util/List;", "c", "", "r", "(Lrv0/c;)Z", "h", "q", "e", "m", "", "terytCode", "Lmx/a;", "i", "(Ljava/lang/String;)Lmx/a;", "", "u", "(I)Ljava/lang/String;", "params", "l", "(Le13/a$b;)Lc13/g$a;", "a", "Lmx/c;", "b", "Lez/c;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1067a f46862c = new C1067a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46863d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: e13.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Le13/a$a;", "", "<init>", "()V", "", "DOLNOSLASKIE_TERYT_CODE", "Ljava/lang/String;", "KUJAWSKO_POMORSKIE_TERYT_CODE", "LUBELSKIE_TERYT_CODE", "LUBUSKIE_TERYT_CODE", "LODZKIE_TERYT_CODE", "MALOPOLSKIE_TERYT_CODE", "MAZOWIECKIE_TERYT_CODE", "OPOLSKIE_TERYT_CODE", "PODKARPACKIE_TERYT_CODE", "PODLASKIE_TERYT_CODE", "POMORSKIE_TERYT_CODE", "SLASKIE_TERYT_CODE", "SWIETOKRZYSKIE_TERYT_CODE", "WARMINSKO_MAZURSKIE_TERYT_CODE", "WIELKOPOLSKIE_TERYT_CODE", "ZACHODNIOPOMORSKIE_TERYT_CODE", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C1067a {
        public /* synthetic */ C1067a(k kVar) {
            this();
        }

        private C1067a() {
        }
    }

    /* JADX INFO: renamed from: e13.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Le13/a$b;", "", "Lc13/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "moreButtonAction", "backAction", "<init>", "(Lc13/f;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc13/f;", "c", "()Lc13/f;", "b", "Ler/a;", "()Ler/a;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> moreButtonAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.moreButtonAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.moreButtonAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.moreButtonAction, params.moreButtonAction) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.moreButtonAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", moreButtonAction=" + this.moreButtonAction + ", backAction=" + this.backAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46870b;

        static {
            int[] iArr = new int[rv0.b.values().length];
            try {
                iArr[rv0.b.STOLEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rv0.b.TEMPORARILY_WITHDRAWN_FROM_CIRCULATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rv0.b.INVALID_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rv0.b.OK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46869a = iArr;
            int[] iArr2 = new int[rv0.a.values().length];
            try {
                iArr2[rv0.a.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[rv0.a.DEREGISTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[rv0.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f46870b = iArr2;
        }
    }

    public a(mx.c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    private final List<DefaultSingleCardData> c(rv0.c vehicle) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(k03.a.D0), null, null, 3, null), new n50.b.Title(l.b(mx.b.d(vehicle.getBasicData().getProductionYear(), "yearOfProductionValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(k03.a.B0), null, null, 3, null), new n50.b.Title(l.b(mx.b.d(c0.e(vehicle.getBasicData().getVin()), "vinNumberValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(k03.a.f107221n0), null, null, 3, null), new n50.b.Title(l.b(i(vehicle.getBasicData().getRegistrationAuthorityCode()).n("registrationVoivodeshipValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB = l.b(this.labelProvider.c(k03.a.Y), null, null, 3, null);
        rv0.c.TechnicalData technicalData = vehicle.getTechnicalData();
        StringBuilder sb5 = new StringBuilder();
        Integer lastRegisteredMeterOneReading = technicalData.getLastRegisteredMeterOneReading();
        if (lastRegisteredMeterOneReading != null) {
            sb5.append(b.f46871a.format(Integer.valueOf(lastRegisteredMeterOneReading.intValue())));
            sb5.append(" ");
            String unitOfMeterOne = technicalData.getUnitOfMeterOne();
            if (unitOfMeterOne != null) {
                sb5.append(unitOfMeterOne);
            } else {
                sb5.append("-");
            }
        } else {
            sb5.append("-");
        }
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(l.b(mx.b.b(sb5.toString(), "lastRegisteredMeterOneReadingValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB2 = l.b(this.labelProvider.c(k03.a.Z), null, null, 3, null);
        rv0.c.TechnicalData technicalData2 = vehicle.getTechnicalData();
        StringBuilder sb6 = new StringBuilder();
        Integer lastRegisteredMeterTwoReading = technicalData2.getLastRegisteredMeterTwoReading();
        if (lastRegisteredMeterTwoReading != null) {
            sb6.append(b.f46871a.format(Integer.valueOf(lastRegisteredMeterTwoReading.intValue())));
            sb6.append(" ");
            String unitOfMeterTwo = technicalData2.getUnitOfMeterTwo();
            if (unitOfMeterTwo != null) {
                sb6.append(unitOfMeterTwo);
            } else {
                sb6.append("-");
            }
        } else {
            sb6.append("-");
        }
        return v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(l.b(mx.b.b(sb6.toString(), "lastRegisteredMeterTwoReadingValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final List<DefaultSingleCardData> e(rv0.c vehicle) {
        SingleCardLabel singleCardLabelB = l.b(this.labelProvider.c(k03.a.f107219m0), null, null, 3, null);
        LocalDate registrationDocumentIssueDate = vehicle.getDatesData().getRegistrationDocumentIssueDate();
        return v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(l.b(mx.b.d(registrationDocumentIssueDate != null ? this.dateConverter.a(registrationDocumentIssueDate) : null, "registrationDocumentDateOfIssueValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(k03.a.O), null, null, 3, null), new n50.b.Title(l.b(mx.b.d(vehicle.getHomologationData().getCertificateNumber(), "homologationCertificateNumberValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(k03.a.N), null, null, 3, null), new n50.b.Title(l.b(mx.b.d(vehicle.getHomologationData().getCategory(), "homologationCategoryValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(k03.a.Q), null, null, 3, null), new n50.b.Title(l.b(mx.b.d(vehicle.getHomologationData().getVersion(), "homologationVersionValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(k03.a.P), null, null, 3, null), new n50.b.Title(l.b(mx.b.d(vehicle.getHomologationData().getVariant(), "homologationVariant"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final List<DefaultSingleCardData> f(rv0.c vehicle) {
        Label labelC;
        r50.g gVar;
        Label labelC2;
        r50.g gVar2;
        Label labelC3;
        r50.g gVar3;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(k03.a.f107217l0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(vehicle.getBasicData().getPlateNumber(), "numberPlateValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        vehicle.getBasicData();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(k03.a.A0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(v.v0(v.s(vehicle.getBasicData().getBrand(), vehicle.getBasicData().getModel(), vehicle.getBasicData().getType()), ", ", null, null, 0, null, null, 62, null), "brandModelTypeValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        rv0.a registrationStatus = vehicle.getStatusData().getRegistrationStatus();
        int[] iArr = c.f46870b;
        int i15 = iArr[registrationStatus.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(k03.a.f107227q0);
        } else if (i15 == 2) {
            labelC = this.labelProvider.c(k03.a.f107223o0);
        } else {
            if (i15 != 3) {
                throw new p();
            }
            labelC = this.labelProvider.c(k03.a.f107202e);
        }
        Label labelN = labelC.n("registrationStatusValue");
        int i16 = iArr[vehicle.getStatusData().getRegistrationStatus().ordinal()];
        if (i16 == 1) {
            gVar = r50.g.POSITIVE;
        } else if (i16 == 2) {
            gVar = r50.g.NEGATIVE;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            gVar = r50.g.MINUS;
        }
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(k03.a.f107225p0), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, labelN, null, 0, false, gVar, 13, null)), null, 4, null), null, null, null, 3839, null);
        if (!vehicle.getStatusData().getCivilLiabilityInsurance() || vehicle.getDatesData().getNextCivilLiabilityInsuranceDate() == null) {
            labelC2 = this.labelProvider.c(k03.a.f107195a0);
        } else {
            labelC2 = this.labelProvider.c(k03.a.f107199c0).o(mx.b.b(' ' + this.dateConverter.a(vehicle.getDatesData().getNextCivilLiabilityInsuranceDate()), "civilLiabilityInsuranceDate"));
        }
        Label labelN2 = labelC2.n("civilLiabilityInsuranceValue");
        boolean civilLiabilityInsurance = vehicle.getStatusData().getCivilLiabilityInsurance();
        if (civilLiabilityInsurance) {
            gVar2 = r50.g.POSITIVE;
        } else {
            if (civilLiabilityInsurance) {
                throw new p();
            }
            gVar2 = r50.g.NEGATIVE;
        }
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(k03.a.f107197b0), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, labelN2, null, 0, false, gVar2, 13, null)), null, 4, null), null, null, null, 3839, null);
        if (!vehicle.getStatusData().getIsTechnicalInspectionValid() || vehicle.getDatesData().getVehicleTechnicalInspectionEndDate() == null) {
            labelC3 = this.labelProvider.c(k03.a.f107235u0);
        } else {
            labelC3 = this.labelProvider.c(k03.a.f107239w0).o(mx.b.b(' ' + this.dateConverter.a(vehicle.getDatesData().getVehicleTechnicalInspectionEndDate()), "technicalInspectionEndDate"));
        }
        Label labelN3 = labelC3.n("technicalInspectionValue");
        boolean isTechnicalInspectionValid = vehicle.getStatusData().getIsTechnicalInspectionValid();
        if (isTechnicalInspectionValid) {
            gVar3 = r50.g.POSITIVE;
        } else {
            if (isTechnicalInspectionValid) {
                throw new p();
            }
            gVar3 = r50.g.NEGATIVE;
        }
        return v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(k03.a.f107237v0), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, labelN3, null, 0, false, gVar3, 13, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final List<DefaultSingleCardData> h(rv0.c vehicle) {
        SingleCardLabel singleCardLabelB = l.b(this.labelProvider.c(k03.a.f107243y0), null, null, 3, null);
        Integer totalSeatsNumber = vehicle.getTechnicalData().getTotalSeatsNumber();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(l.b(mx.b.d(totalSeatsNumber != null ? String.valueOf(totalSeatsNumber.intValue()) : null, "totalNumberOfSeatsValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB2 = l.b(this.labelProvider.c(k03.a.f107229r0), null, null, 3, null);
        Integer seatsNumber = vehicle.getTechnicalData().getSeatsNumber();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(l.b(mx.b.d(seatsNumber != null ? String.valueOf(seatsNumber.intValue()) : null, "numberOfSeatsValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB3 = l.b(this.labelProvider.c(k03.a.f107231s0), null, null, 3, null);
        Integer standingPlacesNumber = vehicle.getTechnicalData().getStandingPlacesNumber();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB3, new n50.b.Title(l.b(mx.b.d(standingPlacesNumber != null ? String.valueOf(standingPlacesNumber.intValue()) : null, "numberOfStandingPlaces"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB4 = l.b(this.labelProvider.c(k03.a.C0), null, null, 3, null);
        Integer curbWeight = vehicle.getTechnicalData().getCurbWeight();
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB4, new n50.b.Title(l.b(mx.b.d(curbWeight != null ? u(curbWeight.intValue()) : null, "curbWeightValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB5 = l.b(this.labelProvider.c(k03.a.f107245z0), null, null, 3, null);
        Integer permissibleGrossWeight = vehicle.getTechnicalData().getPermissibleGrossWeight();
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB5, new n50.b.Title(l.b(mx.b.d(permissibleGrossWeight != null ? u(permissibleGrossWeight.intValue()) : null, "permissibleGrossWeightValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB6 = l.b(this.labelProvider.c(k03.a.R), null, null, 3, null);
        Integer axlesNumber = vehicle.getTechnicalData().getAxlesNumber();
        return v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB6, new n50.b.Title(l.b(mx.b.d(axlesNumber != null ? String.valueOf(axlesNumber.intValue()) : null, "numberOfAxlesValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Label i(String terytCode) {
        switch (terytCode.hashCode()) {
            case 1538:
                if (terytCode.equals("02")) {
                    return this.labelProvider.c(k03.a.f107204f);
                }
                break;
            case 1540:
                if (terytCode.equals("04")) {
                    return this.labelProvider.c(k03.a.f107206g);
                }
                break;
            case 1542:
                if (terytCode.equals("06")) {
                    return this.labelProvider.c(k03.a.f107210i);
                }
                break;
            case 1544:
                if (terytCode.equals("08")) {
                    return this.labelProvider.c(k03.a.f107212j);
                }
                break;
            case 1567:
                if (terytCode.equals("10")) {
                    return this.labelProvider.c(k03.a.f107208h);
                }
                break;
            case 1569:
                if (terytCode.equals("12")) {
                    return this.labelProvider.c(k03.a.f107214k);
                }
                break;
            case 1571:
                if (terytCode.equals("14")) {
                    return this.labelProvider.c(k03.a.f107216l);
                }
                break;
            case 1573:
                if (terytCode.equals("16")) {
                    return this.labelProvider.c(k03.a.f107218m);
                }
                break;
            case 1575:
                if (terytCode.equals("18")) {
                    return this.labelProvider.c(k03.a.f107220n);
                }
                break;
            case 1598:
                if (terytCode.equals("20")) {
                    return this.labelProvider.c(k03.a.f107222o);
                }
                break;
            case 1600:
                if (terytCode.equals("22")) {
                    return this.labelProvider.c(k03.a.f107224p);
                }
                break;
            case 1602:
                if (terytCode.equals("24")) {
                    return this.labelProvider.c(k03.a.f107226q);
                }
                break;
            case 1604:
                if (terytCode.equals("26")) {
                    return this.labelProvider.c(k03.a.f107228r);
                }
                break;
            case 1606:
                if (terytCode.equals("28")) {
                    return this.labelProvider.c(k03.a.f107230s);
                }
                break;
            case 1629:
                if (terytCode.equals("30")) {
                    return this.labelProvider.c(k03.a.f107232t);
                }
                break;
            case 1631:
                if (terytCode.equals("32")) {
                    return this.labelProvider.c(k03.a.f107234u);
                }
                break;
        }
        return Label.INSTANCE.b();
    }

    private final boolean m(rv0.c vehicle) {
        return (r.t0(vehicle.getBasicData().getProductionYear()) && !uv0.v.h(vehicle.getBasicData().getVin()) && r.t0(vehicle.getBasicData().getRegistrationAuthorityCode()) && vehicle.getTechnicalData().getLastRegisteredMeterOneReading() == null && vehicle.getTechnicalData().getLastRegisteredMeterTwoReading() == null) ? false : true;
    }

    private final boolean q(rv0.c vehicle) {
        if (vehicle.getDatesData().getRegistrationDocumentIssueDate() != null) {
            return true;
        }
        String category = vehicle.getHomologationData().getCategory();
        if (category != null && !r.t0(category)) {
            return true;
        }
        String category2 = vehicle.getHomologationData().getCategory();
        if (category2 != null && !r.t0(category2)) {
            return true;
        }
        String version = vehicle.getHomologationData().getVersion();
        if (version != null && !r.t0(version)) {
            return true;
        }
        String variant = vehicle.getHomologationData().getVariant();
        return (variant == null || r.t0(variant)) ? false : true;
    }

    private final boolean r(rv0.c vehicle) {
        rv0.c.TechnicalData technicalData = vehicle.getTechnicalData();
        return (technicalData.getTotalSeatsNumber() == null && technicalData.getSeatsNumber() == null && technicalData.getStandingPlacesNumber() == null && technicalData.getCurbWeight() == null && technicalData.getPermissibleGrossWeight() == null && technicalData.getAxlesNumber() == null) ? false : true;
    }

    private final g.Data.ContentData s(rv0.c vehicle, er.a<i0> moreButtonAction) {
        return new g.Data.ContentData(new CardListData(f(vehicle), null, false, null, null, 30, null), m(vehicle), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(k03.a.S), null, false, null, false, new d13.b(new CardListData(c(vehicle), null, true, null, null, 26, null)), 29, null))), r(vehicle), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(k03.a.f107233t0), null, false, null, false, new d13.b(new CardListData(h(vehicle), null, true, null, null, 26, null)), 29, null))), q(vehicle), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(k03.a.U), null, false, null, false, new d13.b(new CardListData(e(vehicle), null, true, null, null, 26, null)), 29, null))), new c30.b.c(null, null, null, this.labelProvider.c(k03.a.f107196b), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(k03.a.f107200d), null, null, moreButtonAction, 13, null)), 55, null));
    }

    private final String u(int i15) {
        return i15 + " kg";
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        Label labelC;
        IconPageData iconPageData;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(k03.a.f107241x0), null, null, null, 28, null), null, null, null, null, 61, null);
        rv0.b reportStatus = state.getVehicle().getStatusData().getReportStatus();
        int[] iArr = c.f46869a;
        if (iArr[reportStatus.ordinal()] == 4) {
            iconPageData = new IconPageData(j.b.c.f164688d, this.labelProvider.c(k03.a.T), null, null, s(state.getVehicle(), params.b()), null, true, 12, null);
        } else {
            j.b.a aVar = j.b.a.f164684d;
            int i15 = iArr[reportStatus.ordinal()];
            if (i15 == 1) {
                labelC = this.labelProvider.c(k03.a.W);
            } else if (i15 != 2) {
                labelC = i15 != 3 ? this.labelProvider.c(k03.a.f107202e) : this.labelProvider.c(k03.a.V);
            } else {
                labelC = this.labelProvider.c(k03.a.X);
            }
            iconPageData = new IconPageData(aVar, labelC, null, null, s(state.getVehicle(), params.b()), null, true, 12, null);
        }
        return new g.Data(baseScaffoldData, iconPageData, params.a());
    }
}
