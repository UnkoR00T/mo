package wm;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jg.k;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f214075a = new k("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f214076b = new d();

    private d() {
    }

    public static d b() {
        return f214076b;
    }

    public rg.b a(vm.a aVar) throws lm.a {
        int iH = aVar.h();
        if (iH == -1) {
            return rg.d.o3((Bitmap) s.l(aVar.e()));
        }
        if (iH != 17) {
            if (iH == 35) {
                return rg.d.o3(aVar.j());
            }
            if (iH != 842094169) {
                throw new lm.a("Unsupported image format: " + aVar.h(), 3);
            }
        }
        return rg.d.o3((ByteBuffer) s.l(aVar.f()));
    }

    public int c(vm.a aVar) {
        return aVar.h();
    }

    public int d(vm.a aVar) {
        if (aVar.h() == -1) {
            return ((Bitmap) s.l(aVar.e())).getAllocationByteCount();
        }
        if (aVar.h() == 17 || aVar.h() == 842094169) {
            return ((ByteBuffer) s.l(aVar.f())).limit();
        }
        if (aVar.h() != 35) {
            return 0;
        }
        return (((Image.Plane[]) s.l(aVar.k()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix e(int i15, int i16, int i17) {
        if (i17 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i15) / 2.0f, (-i16) / 2.0f);
        matrix.postRotate(i17 * 90);
        int i18 = i17 % 2;
        int i19 = i18 != 0 ? i16 : i15;
        if (i18 == 0) {
            i15 = i16;
        }
        matrix.postTranslate(i19 / 2.0f, i15 / 2.0f);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[PHI: r5
      0x008f: PHI (r5v3 android.graphics.Matrix) = (r5v0 android.graphics.Matrix), (r5v1 android.graphics.Matrix) binds: [B:38:0x008c, B:47:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009c A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    public final Bitmap f(ContentResolver contentResolver, Uri uri) throws IOException {
        IOException iOException;
        c7.a aVar;
        Matrix matrix;
        Matrix matrix2;
        Bitmap bitmapCreateBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int iM = 0;
            Matrix matrix3 = null;
            if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            aVar = new c7.a(inputStreamOpenInputStream);
                        } catch (Throwable th4) {
                            try {
                                inputStreamOpenInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                    throw th4;
                                } catch (Exception unused) {
                                    throw th4;
                                }
                            }
                        }
                    } else {
                        aVar = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e15) {
                            iOException = e15;
                            f214075a.d("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
                        }
                    }
                } catch (IOException e16) {
                    iOException = e16;
                    aVar = null;
                    f214075a.d("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
                    if (aVar == null) {
                        iM = aVar.m("Orientation", 1);
                    }
                    matrix = new Matrix();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    switch (iM) {
                        case 2:
                            matrix3 = new Matrix();
                            matrix3.postScale(-1.0f, 1.0f);
                            matrix2 = matrix3;
                            break;
                        case 3:
                            matrix.postRotate(180.0f);
                            matrix2 = matrix;
                            break;
                        case 4:
                            matrix.postScale(1.0f, -1.0f);
                            matrix2 = matrix;
                            break;
                        case 5:
                            matrix.postRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 6:
                            matrix.postRotate(90.0f);
                            matrix2 = matrix;
                            break;
                        case 7:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 8:
                            matrix.postRotate(-90.0f);
                            matrix2 = matrix;
                            break;
                        default:
                            matrix2 = matrix3;
                            break;
                    }
                    return matrix2 == null ? bitmap : bitmap;
                }
                if (aVar == null) {
                    iM = aVar.m("Orientation", 1);
                }
            }
            matrix = new Matrix();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            switch (iM) {
                case 2:
                    matrix3 = new Matrix();
                    matrix3.postScale(-1.0f, 1.0f);
                    matrix2 = matrix3;
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    matrix2 = matrix;
                    break;
                case 4:
                    matrix.postScale(1.0f, -1.0f);
                    matrix2 = matrix;
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    matrix2 = matrix;
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 8:
                    matrix.postRotate(-90.0f);
                    matrix2 = matrix;
                    break;
                default:
                    matrix2 = matrix3;
                    break;
            }
            if (matrix2 == null && bitmap != (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix2, true))) {
                bitmap.recycle();
                return bitmapCreateBitmap;
            }
        } catch (FileNotFoundException e17) {
            f214075a.d("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e17);
            throw e17;
        }
    }
}
