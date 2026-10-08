package yt3;

import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormData;

/* JADX INFO: renamed from: yt3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lyt3/b;", "", "Lst3/d;", "addressFormData", "Lst3/g;", "addressFormVMS", "Lst3/b;", "addressData", "<init>", "(Lst3/d;Lst3/g;Lst3/b;)V", "a", "(Lst3/d;Lst3/g;Lst3/b;)Lyt3/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lst3/d;", "d", "()Lst3/d;", "b", "Lst3/g;", "e", "()Lst3/g;", "c", "Lst3/b;", "()Lst3/b;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressFormData addressFormData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final st3.g addressFormVMS;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressData addressData;

    public State(AddressFormData addressFormData, st3.g gVar, AddressData addressData) {
        this.addressFormData = addressFormData;
        this.addressFormVMS = gVar;
        this.addressData = addressData;
    }

    public static /* synthetic */ State b(State state, AddressFormData addressFormData, st3.g gVar, AddressData addressData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            addressFormData = state.addressFormData;
        }
        if ((i15 & 2) != 0) {
            gVar = state.addressFormVMS;
        }
        if ((i15 & 4) != 0) {
            addressData = state.addressData;
        }
        return state.a(addressFormData, gVar, addressData);
    }

    public final State a(AddressFormData addressFormData, st3.g addressFormVMS, AddressData addressData) {
        return new State(addressFormData, addressFormVMS, addressData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AddressData getAddressData() {
        return this.addressData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AddressFormData getAddressFormData() {
        return this.addressFormData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final st3.g getAddressFormVMS() {
        return this.addressFormVMS;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.addressFormData, state.addressFormData) && fr.t.c(this.addressFormVMS, state.addressFormVMS) && fr.t.c(this.addressData, state.addressData);
    }

    public int hashCode() {
        int iHashCode = ((this.addressFormData.hashCode() * 31) + this.addressFormVMS.hashCode()) * 31;
        AddressData addressData = this.addressData;
        return iHashCode + (addressData == null ? 0 : addressData.hashCode());
    }

    public String toString() {
        return "State(addressFormData=" + this.addressFormData + ", addressFormVMS=" + this.addressFormVMS + ", addressData=" + this.addressData + ')';
    }

    public /* synthetic */ State(AddressFormData addressFormData, st3.g gVar, AddressData addressData, int i15, fr.k kVar) {
        this(addressFormData, gVar, (i15 & 4) != 0 ? null : addressData);
    }
}
