package mf2;

import java.util.List;
import kf2.InternetContactInfoData;
import p071kotlin.Metadata;
import pf2.InternetParametersData;
import st3.AddressData;
import uf2.OperatorItem;
import zi0.InternetAddressPoint;

/* JADX INFO: renamed from: mf2.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b \u0010'¨\u0006("}, d2 = {"Lmf2/g;", "", "Lpf2/e;", "parameters", "Lst3/b;", "address", "Lzi0/a;", "addressPoint", "", "Luf2/a;", "operatorList", "Lkf2/k;", "contactInfo", "<init>", "(Lpf2/e;Lst3/b;Lzi0/a;Ljava/util/List;Lkf2/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpf2/e;", "e", "()Lpf2/e;", "b", "Lst3/b;", "()Lst3/b;", "c", "Lzi0/a;", "()Lzi0/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lkf2/k;", "()Lkf2/k;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormSummaryContractData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InternetParametersData parameters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressData address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InternetAddressPoint addressPoint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OperatorItem> operatorList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final InternetContactInfoData contactInfo;

    public FormSummaryContractData(InternetParametersData internetParametersData, AddressData addressData, InternetAddressPoint internetAddressPoint, List<OperatorItem> list, InternetContactInfoData internetContactInfoData) {
        this.parameters = internetParametersData;
        this.address = addressData;
        this.addressPoint = internetAddressPoint;
        this.operatorList = list;
        this.contactInfo = internetContactInfoData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AddressData getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InternetAddressPoint getAddressPoint() {
        return this.addressPoint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InternetContactInfoData getContactInfo() {
        return this.contactInfo;
    }

    public final List<OperatorItem> d() {
        return this.operatorList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InternetParametersData getParameters() {
        return this.parameters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormSummaryContractData)) {
            return false;
        }
        FormSummaryContractData formSummaryContractData = (FormSummaryContractData) other;
        return fr.t.c(this.parameters, formSummaryContractData.parameters) && fr.t.c(this.address, formSummaryContractData.address) && fr.t.c(this.addressPoint, formSummaryContractData.addressPoint) && fr.t.c(this.operatorList, formSummaryContractData.operatorList) && fr.t.c(this.contactInfo, formSummaryContractData.contactInfo);
    }

    public int hashCode() {
        return (((((((this.parameters.hashCode() * 31) + this.address.hashCode()) * 31) + this.addressPoint.hashCode()) * 31) + this.operatorList.hashCode()) * 31) + this.contactInfo.hashCode();
    }

    public String toString() {
        return "FormSummaryContractData(parameters=" + this.parameters + ", address=" + this.address + ", addressPoint=" + this.addressPoint + ", operatorList=" + this.operatorList + ", contactInfo=" + this.contactInfo + ')';
    }
}
