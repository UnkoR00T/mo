package lp;

import io.sentry.android.core.c2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import so.m0;
import so.n0;

/* JADX INFO: loaded from: classes4.dex */
final class d extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f119071a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f119072b;

    class a implements m0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f119073a;

        a(File file) {
            this.f119073a = file;
        }

        @Override // so.m0.a
        public void a(n0 n0Var) throws IOException {
            d.this.f(n0Var, this.f119073a);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119075a;

        static {
            int[] iArr = new int[f.values().length];
            f119075a = iArr;
            try {
                iArr[f.PFB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119075a[f.TTF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119075a[f.OTF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f119076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f119077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final lp.b f119078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f119079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f119080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f119081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f119082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f119083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final x f119084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final File f119085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final d f119086k;

        /* synthetic */ c(File file, f fVar, String str, lp.b bVar, int i15, int i16, int i17, int i18, int i19, byte[] bArr, d dVar, a aVar) {
            this(file, fVar, str, bVar, i15, i16, i17, i18, i19, bArr, dVar);
        }

        private so.c0 w(String str, File file) {
            try {
                if (!file.getName().toLowerCase().endsWith(".ttc")) {
                    so.c0 c0VarK = new so.a0(false, true).c(file);
                    if (yo.a.b()) {
                        file.toString();
                    }
                    return c0VarK;
                }
                m0 m0Var = new m0(file);
                try {
                    n0 n0VarH = m0Var.h(str);
                    if (n0VarH != null) {
                        return (so.c0) n0VarH;
                    }
                    m0Var.close();
                    throw new IOException("Font " + str + " not found in " + file);
                } catch (IOException e15) {
                    c2.f("PdfBox-Android", e15.getMessage(), e15);
                    m0Var.close();
                    return null;
                }
            } catch (IOException e16) {
                c2.h("PdfBox-Android", "Could not load font file: " + file, e16);
                return null;
            }
        }

        private n0 x(String str, File file) {
            try {
                n0 n0VarZ = z(str, file);
                if (!yo.a.b()) {
                    return n0VarZ;
                }
                Objects.toString(file);
                return n0VarZ;
            } catch (IOException e15) {
                c2.h("PdfBox-Android", "Could not load font file: " + file, e15);
                return null;
            }
        }

        private to.d y(String str, File file) throws Throwable {
            FileInputStream fileInputStreamA;
            Throwable th4;
            try {
                fileInputStreamA = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
                try {
                    try {
                        to.d dVarD = to.d.d(fileInputStreamA);
                        if (yo.a.b()) {
                            Objects.toString(file);
                        }
                        dp.a.b(fileInputStreamA);
                        return dVarD;
                    } catch (IOException e15) {
                        e = e15;
                        c2.h("PdfBox-Android", "Could not load font file: " + file, e);
                        dp.a.b(fileInputStreamA);
                        return null;
                    }
                } catch (Throwable th5) {
                    th4 = th5;
                    dp.a.b(fileInputStreamA);
                    throw th4;
                }
            } catch (IOException e16) {
                e = e16;
                fileInputStreamA = null;
            } catch (Throwable th6) {
                fileInputStreamA = null;
                th4 = th6;
                dp.a.b(fileInputStreamA);
                throw th4;
            }
        }

        private n0 z(String str, File file) throws IOException {
            if (!file.getName().toLowerCase().endsWith(".ttc")) {
                return new so.j0(false, true).c(file);
            }
            m0 m0Var = new m0(file);
            try {
                n0 n0VarH = m0Var.h(str);
                if (n0VarH != null) {
                    return n0VarH;
                }
                m0Var.close();
                throw new IOException("Font " + str + " not found in " + file);
            } catch (IOException e15) {
                m0Var.close();
                throw e15;
            }
        }

        @Override // lp.g
        public lp.b a() {
            return this.f119078c;
        }

        @Override // lp.g
        public int c() {
            return this.f119081f;
        }

        @Override // lp.g
        public int d() {
            return this.f119082g;
        }

        @Override // lp.g
        public int e() {
            return this.f119080e;
        }

        @Override // lp.g
        public synchronized mo.b f() {
            mo.b bVarY;
            try {
                mo.b bVarB = this.f119086k.f119072b.b(this);
                if (bVarB != null) {
                    return bVarB;
                }
                int i15 = b.f119075a[this.f119077b.ordinal()];
                if (i15 == 1) {
                    bVarY = y(this.f119076a, this.f119085j);
                } else if (i15 == 2) {
                    bVarY = x(this.f119076a, this.f119085j);
                } else {
                    if (i15 != 3) {
                        throw new RuntimeException("can't happen");
                    }
                    bVarY = w(this.f119076a, this.f119085j);
                }
                if (bVarY != null) {
                    this.f119086k.f119072b.a(this, bVarY);
                }
                return bVarY;
            } catch (Throwable th4) {
                throw th4;
            }
        }

        @Override // lp.g
        public f g() {
            return this.f119077b;
        }

        @Override // lp.g
        public int h() {
            return this.f119083h;
        }

        @Override // lp.g
        public x i() {
            return this.f119084i;
        }

        @Override // lp.g
        public String j() {
            return this.f119076a;
        }

        @Override // lp.g
        public int k() {
            return this.f119079d;
        }

        @Override // lp.g
        public String toString() {
            return super.toString() + " " + this.f119085j;
        }

        private c(File file, f fVar, String str, lp.b bVar, int i15, int i16, int i17, int i18, int i19, byte[] bArr, d dVar) {
            this.f119085j = file;
            this.f119077b = fVar;
            this.f119076a = str;
            this.f119078c = bVar;
            this.f119079d = i15;
            this.f119080e = i16;
            this.f119081f = i17;
            this.f119082g = i18;
            this.f119083h = i19;
            this.f119084i = (bArr == null || bArr.length < 10) ? null : new x(bArr);
            this.f119086k = dVar;
        }
    }

    /* JADX INFO: renamed from: lp.d$d, reason: collision with other inner class name */
    private static final class C2901d extends c {
        /* synthetic */ C2901d(File file, f fVar, String str, a aVar) {
            this(file, fVar, str);
        }

        private C2901d(File file, f fVar, String str) {
            super(file, fVar, str, null, 0, 0, 0, 0, 0, null, null, null);
        }
    }

    d(e eVar) throws Throwable {
        this.f119072b = eVar;
        if (yo.a.a() == yo.a.EnumC6130a.NONE) {
            return;
        }
        if (yo.a.a() == yo.a.EnumC6130a.MINIMUM) {
            try {
                e(new File("/system/fonts/DroidSans.ttf"));
                e(new File("/system/fonts/DroidSans-Bold.ttf"));
                e(new File("/system/fonts/DroidSansMono.ttf"));
                return;
            } catch (IOException e15) {
                e15.printStackTrace();
            }
        }
        try {
            yo.a.b();
            List<URI> listC = new vo.c().c();
            ArrayList arrayList = new ArrayList(listC.size());
            Iterator<URI> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(new File(it.next()));
            }
            if (yo.a.b()) {
                arrayList.size();
            }
            if (arrayList.isEmpty()) {
                return;
            }
            List<c> listJ = j(arrayList);
            if (listJ != null && !listJ.isEmpty()) {
                this.f119071a.addAll(listJ);
                return;
            }
            c2.g("PdfBox-Android", "Building on-disk font cache, this may take a while");
            l(arrayList);
            k();
            c2.g("PdfBox-Android", "Finished building on-disk font cache, found " + this.f119071a.size() + " fonts");
        } catch (AccessControlException e16) {
            c2.f("PdfBox-Android", "Error accessing the file system", e16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0013: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:8:0x0013 */
    private void d(File file) throws Throwable {
        m0 m0Var;
        IOException e15;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2 = null;
        try {
            try {
                m0Var = new m0(file);
                try {
                    m0Var.m(new a(file));
                    m0Var.close();
                } catch (IOException e16) {
                    e15 = e16;
                    c2.h("PdfBox-Android", "Could not load font file: " + file, e15);
                    if (m0Var != null) {
                        m0Var.close();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                autoCloseable2 = autoCloseable;
                if (autoCloseable2 != null) {
                    autoCloseable2.close();
                }
                throw th;
            }
        } catch (IOException e17) {
            m0Var = null;
            e15 = e17;
        } catch (Throwable th5) {
            th = th5;
            if (autoCloseable2 != null) {
                autoCloseable2.close();
            }
            throw th;
        }
    }

    private void e(File file) {
        try {
            if (file.getPath().toLowerCase().endsWith(".otf")) {
                f(new so.a0(false, true).c(file), file);
            } else {
                f(new so.j0(false, true).c(file), file);
            }
        } catch (IOException e15) {
            c2.h("PdfBox-Android", "Could not load font file: " + file, e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4 A[Catch: all -> 0x004d, IOException -> 0x00ef, TryCatch #0 {IOException -> 0x00ef, blocks: (B:25:0x00a7, B:27:0x00b0, B:32:0x00d4, B:35:0x00f4, B:37:0x00fe, B:39:0x0143), top: B:55:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe A[Catch: all -> 0x004d, IOException -> 0x00ef, TryCatch #0 {IOException -> 0x00ef, blocks: (B:25:0x00a7, B:27:0x00b0, B:32:0x00d4, B:35:0x00f4, B:37:0x00fe, B:39:0x0143), top: B:55:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    public void f(n0 n0Var, File file) throws IOException {
        int i15;
        int i16;
        int iH;
        int i17;
        byte[] bArrS;
        lp.b bVar;
        so.y yVarV;
        lp.b bVar2;
        File file2 = file;
        a aVar = null;
        try {
            try {
                if (n0Var.getName() != null && n0Var.getName().contains("|")) {
                    this.f119071a.add(new C2901d(file2, f.TTF, "*skippipeinname*", aVar));
                    c2.g("PdfBox-Android", "Skipping font with '|' in name " + n0Var.getName() + " in file " + file2);
                } else if (n0Var.getName() == null) {
                    this.f119071a.add(new C2901d(file2, f.TTF, "*skipnoname*", null));
                    c2.g("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file2);
                } else {
                    if (n0Var.K() == null) {
                        this.f119071a.add(new C2901d(file2, f.TTF, n0Var.getName(), aVar));
                        return;
                    }
                    int iQ = n0Var.K().q();
                    so.z zVarA0 = n0Var.a0();
                    if (zVarA0 != null) {
                        int iO = zVarA0.o();
                        iH = zVarA0.H();
                        int iM = (int) zVarA0.m();
                        int iN = (int) zVarA0.n();
                        bArrS = zVarA0.s();
                        i16 = iN;
                        i15 = iM;
                        i17 = iO;
                    } else {
                        i15 = 0;
                        i16 = 0;
                        iH = -1;
                        i17 = -1;
                        bArrS = null;
                    }
                    if (n0Var instanceof so.c0) {
                        try {
                            if (((so.c0) n0Var).Q1()) {
                                oo.h hVarJ = ((so.c0) n0Var).P1().j();
                                if (hVarJ instanceof oo.a) {
                                    oo.a aVar2 = (oo.a) hVarJ;
                                    bVar = new lp.b(aVar2.s(), aVar2.q(), aVar2.t());
                                } else {
                                    bVar = null;
                                }
                                this.f119071a.add(new c(file2, f.OTF, n0Var.getName(), bVar, iH, i17, i15, i16, iQ, bArrS, this, null));
                            } else {
                                if (n0Var.u0().containsKey("gcid")) {
                                    byte[] bArrT0 = n0Var.t0(n0Var.u0().get("gcid"));
                                    Charset charset = xp.a.f220412a;
                                    String str = new String(bArrT0, 10, 64, charset);
                                    String strSubstring = str.substring(0, str.indexOf(0));
                                    String str2 = new String(bArrT0, 76, 64, charset);
                                    bVar2 = new lp.b(strSubstring, str2.substring(0, str2.indexOf(0)), bArrT0[141] & 255 & (bArrT0[140] << 8));
                                } else {
                                    bVar2 = null;
                                }
                                this.f119071a.add(new c(file, f.TTF, n0Var.getName(), bVar2, iH, i17, i15, i16, iQ, bArrS, this, null));
                            }
                        } catch (IOException e15) {
                            e = e15;
                            file2 = file;
                            this.f119071a.add(new C2901d(file2, f.TTF, "*skipexception*", null));
                            c2.h("PdfBox-Android", "Could not load font file: " + file2, e);
                            return;
                        }
                    } else {
                        if (n0Var.u0().containsKey("gcid")) {
                            byte[] bArrT1 = n0Var.t0(n0Var.u0().get("gcid"));
                            Charset charset2 = xp.a.f220412a;
                            String str3 = new String(bArrT1, 10, 64, charset2);
                            String strSubstring2 = str3.substring(0, str3.indexOf(0));
                            String str4 = new String(bArrT1, 76, 64, charset2);
                            bVar2 = new lp.b(strSubstring2, str4.substring(0, str4.indexOf(0)), bArrT1[141] & 255 & (bArrT1[140] << 8));
                        } else {
                            bVar2 = null;
                        }
                        this.f119071a.add(new c(file, f.TTF, n0Var.getName(), bVar2, iH, i17, i15, i16, iQ, bArrS, this, null));
                    }
                    if (yo.a.b() && (yVarV = n0Var.V()) != null) {
                        yVarV.o();
                        yVarV.k();
                        yVarV.l();
                    }
                }
            } catch (IOException e16) {
                e = e16;
            }
        } finally {
            n0Var.close();
        }
    }

    private void g(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStreamA = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
        try {
            to.d dVarD = to.d.d(fileInputStreamA);
            a aVar = null;
            if (dVarD.getName() == null) {
                this.f119071a.add(new C2901d(file, f.PFB, "*skipnoname*", aVar));
                c2.g("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file);
                fileInputStreamA.close();
                return;
            }
            if (dVarD.getName().contains("|")) {
                this.f119071a.add(new C2901d(file, f.PFB, "*skippipeinname*", aVar));
                c2.g("PdfBox-Android", "Skipping font with '|' in name " + dVarD.getName() + " in file " + file);
                fileInputStreamA.close();
                return;
            }
            fileInputStream = fileInputStreamA;
            try {
                try {
                    this.f119071a.add(new c(file, f.PFB, dVarD.getName(), null, -1, -1, 0, 0, -1, null, this, null));
                    if (yo.a.b()) {
                        dVarD.getName();
                        dVarD.g();
                        dVarD.i();
                    }
                    fileInputStream.close();
                } catch (IOException e15) {
                    e = e15;
                    c2.h("PdfBox-Android", "Could not load font file: " + file, e);
                    fileInputStream.close();
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            fileInputStream = fileInputStreamA;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = fileInputStreamA;
            fileInputStream.close();
            throw th;
        }
    }

    private File h() {
        String property = System.getProperty("pdfbox.fontcache");
        if (i(property)) {
            property = System.getProperty("user.home");
            if (i(property)) {
                property = System.getProperty("java.io.tmpdir");
            }
        }
        return new File(property, ".pdfbox.cache");
    }

    private static boolean i(String str) {
        return (str != null && new File(str).isDirectory() && new File(str).canWrite()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<c> j(List<File> list) throws Throwable {
        File fileH;
        boolean zExists;
        BufferedReader bufferedReader;
        List<c> list2;
        BufferedReader bufferedReader2;
        List<c> list3;
        lp.b bVar;
        int i15;
        byte[] bArr;
        HashSet hashSet = new HashSet(list.size());
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getAbsolutePath());
        }
        ArrayList arrayList = new ArrayList();
        char c15 = 0;
        try {
            fileH = h();
            try {
                zExists = fileH.exists();
            } catch (SecurityException unused) {
                zExists = false;
            }
        } catch (SecurityException unused2) {
            fileH = null;
        }
        if (zExists) {
            try {
                bufferedReader2 = new BufferedReader(new io.sentry.instrumentation.file.m(fileH));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split("\\|", 10);
                            if (strArrSplit.length < 10) {
                                c2.g("PdfBox-Android", "Incorrect line '" + line + "' in font disk cache is skipped");
                            } else {
                                String str = strArrSplit[c15];
                                f fVarValueOf = f.valueOf(strArrSplit[1]);
                                if (strArrSplit[2].length() > 0) {
                                    String[] strArrSplit2 = strArrSplit[2].split("-");
                                    bVar = new lp.b(strArrSplit2[c15], strArrSplit2[1], Integer.parseInt(strArrSplit2[2]));
                                } else {
                                    bVar = null;
                                }
                                if (strArrSplit[3].length() > 0) {
                                    list2 = null;
                                    try {
                                        i15 = (int) Long.parseLong(strArrSplit[3], 16);
                                    } catch (IOException e15) {
                                        e = e15;
                                        c2.h("PdfBox-Android", "Error loading font cache, will be re-built", e);
                                        dp.a.b(bufferedReader2);
                                        return list2;
                                    }
                                } else {
                                    list2 = null;
                                    i15 = -1;
                                }
                                int i16 = strArrSplit[4].length() > 0 ? (int) Long.parseLong(strArrSplit[4], 16) : -1;
                                int i17 = (int) Long.parseLong(strArrSplit[5], 16);
                                int i18 = (int) Long.parseLong(strArrSplit[6], 16);
                                int i19 = strArrSplit[7].length() > 0 ? (int) Long.parseLong(strArrSplit[7], 16) : -1;
                                if (strArrSplit[8].length() > 0) {
                                    byte[] bArr2 = new byte[10];
                                    int i25 = 0;
                                    for (int i26 = 10; i25 < i26; i26 = 10) {
                                        int i27 = i25 * 2;
                                        bArr2[i25] = (byte) (Integer.parseInt(strArrSplit[8].substring(i27, i27 + 2), 16) & GF2Field.MASK);
                                        i25++;
                                        i16 = i16;
                                    }
                                    bArr = bArr2;
                                } else {
                                    bArr = list2;
                                }
                                int i28 = i16;
                                File file = new File(strArrSplit[9]);
                                if (file.exists()) {
                                    arrayList.add(new c(file, fVarValueOf, str, bVar, i15, i28, i17, i18, i19, bArr, this, null));
                                } else {
                                    file.getAbsolutePath();
                                }
                                hashSet.remove(file.getAbsolutePath());
                                c15 = 0;
                            }
                        } catch (IOException e16) {
                            e = e16;
                            list2 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = bufferedReader2;
                        dp.a.b(bufferedReader);
                        throw th;
                    }
                }
                list3 = null;
                dp.a.b(bufferedReader2);
            } catch (IOException e17) {
                e = e17;
                list2 = null;
                bufferedReader2 = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                dp.a.b(bufferedReader);
                throw th;
            }
        } else {
            list3 = null;
        }
        if (hashSet.isEmpty()) {
            return arrayList;
        }
        c2.g("PdfBox-Android", "New fonts found, font cache will be re-built");
        return list3;
    }

    private void k() throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new io.sentry.instrumentation.file.n(h()));
                try {
                    for (c cVar : this.f119071a) {
                        bufferedWriter2.write(cVar.f119076a.trim());
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(cVar.f119077b.toString());
                        bufferedWriter2.write("|");
                        if (cVar.f119078c != null) {
                            bufferedWriter2.write(cVar.f119078c.b() + '-' + cVar.f119078c.a() + '-' + cVar.f119078c.c());
                        }
                        bufferedWriter2.write("|");
                        if (cVar.f119079d > -1) {
                            bufferedWriter2.write(Integer.toHexString(cVar.f119079d));
                        }
                        bufferedWriter2.write("|");
                        if (cVar.f119080e > -1) {
                            bufferedWriter2.write(Integer.toHexString(cVar.f119080e));
                        }
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(Integer.toHexString(cVar.f119081f));
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(Integer.toHexString(cVar.f119082g));
                        bufferedWriter2.write("|");
                        if (cVar.f119083h > -1) {
                            bufferedWriter2.write(Integer.toHexString(cVar.f119083h));
                        }
                        bufferedWriter2.write("|");
                        if (cVar.f119084i != null) {
                            byte[] bArrB = cVar.f119084i.b();
                            for (int i15 = 0; i15 < 10; i15++) {
                                String hexString = Integer.toHexString(bArrB[i15]);
                                if (hexString.length() == 1) {
                                    bufferedWriter2.write(48);
                                }
                                bufferedWriter2.write(hexString);
                            }
                        }
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(cVar.f119085j.getAbsolutePath());
                        bufferedWriter2.newLine();
                    }
                    dp.a.b(bufferedWriter2);
                } catch (IOException e15) {
                    e = e15;
                    bufferedWriter = bufferedWriter2;
                    c2.h("PdfBox-Android", "Could not write to font cache", e);
                    c2.g("PdfBox-Android", "Installed fonts information will have to be reloaded for each start");
                    c2.g("PdfBox-Android", "You can assign a directory to the 'pdfbox.fontcache' property");
                    dp.a.b(bufferedWriter);
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter = bufferedWriter2;
                    dp.a.b(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e16) {
            e = e16;
        } catch (SecurityException unused) {
            dp.a.b(null);
        }
    }

    private void l(List<File> list) throws Throwable {
        for (File file : list) {
            try {
                String lowerCase = file.getPath().toLowerCase();
                if (lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf")) {
                    e(file);
                } else if (lowerCase.endsWith(".ttc") || lowerCase.endsWith(".otc")) {
                    d(file);
                } else if (lowerCase.endsWith(".pfb")) {
                    g(file);
                }
            } catch (IOException e15) {
                c2.h("PdfBox-Android", "Error parsing font " + file.getPath(), e15);
            }
        }
    }

    @Override // lp.l
    public List<? extends g> a() {
        return this.f119071a;
    }
}
