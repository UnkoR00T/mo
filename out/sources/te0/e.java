package te0;

import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, d2 = {"Lm2/b4;", "Lte0/b;", "a", "Lm2/b4;", "f", "()Lm2/b4;", "LocalVerificationThemeDrawable", "Lte0/a;", "b", "e", "LocalVerificationThemeColors", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<VerificationThemeDrawable> f189784a = d0.j(new er.a() { // from class: te0.c
        @Override // er.a
        public final Object a() {
            return e.d();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<VerificationThemeColors> f189785b = d0.j(new er.a() { // from class: te0.d
        @Override // er.a
        public final Object a() {
            return e.c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationThemeColors c() {
        return new VerificationThemeColors(o1.d(BodyPartID.bodyIdMax), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationThemeDrawable d() {
        return new VerificationThemeDrawable(jz.a.f106761e1, jz.a.f106792i1);
    }

    public static final b4<VerificationThemeColors> e() {
        return f189785b;
    }

    public static final b4<VerificationThemeDrawable> f() {
        return f189784a;
    }
}
