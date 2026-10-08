package mx1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lmx1/b;", "", "a", "c", "b", "Lmx1/b$a;", "Lmx1/b$b;", "Lmx1/b$c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: mx1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmx1/b$a;", "Lmx1/b;", "Lwx/i$b;", "pickedFile", "", "validated", "<init>", "(Lwx/i$b;Z)V", "a", "(Lwx/i$b;Z)Lmx1/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lwx/i$b;", "c", "()Lwx/i$b;", "b", "Z", "d", "()Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddFile implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f129180c = wx.i.Regular.f215742c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Regular pickedFile;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean validated;

        /* JADX WARN: Multi-variable type inference failed */
        public AddFile() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AddFile b(AddFile addFile, wx.i.Regular regular, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                regular = addFile.pickedFile;
            }
            if ((i15 & 2) != 0) {
                z15 = addFile.validated;
            }
            return addFile.a(regular, z15);
        }

        public final AddFile a(wx.i.Regular pickedFile, boolean validated) {
            return new AddFile(pickedFile, validated);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final wx.i.Regular getPickedFile() {
            return this.pickedFile;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getValidated() {
            return this.validated;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddFile)) {
                return false;
            }
            AddFile addFile = (AddFile) other;
            return fr.t.c(this.pickedFile, addFile.pickedFile) && this.validated == addFile.validated;
        }

        public int hashCode() {
            wx.i.Regular regular = this.pickedFile;
            return ((regular == null ? 0 : regular.hashCode()) * 31) + Boolean.hashCode(this.validated);
        }

        public String toString() {
            return "AddFile(pickedFile=" + this.pickedFile + ", validated=" + this.validated + ')';
        }

        public AddFile(wx.i.Regular regular, boolean z15) {
            this.pickedFile = regular;
            this.validated = z15;
        }

        public /* synthetic */ AddFile(wx.i.Regular regular, boolean z15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : regular, (i15 & 2) != 0 ? false : z15);
        }
    }

    /* JADX INFO: renamed from: mx1.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmx1/b$b;", "Lmx1/b;", "Lwx/i$b;", "pickedFile", "Lhb4/c;", "errorVMS", "<init>", "(Lwx/i$b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$b;", "b", "()Lwx/i$b;", "Lhb4/c;", "()Lhb4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Regular pickedFile;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(wx.i.Regular regular, hb4.c cVar) {
            this.pickedFile = regular;
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final wx.i.Regular getPickedFile() {
            return this.pickedFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.pickedFile, error.pickedFile) && fr.t.c(this.errorVMS, error.errorVMS);
        }

        public int hashCode() {
            return (this.pickedFile.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(pickedFile=" + this.pickedFile + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: mx1.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmx1/b$c;", "Lmx1/b;", "Lwx/i$b;", "pickedFile", "<init>", "(Lwx/i$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$b;", "()Lwx/i$b;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilePreview implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f129185b = wx.i.Regular.f215742c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Regular pickedFile;

        public FilePreview(wx.i.Regular regular) {
            this.pickedFile = regular;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wx.i.Regular getPickedFile() {
            return this.pickedFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FilePreview) && fr.t.c(this.pickedFile, ((FilePreview) other).pickedFile);
        }

        public int hashCode() {
            return this.pickedFile.hashCode();
        }

        public String toString() {
            return "FilePreview(pickedFile=" + this.pickedFile + ')';
        }
    }
}
