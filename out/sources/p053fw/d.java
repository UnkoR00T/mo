package p053fw;

import java.net.URI;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/net/URI;", "Lorg/intellij/markdown/html/URI;", "", "str", "a", "(Ljava/net/URI;Ljava/lang/String;)Ljava/lang/String;", "markdown"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class d {
    public static final String a(URI uri, String str) {
        try {
            return uri.resolve(str).toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
