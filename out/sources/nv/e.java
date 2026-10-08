package nv;

import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lnv/e;", "", "<init>", "()V", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "(ZIIII)Ljava/lang/String;", "b", "(I)Ljava/lang/String;", "a", "(II)Ljava/lang/String;", "Lvv/h;", "Lvv/h;", "CONNECTION_PREFACE", "", "[Ljava/lang/String;", "FRAME_NAMES", "d", "FLAGS", "e", "BINARY", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f138943a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final vv.h CONNECTION_PREFACE = vv.h.INSTANCE.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final String[] FLAGS = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final String[] BINARY;

    static {
        String[] strArr = new String[256];
        for (int i15 = 0; i15 < 256; i15++) {
            strArr[i15] = r.O(gv.d.t("%8s", Integer.toBinaryString(i15)), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i16 = iArr[0];
        strArr2[i16 | 8] = strArr2[i16] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i17 = 0; i17 < 3; i17++) {
            int i18 = iArr2[i17];
            int i19 = iArr[0];
            String[] strArr3 = FLAGS;
            int i25 = i19 | i18;
            strArr3[i25] = strArr3[i19] + '|' + strArr3[i18];
            strArr3[i25 | 8] = strArr3[i19] + '|' + strArr3[i18] + "|PADDED";
        }
        int length = FLAGS.length;
        for (int i26 = 0; i26 < length; i26++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i26] == null) {
                strArr4[i26] = BINARY[i26];
            }
        }
    }

    private e() {
    }

    public final String a(int type, int flags) {
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type == 4 || type == 6) {
                return flags == 1 ? "ACK" : BINARY[flags];
            }
            if (type != 7 && type != 8) {
                String[] strArr = FLAGS;
                String str = flags < strArr.length ? strArr[flags] : BINARY[flags];
                if (type != 5 || (flags & 4) == 0) {
                    return (type != 0 || (flags & 32) == 0) ? str : r.P(str, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return r.P(str, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return BINARY[flags];
    }

    public final String b(int type) {
        String[] strArr = FRAME_NAMES;
        return type < strArr.length ? strArr[type] : gv.d.t("0x%02x", Integer.valueOf(type));
    }

    public final String c(boolean inbound, int streamId, int length, int type, int flags) {
        return gv.d.t("%s 0x%08x %5d %-13s %s", inbound ? "<<" : ">>", Integer.valueOf(streamId), Integer.valueOf(length), b(type), a(type, flags));
    }
}
