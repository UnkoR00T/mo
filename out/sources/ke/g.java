package ke;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import be.v;
import java.util.List;
import ve.k;
import zd.j;

/* JADX INFO: loaded from: classes3.dex */
public class g implements j<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zd.g<Resources.Theme> f110242b = zd.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f110243a;

    public g(Context context) {
        this.f110243a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f110243a.getPackageName())) {
            return this.f110243a;
        }
        try {
            return this.f110243a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e15) {
            if (str.contains(this.f110243a.getPackageName())) {
                return this.f110243a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e15);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e15) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e15);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<Drawable> b(Uri uri, int i15, int i16, zd.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) k.d(authority)).equals(this.f110243a.getPackageName()) ? (Resources.Theme) hVar.c(f110242b) : null;
            return f.e(theme == null ? d.b(this.f110243a, contextD, iG) : d.a(this.f110243a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // zd.j
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, zd.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
