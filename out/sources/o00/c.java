package o00;

import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo00/c;", "Ljava/io/IOException;", "", "address", "Ljava/lang/Exception;", "Lkotlin/Exception;", "internalException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Exception internalException;

    public c(String str, Exception exc) {
        this.address = str;
        this.internalException = exc;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Exception getInternalException() {
        return this.internalException;
    }
}
