package d62;

import mx.Label;
import mx.c;
import p071kotlin.Metadata;
import r44.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld62/a;", "", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lr44/b$b;", "status", "Lmx/a;", "b", "(Lr44/b$b;)Lmx/a;", "c", "()Lmx/a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: d62.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0874a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40079a;

        static {
            int[] iArr = new int[b.EnumC4371b.values().length];
            try {
                iArr[b.EnumC4371b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f40079a = iArr;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    public final Label a() {
        return this.labelProvider.c(t32.b.f187436a2);
    }

    public final Label b(b.EnumC4371b status) {
        return this.labelProvider.c(C0874a.f40079a[status.ordinal()] == 1 ? t32.b.O0 : t32.b.N0);
    }

    public final Label c() {
        return this.labelProvider.c(t32.b.f187467k0);
    }
}
