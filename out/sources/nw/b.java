package nw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\tR\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lnw/b;", "Lnw/f;", "", "Lnw/a;", "parsers", "<init>", "([Lnw/a;)V", "Lnw/i;", "tokens", "Lnw/i$a;", "iterator", "Ljava/util/ArrayList;", "Lnw/a$b;", "Lkotlin/collections/ArrayList;", "c", "(Lnw/i;Lnw/i$a;)Ljava/util/ArrayList;", "delimiters", "Loq/i0;", "b", "(Ljava/util/ArrayList;)V", "opener", "closer", "", "d", "(Lnw/a$b;Lnw/a$b;)Z", "", "Llr/i;", "rangesToGlue", "Lnw/f$b;", "a", "(Lnw/i;Ljava/util/List;)Lnw/f$b;", "[Lnw/a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a[] parsers;

    public b(a... aVarArr) {
        this.parsers = aVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    private final void b(ArrayList<a.Info> delimiters) {
        int i15;
        int iIntValue;
        int size = delimiters.size();
        Integer[] numArr = new Integer[size];
        for (int i16 = 0; i16 < size; i16++) {
            numArr[i16] = 0;
        }
        HashMap map = new HashMap();
        int i17 = 0;
        int i18 = 0;
        int i19 = -2;
        for (a.Info info : delimiters) {
            int i25 = i18 + 1;
            int i26 = (delimiters.get(i17).getMarker() == info.getMarker() && i19 == info.getPosition() + (-1)) ? i17 : i18;
            int position = info.getPosition();
            if (info.getCanClose()) {
                if (!map.containsKey(Character.valueOf(info.getMarker()))) {
                    map.put(Character.valueOf(info.getMarker()), new Integer[]{-1, -1, -1, -1, -1, -1});
                }
                int i27 = 3;
                int iIntValue2 = ((Integer[]) map.get(Character.valueOf(info.getMarker())))[(info.getCanOpen() ? 3 : 0) + (info.getLength() % 3)].intValue();
                int iIntValue3 = (i26 - numArr[i26].intValue()) - 1;
                int iIntValue4 = iIntValue3;
                while (true) {
                    if (iIntValue4 <= iIntValue2) {
                        i15 = i27;
                        break;
                    }
                    a.Info info2 = delimiters.get(iIntValue4);
                    i15 = i27;
                    if (info2.getMarker() != info.getMarker()) {
                        iIntValue4 -= numArr[iIntValue4].intValue() + 1;
                    } else {
                        if (info2.getCanOpen() && info2.getCloserIndex() < 0) {
                            if (!d(info2, info)) {
                                if (iIntValue4 > 0) {
                                    int i28 = iIntValue4 - 1;
                                    if (delimiters.get(i28).getCanOpen()) {
                                        iIntValue = 0;
                                    } else {
                                        iIntValue = numArr[i28].intValue() + 1;
                                    }
                                } else {
                                    iIntValue = 0;
                                }
                                numArr[iIntValue4] = Integer.valueOf(iIntValue);
                                numArr[i18] = Integer.valueOf((i18 - iIntValue4) + iIntValue);
                                info.i(false);
                                info2.j(i18);
                                info2.h(false);
                                iIntValue3 = -1;
                                position = -2;
                                break;
                            }
                        }
                        iIntValue4 -= numArr[iIntValue4].intValue() + 1;
                    }
                    i27 = i15;
                }
                if (iIntValue3 != -1) {
                    ((Integer[]) map.get(Character.valueOf(info.getMarker())))[(info.getCanOpen() ? i15 : 0) + (info.getLength() % 3)] = Integer.valueOf(iIntValue3);
                }
            }
            i18 = i25;
            i17 = i26;
            i19 = position;
        }
    }

    private final ArrayList<a.Info> c(i tokens, i.a iterator) {
        ArrayList<a.Info> arrayList = new ArrayList<>();
        loop0: while (iterator.h() != null) {
            int i15 = 0;
            for (a aVar : this.parsers) {
                int iG = aVar.g(tokens, iterator, arrayList);
                i15 += iG;
                for (int i16 = 0; i16 < iG; i16++) {
                    if (iterator.h() == null) {
                        break loop0;
                    }
                    iterator = iterator.a();
                }
            }
            if (i15 == 0) {
                iterator = iterator.a();
            }
        }
        return arrayList;
    }

    private final boolean d(a.Info opener, a.Info closer) {
        if ((opener.getCanClose() || closer.getCanOpen()) && (opener.getLength() + closer.getLength()) % 3 == 0) {
            return (opener.getLength() % 3 == 0 && closer.getLength() % 3 == 0) ? false : true;
        }
        return false;
    }

    @Override // nw.f
    public f.b a(i tokens, List<lr.i> rangesToGlue) {
        f.c cVar = new f.c();
        i.b bVar = new i.b(tokens, rangesToGlue);
        ArrayList<a.Info> arrayListC = c(tokens, bVar);
        b(arrayListC);
        for (a aVar : this.parsers) {
            aVar.f(tokens, bVar, arrayListC, cVar);
        }
        return cVar;
    }
}
