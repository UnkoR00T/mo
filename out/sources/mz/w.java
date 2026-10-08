package mz;

import android.net.Uri;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmz/w;", "Lmz/b0;", "", "url", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "b", "Landroid/net/Uri;", "uri", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Uri uri;

    public w(String str) {
        this.url = str;
        this.uri = Uri.parse(str);
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.VIEW";
    }

    @Override // mz.b0
    /* JADX INFO: renamed from: c, reason: from getter */
    public Uri getUri() {
        return this.uri;
    }
}
