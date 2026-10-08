package p076m2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import e3.h;
import er.p;
import ip.a;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 ;2\u00020\u0001:\u0001;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u00042\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH'¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\bJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H'¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010\bJ#\u0010+\u001a\u00020\u0004\"\u0004\b\u0000\u0010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H'¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H'¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0004H'¢\u0006\u0004\b.\u0010\bJ!\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u0004H'¢\u0006\u0004\b0\u0010\bJ=\u00103\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010(2\u0006\u0010\u0017\u001a\u00028\u00002\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000401H'¢\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\"H\u0017¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020?H\u0017¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020BH\u0017¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\bE\u0010:J\u0017\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH'¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020\u0002H'¢\u0006\u0004\bL\u0010MJ\u001d\u0010O\u001a\u00020\u00042\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040)H'¢\u0006\u0004\bO\u0010,J#\u0010Q\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000PH'¢\u0006\u0004\bQ\u0010RJ#\u0010V\u001a\u00020\u00042\u0012\u0010U\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030T0SH'¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0004H'¢\u0006\u0004\bX\u0010\bJ\u001b\u0010Y\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030TH'¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0004H'¢\u0006\u0004\b[\u0010\bJ\u000f\u0010\\\u001a\u00020\u0004H&¢\u0006\u0004\b\\\u0010\bJ\u000f\u0010(\u001a\u00020]H'¢\u0006\u0004\b(\u0010^R\u001e\u0010c\u001a\u0006\u0012\u0002\b\u00030_8&X§\u0004¢\u0006\f\u0012\u0004\bb\u0010\b\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\u00020\"8&X§\u0004¢\u0006\f\u0012\u0004\bf\u0010\b\u001a\u0004\bd\u0010eR\u001a\u0010j\u001a\u00020\"8&X§\u0004¢\u0006\f\u0012\u0004\bi\u0010\b\u001a\u0004\bh\u0010eR\u001a\u0010m\u001a\u00020\"8&X§\u0004¢\u0006\f\u0012\u0004\bl\u0010\b\u001a\u0004\bk\u0010eR\u001c\u0010q\u001a\u0004\u0018\u00010F8&X§\u0004¢\u0006\f\u0012\u0004\bp\u0010\b\u001a\u0004\bn\u0010oR\u001a\u0010u\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\bt\u0010\b\u001a\u0004\br\u0010sR\u001e\u0010z\u001a\u00060Bj\u0002`v8&X§\u0004¢\u0006\f\u0012\u0004\by\u0010\b\u001a\u0004\bw\u0010xR\u0014\u0010~\u001a\u00020{8&X¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0087\u0001\u001a\u00030\u0083\u00018'X§\u0004¢\u0006\u000f\u0012\u0005\b\u0086\u0001\u0010\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0001\u0002\u0088\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0089\u0001À\u0006\u0001"}, d2 = {"Lm2/r;", "", "", "key", "Loq/i0;", "C", "(I)V", "V", "()V", "X", "R", "dataKey", "J", "(ILjava/lang/Object;)V", "U", "I", "y", "h", "(I)Lm2/r;", "Lm2/d5;", "m", "()Lm2/d5;", "Lm2/o2;", "value", "parameter", "o", "(Lm2/o2;Ljava/lang/Object;)V", "", "Loq/r;", "Lm2/s2;", "references", "k", "(Ljava/util/List;)V", "O", "", "changed", "g", "(Z)V", "n", "K", "T", "Lkotlin/Function0;", "factory", i.f37087n, "(Ler/a;)V", "u", "x", "M", "B", "Lkotlin/Function2;", "block", "j", "(Ljava/lang/Object;Ler/p;)V", "E", "()Ljava/lang/Object;", "v", "(Ljava/lang/Object;)V", "W", "(Ljava/lang/Object;)Z", "a", "(Z)Z", "c", "(I)Z", "", "b", "(F)Z", "", "d", "(J)Z", "G", "Lm2/d4;", "scope", i.f37094u, "(Lm2/d4;)V", "parametersChanged", "flags", "r", "(ZI)Z", "effect", "p", "Lm2/z;", "N", "(Lm2/z;)Ljava/lang/Object;", "", "Lm2/c4;", "values", "e", "([Lm2/c4;)V", i.f37086m, a.f96138c, "(Lm2/c4;)V", "w", "z", "Lm2/v;", "()Lm2/v;", "Lm2/c;", "l", "()Lm2/c;", "getApplier$annotations", "applier", "f", "()Z", "getInserting$annotations", "inserting", "i", "getSkipping$annotations", "skipping", "Q", "getDefaultsInvalid$annotations", "defaultsInvalid", "A", "()Lm2/d4;", "getRecomposeScope$annotations", "recomposeScope", a.f96137b, "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/CompositeKeyHashCode;", "q", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "Lm2/e0;", "t", "()Lm2/e0;", "currentCompositionLocalMap", "Le3/h;", "F", "()Le3/h;", "compositionData", "Ltq/i;", "s", "()Ltq/i;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Lm2/q1;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f123109a;

    /* JADX INFO: renamed from: m2.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lm2/r$a;", "", "<init>", "()V", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Empty", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f123109a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Object Empty = new C3006a();

        /* JADX INFO: renamed from: m2.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m2/r$a$a", "", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3006a {
            C3006a() {
            }

            public String toString() {
                return "Empty";
            }
        }

        private Companion() {
        }

        public final Object a() {
            return Empty;
        }
    }

    d4 A();

    void B();

    void C(int key);

    void D(c4<?> value);

    Object E();

    h F();

    default boolean G(Object value) {
        return W(value);
    }

    <T> void H(er.a<? extends T> factory);

    void I();

    void J(int key, Object dataKey);

    void K();

    void L(d4 scope);

    void M(int key, Object dataKey);

    <T> T N(z<T> key);

    void O();

    void P();

    boolean Q();

    void R();

    default int S() {
        return Long.hashCode(q());
    }

    v T();

    void U();

    void V();

    boolean W(Object value);

    void X(int key);

    default boolean a(boolean value) {
        return a(value);
    }

    default boolean b(float value) {
        return b(value);
    }

    default boolean c(int value) {
        return c(value);
    }

    default boolean d(long value) {
        return d(value);
    }

    void e(c4<?>[] values);

    boolean f();

    void g(boolean changed);

    r h(int key);

    boolean i();

    <V, T> void j(V value, p<? super T, ? super V, i0> block);

    void k(List<oq.r<s2, s2>> references);

    c<?> l();

    d5 m();

    void n();

    void o(o2<?> value, Object parameter);

    void p(er.a<i0> effect);

    long q();

    boolean r(boolean parametersChanged, int flags);

    tq.i s();

    e0 t();

    void u();

    void v(Object value);

    void w();

    void x();

    void y();

    void z();
}
