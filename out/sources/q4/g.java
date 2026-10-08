package q4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"", "Lq4/e$d;", "Lq4/h3;", "spanStyles", "Lq4/e0;", "paragraphStyles", "Lq4/e$a;", "e", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lq4/e;", "defaultParagraphStyle", "k", "(Lq4/e;Lq4/e0;)Ljava/util/List;", "", "start", "end", "Lkotlin/Function1;", "", "predicate", "h", "(Lq4/e;IILer/l;)Ljava/util/List;", "l", "(Lq4/e;II)Lq4/e;", "T", "ranges", "g", "(Ljava/util/List;II)Ljava/util/List;", "lStart", "lEnd", "rStart", "rEnd", "j", "(IIII)Z", "f", "()Lq4/e;", "a", "Lq4/e;", "EmptyAnnotatedString", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f164484a = new e("", null, 2, 0 == true ? 1 : 0);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Integer.valueOf(((e.Range) t15).h()), Integer.valueOf(((e.Range) t16).h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<e.Range<? extends e.a>> e(List<e.Range<SpanStyle>> list, List<e.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(list.get(i15));
        }
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            arrayList.add(list2.get(i16));
        }
        return arrayList;
    }

    public static final e f() {
        return f164484a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<e.Range<T>> g(List<? extends e.Range<? extends T>> list, int i15, int i16) {
        if (!(i15 <= i16)) {
            w4.a.a("start (" + i15 + ") should be less than or equal to end (" + i16 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            e.Range<? extends T> range = list.get(i17);
            if (j(i15, i16, range.h(), range.f())) {
                arrayList.add(new e.Range(range.g(), Math.max(i15, range.h()) - i15, Math.min(i16, range.f()) - i15, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<e.Range<? extends e.a>> h(e eVar, int i15, int i16, er.l<? super e.a, Boolean> lVar) {
        List<e.Range<? extends e.a>> listC;
        if (i15 == i16 || (listC = eVar.c()) == null) {
            return null;
        }
        if (i15 != 0 || i16 < eVar.getText().length()) {
            ArrayList arrayList = new ArrayList(listC.size());
            int size = listC.size();
            for (int i17 = 0; i17 < size; i17++) {
                e.Range<? extends e.a> range = listC.get(i17);
                if ((lVar != null ? lVar.b(range.g()).booleanValue() : true) && j(i15, i16, range.h(), range.f())) {
                    arrayList.add(new e.Range(range.g(), lr.m.n(range.h(), i15, i16) - i15, lr.m.n(range.f(), i15, i16) - i15, range.getTag()));
                }
            }
            return arrayList;
        }
        if (lVar == null) {
            return listC;
        }
        ArrayList arrayList2 = new ArrayList(listC.size());
        int size2 = listC.size();
        for (int i18 = 0; i18 < size2; i18++) {
            e.Range<? extends e.a> range2 = listC.get(i18);
            if (lVar.b(range2.g()).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    static /* synthetic */ List i(e eVar, int i15, int i16, er.l lVar, int i17, Object obj) {
        if ((i17 & 4) != 0) {
            lVar = null;
        }
        return h(eVar, i15, i16, lVar);
    }

    public static final boolean j(int i15, int i16, int i17, int i18) {
        return ((i15 < i18) & (i17 < i16)) | (((i15 == i16) | (i17 == i18)) & (i15 == i17));
    }

    public static final List<e.Range<ParagraphStyle>> k(e eVar, ParagraphStyle e0Var) {
        List listN;
        List<e.Range<ParagraphStyle>> listF = eVar.f();
        if (listF == null || (listN = pq.v.U0(listF, new a())) == null) {
            listN = pq.v.n();
        }
        ArrayList arrayList = new ArrayList();
        pq.m mVar = new pq.m();
        int size = listN.size();
        int iF = 0;
        for (int i15 = 0; i15 < size; i15++) {
            e.Range range = (e.Range) listN.get(i15);
            e.Range rangeE = e.Range.e(range, e0Var.l((ParagraphStyle) range.g()), 0, 0, null, 14, null);
            while (iF < rangeE.h() && !mVar.isEmpty()) {
                e.Range range2 = (e.Range) mVar.last();
                if (rangeE.h() < range2.f()) {
                    arrayList.add(new e.Range(range2.g(), iF, rangeE.h()));
                    iF = rangeE.h();
                } else {
                    arrayList.add(new e.Range(range2.g(), iF, range2.f()));
                    iF = range2.f();
                    while (!mVar.isEmpty() && iF == ((e.Range) mVar.last()).f()) {
                        mVar.removeLast();
                    }
                }
            }
            if (iF < rangeE.h()) {
                arrayList.add(new e.Range(e0Var, iF, rangeE.h()));
                iF = rangeE.h();
            }
            e.Range range3 = (e.Range) mVar.s();
            if (range3 == null) {
                mVar.add(new e.Range(rangeE.g(), rangeE.h(), rangeE.f()));
            } else if (range3.h() == rangeE.h() && range3.f() == rangeE.f()) {
                mVar.removeLast();
                mVar.add(new e.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) rangeE.g()), rangeE.h(), rangeE.f()));
            } else if (range3.h() == range3.f()) {
                arrayList.add(new e.Range(range3.g(), range3.h(), range3.f()));
                mVar.removeLast();
                mVar.add(new e.Range(rangeE.g(), rangeE.h(), rangeE.f()));
            } else {
                if (range3.f() < rangeE.f()) {
                    throw new IllegalArgumentException();
                }
                mVar.add(new e.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) rangeE.g()), rangeE.h(), rangeE.f()));
            }
        }
        while (iF <= eVar.getText().length() && !mVar.isEmpty()) {
            e.Range range4 = (e.Range) mVar.last();
            arrayList.add(new e.Range(range4.g(), iF, range4.f()));
            iF = range4.f();
            while (!mVar.isEmpty() && iF == ((e.Range) mVar.last()).f()) {
                mVar.removeLast();
            }
        }
        if (iF < eVar.getText().length()) {
            arrayList.add(new e.Range(e0Var, iF, eVar.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new e.Range(e0Var, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e l(e eVar, int i15, int i16) {
        String strSubstring = i15 != i16 ? eVar.getText().substring(i15, i16) : "";
        List<e.Range<? extends e.a>> listH = h(eVar, i15, i16, new er.l() { // from class: q4.f
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(g.m((e.a) obj));
            }
        });
        if (listH == null) {
            listH = pq.v.n();
        }
        return new e(strSubstring, listH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(e.a aVar) {
        return !(aVar instanceof ParagraphStyle);
    }
}
