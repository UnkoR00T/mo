package c31;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageData;
import q40.j;
import t40.InfoRowListData;
import wv0.InsuranceData;
import wv0.TopAlertData;
import wv0.VehicleIdentifierData;
import wv0.VehicleInsuranceVerificationData;
import x50.NavigationButtonData;
import xw.f;
import z21.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r*\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lc31/e;", "Lxw/f;", "Lc31/e$a;", "Lz21/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Ln50/g;", "m", "(Lc31/e$a;)Ln50/g;", "Lwv0/f;", "", "s", "(Lwv0/f;)Ljava/util/List;", "Lkotlin/Function1;", "", "Loq/i0;", "copyToClipboard", "Ln30/b;", "q", "(Lwv0/f;Ler/l;)Ljava/util/List;", "Lf31/a;", "onMoreInfo", "Lc30/b$c;", "h", "(Ler/l;)Ljava/util/List;", "x", "(Lc31/e$a;)Lz21/g$a;", "Lmx/a;", "v", "()Lmx/a;", "a", "Lmx/c;", "Lt40/a$a;", "u", "()Ljava/util/List;", "invalidSectionBullets", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c31.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lc31/e$a;", "", "Lz21/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "", "onCopyToClipboardClick", "Lf31/a;", "onMoreInfoClick", "onDownloadInsuranceConfirmationClick", "", "showDownloadButton", "<init>", "(Lz21/f;Ler/a;Ler/l;Ler/l;Ler/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lz21/f;", "f", "()Lz21/f;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "Z", "()Z", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z21.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCopyToClipboardClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<f31.a, i0> onMoreInfoClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadInsuranceConfirmationClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showDownloadButton;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(z21.f fVar, er.a<i0> aVar, l<? super String, i0> lVar, l<? super f31.a, i0> lVar2, er.a<i0> aVar2, boolean z15) {
            this.state = fVar;
            this.onBackClick = aVar;
            this.onCopyToClipboardClick = lVar;
            this.onMoreInfoClick = lVar2;
            this.onDownloadInsuranceConfirmationClick = aVar2;
            this.showDownloadButton = z15;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<String, i0> b() {
            return this.onCopyToClipboardClick;
        }

        public final er.a<i0> c() {
            return this.onDownloadInsuranceConfirmationClick;
        }

        public final l<f31.a, i0> d() {
            return this.onMoreInfoClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowDownloadButton() {
            return this.showDownloadButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCopyToClipboardClick, params.onCopyToClipboardClick) && t.c(this.onMoreInfoClick, params.onMoreInfoClick) && t.c(this.onDownloadInsuranceConfirmationClick, params.onDownloadInsuranceConfirmationClick) && this.showDownloadButton == params.showDownloadButton;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final z21.f getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onCopyToClipboardClick.hashCode()) * 31) + this.onMoreInfoClick.hashCode()) * 31) + this.onDownloadInsuranceConfirmationClick.hashCode()) * 31) + Boolean.hashCode(this.showDownloadButton);
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onCopyToClipboardClick=" + this.onCopyToClipboardClick + ", onMoreInfoClick=" + this.onMoreInfoClick + ", onDownloadInsuranceConfirmationClick=" + this.onDownloadInsuranceConfirmationClick + ", showDownloadButton=" + this.showDownloadButton + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f22985c;

        static {
            int[] iArr = new int[TopAlertData.a.values().length];
            try {
                iArr[TopAlertData.a.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22983a = iArr;
            int[] iArr2 = new int[VehicleIdentifierData.a.values().length];
            try {
                iArr2[VehicleIdentifierData.a.INSURANCE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[VehicleIdentifierData.a.NUMBER_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VehicleIdentifierData.a.VIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f22984b = iArr2;
            int[] iArr3 = new int[InsuranceData.InsuranceValueData.EnumC5718a.values().length];
            try {
                iArr3[InsuranceData.InsuranceValueData.EnumC5718a.INSURANCE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[InsuranceData.InsuranceValueData.EnumC5718a.NUMBER_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[InsuranceData.InsuranceValueData.EnumC5718a.VEHICLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[InsuranceData.InsuranceValueData.EnumC5718a.ISSUING_INSURER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[InsuranceData.InsuranceValueData.EnumC5718a.RESPONSIBLE_INSURER.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[InsuranceData.InsuranceValueData.EnumC5718a.INSURANCE_END_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f22985c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f22986a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1976674150);
            if (p076m2.t.k()) {
                p076m2.t.o(1976674150, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.mapper.InsuranceMapper.createDownloadInsuranceConfirmationButton.<anonymous> (InsuranceMapper.kt:145)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22987a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1915474589);
            if (p076m2.t.k()) {
                p076m2.t.o(-1915474589, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.mapper.InsuranceMapper.createDownloadInsuranceConfirmationButton.<anonymous> (InsuranceMapper.kt:153)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    /* JADX INFO: renamed from: c31.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0608e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0608e f22988a = new C0608e();

        C0608e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1434099156);
            if (p076m2.t.k()) {
                p076m2.t.o(-1434099156, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.mapper.InsuranceMapper.invoke.<anonymous>.<anonymous> (InsuranceMapper.kt:81)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jD;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<c30.b.c> h(final l<? super f31.a, i0> onMoreInfo) {
        return v.q(new c30.b.c(null, null, this.labelProvider.c(t21.a.f187183t), this.labelProvider.c(t21.a.f187182s), null, null, new c30.a.ButtonText(new ButtonTextData("moreInfoCollision", this.labelProvider.c(t21.a.f187172l0), null, null, new er.a() { // from class: c31.b
            @Override // er.a
            public final Object a() {
                return e.i(onMoreInfo);
            }
        }, 12, null)), 51, null), new c30.b.c(null, null, this.labelProvider.c(t21.a.f187181r), this.labelProvider.c(t21.a.f187180q), null, null, new c30.a.ButtonText(new ButtonTextData("moreInfoVehicleBuy", this.labelProvider.c(t21.a.f187172l0), null, null, new er.a() { // from class: c31.c
            @Override // er.a
            public final Object a() {
                return e.l(onMoreInfo);
            }
        }, 12, null)), 51, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar) {
        lVar.b(f31.a.Collision);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar) {
        lVar.b(f31.a.VehicleBuy);
        return i0.f148189a;
    }

    private final DefaultSingleCardData m(Params params) {
        return new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(t21.a.f187162g0), null, d.f22987a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106751d, null, c.f22986a, null, null, 26, null), 3, null), null, null, 3325, null);
    }

    private final List<CardListData> q(VehicleInsuranceVerificationData vehicleInsuranceVerificationData, final l<? super String, i0> lVar) {
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        List<InsuranceData> listB = vehicleInsuranceVerificationData.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            List<InsuranceData.InsuranceValueData> listA = ((InsuranceData) it.next()).a();
            ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
            for (final InsuranceData.InsuranceValueData insuranceValueData : listA) {
                switch (b.f22985c[insuranceValueData.getType().ordinal()]) {
                    case 1:
                        defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(t21.a.M), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(insuranceValueData.getValue(), "insuranceSectionInsuranceNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(t21.a.f187158e0), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: c31.d
                            @Override // er.a
                            public final Object a() {
                                return e.r(lVar, insuranceValueData);
                            }
                        }, 35, null)), null, 2815, null);
                        arrayList2.add(defaultSingleCardData);
                        break;
                    case 2:
                        defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(t21.a.P), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(insuranceValueData.getValue(), "insuranceSectionNumberPlate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
                        arrayList2.add(defaultSingleCardData);
                        break;
                    case 3:
                        defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(t21.a.F), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(insuranceValueData.getValue(), "insuranceSectionVehicle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
                        arrayList2.add(defaultSingleCardData);
                        break;
                    case 4:
                        n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(insuranceValueData.getValue(), "insuranceSectionIssuingInsurer"), null, null, 0, 0, null, 62, null));
                        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(t21.a.G), null, null, 0, 0, null, 62, null);
                        String additionalValue = insuranceValueData.getAdditionalValue();
                        defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, title, additionalValue != null ? new SingleCardLabel(mx.b.b(additionalValue, "insuranceSectionIssuingInsurerAdditionalValue"), null, null, 0, 0, null, 62, null) : null), null, null, null, 3839, null);
                        defaultSingleCardData = defaultSingleCardData2;
                        arrayList2.add(defaultSingleCardData);
                        break;
                    case 5:
                        n50.b.Title title2 = new n50.b.Title(new SingleCardLabel(mx.b.b(insuranceValueData.getValue(), "insuranceSectionResponsibleInsurer"), null, null, 0, 0, null, 62, null));
                        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(t21.a.H), null, null, 0, 0, null, 62, null);
                        String additionalValue2 = insuranceValueData.getAdditionalValue();
                        defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, title2, additionalValue2 != null ? new SingleCardLabel(mx.b.b(additionalValue2, "insuranceSectionResponsibleInsurerAdditionalValue"), null, null, 0, 0, null, 62, null) : null), null, null, null, 3839, null);
                        defaultSingleCardData = defaultSingleCardData2;
                        arrayList2.add(defaultSingleCardData);
                        break;
                    case 6:
                        defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(t21.a.f187185v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(insuranceValueData.getValue(), "insuranceSectionInsuranceEndDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
                        arrayList2.add(defaultSingleCardData);
                        break;
                    default:
                        throw new oq.p();
                }
            }
            arrayList.add(new CardListData(arrayList2, null, false, null, null, 30, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, InsuranceData.InsuranceValueData insuranceValueData) {
        lVar.b(insuranceValueData.getValue());
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> s(VehicleInsuranceVerificationData vehicleInsuranceVerificationData) {
        BodySection bodySection;
        int i15 = b.f22984b[vehicleInsuranceVerificationData.getVehicleIdentifier().getType().ordinal()];
        if (i15 == 1) {
            bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(t21.a.M), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(vehicleInsuranceVerificationData.getVehicleIdentifier().getValue(), "vehicleIdentifierInsuranceNumber"), null, null, 0, 0, null, 62, null)), null, 4, null);
        } else if (i15 == 2) {
            SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(t21.a.P), null, null, 0, 0, null, 62, null);
            n50.b statusBadge = new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.b(vehicleInsuranceVerificationData.getVehicleIdentifier().getValue(), "vehicleIdentifierNumberPlate"), null, 0, false, r50.g.NOTICE, 13, null));
            if (vehicleInsuranceVerificationData.getVehicleIdentifier().getAdditionalValue() == null) {
                statusBadge = null;
            }
            if (statusBadge == null) {
                statusBadge = new n50.b.Title(new SingleCardLabel(mx.b.b(vehicleInsuranceVerificationData.getVehicleIdentifier().getValue(), "vehicleIdentifierNumberPlate"), null, null, 0, 0, null, 62, null));
            }
            bodySection = new BodySection(singleCardLabel, statusBadge, vehicleInsuranceVerificationData.getVehicleIdentifier().getAdditionalValue() != null ? new SingleCardLabel(this.labelProvider.c(t21.a.D), null, null, 0, 0, null, 62, null) : null);
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(t21.a.T), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(vehicleInsuranceVerificationData.getVehicleIdentifier().getValue(), "vehicleIdentifierNumberPlate"), null, null, 0, 0, null, 62, null)), null, 4, null);
        }
        return v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(t21.a.K), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(vehicleInsuranceVerificationData.getInsuranceVerificationDate().getValue(), "vehicleIdentifierInsuranceDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final List<t40.a.C4874a> u() {
        mx.c cVar = this.labelProvider;
        return v.q(new t40.a.C4874a(cVar.c(t21.a.f187186w)), new t40.a.C4874a(cVar.c(t21.a.f187187x)), new t40.a.C4874a(cVar.c(t21.a.f187188y)), new t40.a.C4874a(cVar.c(t21.a.f187189z)));
    }

    public final Label v() {
        return this.labelProvider.c(t21.a.C);
    }

    @Override // er.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        g.Data.InterfaceC6236a failure;
        c30.b.e eVar;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(t21.a.I), null, null, null, 28, null), null, null, null, null, 61, null);
        VehicleInsuranceVerificationData insuranceData = params.getState().getInsuranceData();
        if (insuranceData.b().isEmpty()) {
            j.b.a aVar = j.b.a.f164684d;
            Label labelC = this.labelProvider.c(t21.a.B);
            CardListData cardListData = new CardListData(s(insuranceData), null, false, null, null, 30, null);
            Label labelC2 = this.labelProvider.c(t21.a.A);
            InfoRowListData infoRowListData = new InfoRowListData(u());
            List<c30.b.c> listH = h(params.d());
            boolean showDownloadButton = params.getShowDownloadButton();
            Boolean boolValueOf = Boolean.valueOf(showDownloadButton);
            if (!showDownloadButton) {
                boolValueOf = null;
            }
            DefaultSingleCardData defaultSingleCardDataM = boolValueOf != null ? m(params) : null;
            z21.f state = params.getState();
            z21.f.Dialog dialog = state instanceof z21.f.Dialog ? (z21.f.Dialog) state : null;
            failure = new g.Data.InterfaceC6236a.Failure(new IconPageData(aVar, labelC, null, null, new g.Data.InterfaceC6236a.Failure.ContentData(cardListData, labelC2, infoRowListData, listH, defaultSingleCardDataM, dialog != null ? dialog.getDialogVmsAdapter() : null), null, true, 12, null));
        } else {
            TopAlertData topAlertData = insuranceData.getTopAlertData();
            if (topAlertData != null) {
                if (b.f22983a[topAlertData.getType().ordinal()] != 1) {
                    throw new oq.p();
                }
                eVar = new c30.b.e(null, null, mx.b.b(topAlertData.getTitle(), "statementAlertTitle"), mx.b.b(topAlertData.getDescription(), "statementAlertDescription"), null, null, null, 115, null);
            } else {
                eVar = null;
            }
            d40.b.C0864b c0864b = new d40.b.C0864b(null, j.b.c.f164688d.getIconResId(), d40.i.j.f39713e, C0608e.f22988a, null, d40.j.ENABLED);
            Label labelC3 = this.labelProvider.c(t21.a.E);
            CardListData cardListData2 = new CardListData(s(insuranceData), null, false, null, null, 30, null);
            Label labelC4 = this.labelProvider.c(t21.a.f187184u);
            List<CardListData> listQ = q(insuranceData, params.b());
            List<c30.b.c> listH2 = h(params.d());
            boolean showDownloadButton2 = params.getShowDownloadButton();
            Boolean boolValueOf2 = Boolean.valueOf(showDownloadButton2);
            if (!showDownloadButton2) {
                boolValueOf2 = null;
            }
            DefaultSingleCardData defaultSingleCardDataM2 = boolValueOf2 != null ? m(params) : null;
            z21.f state2 = params.getState();
            z21.f.Dialog dialog2 = state2 instanceof z21.f.Dialog ? (z21.f.Dialog) state2 : null;
            failure = new g.Data.InterfaceC6236a.Success(eVar, c0864b, labelC3, cardListData2, labelC4, listQ, listH2, defaultSingleCardDataM2, dialog2 != null ? dialog2.getDialogVmsAdapter() : null);
        }
        return new g.Data(baseScaffoldData, failure);
    }
}
