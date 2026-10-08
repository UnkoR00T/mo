package p136y9;

import android.content.Intent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Intent;", "intent", "Ly9/w0;", "a", "(Landroid/content/Intent;)Ly9/w0;", "navigation-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavControllerKt")
final /* synthetic */ class i0 {
    public static final w0 a(Intent intent) {
        return new w0(intent.getData(), intent.getAction(), intent.getType());
    }
}
