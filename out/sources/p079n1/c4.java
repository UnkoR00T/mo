package p079n1;

import p071kotlin.Metadata;
import q4.a4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "startIndex", "b", "(Ljava/lang/CharSequence;I)I", "a", "index", "Lq4/z3;", "c", "(Ljava/lang/CharSequence;I)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c4 {
    public static final int a(CharSequence charSequence, int i15) {
        int length = charSequence.length();
        while (i15 < length) {
            if (charSequence.charAt(i15) == '\n') {
                return i15;
            }
            i15++;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i15) {
        while (i15 > 0) {
            if (charSequence.charAt(i15 - 1) == '\n') {
                return i15;
            }
            i15--;
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i15) {
        return a4.b(b(charSequence, i15), a(charSequence, i15));
    }
}
