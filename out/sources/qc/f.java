package qc;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import fr.t;
import java.io.FileNotFoundException;
import java.util.List;
import kc.h0;
import kc.i0;
import kc.j0;
import kc.s;
import p071kotlin.Metadata;
import vv.v;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqc/f;", "Lqc/j;", "Lkc/h0;", "data", "Lzc/n;", "options", "<init>", "(Lkc/h0;Lzc/n;)V", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "Lqc/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "b", "(Lkc/h0;)Z", "c", "Lkc/h0;", "Lzc/n;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqc/f$a;", "Lqc/j$a;", "Lkc/h0;", "<init>", "()V", "data", "", "c", "(Lkc/h0;)Z", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "b", "(Lkc/h0;Lzc/n;Lkc/s;)Lqc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<h0> {
        private final boolean c(h0 data) {
            return t.c(data.getScheme(), "content");
        }

        @Override // qc.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(h0 data, Options options, s imageLoader) {
            if (c(data)) {
                return new f(data, options);
            }
            return null;
        }
    }

    public f(h0 h0Var, Options options) {
        this.data = h0Var;
        this.options = options;
    }

    private final Bundle d() {
        ad.a width = this.options.getSize().getWidth();
        ad.a.C0109a c0109a = width instanceof ad.a.C0109a ? (ad.a.C0109a) width : null;
        if (c0109a == null) {
            return null;
        }
        int px4 = c0109a.getPx();
        ad.a height = this.options.getSize().getHeight();
        ad.a.C0109a c0109a2 = height instanceof ad.a.C0109a ? (ad.a.C0109a) height : null;
        if (c0109a2 == null) {
            return null;
        }
        int px5 = c0109a2.getPx();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(px4, px5));
        return bundle;
    }

    @Override // qc.j
    public Object a(tq.e<? super i> eVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriA = j0.a(this.data);
        ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (b(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriA, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriA + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriA, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriA + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriA, "image/*", d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriA + "'.").toString());
            }
        }
        return new SourceFetchResult(oc.t.a(v.c(v.j(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.options.getFileSystem(), new oc.e(this.data, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriA), oc.f.DISK);
    }

    public final boolean b(h0 data) {
        return t.c(data.getAuthority(), "com.android.contacts") && t.c(pq.v.z0(i0.f(data)), "display_photo");
    }

    public final boolean c(h0 data) {
        List<String> listF;
        int size;
        return t.c(data.getAuthority(), "media") && (size = (listF = i0.f(data)).size()) >= 3 && t.c(listF.get(size + (-3)), "audio") && t.c(listF.get(size + (-2)), "albums");
    }
}
