package y7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f224941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f224942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f224943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f224944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f224945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f224946j;

    public static class a extends g {
        @Deprecated
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th4, int i15) {
            super(str, th4, i15);
        }
    }

    public v(Context context) {
        super(false);
        this.f224941e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i15) {
        return Uri.parse("rawresource:///" + i15);
    }

    private static AssetFileDescriptor u(Context context, j jVar) throws a {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = jVar.f224865a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = v(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) zj.p.q(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e15) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e15, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = v(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e16) {
            throw new a(null, e16, 2005);
        }
    }

    private static int v(String str) throws a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // y7.f
    public Uri c() {
        j jVar = this.f224942f;
        if (jVar != null) {
            return jVar.f224865a;
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // y7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f224942f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f224944h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f224944h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f224943g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f224943g = r0
            boolean r0 = r5.f224946j
            if (r0 == 0) goto L2b
            r5.f224946j = r2
            r5.r()
        L2b:
            return
        L2c:
            y7.v$a r4 = new y7.v$a     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f224943g = r0
            boolean r0 = r5.f224946j
            if (r0 == 0) goto L3d
            r5.f224946j = r2
            r5.r()
        L3d:
            throw r1
        L3e:
            y7.v$a r4 = new y7.v$a     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f224944h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f224943g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f224943g = r0
            boolean r0 = r5.f224946j
            if (r0 == 0) goto L5d
            r5.f224946j = r2
            r5.r()
        L5d:
            throw r3
        L5e:
            y7.v$a r4 = new y7.v$a     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f224943g = r0
            boolean r0 = r5.f224946j
            if (r0 == 0) goto L6f
            r5.f224946j = r2
            r5.r()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.v.close():void");
    }

    @Override // y7.f
    public long i(j jVar) throws a {
        this.f224942f = jVar;
        s(jVar);
        AssetFileDescriptor assetFileDescriptorU = u(this.f224941e, jVar);
        this.f224943g = assetFileDescriptorU;
        long length = assetFileDescriptorU.getLength();
        FileDescriptor fileDescriptor = this.f224943g.getFileDescriptor();
        FileInputStream fileInputStreamB = io.sentry.instrumentation.file.h.b.b(new FileInputStream(fileDescriptor), fileDescriptor);
        this.f224944h = fileInputStreamB;
        if (length != -1) {
            try {
                if (jVar.f224871g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e15) {
                throw e15;
            } catch (IOException e16) {
                throw new a(null, e16, 2000);
            }
        }
        long startOffset = this.f224943g.getStartOffset();
        long jSkip = fileInputStreamB.skip(jVar.f224871g + startOffset) - startOffset;
        if (jSkip != jVar.f224871g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStreamB.getChannel();
            if (channel.size() == 0) {
                this.f224945i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f224945i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j15 = length - jSkip;
            this.f224945i = j15;
            if (j15 < 0) {
                throw new g(2008);
            }
        }
        long jMin = jVar.f224872h;
        if (jMin != -1) {
            long j16 = this.f224945i;
            if (j16 != -1) {
                jMin = Math.min(j16, jMin);
            }
            this.f224945i = jMin;
        }
        this.f224946j = true;
        t(jVar);
        long j17 = jVar.f224872h;
        return j17 != -1 ? j17 : this.f224945i;
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) throws a {
        if (i16 == 0) {
            return 0;
        }
        long j15 = this.f224945i;
        if (j15 == 0) {
            return -1;
        }
        if (j15 != -1) {
            try {
                i16 = (int) Math.min(j15, i16);
            } catch (IOException e15) {
                throw new a(null, e15, 2000);
            }
        }
        int i17 = ((InputStream) o0.h(this.f224944h)).read(bArr, i15, i16);
        if (i17 == -1) {
            if (this.f224945i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j16 = this.f224945i;
        if (j16 != -1) {
            this.f224945i = j16 - ((long) i17);
        }
        q(i17);
        return i17;
    }
}
