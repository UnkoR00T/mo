package f8;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public class o extends z7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f60016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60018c;

    public o(Throwable th4, p pVar) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Decoder failed: ");
        sb5.append(pVar == null ? null : pVar.f60019a);
        super(sb5.toString(), th4);
        this.f60016a = pVar;
        this.f60017b = th4 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th4).getDiagnosticInfo() : null;
        this.f60018c = a(th4);
    }

    private static int a(Throwable th4) {
        if (th4 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th4).getErrorCode();
        }
        return 0;
    }
}
