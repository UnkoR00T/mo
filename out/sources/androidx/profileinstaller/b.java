package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import io.sentry.instrumentation.file.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f12905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f12906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f12907c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f12909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f12910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f12911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12912h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f12914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f12915k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12913i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f12908d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f12905a = assetManager;
        this.f12906b = executor;
        this.f12907c = cVar;
        this.f12910f = str;
        this.f12911g = str2;
        this.f12912h = str3;
        this.f12909e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f12905a, this.f12912h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f12914j = g.r(inputStreamG, g.p(inputStreamG, g.f12935b), bArr, cVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th4) {
                try {
                    inputStreamG.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (FileNotFoundException e15) {
            this.f12907c.a(9, e15);
        } catch (IOException e16) {
            this.f12907c.a(7, e16);
        } catch (IllegalStateException e17) {
            this.f12914j = null;
            this.f12907c.a(8, e17);
        }
    }

    private void c() {
        if (!this.f12913i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            return i.f12947a;
        }
        switch (i15) {
            case 26:
                return i.f12950d;
            case 27:
                return i.f12949c;
            case 28:
            case 29:
            case 30:
                return i.f12948b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f12911g);
        } catch (FileNotFoundException e15) {
            this.f12907c.a(6, e15);
            return null;
        } catch (IOException e16) {
            this.f12907c.a(7, e16);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e15) {
            String message = e15.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f12907c.b(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f12934a), this.f12910f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e15) {
                        this.f12907c.a(7, e15);
                        return cVarArrX;
                    }
                } catch (IllegalStateException e16) {
                    this.f12907c.a(8, e16);
                    try {
                        inputStream.close();
                    } catch (IOException e17) {
                        this.f12907c.a(7, e17);
                    }
                    return null;
                }
            } catch (IOException e18) {
                this.f12907c.a(7, e18);
                inputStream.close();
                return null;
            }
        } catch (Throwable th4) {
            try {
                inputStream.close();
            } catch (IOException e19) {
                this.f12907c.a(7, e19);
            }
            throw th4;
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private void k(final int i15, final Object obj) {
        this.f12906b.execute(new Runnable() { // from class: ma.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f124984a.f12907c.a(i15, obj);
            }
        });
    }

    public boolean e() {
        if (this.f12908d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f12909e.exists()) {
            try {
                if (!this.f12909e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f12909e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f12913i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f12908d != null) {
            InputStream inputStreamF = f(this.f12905a);
            if (inputStreamF != null) {
                this.f12914j = i(inputStreamF);
            }
            c[] cVarArr = this.f12914j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f12908d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        c[] cVarArr = this.f12914j;
        byte[] bArr = this.f12908d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                    if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                        this.f12907c.a(5, null);
                        this.f12914j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f12915k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f12914j = null;
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e15) {
                this.f12907c.a(7, e15);
            } catch (IllegalStateException e16) {
                this.f12907c.a(8, e16);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f12915k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    File file = this.f12909e;
                    FileOutputStream fileOutputStreamA = l.b.a(new FileOutputStream(file), file);
                    try {
                        FileChannel channel = fileOutputStreamA.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStreamA, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStreamA.close();
                                byteArrayInputStream.close();
                                this.f12915k = null;
                                this.f12914j = null;
                                return true;
                            } catch (Throwable th4) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                            }
                            throw th6;
                        }
                    } catch (Throwable th8) {
                        try {
                            fileOutputStreamA.close();
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                        throw th8;
                    }
                } catch (Throwable th10) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                    }
                    throw th10;
                }
            } catch (FileNotFoundException e15) {
                k(6, e15);
                this.f12915k = null;
                this.f12914j = null;
                return false;
            } catch (IOException e16) {
                k(7, e16);
                this.f12915k = null;
                this.f12914j = null;
                return false;
            }
        } catch (Throwable th12) {
            this.f12915k = null;
            this.f12914j = null;
            throw th12;
        }
    }
}
