package po;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f161370i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f161362a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f161363b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f161364c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f161365d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f161366e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f161367f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f161368g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f161369h = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<d> f161371j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<Integer, String> f161372k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, byte[]> f161373l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<Integer, Integer> f161374m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<a> f161375n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f161376o = -1;

    b() {
    }

    private int e(byte[] bArr, int i15, int i16) {
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            i17 = (i17 << 8) | ((bArr[i15 + i18] + HPKE.mode_base) % 256);
        }
        return i17;
    }

    static int u(byte[] bArr, int i15) {
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 = (i16 << 8) | (bArr[i17] & 255);
        }
        return i16;
    }

    void a(int i15, int i16) {
        this.f161374m.put(Integer.valueOf(i16), Integer.valueOf(i15));
    }

    void b(char c15, char c16, int i15) {
        a aVar;
        if (this.f161375n.isEmpty()) {
            aVar = null;
        } else {
            List<a> list = this.f161375n;
            aVar = list.get(list.size() - 1);
        }
        if (aVar == null || !aVar.a(c15, c16, i15)) {
            this.f161375n.add(new a(c15, c16, i15));
        }
    }

    void c(byte[] bArr, String str) {
        this.f161373l.put(str, (byte[]) bArr.clone());
        int iE = e(bArr, 0, bArr.length);
        this.f161372k.put(Integer.valueOf(iE), str);
        if (" ".equals(str)) {
            this.f161376o = iE;
        }
    }

    void d(d dVar) {
        this.f161371j.add(dVar);
        this.f161370i = Math.max(this.f161370i, dVar.a());
        this.f161369h = Math.min(this.f161369h, dVar.a());
    }

    public byte[] f(String str) {
        return this.f161373l.get(str);
    }

    public String g() {
        return this.f161363b;
    }

    public String h() {
        return this.f161367f;
    }

    public String i() {
        return this.f161366e;
    }

    public boolean j() {
        return (this.f161374m.isEmpty() && this.f161375n.isEmpty()) ? false : true;
    }

    public boolean k() {
        return !this.f161372k.isEmpty();
    }

    public int l(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[this.f161370i];
        inputStream.read(bArr, 0, this.f161369h);
        inputStream.mark(this.f161370i);
        int i15 = this.f161369h - 1;
        while (i15 < this.f161370i) {
            i15++;
            Iterator<d> it = this.f161371j.iterator();
            while (it.hasNext()) {
                if (it.next().b(bArr, i15)) {
                    return u(bArr, i15);
                }
            }
            if (i15 < this.f161370i) {
                bArr[i15] = (byte) inputStream.read();
            }
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i16 = 0; i16 < this.f161370i; i16++) {
            sb5.append(String.format("0x%02X (%04o) ", Byte.valueOf(bArr[i16]), Byte.valueOf(bArr[i16])));
        }
        c2.g("PdfBox-Android", "Invalid character code sequence " + ((Object) sb5) + "in CMap " + this.f161363b);
        if (inputStream.markSupported()) {
            inputStream.reset();
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("mark() and reset() not supported, ");
            sb6.append(this.f161370i - 1);
            sb6.append(" bytes have been skipped");
            c2.g("PdfBox-Android", sb6.toString());
        }
        return u(bArr, this.f161369h);
    }

    public void m(String str) {
        this.f161363b = str;
    }

    public void n(String str) {
        this.f161367f = str;
    }

    public void o(String str) {
        this.f161366e = str;
    }

    public void p(int i15) {
        this.f161368g = i15;
    }

    public void q(int i15) {
        this.f161365d = i15;
    }

    public void r(String str) {
        this.f161364c = str;
    }

    public void s(int i15) {
        this.f161362a = i15;
    }

    public int t(int i15) {
        Integer num = this.f161374m.get(Integer.valueOf(i15));
        if (num != null) {
            return num.intValue();
        }
        Iterator<a> it = this.f161375n.iterator();
        while (it.hasNext()) {
            int iB = it.next().b((char) i15);
            if (iB != -1) {
                return iB;
            }
        }
        return 0;
    }

    public String toString() {
        return this.f161363b;
    }

    public String v(int i15) {
        return this.f161372k.get(Integer.valueOf(i15));
    }

    void w(b bVar) {
        Iterator<d> it = bVar.f161371j.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        this.f161372k.putAll(bVar.f161372k);
        this.f161374m.putAll(bVar.f161374m);
        this.f161375n.addAll(bVar.f161375n);
    }
}
