package ua1;

import ma1.q;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lua1/k;", "", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lma1/q;", "status", "Lmx/a;", "a", "(Lma1/q;)Lmx/a;", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196769a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f196769a = iArr;
        }
    }

    public k(mx.c cVar) {
        this.labelProvider = cVar;
    }

    public final Label a(q status) {
        return this.labelProvider.c(a.f196769a[status.ordinal()] == 1 ? ha1.a.f82540y4 : ha1.a.f82533x4);
    }
}
