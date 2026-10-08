package wv;

import java.util.GregorianCalendar;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f¨\u0006\u0011"}, d2 = {"", "year", "month", "day", "hour", "minute", "second", "", "a", "(IIIIII)J", "", "[B", "getEMPTY_BYTE_ARRAY", "()[B", "EMPTY_BYTE_ARRAY", "Ljava/util/zip/CRC32;", "CRC32", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f215282a = new byte[0];

    public static final long a(int i15, int i16, int i17, int i18, int i19, int i25) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i15, i16 - 1, i17, i18, i19, i25);
        return gregorianCalendar.getTime().getTime();
    }
}
