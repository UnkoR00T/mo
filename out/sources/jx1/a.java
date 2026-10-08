package jx1;

import android.content.Context;
import iy.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ljx1/a;", "", "<init>", "()V", "Liy/a;", "base64Coder", "Landroid/content/Context;", "context", "Lix1/b;", "b", "(Liy/a;Landroid/content/Context;)Lix1/b;", "pdfSignatureVisualizer", "Lzg0/b;", "c", "(Lix1/b;Landroid/content/Context;)Lzg0/b;", "Lix1/c;", "pdfSigningManager", "Liy/i0;", "x509CertificateDecoder", "Llx1/c;", "e", "(Lix1/c;Liy/i0;)Llx1/c;", "Llx1/a;", "a", "(Lix1/c;)Llx1/a;", "initializer", "d", "(Lzg0/b;)Lix1/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final lx1.a a(ix1.c pdfSigningManager) {
        return new lx1.a(pdfSigningManager);
    }

    public final ix1.b b(iy.a base64Coder, Context context) {
        return new ix1.b(base64Coder, context.getAssets());
    }

    public final zg0.b c(ix1.b pdfSignatureVisualizer, Context context) {
        return new ix1.e(pdfSignatureVisualizer, context);
    }

    public final ix1.c d(zg0.b initializer) {
        return new ix1.d(initializer);
    }

    public final lx1.c e(ix1.c pdfSigningManager, i0 x509CertificateDecoder) {
        return new lx1.c(pdfSigningManager, x509CertificateDecoder);
    }
}
