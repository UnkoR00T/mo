package en;

import java.util.Map;
import ln.j;
import ln.k;
import ln.l;
import ln.o;
import ln.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52076a;

        static {
            int[] iArr = new int[en.a.values().length];
            f52076a = iArr;
            try {
                iArr[en.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52076a[en.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52076a[en.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52076a[en.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52076a[en.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52076a[en.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52076a[en.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f52076a[en.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f52076a[en.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f52076a[en.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f52076a[en.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f52076a[en.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f52076a[en.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // en.g
    public hn.b a(String str, en.a aVar, int i15, int i16, Map<c, ?> map) {
        g kVar;
        switch (a.f52076a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new on.a();
                break;
            case 6:
                kVar = new ln.f();
                break;
            case 7:
                kVar = new ln.h();
                break;
            case 8:
                kVar = new ln.d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new mn.a();
                break;
            case 11:
                kVar = new ln.b();
                break;
            case 12:
                kVar = new jn.a();
                break;
            case 13:
                kVar = new fn.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return kVar.a(str, aVar, i15, i16, map);
    }

    public hn.b b(String str, en.a aVar, int i15, int i16) {
        return a(str, aVar, i15, i16, null);
    }
}
