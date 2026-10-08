package p136y9;

import android.net.Uri;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly9/o1;", "", "<init>", "()V", "", "s", "allow", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "(Ljava/lang/String;)Ljava/lang/String;", "uriString", "Landroid/net/Uri;", "d", "(Ljava/lang/String;)Landroid/net/Uri;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f225471a = new o1();

    private o1() {
    }

    public static /* synthetic */ String c(o1 o1Var, String str, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        return o1Var.b(str, str2);
    }

    public final String a(String s15) {
        return Uri.decode(s15);
    }

    public final String b(String s15, String allow) {
        return Uri.encode(s15, allow);
    }

    public final Uri d(String uriString) {
        return Uri.parse(uriString);
    }
}
