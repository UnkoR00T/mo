package lv;

import fu.r;
import fv.a0;
import java.net.ProtocolException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Llv/k;", "", "Lfv/a0;", "protocol", "", "code", "", "message", "<init>", "(Lfv/a0;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Lfv/a0;", "b", "I", "c", "Ljava/lang/String;", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a0 protocol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: lv.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Llv/k$a;", "", "<init>", "()V", "", "statusLine", "Llv/k;", "a", "(Ljava/lang/String;)Llv/k;", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final k a(String statusLine) throws ProtocolException {
            a0 a0Var;
            int i15;
            String strSubstring;
            if (r.V(statusLine, "HTTP/1.", false, 2, null)) {
                i15 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    a0Var = a0.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    a0Var = a0.HTTP_1_1;
                }
            } else {
                if (!r.V(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                a0Var = a0.HTTP_1_0;
                i15 = 4;
            }
            int i16 = i15 + 3;
            if (statusLine.length() < i16) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                int i17 = Integer.parseInt(statusLine.substring(i15, i16));
                if (statusLine.length() <= i16) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i16) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i15 + 4);
                }
                return new k(a0Var, i17, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        private Companion() {
        }
    }

    public k(a0 a0Var, int i15, String str) {
        this.protocol = a0Var;
        this.code = i15;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        if (this.protocol == a0.HTTP_1_0) {
            sb5.append("HTTP/1.0");
        } else {
            sb5.append("HTTP/1.1");
        }
        sb5.append(' ');
        sb5.append(this.code);
        sb5.append(' ');
        sb5.append(this.message);
        return sb5.toString();
    }
}
