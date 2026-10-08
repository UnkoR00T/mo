package p086nu;

import mu.g;
import p071kotlin.Metadata;
import tq.i;
import tq.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnu/r;", "T", "Lmu/g;", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "b", "(Ltq/i;ILlu/a;)Lmu/g;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface r<T> extends g<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ g a(r rVar, i iVar, int i15, lu.a aVar, int i16, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i16 & 1) != 0) {
                iVar = j.f191408a;
            }
            if ((i16 & 2) != 0) {
                i15 = -3;
            }
            if ((i16 & 4) != 0) {
                aVar = lu.a.SUSPEND;
            }
            return rVar.b(iVar, i15, aVar);
        }
    }

    g<T> b(i context, int capacity, lu.a onBufferOverflow);
}
