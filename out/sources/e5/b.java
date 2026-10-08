package e5;

import er.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\u001ag\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u000e*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u007f\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u0013*\u00060\u0011j\u0002`\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0017\u001a\u00028\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"T", "", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "d", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "", "b", "(Ljava/util/List;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "c", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/Appendable;", "element", "Loq/i0;", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;Ler/l;)V", "message", "", "f", "(Ljava/lang/String;)Ljava/lang/Void;", "g", "(Ljava/lang/String;)V", "ui-util"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void a(Appendable appendable, T t15, l<? super T, ? extends CharSequence> lVar) throws IOException {
        if (lVar != null) {
            appendable.append(lVar.b(t15));
            return;
        }
        if (t15 == 0 ? true : t15 instanceof CharSequence) {
            appendable.append((CharSequence) t15);
        } else if (t15 instanceof Character) {
            appendable.append(((Character) t15).charValue());
        } else {
            appendable.append(t15.toString());
        }
    }

    public static final <T> List<T> b(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            T t15 = list.get(i15);
            if (t15 != null) {
                arrayList.add(t15);
            }
        }
        return arrayList;
    }

    private static final <T, A extends Appendable> A c(List<? extends T> list, A a15, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) throws IOException {
        a15.append(charSequence2);
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            T t15 = list.get(i17);
            i16++;
            if (i16 > 1) {
                a15.append(charSequence);
            }
            if (i15 >= 0 && i16 > i15) {
                break;
            }
            a(a15, t15, lVar);
        }
        if (i15 >= 0 && i16 > i15) {
            a15.append(charSequence4);
        }
        a15.append(charSequence3);
        return a15;
    }

    public static final <T> String d(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) c(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i15, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String e(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, l lVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i16 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i16 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i16 & 8) != 0) {
            i15 = -1;
        }
        if ((i16 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i16 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return d(list, charSequence, charSequence2, charSequence3, i15, charSequence5, lVar2);
    }

    public static final Void f(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void g(String str) {
        throw new UnsupportedOperationException(str);
    }
}
