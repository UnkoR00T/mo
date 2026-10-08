package yb1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lyb1/f;", "", "b", "a", "c", "Lyb1/f$a;", "Lyb1/f$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyb1/f$b;", "Lyb1/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f225987a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1119467813;
        }

        public String toString() {
            return "LoadData";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lyb1/f$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        AddressSelected,
        EnterNewAddress,
        NoSelection;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f225992e = wq.b.a(b());
    }

    /* JADX INFO: renamed from: yb1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lyb1/f$a;", "Lyb1/f;", "Lhb1/c;", "selectedAddress", "", "previouslyGatheredAddresses", "Lyb1/f$c;", "selectionState", "Lhz/b;", "validation", "<init>", "(Lhb1/c;Ljava/util/List;Lyb1/f$c;Lhz/b;)V", "a", "(Lhb1/c;Ljava/util/List;Lyb1/f$c;Lhz/b;)Lyb1/f$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhb1/c;", "d", "()Lhb1/c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lyb1/f$c;", "e", "()Lyb1/f$c;", "Lhz/b;", "f", "()Lhz/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataDisplayed implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb1.c selectedAddress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<hb1.c> previouslyGatheredAddresses;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c selectionState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validation;

        public DataDisplayed(hb1.c cVar, List<hb1.c> list, c cVar2, hz.b bVar) {
            this.selectedAddress = cVar;
            this.previouslyGatheredAddresses = list;
            this.selectionState = cVar2;
            this.validation = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataDisplayed b(DataDisplayed dataDisplayed, hb1.c cVar, List list, c cVar2, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cVar = dataDisplayed.selectedAddress;
            }
            if ((i15 & 2) != 0) {
                list = dataDisplayed.previouslyGatheredAddresses;
            }
            if ((i15 & 4) != 0) {
                cVar2 = dataDisplayed.selectionState;
            }
            if ((i15 & 8) != 0) {
                bVar = dataDisplayed.validation;
            }
            return dataDisplayed.a(cVar, list, cVar2, bVar);
        }

        public final DataDisplayed a(hb1.c selectedAddress, List<hb1.c> previouslyGatheredAddresses, c selectionState, hz.b validation) {
            return new DataDisplayed(selectedAddress, previouslyGatheredAddresses, selectionState, validation);
        }

        public final List<hb1.c> c() {
            return this.previouslyGatheredAddresses;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hb1.c getSelectedAddress() {
            return this.selectedAddress;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final c getSelectionState() {
            return this.selectionState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataDisplayed)) {
                return false;
            }
            DataDisplayed dataDisplayed = (DataDisplayed) other;
            return fr.t.c(this.selectedAddress, dataDisplayed.selectedAddress) && fr.t.c(this.previouslyGatheredAddresses, dataDisplayed.previouslyGatheredAddresses) && this.selectionState == dataDisplayed.selectionState && fr.t.c(this.validation, dataDisplayed.validation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final hz.b getValidation() {
            return this.validation;
        }

        public int hashCode() {
            hb1.c cVar = this.selectedAddress;
            return ((((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.previouslyGatheredAddresses.hashCode()) * 31) + this.selectionState.hashCode()) * 31) + this.validation.hashCode();
        }

        public String toString() {
            return "DataDisplayed(selectedAddress=" + this.selectedAddress + ", previouslyGatheredAddresses=" + this.previouslyGatheredAddresses + ", selectionState=" + this.selectionState + ", validation=" + this.validation + ')';
        }

        public /* synthetic */ DataDisplayed(hb1.c cVar, List list, c cVar2, hz.b bVar, int i15, fr.k kVar) {
            this(cVar, list, cVar2, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }
}
