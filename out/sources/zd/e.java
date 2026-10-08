package zd;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f234354a;

    public e(int i15) {
        this("Http request failed", i15);
    }

    public e(String str, int i15) {
        this(str, i15, null);
    }

    public e(String str, int i15, Throwable th4) {
        super(str + ", status code: " + i15, th4);
        this.f234354a = i15;
    }
}
