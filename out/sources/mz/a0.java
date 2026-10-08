package mz;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0088\u0001\u0005\u0092\u0001\u00020\u0004¨\u0006\u001b"}, d2 = {"Lmz/a0;", "Lmz/d;", "Lmz/b;", "Lmz/o;", "", "text", "e", "(Ljava/lang/String;)Ljava/lang/String;", "g", "Landroid/net/Uri;", "h", "(Ljava/lang/String;)Landroid/net/Uri;", "j", "Landroid/os/Bundle;", "i", "(Ljava/lang/String;)Landroid/os/Bundle;", "l", "", "k", "(Ljava/lang/String;)I", "", "other", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements d, b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    private /* synthetic */ a0(String str) {
        this.text = str;
    }

    public static final /* synthetic */ a0 d(String str) {
        return new a0(str);
    }

    public static String e(String str) {
        return str;
    }

    public static boolean f(String str, Object obj) {
        return (obj instanceof a0) && fr.t.c(str, ((a0) obj).getText());
    }

    public static String g(String str) {
        return "android.intent.action.SEND";
    }

    public static Uri h(String str) {
        return Uri.EMPTY;
    }

    public static Bundle i(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.TEXT", str);
        return bundle;
    }

    public static String j(String str) {
        return "text/plain";
    }

    public static int k(String str) {
        return str.hashCode();
    }

    public static String l(String str) {
        return "ShareTextIntentType(text=" + str + ')';
    }

    @Override // kx.g
    public String a() {
        return g(this.text);
    }

    @Override // mz.o
    public String b() {
        return j(this.text);
    }

    public boolean equals(Object obj) {
        return f(this.text, obj);
    }

    @Override // mz.b
    public Uri getData() {
        return h(this.text);
    }

    @Override // mz.d
    public Bundle getExtras() {
        return i(this.text);
    }

    public int hashCode() {
        return k(this.text);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ String getText() {
        return this.text;
    }

    public String toString() {
        return l(this.text);
    }
}
