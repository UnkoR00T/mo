package mz;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmz/z;", "Lmz/e;", "Lmz/o;", "Lmz/d;", "", "uri", "<init>", "(Ljava/lang/String;)V", "", "p", "()Ljava/lang/Integer;", "a", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements e, o, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String uri;

    public z(String str) {
        this.uri = str;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.SEND";
    }

    @Override // mz.o
    public String b() {
        return "application/pdf";
    }

    @Override // mz.d
    public Bundle getExtras() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.STREAM", Uri.parse(this.uri));
        return bundle;
    }

    @Override // mz.e
    public Integer p() {
        return 1;
    }
}
