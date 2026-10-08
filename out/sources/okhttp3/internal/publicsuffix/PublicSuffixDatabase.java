package okhttp3.internal.publicsuffix;

import ar.b;
import fr.k;
import fr.p0;
import fr.t;
import fu.r;
import gv.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import oq.i0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import ov.h;
import p071kotlin.Metadata;
import pq.v;
import vv.g;
import vv.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "Loq/i0;", "e", "d", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f146533f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f146534g = v.e("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f146535h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private byte[] publicSuffixExceptionListBytes;

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "<init>", "()V", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i15) {
            int i16;
            int iD;
            boolean z15;
            int iD2;
            int length = bArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = (i17 + length) / 2;
                while (i18 > -1 && bArr[i18] != 10) {
                    i18--;
                }
                int i19 = i18 + 1;
                int i25 = 1;
                while (true) {
                    i16 = i19 + i25;
                    if (bArr[i16] == 10) {
                        break;
                    }
                    i25++;
                }
                int i26 = i16 - i19;
                int i27 = i15;
                boolean z16 = false;
                int i28 = 0;
                int i29 = 0;
                while (true) {
                    if (z16) {
                        iD = 46;
                        z15 = false;
                    } else {
                        boolean z17 = z16;
                        iD = d.d(bArr2[i27][i28], GF2Field.MASK);
                        z15 = z17;
                    }
                    iD2 = iD - d.d(bArr[i19 + i29], GF2Field.MASK);
                    if (iD2 != 0) {
                        break;
                    }
                    i29++;
                    i28++;
                    if (i29 == i26) {
                        break;
                    }
                    if (bArr2[i27].length != i28) {
                        z16 = z15;
                    } else {
                        if (i27 == bArr2.length - 1) {
                            break;
                        }
                        i27++;
                        z16 = true;
                        i28 = -1;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i35 = i26 - i29;
                        int length2 = bArr2[i27].length - i28;
                        int length3 = bArr2.length;
                        for (int i36 = i27 + 1; i36 < length3; i36++) {
                            length2 += bArr2[i36].length;
                        }
                        if (length2 >= i35) {
                            if (length2 <= i35) {
                                return new String(bArr, i19, i26, StandardCharsets.UTF_8);
                            }
                        }
                    }
                    i17 = i16 + 1;
                }
                length = i18;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f146535h;
        }

        private Companion() {
        }
    }

    private final List<String> b(List<String> domainLabels) {
        String str;
        String strB;
        String str2;
        List<String> listN;
        List<String> listN2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i15 = 0; i15 < size; i15++) {
            bArr[i15] = domainLabels.get(i15).getBytes(StandardCharsets.UTF_8);
        }
        int i16 = 0;
        while (true) {
            str = null;
            if (i16 >= size) {
                strB = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                bArr2 = null;
            }
            strB = companion.b(bArr2, bArr, i16);
            if (strB != null) {
                break;
            }
            i16++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                str2 = null;
                break;
            }
            bArr3[i17] = f146533f;
            Companion companion2 = INSTANCE;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                bArr4 = null;
            }
            String strB2 = companion2.b(bArr4, bArr3, i17);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i17++;
        }
        if (str2 != null) {
            int i18 = size - 1;
            for (int i19 = 0; i19 < i18; i19++) {
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    bArr5 = null;
                }
                String strB3 = companion3.b(bArr5, bArr, i19);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return r.U0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f146534g;
        }
        if (strB == null || (listN = r.U0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listN = v.n();
        }
        if (str2 == null || (listN2 = r.U0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listN2 = v.n();
        }
        return listN.size() > listN2.size() ? listN : listN2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    private final void d() {
        try {
            p0 p0Var = new p0();
            p0 p0Var2 = new p0();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                g gVarC = vv.v.c(new p(vv.v.j(resourceAsStream)));
                try {
                    p0Var.f66410a = gVarC.R1(gVarC.readInt());
                    p0Var2.f66410a = gVarC.R1(gVarC.readInt());
                    i0 i0Var = i0.f148189a;
                    b.a(gVarC, null);
                    synchronized (this) {
                        this.publicSuffixListBytes = (byte[]) p0Var.f66410a;
                        this.publicSuffixExceptionListBytes = (byte[]) p0Var2.f66410a;
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        b.a(gVarC, th4);
                        throw th5;
                    }
                }
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th6) {
            this.readCompleteLatch.countDown();
            throw th6;
        }
    }

    private final void e() {
        boolean z15 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z15 = true;
                } catch (IOException e15) {
                    h.INSTANCE.g().j("Failed to read public suffix list", 5, e15);
                    if (!z15) {
                        return;
                    }
                }
            } catch (Throwable th4) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th4;
            }
        }
        if (!z15) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> f(String domain) {
        List<String> listU0 = r.U0(domain, new char[]{'.'}, false, 0, 6, null);
        return t.c(v.x0(listU0), "") ? v.g0(listU0, 1) : listU0;
    }

    public final String c(String domain) {
        int size;
        int size2;
        List<String> listF = f(IDN.toUnicode(domain));
        List<String> listB = b(listF);
        if (listF.size() == listB.size() && listB.get(0).charAt(0) != '!') {
            return null;
        }
        if (listB.get(0).charAt(0) == '!') {
            size = listF.size();
            size2 = listB.size();
        } else {
            size = listF.size();
            size2 = listB.size() + 1;
        }
        return eu.k.F(eu.k.w(v.a0(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
