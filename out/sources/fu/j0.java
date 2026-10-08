package fu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import pq.i1;
import pq.v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0019\u0010\u000e\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u000f\u001a-\u0010\u0016\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u00020\u00010\u0013*\u00020\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a5\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001c*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001aO\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010$*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020 2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000%H\u0007¢\u0006\u0004\b'\u0010(\u001a%\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010)0\u001c*\u00020\u0000H\u0007¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "", "C1", "(Ljava/lang/CharSequence;)C", "D1", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "", "index", "E1", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "F1", "G1", "", "n", "A1", "(Ljava/lang/String;I)Ljava/lang/String;", "B1", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37088o, "I1", "", "C", "destination", "J1", "(Ljava/lang/CharSequence;Ljava/util/Collection;)Ljava/util/Collection;", "", "K1", "(Ljava/lang/CharSequence;)Ljava/util/Set;", "size", "", "z1", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "step", "", "partialWindows", "L1", "(Ljava/lang/CharSequence;IIZ)Ljava/util/List;", "R", "Lkotlin/Function1;", "transform", "M1", "(Ljava/lang/CharSequence;IIZLer/l;)Ljava/util/List;", "Loq/r;", "O1", "(Ljava/lang/CharSequence;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class j0 extends h0 {
    public static String A1(String str, int i15) {
        if (i15 >= 0) {
            return str.substring(lr.m.j(i15, str.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i15 + " is less than zero.").toString());
    }

    public static String B1(String str, int i15) {
        if (i15 >= 0) {
            return H1(str, lr.m.e(str.length() - i15, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i15 + " is less than zero.").toString());
    }

    public static char C1(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character D1(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static Character E1(CharSequence charSequence, int i15) {
        if (i15 < 0 || i15 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i15));
    }

    public static char F1(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(g0.k0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character G1(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static String H1(String str, int i15) {
        if (i15 >= 0) {
            return str.substring(0, lr.m.j(i15, str.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i15 + " is less than zero.").toString());
    }

    public static String I1(String str, int i15) {
        if (i15 >= 0) {
            int length = str.length();
            return str.substring(length - lr.m.j(i15, length));
        }
        throw new IllegalArgumentException(("Requested character count " + i15 + " is less than zero.").toString());
    }

    public static final <C extends Collection<? super Character>> C J1(CharSequence charSequence, C c15) {
        for (int i15 = 0; i15 < charSequence.length(); i15++) {
            c15.add(Character.valueOf(charSequence.charAt(i15)));
        }
        return c15;
    }

    public static Set<Character> K1(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? (Set) J1(charSequence, new LinkedHashSet(v0.e(lr.m.j(charSequence.length(), 128)))) : e1.d(Character.valueOf(charSequence.charAt(0)));
        }
        return e1.e();
    }

    public static final List<String> L1(CharSequence charSequence, int i15, int i16, boolean z15) {
        return M1(charSequence, i15, i16, z15, new er.l() { // from class: fu.i0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.N1((CharSequence) obj);
            }
        });
    }

    public static final <R> List<R> M1(CharSequence charSequence, int i15, int i16, boolean z15, er.l<? super CharSequence, ? extends R> lVar) {
        i1.a(i15, i16);
        int length = charSequence.length();
        int i17 = 0;
        ArrayList arrayList = new ArrayList((length / i16) + (length % i16 == 0 ? 0 : 1));
        while (i17 >= 0 && i17 < length) {
            int i18 = i17 + i15;
            if (i18 < 0 || i18 > length) {
                if (!z15) {
                    break;
                }
                i18 = length;
            }
            arrayList.add(lVar.b(charSequence.subSequence(i17, i18)));
            i17 += i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N1(CharSequence charSequence) {
        return charSequence.toString();
    }

    public static List<oq.r<Character, Character>> O1(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 1) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList(length);
        int i15 = 0;
        while (i15 < length) {
            char cCharAt = charSequence.charAt(i15);
            i15++;
            arrayList.add(oq.y.a(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i15))));
        }
        return arrayList;
    }

    public static List<String> z1(CharSequence charSequence, int i15) {
        return L1(charSequence, i15, i15, true);
    }
}
