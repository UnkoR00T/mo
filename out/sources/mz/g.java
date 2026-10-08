package mz;

import android.net.Uri;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmz/g;", "Lmz/b0;", "", "", "hasPlayStoreApp", "", "packageName", "<init>", "(ZLjava/lang/String;)V", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "d", "()Ljava/lang/String;", "e", "a", "Z", "b", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements b0, kx.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean hasPlayStoreApp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    public g(boolean z15, String str) {
        this.hasPlayStoreApp = z15;
        this.packageName = str;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.VIEW";
    }

    @Override // mz.b0
    /* JADX INFO: renamed from: c */
    public Uri getUri() {
        return Uri.parse(this.hasPlayStoreApp ? d() : e());
    }

    public String d() {
        return "market://details?id=" + this.packageName;
    }

    public String e() {
        return "https://play.google.com/store/apps/details?id=" + this.packageName;
    }
}
