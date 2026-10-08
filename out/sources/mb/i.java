package mb;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lmb/i;", "", "T", "Lmb/h;", "value", "", "tag", "Lmb/j;", "verificationMode", "Lmb/g;", "logger", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lmb/j;Lmb/g;)V", "message", "Lkotlin/Function1;", "", "condition", "c", "(Ljava/lang/String;Ler/l;)Lmb/h;", "a", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getValue", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "d", "Lmb/j;", "getVerificationMode", "()Lmb/j;", "e", "Lmb/g;", "getLogger", "()Lmb/g;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class i<T> extends h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j verificationMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g logger;

    public i(T t15, String str, j jVar, g gVar) {
        this.value = t15;
        this.tag = str;
        this.verificationMode = jVar;
        this.logger = gVar;
    }

    @Override // mb.h
    public T a() {
        return this.value;
    }

    @Override // mb.h
    public h<T> c(String message, er.l<? super T, Boolean> condition) {
        return condition.b(this.value).booleanValue() ? this : new f(this.value, this.tag, message, this.logger, this.verificationMode);
    }
}
