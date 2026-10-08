package wd;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import vd.v;

/* JADX INFO: loaded from: classes3.dex */
public class d implements vd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f212188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f212189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f212190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f212191d;

    public interface c {
        File get();
    }

    public d(c cVar, int i15) {
        this.f212188a = new LinkedHashMap(16, 0.75f, true);
        this.f212189b = 0L;
        this.f212190c = cVar;
        this.f212191d = i15;
    }

    private String g(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void h() {
        if (this.f212190c.get().exists()) {
            return;
        }
        v.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f212188a.clear();
        this.f212189b = 0L;
        a();
    }

    private void i() {
        if (this.f212189b < this.f212191d) {
            return;
        }
        int i15 = 0;
        if (v.f206224b) {
            v.e("Pruning old cache entries.", new Object[0]);
        }
        long j15 = this.f212189b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.f212188a.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (f(value.f212193b).delete()) {
                this.f212189b -= value.f212192a;
            } else {
                String str = value.f212193b;
                v.b("Could not delete cache entry for key=%s, filename=%s", str, g(str));
            }
            it.remove();
            i15++;
            if (this.f212189b < this.f212191d * 0.9f) {
                break;
            }
        }
        if (v.f206224b) {
            v.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i15), Long.valueOf(this.f212189b - j15), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void j(String str, a aVar) {
        if (this.f212188a.containsKey(str)) {
            this.f212189b += aVar.f212192a - this.f212188a.get(str).f212192a;
        } else {
            this.f212189b += aVar.f212192a;
        }
        this.f212188a.put(str, aVar);
    }

    private static int k(InputStream inputStream) throws IOException {
        int i15 = inputStream.read();
        if (i15 != -1) {
            return i15;
        }
        throw new EOFException();
    }

    static List<vd.g> l(b bVar) throws IOException {
        int iM = m(bVar);
        if (iM < 0) {
            throw new IOException("readHeaderList size=" + iM);
        }
        List<vd.g> arrayList = iM == 0 ? Collections.EMPTY_LIST : new ArrayList<>();
        for (int i15 = 0; i15 < iM; i15++) {
            arrayList.add(new vd.g(o(bVar).intern(), o(bVar).intern()));
        }
        return arrayList;
    }

    static int m(InputStream inputStream) {
        return (k(inputStream) << 24) | k(inputStream) | (k(inputStream) << 8) | (k(inputStream) << 16);
    }

    static long n(InputStream inputStream) {
        return (((long) k(inputStream)) & 255) | ((((long) k(inputStream)) & 255) << 8) | ((((long) k(inputStream)) & 255) << 16) | ((((long) k(inputStream)) & 255) << 24) | ((((long) k(inputStream)) & 255) << 32) | ((((long) k(inputStream)) & 255) << 40) | ((((long) k(inputStream)) & 255) << 48) | ((255 & ((long) k(inputStream))) << 56);
    }

    static String o(b bVar) {
        return new String(r(bVar, n(bVar)), "UTF-8");
    }

    private void q(String str) {
        a aVarRemove = this.f212188a.remove(str);
        if (aVarRemove != null) {
            this.f212189b -= aVarRemove.f212192a;
        }
    }

    static byte[] r(b bVar, long j15) throws IOException {
        long jB = bVar.b();
        if (j15 >= 0 && j15 <= jB) {
            int i15 = (int) j15;
            if (i15 == j15) {
                byte[] bArr = new byte[i15];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j15 + ", maxLength=" + jB);
    }

    static void s(List<vd.g> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            t(outputStream, 0);
            return;
        }
        t(outputStream, list.size());
        for (vd.g gVar : list) {
            v(outputStream, gVar.a());
            v(outputStream, gVar.b());
        }
    }

    static void t(OutputStream outputStream, int i15) throws IOException {
        outputStream.write(i15 & GF2Field.MASK);
        outputStream.write((i15 >> 8) & GF2Field.MASK);
        outputStream.write((i15 >> 16) & GF2Field.MASK);
        outputStream.write((i15 >> 24) & GF2Field.MASK);
    }

    static void u(OutputStream outputStream, long j15) throws IOException {
        outputStream.write((byte) j15);
        outputStream.write((byte) (j15 >>> 8));
        outputStream.write((byte) (j15 >>> 16));
        outputStream.write((byte) (j15 >>> 24));
        outputStream.write((byte) (j15 >>> 32));
        outputStream.write((byte) (j15 >>> 40));
        outputStream.write((byte) (j15 >>> 48));
        outputStream.write((byte) (j15 >>> 56));
    }

    static void v(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        u(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // vd.b
    public synchronized void a() {
        File file = this.f212190c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                v.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                b bVar = new b(new BufferedInputStream(d(file2)), length);
                try {
                    a aVarB = a.b(bVar);
                    aVarB.f212192a = length;
                    j(aVarB.f212193b, aVarB);
                    bVar.close();
                } catch (Throwable th4) {
                    bVar.close();
                    throw th4;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    @Override // vd.b
    public synchronized void b(String str, vd.b.a aVar) {
        long j15 = this.f212189b;
        byte[] bArr = aVar.f206142a;
        long length = j15 + ((long) bArr.length);
        int i15 = this.f212191d;
        if (length > i15 && bArr.length > i15 * 0.9f) {
            return;
        }
        File fileF = f(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(e(fileF));
            a aVar2 = new a(str, aVar);
            if (!aVar2.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                v.b("Failed to write header for %s", fileF.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f206142a);
            bufferedOutputStream.close();
            aVar2.f212192a = fileF.length();
            j(str, aVar2);
            i();
        } catch (IOException unused) {
            if (!fileF.delete()) {
                v.b("Could not clean up file %s", fileF.getAbsolutePath());
            }
            h();
        }
    }

    @Override // vd.b
    public synchronized void c(String str, boolean z15) {
        try {
            vd.b.a aVar = get(str);
            if (aVar != null) {
                aVar.f206147f = 0L;
                if (z15) {
                    aVar.f206146e = 0L;
                }
                b(str, aVar);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    InputStream d(File file) {
        return io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
    }

    OutputStream e(File file) {
        return io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
    }

    public File f(String str) {
        return new File(this.f212190c.get(), g(str));
    }

    @Override // vd.b
    public synchronized vd.b.a get(String str) {
        a aVar = this.f212188a.get(str);
        if (aVar == null) {
            return null;
        }
        File fileF = f(str);
        try {
            b bVar = new b(new BufferedInputStream(d(fileF)), fileF.length());
            try {
                a aVarB = a.b(bVar);
                if (TextUtils.equals(str, aVarB.f212193b)) {
                    vd.b.a aVarC = aVar.c(r(bVar, bVar.b()));
                    bVar.close();
                    return aVarC;
                }
                v.b("%s: key=%s, found=%s", fileF.getAbsolutePath(), str, aVarB.f212193b);
                q(str);
                bVar.close();
                return null;
            } catch (Throwable th4) {
                bVar.close();
                throw th4;
            }
        } catch (IOException e15) {
            v.b("%s: %s", fileF.getAbsolutePath(), e15.toString());
            p(str);
            return null;
        }
    }

    public synchronized void p(String str) {
        boolean zDelete = f(str).delete();
        q(str);
        if (!zDelete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, g(str));
        }
    }

    static class b extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f212200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f212201b;

        b(InputStream inputStream, long j15) {
            super(inputStream);
            this.f212200a = j15;
        }

        long b() {
            return this.f212200a - this.f212201b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i15 = super.read();
            if (i15 != -1) {
                this.f212201b++;
            }
            return i15;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i15, int i16) throws IOException {
            int i17 = super.read(bArr, i15, i16);
            if (i17 != -1) {
                this.f212201b += (long) i17;
            }
            return i17;
        }
    }

    public d(c cVar) {
        this(cVar, 5242880);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f212192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f212193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f212194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f212195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f212196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f212197f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f212198g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List<vd.g> f212199h;

        private a(String str, String str2, long j15, long j16, long j17, long j18, List<vd.g> list) {
            this.f212193b = str;
            this.f212194c = "".equals(str2) ? null : str2;
            this.f212195d = j15;
            this.f212196e = j16;
            this.f212197f = j17;
            this.f212198g = j18;
            this.f212199h = list;
        }

        private static List<vd.g> a(vd.b.a aVar) {
            List<vd.g> list = aVar.f206149h;
            return list != null ? list : e.h(aVar.f206148g);
        }

        static a b(b bVar) throws IOException {
            if (d.m(bVar) == 538247942) {
                return new a(d.o(bVar), d.o(bVar), d.n(bVar), d.n(bVar), d.n(bVar), d.n(bVar), d.l(bVar));
            }
            throw new IOException();
        }

        vd.b.a c(byte[] bArr) {
            vd.b.a aVar = new vd.b.a();
            aVar.f206142a = bArr;
            aVar.f206143b = this.f212194c;
            aVar.f206144c = this.f212195d;
            aVar.f206145d = this.f212196e;
            aVar.f206146e = this.f212197f;
            aVar.f206147f = this.f212198g;
            aVar.f206148g = e.i(this.f212199h);
            aVar.f206149h = Collections.unmodifiableList(this.f212199h);
            return aVar;
        }

        boolean d(OutputStream outputStream) {
            try {
                d.t(outputStream, 538247942);
                d.v(outputStream, this.f212193b);
                String str = this.f212194c;
                if (str == null) {
                    str = "";
                }
                d.v(outputStream, str);
                d.u(outputStream, this.f212195d);
                d.u(outputStream, this.f212196e);
                d.u(outputStream, this.f212197f);
                d.u(outputStream, this.f212198g);
                d.s(this.f212199h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e15) {
                v.b("%s", e15.toString());
                return false;
            }
        }

        a(String str, vd.b.a aVar) {
            this(str, aVar.f206143b, aVar.f206144c, aVar.f206145d, aVar.f206146e, aVar.f206147f, a(aVar));
        }
    }
}
