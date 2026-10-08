package mz3;

import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lmz3/j;", "", "Lmz3/j$a;", "Llz3/a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends gz.b {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lmz3/j$a;", "Lgz/b$a;", "Llz3/d;", "r", "()Llz3/d;", "documentDownloadMethod", "c", "b", "a", "Lmz3/j$a$a;", "Lmz3/j$a$b;", "Lmz3/j$a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends gz.b.a {

        /* JADX INFO: renamed from: mz3.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmz3/j$a$a;", "Lmz3/j$a;", "Llz3/d;", "documentDownloadMethod", "Liy/b0;", "qrCode", "<init>", "(Llz3/d;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llz3/d;", "r", "()Llz3/d;", "b", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DownloadDocumentByQRCode implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final lz3.d documentDownloadMethod;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 qrCode;

            public DownloadDocumentByQRCode(lz3.d dVar, b0 b0Var) {
                this.documentDownloadMethod = dVar;
                this.qrCode = b0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b0 getQrCode() {
                return this.qrCode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DownloadDocumentByQRCode)) {
                    return false;
                }
                DownloadDocumentByQRCode downloadDocumentByQRCode = (DownloadDocumentByQRCode) other;
                return this.documentDownloadMethod == downloadDocumentByQRCode.documentDownloadMethod && fr.t.c(this.qrCode, downloadDocumentByQRCode.qrCode);
            }

            public int hashCode() {
                return (this.documentDownloadMethod.hashCode() * 31) + this.qrCode.hashCode();
            }

            @Override // mz3.j.a
            /* JADX INFO: renamed from: r, reason: from getter */
            public lz3.d getDocumentDownloadMethod() {
                return this.documentDownloadMethod;
            }

            public String toString() {
                return "DownloadDocumentByQRCode(documentDownloadMethod=" + this.documentDownloadMethod + ", qrCode=" + this.qrCode + ")";
            }
        }

        /* JADX INFO: renamed from: mz3.j$a$b, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmz3/j$a$b;", "Lmz3/j$a;", "Llz3/d;", "documentDownloadMethod", "", "Lrq0/b;", "documentsToDownload", "<init>", "(Llz3/d;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llz3/d;", "r", "()Llz3/d;", "b", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DownloadDocuments implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final lz3.d documentDownloadMethod;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<rq0.b> documentsToDownload;

            /* JADX WARN: Multi-variable type inference failed */
            public DownloadDocuments(lz3.d dVar, List<? extends rq0.b> list) {
                this.documentDownloadMethod = dVar;
                this.documentsToDownload = list;
            }

            public final List<rq0.b> a() {
                return this.documentsToDownload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DownloadDocuments)) {
                    return false;
                }
                DownloadDocuments downloadDocuments = (DownloadDocuments) other;
                return this.documentDownloadMethod == downloadDocuments.documentDownloadMethod && fr.t.c(this.documentsToDownload, downloadDocuments.documentsToDownload);
            }

            public int hashCode() {
                return (this.documentDownloadMethod.hashCode() * 31) + this.documentsToDownload.hashCode();
            }

            @Override // mz3.j.a
            /* JADX INFO: renamed from: r, reason: from getter */
            public lz3.d getDocumentDownloadMethod() {
                return this.documentDownloadMethod;
            }

            public String toString() {
                return "DownloadDocuments(documentDownloadMethod=" + this.documentDownloadMethod + ", documentsToDownload=" + this.documentsToDownload + ")";
            }
        }

        /* JADX INFO: renamed from: mz3.j$a$c, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001d"}, d2 = {"Lmz3/j$a$c;", "Lmz3/j$a;", "Llz3/d;", "documentDownloadMethod", "Lrq0/b;", "documentToUpdate", "", "documentIID", "<init>", "(Llz3/d;Lrq0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llz3/d;", "r", "()Llz3/d;", "b", "Lrq0/b;", "()Lrq0/b;", "c", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpdateDocument implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final lz3.d documentDownloadMethod;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final rq0.b documentToUpdate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentIID;

            public UpdateDocument(lz3.d dVar, rq0.b bVar, String str) {
                this.documentDownloadMethod = dVar;
                this.documentToUpdate = bVar;
                this.documentIID = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentIID() {
                return this.documentIID;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final rq0.b getDocumentToUpdate() {
                return this.documentToUpdate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateDocument)) {
                    return false;
                }
                UpdateDocument updateDocument = (UpdateDocument) other;
                return this.documentDownloadMethod == updateDocument.documentDownloadMethod && fr.t.c(this.documentToUpdate, updateDocument.documentToUpdate) && fr.t.c(this.documentIID, updateDocument.documentIID);
            }

            public int hashCode() {
                int iHashCode = ((this.documentDownloadMethod.hashCode() * 31) + this.documentToUpdate.hashCode()) * 31;
                String str = this.documentIID;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // mz3.j.a
            /* JADX INFO: renamed from: r, reason: from getter */
            public lz3.d getDocumentDownloadMethod() {
                return this.documentDownloadMethod;
            }

            public String toString() {
                return "UpdateDocument(documentDownloadMethod=" + this.documentDownloadMethod + ", documentToUpdate=" + this.documentToUpdate + ", documentIID=" + this.documentIID + ")";
            }
        }

        /* JADX INFO: renamed from: r */
        lz3.d getDocumentDownloadMethod();
    }
}
