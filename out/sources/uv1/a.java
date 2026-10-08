package uv1;

import gv1.s;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "value", "Lgv1/s;", "dataType", "", "a", "(Ljava/lang/String;Lgv1/s;)Z", "b", "(Ljava/lang/String;)Z", "dynamicdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final boolean a(String str, s sVar) {
        return (sVar == s.TEXT && b(str)) || sVar == s.NUMBER;
    }

    private static final boolean b(String str) {
        if (str.length() > 3) {
            for (int i15 = 0; i15 < str.length(); i15++) {
                char cCharAt = str.charAt(i15);
                if (Character.isDigit(cCharAt) || cCharAt == '/') {
                }
            }
            return true;
        }
        return false;
    }
}
