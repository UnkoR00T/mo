package yi2;

import dx.i;
import mx.c;
import o73.e;
import p071kotlin.Metadata;
import rh2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\n0\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lyi2/b;", "Lyi2/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i;", "Ldx/b$c;", "a", "(Ljava/lang/Exception;)Ldx/i;", "Lmx/c;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements yi2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f227208a;

        static {
            int[] iArr = new int[uh2.b.values().length];
            try {
                iArr[uh2.b.SCHOOL_ACTIVATION_DIFFERENT_REFRESHED_PESEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f227208a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // dx.j
    public i<Exception, dx.b.Business> a(Exception e15) {
        if (e15 instanceof uh2.a) {
            return a.f227208a[((uh2.a) e15).getType().ordinal()] == 1 ? new i.Right(new dx.b.Business(e.DIFFERENT_REFRESHED_PESEL, null, this.labelProvider.c(f.f173880c), this.labelProvider.c(f.f173879b), null, this.labelProvider.c(f.f173878a), null, 82, null)) : new i.Left(e15);
        }
        return new i.Left(e15);
    }
}
