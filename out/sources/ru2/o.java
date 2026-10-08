package ru2;

import a50.RadioButtonData;
import mx.Label;
import p071kotlin.Metadata;
import vu2.PeselVerificationInputData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lru2/o;", "Ll00/e;", "Lru2/o$a;", "a", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o extends l00.e<Data> {

    /* JADX INFO: renamed from: ru2.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0016\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0016\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0016\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0016\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0016\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b0\u00103R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b-\u00103R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b:\u00103R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b;\u0010AR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\b9\u0010AR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bB\u0010AR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\b7\u0010AR\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\b5\u0010AR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00168\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bE\u0010HR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00168\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bI\u0010HR#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00168\u0006¢\u0006\f\n\u0004\b=\u0010G\u001a\u0004\bJ\u0010HR#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00168\u0006¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bD\u0010HR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00168\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bC\u0010HR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b8\u0010L\u001a\u0004\bM\u0010NR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u00168\u0006¢\u0006\f\n\u0004\bO\u0010G\u001a\u0004\bP\u0010HR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bK\u0010S¨\u0006T"}, d2 = {"Lru2/o$a;", "", "", "companyDataTitle", "Lmx/a;", "companyDataNameInputLabel", "cityInputLabel", "postalCodeInputLabel", "streetInputLabel", "buildingInputNumber", "apartmentNumberInputLabel", "nextButtonLabel", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "Lvu2/a;", "companyNameScreenData", "companyCityScreenData", "companyPostalCodeScreenData", "companyStreetScreenData", "companyBuildingScreenData", "companyApartmentScreenData", "Lkotlin/Function1;", "onCompanyNameChanged", "onCompanyCityChanged", "onCompanyPostalCodeChanged", "onCompanyStreetChanged", "onCompanyBuildingNumberChanged", "onCompanyApartmentNumberChanged", "Lbu2/a;", "selectedRadioButtonId", "onCompanyIdRadioButtonSelected", "La50/a;", "radioButtonData", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ler/a;Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Lbu2/a;Ler/l;La50/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "d", "t", "e", "v", "f", "l", "i", "Ler/a;", "s", "()Ler/a;", "j", "Lvu2/a;", "()Lvu2/a;", "k", "m", "n", "o", "p", "Ler/l;", "()Ler/l;", "q", "r", "u", "Lbu2/a;", "getSelectedRadioButtonId", "()Lbu2/a;", "w", "getOnCompanyIdRadioButtonSelected", "x", "La50/a;", "()La50/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f176210y = RadioButtonData.f3462h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String companyDataTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label companyDataNameInputLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label cityInputLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label postalCodeInputLabel;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label streetInputLabel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label buildingInputNumber;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label apartmentNumberInputLabel;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label nextButtonLabel;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onNextButtonClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData companyNameScreenData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData companyCityScreenData;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData companyPostalCodeScreenData;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData companyStreetScreenData;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData companyBuildingScreenData;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData companyApartmentScreenData;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyNameChanged;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyCityChanged;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyPostalCodeChanged;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyStreetChanged;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyBuildingNumberChanged;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyApartmentNumberChanged;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final bu2.a selectedRadioButtonId;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<bu2.a, oq.i0> onCompanyIdRadioButtonSelected;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData radioButtonData;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(String str, Label label, Label label2, Label label3, Label label4, Label label5, Label label6, Label label7, er.a<oq.i0> aVar, PeselVerificationInputData peselVerificationInputData, PeselVerificationInputData peselVerificationInputData2, PeselVerificationInputData peselVerificationInputData3, PeselVerificationInputData peselVerificationInputData4, PeselVerificationInputData peselVerificationInputData5, PeselVerificationInputData peselVerificationInputData6, er.l<? super String, oq.i0> lVar, er.l<? super String, oq.i0> lVar2, er.l<? super String, oq.i0> lVar3, er.l<? super String, oq.i0> lVar4, er.l<? super String, oq.i0> lVar5, er.l<? super String, oq.i0> lVar6, bu2.a aVar2, er.l<? super bu2.a, oq.i0> lVar7, RadioButtonData radioButtonData) {
            this.companyDataTitle = str;
            this.companyDataNameInputLabel = label;
            this.cityInputLabel = label2;
            this.postalCodeInputLabel = label3;
            this.streetInputLabel = label4;
            this.buildingInputNumber = label5;
            this.apartmentNumberInputLabel = label6;
            this.nextButtonLabel = label7;
            this.onNextButtonClick = aVar;
            this.companyNameScreenData = peselVerificationInputData;
            this.companyCityScreenData = peselVerificationInputData2;
            this.companyPostalCodeScreenData = peselVerificationInputData3;
            this.companyStreetScreenData = peselVerificationInputData4;
            this.companyBuildingScreenData = peselVerificationInputData5;
            this.companyApartmentScreenData = peselVerificationInputData6;
            this.onCompanyNameChanged = lVar;
            this.onCompanyCityChanged = lVar2;
            this.onCompanyPostalCodeChanged = lVar3;
            this.onCompanyStreetChanged = lVar4;
            this.onCompanyBuildingNumberChanged = lVar5;
            this.onCompanyApartmentNumberChanged = lVar6;
            this.selectedRadioButtonId = aVar2;
            this.onCompanyIdRadioButtonSelected = lVar7;
            this.radioButtonData = radioButtonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getApartmentNumberInputLabel() {
            return this.apartmentNumberInputLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getBuildingInputNumber() {
            return this.buildingInputNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getCityInputLabel() {
            return this.cityInputLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PeselVerificationInputData getCompanyApartmentScreenData() {
            return this.companyApartmentScreenData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PeselVerificationInputData getCompanyBuildingScreenData() {
            return this.companyBuildingScreenData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.companyDataTitle, data.companyDataTitle) && fr.t.c(this.companyDataNameInputLabel, data.companyDataNameInputLabel) && fr.t.c(this.cityInputLabel, data.cityInputLabel) && fr.t.c(this.postalCodeInputLabel, data.postalCodeInputLabel) && fr.t.c(this.streetInputLabel, data.streetInputLabel) && fr.t.c(this.buildingInputNumber, data.buildingInputNumber) && fr.t.c(this.apartmentNumberInputLabel, data.apartmentNumberInputLabel) && fr.t.c(this.nextButtonLabel, data.nextButtonLabel) && fr.t.c(this.onNextButtonClick, data.onNextButtonClick) && fr.t.c(this.companyNameScreenData, data.companyNameScreenData) && fr.t.c(this.companyCityScreenData, data.companyCityScreenData) && fr.t.c(this.companyPostalCodeScreenData, data.companyPostalCodeScreenData) && fr.t.c(this.companyStreetScreenData, data.companyStreetScreenData) && fr.t.c(this.companyBuildingScreenData, data.companyBuildingScreenData) && fr.t.c(this.companyApartmentScreenData, data.companyApartmentScreenData) && fr.t.c(this.onCompanyNameChanged, data.onCompanyNameChanged) && fr.t.c(this.onCompanyCityChanged, data.onCompanyCityChanged) && fr.t.c(this.onCompanyPostalCodeChanged, data.onCompanyPostalCodeChanged) && fr.t.c(this.onCompanyStreetChanged, data.onCompanyStreetChanged) && fr.t.c(this.onCompanyBuildingNumberChanged, data.onCompanyBuildingNumberChanged) && fr.t.c(this.onCompanyApartmentNumberChanged, data.onCompanyApartmentNumberChanged) && this.selectedRadioButtonId == data.selectedRadioButtonId && fr.t.c(this.onCompanyIdRadioButtonSelected, data.onCompanyIdRadioButtonSelected) && fr.t.c(this.radioButtonData, data.radioButtonData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final PeselVerificationInputData getCompanyCityScreenData() {
            return this.companyCityScreenData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getCompanyDataNameInputLabel() {
            return this.companyDataNameInputLabel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getCompanyDataTitle() {
            return this.companyDataTitle;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((this.companyDataTitle.hashCode() * 31) + this.companyDataNameInputLabel.hashCode()) * 31) + this.cityInputLabel.hashCode()) * 31) + this.postalCodeInputLabel.hashCode()) * 31) + this.streetInputLabel.hashCode()) * 31) + this.buildingInputNumber.hashCode()) * 31) + this.apartmentNumberInputLabel.hashCode()) * 31) + this.nextButtonLabel.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.companyNameScreenData.hashCode()) * 31) + this.companyCityScreenData.hashCode()) * 31) + this.companyPostalCodeScreenData.hashCode()) * 31) + this.companyStreetScreenData.hashCode()) * 31) + this.companyBuildingScreenData.hashCode()) * 31) + this.companyApartmentScreenData.hashCode()) * 31) + this.onCompanyNameChanged.hashCode()) * 31) + this.onCompanyCityChanged.hashCode()) * 31) + this.onCompanyPostalCodeChanged.hashCode()) * 31) + this.onCompanyStreetChanged.hashCode()) * 31) + this.onCompanyBuildingNumberChanged.hashCode()) * 31) + this.onCompanyApartmentNumberChanged.hashCode()) * 31) + this.selectedRadioButtonId.hashCode()) * 31) + this.onCompanyIdRadioButtonSelected.hashCode()) * 31) + this.radioButtonData.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final PeselVerificationInputData getCompanyNameScreenData() {
            return this.companyNameScreenData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final PeselVerificationInputData getCompanyPostalCodeScreenData() {
            return this.companyPostalCodeScreenData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final PeselVerificationInputData getCompanyStreetScreenData() {
            return this.companyStreetScreenData;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Label getNextButtonLabel() {
            return this.nextButtonLabel;
        }

        public final er.l<String, oq.i0> m() {
            return this.onCompanyApartmentNumberChanged;
        }

        public final er.l<String, oq.i0> n() {
            return this.onCompanyBuildingNumberChanged;
        }

        public final er.l<String, oq.i0> o() {
            return this.onCompanyCityChanged;
        }

        public final er.l<String, oq.i0> p() {
            return this.onCompanyNameChanged;
        }

        public final er.l<String, oq.i0> q() {
            return this.onCompanyPostalCodeChanged;
        }

        public final er.l<String, oq.i0> r() {
            return this.onCompanyStreetChanged;
        }

        public final er.a<oq.i0> s() {
            return this.onNextButtonClick;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Label getPostalCodeInputLabel() {
            return this.postalCodeInputLabel;
        }

        public String toString() {
            return "Data(companyDataTitle=" + this.companyDataTitle + ", companyDataNameInputLabel=" + this.companyDataNameInputLabel + ", cityInputLabel=" + this.cityInputLabel + ", postalCodeInputLabel=" + this.postalCodeInputLabel + ", streetInputLabel=" + this.streetInputLabel + ", buildingInputNumber=" + this.buildingInputNumber + ", apartmentNumberInputLabel=" + this.apartmentNumberInputLabel + ", nextButtonLabel=" + this.nextButtonLabel + ", onNextButtonClick=" + this.onNextButtonClick + ", companyNameScreenData=" + this.companyNameScreenData + ", companyCityScreenData=" + this.companyCityScreenData + ", companyPostalCodeScreenData=" + this.companyPostalCodeScreenData + ", companyStreetScreenData=" + this.companyStreetScreenData + ", companyBuildingScreenData=" + this.companyBuildingScreenData + ", companyApartmentScreenData=" + this.companyApartmentScreenData + ", onCompanyNameChanged=" + this.onCompanyNameChanged + ", onCompanyCityChanged=" + this.onCompanyCityChanged + ", onCompanyPostalCodeChanged=" + this.onCompanyPostalCodeChanged + ", onCompanyStreetChanged=" + this.onCompanyStreetChanged + ", onCompanyBuildingNumberChanged=" + this.onCompanyBuildingNumberChanged + ", onCompanyApartmentNumberChanged=" + this.onCompanyApartmentNumberChanged + ", selectedRadioButtonId=" + this.selectedRadioButtonId + ", onCompanyIdRadioButtonSelected=" + this.onCompanyIdRadioButtonSelected + ", radioButtonData=" + this.radioButtonData + ')';
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final RadioButtonData getRadioButtonData() {
            return this.radioButtonData;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final Label getStreetInputLabel() {
            return this.streetInputLabel;
        }
    }
}
