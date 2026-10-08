package m02;

import eo0.y;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import wx.StoredMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lm02/c;", "", "Lwx/g;", "e", "()Lwx/g;", "metadata", "Leo0/y;", "a", "()Ljava/lang/String;", "attachmentId", "b", "Lm02/c$a;", "Lm02/c$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: m02.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lm02/c$a;", "Lm02/c;", "Lzz/a;", "pickedFile", "Leo0/y;", "attachmentId", "<init>", "(Lzz/a;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzz/a;", "b", "()Lzz/a;", "Ljava/lang/String;", "Lwx/g;", "c", "Lwx/g;", "e", "()Lwx/g;", "metadata", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PickedFileData implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zz.a pickedFile;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String attachmentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final wx.g metadata;

        public /* synthetic */ PickedFileData(zz.a aVar, String str, k kVar) {
            this(aVar, str);
        }

        @Override // m02.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final zz.a getPickedFile() {
            return this.pickedFile;
        }

        @Override // m02.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public wx.g getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickedFileData)) {
                return false;
            }
            PickedFileData pickedFileData = (PickedFileData) other;
            return t.c(this.pickedFile, pickedFileData.pickedFile) && y.d(this.attachmentId, pickedFileData.attachmentId);
        }

        public int hashCode() {
            return (this.pickedFile.hashCode() * 31) + y.e(this.attachmentId);
        }

        public String toString() {
            return "PickedFileData(pickedFile=" + this.pickedFile + ", attachmentId=" + ((Object) y.f(this.attachmentId)) + ')';
        }

        private PickedFileData(zz.a aVar, String str) {
            this.pickedFile = aVar;
            this.attachmentId = str;
            this.metadata = aVar.getMetadata();
        }
    }

    /* JADX INFO: renamed from: m02.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lm02/c$b;", "Lm02/c;", "Leo0/y;", "attachmentId", "", "fullName", "", "fileSizeInBytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "F", "()F", "Lwx/g;", "d", "Lwx/g;", "e", "()Lwx/g;", "metadata", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UploadedFilePlaceholder implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String attachmentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float fileSizeInBytes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final wx.g metadata;

        public /* synthetic */ UploadedFilePlaceholder(String str, String str2, float f15, k kVar) {
            this(str, str2, f15);
        }

        @Override // m02.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getFileSizeInBytes() {
            return this.fileSizeInBytes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        @Override // m02.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public wx.g getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadedFilePlaceholder)) {
                return false;
            }
            UploadedFilePlaceholder uploadedFilePlaceholder = (UploadedFilePlaceholder) other;
            return y.d(this.attachmentId, uploadedFilePlaceholder.attachmentId) && t.c(this.fullName, uploadedFilePlaceholder.fullName) && Float.compare(this.fileSizeInBytes, uploadedFilePlaceholder.fileSizeInBytes) == 0;
        }

        public int hashCode() {
            return (((y.e(this.attachmentId) * 31) + this.fullName.hashCode()) * 31) + Float.hashCode(this.fileSizeInBytes);
        }

        public String toString() {
            return "UploadedFilePlaceholder(attachmentId=" + ((Object) y.f(this.attachmentId)) + ", fullName=" + this.fullName + ", fileSizeInBytes=" + this.fileSizeInBytes + ')';
        }

        private UploadedFilePlaceholder(String str, String str2, float f15) {
            this.attachmentId = str;
            this.fullName = str2;
            this.fileSizeInBytes = f15;
            this.metadata = new StoredMetadata(d.b(str2), d.a(str2), f15);
        }
    }

    /* JADX INFO: renamed from: a */
    String getAttachmentId();

    /* JADX INFO: renamed from: e */
    wx.g getMetadata();
}
