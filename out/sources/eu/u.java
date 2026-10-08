package eu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\r\u001a)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\r\u001a9\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001a\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\t¢\u0006\u0004\b\u0014\u0010\r\u001a=\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u001f\u0010\r\u001aC\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b!\u0010\"\u001aC\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u001d*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\t¢\u0006\u0004\b#\u0010\r\u001a\u001d\u0010$\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b$\u0010%\u001a.\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010&\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b'\u0010(\u001a4\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0086\u0002¢\u0006\u0004\b+\u0010,\u001a4\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b-\u0010.\u001a\u007f\u00109\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u00101*\u00060/j\u0002`0*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00102\u001a\u00028\u00012\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\b\b\u0002\u00106\u001a\u0002032\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u0002032\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000203\u0018\u00010\tH\u0007¢\u0006\u0004\b9\u0010:\u001ag\u0010<\u001a\u00020;\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\b\b\u0002\u00106\u001a\u0002032\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u0002032\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000203\u0018\u00010\t¢\u0006\u0004\b<\u0010=\u001a#\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b>\u0010?¨\u0006@"}, d2 = {"T", "Leu/h;", "B", "(Leu/h;)Ljava/lang/Object;", "G", "", "n", "w", "(Leu/h;I)Leu/h;", "Lkotlin/Function1;", "", "predicate", "x", "(Leu/h;Ler/l;)Leu/h;", "y", "", "z", "(Leu/h;)Leu/h;", "N", "", "C", "destination", "O", "(Leu/h;Ljava/util/Collection;)Ljava/util/Collection;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Leu/h;)Ljava/util/List;", "", "Q", "R", "transform", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lkotlin/Function2;", "I", "(Leu/h;Ler/p;)Leu/h;", "J", "v", "(Leu/h;)I", "element", "M", "(Leu/h;Ljava/lang/Object;)Leu/h;", "", "elements", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Leu/h;Ljava/lang/Iterable;)Leu/h;", "K", "(Leu/h;Leu/h;)Leu/h;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", ip.a.f96138c, "(Leu/h;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/Appendable;", "", "E", "(Leu/h;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "u", "(Leu/h;)Ljava/lang/Iterable;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class u extends s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"eu/u$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Iterable<T>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f53549a;

        public a(h hVar) {
            this.f53549a = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f53549a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class b<R> extends fr.q implements er.l<h<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f53550j = new b();

        b() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> b(h<? extends R> hVar) {
            return hVar.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(Object obj) {
        return obj == null;
    }

    public static <T> T B(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T, R> h<R> C(h<? extends T> hVar, er.l<? super T, ? extends h<? extends R>> lVar) {
        return new f(hVar, lVar, b.f53550j);
    }

    public static final <T, A extends Appendable> A D(h<? extends T> hVar, A a15, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super T, ? extends CharSequence> lVar) throws IOException {
        a15.append(charSequence2);
        int i16 = 0;
        for (T t15 : hVar) {
            i16++;
            if (i16 > 1) {
                a15.append(charSequence);
            }
            if (i15 >= 0 && i16 > i15) {
                break;
            }
            fu.r.a(a15, t15, lVar);
        }
        if (i15 >= 0 && i16 > i15) {
            a15.append(charSequence4);
        }
        a15.append(charSequence3);
        return a15;
    }

    public static final <T> String E(h<? extends T> hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) D(hVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i15, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String F(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l lVar, int i16, Object obj) {
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
        er.l lVar2 = lVar;
        return E(hVar, charSequence, charSequence2, charSequence3, i15, charSequence5, lVar2);
    }

    public static <T> T G(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T, R> h<R> H(h<? extends T> hVar, er.l<? super T, ? extends R> lVar) {
        return new x(hVar, lVar);
    }

    public static <T, R> h<R> I(h<? extends T> hVar, er.p<? super Integer, ? super T, ? extends R> pVar) {
        return new w(hVar, pVar);
    }

    public static <T, R> h<R> J(h<? extends T> hVar, er.l<? super T, ? extends R> lVar) {
        return z(new x(hVar, lVar));
    }

    public static <T> h<T> K(h<? extends T> hVar, h<? extends T> hVar2) {
        return r.j(r.s(hVar, hVar2));
    }

    public static <T> h<T> L(h<? extends T> hVar, Iterable<? extends T> iterable) {
        return r.j(r.s(hVar, pq.v.a0(iterable)));
    }

    public static <T> h<T> M(h<? extends T> hVar, T t15) {
        return r.j(r.s(hVar, r.r(t15)));
    }

    public static <T> h<T> N(h<? extends T> hVar, er.l<? super T, Boolean> lVar) {
        return new v(hVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C O(h<? extends T> hVar, C c15) {
        Iterator<? extends T> it = hVar.iterator();
        while (it.hasNext()) {
            c15.add(it.next());
        }
        return c15;
    }

    public static <T> List<T> P(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return pq.v.n();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return pq.v.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> Q(h<? extends T> hVar) {
        return (List) O(hVar, new ArrayList());
    }

    public static <T> Iterable<T> u(h<? extends T> hVar) {
        return new a(hVar);
    }

    public static <T> int v(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            it.next();
            i15++;
            if (i15 < 0) {
                pq.v.w();
            }
        }
        return i15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> h<T> w(h<? extends T> hVar, int i15) {
        if (i15 >= 0) {
            if (i15 == 0) {
                return hVar;
            }
            return hVar instanceof c ? ((c) hVar).a(i15) : new eu.b(hVar, i15);
        }
        throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
    }

    public static <T> h<T> x(h<? extends T> hVar, er.l<? super T, Boolean> lVar) {
        return new e(hVar, true, lVar);
    }

    public static <T> h<T> y(h<? extends T> hVar, er.l<? super T, Boolean> lVar) {
        return new e(hVar, false, lVar);
    }

    public static <T> h<T> z(h<? extends T> hVar) {
        return y(hVar, new er.l() { // from class: eu.t
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(u.A(obj));
            }
        });
    }
}
