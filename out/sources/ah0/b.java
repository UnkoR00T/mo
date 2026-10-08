package ah0;

import java.beans.ConstructorProperties;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f6302a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f6303a;

        a() {
        }

        public b a() {
            return new b(this.f6303a);
        }

        public a b(byte[] bArr) {
            this.f6303a = bArr;
            return this;
        }

        public String toString() {
            return "PdfPersonalSignatureResult.PdfPersonalSignatureResultBuilder(signedPdf=" + Arrays.toString(this.f6303a) + ")";
        }
    }

    @ConstructorProperties({"signedPdf"})
    b(byte[] bArr) {
        this.f6302a = bArr;
    }

    public static a a() {
        return new a();
    }

    public byte[] b() {
        return this.f6302a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b) && Arrays.equals(b(), ((b) obj).b());
    }

    public int hashCode() {
        return 59 + Arrays.hashCode(b());
    }

    public String toString() {
        return "PdfPersonalSignatureResult(signedPdf=" + Arrays.toString(b()) + ")";
    }
}
