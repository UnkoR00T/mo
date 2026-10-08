package fe;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f61615c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f61616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1397a<Data> f61617b;

    /* JADX INFO: renamed from: fe.a$a, reason: collision with other inner class name */
    public interface InterfaceC1397a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC1397a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f61618a;

        public b(AssetManager assetManager) {
            this.f61618a = assetManager;
        }

        @Override // fe.a.InterfaceC1397a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // fe.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new a(this.f61618a, this);
        }
    }

    public static class c implements p<Uri, InputStream>, InterfaceC1397a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f61619a;

        public c(AssetManager assetManager) {
            this.f61619a = assetManager;
        }

        @Override // fe.a.InterfaceC1397a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // fe.p
        public o<Uri, InputStream> d(s sVar) {
            return new a(this.f61619a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC1397a<Data> interfaceC1397a) {
        this.f61616a = assetManager;
        this.f61617b = interfaceC1397a;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(Uri uri, int i15, int i16, zd.h hVar) {
        return new o.a<>(new ue.d(uri), this.f61617b.a(this.f61616a, uri.toString().substring(f61615c)));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
