package t7;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class x extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188650b;

    protected x(String str, Throwable th4, boolean z15, int i15) {
        super(str, th4);
        this.f188649a = z15;
        this.f188650b = i15;
    }

    public static x a(String str, Throwable th4) {
        return new x(str, th4, true, 1);
    }

    public static x b(String str, Throwable th4) {
        return new x(str, th4, true, 0);
    }

    public static x c(String str) {
        return new x(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb5 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb5.append(str);
        sb5.append("{contentIsMalformed=");
        sb5.append(this.f188649a);
        sb5.append(", dataType=");
        sb5.append(this.f188650b);
        sb5.append("}");
        return sb5.toString();
    }
}
