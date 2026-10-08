package tw3;

import jw3.c;
import oq.p;
import p036e4.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljw3/c;", "Le4/l;", "a", "(Ljw3/c;)Le4/l;", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: tw3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5032a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192521a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f192521a = iArr;
        }
    }

    public static final l a(c cVar) {
        int i15 = C5032a.f192521a[cVar.ordinal()];
        if (i15 == 1) {
            return l.INSTANCE.a();
        }
        if (i15 == 2) {
            return l.INSTANCE.e();
        }
        throw new p();
    }
}
