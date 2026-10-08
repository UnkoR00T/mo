package x5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean b(File file, Resources resources, int i15) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i15);
            try {
                boolean zC = c(file, inputStreamOpenRawResource);
                a(inputStreamOpenRawResource);
                return zC;
            } catch (Throwable th4) {
                th = th4;
                a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean c(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStreamB = null;
        try {
            fileOutputStreamB = io.sentry.instrumentation.file.l.b.b(new FileOutputStream(file, false), file, false);
            byte[] bArr = new byte[1024];
            while (true) {
                int i15 = inputStream.read(bArr);
                if (i15 == -1) {
                    return true;
                }
                fileOutputStreamB.write(bArr, 0, i15);
                a(fileOutputStreamB);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            }
        } catch (IOException e15) {
            c2.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e15.getMessage());
            return false;
        } finally {
            a(fileOutputStreamB);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static File d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i15 = 0; i15 < 100; i15++) {
            File file = new File(cacheDir, str + i15);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static ByteBuffer e(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                FileInputStream fileInputStreamB = io.sentry.instrumentation.file.h.b.b(new FileInputStream(fileDescriptor), fileDescriptor);
                try {
                    FileChannel channel = fileInputStreamB.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStreamB.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th4) {
                    try {
                        fileInputStreamB.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static Map<Uri, ByteBuffer> f(Context context, f6.g.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (f6.g.b bVar : bVarArr) {
            if (bVar.b() == 0) {
                Uri uriE = bVar.e();
                if (!map.containsKey(uriE)) {
                    map.put(uriE, e(context, cancellationSignal, uriE));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
