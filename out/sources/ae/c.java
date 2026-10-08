package ae;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f5460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f5461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f5462c;

    static class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f5463b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f5464a;

        a(ContentResolver contentResolver) {
            this.f5464a = contentResolver;
        }

        @Override // ae.d
        public Cursor a(Uri uri) {
            return this.f5464a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f5463b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f5465b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f5466a;

        b(ContentResolver contentResolver) {
            this.f5466a = contentResolver;
        }

        @Override // ae.d
        public Cursor a(Uri uri) {
            return this.f5466a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f5465b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f5460a = uri;
        this.f5461b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f5461b.d(this.f5460a);
        int iA = inputStreamD != null ? this.f5461b.a(this.f5460a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f5462c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public zd.a d() {
        return zd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f5462c = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e15) {
            aVar.c(e15);
        }
    }
}
