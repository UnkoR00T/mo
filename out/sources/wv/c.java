package wv;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "c", "", "b", "(C)I", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(char c15) {
        if ('0' <= c15 && c15 < ':') {
            return c15 - '0';
        }
        if ('a' <= c15 && c15 < 'g') {
            return c15 - 'W';
        }
        if ('A' <= c15 && c15 < 'G') {
            return c15 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c15);
    }
}
