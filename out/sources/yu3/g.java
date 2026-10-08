package yu3;

import p071kotlin.Metadata;
import pu3.ConfirmationDocumentData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lyu3/g;", "", "c", "a", "b", "Lyu3/g$a;", "Lyu3/g$b;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: yu3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lyu3/g$a;", "Lyu3/g;", "Lyu3/g$c;", "Lpu3/a;", "confirmationDocumentData", "<init>", "(Lpu3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpu3/a;", "b", "()Lpu3/a;", "", "Ljava/lang/Void;", "f", "()Ljava/lang/Void;", "pickedFile", "c", "Z", "isValid", "()Z", "d", "scrollToPicker", "Lg30/v;", "e", "Lg30/v;", "()Lg30/v;", "bottomSheetValue", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements g, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ConfirmationDocumentData confirmationDocumentData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Void pickedFile;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean scrollToPicker;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isValid = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final g30.v bottomSheetValue = g30.v.HIDDEN;

        public Initial(ConfirmationDocumentData confirmationDocumentData) {
            this.confirmationDocumentData = confirmationDocumentData;
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public ConfirmationDocumentData getConfirmationDocumentData() {
            return this.confirmationDocumentData;
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ zz.h getPickedFile() {
            return (zz.h) getPickedFile();
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getScrollToPicker() {
            return this.scrollToPicker;
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.confirmationDocumentData, ((Initial) other).confirmationDocumentData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public Void getPickedFile() {
            return this.pickedFile;
        }

        public int hashCode() {
            return this.confirmationDocumentData.hashCode();
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: isValid, reason: from getter */
        public boolean getIsValid() {
            return this.isValid;
        }

        public String toString() {
            return "Initial(confirmationDocumentData=" + this.confirmationDocumentData + ')';
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lyu3/g$c;", "", "Lpu3/a;", "b", "()Lpu3/a;", "confirmationDocumentData", "Lzz/h;", "c", "()Lzz/h;", "pickedFile", "", "isValid", "()Z", "d", "scrollToPicker", "Lg30/v;", "e", "()Lg30/v;", "bottomSheetValue", "Lyu3/e$a;", "Lyu3/f;", "Lyu3/g$a;", "Lyu3/g$b;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        /* JADX INFO: renamed from: b */
        ConfirmationDocumentData getConfirmationDocumentData();

        /* JADX INFO: renamed from: c */
        zz.h getPickedFile();

        /* JADX INFO: renamed from: d */
        boolean getScrollToPicker();

        /* JADX INFO: renamed from: e */
        g30.v getBottomSheetValue();

        /* JADX INFO: renamed from: isValid */
        boolean getIsValid();
    }

    /* JADX INFO: renamed from: yu3.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\b\u0010\"R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lyu3/g$b;", "Lyu3/g;", "Lyu3/g$c;", "Lpu3/a;", "confirmationDocumentData", "Lzz/h;", "pickedFile", "", "isValid", "scrollToPicker", "Lg30/v;", "bottomSheetValue", "<init>", "(Lpu3/a;Lzz/h;ZZLg30/v;)V", "f", "(Lpu3/a;Lzz/h;ZZLg30/v;)Lyu3/g$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpu3/a;", "b", "()Lpu3/a;", "Lzz/h;", "c", "()Lzz/h;", "Z", "()Z", "d", "e", "Lg30/v;", "()Lg30/v;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements g, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ConfirmationDocumentData confirmationDocumentData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final zz.h pickedFile;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValid;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToPicker;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        public Initialized(ConfirmationDocumentData confirmationDocumentData, zz.h hVar, boolean z15, boolean z16, g30.v vVar) {
            this.confirmationDocumentData = confirmationDocumentData;
            this.pickedFile = hVar;
            this.isValid = z15;
            this.scrollToPicker = z16;
            this.bottomSheetValue = vVar;
        }

        public static /* synthetic */ Initialized g(Initialized initialized, ConfirmationDocumentData confirmationDocumentData, zz.h hVar, boolean z15, boolean z16, g30.v vVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                confirmationDocumentData = initialized.confirmationDocumentData;
            }
            if ((i15 & 2) != 0) {
                hVar = initialized.pickedFile;
            }
            if ((i15 & 4) != 0) {
                z15 = initialized.isValid;
            }
            if ((i15 & 8) != 0) {
                z16 = initialized.scrollToPicker;
            }
            if ((i15 & 16) != 0) {
                vVar = initialized.bottomSheetValue;
            }
            g30.v vVar2 = vVar;
            boolean z17 = z15;
            return initialized.f(confirmationDocumentData, hVar, z17, z16, vVar2);
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public ConfirmationDocumentData getConfirmationDocumentData() {
            return this.confirmationDocumentData;
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public zz.h getPickedFile() {
            return this.pickedFile;
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getScrollToPicker() {
            return this.scrollToPicker;
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.confirmationDocumentData, initialized.confirmationDocumentData) && fr.t.c(this.pickedFile, initialized.pickedFile) && this.isValid == initialized.isValid && this.scrollToPicker == initialized.scrollToPicker && this.bottomSheetValue == initialized.bottomSheetValue;
        }

        public final Initialized f(ConfirmationDocumentData confirmationDocumentData, zz.h pickedFile, boolean isValid, boolean scrollToPicker, g30.v bottomSheetValue) {
            return new Initialized(confirmationDocumentData, pickedFile, isValid, scrollToPicker, bottomSheetValue);
        }

        public int hashCode() {
            int iHashCode = this.confirmationDocumentData.hashCode() * 31;
            zz.h hVar = this.pickedFile;
            return ((((((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + Boolean.hashCode(this.isValid)) * 31) + Boolean.hashCode(this.scrollToPicker)) * 31) + this.bottomSheetValue.hashCode();
        }

        @Override // yu3.g.c
        /* JADX INFO: renamed from: isValid, reason: from getter */
        public boolean getIsValid() {
            return this.isValid;
        }

        public String toString() {
            return "Initialized(confirmationDocumentData=" + this.confirmationDocumentData + ", pickedFile=" + this.pickedFile + ", isValid=" + this.isValid + ", scrollToPicker=" + this.scrollToPicker + ", bottomSheetValue=" + this.bottomSheetValue + ')';
        }

        public /* synthetic */ Initialized(ConfirmationDocumentData confirmationDocumentData, zz.h hVar, boolean z15, boolean z16, g30.v vVar, int i15, fr.k kVar) {
            this(confirmationDocumentData, (i15 & 2) != 0 ? null : hVar, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? false : z16, (i15 & 16) != 0 ? g30.v.HIDDEN : vVar);
        }
    }
}
