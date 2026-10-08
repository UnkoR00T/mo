package a34;

import android.content.res.Resources;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"La34/g;", "La34/f;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "gstaticPublicKey", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String gstaticPublicKey;

    public g(Resources resources) {
        this.gstaticPublicKey = resources.getString(x24.a.f216688a);
    }

    @Override // a34.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getGstaticPublicKey() {
        return this.gstaticPublicKey;
    }
}
