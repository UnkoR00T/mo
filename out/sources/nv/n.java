package nv;

import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnv/n;", "Ljava/io/IOException;", "Lnv/b;", "errorCode", "<init>", "(Lnv/b;)V", "a", "Lnv/b;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final b errorCode;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.errorCode = bVar;
    }
}
