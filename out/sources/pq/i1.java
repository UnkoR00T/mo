package pq;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "size", "step", "Loq/i0;", "a", "(II)V", "T", "", "iterator", "", "partialWindows", "reuseBuffer", "", "b", "(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Leu/j;", "", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {2, 3, 0})
    static final class a<T> extends vq.i implements er.p<eu.j<? super List<? extends T>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f161705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f161708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f161709g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161710h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f161711j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f161712k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f161713l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f161714m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f161715n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f161716p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f161717q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i15, int i16, Iterator<? extends T> it, boolean z15, boolean z16, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f161713l = i15;
            this.f161714m = i16;
            this.f161715n = it;
            this.f161716p = z15;
            this.f161717q = z16;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0085  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:66:0x015a  */
        /* JADX WARN: Code duplicated, block: B:68:0x015e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0160  */
        /* JADX WARN: Code duplicated, block: B:74:0x0180  */
        /* JADX WARN: Code duplicated, block: B:76:0x0186  */
        /* JADX WARN: Code duplicated, block: B:88:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x008e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x008b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x007f A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:17:0x005f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0143 -> B:60:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0177 -> B:73:0x017a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x007f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pq.i1.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(eu.j<? super List<? extends T>> jVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(jVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f161713l, this.f161714m, this.f161715n, this.f161716p, this.f161717q, eVar);
            aVar.f161712k = obj;
            return aVar;
        }
    }

    public static final void a(int i15, int i16) {
        String str;
        if (i15 <= 0 || i16 <= 0) {
            if (i15 != i16) {
                str = "Both size " + i15 + " and step " + i16 + " must be greater than zero.";
            } else {
                str = "size " + i15 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i15, int i16, boolean z15, boolean z16) {
        return !it.hasNext() ? h0.f161703a : eu.k.a(new a(i15, i16, it, z16, z15, null));
    }
}
