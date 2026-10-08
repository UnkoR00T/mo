package ep;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Object> f52614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f52615f;

    public g(zo.a aVar) {
        super(new d(aVar.a()));
        this.f52614e = new ArrayList(100);
        this.f52615f = new byte[10];
    }

    private boolean M() {
        return O(this.f52581b.peek());
    }

    private boolean N(k kVar) {
        int i15 = kVar.read(this.f52615f, 0, 10);
        boolean z15 = true;
        if (i15 > 0) {
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < i15; i18++) {
                byte b15 = this.f52615f[i18];
                if ((b15 != 0 && b15 < 9) || (b15 > 10 && b15 < 32 && b15 != 13)) {
                    z15 = false;
                    break;
                }
                if (i16 == -1 && b15 != 0 && b15 != 9 && b15 != 32 && b15 != 10 && b15 != 13) {
                    i16 = i18;
                } else if (i16 != -1 && i17 == -1 && (b15 == 0 || b15 == 9 || b15 == 32 || b15 == 10 || b15 == 13)) {
                    i17 = i18;
                }
            }
            if (i17 != -1 && i16 != -1) {
                String str = new String(this.f52615f, i16, i17 - i16);
                if (!"Q".equals(str) && !"EMC".equals(str) && !ip.a.f96137b.equals(str)) {
                    z15 = false;
                }
            }
            if (i15 == 10) {
                int i19 = (i16 == -1 || i17 != -1) ? i17 : 10;
                if (i19 != -1 && i16 != -1 && i19 - i16 > 3) {
                    z15 = false;
                }
            }
            kVar.q3(this.f52615f, 0, i15);
        }
        if (!z15) {
            c2.g("PdfBox-Android", "ignoring 'EI' assumed to be in the middle of inline image at stream offset " + kVar.getPosition());
        }
        return z15;
    }

    private boolean O(int i15) {
        return i15 == 10 || i15 == 13 || i15 == 32;
    }

    public List<Object> L() {
        return this.f52614e;
    }

    public void P() throws IOException {
        while (true) {
            Object objQ = Q();
            if (objQ == null) {
                return;
            } else {
                this.f52614e.add(objQ);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fb, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.g.Q():java.lang.Object");
    }

    protected String R() {
        J();
        StringBuilder sb5 = new StringBuilder(4);
        int iPeek = this.f52581b.peek();
        while (iPeek != -1 && !o(iPeek) && !d(iPeek) && iPeek != 91 && iPeek != 60 && iPeek != 40 && iPeek != 47 && (iPeek < 48 || iPeek > 57)) {
            char c15 = (char) this.f52581b.read();
            int iPeek2 = this.f52581b.peek();
            sb5.append(c15);
            if (c15 == 'd' && (iPeek2 == 48 || iPeek2 == 49)) {
                sb5.append((char) this.f52581b.read());
                iPeek = this.f52581b.peek();
            } else {
                iPeek = iPeek2;
            }
        }
        return sb5.toString();
    }

    public g(byte[] bArr) {
        super(new j(new dp.d(bArr)));
        this.f52614e = new ArrayList(100);
        this.f52615f = new byte[10];
    }
}
