package fe;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class w<Data> implements o<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f61710a;

    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // fe.p
        public o<String, AssetFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // fe.p
        public o<String, ParcelFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements p<String, InputStream> {
        @Override // fe.p
        public o<String, InputStream> d(s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f61710a = oVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(String str, int i15, int i16, zd.h hVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f61710a.b(uriE)) {
            return null;
        }
        return this.f61710a.a(uriE, i15, i16, hVar);
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return true;
    }
}
