package sd;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import vv.f;
import vv.g;
import vv.h;
import vv.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f180234g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f180235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f180236b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f180237c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f180238d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f180239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f180240f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f180241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final z f180242b;

        private a(String[] strArr, z zVar) {
            this.f180241a = strArr;
            this.f180242b = zVar;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                vv.e eVar = new vv.e();
                for (int i15 = 0; i15 < strArr.length; i15++) {
                    c.I(eVar, strArr[i15]);
                    eVar.readByte();
                    hVarArr[i15] = eVar.d0();
                }
                return new a((String[]) strArr.clone(), z.t(hVarArr));
            } catch (IOException e15) {
                throw new AssertionError(e15);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i15 = 0; i15 <= 31; i15++) {
            f180234g[i15] = String.format("\\u%04x", Integer.valueOf(i15));
        }
        String[] strArr = f180234g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void I(f fVar, String str) {
        String str2;
        String[] strArr = f180234g;
        fVar.writeByte(34);
        int length = str.length();
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt = str.charAt(i16);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i15 < i16) {
                        fVar.v1(str, i15, i16);
                    }
                    fVar.k1(str2);
                    i15 = i16 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i15 < i16) {
                    fVar.v1(str, i15, i16);
                }
                fVar.k1(str2);
                i15 = i16 + 1;
            }
        }
        if (i15 < length) {
            fVar.v1(str, i15, length);
        }
        fVar.writeByte(34);
    }

    public static c u(g gVar) {
        return new e(gVar);
    }

    final void C(int i15) {
        int i16 = this.f180235a;
        int[] iArr = this.f180236b;
        if (i16 == iArr.length) {
            if (i16 == 256) {
                throw new sd.a("Nesting too deep at " + W());
            }
            this.f180236b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f180237c;
            this.f180237c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f180238d;
            this.f180238d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f180236b;
        int i17 = this.f180235a;
        this.f180235a = i17 + 1;
        iArr3[i17] = i15;
    }

    public abstract int E(a aVar);

    public abstract void G0();

    public abstract void H();

    final sd.b J(String str) throws sd.b {
        throw new sd.b(str + " at path " + W());
    }

    public final String W() {
        return d.a(this.f180235a, this.f180236b, this.f180237c, this.f180238d);
    }

    public abstract void Y();

    public abstract void h();

    public abstract void h0();

    public abstract String h1();

    public abstract void m();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract boolean p();

    public abstract String q2();

    public abstract boolean r();

    public abstract b y();
}
