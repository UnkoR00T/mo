package pd4;

import ch1.b0;
import k34.u;
import o73.ToExtendStudentCardValidity;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpd4/e;", "Lch1/b0;", "<init>", "()V", "Lch1/b0$a;", "params", "Lgx/b;", "b", "(Lch1/b0$a;)Lgx/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements b0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157057a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.DIIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.STUDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f157057a = iArr;
        }
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gx.b a(b0.Params params) {
        int i15 = a.f157057a[params.getIdentityType().ordinal()];
        if (i15 == 1) {
            return new zw0.a.ToAddDocument(false, zw0.a.ToAddDocument.EnumC6430a.IDENTITY_CARD, true, false, null, 24, null);
        }
        if (i15 == 2) {
            return new zw0.a.ToAddDocument(false, zw0.a.ToAddDocument.EnumC6430a.DIIA, true, false, null, 24, null);
        }
        if (i15 == 3) {
            return new ToExtendStudentCardValidity(params.getClearProcess());
        }
        throw new p();
    }
}
