package wz;

import fr.k;
import fr.t;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwz/b;", "", "b", "a", "Lwz/b$a;", "Lwz/b$b;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: wz.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lwz/b$b;", "Lwz/b;", "", "contentToEncode", "", "size", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrCode implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String contentToEncode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int size;

        public QrCode(String str, int i15) {
            this.contentToEncode = str;
            this.size = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContentToEncode() {
            return this.contentToEncode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QrCode)) {
                return false;
            }
            QrCode qrCode = (QrCode) other;
            return t.c(this.contentToEncode, qrCode.contentToEncode) && this.size == qrCode.size;
        }

        public int hashCode() {
            return (this.contentToEncode.hashCode() * 31) + Integer.hashCode(this.size);
        }

        public String toString() {
            return "QrCode(contentToEncode=" + this.contentToEncode + ", size=" + this.size + ')';
        }

        public /* synthetic */ QrCode(String str, int i15, int i16, k kVar) {
            this(str, (i16 & 2) != 0 ? 296 : i15);
        }
    }

    /* JADX INFO: renamed from: wz.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0017"}, d2 = {"Lwz/b$a;", "Lwz/b;", "", "contentToEncode", "", "width", "height", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BarCode implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String contentToEncode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int width;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int height;

        public BarCode(String str, int i15, int i16) {
            this.contentToEncode = str;
            this.width = i15;
            this.height = i16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContentToEncode() {
            return this.contentToEncode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarCode)) {
                return false;
            }
            BarCode barCode = (BarCode) other;
            return t.c(this.contentToEncode, barCode.contentToEncode) && this.width == barCode.width && this.height == barCode.height;
        }

        public int hashCode() {
            return (((this.contentToEncode.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "BarCode(contentToEncode=" + this.contentToEncode + ", width=" + this.width + ", height=" + this.height + ')';
        }

        public /* synthetic */ BarCode(String str, int i15, int i16, int i17, k kVar) {
            this(str, (i17 & 2) != 0 ? DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE : i15, (i17 & 4) != 0 ? 60 : i16);
        }
    }
}
