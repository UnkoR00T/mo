package mz;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lmz/x;", "Lmz/d;", "Lmz/b;", "", "addressEmail", "subject", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Ljava/lang/String;", "b", "c", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String addressEmail;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String subject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String body;

    public x(String str, String str2, String str3) {
        this.addressEmail = str;
        this.subject = str2;
        this.body = str3;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.SENDTO";
    }

    @Override // mz.b
    public Uri getData() {
        return Uri.parse("mailto:");
    }

    @Override // mz.d
    public Bundle getExtras() {
        Bundle bundle = new Bundle();
        String str = this.addressEmail;
        if (str != null) {
            bundle.putStringArray("android.intent.extra.EMAIL", (String[]) pq.v.e(str).toArray(new String[0]));
        }
        String str2 = this.subject;
        if (str2 != null) {
            bundle.putString("android.intent.extra.SUBJECT", str2);
        }
        String str3 = this.body;
        if (str3 != null) {
            bundle.putString("android.intent.extra.TEXT", str3);
        }
        return bundle;
    }
}
