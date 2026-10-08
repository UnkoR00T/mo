package fe;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class y<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f61714b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<Data> f61715a;

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f61716a;

        public a(ContentResolver contentResolver) {
            this.f61716a = contentResolver;
        }

        @Override // fe.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f61716a, uri);
        }

        @Override // fe.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f61717a;

        public b(ContentResolver contentResolver) {
            this.f61717a = contentResolver;
        }

        @Override // fe.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f61717a, uri);
        }

        @Override // fe.p
        public o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f61718a;

        public d(ContentResolver contentResolver) {
            this.f61718a = contentResolver;
        }

        @Override // fe.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f61718a, uri);
        }

        @Override // fe.p
        public o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }
    }

    public y(c<Data> cVar) {
        this.f61715a = cVar;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(Uri uri, int i15, int i16, zd.h hVar) {
        return new o.a<>(new ue.d(uri), this.f61715a.a(uri));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f61714b.contains(uri.getScheme());
    }
}
