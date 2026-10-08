package tq;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Ltq/f;", "Ltq/i$b;", "T", "Ltq/e;", "continuation", "O", "(Ltq/e;)Ltq/e;", "Loq/i0;", "K", "(Ltq/e;)V", "n0", "b", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f extends i.b {

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f191407a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public static <E extends i.b> E a(f fVar, i.c<E> cVar) {
            E e15;
            if (!(cVar instanceof b)) {
                if (f.INSTANCE == cVar) {
                    return fVar;
                }
                return null;
            }
            b bVar = (b) cVar;
            if (!bVar.a(fVar.getKey()) || (e15 = (E) bVar.b(fVar)) == null) {
                return null;
            }
            return e15;
        }

        public static i b(f fVar, i.c<?> cVar) {
            if (!(cVar instanceof b)) {
                return f.INSTANCE == cVar ? j.f191408a : fVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f191408a;
        }
    }

    /* JADX INFO: renamed from: tq.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltq/f$b;", "Ltq/i$c;", "Ltq/f;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements i.c<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f191407a = new Companion();

        private Companion() {
        }
    }

    void K(e<?> continuation);

    <T> e<T> O(e<? super T> continuation);
}
