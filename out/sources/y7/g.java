package y7;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class g extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f224858a;

    public g(int i15) {
        this.f224858a = i15;
    }

    public g(Throwable th4, int i15) {
        super(th4);
        this.f224858a = i15;
    }

    public g(String str, int i15) {
        super(str);
        this.f224858a = i15;
    }

    public g(String str, Throwable th4, int i15) {
        super(str, th4);
        this.f224858a = i15;
    }
}
