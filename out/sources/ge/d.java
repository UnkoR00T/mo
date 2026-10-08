package ge;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import fe.o;
import fe.p;
import fe.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import zd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f72007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f72008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f72009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<DataT> f72010d;

    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f72011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<DataT> f72012b;

        a(Context context, Class<DataT> cls) {
            this.f72011a = context;
            this.f72012b = cls;
        }

        @Override // fe.p
        public final o<Uri, DataT> d(s sVar) {
            return new d(this.f72011a, sVar.d(File.class, this.f72012b), sVar.d(Uri.class, this.f72012b), this.f72012b);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: ge.d$d, reason: collision with other inner class name */
    private static final class C1653d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String[] f72013l = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f72014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o<File, DataT> f72015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o<Uri, DataT> f72016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f72017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f72018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f72019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f72020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class<DataT> f72021h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f72022j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f72023k;

        C1653d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i15, int i16, h hVar, Class<DataT> cls) {
            this.f72014a = context.getApplicationContext();
            this.f72015b = oVar;
            this.f72016c = oVar2;
            this.f72017d = uri;
            this.f72018e = i15;
            this.f72019f = i16;
            this.f72020g = hVar;
            this.f72021h = cls;
        }

        private o.a<DataT> c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f72015b.a(h(this.f72017d), this.f72018e, this.f72019f, this.f72020g);
            }
            if (ae.b.a(this.f72017d)) {
                return this.f72016c.a(this.f72017d, this.f72018e, this.f72019f, this.f72020g);
            }
            return this.f72016c.a(g() ? MediaStore.setRequireOriginal(this.f72017d) : this.f72017d, this.f72018e, this.f72019f, this.f72020g);
        }

        private com.bumptech.glide.load.data.d<DataT> f() {
            o.a<DataT> aVarC = c();
            if (aVarC != null) {
                return aVarC.f61677c;
            }
            return null;
        }

        private boolean g() {
            return this.f72014a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f72014a.getContentResolver().query(uri, f72013l, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th4) {
                if (0 == 0) {
                    throw th4;
                }
                cursor.close();
                throw th4;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f72021h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f72023k;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f72022j = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f72023k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public zd.a d() {
            return zd.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(g gVar, com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f72017d));
                    return;
                }
                this.f72023k = dVarF;
                if (this.f72022j) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e15) {
                aVar.c(e15);
            }
        }
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f72007a = context.getApplicationContext();
        this.f72008b = oVar;
        this.f72009c = oVar2;
        this.f72010d = cls;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> a(Uri uri, int i15, int i16, h hVar) {
        return new o.a<>(new ue.d(uri), new C1653d(this.f72007a, this.f72008b, this.f72009c, uri, i15, i16, hVar, this.f72010d));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && ae.b.c(uri);
    }
}
