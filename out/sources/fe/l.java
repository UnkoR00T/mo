package fe;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements o<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f61664a;

    public static final class a implements p<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61665a;

        public a(Context context) {
            this.f61665a = context;
        }

        @Override // fe.p
        public o<Uri, File> d(s sVar) {
            return new l(this.f61665a);
        }
    }

    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f61666c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f61668b;

        b(Context context, Uri uri) {
            this.f61667a = context;
            this.f61668b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public zd.a d() {
            return zd.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super File> aVar) {
            Cursor cursorQuery = this.f61667a.getContentResolver().query(this.f61668b, f61666c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th4) {
                    cursorQuery.close();
                    throw th4;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f61668b));
        }
    }

    public l(Context context) {
        this.f61664a = context;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> a(Uri uri, int i15, int i16, zd.h hVar) {
        return new o.a<>(new ue.d(uri), new b(this.f61664a, uri));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return ae.b.c(uri);
    }
}
