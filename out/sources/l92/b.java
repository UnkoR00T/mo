package l92;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc82/a;", "Ll92/a;", "a", "(Lc82/a;)Ll92/a;", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117302a;

        static {
            int[] iArr = new int[c82.a.values().length];
            try {
                iArr[c82.a.OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c82.a.SUBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c82.a.DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c82.a.PHOTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f117302a = iArr;
        }
    }

    public static final l92.a a(c82.a aVar) {
        int i15 = a.f117302a[aVar.ordinal()];
        if (i15 == 1) {
            return l92.a.OFFICE;
        }
        if (i15 == 2) {
            return l92.a.SUBJECT;
        }
        if (i15 == 3) {
            return l92.a.DESCRIPTION;
        }
        if (i15 == 4) {
            return l92.a.PHOTO;
        }
        throw new p();
    }
}
