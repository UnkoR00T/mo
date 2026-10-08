package sv0;

import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lsv0/q;", "", "", "Lwx/d;", "acceptedFileExtension", "", "quality", "maxFileAmount", "imageMaxSide", "Lsv0/q0;", "filesServiceConfiguration", "<init>", "(Ljava/util/Set;IIILsv0/q0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "getAcceptedFileExtension", "()Ljava/util/Set;", "b", "I", "d", "c", "e", "Lsv0/q0;", "()Lsv0/q0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FileImageConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<wx.d> acceptedFileExtension;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quality;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxFileAmount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imageMaxSide;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uploader filesServiceConfiguration;

    public FileImageConfiguration(Set<wx.d> set, int i15, int i16, int i17, Uploader uploader) {
        this.acceptedFileExtension = set;
        this.quality = i15;
        this.maxFileAmount = i16;
        this.imageMaxSide = i17;
        this.filesServiceConfiguration = uploader;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Uploader getFilesServiceConfiguration() {
        return this.filesServiceConfiguration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getImageMaxSide() {
        return this.imageMaxSide;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxFileAmount() {
        return this.maxFileAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileImageConfiguration)) {
            return false;
        }
        FileImageConfiguration fileImageConfiguration = (FileImageConfiguration) other;
        return fr.t.c(this.acceptedFileExtension, fileImageConfiguration.acceptedFileExtension) && this.quality == fileImageConfiguration.quality && this.maxFileAmount == fileImageConfiguration.maxFileAmount && this.imageMaxSide == fileImageConfiguration.imageMaxSide && fr.t.c(this.filesServiceConfiguration, fileImageConfiguration.filesServiceConfiguration);
    }

    public int hashCode() {
        return (((((((this.acceptedFileExtension.hashCode() * 31) + Integer.hashCode(this.quality)) * 31) + Integer.hashCode(this.maxFileAmount)) * 31) + Integer.hashCode(this.imageMaxSide)) * 31) + this.filesServiceConfiguration.hashCode();
    }

    public String toString() {
        return "FileImageConfiguration(acceptedFileExtension=" + this.acceptedFileExtension + ", quality=" + this.quality + ", maxFileAmount=" + this.maxFileAmount + ", imageMaxSide=" + this.imageMaxSide + ", filesServiceConfiguration=" + this.filesServiceConfiguration + ")";
    }
}
