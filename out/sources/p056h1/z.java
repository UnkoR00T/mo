package p056h1;

import er.l;
import h1.z.a;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lh1/z;", "Lh1/z$a;", "Interval", "", "<init>", "()V", "", "index", "n", "(I)Ljava/lang/Object;", "k", "Lh1/n;", "l", "()Lh1/n;", "intervals", "m", "()I", "itemCount", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z<Interval extends a> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lh1/z$a;", "", "Lkotlin/Function1;", "", "getKey", "()Ler/l;", "key", "getType", "type", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: h1.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C1812a implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1812a f79625a = new C1812a();

            C1812a() {
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ Object b(Object obj) {
                return c(((Number) obj).intValue());
            }

            public final Void c(int i15) {
                return null;
            }
        }

        default l<Integer, Object> getKey() {
            return null;
        }

        default l<Integer, Object> getType() {
            return C1812a.f79625a;
        }
    }

    public final Object k(int index) {
        n.a<Interval> aVar = l().get(index);
        return aVar.c().getType().b(Integer.valueOf(index - aVar.getStartIndex()));
    }

    public abstract n<Interval> l();

    public final int m() {
        return l().getSize();
    }

    public final Object n(int index) {
        Object objB;
        n.a<Interval> aVar = l().get(index);
        int startIndex = index - aVar.getStartIndex();
        l<Integer, Object> key = aVar.c().getKey();
        return (key == null || (objB = key.b(Integer.valueOf(startIndex))) == null) ? n2.a(index) : objB;
    }
}
