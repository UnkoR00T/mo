package b00;

import p071kotlin.Metadata;
import p087nuL.f0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb00/j;", "LNUl/k;", "a", "(Lb00/j;)LNUl/k;", "media_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15770a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.IMAGE_AND_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15770a = iArr;
        }
    }

    public static final p006NUl.k a(j jVar) {
        f0.h hVar;
        int i15 = a.f15770a[jVar.ordinal()];
        if (i15 == 1) {
            hVar = f0.c.f138827a;
        } else if (i15 == 2) {
            hVar = f0.d.f138828a;
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            hVar = f0.g.f138829a;
        }
        return p006NUl.l.b(hVar, 0, false, null, 14, null);
    }
}
