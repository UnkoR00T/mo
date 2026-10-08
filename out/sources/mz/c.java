package mz;

import android.net.Uri;
import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lmz/c;", "Lmz/b0;", "", "phoneNumber", "e", "(Ljava/lang/String;)Ljava/lang/String;", "g", "Landroid/net/Uri;", "h", "(Ljava/lang/String;)Landroid/net/Uri;", "j", "", "i", "(Ljava/lang/String;)I", "", "other", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String phoneNumber;

    private /* synthetic */ c(String str) {
        this.phoneNumber = str;
    }

    public static final /* synthetic */ c d(String str) {
        return new c(str);
    }

    public static String e(String str) {
        return str;
    }

    public static boolean f(String str, Object obj) {
        return (obj instanceof c) && fr.t.c(str, ((c) obj).getPhoneNumber());
    }

    public static String g(String str) {
        return "android.intent.action.DIAL";
    }

    public static Uri h(String str) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("tel:");
        StringBuilder sb6 = new StringBuilder();
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (!fu.a.c(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        sb5.append(sb6.toString());
        return Uri.parse(sb5.toString());
    }

    public static int i(String str) {
        return str.hashCode();
    }

    public static String j(String str) {
        return "DialIntentType(phoneNumber=" + str + ')';
    }

    @Override // kx.g
    public String a() {
        return g(this.phoneNumber);
    }

    @Override // mz.b0
    /* JADX INFO: renamed from: c */
    public Uri getUri() {
        return h(this.phoneNumber);
    }

    public boolean equals(Object obj) {
        return f(this.phoneNumber, obj);
    }

    public int hashCode() {
        return i(this.phoneNumber);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString() {
        return j(this.phoneNumber);
    }
}
