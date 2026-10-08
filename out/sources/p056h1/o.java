package p056h1;

import n2.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ln2/c;", "Lh1/n$a;", "", "itemIndex", "b", "(Ln2/c;I)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(c<n.a<T>> cVar, int i15) {
        int size = cVar.getSize() - 1;
        int i16 = 0;
        while (i16 < size) {
            int i17 = ((size - i16) / 2) + i16;
            int startIndex = cVar.content[i17].getStartIndex();
            if (startIndex != i15) {
                if (startIndex < i15) {
                    i16 = i17 + 1;
                    if (i15 < cVar.content[i16].getStartIndex()) {
                    }
                } else {
                    size = i17 - 1;
                }
            }
            return i17;
        }
        return i16;
    }
}
