package u;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static Uri a(File file, File file2) throws o.v0 {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new o.v0(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri b(File file, o.t0.h hVar) throws Throwable {
        ContentResolver contentResolverA = hVar.a();
        Objects.requireNonNull(contentResolverA);
        ContentValues contentValues = hVar.b() != null ? new ContentValues(hVar.b()) : new ContentValues();
        k(contentValues, 1);
        Uri uri = null;
        try {
            try {
                o.e1.a("FileUtil", "copyFileToMediaStore: inserting values to MediaStore");
                Uri uriInsert = contentResolverA.insert(hVar.f(), contentValues);
                try {
                    o.e1.a("FileUtil", "copyFileToMediaStore: insert success");
                    if (uriInsert == null) {
                        throw new o.v0(1, "Failed to insert a MediaStore URI.", null);
                    }
                    d(file, uriInsert, contentResolverA);
                    m(uriInsert, contentResolverA, 0);
                    return uriInsert;
                } catch (IOException e15) {
                    e = e15;
                    uri = uriInsert;
                    throw new o.v0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e16) {
                    e = e16;
                    uri = uriInsert;
                    throw new o.v0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th4) {
                    th = th4;
                    uri = uriInsert;
                    if (uri != null) {
                        m(uri, contentResolverA, 0);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e17) {
            e = e17;
        } catch (SecurityException e18) {
            e = e18;
        }
    }

    private static void c(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStreamA = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i15 = fileInputStreamA.read(bArr);
                if (i15 <= 0) {
                    fileInputStreamA.close();
                    return;
                }
                outputStream.write(bArr, 0, i15);
            }
        } catch (Throwable th4) {
            try {
                fileInputStreamA.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static void d(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                c(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th4) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    static File e(o.t0.h hVar) {
        try {
            File fileC = hVar.c();
            if (fileC == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(fileC.getParent(), "CameraX" + UUID.randomUUID().toString() + f(fileC));
        } catch (IOException e15) {
            throw new o.v0(1, "Failed to create temp file.", e15);
        }
    }

    private static String f(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "";
    }

    private static boolean g(o.t0.h hVar) {
        return hVar.c() != null;
    }

    private static boolean h(o.t0.h hVar) {
        return (hVar.f() == null || hVar.a() == null || hVar.b() == null) ? false : true;
    }

    private static boolean i(o.t0.h hVar) {
        return hVar.e() != null;
    }

    static Uri j(File file, o.t0.h hVar) {
        Uri uriA = null;
        try {
            try {
                if (h(hVar)) {
                    uriA = b(file, hVar);
                } else if (i(hVar)) {
                    OutputStream outputStreamE = hVar.e();
                    Objects.requireNonNull(outputStreamE);
                    c(file, outputStreamE);
                } else if (g(hVar)) {
                    File fileC = hVar.c();
                    Objects.requireNonNull(fileC);
                    uriA = a(file, fileC);
                }
                file.delete();
                return uriA;
            } catch (IOException unused) {
                throw new o.v0(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th4) {
            file.delete();
            throw th4;
        }
    }

    private static void k(ContentValues contentValues, int i15) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i15));
        }
    }

    static void l(File file, y.f fVar, o.t0.h hVar, int i15) {
        try {
            y.f fVarH = y.f.h(file);
            fVar.g(fVarH);
            if (fVarH.s() == 0 && i15 != 0) {
                fVarH.z(i15);
            }
            o.t0.e eVarD = hVar.d();
            if (eVarD.b()) {
                fVarH.l();
            }
            if (eVarD.c()) {
                fVarH.m();
            }
            if (eVarD.a() != null) {
                fVarH.b(eVarD.a());
            }
            fVarH.A();
        } catch (IOException e15) {
            throw new o.v0(1, "Failed to update Exif data", e15);
        }
    }

    private static void m(Uri uri, ContentResolver contentResolver, int i15) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            k(contentValues, i15);
            contentResolver.update(uri, contentValues, null, null);
        }
    }
}
