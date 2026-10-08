package y7;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class q extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f224930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f224931c;

    public q(j jVar, int i15, int i16) {
        super(a(i15, i16));
        this.f224930b = jVar;
        this.f224931c = i16;
    }

    private static int a(int i15, int i16) {
        if (i15 == 2000 && i16 == 1) {
            return 2001;
        }
        return i15;
    }

    public static q b(IOException iOException, j jVar, int i15) {
        int i16;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i16 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i16 = 1004;
        } else {
            i16 = (message == null || !zj.c.f(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i16 == 2007 ? new p(iOException, jVar) : new q(iOException, jVar, i16, i15);
    }

    public q(String str, j jVar, int i15, int i16) {
        super(str, a(i15, i16));
        this.f224930b = jVar;
        this.f224931c = i16;
    }

    public q(IOException iOException, j jVar, int i15, int i16) {
        super(iOException, a(i15, i16));
        this.f224930b = jVar;
        this.f224931c = i16;
    }

    public q(String str, IOException iOException, j jVar, int i15, int i16) {
        super(str, iOException, a(i15, i16));
        this.f224930b = jVar;
        this.f224931c = i16;
    }
}
