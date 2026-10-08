package t5;

import android.os.Build;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lt5/a;", "", "Lt5/i;", "resolver", "<init>", "(Lt5/i;)V", "()V", "Lt5/c;", "ki", "", "b", "(Lt5/c;)Z", "Lt5/h;", "a", "(Lt5/c;)Lt5/h;", "Lt5/i;", "core-backported-fixes"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i resolver;

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class C4877a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187671a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.Fixed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.NotApplicable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.NotFixed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f187671a = iArr;
        }
    }

    public a(i iVar) {
        this.resolver = iVar;
    }

    public final h a(c ki4) {
        if (ki4.e().a().booleanValue()) {
            return ki4.d().contains(Build.FINGERPRINT) ? h.Fixed : this.resolver.a(ki4);
        }
        return h.NotApplicable;
    }

    public final boolean b(c ki4) {
        int i15 = C4877a.f187671a[a(ki4).ordinal()];
        if (i15 == 1) {
            return false;
        }
        if (i15 == 2 || i15 == 3) {
            return true;
        }
        if (i15 == 4) {
            return false;
        }
        throw new p();
    }

    public a() {
        this(new k());
    }
}
