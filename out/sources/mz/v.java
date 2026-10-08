package mz;

import android.net.Uri;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmz/v;", "Lmz/b0;", "Lmz/e;", "", "uri", "<init>", "(Ljava/lang/String;)V", "", "p", "()Ljava/lang/Integer;", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "a", "()Ljava/lang/String;", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements b0, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String uri;

    public v(String str) {
        this.uri = str;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.VIEW";
    }

    @Override // mz.b0
    /* JADX INFO: renamed from: c */
    public Uri getUri() {
        return Uri.parse(this.uri);
    }

    @Override // mz.e
    public Integer p() {
        return 1;
    }
}
