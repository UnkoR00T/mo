package y7;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f224926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f224927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f224928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f224929h;

    public static class a extends g {
        public a(Throwable th4, int i15) {
            super(th4, i15);
        }

        public a(String str, Throwable th4, int i15) {
            super(str, th4, i15);
        }
    }

    public o() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) throws a {
        try {
            return new RandomAccessFile((String) zj.p.q(uri.getPath()), "r");
        } catch (FileNotFoundException e15) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new a(e15, ((e15.getCause() instanceof ErrnoException) && ((ErrnoException) e15.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e15, 1004);
        } catch (SecurityException e16) {
            throw new a(e16, 2006);
        } catch (RuntimeException e17) {
            throw new a(e17, 2000);
        }
    }

    @Override // y7.f
    public Uri c() {
        return this.f224927f;
    }

    @Override // y7.f
    public void close() {
        this.f224927f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f224926e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f224926e = null;
                if (this.f224929h) {
                    this.f224929h = false;
                    r();
                }
            } catch (IOException e15) {
                throw new a(e15, 2000);
            }
        } catch (Throwable th4) {
            this.f224926e = null;
            if (this.f224929h) {
                this.f224929h = false;
                r();
            }
            throw th4;
        }
    }

    @Override // y7.f
    public long i(j jVar) throws a {
        Uri uri = jVar.f224865a;
        this.f224927f = uri;
        s(jVar);
        RandomAccessFile randomAccessFileU = u(uri);
        this.f224926e = randomAccessFileU;
        try {
            randomAccessFileU.seek(jVar.f224871g);
            long length = jVar.f224872h;
            if (length == -1) {
                length = this.f224926e.length() - jVar.f224871g;
            }
            this.f224928g = length;
            if (length < 0) {
                throw new a(null, null, 2008);
            }
            this.f224929h = true;
            t(jVar);
            return this.f224928g;
        } catch (IOException e15) {
            throw new a(e15, 2000);
        }
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) throws a {
        if (i16 == 0) {
            return 0;
        }
        if (this.f224928g == 0) {
            return -1;
        }
        try {
            int i17 = ((RandomAccessFile) o0.h(this.f224926e)).read(bArr, i15, (int) Math.min(this.f224928g, i16));
            if (i17 > 0) {
                this.f224928g -= (long) i17;
                q(i17);
            }
            return i17;
        } catch (IOException e15) {
            throw new a(e15, 2000);
        }
    }
}
