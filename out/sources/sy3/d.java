package sy3;

import al0.CommunityOffice;
import java.util.List;
import p071kotlin.Metadata;
import py3.OfficeSelectionData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lsy3/d;", "", "Lsy3/d$a;", "getData", "()Lsy3/d$a;", "data", "a", "b", "d", "c", "Lsy3/d$b;", "Lsy3/d$d;", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: sy3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsy3/d$a;", "", "Lpy3/b;", "setupData", "Lsy3/j;", "elementToAutoFocus", "<init>", "(Lpy3/b;Lsy3/j;)V", "a", "(Lpy3/b;Lsy3/j;)Lsy3/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpy3/b;", "d", "()Lpy3/b;", "b", "Lsy3/j;", "c", "()Lsy3/j;", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OfficeSelectionData setupData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final j elementToAutoFocus;

        public Data(OfficeSelectionData officeSelectionData, j jVar) {
            this.setupData = officeSelectionData;
            this.elementToAutoFocus = jVar;
        }

        public static /* synthetic */ Data b(Data data, OfficeSelectionData officeSelectionData, j jVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                officeSelectionData = data.setupData;
            }
            if ((i15 & 2) != 0) {
                jVar = data.elementToAutoFocus;
            }
            return data.a(officeSelectionData, jVar);
        }

        public final Data a(OfficeSelectionData setupData, j elementToAutoFocus) {
            return new Data(setupData, elementToAutoFocus);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final j getElementToAutoFocus() {
            return this.elementToAutoFocus;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final OfficeSelectionData getSetupData() {
            return this.setupData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.setupData, data.setupData) && this.elementToAutoFocus == data.elementToAutoFocus;
        }

        public int hashCode() {
            return (this.setupData.hashCode() * 31) + this.elementToAutoFocus.hashCode();
        }

        public String toString() {
            return "Data(setupData=" + this.setupData + ", elementToAutoFocus=" + this.elementToAutoFocus + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lsy3/d$b;", "Lsy3/d;", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Lsy3/e;", "Lsy3/g;", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends d {
        hb4.c a();
    }

    /* JADX INFO: renamed from: sy3.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lsy3/d$d;", "Lsy3/d;", "", "Lal0/v;", "b", "()Ljava/util/List;", "offices", "Lsy3/d$d$a;", "u", "()Lsy3/d$d$a;", "selectedOffice", "", "isValid", "()Z", "a", "Lsy3/f;", "Lsy3/h;", "Lsy3/d$c;", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC4804d extends d {

        /* JADX INFO: renamed from: sy3.d$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lsy3/d$d$a;", "", "Lal0/v;", "office", "", "edorAddress", "<init>", "(Lal0/v;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/v;", "b", "()Lal0/v;", "Ljava/lang/String;", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelectedOffice {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CommunityOffice office;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String edorAddress;

            public SelectedOffice(CommunityOffice communityOffice, String str) {
                this.office = communityOffice;
                this.edorAddress = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getEdorAddress() {
                return this.edorAddress;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CommunityOffice getOffice() {
                return this.office;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectedOffice)) {
                    return false;
                }
                SelectedOffice selectedOffice = (SelectedOffice) other;
                return fr.t.c(this.office, selectedOffice.office) && fr.t.c(this.edorAddress, selectedOffice.edorAddress);
            }

            public int hashCode() {
                return (this.office.hashCode() * 31) + this.edorAddress.hashCode();
            }

            public String toString() {
                return "SelectedOffice(office=" + this.office + ", edorAddress=" + this.edorAddress + ')';
            }
        }

        List<CommunityOffice> b();

        /* JADX INFO: renamed from: isValid */
        boolean getIsValid();

        /* JADX INFO: renamed from: u */
        SelectedOffice getSelectedOffice();
    }

    Data getData();

    /* JADX INFO: renamed from: sy3.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\n\u0010&R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lsy3/d$c;", "Lsy3/d$d;", "Lsy3/d$a;", "data", "", "Lal0/v;", "offices", "Lsy3/d$d$a;", "selectedOffice", "", "isValid", "scrollToDropdownField", "<init>", "(Lsy3/d$a;Ljava/util/List;Lsy3/d$d$a;ZZ)V", "c", "(Lsy3/d$a;Ljava/util/List;Lsy3/d$d$a;ZZ)Lsy3/d$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsy3/d$a;", "getData", "()Lsy3/d$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lsy3/d$d$a;", "u", "()Lsy3/d$d$a;", "d", "Z", "()Z", "e", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements InterfaceC4804d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CommunityOffice> offices;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC4804d.SelectedOffice selectedOffice;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValid;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToDropdownField;

        public Initialized(Data data, List<CommunityOffice> list, InterfaceC4804d.SelectedOffice selectedOffice, boolean z15, boolean z16) {
            this.data = data;
            this.offices = list;
            this.selectedOffice = selectedOffice;
            this.isValid = z15;
            this.scrollToDropdownField = z16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized d(Initialized initialized, Data data, List list, InterfaceC4804d.SelectedOffice selectedOffice, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                data = initialized.data;
            }
            if ((i15 & 2) != 0) {
                list = initialized.offices;
            }
            if ((i15 & 4) != 0) {
                selectedOffice = initialized.selectedOffice;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.isValid;
            }
            if ((i15 & 16) != 0) {
                z16 = initialized.scrollToDropdownField;
            }
            boolean z17 = z16;
            InterfaceC4804d.SelectedOffice selectedOffice2 = selectedOffice;
            return initialized.c(data, list, selectedOffice2, z15, z17);
        }

        @Override // sy3.d.InterfaceC4804d
        public List<CommunityOffice> b() {
            return this.offices;
        }

        public final Initialized c(Data data, List<CommunityOffice> offices, InterfaceC4804d.SelectedOffice selectedOffice, boolean isValid, boolean scrollToDropdownField) {
            return new Initialized(data, offices, selectedOffice, isValid, scrollToDropdownField);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getScrollToDropdownField() {
            return this.scrollToDropdownField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.data, initialized.data) && fr.t.c(this.offices, initialized.offices) && fr.t.c(this.selectedOffice, initialized.selectedOffice) && this.isValid == initialized.isValid && this.scrollToDropdownField == initialized.scrollToDropdownField;
        }

        @Override // sy3.d
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            int iHashCode = ((this.data.hashCode() * 31) + this.offices.hashCode()) * 31;
            InterfaceC4804d.SelectedOffice selectedOffice = this.selectedOffice;
            return ((((iHashCode + (selectedOffice == null ? 0 : selectedOffice.hashCode())) * 31) + Boolean.hashCode(this.isValid)) * 31) + Boolean.hashCode(this.scrollToDropdownField);
        }

        @Override // sy3.d.InterfaceC4804d
        /* JADX INFO: renamed from: isValid, reason: from getter */
        public boolean getIsValid() {
            return this.isValid;
        }

        public String toString() {
            return "Initialized(data=" + this.data + ", offices=" + this.offices + ", selectedOffice=" + this.selectedOffice + ", isValid=" + this.isValid + ", scrollToDropdownField=" + this.scrollToDropdownField + ')';
        }

        @Override // sy3.d.InterfaceC4804d
        /* JADX INFO: renamed from: u, reason: from getter */
        public InterfaceC4804d.SelectedOffice getSelectedOffice() {
            return this.selectedOffice;
        }

        public /* synthetic */ Initialized(Data data, List list, InterfaceC4804d.SelectedOffice selectedOffice, boolean z15, boolean z16, int i15, fr.k kVar) {
            this(data, list, selectedOffice, (i15 & 8) != 0 ? true : z15, (i15 & 16) != 0 ? false : z16);
        }
    }
}
