package hn;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<CharsetEncoder> f85810c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetEncoder[] f85811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f85812b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i15 = 0; i15 < 20; i15++) {
            String str = strArr[i15];
            if (c.g(str) != null) {
                try {
                    f85810c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public d(String str, Charset charset, int i15) {
        boolean z15;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i16 = 0;
        boolean z16 = charset != null && charset.name().startsWith("UTF");
        for (int i17 = 0; i17 < str.length(); i17++) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                }
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char cCharAt = str.charAt(i17);
                if (cCharAt == i15 || charsetEncoder.canEncode(cCharAt)) {
                    z15 = true;
                    break;
                }
            }
            if (!z15) {
                for (CharsetEncoder charsetEncoder2 : f85810c) {
                    if (charsetEncoder2.canEncode(str.charAt(i17))) {
                        arrayList.add(charsetEncoder2);
                        z15 = true;
                        break;
                    }
                }
            }
            if (!z15) {
                z16 = true;
            }
        }
        if (arrayList.size() != 1 || z16) {
            this.f85811a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it4 = arrayList.iterator();
            int i18 = 0;
            while (it4.hasNext()) {
                this.f85811a[i18] = (CharsetEncoder) it4.next();
                i18++;
            }
            this.f85811a[i18] = StandardCharsets.UTF_8.newEncoder();
            this.f85811a[i18 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f85811a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f85811a;
                if (i16 >= charsetEncoderArr.length) {
                    break;
                } else if (charsetEncoderArr[i16] == null || !charset.name().equals(this.f85811a[i16].charset().name())) {
                    i16++;
                }
            }
            i16 = -1;
        } else {
            i16 = -1;
        }
        this.f85812b = i16;
    }

    public boolean a(char c15, int i15) {
        return this.f85811a[i15].canEncode("" + c15);
    }

    public byte[] b(char c15, int i15) {
        return ("" + c15).getBytes(this.f85811a[i15].charset());
    }

    public byte[] c(String str, int i15) {
        return str.getBytes(this.f85811a[i15].charset());
    }

    public Charset d(int i15) {
        return this.f85811a[i15].charset();
    }

    public int e(int i15) {
        return c.e(this.f85811a[i15].charset()).j();
    }

    public int f() {
        return this.f85812b;
    }

    public int g() {
        return this.f85811a.length;
    }
}
