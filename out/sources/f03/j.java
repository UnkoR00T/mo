package f03;

import bh0.RegisteredAddress;
import bh0.RegisteredAddressDetails;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lf03/j;", "", "b", "a", "c", "Lf03/j$a;", "Lf03/j$b;", "Lf03/j$c;", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: f03.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf03/j$a;", "Lf03/j;", "Lbh0/c;", "addressDetails", "<init>", "(Lbh0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbh0/c;", "()Lbh0/c;", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RegisteredAddressDetails addressDetails;

        public Empty(RegisteredAddressDetails registeredAddressDetails) {
            this.addressDetails = registeredAddressDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RegisteredAddressDetails getAddressDetails() {
            return this.addressDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && fr.t.c(this.addressDetails, ((Empty) other).addressDetails);
        }

        public int hashCode() {
            return this.addressDetails.hashCode();
        }

        public String toString() {
            return "Empty(addressDetails=" + this.addressDetails + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf03/j$b;", "Lf03/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f54606a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -724786469;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: f03.j$c, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006)"}, d2 = {"Lf03/j$c;", "Lf03/j;", "", "isAddressOutdated", "shouldDisplayOutdatedAlert", "Lbh0/c;", "addressDetails", "Lbh0/b;", "selectedAddress", "Ly30/n$b$b;", "selectedItem", "autoFocusOnSelectedTab", "<init>", "(ZZLbh0/c;Lbh0/b;Ly30/n$b$b;Z)V", "a", "(ZZLbh0/c;Lbh0/b;Ly30/n$b$b;Z)Lf03/j$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "h", "()Z", "b", "g", "c", "Lbh0/c;", "()Lbh0/c;", "d", "Lbh0/b;", "e", "()Lbh0/b;", "Ly30/n$b$b;", "f", "()Ly30/n$b$b;", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAddressOutdated;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldDisplayOutdatedAlert;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final RegisteredAddressDetails addressDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final RegisteredAddress selectedAddress;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedItem;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoFocusOnSelectedTab;

        public Initialized(boolean z15, boolean z16, RegisteredAddressDetails registeredAddressDetails, RegisteredAddress registeredAddress, y30.n.Switch.EnumC5973b enumC5973b, boolean z17) {
            this.isAddressOutdated = z15;
            this.shouldDisplayOutdatedAlert = z16;
            this.addressDetails = registeredAddressDetails;
            this.selectedAddress = registeredAddress;
            this.selectedItem = enumC5973b;
            this.autoFocusOnSelectedTab = z17;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, boolean z15, boolean z16, RegisteredAddressDetails registeredAddressDetails, RegisteredAddress registeredAddress, y30.n.Switch.EnumC5973b enumC5973b, boolean z17, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = initialized.isAddressOutdated;
            }
            if ((i15 & 2) != 0) {
                z16 = initialized.shouldDisplayOutdatedAlert;
            }
            if ((i15 & 4) != 0) {
                registeredAddressDetails = initialized.addressDetails;
            }
            if ((i15 & 8) != 0) {
                registeredAddress = initialized.selectedAddress;
            }
            if ((i15 & 16) != 0) {
                enumC5973b = initialized.selectedItem;
            }
            if ((i15 & 32) != 0) {
                z17 = initialized.autoFocusOnSelectedTab;
            }
            y30.n.Switch.EnumC5973b enumC5973b2 = enumC5973b;
            boolean z18 = z17;
            return initialized.a(z15, z16, registeredAddressDetails, registeredAddress, enumC5973b2, z18);
        }

        public final Initialized a(boolean isAddressOutdated, boolean shouldDisplayOutdatedAlert, RegisteredAddressDetails addressDetails, RegisteredAddress selectedAddress, y30.n.Switch.EnumC5973b selectedItem, boolean autoFocusOnSelectedTab) {
            return new Initialized(isAddressOutdated, shouldDisplayOutdatedAlert, addressDetails, selectedAddress, selectedItem, autoFocusOnSelectedTab);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final RegisteredAddressDetails getAddressDetails() {
            return this.addressDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getAutoFocusOnSelectedTab() {
            return this.autoFocusOnSelectedTab;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final RegisteredAddress getSelectedAddress() {
            return this.selectedAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.isAddressOutdated == initialized.isAddressOutdated && this.shouldDisplayOutdatedAlert == initialized.shouldDisplayOutdatedAlert && fr.t.c(this.addressDetails, initialized.addressDetails) && fr.t.c(this.selectedAddress, initialized.selectedAddress) && this.selectedItem == initialized.selectedItem && this.autoFocusOnSelectedTab == initialized.autoFocusOnSelectedTab;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedItem() {
            return this.selectedItem;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShouldDisplayOutdatedAlert() {
            return this.shouldDisplayOutdatedAlert;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsAddressOutdated() {
            return this.isAddressOutdated;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isAddressOutdated) * 31) + Boolean.hashCode(this.shouldDisplayOutdatedAlert)) * 31) + this.addressDetails.hashCode()) * 31;
            RegisteredAddress registeredAddress = this.selectedAddress;
            return ((((iHashCode + (registeredAddress == null ? 0 : registeredAddress.hashCode())) * 31) + this.selectedItem.hashCode()) * 31) + Boolean.hashCode(this.autoFocusOnSelectedTab);
        }

        public String toString() {
            return "Initialized(isAddressOutdated=" + this.isAddressOutdated + ", shouldDisplayOutdatedAlert=" + this.shouldDisplayOutdatedAlert + ", addressDetails=" + this.addressDetails + ", selectedAddress=" + this.selectedAddress + ", selectedItem=" + this.selectedItem + ", autoFocusOnSelectedTab=" + this.autoFocusOnSelectedTab + ')';
        }

        public /* synthetic */ Initialized(boolean z15, boolean z16, RegisteredAddressDetails registeredAddressDetails, RegisteredAddress registeredAddress, y30.n.Switch.EnumC5973b enumC5973b, boolean z17, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, z16, registeredAddressDetails, registeredAddress, enumC5973b, (i15 & 32) != 0 ? false : z17);
        }
    }
}
