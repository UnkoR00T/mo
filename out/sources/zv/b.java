package zv;

import fr.k;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzv/b;", "", "", "text", "Liw/a;", "cancellationToken", "<init>", "(Ljava/lang/CharSequence;Liw/a;)V", "(Ljava/lang/CharSequence;)V", "Lyv/a;", "type", "", "startOffset", "endOffset", "", "Lzv/a;", "b", "(Lyv/a;II)Ljava/util/List;", "children", "Lzv/f;", "a", "(Lyv/a;Ljava/util/List;)Lzv/f;", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "Liw/a;", "getCancellationToken", "()Liw/a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iw.a cancellationToken;

    /* JADX INFO: renamed from: zv.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzv/b$a;", "", "<init>", "()V", "", "s", "", "from", "to", "", "c", "a", "(Ljava/lang/CharSequence;IIC)I", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a(CharSequence s15, int from, int to4, char c15) {
            int i15 = to4 - 1;
            if (from > i15) {
                return -1;
            }
            while (s15.charAt(from) != c15) {
                if (from == i15) {
                    return -1;
                }
                from++;
            }
            return from;
        }

        private Companion() {
        }
    }

    public b(CharSequence charSequence, iw.a aVar) {
        this.text = charSequence;
        this.cancellationToken = aVar;
    }

    public f a(yv.a type, List<? extends a> children) {
        this.cancellationToken.a();
        if (t.c(type, yv.c.UNORDERED_LIST) ? true : t.c(type, yv.c.ORDERED_LIST)) {
            return new aw.a(type, children);
        }
        return t.c(type, yv.c.LIST_ITEM) ? new aw.b(children) : new f(type, children);
    }

    public List<a> b(yv.a type, int startOffset, int endOffset) {
        if (!t.c(type, yv.e.N)) {
            return v.e(new g(type, startOffset, endOffset));
        }
        ArrayList arrayList = new ArrayList();
        while (startOffset < endOffset) {
            this.cancellationToken.a();
            int iA = INSTANCE.a(this.text, startOffset, endOffset, '\n');
            if (iA == -1) {
                break;
            }
            if (iA > startOffset) {
                arrayList.add(new g(yv.e.N, startOffset, iA));
            }
            int i15 = iA + 1;
            arrayList.add(new g(yv.e.f229936q, iA, i15));
            startOffset = i15;
        }
        if (endOffset > startOffset) {
            arrayList.add(new g(yv.e.N, startOffset, endOffset));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    protected final CharSequence getText() {
        return this.text;
    }

    public b(CharSequence charSequence) {
        this(charSequence, iw.a.C2277a.f97207a);
    }
}
