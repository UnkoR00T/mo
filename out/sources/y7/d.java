package y7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f224848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f224849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f224850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f224851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f224852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f224853j;

    public static class a extends g {
        public a(IOException iOException, int i15) {
            super(iOException, i15);
        }
    }

    public d(Context context) {
        super(false);
        this.f224848e = context.getContentResolver();
    }

    @Override // y7.f
    public Uri c() {
        return this.f224849f;
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
            r5.f224849f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f224851h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f224851h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f224850g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f224850g = r0
            boolean r0 = r5.f224853j
            if (r0 == 0) goto L2b
            r5.f224853j = r2
            r5.r()
        L2b:
            return
        L2c:
            y7.d$a r4 = new y7.d$a     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f224850g = r0
            boolean r0 = r5.f224853j
            if (r0 == 0) goto L3d
            r5.f224853j = r2
            r5.r()
        L3d:
            throw r1
        L3e:
            y7.d$a r4 = new y7.d$a     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f224851h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f224850g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f224850g = r0
            boolean r0 = r5.f224853j
            if (r0 == 0) goto L5d
            r5.f224853j = r2
            r5.r()
        L5d:
            throw r3
        L5e:
            y7.d$a r4 = new y7.d$a     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f224850g = r0
            boolean r0 = r5.f224853j
            if (r0 == 0) goto L6f
            r5.f224853j = r2
            r5.r()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.d.close():void");
    }

    @Override // y7.f
    public long i(j jVar) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = jVar.f224865a.normalizeScheme();
            this.f224849f = uriNormalizeScheme;
            s(jVar);
            if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f224848e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f224848e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f224850g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileDescriptor fileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor();
            FileInputStream fileInputStreamB = io.sentry.instrumentation.file.h.b.b(new FileInputStream(fileDescriptor), fileDescriptor);
            this.f224851h = fileInputStreamB;
            if (length != -1 && jVar.f224871g > length) {
                throw new a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStreamB.skip(jVar.f224871g + startOffset) - startOffset;
            if (jSkip != jVar.f224871g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStreamB.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f224852i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f224852i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j15 = length - jSkip;
                this.f224852i = j15;
                if (j15 < 0) {
                    throw new a(null, 2008);
                }
            }
            long jMin = jVar.f224872h;
            if (jMin != -1) {
                long j16 = this.f224852i;
                if (j16 != -1) {
                    jMin = Math.min(j16, jMin);
                }
                this.f224852i = jMin;
            }
            this.f224853j = true;
            t(jVar);
            long j17 = jVar.f224872h;
            return j17 != -1 ? j17 : this.f224852i;
        } catch (a e15) {
            throw e15;
        } catch (IOException e16) {
            throw new a(e16, e16 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) throws a {
        if (i16 == 0) {
            return 0;
        }
        long j15 = this.f224852i;
        if (j15 == 0) {
            return -1;
        }
        if (j15 != -1) {
            try {
                i16 = (int) Math.min(j15, i16);
            } catch (IOException e15) {
                throw new a(e15, 2000);
            }
        }
        int i17 = ((FileInputStream) o0.h(this.f224851h)).read(bArr, i15, i16);
        if (i17 == -1) {
            return -1;
        }
        long j16 = this.f224852i;
        if (j16 != -1) {
            this.f224852i = j16 - ((long) i17);
        }
        q(i17);
        return i17;
    }
}
