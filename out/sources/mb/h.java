package mb;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b \u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmb/h;", "", "T", "<init>", "()V", "", "message", "Lkotlin/Function1;", "", "condition", "c", "(Ljava/lang/String;Ler/l;)Lmb/h;", "a", "()Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: mb.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u0001*\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmb/h$a;", "", "<init>", "()V", "T", "", "tag", "Lmb/j;", "verificationMode", "Lmb/g;", "logger", "Lmb/h;", "a", "(Ljava/lang/Object;Ljava/lang/String;Lmb/j;Lmb/g;)Lmb/h;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ h b(Companion companion, Object obj, String str, j jVar, g gVar, int i15, Object obj2) {
            if ((i15 & 2) != 0) {
                jVar = c.f125194a.a();
            }
            if ((i15 & 4) != 0) {
                gVar = a.f125187a;
            }
            return companion.a(obj, str, jVar, gVar);
        }

        public final <T> h<T> a(T t15, String str, j jVar, g gVar) {
            return new i(t15, str, jVar, gVar);
        }

        private Companion() {
        }
    }

    public abstract T a();

    protected final String b(Object value, String message) {
        return message + " value: " + value;
    }

    public abstract h<T> c(String message, er.l<? super T, Boolean> condition);
}
