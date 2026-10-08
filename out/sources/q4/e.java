package q4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 /2\u00020\u0001:\u0004G\u0013?AB)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b+\u0010)J+\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0007¢\u0006\u0004\b-\u0010)J)\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u000102H\u0096\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b9\u0010:J1\u0010=\u001a\u00020\u00002\"\u0010<\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030;¢\u0006\u0004\b=\u0010>J7\u0010?\u001a\u00020\u00002(\u0010<\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020;¢\u0006\u0004\b?\u0010>R*\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u00108R(\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010@\u001a\u0004\bE\u0010BR(\u0010I\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bJ\u0010BR\u0014\u0010K\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u00106¨\u0006L"}, d2 = {"Lq4/e;", "", "", "Lq4/e$d;", "Lq4/e$a;", "annotations", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Lq4/h3;", "spanStyles", "Lq4/e0;", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "index", "", "b", "(I)C", "startIndex", "endIndex", "s", "(II)Lq4/e;", "Lq4/z3;", "range", "t", "(J)Lq4/e;", "other", "r", "(Lq4/e;)Lq4/e;", "tag", "start", "end", "j", "(Ljava/lang/String;II)Ljava/util/List;", "", "p", "(Ljava/lang/String;II)Z", "i", "(II)Ljava/util/List;", "Lq4/d4;", "l", "Lq4/e4;", "m", "Lq4/m;", "e", "o", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "n", "(Lq4/e;)Z", "Lkotlin/Function1;", "transform", "q", "(Ler/l;)Lq4/e;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "k", "h", "spanStylesOrNull", "d", "f", "paragraphStylesOrNull", "g", "length", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements CharSequence {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b3.x<e, ?> f164451f = v2.v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Range<? extends a>> annotations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Range<SpanStyle>> spanStylesOrNull;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0007\u0002\u0003\u0004\u0005\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lq4/e$a;", "", "Lq4/i;", "Lq4/m;", "Lq4/e0;", "Lq4/h3;", "Lq4/k3;", "Lq4/d4;", "Lq4/e4;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
    }

    /* JADX INFO: renamed from: q4.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C4087e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Integer.valueOf(((Range) t15).h()), Integer.valueOf(((Range) t16).h()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends Range<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i15 = 0; i15 < size; i15++) {
                Range<SpanStyle> range = (Range) list.get(i15);
                if (range.g() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(range);
                } else if (range.g() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listU0 = arrayList2 != null ? pq.v.U0(arrayList2, new C4087e()) : null;
        List list2 = listU0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        r0.i0 i0VarE = r0.p.e(((Range) pq.v.l0(listU0)).f());
        int size2 = listU0.size();
        for (int i16 = 1; i16 < size2; i16++) {
            Range range2 = (Range) listU0.get(i16);
            while (i0VarE._size != 0) {
                int i17 = i0VarE.i();
                if (range2.h() < i17) {
                    if (!(range2.f() <= i17)) {
                        w4.a.a("Paragraph overlap not allowed, end " + range2.f() + " should be less than or equal to " + i17);
                        break;
                    }
                    break;
                }
                i0VarE.p(i0VarE._size - 1);
            }
            i0VarE.k(range2.f());
        }
    }

    public final e a(er.l<? super Range<? extends a>, ? extends List<? extends Range<? extends a>>> transform) {
        b bVar = new b(this);
        bVar.i(transform);
        return bVar.p();
    }

    public char b(int index) {
        return this.text.charAt(index);
    }

    public final List<Range<? extends a>> c() {
        return this.annotations;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i15) {
        return b(i15);
    }

    public int d() {
        return this.text.length();
    }

    public final List<Range<m>> e(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Range<? extends a> range = list.get(i15);
            Range<? extends a> range2 = range;
            if ((range2.g() instanceof m) && g.j(start, end, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return fr.t.c(this.text, eVar.text) && fr.t.c(this.annotations, eVar.annotations);
    }

    public final List<Range<ParagraphStyle>> f() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> g() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? pq.v.n() : list;
    }

    public final List<Range<SpanStyle>> h() {
        return this.spanStylesOrNull;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<? extends a>> list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final List<Range<String>> i(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Range<? extends a> range = list.get(i15);
            if ((range.g() instanceof k3) && g.j(start, end, range.h(), range.f())) {
                arrayList.add(l3.a(range));
            }
        }
        return arrayList;
    }

    public final List<Range<String>> j(String tag, int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Range<? extends a> range = list.get(i15);
            if ((range.g() instanceof k3) && fr.t.c(tag, range.getTag()) && g.j(start, end, range.h(), range.f())) {
                arrayList.add(l3.a(range));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<Range<d4>> l(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Range<? extends a> range = list.get(i15);
            Range<? extends a> range2 = range;
            if ((range2.g() instanceof d4) && g.j(start, end, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return d();
    }

    @oq.a
    public final List<Range<UrlAnnotation>> m(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Range<? extends a> range = list.get(i15);
            Range<? extends a> range2 = range;
            if ((range2.g() instanceof UrlAnnotation) && g.j(start, end, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final boolean n(e other) {
        return fr.t.c(this.annotations, other.annotations);
    }

    public final boolean o(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Range<? extends a> range = list.get(i15);
                if ((range.g() instanceof m) && g.j(start, end, range.h(), range.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean p(String tag, int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Range<? extends a> range = list.get(i15);
                if ((range.g() instanceof k3) && fr.t.c(tag, range.getTag()) && g.j(start, end, range.h(), range.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final e q(er.l<? super Range<? extends a>, ? extends Range<? extends a>> transform) {
        b bVar = new b(this);
        bVar.j(transform);
        return bVar.p();
    }

    public final e r(e other) {
        b bVar = new b(this);
        bVar.g(other);
        return bVar.p();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e subSequence(int startIndex, int endIndex) {
        if (!(startIndex <= endIndex)) {
            w4.a.a("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        return new e((List<? extends Range<? extends a>>) g.g(this.annotations, startIndex, endIndex), this.text.substring(startIndex, endIndex));
    }

    public final e t(long range) {
        return subSequence(z3.l(range), z3.k(range));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u001e\"B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u0010\u0006J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J3\u00107\u001a\u00020\u000b2\"\u00106\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020504\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002050403H\u0000¢\u0006\u0004\b7\u00108J9\u0010:\u001a\u00020\u000b2(\u00106\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020504\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u000205040903H\u0000¢\u0006\u0004\b:\u00108R\u0018\u0010\b\u001a\u00060;j\u0002`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R\"\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020@0?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010AR\"\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002050?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010AR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010E¨\u0006G"}, d2 = {"Lq4/e$b;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "Lq4/e;", "text", "(Lq4/e;)V", "", "Loq/i0;", "f", "(Ljava/lang/String;)V", "", "d", "(Ljava/lang/CharSequence;)Lq4/e$b;", "start", "end", "e", "(Ljava/lang/CharSequence;II)Lq4/e$b;", "", "char", "c", "(C)Lq4/e$b;", "g", "h", "(Lq4/e;II)V", "Lq4/h3;", "style", "b", "(Lq4/h3;II)V", "Lq4/m$b;", "url", "a", "(Lq4/m$b;II)V", "o", "(Lq4/h3;)I", "Lq4/e0;", "n", "(Lq4/e0;)I", "Lq4/m;", "link", "m", "(Lq4/m;)I", "k", "()V", "index", "l", "p", "()Lq4/e;", "Lkotlin/Function1;", "Lq4/e$d;", "Lq4/e$a;", "transform", "j", "(Ler/l;)V", "", "i", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Lq4/e$b$b;", "", "Ljava/util/List;", "styleStack", "annotations", "Lq4/e$b$a;", "Lq4/e$b$a;", "bulletScope", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Appendable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f164456e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StringBuilder text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends Object>> styleStack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends a>> annotations;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final a bulletScope;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR,\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lq4/e$b$a;", "", "Lq4/e$b;", "builder", "<init>", "(Lq4/e$b;)V", "a", "Lq4/e$b;", "getBuilder$ui_text", "()Lq4/e$b;", "", "Loq/r;", "Lc5/v;", "Lq4/i;", "b", "Ljava/util/List;", "getBulletListSettingStack$ui_text", "()Ljava/util/List;", "bulletListSettingStack", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final b builder;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final List<oq.r<c5.v, i>> bulletListSettingStack = new ArrayList();

            public a(b bVar) {
                this.builder = bVar;
            }
        }

        public b(int i15) {
            this.text = new StringBuilder(i15);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new a(this);
        }

        public final void a(m.b url, int start, int end) {
            this.annotations.add(new MutableRange<>(url, start, end, null, 8, null));
        }

        public final void b(SpanStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b append(char c15) {
            this.text.append(c15);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence text) {
            if (text instanceof e) {
                g((e) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence text, int start, int end) {
            if (text instanceof e) {
                h((e) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        public final void f(String text) {
            this.text.append(text);
        }

        public final void g(e text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<? extends a>> listC = text.c();
            if (listC != null) {
                int size = listC.size();
                for (int i15 = 0; i15 < size; i15++) {
                    Range<? extends a> range = listC.get(i15);
                    this.annotations.add(new MutableRange<>(range.g(), range.h() + length, range.f() + length, range.getTag()));
                }
            }
        }

        public final void h(e text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List listI = g.i(text, start, end, null, 4, null);
            if (listI != null) {
                int size = listI.size();
                for (int i15 = 0; i15 < size; i15++) {
                    Range range = (Range) listI.get(i15);
                    this.annotations.add(new MutableRange<>(range.g(), range.h() + length, range.f() + length, range.getTag()));
                }
            }
        }

        public final void i(er.l<? super Range<? extends a>, ? extends List<? extends Range<? extends a>>> transform) {
            List<MutableRange<? extends a>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                List<? extends Range<? extends a>> listB = transform.b(MutableRange.c(list.get(i15), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listB.size());
                int size2 = listB.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    arrayList2.add(MutableRange.INSTANCE.a(listB.get(i16)));
                }
                pq.v.D(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final void j(er.l<? super Range<? extends a>, ? extends Range<? extends a>> transform) {
            int size = this.annotations.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.annotations.set(i15, MutableRange.INSTANCE.a(transform.b(MutableRange.c(this.annotations.get(i15), 0, 1, null))));
            }
        }

        public final void k() {
            if (this.styleStack.isEmpty()) {
                w4.a.c("Nothing to pop.");
            }
            List<MutableRange<? extends Object>> list = this.styleStack;
            list.remove(list.size() - 1).a(this.text.length());
        }

        public final void l(int index) {
            if (!(index < this.styleStack.size())) {
                w4.a.c(index + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= index) {
                k();
            }
        }

        public final int m(m link) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(link, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int n(ParagraphStyle style) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int o(SpanStyle style) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final e p() {
            String string = this.text.toString();
            List<MutableRange<? extends a>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add(list.get(i15).b(this.text.length()));
            }
            return new e(string, arrayList);
        }

        /* JADX INFO: renamed from: q4.e$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u0017\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006$"}, d2 = {"Lq4/e$b$b;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Lq4/e$d;", "b", "(I)Lq4/e$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "c", "getEnd", "(I)V", "d", "Ljava/lang/String;", "getTag", "e", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final /* data */ class MutableRange<T> {

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final T item;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int start;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private int end;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String tag;

            /* JADX INFO: renamed from: q4.e$b$b$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq4/e$b$b$a;", "", "<init>", "()V", "T", "Lq4/e$d;", "range", "Lq4/e$b$b;", "a", "(Lq4/e$d;)Lq4/e$b$b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(fr.k kVar) {
                    this();
                }

                public final <T> MutableRange<T> a(Range<T> range) {
                    return new MutableRange<>(range.g(), range.h(), range.f(), range.getTag());
                }

                private Companion() {
                }
            }

            public MutableRange(T t15, int i15, int i16, String str) {
                this.item = t15;
                this.start = i15;
                this.end = i16;
                this.tag = str;
            }

            public static /* synthetic */ Range c(MutableRange mutableRange, int i15, int i16, Object obj) {
                if ((i16 & 1) != 0) {
                    i15 = PKIFailureInfo.systemUnavail;
                }
                return mutableRange.b(i15);
            }

            public final void a(int i15) {
                this.end = i15;
            }

            public final Range<T> b(int defaultEnd) {
                int i15 = this.end;
                if (i15 != Integer.MIN_VALUE) {
                    defaultEnd = i15;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    w4.a.c("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, defaultEnd, this.tag);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return fr.t.c(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && fr.t.c(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                T t15 = this.item;
                return ((((((t15 == null ? 0 : t15.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public /* synthetic */ MutableRange(Object obj, int i15, int i16, String str, int i17, fr.k kVar) {
                this(obj, i15, (i17 & 4) != 0 ? PKIFailureInfo.systemUnavail : i16, (i17 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ b(int i15, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? 16 : i15);
        }

        public b(e eVar) {
            this(0, 1, null);
            g(eVar);
        }
    }

    /* JADX INFO: renamed from: q4.e$d, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lq4/e$d;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "d", "(Ljava/lang/Object;IILjava/lang/String;)Lq4/e$d;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "g", "I", "h", "f", "Ljava/lang/String;", "i", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Range<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final T item;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        public Range(T t15, int i15, int i16, String str) {
            this.item = t15;
            this.start = i15;
            this.end = i16;
            this.tag = str;
            if (i15 <= i16) {
                return;
            }
            w4.a.a("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range e(Range range, Object obj, int i15, int i16, String str, int i17, Object obj2) {
            if ((i17 & 1) != 0) {
                obj = range.item;
            }
            if ((i17 & 2) != 0) {
                i15 = range.start;
            }
            if ((i17 & 4) != 0) {
                i16 = range.end;
            }
            if ((i17 & 8) != 0) {
                str = range.tag;
            }
            return range.d(obj, i15, i16, str);
        }

        public final T a() {
            return this.item;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final Range<T> d(T item, int start, int end, String tag) {
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return fr.t.c(this.item, range.item) && this.start == range.start && this.end == range.end && fr.t.c(this.tag, range.tag);
        }

        public final int f() {
            return this.end;
        }

        public final T g() {
            return this.item;
        }

        public final int h() {
            return this.start;
        }

        public int hashCode() {
            T t15 = this.item;
            return ((((((t15 == null ? 0 : t15.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t15, int i15, int i16) {
            this(t15, i15, i16, "");
        }
    }

    public /* synthetic */ e(String str, List list, List list2, int i15, fr.k kVar) {
        this(str, (i15 & 2) != 0 ? pq.v.n() : list, (i15 & 4) != 0 ? pq.v.n() : list2);
    }

    public e(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends a>>) g.e(list, list2), str);
    }

    public /* synthetic */ e(String str, List list, int i15, fr.k kVar) {
        this(str, (List<? extends Range<? extends a>>) ((i15 & 2) != 0 ? pq.v.n() : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(String str, List<? extends Range<? extends a>> list) {
        List<? extends Range<? extends a>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
