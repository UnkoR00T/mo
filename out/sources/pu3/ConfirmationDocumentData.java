package pu3;

import fr.k;
import fr.t;
import java.util.Set;
import mx.Label;
import p071kotlin.Metadata;
import wx.f;
import wx.i;

/* JADX INFO: renamed from: pu3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b\u001e\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b$\u0010\u0016¨\u0006-"}, d2 = {"Lpu3/a;", "", "Lmx/a;", "title", "", "isRequired", "header", "description", "Lpu3/a$a;", "formats", "Lxw/a;", "maxSize", "Lwx/i;", "document", "", "maxAllowedFiles", "<init>", "(Lmx/a;ZLmx/a;Lmx/a;Lpu3/a$a;FLwx/i;ILfr/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "g", "()Lmx/a;", "b", "Z", "h", "()Z", "c", "d", "e", "Lpu3/a$a;", "()Lpu3/a$a;", "f", "F", "()F", "Lwx/i;", "()Lwx/i;", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmationDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label header;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Formats formats;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float maxSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final i document;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxAllowedFiles;

    /* JADX INFO: renamed from: pu3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lpu3/a$a;", "", "", "Lwx/f;", "fileFormats", "Lwx/d;", "photoFormats", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Formats {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<f> fileFormats;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<wx.d> photoFormats;

        /* JADX WARN: Multi-variable type inference failed */
        public Formats(Set<? extends f> set, Set<wx.d> set2) {
            this.fileFormats = set;
            this.photoFormats = set2;
        }

        public final Set<f> a() {
            return this.fileFormats;
        }

        public final Set<wx.d> b() {
            return this.photoFormats;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Formats)) {
                return false;
            }
            Formats formats = (Formats) other;
            return t.c(this.fileFormats, formats.fileFormats) && t.c(this.photoFormats, formats.photoFormats);
        }

        public int hashCode() {
            return (this.fileFormats.hashCode() * 31) + this.photoFormats.hashCode();
        }

        public String toString() {
            return "Formats(fileFormats=" + this.fileFormats + ", photoFormats=" + this.photoFormats + ")";
        }
    }

    public /* synthetic */ ConfirmationDocumentData(Label label, boolean z15, Label label2, Label label3, Formats formats, float f15, i iVar, int i15, k kVar) {
        this(label, z15, label2, label3, formats, f15, iVar, i15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Formats getFormats() {
        return this.formats;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxAllowedFiles() {
        return this.maxAllowedFiles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmationDocumentData)) {
            return false;
        }
        ConfirmationDocumentData confirmationDocumentData = (ConfirmationDocumentData) other;
        return t.c(this.title, confirmationDocumentData.title) && this.isRequired == confirmationDocumentData.isRequired && t.c(this.header, confirmationDocumentData.header) && t.c(this.description, confirmationDocumentData.description) && t.c(this.formats, confirmationDocumentData.formats) && xw.a.d(this.maxSize, confirmationDocumentData.maxSize) && t.c(this.document, confirmationDocumentData.document) && this.maxAllowedFiles == confirmationDocumentData.maxAllowedFiles;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.title.hashCode() * 31) + Boolean.hashCode(this.isRequired)) * 31) + this.header.hashCode()) * 31) + this.description.hashCode()) * 31) + this.formats.hashCode()) * 31) + xw.a.e(this.maxSize)) * 31;
        i iVar = this.document;
        return ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + Integer.hashCode(this.maxAllowedFiles);
    }

    public String toString() {
        return "ConfirmationDocumentData(title=" + this.title + ", isRequired=" + this.isRequired + ", header=" + this.header + ", description=" + this.description + ", formats=" + this.formats + ", maxSize=" + xw.a.f(this.maxSize) + ", document=" + this.document + ", maxAllowedFiles=" + this.maxAllowedFiles + ")";
    }

    private ConfirmationDocumentData(Label label, boolean z15, Label label2, Label label3, Formats formats, float f15, i iVar, int i15) {
        this.title = label;
        this.isRequired = z15;
        this.header = label2;
        this.description = label3;
        this.formats = formats;
        this.maxSize = f15;
        this.document = iVar;
        this.maxAllowedFiles = i15;
    }
}
