package fu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u000f\u001a#\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0014*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010 \u001a\u00020\u0000*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b \u0010!\u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010(\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b(\u0010%\u001a#\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b)\u0010'\u001a#\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b*\u0010%\u001a#\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b+\u0010'\u001a#\u0010,\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b,\u0010%\u001a#\u0010-\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0000¢\u0006\u0004\b-\u0010'\u001a)\u00101\u001a\u00020\b*\u00020\b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u00020\b*\u00020\b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b¢\u0006\u0004\b3\u00104\u001a\u0019\u00106\u001a\u00020\u0000*\u00020\u00002\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107\u001a\u0019\u00109\u001a\u00020\u0000*\u00020\u00002\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b9\u00107\u001a;\u0010>\u001a\u00020\u0014*\u00020\b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u0014H\u0000¢\u0006\u0004\b>\u0010?\u001a#\u0010A\u001a\u00020\u0014*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bA\u0010B\u001a#\u0010C\u001a\u00020\u0014*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bC\u0010B\u001a#\u0010D\u001a\u00020\u0014*\u00020\b2\u0006\u00105\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bD\u0010E\u001a#\u0010F\u001a\u00020\u0014*\u00020\b2\u0006\u00108\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bF\u0010E\u001a#\u0010G\u001a\u00020\u0000*\u00020\b2\u0006\u0010;\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bG\u0010H\u001a-\u0010I\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bI\u0010J\u001a-\u0010K\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bK\u0010J\u001a=\u0010M\u001a\u00020\u000b*\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00142\b\b\u0002\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bM\u0010N\u001aG\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010Q*\u00020\b2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00000O2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bR\u0010S\u001a-\u0010T\u001a\u00020\u000b*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bT\u0010U\u001a-\u0010W\u001a\u00020\u000b*\u00020\b2\u0006\u0010V\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bW\u0010X\u001a-\u0010Y\u001a\u00020\u000b*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bY\u0010U\u001a-\u0010Z\u001a\u00020\u000b*\u00020\b2\u0006\u0010V\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bZ\u0010X\u001a&\u0010[\u001a\u00020\u0014*\u00020\b2\u0006\u0010;\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b[\u0010E\u001a&\u0010\\\u001a\u00020\u0014*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\\\u0010B\u001a?\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001a0_*\u00020\b2\u0006\u0010]\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\b`\u0010a\u001aG\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001a0_*\u00020\b2\u000e\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010f\u001a\u00020e2\u0006\u0010^\u001a\u00020\u000bH\u0000¢\u0006\u0004\bf\u0010g\u001a?\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b2\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000b\"\u00020\u00002\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000b¢\u0006\u0004\bi\u0010j\u001a7\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b2\n\u0010]\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000b¢\u0006\u0004\bk\u0010l\u001a1\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\bm\u0010n\u001a\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00000_*\u00020\b¢\u0006\u0004\bo\u0010p\u001a\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b¢\u0006\u0004\bq\u0010r\u001a\u0015\u0010s\u001a\u0004\u0018\u00010\u0014*\u00020\u0000H\u0007¢\u0006\u0004\bs\u0010t\"\u0015\u0010w\u001a\u00020\u001a*\u00020\b8F¢\u0006\u0006\u001a\u0004\bu\u0010v\"\u0015\u0010z\u001a\u00020\u000b*\u00020\b8F¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006{"}, d2 = {"", "", "", "chars", "v1", "(Ljava/lang/String;[C)Ljava/lang/String;", "x1", "w1", "", "u1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "D0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "E0", "(Ljava/lang/String;IC)Ljava/lang/String;", "B0", "C0", "", "t0", "(Ljava/lang/CharSequence;)Z", "index", "l0", "(Ljava/lang/CharSequence;I)Z", "Llr/i;", "range", "c1", "(Ljava/lang/String;Llr/i;)Ljava/lang/String;", "a1", "(Ljava/lang/CharSequence;Llr/i;)Ljava/lang/CharSequence;", "b1", "(Ljava/lang/CharSequence;Llr/i;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "l1", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "m1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "d1", "e1", "p1", "q1", "h1", "i1", "startIndex", "endIndex", "replacement", "P0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "N0", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "prefix", "M0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "O0", "thisOffset", "other", "otherOffset", "ignoreCase", "L0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "W0", "(Ljava/lang/CharSequence;CZ)Z", "e0", "X0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "f0", "Y", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Ljava/lang/String;", "s0", "(Ljava/lang/CharSequence;[CIZ)I", "y0", "last", "o0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Loq/r;", "i0", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Loq/r;", "m0", "(Ljava/lang/CharSequence;CIZ)I", "string", "n0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "u0", "v0", "b0", "a0", "delimiters", "limit", "Leu/h;", "F0", "(Ljava/lang/CharSequence;[CIZI)Leu/h;", "", "G0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Leu/h;", "Loq/i0;", "Q0", "(I)V", "", "S0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "R0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "T0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "z0", "(Ljava/lang/CharSequence;)Leu/h;", "A0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "t1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "j0", "(Ljava/lang/CharSequence;)Llr/i;", "indices", "k0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class g0 extends d0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"fu/g0$a", "Leu/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements eu.h<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f67073a;

        public a(CharSequence charSequence) {
            this.f67073a = charSequence;
        }

        @Override // eu.h
        public Iterator<String> iterator() {
            return new i(this.f67073a);
        }
    }

    public static List<String> A0(CharSequence charSequence) {
        return eu.k.P(z0(charSequence));
    }

    public static final CharSequence B0(CharSequence charSequence, int i15, char c15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("Desired length " + i15 + " is less than zero.");
        }
        if (i15 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb5 = new StringBuilder(i15);
        sb5.append(charSequence);
        int length = i15 - charSequence.length();
        int i16 = 1;
        if (1 <= length) {
            while (true) {
                sb5.append(c15);
                if (i16 == length) {
                    break;
                }
                i16++;
            }
        }
        return sb5;
    }

    public static String C0(String str, int i15, char c15) {
        return B0(str, i15, c15).toString();
    }

    public static final CharSequence D0(CharSequence charSequence, int i15, char c15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("Desired length " + i15 + " is less than zero.");
        }
        if (i15 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb5 = new StringBuilder(i15);
        int length = i15 - charSequence.length();
        int i16 = 1;
        if (1 <= length) {
            while (true) {
                sb5.append(c15);
                if (i16 == length) {
                    break;
                }
                i16++;
            }
        }
        sb5.append(charSequence);
        return sb5;
    }

    public static String E0(String str, int i15, char c15) {
        return D0(str, i15, c15).toString();
    }

    private static final eu.h<lr.i> F0(CharSequence charSequence, final char[] cArr, int i15, final boolean z15, int i16) {
        Q0(i16);
        return new e(charSequence, i15, i16, new er.p() { // from class: fu.f0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g0.J0(cArr, z15, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final eu.h<lr.i> G0(CharSequence charSequence, String[] strArr, int i15, final boolean z15, int i16) {
        Q0(i16);
        final List listF = pq.n.f(strArr);
        return new e(charSequence, i15, i16, new er.p() { // from class: fu.e0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g0.K0(listF, z15, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ eu.h H0(CharSequence charSequence, char[] cArr, int i15, boolean z15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            z15 = false;
        }
        if ((i17 & 8) != 0) {
            i16 = 0;
        }
        return F0(charSequence, cArr, i15, z15, i16);
    }

    static /* synthetic */ eu.h I0(CharSequence charSequence, String[] strArr, int i15, boolean z15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            z15 = false;
        }
        if ((i17 & 8) != 0) {
            i16 = 0;
        }
        return G0(charSequence, strArr, i15, z15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.r J0(char[] cArr, boolean z15, CharSequence charSequence, int i15) {
        int iS0 = s0(charSequence, cArr, i15, z15);
        if (iS0 < 0) {
            return null;
        }
        return oq.y.a(Integer.valueOf(iS0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.r K0(List list, boolean z15, CharSequence charSequence, int i15) {
        oq.r<Integer, String> rVarI0 = i0(charSequence, list, i15, z15, false);
        if (rVarI0 != null) {
            return oq.y.a(rVarI0.c(), Integer.valueOf(rVarI0.d().length()));
        }
        return null;
    }

    public static final boolean L0(CharSequence charSequence, int i15, CharSequence charSequence2, int i16, int i17, boolean z15) {
        if (i16 < 0 || i15 < 0 || i15 > charSequence.length() - i17 || i16 > charSequence2.length() - i17) {
            return false;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            if (!c.g(charSequence.charAt(i15 + i18), charSequence2.charAt(i16 + i18), z15)) {
                return false;
            }
        }
        return true;
    }

    public static String M0(String str, CharSequence charSequence) {
        return Z0(str, charSequence, false, 2, null) ? str.substring(charSequence.length()) : str;
    }

    public static CharSequence N0(CharSequence charSequence, int i15, int i16) {
        if (i16 >= i15) {
            if (i16 == i15) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb5 = new StringBuilder(charSequence.length() - (i16 - i15));
            sb5.append(charSequence, 0, i15);
            sb5.append(charSequence, i16, charSequence.length());
            return sb5;
        }
        throw new IndexOutOfBoundsException("End index (" + i16 + ") is less than start index (" + i15 + ").");
    }

    public static String O0(String str, CharSequence charSequence) {
        return h0(str, charSequence, false, 2, null) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    public static CharSequence P0(CharSequence charSequence, int i15, int i16, CharSequence charSequence2) {
        if (i16 >= i15) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequence, 0, i15);
            sb5.append(charSequence2);
            sb5.append(charSequence, i16, charSequence.length());
            return sb5;
        }
        throw new IndexOutOfBoundsException("End index (" + i16 + ") is less than start index (" + i15 + ").");
    }

    public static final void Q0(int i15) {
        if (i15 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i15).toString());
    }

    public static final List<String> R0(CharSequence charSequence, char[] cArr, boolean z15, int i15) {
        if (cArr.length == 1) {
            return T0(charSequence, String.valueOf(cArr[0]), z15, i15);
        }
        Iterable iterableU = eu.k.u(H0(charSequence, cArr, 0, z15, i15, 2, null));
        ArrayList arrayList = new ArrayList(pq.v.y(iterableU, 10));
        Iterator it = iterableU.iterator();
        while (it.hasNext()) {
            arrayList.add(b1(charSequence, (lr.i) it.next()));
        }
        return arrayList;
    }

    public static final List<String> S0(CharSequence charSequence, String[] strArr, boolean z15, int i15) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return T0(charSequence, str, z15, i15);
            }
        }
        Iterable iterableU = eu.k.u(I0(charSequence, strArr, 0, z15, i15, 2, null));
        ArrayList arrayList = new ArrayList(pq.v.y(iterableU, 10));
        Iterator it = iterableU.iterator();
        while (it.hasNext()) {
            arrayList.add(b1(charSequence, (lr.i) it.next()));
        }
        return arrayList;
    }

    private static final List<String> T0(CharSequence charSequence, String str, boolean z15, int i15) {
        Q0(i15);
        int length = 0;
        int iN0 = n0(charSequence, str, 0, z15);
        if (iN0 == -1 || i15 == 1) {
            return pq.v.e(charSequence.toString());
        }
        boolean z16 = i15 > 0;
        ArrayList arrayList = new ArrayList(z16 ? lr.m.j(i15, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iN0).toString());
            length = str.length() + iN0;
            if (z16 && arrayList.size() == i15 - 1) {
                break;
            }
            iN0 = n0(charSequence, str, length, z15);
        } while (iN0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List U0(CharSequence charSequence, char[] cArr, boolean z15, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        if ((i16 & 4) != 0) {
            i15 = 0;
        }
        return R0(charSequence, cArr, z15, i15);
    }

    public static /* synthetic */ List V0(CharSequence charSequence, String[] strArr, boolean z15, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        if ((i16 & 4) != 0) {
            i15 = 0;
        }
        return S0(charSequence, strArr, z15, i15);
    }

    public static final boolean W0(CharSequence charSequence, char c15, boolean z15) {
        return charSequence.length() > 0 && c.g(charSequence.charAt(0), c15, z15);
    }

    public static final boolean X0(CharSequence charSequence, CharSequence charSequence2, boolean z15) {
        return (!z15 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? d0.V((String) charSequence, (String) charSequence2, false, 2, null) : L0(charSequence, 0, charSequence2, 0, charSequence2.length(), z15);
    }

    public static final String Y(CharSequence charSequence, CharSequence charSequence2, boolean z15) {
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i15 = 0;
        while (i15 < iMin && c.g(charSequence.charAt(i15), charSequence2.charAt(i15), z15)) {
            i15++;
        }
        int i16 = i15 - 1;
        if (l0(charSequence, i16) || l0(charSequence2, i16)) {
            i15--;
        }
        return charSequence.subSequence(0, i15).toString();
    }

    public static /* synthetic */ boolean Y0(CharSequence charSequence, char c15, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return W0(charSequence, c15, z15);
    }

    public static /* synthetic */ String Z(CharSequence charSequence, CharSequence charSequence2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return Y(charSequence, charSequence2, z15);
    }

    public static /* synthetic */ boolean Z0(CharSequence charSequence, CharSequence charSequence2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return X0(charSequence, charSequence2, z15);
    }

    public static final boolean a0(CharSequence charSequence, char c15, boolean z15) {
        return q0(charSequence, c15, 0, z15, 2, null) >= 0;
    }

    public static CharSequence a1(CharSequence charSequence, lr.i iVar) {
        return charSequence.subSequence(iVar.t().intValue(), iVar.s().intValue() + 1);
    }

    public static boolean b0(CharSequence charSequence, CharSequence charSequence2, boolean z15) {
        if (charSequence2 instanceof String) {
            return r0(charSequence, (String) charSequence2, 0, z15, 2, null) >= 0;
        }
        return p0(charSequence, charSequence2, 0, charSequence.length(), z15, false, 16, null) >= 0;
    }

    public static final String b1(CharSequence charSequence, lr.i iVar) {
        return charSequence.subSequence(iVar.t().intValue(), iVar.s().intValue() + 1).toString();
    }

    public static /* synthetic */ boolean c0(CharSequence charSequence, char c15, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return a0(charSequence, c15, z15);
    }

    public static String c1(String str, lr.i iVar) {
        return str.substring(iVar.t().intValue(), iVar.s().intValue() + 1);
    }

    public static /* synthetic */ boolean d0(CharSequence charSequence, CharSequence charSequence2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return b0(charSequence, charSequence2, z15);
    }

    public static String d1(String str, char c15, String str2) {
        int iQ0 = q0(str, c15, 0, false, 6, null);
        return iQ0 == -1 ? str2 : str.substring(iQ0 + 1, str.length());
    }

    public static final boolean e0(CharSequence charSequence, char c15, boolean z15) {
        return charSequence.length() > 0 && c.g(charSequence.charAt(k0(charSequence)), c15, z15);
    }

    public static String e1(String str, String str2, String str3) {
        int iR0 = r0(str, str2, 0, false, 6, null);
        return iR0 == -1 ? str3 : str.substring(iR0 + str2.length(), str.length());
    }

    public static final boolean f0(CharSequence charSequence, CharSequence charSequence2, boolean z15) {
        return (!z15 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? d0.F((String) charSequence, (String) charSequence2, false, 2, null) : L0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z15);
    }

    public static /* synthetic */ String f1(String str, char c15, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = str;
        }
        return d1(str, c15, str2);
    }

    public static /* synthetic */ boolean g0(CharSequence charSequence, char c15, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return e0(charSequence, c15, z15);
    }

    public static /* synthetic */ String g1(String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str3 = str;
        }
        return e1(str, str2, str3);
    }

    public static /* synthetic */ boolean h0(CharSequence charSequence, CharSequence charSequence2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return f0(charSequence, charSequence2, z15);
    }

    public static String h1(String str, char c15, String str2) {
        int iW0 = w0(str, c15, 0, false, 6, null);
        return iW0 == -1 ? str2 : str.substring(iW0 + 1, str.length());
    }

    private static final oq.r<Integer, String> i0(CharSequence charSequence, Collection<String> collection, int i15, boolean z15, boolean z16) {
        CharSequence charSequence2;
        Object next;
        boolean z17;
        Object next2;
        if (!z15 && collection.size() == 1) {
            String str = (String) pq.v.O0(collection);
            int iR0 = !z16 ? r0(charSequence, str, i15, false, 4, null) : x0(charSequence, str, i15, false, 4, null);
            if (iR0 < 0) {
                return null;
            }
            return oq.y.a(Integer.valueOf(iR0), str);
        }
        CharSequence charSequence3 = charSequence;
        lr.g iVar = !z16 ? new lr.i(lr.m.e(i15, 0), charSequence3.length()) : lr.m.r(lr.m.j(i15, k0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int i16 = iVar.getFirst();
            int iK = iVar.getLast();
            int iL = iVar.getStep();
            if ((iL > 0 && i16 <= iK) || (iL < 0 && iK <= i16)) {
                int i17 = i16;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = z15;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z17 = z15;
                        if (d0.J(str2, 0, (String) charSequence3, i17, str2.length(), z17)) {
                            break;
                        }
                        z15 = z17;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return oq.y.a(Integer.valueOf(i17), str3);
                    }
                    if (i17 != iK) {
                        i17 += iL;
                        z15 = z17;
                    }
                }
            }
        } else {
            boolean z18 = z15;
            int i18 = iVar.getFirst();
            int iK2 = iVar.getLast();
            int iL2 = iVar.getStep();
            if ((iL2 > 0 && i18 <= iK2) || (iL2 < 0 && iK2 <= i18)) {
                int i19 = i18;
                while (true) {
                    Iterator<T> it4 = collection.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it4.next();
                        String str4 = (String) next;
                        boolean z19 = z18;
                        charSequence2 = charSequence3;
                        z18 = z19;
                        if (L0(str4, 0, charSequence2, i19, str4.length(), z19)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return oq.y.a(Integer.valueOf(i19), str5);
                    }
                    if (i19 != iK2) {
                        i19 += iL2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static String i1(String str, String str2, String str3) {
        int iX0 = x0(str, str2, 0, false, 6, null);
        return iX0 == -1 ? str3 : str.substring(iX0 + str2.length(), str.length());
    }

    public static lr.i j0(CharSequence charSequence) {
        return new lr.i(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String j1(String str, char c15, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = str;
        }
        return h1(str, c15, str2);
    }

    public static int k0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String k1(String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str3 = str;
        }
        return i1(str, str2, str3);
    }

    public static final boolean l0(CharSequence charSequence, int i15) {
        return i15 >= 0 && i15 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i15)) && Character.isLowSurrogate(charSequence.charAt(i15 + 1));
    }

    public static final String l1(String str, char c15, String str2) {
        int iQ0 = q0(str, c15, 0, false, 6, null);
        return iQ0 == -1 ? str2 : str.substring(0, iQ0);
    }

    public static final int m0(CharSequence charSequence, char c15, int i15, boolean z15) {
        return (z15 || !(charSequence instanceof String)) ? s0(charSequence, new char[]{c15}, i15, z15) : ((String) charSequence).indexOf(c15, i15);
    }

    public static final String m1(String str, String str2, String str3) {
        int iR0 = r0(str, str2, 0, false, 6, null);
        return iR0 == -1 ? str3 : str.substring(0, iR0);
    }

    public static final int n0(CharSequence charSequence, String str, int i15, boolean z15) {
        return (z15 || !(charSequence instanceof String)) ? p0(charSequence, str, i15, charSequence.length(), z15, false, 16, null) : ((String) charSequence).indexOf(str, i15);
    }

    public static /* synthetic */ String n1(String str, char c15, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = str;
        }
        return l1(str, c15, str2);
    }

    private static final int o0(CharSequence charSequence, CharSequence charSequence2, int i15, int i16, boolean z15, boolean z16) {
        lr.g iVar = !z16 ? new lr.i(lr.m.e(i15, 0), lr.m.j(i16, charSequence.length())) : lr.m.r(lr.m.j(i15, k0(charSequence)), lr.m.e(i16, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i17 = iVar.getFirst();
            int iK = iVar.getLast();
            int iL = iVar.getStep();
            if ((iL <= 0 || i17 > iK) && (iL >= 0 || iK > i17)) {
                return -1;
            }
            int i18 = i17;
            while (true) {
                String str = (String) charSequence2;
                boolean z17 = z15;
                if (d0.J(str, 0, (String) charSequence, i18, str.length(), z17)) {
                    return i18;
                }
                if (i18 == iK) {
                    return -1;
                }
                i18 += iL;
                z15 = z17;
            }
        } else {
            boolean z18 = z15;
            int i19 = iVar.getFirst();
            int iK2 = iVar.getLast();
            int iL2 = iVar.getStep();
            if ((iL2 <= 0 || i19 > iK2) && (iL2 >= 0 || iK2 > i19)) {
                return -1;
            }
            int i25 = i19;
            while (true) {
                boolean z19 = z18;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z18 = z19;
                if (L0(charSequence4, 0, charSequence3, i25, charSequence2.length(), z19)) {
                    return i25;
                }
                if (i25 == iK2) {
                    return -1;
                }
                i25 += iL2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static /* synthetic */ String o1(String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str3 = str;
        }
        return m1(str, str2, str3);
    }

    static /* synthetic */ int p0(CharSequence charSequence, CharSequence charSequence2, int i15, int i16, boolean z15, boolean z16, int i17, Object obj) {
        if ((i17 & 16) != 0) {
            z16 = false;
        }
        return o0(charSequence, charSequence2, i15, i16, z15, z16);
    }

    public static String p1(String str, char c15, String str2) {
        int iW0 = w0(str, c15, 0, false, 6, null);
        return iW0 == -1 ? str2 : str.substring(0, iW0);
    }

    public static /* synthetic */ int q0(CharSequence charSequence, char c15, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        if ((i16 & 4) != 0) {
            z15 = false;
        }
        return m0(charSequence, c15, i15, z15);
    }

    public static String q1(String str, String str2, String str3) {
        int iX0 = x0(str, str2, 0, false, 6, null);
        return iX0 == -1 ? str3 : str.substring(0, iX0);
    }

    public static /* synthetic */ int r0(CharSequence charSequence, String str, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        if ((i16 & 4) != 0) {
            z15 = false;
        }
        return n0(charSequence, str, i15, z15);
    }

    public static /* synthetic */ String r1(String str, char c15, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = str;
        }
        return p1(str, c15, str2);
    }

    public static final int s0(CharSequence charSequence, char[] cArr, int i15, boolean z15) {
        if (!z15 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(pq.n.W0(cArr), i15);
        }
        int iE = lr.m.e(i15, 0);
        int iK0 = k0(charSequence);
        if (iE > iK0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iE);
            for (char c15 : cArr) {
                if (c.g(c15, cCharAt, z15)) {
                    return iE;
                }
            }
            if (iE == iK0) {
                return -1;
            }
            iE++;
        }
    }

    public static /* synthetic */ String s1(String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str3 = str;
        }
        return q1(str, str2, str3);
    }

    public static boolean t0(CharSequence charSequence) {
        for (int i15 = 0; i15 < charSequence.length(); i15++) {
            if (!b.c(charSequence.charAt(i15))) {
                return false;
            }
        }
        return true;
    }

    public static Boolean t1(String str) {
        if (fr.t.c(str, "true")) {
            return Boolean.TRUE;
        }
        if (fr.t.c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int u0(CharSequence charSequence, char c15, int i15, boolean z15) {
        return (z15 || !(charSequence instanceof String)) ? y0(charSequence, new char[]{c15}, i15, z15) : ((String) charSequence).lastIndexOf(c15, i15);
    }

    public static CharSequence u1(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i15 = 0;
        boolean z15 = false;
        while (i15 <= length) {
            boolean zC = b.c(charSequence.charAt(!z15 ? i15 : length));
            if (z15) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i15++;
            } else {
                z15 = true;
            }
        }
        return charSequence.subSequence(i15, length + 1);
    }

    public static final int v0(CharSequence charSequence, String str, int i15, boolean z15) {
        return (z15 || !(charSequence instanceof String)) ? o0(charSequence, str, i15, 0, z15, true) : ((String) charSequence).lastIndexOf(str, i15);
    }

    public static String v1(String str, char... cArr) {
        int length = str.length() - 1;
        int i15 = 0;
        boolean z15 = false;
        while (i15 <= length) {
            boolean zC0 = pq.n.c0(cArr, str.charAt(!z15 ? i15 : length));
            if (z15) {
                if (!zC0) {
                    break;
                }
                length--;
            } else if (zC0) {
                i15++;
            } else {
                z15 = true;
            }
        }
        return str.subSequence(i15, length + 1).toString();
    }

    public static /* synthetic */ int w0(CharSequence charSequence, char c15, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = k0(charSequence);
        }
        if ((i16 & 4) != 0) {
            z15 = false;
        }
        return u0(charSequence, c15, i15, z15);
    }

    public static String w1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i15 = length - 1;
            if (!pq.n.c0(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i15 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i15;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ int x0(CharSequence charSequence, String str, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = k0(charSequence);
        }
        if ((i16 & 4) != 0) {
            z15 = false;
        }
        return v0(charSequence, str, i15, z15);
    }

    public static String x1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            if (!pq.n.c0(cArr, str.charAt(i15))) {
                charSequenceSubSequence = str.subSequence(i15, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static final int y0(CharSequence charSequence, char[] cArr, int i15, boolean z15) {
        if (!z15 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(pq.n.W0(cArr), i15);
        }
        for (int iJ = lr.m.j(i15, k0(charSequence)); -1 < iJ; iJ--) {
            char cCharAt = charSequence.charAt(iJ);
            for (char c15 : cArr) {
                if (c.g(c15, cCharAt, z15)) {
                    return iJ;
                }
            }
        }
        return -1;
    }

    public static final eu.h<String> z0(CharSequence charSequence) {
        return new a(charSequence);
    }
}
