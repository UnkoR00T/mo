package oc;

import android.content.res.AssetFileDescriptor;
import kc.h0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Loc/e;", "Loc/s$a;", "Lkc/h0;", "uri", "Landroid/content/res/AssetFileDescriptor;", "assetFileDescriptor", "<init>", "(Lkc/h0;Landroid/content/res/AssetFileDescriptor;)V", "a", "Lkc/h0;", "getUri", "()Lkc/h0;", "b", "Landroid/content/res/AssetFileDescriptor;", "()Landroid/content/res/AssetFileDescriptor;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AssetFileDescriptor assetFileDescriptor;

    public e(h0 h0Var, AssetFileDescriptor assetFileDescriptor) {
        this.uri = h0Var;
        this.assetFileDescriptor = assetFileDescriptor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }
}
