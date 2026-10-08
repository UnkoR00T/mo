package hw;

import er.l;
import fu.r;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u0007*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\rJ%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\b\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhw/a;", "", "<init>", "()V", "", "Lkotlin/Function1;", "", "Loq/i0;", "f", "d", "(Ljava/lang/CharSequence;Ler/l;)V", "c", "", "(I)Ljava/lang/String;", "seq", "index", "codePointOffset", "e", "(Ljava/lang/CharSequence;II)I", "char", "a", "(I)I", "", "high", "low", "(CC)I", "b", "(Ljava/lang/CharSequence;I)I", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f86718a = new a();

    private a() {
    }

    public final int a(int i15) {
        return i15 >= 65536 ? 2 : 1;
    }

    public final int b(CharSequence seq, int index) {
        int i15;
        char cCharAt = seq.charAt(index);
        if (Character.isHighSurrogate(cCharAt) && (i15 = index + 1) < seq.length()) {
            char cCharAt2 = seq.charAt(i15);
            if (Character.isLowSurrogate(cCharAt2)) {
                return f(cCharAt, cCharAt2);
            }
        }
        return cCharAt;
    }

    public final String c(int c15) {
        return a(c15) == 1 ? String.valueOf((char) c15) : r.y(new char[]{(char) ((c15 >>> 10) + 55232), (char) ((c15 & 1023) + 56320)});
    }

    public final void d(CharSequence charSequence, l<? super Integer, i0> lVar) {
        int iA = 0;
        while (iA < charSequence.length()) {
            int iB = b(charSequence, iA);
            lVar.b(Integer.valueOf(iB));
            iA += a(iB);
        }
    }

    public final int e(CharSequence seq, int index, int codePointOffset) {
        int length = seq.length();
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }
        if (codePointOffset < 0) {
            while (index > 0 && codePointOffset < 0) {
                int i15 = index - 1;
                index = (Character.isLowSurrogate(seq.charAt(i15)) && i15 > 0 && Character.isHighSurrogate(seq.charAt(index + (-2)))) ? index - 2 : i15;
                codePointOffset++;
            }
            if (codePointOffset >= 0) {
                return index;
            }
            throw new IndexOutOfBoundsException();
        }
        int i16 = 0;
        while (index < length && i16 < codePointOffset) {
            int i17 = index + 1;
            index = (Character.isHighSurrogate(seq.charAt(index)) && i17 < length && Character.isLowSurrogate(seq.charAt(i17))) ? index + 2 : i17;
            i16++;
        }
        if (i16 >= codePointOffset) {
            return index;
        }
        throw new IndexOutOfBoundsException();
    }

    public final int f(char high, char low) {
        return ((high << '\n') + low) - 56613888;
    }
}
