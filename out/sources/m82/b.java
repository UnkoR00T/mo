package m82;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz72/a;", "Lm82/a;", "a", "(Lz72/a;)Lm82/a;", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124581a;

        static {
            int[] iArr = new int[z72.a.values().length];
            try {
                iArr[z72.a.NAME_AND_SURNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z72.a.ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z72.a.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z72.a.PHONE_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f124581a = iArr;
        }
    }

    public static final m82.a a(z72.a aVar) {
        int i15 = a.f124581a[aVar.ordinal()];
        if (i15 == 1) {
            return m82.a.NAME_AND_SURNAME;
        }
        if (i15 == 2) {
            return m82.a.ADDRESS;
        }
        if (i15 == 3) {
            return m82.a.EMAIL;
        }
        if (i15 == 4) {
            return m82.a.PHONE_NUMBER;
        }
        throw new p();
    }
}
