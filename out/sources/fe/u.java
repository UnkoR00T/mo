package fe;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f61705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<Integer, DataT> f61706b;

    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61707a;

        a(Context context) {
            this.f61707a = context;
        }

        @Override // fe.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new u(this.f61707a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    private static final class b implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61708a;

        b(Context context) {
            this.f61708a = context;
        }

        @Override // fe.p
        public o<Uri, InputStream> d(s sVar) {
            return new u(this.f61708a, sVar.d(Integer.class, InputStream.class));
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f61705a = context.getApplicationContext();
        this.f61706b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    private o.a<DataT> g(Uri uri, int i15, int i16, zd.h hVar) {
        try {
            int i17 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i17 != 0) {
                return this.f61706b.a(Integer.valueOf(i17), i15, i16, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                c2.g("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e15) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                c2.h("ResourceUriLoader", "Failed to parse resource id from: " + uri, e15);
            }
            return null;
        }
    }

    private o.a<DataT> h(Uri uri, int i15, int i16, zd.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f61705a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f61705a.getPackageName());
        if (identifier != 0) {
            return this.f61706b.a(Integer.valueOf(identifier), i15, i16, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        c2.g("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> a(Uri uri, int i15, int i16, zd.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i15, i16, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i15, i16, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        c2.g("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f61705a.getPackageName().equals(uri.getAuthority());
    }
}
