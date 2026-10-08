package ae;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f5467f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f5469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ce.b f5470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentResolver f5471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f5472e;

    e(List<ImageHeaderParser> list, d dVar, ce.b bVar, ContentResolver contentResolver) {
        this(list, f5467f, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    private String b(Uri uri) throws Throwable {
        Cursor cursorA;
        Cursor cursor = null;
        try {
            cursorA = this.f5469b.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorA = null;
        } catch (Throwable th5) {
            th = th5;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.f5468a.a(file) && 0 < this.f5468a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.f5471d.openInputStream(uri);
            return com.bumptech.glide.load.a.b(this.f5472e, inputStreamOpenInputStream, this.f5470c);
        } catch (IOException | NullPointerException unused) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Objects.toString(uri);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f5468a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f5471d.openInputStream(uriFromFile);
        } catch (NullPointerException e15) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e15));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, ce.b bVar, ContentResolver contentResolver) {
        this.f5468a = aVar;
        this.f5469b = dVar;
        this.f5470c = bVar;
        this.f5471d = contentResolver;
        this.f5472e = list;
    }
}
