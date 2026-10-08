package mz;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lmz/y;", "Lmz/d;", "Lmz/o;", "Lmz/e;", "", "addressEmail", "subject", "body", "attachmentUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "p", "()Ljava/lang/Integer;", "Ljava/lang/String;", "c", "d", "getAttachmentUri", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements d, o, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String addressEmail;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String subject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String attachmentUri;

    public y(String str, String str2, String str3, String str4) {
        this.addressEmail = str;
        this.subject = str2;
        this.body = str3;
        this.attachmentUri = str4;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.SEND";
    }

    @Override // mz.o
    public String b() {
        return "text/plain";
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
        bundle.putParcelable("android.intent.extra.STREAM", Uri.parse(this.attachmentUri));
        return bundle;
    }

    @Override // mz.e
    public Integer p() {
        return 1;
    }
}
