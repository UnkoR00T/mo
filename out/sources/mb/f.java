package mb;

import oq.p;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lmb/f;", "", "T", "Lmb/h;", "value", "", "tag", "message", "Lmb/g;", "logger", "Lmb/j;", "verificationMode", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lmb/g;Lmb/j;)V", "Lkotlin/Function1;", "", "condition", "c", "(Ljava/lang/String;Ler/l;)Lmb/h;", "a", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getValue", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "d", "getMessage", "e", "Lmb/g;", "getLogger", "()Lmb/g;", "f", "Lmb/j;", "getVerificationMode", "()Lmb/j;", "Lmb/m;", "g", "Lmb/m;", "getException", "()Lmb/m;", "exception", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class f<T> extends h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j verificationMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m exception;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125210a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125210a = iArr;
        }
    }

    public f(T t15, String str, String str2, g gVar, j jVar) {
        this.value = t15;
        this.tag = str;
        this.message = str2;
        this.logger = gVar;
        this.verificationMode = jVar;
        m mVar = new m(b(t15, str2));
        mVar.setStackTrace((StackTraceElement[]) n.j0(mVar.getStackTrace(), 2).toArray(new StackTraceElement[0]));
        this.exception = mVar;
    }

    @Override // mb.h
    public T a() throws m {
        int i15 = a.f125210a[this.verificationMode.ordinal()];
        if (i15 == 1) {
            throw this.exception;
        }
        if (i15 == 2) {
            this.logger.a(this.tag, b(this.value, this.message));
            return null;
        }
        if (i15 == 3) {
            return null;
        }
        throw new p();
    }

    @Override // mb.h
    public h<T> c(String message, er.l<? super T, Boolean> condition) {
        return this;
    }
}
