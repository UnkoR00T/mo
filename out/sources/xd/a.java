package xd;

import android.annotation.TargetApi;
import android.os.StrictMode;
import io.sentry.instrumentation.file.h;
import io.sentry.instrumentation.file.l;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f217990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f217991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f217992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f217993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f217994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f217995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f217996g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Writer f217998j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f218000l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f217997h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashMap<String, d> f217999k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f218001m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ThreadPoolExecutor f218002n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Callable<Void> f218003p = new CallableC5822a();

    /* JADX INFO: renamed from: xd.a$a, reason: collision with other inner class name */
    class CallableC5822a implements Callable<Void> {
        CallableC5822a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f217998j == null) {
                        return null;
                    }
                    a.this.u0();
                    if (a.this.V()) {
                        a.this.d0();
                        a.this.f218000l = 0;
                    }
                    return null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC5822a callableC5822a) {
            this();
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f218005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f218006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f218007c;

        /* synthetic */ c(a aVar, d dVar, CallableC5822a callableC5822a) {
            this(dVar);
        }

        public void a() {
            a.this.I(this, false);
        }

        public void b() {
            if (this.f218007c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.I(this, true);
            this.f218007c = true;
        }

        public File f(int i15) {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f218005a.f218014f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f218005a.f218013e) {
                        this.f218006b[i15] = true;
                    }
                    fileK = this.f218005a.k(i15);
                    a.this.f217990a.mkdirs();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f218005a = dVar;
            this.f218006b = dVar.f218013e ? null : new boolean[a.this.f217996g];
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f218009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f218010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f218011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f218012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f218013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f218014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f218015g;

        /* synthetic */ d(a aVar, String str, CallableC5822a callableC5822a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f217996g) {
                throw m(strArr);
            }
            for (int i15 = 0; i15 < strArr.length; i15++) {
                try {
                    this.f218010b[i15] = Long.parseLong(strArr[i15]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i15) {
            return this.f218011c[i15];
        }

        public File k(int i15) {
            return this.f218012d[i15];
        }

        public String l() {
            StringBuilder sb5 = new StringBuilder();
            for (long j15 : this.f218010b) {
                sb5.append(' ');
                sb5.append(j15);
            }
            return sb5.toString();
        }

        private d(String str) {
            this.f218009a = str;
            this.f218010b = new long[a.this.f217996g];
            this.f218011c = new File[a.this.f217996g];
            this.f218012d = new File[a.this.f217996g];
            StringBuilder sb5 = new StringBuilder(str);
            sb5.append('.');
            int length = sb5.length();
            for (int i15 = 0; i15 < a.this.f217996g; i15++) {
                sb5.append(i15);
                this.f218011c[i15] = new File(a.this.f217990a, sb5.toString());
                sb5.append(".tmp");
                this.f218012d[i15] = new File(a.this.f217990a, sb5.toString());
                sb5.setLength(length);
            }
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f218017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f218018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f218019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f218020d;

        /* synthetic */ e(a aVar, String str, long j15, File[] fileArr, long[] jArr, CallableC5822a callableC5822a) {
            this(str, j15, fileArr, jArr);
        }

        public File a(int i15) {
            return this.f218020d[i15];
        }

        private e(String str, long j15, File[] fileArr, long[] jArr) {
            this.f218017a = str;
            this.f218018b = j15;
            this.f218020d = fileArr;
            this.f218019c = jArr;
        }
    }

    private a(File file, int i15, int i16, long j15) {
        this.f217990a = file;
        this.f217994e = i15;
        this.f217991b = new File(file, "journal");
        this.f217992c = new File(file, "journal.tmp");
        this.f217993d = new File(file, "journal.bkp");
        this.f217996g = i16;
        this.f217995f = j15;
    }

    private void E() {
        if (this.f217998j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void H(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void I(c cVar, boolean z15) {
        d dVar = cVar.f218005a;
        if (dVar.f218014f != cVar) {
            throw new IllegalStateException();
        }
        if (z15 && !dVar.f218013e) {
            for (int i15 = 0; i15 < this.f217996g; i15++) {
                if (!cVar.f218006b[i15]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i15);
                }
                if (!dVar.k(i15).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i16 = 0; i16 < this.f217996g; i16++) {
            File fileK = dVar.k(i16);
            if (!z15) {
                K(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i16);
                fileK.renameTo(fileJ);
                long j15 = dVar.f218010b[i16];
                long length = fileJ.length();
                dVar.f218010b[i16] = length;
                this.f217997h = (this.f217997h - j15) + length;
            }
        }
        this.f218000l++;
        dVar.f218014f = null;
        if (dVar.f218013e || z15) {
            dVar.f218013e = true;
            this.f217998j.append((CharSequence) "CLEAN");
            this.f217998j.append(' ');
            this.f217998j.append((CharSequence) dVar.f218009a);
            this.f217998j.append((CharSequence) dVar.l());
            this.f217998j.append('\n');
            if (z15) {
                long j16 = this.f218001m;
                this.f218001m = 1 + j16;
                dVar.f218015g = j16;
            }
        } else {
            this.f217999k.remove(dVar.f218009a);
            this.f217998j.append((CharSequence) "REMOVE");
            this.f217998j.append(' ');
            this.f217998j.append((CharSequence) dVar.f218009a);
            this.f217998j.append('\n');
        }
        N(this.f217998j);
        if (this.f217997h > this.f217995f || V()) {
            this.f218002n.submit(this.f218003p);
        }
    }

    private static void K(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c M(String str, long j15) {
        E();
        d dVar = this.f217999k.get(str);
        CallableC5822a callableC5822a = null;
        if (j15 != -1 && (dVar == null || dVar.f218015g != j15)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC5822a);
            this.f217999k.put(str, dVar);
        } else if (dVar.f218014f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC5822a);
        dVar.f218014f = cVar;
        this.f217998j.append((CharSequence) "DIRTY");
        this.f217998j.append(' ');
        this.f217998j.append((CharSequence) str);
        this.f217998j.append('\n');
        N(this.f217998j);
        return cVar;
    }

    @TargetApi(26)
    private static void N(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V() {
        int i15 = this.f218000l;
        return i15 >= 2000 && i15 >= this.f217999k.size();
    }

    public static a Z(File file, int i15, int i16, long j15) throws IOException {
        if (j15 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i16 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                t0(file2, file3, false);
            }
        }
        a aVar = new a(file, i15, i16, j15);
        if (aVar.f217991b.exists()) {
            try {
                aVar.b0();
                aVar.a0();
                return aVar;
            } catch (IOException e15) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e15.getMessage() + ", removing");
                aVar.J();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i15, i16, j15);
        aVar2.d0();
        return aVar2;
    }

    private void a0() throws IOException {
        K(this.f217992c);
        Iterator<d> it = this.f217999k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i15 = 0;
            if (next.f218014f == null) {
                while (i15 < this.f217996g) {
                    this.f217997h += next.f218010b[i15];
                    i15++;
                }
            } else {
                next.f218014f = null;
                while (i15 < this.f217996g) {
                    K(next.j(i15));
                    K(next.k(i15));
                    i15++;
                }
                it.remove();
            }
        }
    }

    private void b0() {
        File file = this.f217991b;
        xd.b bVar = new xd.b(h.b.a(new FileInputStream(file), file), xd.c.f218028a);
        try {
            String strP = bVar.p();
            String strP2 = bVar.p();
            String strP3 = bVar.p();
            String strP4 = bVar.p();
            String strP5 = bVar.p();
            if (!"libcore.io.DiskLruCache".equals(strP) || !"1".equals(strP2) || !Integer.toString(this.f217994e).equals(strP3) || !Integer.toString(this.f217996g).equals(strP4) || !"".equals(strP5)) {
                throw new IOException("unexpected journal header: [" + strP + ", " + strP2 + ", " + strP4 + ", " + strP5 + "]");
            }
            int i15 = 0;
            while (true) {
                try {
                    c0(bVar.p());
                    i15++;
                } catch (EOFException unused) {
                    this.f218000l = i15 - this.f217999k.size();
                    if (bVar.m()) {
                        d0();
                    } else {
                        File file2 = this.f217991b;
                        this.f217998j = new BufferedWriter(new OutputStreamWriter(l.b.b(new FileOutputStream(file2, true), file2, true), xd.c.f218028a));
                    }
                    xd.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th4) {
            xd.c.a(bVar);
            throw th4;
        }
    }

    private void c0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i15 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i15);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i15);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f217999k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i15, iIndexOf2);
        }
        d dVar = this.f217999k.get(strSubstring);
        CallableC5822a callableC5822a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC5822a);
            this.f217999k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f218013e = true;
            dVar.f218014f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f218014f = new c(this, dVar, callableC5822a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d0() {
        try {
            Writer writer = this.f217998j;
            if (writer != null) {
                H(writer);
            }
            File file = this.f217992c;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(l.b.a(new FileOutputStream(file), file), xd.c.f218028a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f217994e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f217996g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f217999k.values()) {
                    if (dVar.f218014f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f218009a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f218009a + dVar.l() + '\n');
                    }
                }
                H(bufferedWriter);
                if (this.f217991b.exists()) {
                    t0(this.f217991b, this.f217993d, true);
                }
                t0(this.f217992c, this.f217991b, false);
                this.f217993d.delete();
                File file2 = this.f217991b;
                this.f217998j = new BufferedWriter(new OutputStreamWriter(l.b.b(new FileOutputStream(file2, true), file2, true), xd.c.f218028a));
            } catch (Throwable th4) {
                H(bufferedWriter);
                throw th4;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    private static void t0(File file, File file2, boolean z15) throws IOException {
        if (z15) {
            K(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        while (this.f217997h > this.f217995f) {
            n0(this.f217999k.entrySet().iterator().next().getKey());
        }
    }

    public void J() throws IOException {
        close();
        xd.c.b(this.f217990a);
    }

    public c L(String str) {
        return M(str, -1L);
    }

    public synchronized e O(String str) {
        Throwable th4;
        try {
            try {
                E();
                d dVar = this.f217999k.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f218013e) {
                    return null;
                }
                for (File file : dVar.f218011c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                }
                this.f218000l++;
                this.f217998j.append((CharSequence) "READ");
                this.f217998j.append(' ');
                this.f217998j.append((CharSequence) str);
                this.f217998j.append('\n');
                if (V()) {
                    this.f218002n.submit(this.f218003p);
                }
                return new e(this, str, dVar.f218015g, dVar.f218011c, dVar.f218010b, null);
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th4 = th;
        }
        throw th4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f217998j == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f217999k.values())) {
                if (dVar.f218014f != null) {
                    dVar.f218014f.a();
                }
            }
            u0();
            H(this.f217998j);
            this.f217998j = null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized boolean n0(String str) {
        try {
            E();
            d dVar = this.f217999k.get(str);
            if (dVar != null && dVar.f218014f == null) {
                for (int i15 = 0; i15 < this.f217996g; i15++) {
                    File fileJ = dVar.j(i15);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f217997h -= dVar.f218010b[i15];
                    dVar.f218010b[i15] = 0;
                }
                this.f218000l++;
                this.f217998j.append((CharSequence) "REMOVE");
                this.f217998j.append(' ');
                this.f217998j.append((CharSequence) str);
                this.f217998j.append('\n');
                this.f217999k.remove(str);
                if (V()) {
                    this.f218002n.submit(this.f218003p);
                }
                return true;
            }
            return false;
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
