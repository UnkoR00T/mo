package kc;

import android.net.Uri;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/net/Uri;", "Lkc/h0;", "b", "(Landroid/net/Uri;)Lkc/h0;", "a", "(Lkc/h0;)Landroid/net/Uri;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {
    public static final Uri a(h0 h0Var) {
        return Uri.parse(h0Var.getData());
    }

    public static final h0 b(Uri uri) {
        return i0.j(uri.toString(), null, 1, null);
    }
}
