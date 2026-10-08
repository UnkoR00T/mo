package gr1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lgr1/d;", "", "Lgr1/b;", "formData", "<init>", "(Lgr1/b;)V", "a", "Lgr1/b;", "()Lgr1/b;", "b", "Lgr1/d$a;", "Lgr1/d$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FormData formData;

    /* JADX INFO: renamed from: gr1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgr1/d$a;", "Lgr1/d;", "", "bottomSheetVisible", "Lgr1/b;", "formData", "<init>", "(ZLgr1/b;)V", "b", "(ZLgr1/b;)Lgr1/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "c", "Lgr1/b;", "a", "()Lgr1/b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FillingForm extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean bottomSheetVisible;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public FillingForm(boolean z15, FormData formData) {
            super(formData, null);
            this.bottomSheetVisible = z15;
            this.formData = formData;
        }

        public static /* synthetic */ FillingForm c(FillingForm fillingForm, boolean z15, FormData formData, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = fillingForm.bottomSheetVisible;
            }
            if ((i15 & 2) != 0) {
                formData = fillingForm.formData;
            }
            return fillingForm.b(z15, formData);
        }

        @Override // gr1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public final FillingForm b(boolean bottomSheetVisible, FormData formData) {
            return new FillingForm(bottomSheetVisible, formData);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getBottomSheetVisible() {
            return this.bottomSheetVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FillingForm)) {
                return false;
            }
            FillingForm fillingForm = (FillingForm) other;
            return this.bottomSheetVisible == fillingForm.bottomSheetVisible && fr.t.c(this.formData, fillingForm.formData);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.bottomSheetVisible) * 31) + this.formData.hashCode();
        }

        public String toString() {
            return "FillingForm(bottomSheetVisible=" + this.bottomSheetVisible + ", formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: gr1.d$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgr1/d$b;", "Lgr1/d;", "Lgr1/b;", "formData", "", "Lcy/c;", "readingData", "<init>", "(Lgr1/b;Ljava/util/List;)V", "b", "(Lgr1/b;Ljava/util/List;)Lgr1/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgr1/b;", "a", "()Lgr1/b;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NfcScanning extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<cy.c> readingData;

        /* JADX WARN: Multi-variable type inference failed */
        public NfcScanning(FormData formData, List<? extends cy.c> list) {
            super(formData, null);
            this.formData = formData;
            this.readingData = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NfcScanning c(NfcScanning nfcScanning, FormData formData, List list, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                formData = nfcScanning.formData;
            }
            if ((i15 & 2) != 0) {
                list = nfcScanning.readingData;
            }
            return nfcScanning.b(formData, list);
        }

        @Override // gr1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public final NfcScanning b(FormData formData, List<? extends cy.c> readingData) {
            return new NfcScanning(formData, readingData);
        }

        public final List<cy.c> d() {
            return this.readingData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcScanning)) {
                return false;
            }
            NfcScanning nfcScanning = (NfcScanning) other;
            return fr.t.c(this.formData, nfcScanning.formData) && fr.t.c(this.readingData, nfcScanning.readingData);
        }

        public int hashCode() {
            return (this.formData.hashCode() * 31) + this.readingData.hashCode();
        }

        public String toString() {
            return "NfcScanning(formData=" + this.formData + ", readingData=" + this.readingData + ')';
        }
    }

    public /* synthetic */ d(FormData formData, fr.k kVar) {
        this(formData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public FormData getFormData() {
        return this.formData;
    }

    private d(FormData formData) {
        this.formData = formData;
    }
}
