package yd1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lyd1/f;", "", "b", "a", "c", "Lyd1/f$a;", "Lyd1/f$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyd1/f$b;", "Lyd1/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f226515a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1991861450;
        }

        public String toString() {
            return "LoadData";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lyd1/f$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        PermanentAddressSelection,
        OtherAddressSelection,
        NoSelection;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f226520e = wq.b.a(b());
    }

    /* JADX INFO: renamed from: yd1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lyd1/f$a;", "Lyd1/f;", "Lhb1/c;", "previouslySelectedAddress", "permanentAddress", "Lyd1/f$c;", "selectionState", "Lhz/b;", "validation", "<init>", "(Lhb1/c;Lhb1/c;Lyd1/f$c;Lhz/b;)V", "a", "(Lhb1/c;Lhb1/c;Lyd1/f$c;Lhz/b;)Lyd1/f$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhb1/c;", "d", "()Lhb1/c;", "b", "c", "Lyd1/f$c;", "e", "()Lyd1/f$c;", "Lhz/b;", "f", "()Lhz/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataDisplayed implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb1.c previouslySelectedAddress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb1.c permanentAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c selectionState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validation;

        public DataDisplayed(hb1.c cVar, hb1.c cVar2, c cVar3, hz.b bVar) {
            this.previouslySelectedAddress = cVar;
            this.permanentAddress = cVar2;
            this.selectionState = cVar3;
            this.validation = bVar;
        }

        public static /* synthetic */ DataDisplayed b(DataDisplayed dataDisplayed, hb1.c cVar, hb1.c cVar2, c cVar3, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cVar = dataDisplayed.previouslySelectedAddress;
            }
            if ((i15 & 2) != 0) {
                cVar2 = dataDisplayed.permanentAddress;
            }
            if ((i15 & 4) != 0) {
                cVar3 = dataDisplayed.selectionState;
            }
            if ((i15 & 8) != 0) {
                bVar = dataDisplayed.validation;
            }
            return dataDisplayed.a(cVar, cVar2, cVar3, bVar);
        }

        public final DataDisplayed a(hb1.c previouslySelectedAddress, hb1.c permanentAddress, c selectionState, hz.b validation) {
            return new DataDisplayed(previouslySelectedAddress, permanentAddress, selectionState, validation);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hb1.c getPermanentAddress() {
            return this.permanentAddress;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hb1.c getPreviouslySelectedAddress() {
            return this.previouslySelectedAddress;
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
            return fr.t.c(this.previouslySelectedAddress, dataDisplayed.previouslySelectedAddress) && fr.t.c(this.permanentAddress, dataDisplayed.permanentAddress) && this.selectionState == dataDisplayed.selectionState && fr.t.c(this.validation, dataDisplayed.validation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final hz.b getValidation() {
            return this.validation;
        }

        public int hashCode() {
            hb1.c cVar = this.previouslySelectedAddress;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            hb1.c cVar2 = this.permanentAddress;
            return ((((iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31) + this.selectionState.hashCode()) * 31) + this.validation.hashCode();
        }

        public String toString() {
            return "DataDisplayed(previouslySelectedAddress=" + this.previouslySelectedAddress + ", permanentAddress=" + this.permanentAddress + ", selectionState=" + this.selectionState + ", validation=" + this.validation + ')';
        }

        public /* synthetic */ DataDisplayed(hb1.c cVar, hb1.c cVar2, c cVar3, hz.b bVar, int i15, fr.k kVar) {
            this(cVar, cVar2, cVar3, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }
}
