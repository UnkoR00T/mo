package h3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "text", "b", "(Ljava/lang/String;)Ljava/lang/String;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        if (str.length() < 5000) {
            return str;
        }
        return (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? fu.r.H1(str, 4999) : fu.r.H1(str, 5000);
    }
}
