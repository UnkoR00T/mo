package za;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lza/a;", "Lza/f;", "a", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: za.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lza/a$a;", "", "<init>", "()V", "Lza/e;", "statement", "", "index", "arg", "Loq/i0;", "a", "(Lza/e;ILjava/lang/Object;)V", "", "bindArgs", "b", "(Lza/e;[Ljava/lang/Object;)V", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final void a(e statement, int index, Object arg) {
            if (arg == null) {
                statement.i0(index);
                return;
            }
            if (arg instanceof byte[]) {
                statement.g0(index, (byte[]) arg);
                return;
            }
            if (arg instanceof Float) {
                statement.Q(index, ((Number) arg).floatValue());
                return;
            }
            if (arg instanceof Double) {
                statement.Q(index, ((Number) arg).doubleValue());
                return;
            }
            if (arg instanceof Long) {
                statement.f0(index, ((Number) arg).longValue());
                return;
            }
            if (arg instanceof Integer) {
                statement.f0(index, ((Number) arg).intValue());
                return;
            }
            if (arg instanceof Short) {
                statement.f0(index, ((Number) arg).shortValue());
                return;
            }
            if (arg instanceof Byte) {
                statement.f0(index, ((Number) arg).byteValue());
                return;
            }
            if (arg instanceof String) {
                statement.s2(index, (String) arg);
                return;
            }
            if (arg instanceof Boolean) {
                statement.f0(index, ((Boolean) arg).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + arg + " at index " + index + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(e statement, Object[] bindArgs) {
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i15 = 0;
            while (i15 < length) {
                Object obj = bindArgs[i15];
                i15++;
                a(statement, i15, obj);
            }
        }

        private Companion() {
        }
    }
}
