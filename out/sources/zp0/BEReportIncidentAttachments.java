package zp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzp0/i;", "", "Lry/a;", "fileEncryptionKey", "", "Lzp0/j;", "images", "<init>", "(Liy/b0;Ljava/util/List;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportIncidentAttachments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEReportIncidentAttachmentsImage> images;

    public /* synthetic */ BEReportIncidentAttachments(iy.b0 b0Var, List list, fr.k kVar) {
        this(b0Var, list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    public final List<BEReportIncidentAttachmentsImage> b() {
        return this.images;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportIncidentAttachments)) {
            return false;
        }
        BEReportIncidentAttachments bEReportIncidentAttachments = (BEReportIncidentAttachments) other;
        return ry.a.d(this.fileEncryptionKey, bEReportIncidentAttachments.fileEncryptionKey) && fr.t.c(this.images, bEReportIncidentAttachments.images);
    }

    public int hashCode() {
        return (ry.a.e(this.fileEncryptionKey) * 31) + this.images.hashCode();
    }

    public String toString() {
        return "BEReportIncidentAttachments(fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", images=" + this.images + ")";
    }

    private BEReportIncidentAttachments(iy.b0 b0Var, List<BEReportIncidentAttachmentsImage> list) {
        this.fileEncryptionKey = b0Var;
        this.images = list;
    }
}
