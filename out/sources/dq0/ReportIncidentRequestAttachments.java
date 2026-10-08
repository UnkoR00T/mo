package dq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldq0/v;", "", "", "fileEncryptionKey", "", "Ldq0/w;", "images", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileEncryptionKey", "b", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportIncidentRequestAttachments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileEncryptionKey")
    private final String fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("images")
    private final List<ReportIncidentRequestAttachmentsImage> images;

    public ReportIncidentRequestAttachments(String str, List<ReportIncidentRequestAttachmentsImage> list) {
        this.fileEncryptionKey = str;
        this.images = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportIncidentRequestAttachments)) {
            return false;
        }
        ReportIncidentRequestAttachments reportIncidentRequestAttachments = (ReportIncidentRequestAttachments) other;
        return fr.t.c(this.fileEncryptionKey, reportIncidentRequestAttachments.fileEncryptionKey) && fr.t.c(this.images, reportIncidentRequestAttachments.images);
    }

    public int hashCode() {
        return (this.fileEncryptionKey.hashCode() * 31) + this.images.hashCode();
    }

    public String toString() {
        return "ReportIncidentRequestAttachments(fileEncryptionKey=" + this.fileEncryptionKey + ", images=" + this.images + ')';
    }
}
