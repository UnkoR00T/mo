package gf2;

import java.util.List;
import kf2.InternetContactInfoData;
import p071kotlin.Metadata;
import pf2.InternetParametersData;
import st3.AddressData;
import uf2.OperatorItem;
import zi0.InternetAddressPoint;

/* JADX INFO: renamed from: gf2.g1, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lgf2/g1;", "", "Lpf2/e;", "parameters", "Lst3/b;", "address", "Lzi0/a;", "addressPoint", "", "Luf2/a;", "operatorList", "Lkf2/k;", "contactInfo", "<init>", "(Lpf2/e;Lst3/b;Lzi0/a;Ljava/util/List;Lkf2/k;)V", "a", "(Lpf2/e;Lst3/b;Lzi0/a;Ljava/util/List;Lkf2/k;)Lgf2/g1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpf2/e;", "g", "()Lpf2/e;", "b", "Lst3/b;", "c", "()Lst3/b;", "Lzi0/a;", "d", "()Lzi0/a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lkf2/k;", "()Lkf2/k;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

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

    public State(InternetParametersData internetParametersData, AddressData addressData, InternetAddressPoint internetAddressPoint, List<OperatorItem> list, InternetContactInfoData internetContactInfoData) {
        this.parameters = internetParametersData;
        this.address = addressData;
        this.addressPoint = internetAddressPoint;
        this.operatorList = list;
        this.contactInfo = internetContactInfoData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, InternetParametersData internetParametersData, AddressData addressData, InternetAddressPoint internetAddressPoint, List list, InternetContactInfoData internetContactInfoData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            internetParametersData = state.parameters;
        }
        if ((i15 & 2) != 0) {
            addressData = state.address;
        }
        if ((i15 & 4) != 0) {
            internetAddressPoint = state.addressPoint;
        }
        if ((i15 & 8) != 0) {
            list = state.operatorList;
        }
        if ((i15 & 16) != 0) {
            internetContactInfoData = state.contactInfo;
        }
        InternetContactInfoData internetContactInfoData2 = internetContactInfoData;
        InternetAddressPoint internetAddressPoint2 = internetAddressPoint;
        return state.a(internetParametersData, addressData, internetAddressPoint2, list, internetContactInfoData2);
    }

    public final State a(InternetParametersData parameters, AddressData address, InternetAddressPoint addressPoint, List<OperatorItem> operatorList, InternetContactInfoData contactInfo) {
        return new State(parameters, address, addressPoint, operatorList, contactInfo);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AddressData getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InternetAddressPoint getAddressPoint() {
        return this.addressPoint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InternetContactInfoData getContactInfo() {
        return this.contactInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.parameters, state.parameters) && fr.t.c(this.address, state.address) && fr.t.c(this.addressPoint, state.addressPoint) && fr.t.c(this.operatorList, state.operatorList) && fr.t.c(this.contactInfo, state.contactInfo);
    }

    public final List<OperatorItem> f() {
        return this.operatorList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InternetParametersData getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        InternetParametersData internetParametersData = this.parameters;
        int iHashCode = (internetParametersData == null ? 0 : internetParametersData.hashCode()) * 31;
        AddressData addressData = this.address;
        int iHashCode2 = (iHashCode + (addressData == null ? 0 : addressData.hashCode())) * 31;
        InternetAddressPoint internetAddressPoint = this.addressPoint;
        int iHashCode3 = (iHashCode2 + (internetAddressPoint == null ? 0 : internetAddressPoint.hashCode())) * 31;
        List<OperatorItem> list = this.operatorList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        InternetContactInfoData internetContactInfoData = this.contactInfo;
        return iHashCode4 + (internetContactInfoData != null ? internetContactInfoData.hashCode() : 0);
    }

    public String toString() {
        return "State(parameters=" + this.parameters + ", address=" + this.address + ", addressPoint=" + this.addressPoint + ", operatorList=" + this.operatorList + ", contactInfo=" + this.contactInfo + ')';
    }
}
