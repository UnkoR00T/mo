package xt0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xt0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lxt0/s;", "", "", "Lxt0/t;", "attachments", "", "encryptionKey", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getEncryptionKey", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterventionAttachmentsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final List<InterventionAttachmentsDtoAttachmentFile> attachments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("encryptionKey")
    private final String encryptionKey;

    public InterventionAttachmentsDto(List<InterventionAttachmentsDtoAttachmentFile> list, String str) {
        this.attachments = list;
        this.encryptionKey = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterventionAttachmentsDto)) {
            return false;
        }
        InterventionAttachmentsDto interventionAttachmentsDto = (InterventionAttachmentsDto) other;
        return fr.t.c(this.attachments, interventionAttachmentsDto.attachments) && fr.t.c(this.encryptionKey, interventionAttachmentsDto.encryptionKey);
    }

    public int hashCode() {
        return (this.attachments.hashCode() * 31) + this.encryptionKey.hashCode();
    }

    public String toString() {
        return "InterventionAttachmentsDto(attachments=" + this.attachments + ", encryptionKey=" + this.encryptionKey + ')';
    }
}
